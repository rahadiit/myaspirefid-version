
package org.fosstrak.ale.wsdl.alecc.epcglobal;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:18.824+02:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "ImplementationException", targetNamespace = "urn:epcglobal:alecc:wsdl:1")
public class ImplementationExceptionResponse extends Exception {
    
    private org.fosstrak.ale.wsdl.alecc.epcglobal.ImplementationException implementationException;

    public ImplementationExceptionResponse() {
        super();
    }
    
    public ImplementationExceptionResponse(String message) {
        super(message);
    }
    
    public ImplementationExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public ImplementationExceptionResponse(String message, org.fosstrak.ale.wsdl.alecc.epcglobal.ImplementationException implementationException) {
        super(message);
        this.implementationException = implementationException;
    }

    public ImplementationExceptionResponse(String message, org.fosstrak.ale.wsdl.alecc.epcglobal.ImplementationException implementationException, Throwable cause) {
        super(message, cause);
        this.implementationException = implementationException;
    }

    public org.fosstrak.ale.wsdl.alecc.epcglobal.ImplementationException getFaultInfo() {
        return this.implementationException;
    }
}
