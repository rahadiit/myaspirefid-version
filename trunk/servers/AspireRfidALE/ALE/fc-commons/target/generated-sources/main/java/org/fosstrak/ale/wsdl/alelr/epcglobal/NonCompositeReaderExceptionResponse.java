
package org.fosstrak.ale.wsdl.alelr.epcglobal;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:19.115+02:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "NonCompositeReaderException", targetNamespace = "urn:epcglobal:alelr:wsdl:1")
public class NonCompositeReaderExceptionResponse extends Exception {
    
    private org.fosstrak.ale.wsdl.alelr.epcglobal.NonCompositeReaderException nonCompositeReaderException;

    public NonCompositeReaderExceptionResponse() {
        super();
    }
    
    public NonCompositeReaderExceptionResponse(String message) {
        super(message);
    }
    
    public NonCompositeReaderExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public NonCompositeReaderExceptionResponse(String message, org.fosstrak.ale.wsdl.alelr.epcglobal.NonCompositeReaderException nonCompositeReaderException) {
        super(message);
        this.nonCompositeReaderException = nonCompositeReaderException;
    }

    public NonCompositeReaderExceptionResponse(String message, org.fosstrak.ale.wsdl.alelr.epcglobal.NonCompositeReaderException nonCompositeReaderException, Throwable cause) {
        super(message, cause);
        this.nonCompositeReaderException = nonCompositeReaderException;
    }

    public org.fosstrak.ale.wsdl.alelr.epcglobal.NonCompositeReaderException getFaultInfo() {
        return this.nonCompositeReaderException;
    }
}
