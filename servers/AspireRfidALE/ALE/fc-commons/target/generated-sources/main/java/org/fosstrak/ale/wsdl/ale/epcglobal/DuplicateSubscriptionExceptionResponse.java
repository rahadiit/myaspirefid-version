
package org.fosstrak.ale.wsdl.ale.epcglobal;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:17.848+02:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "DuplicateSubscriptionException", targetNamespace = "urn:epcglobal:ale:wsdl:1")
public class DuplicateSubscriptionExceptionResponse extends Exception {
    
    private org.fosstrak.ale.wsdl.ale.epcglobal.DuplicateSubscriptionException duplicateSubscriptionException;

    public DuplicateSubscriptionExceptionResponse() {
        super();
    }
    
    public DuplicateSubscriptionExceptionResponse(String message) {
        super(message);
    }
    
    public DuplicateSubscriptionExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateSubscriptionExceptionResponse(String message, org.fosstrak.ale.wsdl.ale.epcglobal.DuplicateSubscriptionException duplicateSubscriptionException) {
        super(message);
        this.duplicateSubscriptionException = duplicateSubscriptionException;
    }

    public DuplicateSubscriptionExceptionResponse(String message, org.fosstrak.ale.wsdl.ale.epcglobal.DuplicateSubscriptionException duplicateSubscriptionException, Throwable cause) {
        super(message, cause);
        this.duplicateSubscriptionException = duplicateSubscriptionException;
    }

    public org.fosstrak.ale.wsdl.ale.epcglobal.DuplicateSubscriptionException getFaultInfo() {
        return this.duplicateSubscriptionException;
    }
}
