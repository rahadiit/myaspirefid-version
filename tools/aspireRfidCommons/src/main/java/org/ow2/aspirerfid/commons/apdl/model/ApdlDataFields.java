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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataFields element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="DataFields">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{urn:ow2:aspirerfid:apdlspec:xsd:1}DataField" maxOccurs="unbounded" minOccurs="3"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apdlDataField"
})
@XmlRootElement(name = "DataFields")
public class ApdlDataFields {

    @XmlElement(name = "DataField", required = true)
    protected List<ApdlDataField> apdlDataField;

    /**
     * Gets the value of the apdlDataField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apdlDataField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApdlDataField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApdlDataField }
     * 
     * 
     */
    public List<ApdlDataField> getApdlDataField() {
        if (apdlDataField == null) {
            apdlDataField = new ArrayList<ApdlDataField>();
        }
        return this.apdlDataField;
    }

}
