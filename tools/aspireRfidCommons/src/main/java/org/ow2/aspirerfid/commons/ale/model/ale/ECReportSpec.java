
package org.ow2.aspirerfid.commons.ale.model.ale;

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
import org.w3c.dom.Element;


/**
 * <p>Java class for ECReportSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECReportSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportSet" type="{urn:epcglobal:ale:xsd:1}ECReportSetSpec"/>
 *         &lt;element name="filterSpec" type="{urn:epcglobal:ale:xsd:1}ECFilterSpec" minOccurs="0"/>
 *         &lt;element name="groupSpec" type="{urn:epcglobal:ale:xsd:1}ECGroupSpec" minOccurs="0"/>
 *         &lt;element name="output" type="{urn:epcglobal:ale:xsd:1}ECReportOutputSpec"/>
 *         &lt;element name="extension" type="{urn:epcglobal:ale:xsd:1}ECReportSpecExtension" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="reportName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reportIfEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="reportOnlyOnChange" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECReportSpec", propOrder = {
    "reportSet",
    "filterSpec",
    "groupSpec",
    "output",
    "extension",
    "any"
})
public class ECReportSpec {

    @XmlElement(required = true)
    protected ECReportSetSpec reportSet;
    protected ECFilterSpec filterSpec;
    protected ECGroupSpec groupSpec;
    @XmlElement(required = true)
    protected ECReportOutputSpec output;
    protected ECReportSpecExtension extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(required = true)
    protected String reportName;
    @XmlAttribute
    protected Boolean reportIfEmpty;
    @XmlAttribute
    protected Boolean reportOnlyOnChange;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the reportSet property.
     * 
     * @return
     *     possible object is
     *     {@link ECReportSetSpec }
     *     
     */
    public ECReportSetSpec getReportSet() {
        return reportSet;
    }

    /**
     * Sets the value of the reportSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECReportSetSpec }
     *     
     */
    public void setReportSet(ECReportSetSpec value) {
        this.reportSet = value;
    }

    /**
     * Gets the value of the filterSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ECFilterSpec }
     *     
     */
    public ECFilterSpec getFilterSpec() {
        return filterSpec;
    }

    /**
     * Sets the value of the filterSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECFilterSpec }
     *     
     */
    public void setFilterSpec(ECFilterSpec value) {
        this.filterSpec = value;
    }

    /**
     * Gets the value of the groupSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ECGroupSpec }
     *     
     */
    public ECGroupSpec getGroupSpec() {
        return groupSpec;
    }

    /**
     * Sets the value of the groupSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECGroupSpec }
     *     
     */
    public void setGroupSpec(ECGroupSpec value) {
        this.groupSpec = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link ECReportOutputSpec }
     *     
     */
    public ECReportOutputSpec getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECReportOutputSpec }
     *     
     */
    public void setOutput(ECReportOutputSpec value) {
        this.output = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ECReportSpecExtension }
     *     
     */
    public ECReportSpecExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECReportSpecExtension }
     *     
     */
    public void setExtension(ECReportSpecExtension value) {
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
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the reportIfEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReportIfEmpty() {
        if (reportIfEmpty == null) {
            return false;
        } else {
            return reportIfEmpty;
        }
    }

    /**
     * Sets the value of the reportIfEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportIfEmpty(Boolean value) {
        this.reportIfEmpty = value;
    }

    /**
     * Gets the value of the reportOnlyOnChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReportOnlyOnChange() {
        if (reportOnlyOnChange == null) {
            return false;
        } else {
            return reportOnlyOnChange;
        }
    }

    /**
     * Sets the value of the reportOnlyOnChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportOnlyOnChange(Boolean value) {
        this.reportOnlyOnChange = value;
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

}
