
package org.fosstrak.ale.xsd.ale.epcglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.fosstrak.ale.xsd.epcglobal.Document;
import org.w3c.dom.Element;


/**
 * <p>Java class for ECSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:epcglobal:xsd:1}Document">
 *       &lt;sequence>
 *         &lt;element name="logicalReaders">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="logicalReader" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="boundarySpec" type="{urn:epcglobal:ale:xsd:1}ECBoundarySpec"/>
 *         &lt;element name="reportSpecs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reportSpec" type="{urn:epcglobal:ale:xsd:1}ECReportSpec" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extension" type="{urn:epcglobal:ale:xsd:1}ECSpecExtension" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="includeSpecInReports" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECSpec", propOrder = {
    "logicalReaders",
    "boundarySpec",
    "reportSpecs",
    "extension",
    "any"
})
public class ECSpec
    extends Document
{

    @XmlElement(required = true)
    protected ECSpec.LogicalReaders logicalReaders;
    @XmlElement(required = true)
    protected ECBoundarySpec boundarySpec;
    @XmlElement(required = true)
    protected ECSpec.ReportSpecs reportSpecs;
    protected ECSpecExtension extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "includeSpecInReports")
    protected Boolean includeSpecInReports;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the logicalReaders property.
     * 
     * @return
     *     possible object is
     *     {@link ECSpec.LogicalReaders }
     *     
     */
    public ECSpec.LogicalReaders getLogicalReaders() {
        return logicalReaders;
    }

    /**
     * Sets the value of the logicalReaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECSpec.LogicalReaders }
     *     
     */
    public void setLogicalReaders(ECSpec.LogicalReaders value) {
        this.logicalReaders = value;
    }

    /**
     * Gets the value of the boundarySpec property.
     * 
     * @return
     *     possible object is
     *     {@link ECBoundarySpec }
     *     
     */
    public ECBoundarySpec getBoundarySpec() {
        return boundarySpec;
    }

    /**
     * Sets the value of the boundarySpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECBoundarySpec }
     *     
     */
    public void setBoundarySpec(ECBoundarySpec value) {
        this.boundarySpec = value;
    }

    /**
     * Gets the value of the reportSpecs property.
     * 
     * @return
     *     possible object is
     *     {@link ECSpec.ReportSpecs }
     *     
     */
    public ECSpec.ReportSpecs getReportSpecs() {
        return reportSpecs;
    }

    /**
     * Sets the value of the reportSpecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECSpec.ReportSpecs }
     *     
     */
    public void setReportSpecs(ECSpec.ReportSpecs value) {
        this.reportSpecs = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ECSpecExtension }
     *     
     */
    public ECSpecExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECSpecExtension }
     *     
     */
    public void setExtension(ECSpecExtension value) {
        this.extension = value;
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
     * {@link Element }
     * {@link Object }
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
     * Gets the value of the includeSpecInReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeSpecInReports() {
        if (includeSpecInReports == null) {
            return false;
        } else {
            return includeSpecInReports;
        }
    }

    /**
     * Sets the value of the includeSpecInReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSpecInReports(Boolean value) {
        this.includeSpecInReports = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
     *         &lt;element name="logicalReader" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "logicalReader"
    })
    public static class LogicalReaders {

        @XmlElement(required = true)
        protected List<String> logicalReader;

        /**
         * Gets the value of the logicalReader property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the logicalReader property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLogicalReader().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLogicalReader() {
            if (logicalReader == null) {
                logicalReader = new ArrayList<String>();
            }
            return this.logicalReader;
        }

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
     *         &lt;element name="reportSpec" type="{urn:epcglobal:ale:xsd:1}ECReportSpec" maxOccurs="unbounded"/>
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
        "reportSpec"
    })
    public static class ReportSpecs {

        @XmlElement(required = true)
        protected List<ECReportSpec> reportSpec;

        /**
         * Gets the value of the reportSpec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportSpec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportSpec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECReportSpec }
         * 
         * 
         */
        public List<ECReportSpec> getReportSpec() {
            if (reportSpec == null) {
                reportSpec = new ArrayList<ECReportSpec>();
            }
            return this.reportSpec;
        }

    }

}
