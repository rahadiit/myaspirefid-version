
package org.fosstrak.ale.wsdl.aleac.epcglobal;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:18.261+02:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "SecurityException", targetNamespace = "urn:epcglobal:aleac:wsdl:1")
public class SecurityExceptionResponse extends Exception {
    
    private org.fosstrak.ale.wsdl.aleac.epcglobal.SecurityException securityException;

    public SecurityExceptionResponse() {
        super();
    }
    
    public SecurityExceptionResponse(String message) {
        super(message);
    }
    
    public SecurityExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public SecurityExceptionResponse(String message, org.fosstrak.ale.wsdl.aleac.epcglobal.SecurityException securityException) {
        super(message);
        this.securityException = securityException;
    }

    public SecurityExceptionResponse(String message, org.fosstrak.ale.wsdl.aleac.epcglobal.SecurityException securityException, Throwable cause) {
        super(message, cause);
        this.securityException = securityException;
    }

    public org.fosstrak.ale.wsdl.aleac.epcglobal.SecurityException getFaultInfo() {
        return this.securityException;
    }
}
