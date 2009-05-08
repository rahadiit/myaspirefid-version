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
// Generated on: 2006.07.05 at 05:03:34 PM CEST 
//


package org.ow2.aspirerfid.reader.rp.impl.core.msg.command;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;

import org.ow2.aspirerfid.reader.rp.impl.core.msg.command.ReadReportType;
import org.ow2.aspirerfid.reader.rp.impl.core.msg.command.SourceInfoType;
import org.ow2.aspirerfid.reader.rp.impl.core.msg.command.TagType;
import org.ow2.aspirerfid.reader.rp.impl.core.msg.command.ReadReportType.SourceReport;
import org.w3c.dom.Element;


/**
 * A read report - It has one section per source.
 *                 Alternatively it can be nstructed as just as a set of tags with no source
 *                 information. It can have endor defined data specific to source or common to the
 *                 whole report. 
 * 
 * <p>Java class for ReadReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="tag" type="{urn:epcglobal:rp:xsd:1}TagType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="sourceReport" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="sourceInfo" type="{urn:epcglobal:rp:xsd:1}SourceInfoType"/>
 *                     &lt;element name="tag" type="{urn:epcglobal:rp:xsd:1}TagType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;any/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadReportType", propOrder = {
    "tag",
    "sourceReport",
    "any"
})
public class ReadReportType {

    protected List<TagType> tag;
    protected List<SourceReport> sourceReport;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TagType }
     * 
     * 
     */
    public List<TagType> getTag() {
        if (tag == null) {
            tag = new ArrayList<TagType>();
        }
        return this.tag;
    }

    /**
     * Gets the value of the sourceReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceReport }
     * 
     * 
     */
    public List<SourceReport> getSourceReport() {
        if (sourceReport == null) {
            sourceReport = new ArrayList<SourceReport>();
        }
        return this.sourceReport;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sourceInfo" type="{urn:epcglobal:rp:xsd:1}SourceInfoType"/>
     *         &lt;element name="tag" type="{urn:epcglobal:rp:xsd:1}TagType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;any/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sourceInfo",
        "tag",
        "any"
    })
    public static class SourceReport {

        protected SourceInfoType sourceInfo;
        protected List<TagType> tag;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the sourceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SourceInfoType }
         *     
         */
        public SourceInfoType getSourceInfo() {
            return sourceInfo;
        }

        /**
         * Sets the value of the sourceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SourceInfoType }
         *     
         */
        public void setSourceInfo(SourceInfoType value) {
            this.sourceInfo = value;
        }

        /**
         * Gets the value of the tag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TagType }
         * 
         * 
         */
        public List<TagType> getTag() {
            if (tag == null) {
                tag = new ArrayList<TagType>();
            }
            return this.tag;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
