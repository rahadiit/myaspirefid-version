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
package org.ow2.aspirerfid.epc.ale.impl;

import java.util.Set;
import java.net.URISyntaxException;

import javax.management.openmbean.TabularData;

import org.ow2.aspirerfid.epc.ale.api.DuplicateNameException;
import org.ow2.aspirerfid.epc.ale.api.ECSpecValidationException;
import org.ow2.aspirerfid.epc.ale.api.ImplementationException;

/**
 * TODO Javadoc
 * @author Guillaume Surrel
 * @version 2007
 */
public interface ECSpecFactoryMBean {
    
    /**
     * Adds a filtering pattern to a report
     * 
     * @param reportName
     *            the name of the report
     * @param epcPattern
     *            a URI object containing an EPC pattern.
     * @param isIncludingFilter
     *            if set to true, adds an including filter, otherwise adds an
     *            excluding filter.
     */
    public void addECFilterSpec(String reportName, String epcPattern,
            boolean isIncludingFilter);
    
    /**
     * Adds a grouping pattern to a report
     * 
     * @param reportName
     *            the name of the report
     * @param epcPattern
     *            a URI object containing an EPC pattern.
     */
    public void addECGroupSpec(String reportName, String epcPattern);
    
    /**
     * Add an object which describe the individual report which will be
     * generated by an event cycle.
     * 
     * @param reportName
     *            the name of the report
     * @param includeEPC
     *            whether to include EPC in Pure Identity format in the report
     * @param includeTag
     *            whether to include EPC in tag format in the report
     * @param includeRawHex
     *            whether to include EPC in raw hexadecimal format in the report
     * @param includeRawDecimal
     *            whether to include EPC in raw decimal format in the report
     * @param includeCount
     *            whether to include the count of EPCs in the report
     * @param reportSetSpec
     *            define the EPCs to include. Can be <i>CURRENT</i>,
     *            <i>ADDITIONS</i> or <i>DELETIONS</i>. <i>CURRENT</i> is
     *            selected by default if the given string isn't recognized.
     * @param reportIfEmpty
     *            If set to true, the report should be generated even if it
     *            contains no EPCs. Otherwise, the no report will be generated
     *            in this case.
     * @param reportOnlyOnChange
     *            If reportOnlyOnChange is true, the ECReport is generated only
     *            if the set of EPCs, is different from the previous event
     *            cycle's set.
     * @param includeGPS
     *            whether to include GPS data in the report
     * @param includeTemperature
     *            whether to include temperature data in the report
     * @param includeReaderName
     *            whether to include the name of the logical reader
     */
    public void addECReportSpec(String reportName, boolean includeEPC,
            boolean includeTag, boolean includeRawHex,
            boolean includeRawDecimal, boolean includeCount,
            String reportSetSpec, boolean reportIfEmpty,
            boolean reportOnlyOnChange, boolean includeGPS,
            boolean includeTemperature, boolean includeReaderName);
    
    /**
     * Adds one name to the list of logical reader names which will be queried
     * as a part of this ECSpec. If the name is already present, this method has
     * no effect.
     * 
     * @param logicalName
     *            the reader's logical name
     */
    public void addLogicalReaderName(String logicalName);
    
    /**
     * Links the created ECSpec to a name. Calls ALE.define(String specName).
     * 
     * @param specName
     *            the name of the created ECSpec.
     * @throws ImplementationException
     * @throws DuplicateNameException
     * @throws SecurityException
     * @throws ECSpecValidationException
     * @throws URISyntaxException
     */
    public void createECSpec(String specName) throws URISyntaxException,
            ECSpecValidationException, SecurityException,
            DuplicateNameException, ImplementationException;
    
    /**
     * @return the interval after which the event cycle will end
     *         unconditionally, or zero if there is no unconditional interval
     *         defined.
     */
    public long getDuration();
    
    /**
     * @return the ECReportSpecs stored in a TabularData element.
     */
    public TabularData getECReportSpecList();
    
    /**
     * Get the event topic name on which the RFID readers publish detected tags
     * 
     * @return The event topic name
     */
    public String getEventTopic();
    
    /**
     * Returns the gateway name for the read tags.
     * 
     * @return The gateway name for the read tags.
     */
    public String getGatewayName();
    
    /**
     * If true, the corresponding ECReports instances will contain a copy of the
     * original ECSpec that generated them.
     * 
     * @return true if the spec is included in reports
     */
    public boolean getIncludeSpecInReports();
    
    /**
     * Returns the list of logical reader names which will be queried as a part
     * of this ECSpec
     * 
     * @return the list of logical reader names
     */
    public Set getLogicalReaderNames();
    
    /**
     * @return the period from the beginning of one event cycle to the next.
     */
    public long getRepeatPeriod();
    
    /**
     * @return the "stable field interval" in milliseconds for this event cycle.
     *         If non-zero, the event cycle will terminate if no new tags are
     *         seen for this interval of time.
     */
    public long getStableSetInterval();
    
    /**
     * Gets the start trigger which will begin an event cycle.
     * 
     * @return The URI for the trigger.
     */
    public String getStartTrigger();
    
    /**
     * Gets the stop trigger which will end an event cycle.
     * 
     * @return The URI for the trigger
     */
    public String getStopTrigger();
    
    /**
     * Calls ALE.immediate method on the current ECSpec
     * 
     * @return The immediate report
     */
    public String immediate();
    
    /**
     * Sets the interval in MilliSeconds that will unconditionally terminate the
     * event cycle.
     * 
     * @param duration
     *            the interval in MilliSeconds that will unconditionally
     *            terminate the event cycle.
     */
    public void setDuration(long duration);
    
    /**
     * Set the event topic name on which the RFID readers publish detected tags
     * 
     * @param eventTopic
     *            The event topic name
     */
    public void setEventTopic(String eventTopic);
    
    /**
     * Sets the gateway name for the read tags.
     * 
     * @param gatewayName
     *            The gateway name for the read tags.
     */
    public void setGatewayName(String gatewayName);
    
    /**
     * If true, the corresponding ECReports instances will contain a copy of the
     * original ECSpec that generated them.
     * 
     * @param includeSpec
     *            true to include the ECSpec in the generated reports
     */
    public void setIncludeSpecInReports(boolean includeSpec);
    
    /**
     * Sets the list of logical reader names which will be queried as a part of
     * this ECSpec
     * @param logicalReaderNames TODO Javadoc
     */
    public void setLogicalReaderNames(Set logicalReaderNames);
    
    /**
     * @param repeatPeriod
     *            the period in milliseconds from the beginning of one event
     *            cycle to the next.
     */
    public void setRepeatPeriod(long repeatPeriod);
    
    /**
     * Sets the "stable field interval" in milliseconds for this event cycle. If
     * non-zero, the event cycle will terminate if no new tags are seen for this
     * interval of time.
     * 
     * @param stableSetInterval
     *            the "stable field interval" in milliseconds.
     */
    public void setStableSetInterval(long stableSetInterval);
    
    /**
     * Sets the start trigger which will begin an event cycle.
     * 
     * @param startTrigger
     *            The URI for the trigger,
     */
    public void setStartTrigger(String startTrigger);
    
    /**
     * Sets the stop trigger which will end an event cycle
     * 
     * @param stopTrigger
     *            The URI for the trigger
     */
    public void setStopTrigger(String stopTrigger);
    
}