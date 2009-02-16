/*
 * Copyright (c) 2008-2010, Aspire 
 *
 * This file contains the source code of the Accada library by ETH Zurich (www.accada.org),
 * licensed under the terms of the GNU Lesser General Public License version 2.1 in 2007
 * and modified for the needs of the Aspire project.
 *
 * Aspire is free software; you can redistribute it and/or 
 * modify it under  the terms of the GNU Lesser General Public 
 * License version 2.1 as published by the Free Software Foundation (the 
 * "LGPL"). 
 *
 * You should have received a copy of the GNU Lesser General Public 
 * License along with this library in the file COPYING-LGPL-2.1; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301 USA. 
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY 
 * OF ANY KIND, either express or implied. See the GNU Lesser General Public 
 * License for the specific language governing rights and limitations. 
 */

package org.ow2.aspirerfid.ide.masterdata.tools;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBElement;
import org.eclipse.swt.custom.StyledText;

import org.fosstrak.epcis.model.AggregationEventType;
import org.fosstrak.epcis.model.ArrayOfString;
import org.fosstrak.epcis.model.BusinessTransactionType;
import org.fosstrak.epcis.model.EPC;
import org.fosstrak.epcis.model.EPCISEventType;
import org.fosstrak.epcis.model.GetSubscriptionIDs;
import org.fosstrak.epcis.model.ObjectEventType;
import org.fosstrak.epcis.model.Poll;
import org.fosstrak.epcis.model.VocabularyType;
import org.fosstrak.epcis.model.VocabularyElementListType;
import org.fosstrak.epcis.model.VocabularyListType;
import org.fosstrak.epcis.model.VocabularyElementType;
import org.fosstrak.epcis.model.QuantityEventType;
import org.fosstrak.epcis.model.QueryParam;
import org.fosstrak.epcis.model.QueryParams;
import org.fosstrak.epcis.model.QueryResults;
import org.fosstrak.epcis.model.Subscribe;
import org.fosstrak.epcis.model.TransactionEventType;
import org.fosstrak.epcis.model.Unsubscribe;
import org.fosstrak.epcis.utils.TimeParser;

/**
 * Implements a Class to interface with the EPCIS query client. Also offers some
 * helper methods to convert between different formats and for debug output.
 * 
 * @author David Gubler
 * @author Nikos Kefalakis (nkef) e-mail: nkef@ait.edu.gr
 *
 */
public class QueryClientGuiHelper {

	private static final String PROPERTY_FILE = "/queryclient.properties";
	private static final String PROP_QUERY_URL = "default.url";
	private static final String DEFAULT_QUERY_URL = "http://demo.accada.org/epcis/query";

	private QueryControlClient queryClient;

	/**
	 * Holds the query parameters.
	 */
	private List<QueryParam> internalQueryParams = new ArrayList<QueryParam>();

	/**
	 * Constructor. Takes the service endpoint address and a JTextArea used for
	 * debug output as arguments.
	 * 
	 * @param queryUrl
	 *            The URL of the query web service.
	 * @param area
	 *            The text area where debug output will be written to.
	 */
	public QueryClientGuiHelper(final String queryUrl) {
		queryClient = new QueryControlClient(queryUrl);
	}

	public String updateEndpointAddress(final String address) {
		String endpointAddress;
		if (address == null) {
			Properties props = loadProperties();
			endpointAddress = props.getProperty(PROP_QUERY_URL, DEFAULT_QUERY_URL);
		} else {
			endpointAddress = address;
		}

		// check if the endpointAddress is valid
		try {
			new URL(endpointAddress);
		} catch (Exception e) {
			System.out.println("Invalid endpoint address provided. Using default: " + DEFAULT_QUERY_URL);
			endpointAddress = DEFAULT_QUERY_URL;
		}
		setEndpointAddress(endpointAddress);
		return endpointAddress;
	}

	/**
	 * Sets the service endpoint address.
	 * 
	 * @param queryUrl
	 *            The URL of the query web service.
	 */
	private void setEndpointAddress(final String queryUrl) {
		queryClient.setEndpointAddress(queryUrl);
	}

	/**
	 * @return The service endpoint address
	 */
	public String getEndpointAddress() {
		return queryClient.getEndpointAddress();
	}

	/**
	 * @return The query client properties.
	 */
	private Properties loadProperties() {
		InputStream is = getClass().getResourceAsStream(PROPERTY_FILE);
		Properties props = new Properties();
		try {
			props.load(is);
			is.close();
		} catch (IOException e) {
			System.out.println("Unable to load queryclient properties from "
					+ QueryControlClient.class.getResource(PROPERTY_FILE).toString() + ". Using defaults.");
		}
		return props;
	}

	/**
	 * Converts the values in a calendar object into a nicely formatted string.
	 * 
	 * @param cal
	 *            with the Calendar-Date
	 * @return String
	 */
	private String prettyStringCalendar(final Calendar cal) {
		if (cal == null) {
			return null;
		}
		// set to current timezone
		cal.setTimeZone(TimeZone.getDefault());
		return TimeParser.format(cal);
	}

	/**
	 * Prints the results from a query invocation to the debug window and
	 * returns a two-dimensional array in a format suitable for a JTable object.
	 * 
	 * @param eventList
	 *            The result list containing the matching events.
	 * @return A two-dimensional array containing the matching events in a
	 *         format suitable for displaying in a JTable object.
	 */
	private Object[][] processEvents(final List<Object> eventList) {
		int nofEvents = eventList.size();
		Object[][] table = new Object[nofEvents][12];
		int row = 0;

		System.out.print("\n\n" + nofEvents + " events returned by the server:\n\n");
		for (Object o : eventList) {
			if (o instanceof JAXBElement<?>) {
				o = ((JAXBElement<?>) o).getValue();
			}
			EPCISEventType event = (EPCISEventType) o;
			System.out.print("[ EPCISEvent ]\n");
			String eventTime = prettyStringCalendar(event.getEventTime().toGregorianCalendar());
			System.out.print("eventTime:\t" + eventTime + "\n");
			table[row][1] = eventTime;
			String recordTime = prettyStringCalendar(event.getRecordTime().toGregorianCalendar());
			System.out.print("recordTime:\t" + recordTime + "\n");
			table[row][2] = recordTime;
			System.out.print("timeZoneOffset:\t" + event.getEventTimeZoneOffset() + "\n");

			if (event instanceof ObjectEventType) {
				System.out.print("[ ObjectEvent ]\n");
				ObjectEventType e = (ObjectEventType) event;
				table[row][0] = "Object";
				System.out.print("epcList:\t");
				table[row][5] = "";
				for (EPC epc : e.getEpcList().getEpc()) {
					System.out.print(" '" + epc.getValue() + "'");
					table[row][5] = table[row][5] + "'" + epc.getValue() + "' ";
				}
				System.out.print("\n");
				System.out.print("action:\t\t" + e.getAction().toString() + "\n");
				table[row][6] = e.getAction().toString();
				System.out.print("bizStep:\t" + e.getBizStep() + "\n");
				table[row][7] = e.getBizStep();
				System.out.print("disposition:\t" + e.getDisposition() + "\n");
				table[row][8] = e.getDisposition();
				if (e.getReadPoint() != null) {
					System.out.print("readPoint:\t" + e.getReadPoint().getId() + "\n");
					table[row][9] = e.getReadPoint().getId();
				} else {
					System.out.print("readPoint:\tnull\n");
				}
				if (e.getBizLocation() != null) {
					System.out.print("bizLocation:\t" + e.getBizLocation().getId() + "\n");
					table[row][10] = e.getBizLocation().getId();
				} else {
					System.out.print("bizLocation:\tnull\n");
				}
				if (e.getBizTransactionList() != null) {
					System.out.print("bizTrans:\tType, ID\n");
					table[row][11] = "";
					for (BusinessTransactionType bizTrans : e.getBizTransactionList().getBizTransaction()) {
						System.out.print("\t'" + bizTrans.getType() + "', '" + bizTrans.getValue() + "'\n");
						table[row][11] = table[row][11] + "'" + bizTrans.getType() + ", " + bizTrans.getValue()
								+ "' ; ";
					}
					if (!"".equals(table[row][11])) {
						// remove last "; "
						table[row][11] = ((String) table[row][11]).substring(0, ((String) table[row][11]).length() - 2);
					}
				} else {
					System.out.print("bizTrans:\tnull\n");
				}
				System.out.print("\n");

			} else if (event instanceof TransactionEventType) {
				System.out.print("[ TransactionEvent ]\n");
				TransactionEventType e = (TransactionEventType) event;
				table[row][0] = "Transaction";
				System.out.print("parentID:\t" + e.getParentID() + "\n");
				table[row][3] = e.getParentID();
				System.out.print("epcList:\t");
				table[row][5] = "";
				for (EPC epc : e.getEpcList().getEpc()) {
					System.out.print(" '" + epc.getValue() + "'");
					table[row][5] = table[row][5] + "'" + epc.getValue() + "' ";
				}
				System.out.print("\n");
				System.out.print("action:\t\t" + e.getAction().toString() + "\n");
				table[row][6] = e.getAction().toString();
				System.out.print("bizStep:\t" + e.getBizStep() + "\n");
				table[row][7] = e.getBizStep();
				System.out.print("disposition:\t" + e.getDisposition() + "\n");
				table[row][8] = e.getDisposition();
				if (e.getReadPoint() != null) {
					System.out.print("readPoint:\t" + e.getReadPoint().getId() + "\n");
					table[row][9] = e.getReadPoint().getId();
				} else {
					System.out.print("readPoint:\tnull\n");
				}
				if (e.getBizLocation() != null) {
					System.out.print("bizLocation:\t" + e.getBizLocation().getId() + "\n");
					table[row][10] = e.getBizLocation().getId();
				} else {
					System.out.print("bizLocation:\tnull\n");
				}
				if (e.getBizTransactionList() != null) {
					System.out.print("bizTrans:\tType, ID\n");
					table[row][11] = "";
					for (BusinessTransactionType bizTrans : e.getBizTransactionList().getBizTransaction()) {
						System.out.print("\t'" + bizTrans.getType() + "', '" + bizTrans.getValue() + "'\n");
						table[row][11] = table[row][11] + "'" + bizTrans.getType() + ", " + bizTrans.getValue()
								+ "' ; ";
					}
					if (!"".equals(table[row][11])) {
						// remove last "; "
						table[row][11] = ((String) table[row][11]).substring(0, ((String) table[row][11]).length() - 2);
					}
				} else {
					System.out.print("bizTrans:\tnull\n");
				}
				System.out.print("\n");

			} else if (event instanceof AggregationEventType) {
				System.out.print("[ AggregationEvent ]\n");
				AggregationEventType e = (AggregationEventType) event;
				table[row][0] = "Aggregation";
				System.out.print("parentID:\t" + e.getParentID() + "\n");
				table[row][3] = e.getParentID();
				System.out.print("childEPCs:\t");
				table[row][5] = "";
				for (EPC epc : e.getChildEPCs().getEpc()) {
					System.out.print(" '" + epc.getValue() + "'");
					table[row][5] = table[row][5] + "'" + epc.getValue() + "' ";
				}
				System.out.print("\n");
				System.out.print("action:\t\t" + e.getAction().toString() + "\n");
				table[row][6] = e.getAction().toString();
				System.out.print("bizStep:\t" + e.getBizStep() + "\n");
				table[row][7] = e.getBizStep();
				System.out.print("disposition:\t" + e.getDisposition() + "\n");
				table[row][8] = e.getDisposition();
				if (e.getReadPoint() != null) {
					System.out.print("readPoint:\t" + e.getReadPoint().getId() + "\n");
					table[row][9] = e.getReadPoint().getId();
				} else {
					System.out.print("readPoint:\tnull\n");
				}
				if (e.getBizLocation() != null) {
					System.out.print("bizLocation:\t" + e.getBizLocation().getId() + "\n");
					table[row][10] = e.getBizLocation().getId();
				} else {
					System.out.print("bizLocation:\tnull\n");
				}
				if (e.getBizTransactionList() != null) {
					System.out.print("bizTrans:\tType, ID\n");
					table[row][11] = "";
					for (BusinessTransactionType bizTrans : e.getBizTransactionList().getBizTransaction()) {
						System.out.print("\t'" + bizTrans.getType() + "', '" + bizTrans.getValue() + "'\n");
						table[row][11] = table[row][11] + "'" + bizTrans.getType() + ", " + bizTrans.getValue()
								+ "' ; ";
					}
					if (!"".equals(table[row][11])) {
						// remove last "; "
						table[row][11] = ((String) table[row][11]).substring(0, ((String) table[row][11]).length() - 2);
					}
				} else {
					System.out.print("bizTrans:\tnull\n");
				}
				System.out.print("\n");

			} else if (event instanceof QuantityEventType) {
				System.out.print("[ QuantityEvent ]\n");
				QuantityEventType e = (QuantityEventType) event;
				table[row][0] = "Quantity";
				System.out.print("quantity:\t" + e.getQuantity() + "\n");
				table[row][4] = Integer.valueOf(e.getQuantity());
				System.out.print("ecpClass:\t" + e.getEpcClass() + "\n");
				table[row][5] = e.getEpcClass();
				System.out.print("bizStep:\t" + e.getBizStep() + "\n");
				table[row][7] = e.getBizStep();
				System.out.print("disposition:\t" + e.getDisposition() + "\n");
				table[row][8] = e.getDisposition();
				if (e.getReadPoint() != null) {
					System.out.print("readPoint:\t" + e.getReadPoint().getId() + "\n");
					table[row][9] = e.getReadPoint().getId();
				} else {
					System.out.print("readPoint:\tnull\n");
				}
				if (e.getBizLocation() != null) {
					System.out.print("bizLocation:\t" + e.getBizLocation().getId() + "\n");
					table[row][10] = e.getBizLocation().getId();
				} else {
					System.out.print("bizLocation:\tnull\n");
				}
				if (e.getBizTransactionList() != null) {
					System.out.print("bizTrans:\tType, ID\n");
					table[row][11] = "";
					for (BusinessTransactionType bizTrans : e.getBizTransactionList().getBizTransaction()) {
						System.out.print("\t'" + bizTrans.getType() + "', '" + bizTrans.getValue() + "'\n");
						table[row][11] = table[row][11] + "'" + bizTrans.getType() + ", " + bizTrans.getValue()
								+ "' ; ";
					}
					if (!"".equals(table[row][11])) {
						// remove last "; "
						table[row][11] = ((String) table[row][11]).substring(0, ((String) table[row][11]).length() - 2);
					}
				} else {
					System.out.print("bizTrans:\tnull\n");
				}
				System.out.print("\n");
			}
			row++;
		}
		return table;
	}

	/**
	 * Returns a two-dimensional array consisting of the Master Data
	 * that was replyed from the Epcis repository
	 * 
	 * @param Alist of VocabularyTypes
	 *            The result list containing the matching vocabularys.
	 * @return A two-dimensional array containing the matching vocabularys in a
	 *         format suitable for displaying in a Table object.
	 */
	private Object[][] processVocabulary(final List<VocabularyType> vocabularyList) {
		int nofVocabularys = vocabularyList.size();
		Object[][] table = new Object[nofVocabularys][80];
		int row = 0;

		System.out.print("\n\n" + nofVocabularys + " Vocabularys returned by the server:\n\n");
		for (Object o : vocabularyList) {
			if (o instanceof JAXBElement<?>) {
				o = ((JAXBElement<?>) o).getValue();
			}
			VocabularyType vocabulary = (VocabularyType) o;
			table[row][0] = vocabulary.getType();
			System.out.println("Process Vocabulary\n\n\n\n");
			System.out.println("Type is "+vocabulary.getType());
						
			//VocabularyElementListType vocabularyElementList = vocabulary.getVocabularyElementList();
			
			List<VocabularyElementType> vocabularyElementList;
			vocabularyElementList = vocabulary.getVocabularyElementList().getVocabularyElement();
			int i = 1;
			for (Object v : vocabularyElementList){
				VocabularyElementType vocabularyElement = (VocabularyElementType) v;
				
				table[row][i] = vocabularyElement.getId();
				System.out.println("In for--> id = "+vocabularyElement.getId());
				i++;
				
				//akis
				System.out.println("Size="+vocabularyElement.getAttribute().size());
				if(vocabularyElement.getAttribute().size()>0){
					int s = vocabularyElement.getAttribute().size();
					for(int aa1=0; aa1<s; aa1++){
					   System.out.println("========>Attr: "+vocabularyElement.getAttribute().get(aa1).getId());
					   for(int aa2=0;aa2<vocabularyElement.getAttribute().get(aa1).getContent().size();aa2++)
					   System.out.println("=========Value: "+vocabularyElement.getAttribute().get(aa1).getContent().get(aa2).toString());
					}
				}
				
				
			}
			
//			for (int i = 0; i < vocabulary.getVocabularyElementList(); i++) {
//				table[row][i] = vocabulary.getType().toString();
//			}

			row++;
		}
		return table;
	}

	/**
	 * Reset the query arguments.
	 */
	public void clearParameters() {
		internalQueryParams.clear();
	}

	/**
	 * Add a new query parameter.
	 * 
	 * @param param
	 *            The query parameter to add.
	 */
	public void addParameter(final QueryParam param) {
		internalQueryParams.add(param);
	}

	/**
	 * Run the query with the currently set query arguments Returns the results
	 * in a format that is suitable for JTable.
	 * 
	 * @return The pretty-printed query results.
	 * @throws Exception
	 *             If any Exception occurred while invoking the query service.
	 */
	public Object[][] runQuery() throws Exception {
		QueryParams queryParams = new QueryParams();
		queryParams.getParam().addAll(internalQueryParams);
		System.out.print("Number of query parameters: " + queryParams.getParam().size() + "\n");
		for (QueryParam queryParam : internalQueryParams) {
			System.out.print(queryParam.getName() + ": " + queryParam.getValue() + "\n");
		}

		Poll poll = new Poll();
		poll.setQueryName("SimpleEventQuery");
		poll.setParams(queryParams);

		System.out.print("running query...\n");
		QueryResults results = queryClient.poll(poll);
		System.out.print("done\n");

		// print to debug window and return result
		if (results != null && results.getResultsBody() != null && results.getResultsBody().getEventList() != null) {
			return processEvents(results.getResultsBody().getEventList()
					.getObjectEventOrAggregationEventOrQuantityEvent());
		} else {
			return null;
		}
	}

	/**
	 * Run the query with the currently set query arguments Returns the results
	 * in a format that is suitable for A Table.
	 * 
	 * @return The pretty-printed query results.
	 * @throws Exception
	 *             If any Exception occurred while invoking the query service.
	 */
	public Object[][] runMasterDataQuery() throws Exception {
		QueryParams queryParams = new QueryParams();
		queryParams.getParam().addAll(internalQueryParams);
		System.out.print("Number of MasterData query parameters: " + queryParams.getParam().size() + "\n");
		for (QueryParam queryParam : internalQueryParams) {
			System.out.print(queryParam.getName() + ": " + queryParam.getValue() + "\n");
		}

		Poll poll = new Poll();
		poll.setQueryName("SimpleMasterDataQuery");
		poll.setParams(queryParams);

		System.out.print("running query...\n");
		QueryResults results = queryClient.poll(poll);
		System.out.print("done\n");

		// print to debug window and return result
		if (results != null && results.getResultsBody() != null) {
			return processVocabulary(results.getResultsBody().getVocabularyList().getVocabulary());
		} else {
			return null;
		}
	}

	public QueryResults runGenericQuery() throws Exception
	{
		QueryParams queryParams = new QueryParams();
		queryParams.getParam().addAll(internalQueryParams);
		System.out.print("Number of MasterData query parameters: " + queryParams.getParam().size() + "\n");
		for (QueryParam queryParam : internalQueryParams) {
			System.out.print(queryParam.getName() + ": " + queryParam.getValue() + "\n");
		}

		Poll poll = new Poll();
		poll.setQueryName("SimpleMasterDataQuery");
		poll.setParams(queryParams);

		System.out.print("running query...\n");
		return queryClient.poll(poll);
		
	}
	/**
	 * Run the Master Data Insertion with the currently set query arguments
	 * 
	 * @throws Exception
	 *             If any Exception ocurred while invoking the query service.
	 */
	public void runMasterDataInsertionQuery() throws Exception {
		QueryParams queryParams = new QueryParams();
		queryParams.getParam().addAll(internalQueryParams);
		System.out.print("Number of query parameters: " + queryParams.getParam().size() + "\n");
		for (QueryParam queryParam : internalQueryParams) {
			System.out.print(queryParam.getName() + ": " + queryParam.getValue() + "\n");
		}

		Poll pollparams = new Poll();
		pollparams.setQueryName("SimpleMasterDataInsertion");
		pollparams.setParams(queryParams);

		System.out.print("running MasterData Insertion...\n");
		QueryResults results = queryClient.poll(pollparams);

		// if (results.getQueryName().equals("MasterDataInsertionOK")) {
		if (results == null) {
			System.out.print("MasterData Insertion Completed\n");
		}

		// prettyPrintEvents(results.getResultsBody().getEventList());

	}

	public void getEventbySpec()throws Exception
	{
		QueryParams queryParams = new QueryParams();
		queryParams.getParam().addAll(internalQueryParams);
		System.out.print("Number of query parameters: " + queryParams.getParam().size() + "\n");
		for (QueryParam queryParam : internalQueryParams)
		{
			System.out.print(queryParam.getName() + ": " + queryParam.getValue() + "\n");
		}

		Poll pollparams = new Poll();
		pollparams.setQueryName("GetEvent_by_ECSpec");
		pollparams.setParams(new QueryParams());
		QueryResults results = queryClient.poll(pollparams);
		List<VocabularyType> VocType = results.getResultsBody().getVocabularyList().getVocabulary();
		for(Object o: VocType)
		{
			VocabularyType vocabulary = (VocabularyType) o;
			List<VocabularyElementType> vocabularyElementList;
			vocabularyElementList = vocabulary.getVocabularyElementList().getVocabularyElement();
			for (Object v : vocabularyElementList)
			{
				VocabularyElementType vocabularyElement = (VocabularyElementType) v;
				if(vocabularyElement.getAttribute().size()>0)
				{
					int s = vocabularyElement.getAttribute().size();
					for(int aa1=0; aa1<s; aa1++)
					{
					   System.out.println("========>Attr: "+vocabularyElement.getAttribute().get(aa1).getId());
					   for(int aa2=0;aa2<vocabularyElement.getAttribute().get(aa1).getContent().size();aa2++)
					   System.out.println("=========Value: "+vocabularyElement.getAttribute().get(aa1).getContent().get(aa2).toString());
					}
				}
			}
		}
	}
	/**
	 * Registers the Query by the server.
	 * 
	 * @param subscribe
	 *            The Subscribe object containing the query.
	 * @throws Exception
	 *             If any Exception occurred while invoking the query service.
	 */
	public void subscribeQuery(final Subscribe subscribe) throws Exception {
		QueryParams queryParams = new QueryParams();
		queryParams.getParam().addAll(internalQueryParams);
		System.out.print("Number of query parameters: " + queryParams.getParam().size() + "\n");
		for (QueryParam queryParam : internalQueryParams) {
			System.out.print(queryParam.getName() + " " + queryParam.getValue() + "\n");
		}
		subscribe.setParams(queryParams);
		queryClient.subscribe(subscribe.getQueryName(), subscribe.getParams(), subscribe.getDest(), subscribe
				.getControls(), subscribe.getSubscriptionID());
	}

	/**
	 * Removes a registersQuery by the server.
	 * 
	 * @param subscriptionID
	 *            The ID of the query to be unsubscribed.
	 */
	public void unsubscribeQuery(final String subscriptionID) {
		try {
			JFrame frame = new JFrame();
			if (subscriptionID.equals("")) {
				JOptionPane.showMessageDialog(frame, "Please specify a SubscriptionID", "Service is responding",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			Unsubscribe parms = new Unsubscribe();
			parms.setSubscriptionID(subscriptionID);
			queryClient.unsubscribe(parms.getSubscriptionID());
			JOptionPane.showMessageDialog(frame, "Successfully unsubscribed.", "Service is responding",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JFrame frame = new JFrame();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();
			JOptionPane.showMessageDialog(frame, "Sorry, the Service returned an Error:\n" + stacktrace,
					"Service is not responding", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

	}

	/**
	 * Query the service for the supported standard version.
	 * 
	 * @return String
	 * @throws Exception
	 *             If any Exception occurred while invoking the query service.
	 */
	public String queryStandardVersion() throws Exception {
		return queryClient.getStandardVersion();
	}

	/**
	 * Query the service for the supported standard version.
	 */
	public void querySubscriptionId() {
		String title = "Service is responding";
		StringBuilder msg = new StringBuilder();
		try {
			GetSubscriptionIDs parms = new GetSubscriptionIDs();
			parms.setQueryName("simpleQuery");
			List<String> subscriptionIDs = queryClient.getSubscriptionIds(parms.getQueryName());
			if (subscriptionIDs != null && !subscriptionIDs.isEmpty()) {
				msg.append("The Service found the following SubscriptionID(s):\n");
				for (String s : subscriptionIDs) {
					msg.append("- ").append(s).append("\n");
				}
			} else {
				msg.append("There are no Subscribed Queries.");
			}
		} catch (Exception e) {
			title = "Service is not responding";
			msg.append("Sorry, the Service doesn't work");
			e.printStackTrace();
		}
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, msg.toString(), title, JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Query the service for its version.
	 * 
	 * @return String
	 * @throws Exception
	 *             If any Exception occurred while invoking the query service.
	 */
	public String queryVendorVersion() throws Exception {
		return queryClient.getVendorVersion();
	}

	/**
	 * Query the service for its queries.
	 * 
	 * @return String
	 * @throws Exception
	 *             If any Exception occurred while invoking the query service.
	 */
	public List<String> queryNames() throws Exception {
		return queryClient.getQueryNames();
	}

	/**
	 * Converts a space-separated list of strings to an ArrayOfString.
	 * 
	 * @param txt
	 *            A space-separated list of strings.
	 * @return An ArrayOfString object containing single string tokens.
	 */
	public ArrayOfString stringListToArray(final String txt) {
		List<String> tokens = Arrays.asList(txt.split(" "));
		ArrayOfString strings = new ArrayOfString();
		strings.getString().addAll(tokens);
		return strings;
	}
}
