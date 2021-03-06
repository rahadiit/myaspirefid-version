
package org.ow2.aspirerfid.commons.ale.wsdl.ale;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.4
 * Tue Jan 26 18:52:19 EET 2010
 * Generated source version: 2.2.4
 * 
 */

@WebFault(name = "ECSpecValidationException", targetNamespace = "urn:epcglobal:ale:wsdl:1")
public class ECSpecValidationExceptionResponse extends Exception {
    public static final long serialVersionUID = 20100126185219L;
    
    private org.ow2.aspirerfid.commons.ale.wsdl.ale.ECSpecValidationException ecSpecValidationException;

    public ECSpecValidationExceptionResponse() {
        super();
    }
    
    public ECSpecValidationExceptionResponse(String message) {
        super(message);
    }
    
    public ECSpecValidationExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public ECSpecValidationExceptionResponse(String message, org.ow2.aspirerfid.commons.ale.wsdl.ale.ECSpecValidationException ecSpecValidationException) {
        super(message);
        this.ecSpecValidationException = ecSpecValidationException;
    }

    public ECSpecValidationExceptionResponse(String message, org.ow2.aspirerfid.commons.ale.wsdl.ale.ECSpecValidationException ecSpecValidationException, Throwable cause) {
        super(message, cause);
        this.ecSpecValidationException = ecSpecValidationException;
    }

    public org.ow2.aspirerfid.commons.ale.wsdl.ale.ECSpecValidationException getFaultInfo() {
        return this.ecSpecValidationException;
    }
}
