//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.17 at 08:14:03 ?? EEST 
//


package org.ow2.aspirerfid.commons.apdl.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.ow2.aspirerfid.commons.epcis.model.EPCISMasterDataDocumentType;
import org.ow2.aspirerfid.commons.xpdl.model.Transitions;


/**
 * <p>Java class for CLCBProc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLCBProc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Description"/>
 *         &lt;element ref="{urn:ow2:aspirerfid:apdlspec:xsd:1}EBProc" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:epcglobal:epcis-masterdata:xsd:1}EPCISMasterDataDocument" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Transitions"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLCBProc", propOrder = {
    "description",
    "ebProc",
    "epcisMasterDataDocument",
    "transitions"
})
public class CLCBProc {

    @XmlElement(name = "Description", namespace = "http://www.wfmc.org/2002/XPDL1.0", required = true)
    protected String description;
    @XmlElement(name = "EBProc", required = true)
    protected List<EBProc> ebProc;
    @XmlElement(name = "EPCISMasterDataDocument", namespace = "urn:epcglobal:epcis-masterdata:xsd:1")
    protected EPCISMasterDataDocumentType epcisMasterDataDocument;
    @XmlElement(name = "Transitions", namespace = "http://www.wfmc.org/2002/XPDL1.0", required = true)
    protected Transitions transitions;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the ebProc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ebProc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBProc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBProc }
     * 
     * 
     */
    public List<EBProc> getEBProc() {
        if (ebProc == null) {
            ebProc = new ArrayList<EBProc>();
        }
        return this.ebProc;
    }

    /**
     * Gets the value of the epcisMasterDataDocument property.
     * 
     * @return
     *     possible object is
     *     {@link EPCISMasterDataDocumentType }
     *     
     */
    public EPCISMasterDataDocumentType getEPCISMasterDataDocument() {
        return epcisMasterDataDocument;
    }

    /**
     * Sets the value of the epcisMasterDataDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPCISMasterDataDocumentType }
     *     
     */
    public void setEPCISMasterDataDocument(EPCISMasterDataDocumentType value) {
        this.epcisMasterDataDocument = value;
    }

    /**
     * Gets the value of the transitions property.
     * 
     * @return
     *     possible object is
     *     {@link Transitions }
     *     
     */
    public Transitions getTransitions() {
        return transitions;
    }

    /**
     * Sets the value of the transitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transitions }
     *     
     */
    public void setTransitions(Transitions value) {
        this.transitions = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
