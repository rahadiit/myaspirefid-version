
package org.ow2.aspirerfid.commons.epcis.wsdl.query;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.4
 * Tue Jan 26 18:46:19 EET 2010
 * Generated source version: 2.2.4
 * 
 */

@WebFault(name = "ImplementationException", targetNamespace = "urn:epcglobal:epcis-query:xsd:1")
public class ImplementationExceptionResponse extends Exception {
    public static final long serialVersionUID = 20100126184619L;
    
    private org.ow2.aspirerfid.commons.epcis.model.ImplementationException implementationException;

    public ImplementationExceptionResponse() {
        super();
    }
    
    public ImplementationExceptionResponse(String message) {
        super(message);
    }
    
    public ImplementationExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public ImplementationExceptionResponse(String message, org.ow2.aspirerfid.commons.epcis.model.ImplementationException implementationException) {
        super(message);
        this.implementationException = implementationException;
    }

    public ImplementationExceptionResponse(String message, org.ow2.aspirerfid.commons.epcis.model.ImplementationException implementationException, Throwable cause) {
        super(message, cause);
        this.implementationException = implementationException;
    }

    public org.ow2.aspirerfid.commons.epcis.model.ImplementationException getFaultInfo() {
        return this.implementationException;
    }
}
