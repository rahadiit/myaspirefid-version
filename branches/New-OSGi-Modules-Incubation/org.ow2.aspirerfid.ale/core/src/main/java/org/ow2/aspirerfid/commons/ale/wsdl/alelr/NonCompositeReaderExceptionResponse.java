
package org.ow2.aspirerfid.commons.ale.wsdl.alelr;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-03-13T15:55:20.635+02:00
 * Generated source version: 2.5.2
 */

@WebFault(name = "NonCompositeReaderException", targetNamespace = "urn:epcglobal:alelr:wsdl:1")
public class NonCompositeReaderExceptionResponse extends Exception {
    
    private org.ow2.aspirerfid.commons.ale.wsdl.alelr.NonCompositeReaderException nonCompositeReaderException;

    public NonCompositeReaderExceptionResponse() {
        super();
    }
    
    public NonCompositeReaderExceptionResponse(String message) {
        super(message);
    }
    
    public NonCompositeReaderExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public NonCompositeReaderExceptionResponse(String message, org.ow2.aspirerfid.commons.ale.wsdl.alelr.NonCompositeReaderException nonCompositeReaderException) {
        super(message);
        this.nonCompositeReaderException = nonCompositeReaderException;
    }

    public NonCompositeReaderExceptionResponse(String message, org.ow2.aspirerfid.commons.ale.wsdl.alelr.NonCompositeReaderException nonCompositeReaderException, Throwable cause) {
        super(message, cause);
        this.nonCompositeReaderException = nonCompositeReaderException;
    }

    public org.ow2.aspirerfid.commons.ale.wsdl.alelr.NonCompositeReaderException getFaultInfo() {
        return this.nonCompositeReaderException;
    }
}
