
package org.fosstrak.ale.xsd.ale.epcglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for ECBoundarySpecExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECBoundarySpecExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTriggerList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="startTrigger" type="{urn:epcglobal:ale:xsd:1}ECTrigger" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stopTriggerList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stopTrigger" type="{urn:epcglobal:ale:xsd:1}ECTrigger" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="whenDataAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:epcglobal:ale:xsd:1}ECBoundarySpecExtension2" minOccurs="0"/>
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
@XmlType(name = "ECBoundarySpecExtension", propOrder = {
    "startTriggerList",
    "stopTriggerList",
    "whenDataAvailable",
    "extension"
})
public class ECBoundarySpecExtension {

    protected ECBoundarySpecExtension.StartTriggerList startTriggerList;
    protected ECBoundarySpecExtension.StopTriggerList stopTriggerList;
    protected Boolean whenDataAvailable;
    protected ECBoundarySpecExtension2 extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the startTriggerList property.
     * 
     * @return
     *     possible object is
     *     {@link ECBoundarySpecExtension.StartTriggerList }
     *     
     */
    public ECBoundarySpecExtension.StartTriggerList getStartTriggerList() {
        return startTriggerList;
    }

    /**
     * Sets the value of the startTriggerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECBoundarySpecExtension.StartTriggerList }
     *     
     */
    public void setStartTriggerList(ECBoundarySpecExtension.StartTriggerList value) {
        this.startTriggerList = value;
    }

    /**
     * Gets the value of the stopTriggerList property.
     * 
     * @return
     *     possible object is
     *     {@link ECBoundarySpecExtension.StopTriggerList }
     *     
     */
    public ECBoundarySpecExtension.StopTriggerList getStopTriggerList() {
        return stopTriggerList;
    }

    /**
     * Sets the value of the stopTriggerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECBoundarySpecExtension.StopTriggerList }
     *     
     */
    public void setStopTriggerList(ECBoundarySpecExtension.StopTriggerList value) {
        this.stopTriggerList = value;
    }

    /**
     * Gets the value of the whenDataAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWhenDataAvailable() {
        return whenDataAvailable;
    }

    /**
     * Sets the value of the whenDataAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWhenDataAvailable(Boolean value) {
        this.whenDataAvailable = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ECBoundarySpecExtension2 }
     *     
     */
    public ECBoundarySpecExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECBoundarySpecExtension2 }
     *     
     */
    public void setExtension(ECBoundarySpecExtension2 value) {
        this.extension = value;
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
     *         &lt;element name="startTrigger" type="{urn:epcglobal:ale:xsd:1}ECTrigger" maxOccurs="unbounded" minOccurs="0"/>
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
        "startTrigger"
    })
    public static class StartTriggerList {

        protected List<String> startTrigger;

        /**
         * Gets the value of the startTrigger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the startTrigger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStartTrigger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStartTrigger() {
            if (startTrigger == null) {
                startTrigger = new ArrayList<String>();
            }
            return this.startTrigger;
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
     *         &lt;element name="stopTrigger" type="{urn:epcglobal:ale:xsd:1}ECTrigger" maxOccurs="unbounded" minOccurs="0"/>
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
        "stopTrigger"
    })
    public static class StopTriggerList {

        protected List<String> stopTrigger;

        /**
         * Gets the value of the stopTrigger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stopTrigger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStopTrigger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStopTrigger() {
            if (stopTrigger == null) {
                stopTrigger = new ArrayList<String>();
            }
            return this.stopTrigger;
        }

    }

}
