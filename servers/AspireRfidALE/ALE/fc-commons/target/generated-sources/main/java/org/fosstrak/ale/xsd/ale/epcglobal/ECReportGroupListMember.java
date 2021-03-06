
package org.fosstrak.ale.xsd.ale.epcglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.fosstrak.ale.xsd.epcglobal.EPC;
import org.w3c.dom.Element;


/**
 * <p>Java class for ECReportGroupListMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECReportGroupListMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="epc" type="{urn:epcglobal:xsd:1}EPC" minOccurs="0"/>
 *         &lt;element name="tag" type="{urn:epcglobal:xsd:1}EPC" minOccurs="0"/>
 *         &lt;element name="rawHex" type="{urn:epcglobal:xsd:1}EPC" minOccurs="0"/>
 *         &lt;element name="rawDecimal" type="{urn:epcglobal:xsd:1}EPC" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:epcglobal:ale:xsd:1}ECReportGroupListMemberExtension" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECReportGroupListMember", propOrder = {
    "epc",
    "tag",
    "rawHex",
    "rawDecimal",
    "extension",
    "any"
})
public class ECReportGroupListMember {

    protected EPC epc;
    protected EPC tag;
    protected EPC rawHex;
    protected EPC rawDecimal;
    protected ECReportGroupListMemberExtension extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the epc property.
     * 
     * @return
     *     possible object is
     *     {@link EPC }
     *     
     */
    public EPC getEpc() {
        return epc;
    }

    /**
     * Sets the value of the epc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPC }
     *     
     */
    public void setEpc(EPC value) {
        this.epc = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link EPC }
     *     
     */
    public EPC getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPC }
     *     
     */
    public void setTag(EPC value) {
        this.tag = value;
    }

    /**
     * Gets the value of the rawHex property.
     * 
     * @return
     *     possible object is
     *     {@link EPC }
     *     
     */
    public EPC getRawHex() {
        return rawHex;
    }

    /**
     * Sets the value of the rawHex property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPC }
     *     
     */
    public void setRawHex(EPC value) {
        this.rawHex = value;
    }

    /**
     * Gets the value of the rawDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link EPC }
     *     
     */
    public EPC getRawDecimal() {
        return rawDecimal;
    }

    /**
     * Sets the value of the rawDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPC }
     *     
     */
    public void setRawDecimal(EPC value) {
        this.rawDecimal = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ECReportGroupListMemberExtension }
     *     
     */
    public ECReportGroupListMemberExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECReportGroupListMemberExtension }
     *     
     */
    public void setExtension(ECReportGroupListMemberExtension value) {
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
