
package org.fosstrak.ale.wsdl.aleac.epcglobal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ALEException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ALEException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALEException", propOrder = {
    "reason"
})
@XmlSeeAlso({
    SecurityException.class,
    RoleValidationException.class,
    PermissionValidationException.class,
    UnsupportedOperationException.class,
    DuplicatePermissionException.class,
    DuplicateRoleException.class,
    NoSuchRoleException.class,
    NoSuchPermissionException.class,
    ClientIdentityValidationException.class,
    DuplicateClientIdentityException.class,
    NoSuchClientIdentityException.class,
    ImplementationException.class
})
public class ALEException {

    @XmlElement(required = true)
    protected String reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
