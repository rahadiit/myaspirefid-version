//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.26 at 03:47:52 ?? EET 
//


package org.ow2.aspirerfid.commons.xpdl.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="DeadlineCondition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="ExceptionName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Execution">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ASYNCHR"/>
 *             &lt;enumeration value="SYNCHR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deadlineCondition",
    "exceptionName"
})
@XmlRootElement(name = "Deadline")
public class Deadline {

    @XmlElement(name = "DeadlineCondition", required = true)
    protected Object deadlineCondition;
    @XmlElement(name = "ExceptionName", required = true)
    protected Object exceptionName;
    @XmlAttribute(name = "Execution")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String execution;

    /**
     * Gets the value of the deadlineCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDeadlineCondition() {
        return deadlineCondition;
    }

    /**
     * Sets the value of the deadlineCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDeadlineCondition(Object value) {
        this.deadlineCondition = value;
    }

    /**
     * Gets the value of the exceptionName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExceptionName() {
        return exceptionName;
    }

    /**
     * Sets the value of the exceptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExceptionName(Object value) {
        this.exceptionName = value;
    }

    /**
     * Gets the value of the execution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecution() {
        return execution;
    }

    /**
     * Sets the value of the execution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecution(String value) {
        this.execution = value;
    }

}
