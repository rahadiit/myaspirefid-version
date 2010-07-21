package org.ow2.aspirerfid.patrolman.ecspec;

import java.util.Enumeration;
import java.util.Vector;

import org.ow2.aspirerfid.nfc.midlet.sendersReceivers.bluetooth.BluetoothController;
import org.ow2.aspirerfid.patrolman.questionnaire.Questionnaire;
import org.ow2.aspirerfid.patrolman.questionnaire.QuestionnaireData;

public class LightECReportSpec {
	/** Parent ECSpec name */
	private String m_ecSpecName;

	/** ECReport name */
	private String m_reportName;

	/** Report set (should always be CURRENT) */
	private String m_reportSet = "CURRENT";

	/** Report includes tag */
	private boolean m_includeTag;

	/** Report includes count */
	private boolean m_includeCount;

	/** Associated questionnaires */
	private Vector m_questionnaires;

	public LightECReportSpec(String ecSpecName) {
		m_questionnaires = new Vector();
		m_ecSpecName = ecSpecName;
	}

	/**
	 * Adds a questionnaire to the report
	 * 
	 * @param questionnaire
	 *            Questionnaire to be added
	 */
	public void addQuestionnaire(Questionnaire questionnaire) {
		questionnaire.setReportSpec(this);
		m_questionnaires.addElement(questionnaire);
	}

	/**
	 * LightECReportSpec objects are equals if they have the same reportName
	 */
	public boolean equals(Object obj) {
		if (obj instanceof LightECReportSpec) {
			return ((LightECReportSpec) obj).getReportName().equals(getReportName());
		}
		return super.equals(obj);
	}

	/**
	 * Returns the parent ECSpec name or "PatrolmanECSpec" if null
	 * 
	 * @return the parent ECSpec name
	 */
	public String getECSpecName() {
		if (m_ecSpecName == null)
			return "PatrolmanECSpec";

		return m_ecSpecName;
	}

	/**
	 * @return Does the report include count
	 */
	public boolean getIncludeCount() {
		return m_includeCount;
	}

	/**
	 * @return Does the report include tags
	 */
	public boolean getIncludeTag() {
		return m_includeTag;
	}

	/**
	 * Returns the questionnaire corresponding to the given tag UID
	 * 
	 * @param tagUID
	 *            The UID of a read tag
	 * @return The questionnaire associated to the tag UID, or null
	 */
	public Questionnaire getQuestionnaire(String tagUID) {
		Enumeration en = m_questionnaires.elements();
		while (en.hasMoreElements()) {
			Questionnaire qst = (Questionnaire) en.nextElement();
			if (qst.handlesTag(tagUID))
				return qst;
		}
		return null;
	}

	/**
	 * Returns questionnaires associated to this ECReportSpec
	 * 
	 * @return All questionnaires of this ECReportSpec
	 */
	public Vector getQuestionnaires() {
		return m_questionnaires;
	}
	
	/**
	 * @return the ECReport name
	 */
	public String getReportName() {
		return m_reportName;
	}

	/**
	 * @return the report set
	 */
	public String getReportSet() {
		return m_reportSet;
	}

	/**
	 * Generates the XML representation of a group corresponding to the given questionnaire
	 * and pattern.
	 * @param xmlTemplate XML content buffer
	 * @param pattern Pattern (group name)
	 * @param qst
	 * @return The XML representation
	 */
	/*
	private StringBuffer groupToXML(StringBuffer xmlTemplate, String pattern, Questionnaire qst) {
		// Null pattern -> all in
		if(pattern == null)
			pattern = "*";
		
		boolean nullPattern = pattern.equals("*");
		xmlTemplate.append("<group name=\"").append(pattern).append("\">\n");
		
		xmlTemplate.append("<extension>\n");
		
		// Get all questionnaire data for the given pattern
		Enumeration savedData = qst.getQuestionnaireData().elements();
		while(savedData.hasMoreElements()) {
			QuestionnaireData data = (QuestionnaireData) savedData.nextElement();
			
			if(nullPattern || data.getUsedPattern().equals(pattern)) {
				xmlTemplate.append(qst.toXML(data));
			}
		}
		
		xmlTemplate.append("</extension>\n</group>\n");
		return xmlTemplate;
	}
	*/

	/**
	 * @param includeCount
	 *            Does the report include count
	 */
	public void setIncludeCount(boolean includeCount) {
		m_includeCount = includeCount;
	}

	/**
	 * @param includeTag
	 *            Does the report include tags
	 */
	public void setIncludeTag(boolean includeTag) {
		m_includeTag = includeTag;
	}

	/**
	 * @param reportName the ECReport name to set
	 */
	public void setReportName(String reportName) {
		m_reportName = reportName;
	}

	/**
	 * @param reportSet
	 *            the report set
	 */
	public void setReportSet(String reportSet) {
		m_reportSet = reportSet;
	}

	/**
	 * Generates an ECReport containing all its associated questionnaires
	 * 
	 * @return An ECReport XML report part
	 */
	/*
	public String toXML() {
		return toXML(null);
	}
	*/

	/**
	 * Generates an ECReport XML content. If questionnaire is null, the ECReport
	 * will contain all associated questionnaires status, else it will only
	 * contain the specified questionnaire content
	 * 
	 * (WARNING: heavy memory consumption)
	 * 
	 * @param questionnaire
	 *            Specific questionnaire to report, or null for all
	 *            questionnaires
	 * @return An XML report part
	 */
	/*
	public String toXML(Questionnaire questionnaire) {
		StringBuffer xmlTemplate = new StringBuffer();

		// Beginning of report part
		xmlTemplate.append("<report reportName=\"").append(getReportName())
				.append("\">\n");

		if (questionnaire == null) {
			// Retrieve all questionnaires
			Enumeration questionnaires = m_questionnaires.elements();

			while (questionnaires.hasMoreElements()) {
				Questionnaire qst = (Questionnaire) questionnaires
						.nextElement();

				Vector patternsList = qst.getPatterns();
				if (patternsList == null) {
					// Null pattern : save all data in one group
					groupToXML(xmlTemplate, null, qst);
				} else {
					// Save data in pattern specialized groups
					Enumeration patterns = patternsList.elements();
					while(patterns.hasMoreElements()) {
						groupToXML(xmlTemplate, (String) patterns.nextElement(), qst);
					}
				}
			}

		} else {
			// Retrieve only the specified questionnaire
			xmlTemplate.append("<group name=\"*\">\n");
			xmlTemplate.append("<extension>\n");
			xmlTemplate.append(questionnaire.toXML());
			xmlTemplate.append("</extension>\n");
		}

		// End of the report part
		xmlTemplate.append("</group>\n</report>\n");
		return xmlTemplate.toString();
	}
	*/

	/**
	 * @param btController
	 */
	
	/**
	 * Sends an ECReport XML content. If questionnaire is null, the ECReport
	 * will contain all associated questionnaires status, else it will only
	 * contain the specified questionnaire content
	 * Sends data as soon as possible to avoid memory consumption
	 * 
	 * @param btController A connected BlueTooth controller
	 */
	public void sendXML(BluetoothController btController) {

		// Beginning of report part
		btController.sendMessage("<report reportName=\"" + getReportName() + "\">\n");

		// Retrieve all questionnaires
		Enumeration questionnaires = m_questionnaires.elements();

		while (questionnaires.hasMoreElements()) {
			Questionnaire qst = (Questionnaire) questionnaires
					.nextElement();

			Vector patternsList = qst.getPatterns();
			if (patternsList == null) {
				// Null pattern : save all data in one group
				sendGroup(btController, null, qst);
			} else {
				// Save data in pattern specialized groups
				Enumeration patterns = patternsList.elements();
				while(patterns.hasMoreElements()) {
					sendGroup(btController, (String) patterns.nextElement(), qst);
				}
			}
		}

		// End of the report part
		btController.sendMessage("</group>\n</report>\n");
	}

	/**
	 * Sends the XML representation of a group corresponding to the given questionnaire
	 * and pattern. 
	 * 
	 * @param btController A connected Bluetooth controller
	 * @param pattern Pattern (group name)
	 * @param qst Questionnaire to be sent
	 */
	private void sendGroup(BluetoothController btController,
			String pattern, Questionnaire qst) {
		// Null pattern -> all in
		if(pattern == null)
			pattern = "*";
		
		boolean nullPattern = pattern.equals("*");
		btController.sendMessage("<group name=\"" + pattern + "\">\n" );
		
		// TODO Include count
		
		btController.sendMessage("<extension>\n");
		
		// Get all questionnaire data for the given pattern
		Enumeration savedData = qst.getQuestionnaireData().elements();
		while(savedData.hasMoreElements()) {
			QuestionnaireData data = (QuestionnaireData) savedData.nextElement();
			
			if(nullPattern || data.getUsedPattern().equals(pattern)) {
				qst.sendXML(btController, data);
			}
		}
		
		btController.sendMessage("</extension>\n</group>\n");
	}
}