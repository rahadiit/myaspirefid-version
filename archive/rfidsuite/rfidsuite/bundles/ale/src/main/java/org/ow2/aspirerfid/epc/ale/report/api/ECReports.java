/*
 * Copyright 2005-2008, Aspire
 * 
 * This library is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU Lesser General Public License as published by 
 * the Free Software Foundation (the "LGPL"); either version 2.1 of the 
 * License, or (at your option) any later version. If you do not alter this 
 * notice, a recipient may use your version of this file under either the 
 * LGPL version 2.1, or (at his option) any later version.
 * 
 * You should have received a copy of the GNU Lesser General Public License 
 * along with this library; if not, write to the Free Software Foundation, 
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY 
 * KIND, either express or implied. See the GNU Lesser General Public 
 * License for the specific language governing rights and limitations.
 */
package org.ow2.aspirerfid.epc.ale.report.api;

import java.util.Set;

import org.ow2.aspirerfid.epc.ale.api.ECSpec;

/**
 * An ECReports object is generated by a single activation of an event cycle
 * within the ALE engine. The contents of the report are defined by the event
 * cycle specification (ECSpec) that defined the event cycle.
 * 
 * @author Fran�ois Fornaciari
 * @version 2007
 */
public interface ECReports {
	/**
	 * Gets the time when the report was generated.
	 * 
	 * @return A time in milliseconds, as returned from
	 *         System.currentTimeMillis()
	 */
	public long getDate();

	/**
	 * Gets the name of the ECSpec which described this report.
	 * 
	 * @return Name of the ECSpec which described this report.
	 */
	public String getSpecName();

	/**
	 * An Identifier for the deployed instance of the ALE implementation.
	 * 
	 * @return String representing the ALE instance ID
	 */
	public String getALEID();

	/**
	 * Gets the condition which terminates the event cycle activation.
	 * 
	 * @return Condition which terminates the event cycle activation.
	 */
	public String getTerminationCondition();

	/**
	 * Gets the total time in milliseconds during which the event cycle was
	 * active.
	 * 
	 * @return Total time in milliseconds during which the event cycle was
	 *         active.
	 */
	public long getTotalMilliseconds();

	/**
	 * ECSpec used to generate the report. This is set if includeSpecInReport
	 * was true in the ECSpec that generated the report, null otherwise.
	 * 
	 * @return ECSpec used to generate this report
	 */
	public ECSpec getECSpec();

	/**
	 * Returns a set of ECReport
	 * 
	 * @return Set of ECReport
	 */
	public Set getReports();

	/**
	 * 
	 * @param reportName
	 *            the name of the report
	 * @return the report corresponding to the reportName
	 */
	public ECReport getReport(String reportName);

	/**
	 * Sets the time when the report was generated.
	 * 
	 * @param date
	 *            the time when the report was generated.
	 */
	public void setDate(long date);

	/**
	 * Sets the name of the ECSpec which described this report.
	 * 
	 * @param specName
	 *            Name of the ECSpec which described this report.
	 */
	public void setSpecName(String specName);

	/**
	 * Sets the Identifier for the deployed instance of the ALE implementation.
	 * 
	 * @param ALEID
	 *            An Identifier for the deployed instance of the ALE
	 *            implementation.
	 */
	public void setALEID(String ALEID);

	/**
	 * Sets the condition which terminates the event cycle activation.
	 * 
	 * @param terminationCondition
	 *            Condition which terminates the event cycle activation.
	 */
	public void setTerminationCondition(String terminationCondition);

	/**
	 * Sets the total time in milliseconds during which the event cycle was
	 * active.
	 * 
	 * @param totalMilliseconds
	 *            Total time in milliseconds during which the event cycle was
	 *            active.
	 */
	public void setTotalMilliseconds(long totalMilliseconds);

	/**
	 * Sets ECSpec used to generate the report. This is set if
	 * includeSpecInReport was true in the ECSpec that generated the report,
	 * null otherwise.
	 * 
	 * @param spec
	 *            ECSpec used to generate this report
	 */
	public void setECSpec(ECSpec spec);

	/**
	 * Adds a report to the set of ECReport.
	 * 
	 * @param report
	 *            Report to add
	 */
	public void addReport(ECReport report);

}