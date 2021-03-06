
package org.fosstrak.ale.xsd.ale.epcglobal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECReaderStat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECReaderStat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sightings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sighting" type="{urn:epcglobal:ale:xsd:1}ECSightingStat" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECReaderStat", propOrder = {
    "readerName",
    "sightings"
})
public class ECReaderStat {

    @XmlElement(required = true)
    protected String readerName;
    protected ECReaderStat.Sightings sightings;

    /**
     * Gets the value of the readerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReaderName() {
        return readerName;
    }

    /**
     * Sets the value of the readerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReaderName(String value) {
        this.readerName = value;
    }

    /**
     * Gets the value of the sightings property.
     * 
     * @return
     *     possible object is
     *     {@link ECReaderStat.Sightings }
     *     
     */
    public ECReaderStat.Sightings getSightings() {
        return sightings;
    }

    /**
     * Sets the value of the sightings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECReaderStat.Sightings }
     *     
     */
    public void setSightings(ECReaderStat.Sightings value) {
        this.sightings = value;
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
     *         &lt;element name="sighting" type="{urn:epcglobal:ale:xsd:1}ECSightingStat" maxOccurs="unbounded" minOccurs="0"/>
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
        "sighting"
    })
    public static class Sightings {

        protected List<ECSightingStat> sighting;

        /**
         * Gets the value of the sighting property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sighting property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSighting().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECSightingStat }
         * 
         * 
         */
        public List<ECSightingStat> getSighting() {
            if (sighting == null) {
                sighting = new ArrayList<ECSightingStat>();
            }
            return this.sighting;
        }

    }

}
