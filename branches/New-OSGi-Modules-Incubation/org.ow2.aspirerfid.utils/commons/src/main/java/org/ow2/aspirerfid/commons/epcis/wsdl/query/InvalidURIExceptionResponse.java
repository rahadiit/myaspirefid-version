
package org.ow2.aspirerfid.commons.epcis.wsdl.query;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-03-13T16:10:53.320+02:00
 * Generated source version: 2.5.2
 */

@WebFault(name = "InvalidURIException", targetNamespace = "urn:epcglobal:epcis-query:xsd:1")
public class InvalidURIExceptionResponse extends Exception {
    
    private org.ow2.aspirerfid.commons.epcis.model.InvalidURIException invalidURIException;

    public InvalidURIExceptionResponse() {
        super();
    }
    
    public InvalidURIExceptionResponse(String message) {
        super(message);
    }
    
    public InvalidURIExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidURIExceptionResponse(String message, org.ow2.aspirerfid.commons.epcis.model.InvalidURIException invalidURIException) {
        super(message);
        this.invalidURIException = invalidURIException;
    }

    public InvalidURIExceptionResponse(String message, org.ow2.aspirerfid.commons.epcis.model.InvalidURIException invalidURIException, Throwable cause) {
        super(message, cause);
        this.invalidURIException = invalidURIException;
    }

    public org.ow2.aspirerfid.commons.epcis.model.InvalidURIException getFaultInfo() {
        return this.invalidURIException;
    }
}