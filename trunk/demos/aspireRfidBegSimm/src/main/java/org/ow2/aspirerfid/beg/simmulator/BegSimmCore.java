/*
 * Copyright (C) 2008-2010, Aspire
 * 
 * Aspire is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License version 2.1 as published by
 * the Free Software Foundation (the "LGPL").
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library in the file COPYING-LGPL-2.1; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 * 
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied. See the GNU Lesser General Public License
 * for the specific language governing rights and limitations.
 */


package org.ow2.aspirerfid.beg.simmulator;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.accada.ale.xsd.epcglobal.EPC;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fosstrak.epcis.model.ArrayOfString;
import org.fosstrak.epcis.model.BusinessTransactionType;
import org.fosstrak.epcis.model.EPCISBodyType;
import org.fosstrak.epcis.model.EPCISDocumentType;
import org.fosstrak.epcis.model.EPCListType;
import org.fosstrak.epcis.model.EventListType;
import org.fosstrak.epcis.model.ObjectEventType;
import org.fosstrak.epcis.model.QueryParam;
import org.fosstrak.epcis.model.VocabularyElementType;
import org.fosstrak.epcis.model.VocabularyType;
import org.fosstrak.epcis.model.AttributeType;
import org.fosstrak.epcis.captureclient.CaptureClient;
import org.fosstrak.epcis.model.BusinessTransactionListType;

import org.ow2.aspirerfid.beg.simmulator.BusinessCtx;
import org.ow2.aspirerfid.beg.simmulator.EventStatus;
import org.ow2.aspirerfid.beg.simmulator.MasterDataQueryClient;
import org.apache.commons.configuration.XMLConfiguration;

/**
 * @author Nikos Kefalakis (nkef) e-mail: nkef@ait.edu.gr
 * 
 */
public class BegSimmCore {

	/**
	 * The logger.
	 */
	private static Log log = LogFactory.getLog(BegSimmCore.class);

	/**
	 * The configuration
	 */
	private XMLConfiguration config = null;

	// private MasterDataQueryClient queryClient = null;

	// Stores the list for the capture reports in relation with the vocabulary
	// object ID
	// private HashMap<String, CaptureReport> eventGenerators = new
	// HashMap<String, CaptureReport>();



	/**
	 * @param repositoryQueryURL
	 * @return List of VocabularyElementType
	 */
	public List<VocabularyElementType> getEventList(String repositoryQueryURL) {
		// SetUp the EPCIS Repository Query URL
		MasterDataQueryClient queryClient = new MasterDataQueryClient(repositoryQueryURL);

		List<VocabularyElementType> vocabularyElementList = null;

		// Contains the data for the result table.
		List<VocabularyType> vocabularyList = null;

		try {
			queryClient.clearParameters();

			QueryParam queryParam = new QueryParam();
			queryParam.setName("eventType");
			queryParam.setValue("SimpleMasterDataQuery");
			queryClient.addParameter(queryParam);

			QueryParam param2 = new QueryParam();
			param2.setName("includeAttributes");
			param2.setValue(true);
			queryClient.addParameter(param2);
			QueryParam param3 = new QueryParam();
			param3.setName("includeChildren");
			param3.setValue(false);
			queryClient.addParameter(param3);

			ArrayOfString vocabularyType = new ArrayOfString();

			vocabularyType.getString().add("urn:epcglobal:epcis:vtype:BusinessTransaction");
			QueryParam param5 = new QueryParam();
			param5.setName("vocabularyName");
			param5.setValue(vocabularyType);
			queryClient.addParameter(param5);

			vocabularyList = queryClient.runMasterDataQuery();

		}
		catch (ParseException e) {
			String msg = "Unable to parse a Time value.";
			System.out.print("\n" + msg + "\n");
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			System.out.print(sw.toString());
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, msg + "\n" + e.getMessage(), "Service invocation error", JOptionPane.ERROR_MESSAGE);
		}
		catch (Exception e) {
			String msg = "Unexpected error while invoking EPCIS Query Interface.";
			System.out.print("\n" + msg + "\n");
			System.out.print(e.toString());
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			System.out.print(sw.toString());
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, msg + "\n" + e.toString(), "Service invocation error", JOptionPane.ERROR_MESSAGE);
		}

		for (Object o : vocabularyList) {
			if (o instanceof JAXBElement<?>) {
				o = ((JAXBElement<?>) o).getValue();
			}
			VocabularyType vocabulary = (VocabularyType) o;

			vocabularyElementList = vocabulary.getVocabularyElementList().getVocabularyElement();

		}

		return cleanVocabularyElementsParents(vocabularyElementList);

	}

	/**
	 * This method generates the event data for a specific transaction Event
	 * 
	 * @param vocabularyElementType
	 * @param repositoryCaptureURL
	 * @param begListeningPort
	 * @return boolean
	 * @throws JAXBException
	 * @throws IOException
	 */
	public boolean generateDataForTransEvent(VocabularyElementType vocabularyElementType, String repositoryCaptureURL) throws IOException,
			JAXBException {
		int nOfEvents = 0;
		int nOfTransactionItems = 0;

		ArrayList<ECReportEventData> ecReportsEventData = new ArrayList<ECReportEventData>();
		CaptureClient captureClient = new CaptureClient(repositoryCaptureURL);

		BusinessCtx businessCtx = null;
		businessCtx = getBusinessCtx(vocabularyElementType);
		
		// read parameters from configuration file
		config = new XMLConfiguration();
		config.setListDelimiter(',');
		URL fileurl = this.getClass().getResource("/ECReportEventData.xml");

		// sets the parameters according to the properties file
		try {
			config.load(fileurl);
		}
		catch (Exception e) {
			String message = "Couldn't get WarehouseParameters at: " + fileurl.getFile() + "\n" + e.getMessage();
			log.debug(message);
			e.printStackTrace();
		}

		nOfEvents = config.getMaxIndex("reports.report") + 1;

		
		
		for (int i = 0; i < nOfEvents; i++) {

			ECReportEventData ecReportEventData = new ECReportEventData();
			ArrayList<String> reportTransactionItems = new ArrayList<String>();

			ecReportEventData.setBizTransactionID(config.getString("reports.report(" + i + ").bizTransactionID"));
			ecReportEventData.setBizTransactionParentID(config.getString("reports.report(" + i + ").bizTransactionParentID"));
			ecReportEventData.setParentObject(config.getString("reports.report(" + i + ").parentObject"));

			nOfTransactionItems = 0;
			nOfTransactionItems = config.getMaxIndex("reports.report(" + i + ").transactionItems.transactionItem") + 1;
			for (int j = 0; j < nOfTransactionItems; j++) {
				reportTransactionItems.add(config.getString("reports.report(" + i + ").transactionItems.transactionItem(" + j + ")"));
			}
			ecReportEventData.setTransactionItems(reportTransactionItems);

			// ecReportsEventData.add(ecReportEventData);

			// for (ECReportEventData ecReportEventData :
			// ecReportsEventData) {
			// if (ecReportsEventData != null) {
			if (businessCtx.getEventType().equals("ObjectEvent")) {

				handleObjectEventReports(businessCtx, ecReportEventData, captureClient);

			}
			else if (businessCtx.getEventType().equals("AggregationEvent")) {
				handleAggregationEventReports(businessCtx, ecReportEventData, captureClient);
			}
			else if (businessCtx.getEventType().equals("QuantityEvent")) {
				handleQuantityEventReports(businessCtx, ecReportEventData, captureClient);
			}
			else if (businessCtx.getEventType().equals("TransactionEvent")) {
				handleTransactionEventReports(businessCtx, ecReportEventData, captureClient);
			}
			// }
			// }

		}
		return true;
	}

	private void handleTransactionEventReports(BusinessCtx businessCtx, ECReportEventData ecReportEventData, CaptureClient captureClient2) {
		// TODO Auto-generated method stub

	}

	private void handleQuantityEventReports(BusinessCtx businessCtx, ECReportEventData ecReportEventData, CaptureClient captureClient2) {
		// TODO Auto-generated method stub

	}

	private void handleAggregationEventReports(BusinessCtx businessCtx, ECReportEventData ecReportEventData, CaptureClient captureClient2) {
		// TODO Auto-generated method stub

	}

	private void handleObjectEventReports(BusinessCtx businessCtx, ECReportEventData ecReportEventData, CaptureClient captureClient)
			throws IOException, JAXBException {
		List<EPC> epcs = new LinkedList<EPC>();

		ObjectEventType objEvent = null;
		XMLGregorianCalendar now = getCurrentTime();
		EPCISDocumentType epcisDoc = new EPCISDocumentType();
		EPCISBodyType epcisBody = new EPCISBodyType();
		EventListType eventList = new EventListType();
		EPCListType epcList = new EPCListType();

		// create the ecpis event
		objEvent = new ObjectEventType();
		objEvent.setEventTime(now);
		objEvent.setEventTimeZoneOffset(EventTimeZoneOffset(now));

		if (!ecReportEventData.getBizTransactionID().equals("")) {
			BusinessTransactionListType businessTransactionListType = new BusinessTransactionListType();
			BusinessTransactionType businessTransactionType = new BusinessTransactionType();
			if (!businessCtx.getBusinessTransactionTypeID().equals("")) {
				businessTransactionType.setType(businessCtx.getBusinessTransactionTypeID());
			}
			else {
				businessTransactionType.setType("urn:epc:transaction:type:general");
			}
			businessTransactionType.setValue(ecReportEventData.getBizTransactionID());
			businessTransactionListType.getBizTransaction().add(businessTransactionType);
			objEvent.setBizTransactionList(businessTransactionListType);
		}
		else {
			return;
		}

		for (String epc : ecReportEventData.getTransactionItems()) {
			org.fosstrak.epcis.model.EPC nepc = new org.fosstrak.epcis.model.EPC();
			nepc.setValue(epc);
			epcList.getEpc().add(nepc);
		}

		objEvent.setEpcList(epcList);

		// set action
		if (!businessCtx.getAction().equals(null))
			objEvent.setAction(businessCtx.getAction());

		// set bizStep
		if (!businessCtx.getBizStep().equals(null) || !businessCtx.getBizStep().equals(""))
			objEvent.setBizStep(businessCtx.getBizStep());

		// set disposition
		if (!businessCtx.getDisposition().equals(null) || !businessCtx.getDisposition().equals(""))
			objEvent.setDisposition(businessCtx.getDisposition());

		// set readPoint
		if (!businessCtx.getReadPoint().equals(null)) {
			objEvent.setReadPoint(businessCtx.getReadPoint());
		}

		// set bizLocation
		if (!businessCtx.getBizLocation().equals(null)) {
			objEvent.setBizLocation(businessCtx.getBizLocation());
		}

		eventList.getObjectEventOrAggregationEventOrQuantityEvent().add(objEvent);

		epcisBody.setEventList(eventList);
		epcisDoc.setEPCISBody(epcisBody);
		epcisDoc.setSchemaVersion(new BigDecimal("1.0"));
		epcisDoc.setCreationDate(now);

		int httpResponseCode = captureClient.capture(epcisDoc);
		if (httpResponseCode != 200) {
			log.debug("The event could NOT be captured!\n");
		}
		else if (httpResponseCode == 200) {
			epcs.clear();
		}

	}

	private List<VocabularyElementType> cleanVocabularyElementsParents(List<VocabularyElementType> vocabularyElementList) {

		String trueVocabularyElementID = null;
		String[] compositeVocabularyElementID = null;

		for (VocabularyElementType vocabularyElementType : vocabularyElementList) {
			compositeVocabularyElementID = vocabularyElementType.getId().split(",");
			if (compositeVocabularyElementID.length > 1) {
				trueVocabularyElementID = compositeVocabularyElementID[compositeVocabularyElementID.length - 1];
				vocabularyElementType.setId(trueVocabularyElementID);
			}
		}

		return vocabularyElementList;
	}

	private String EventTimeZoneOffset(XMLGregorianCalendar now) {
		// get the current time zone and set the eventTimeZoneOffset
		if (now != null) {
			int timezone = now.getTimezone();
			int h = Math.abs(timezone / 60);
			int m = Math.abs(timezone % 60);
			DecimalFormat format = new DecimalFormat("00");
			String sign = (timezone < 0) ? "-" : "+";
			return sign + format.format(h) + ":" + format.format(m);
		}
		return null;
	}

	private XMLGregorianCalendar getCurrentTime() {
		// get the current time and set the eventTime
		XMLGregorianCalendar currentTime = null;
		try {
			DatatypeFactory dataFactory = DatatypeFactory.newInstance();
			currentTime = dataFactory.newXMLGregorianCalendar(new GregorianCalendar());
			log.debug("Event Time:" + currentTime.getHour() + ":" + currentTime.getMinute() + ":" + ":" + currentTime.getSecond() + "\n");
		}
		catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return currentTime;
	}

	public BusinessCtx getBusinessCtx(VocabularyElementType vocabularyElementType) {

		BusinessCtx businessCtx = new BusinessCtx();

		for (AttributeType vocElementAttribute : vocabularyElementType.getAttribute()) {
			if (vocElementAttribute.getId().endsWith("business_location")) {
				businessCtx.setBizLocation(vocElementAttribute.getContent().get(0).toString());
			}
			else if (vocElementAttribute.getId().endsWith("business_step")) {
				businessCtx.setBizStep(vocElementAttribute.getContent().get(0).toString());
			}
			else if (vocElementAttribute.getId().endsWith("disposition")) {
				businessCtx.setDisposition(vocElementAttribute.getContent().get(0).toString());
			}
			else if (vocElementAttribute.getId().endsWith("ecspec_name")) {
				businessCtx.setECSpecName(vocElementAttribute.getContent().get(0).toString());
			}
			else if (vocElementAttribute.getId().endsWith("read_point")) {
				businessCtx.setReadPoint(vocElementAttribute.getContent().get(0).toString());
			}
			else if (vocElementAttribute.getId().endsWith("action")) {
				businessCtx.setAction(vocElementAttribute.getContent().get(0).toString());
			}
			else if (vocElementAttribute.getId().endsWith("event_type")) {
				businessCtx.setEventType(vocElementAttribute.getContent().get(0).toString());
			}
			else if (vocElementAttribute.getId().endsWith("ecreport_names")) {
				businessCtx.setEcReportNames(vocElementAttribute.getContent().get(0).toString());
			}
			else if (vocElementAttribute.getId().endsWith("transaction_type")) {
				businessCtx.setBusinessTransactionTypeID(vocElementAttribute.getContent().get(0).toString());
			}
		}

		return businessCtx;
	}

}