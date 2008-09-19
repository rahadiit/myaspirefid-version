/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Accada (www.accada.org).
 *
 * Accada is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Accada is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Accada; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.21 at 05:25:46 PM CEST 
//


package org.ow2.aspirerfid.rp.proxy.configurator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReaderConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReaderConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commandChannelHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commandChannelPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transportProtocol" type="{}TransportProtocol"/>
 *         &lt;element name="transportFormat" type="{}TransportFormat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReaderConfiguration", propOrder = {
    "commandChannelHost",
    "commandChannelPort",
    "transportProtocol",
    "transportFormat"
})
public class ReaderConfiguration {

    protected String commandChannelHost;
    @XmlElement(type = Integer.class)
    protected int commandChannelPort;
    protected TransportProtocol transportProtocol;
    protected TransportFormat transportFormat;

    /**
     * Gets the value of the commandChannelHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandChannelHost() {
        return commandChannelHost;
    }

    /**
     * Sets the value of the commandChannelHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandChannelHost(String value) {
        this.commandChannelHost = value;
    }

    /**
     * Gets the value of the commandChannelPort property.
     * 
     */
    public int getCommandChannelPort() {
        return commandChannelPort;
    }

    /**
     * Sets the value of the commandChannelPort property.
     * 
     */
    public void setCommandChannelPort(int value) {
        this.commandChannelPort = value;
    }

    /**
     * Gets the value of the transportProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link TransportProtocol }
     *     
     */
    public TransportProtocol getTransportProtocol() {
        return transportProtocol;
    }

    /**
     * Sets the value of the transportProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportProtocol }
     *     
     */
    public void setTransportProtocol(TransportProtocol value) {
        this.transportProtocol = value;
    }

    /**
     * Gets the value of the transportFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TransportFormat }
     *     
     */
    public TransportFormat getTransportFormat() {
        return transportFormat;
    }

    /**
     * Sets the value of the transportFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportFormat }
     *     
     */
    public void setTransportFormat(TransportFormat value) {
        this.transportFormat = value;
    }

}
