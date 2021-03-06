
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
import org.w3c.dom.Element;


/**
 * <p>Java class for ECBoundarySpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECBoundarySpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTrigger" type="{urn:epcglobal:ale:xsd:1}ECTrigger" minOccurs="0"/>
 *         &lt;element name="repeatPeriod" type="{urn:epcglobal:ale:xsd:1}ECTime" minOccurs="0"/>
 *         &lt;element name="stopTrigger" type="{urn:epcglobal:ale:xsd:1}ECTrigger" minOccurs="0"/>
 *         &lt;element name="duration" type="{urn:epcglobal:ale:xsd:1}ECTime" minOccurs="0"/>
 *         &lt;element name="stableSetInterval" type="{urn:epcglobal:ale:xsd:1}ECTime" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:epcglobal:ale:xsd:1}ECBoundarySpecExtension" minOccurs="0"/>
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
@XmlType(name = "ECBoundarySpec", propOrder = {
    "startTrigger",
    "repeatPeriod",
    "stopTrigger",
    "duration",
    "stableSetInterval",
    "extension",
    "any"
})
public class ECBoundarySpec {

    protected String startTrigger;
    protected ECTime repeatPeriod;
    protected String stopTrigger;
    protected ECTime duration;
    protected ECTime stableSetInterval;
    protected ECBoundarySpecExtension extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the startTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTrigger() {
        return startTrigger;
    }

    /**
     * Sets the value of the startTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTrigger(String value) {
        this.startTrigger = value;
    }

    /**
     * Gets the value of the repeatPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ECTime }
     *     
     */
    public ECTime getRepeatPeriod() {
        return repeatPeriod;
    }

    /**
     * Sets the value of the repeatPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECTime }
     *     
     */
    public void setRepeatPeriod(ECTime value) {
        this.repeatPeriod = value;
    }

    /**
     * Gets the value of the stopTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopTrigger() {
        return stopTrigger;
    }

    /**
     * Sets the value of the stopTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopTrigger(String value) {
        this.stopTrigger = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link ECTime }
     *     
     */
    public ECTime getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECTime }
     *     
     */
    public void setDuration(ECTime value) {
        this.duration = value;
    }

    /**
     * Gets the value of the stableSetInterval property.
     * 
     * @return
     *     possible object is
     *     {@link ECTime }
     *     
     */
    public ECTime getStableSetInterval() {
        return stableSetInterval;
    }

    /**
     * Sets the value of the stableSetInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECTime }
     *     
     */
    public void setStableSetInterval(ECTime value) {
        this.stableSetInterval = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ECBoundarySpecExtension }
     *     
     */
    public ECBoundarySpecExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECBoundarySpecExtension }
     *     
     */
    public void setExtension(ECBoundarySpecExtension value) {
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
