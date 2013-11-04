
package org.fosstrak.ale.wsdl.ale.epcglobal;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:17.829+02:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "ECSpecValidationException", targetNamespace = "urn:epcglobal:ale:wsdl:1")
public class ECSpecValidationExceptionResponse extends Exception {
    
    private org.fosstrak.ale.wsdl.ale.epcglobal.ECSpecValidationException ecSpecValidationException;

    public ECSpecValidationExceptionResponse() {
        super();
    }
    
    public ECSpecValidationExceptionResponse(String message) {
        super(message);
    }
    
    public ECSpecValidationExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public ECSpecValidationExceptionResponse(String message, org.fosstrak.ale.wsdl.ale.epcglobal.ECSpecValidationException ecSpecValidationException) {
        super(message);
        this.ecSpecValidationException = ecSpecValidationException;
    }

    public ECSpecValidationExceptionResponse(String message, org.fosstrak.ale.wsdl.ale.epcglobal.ECSpecValidationException ecSpecValidationException, Throwable cause) {
        super(message, cause);
        this.ecSpecValidationException = ecSpecValidationException;
    }

    public org.fosstrak.ale.wsdl.ale.epcglobal.ECSpecValidationException getFaultInfo() {
        return this.ecSpecValidationException;
    }
}
