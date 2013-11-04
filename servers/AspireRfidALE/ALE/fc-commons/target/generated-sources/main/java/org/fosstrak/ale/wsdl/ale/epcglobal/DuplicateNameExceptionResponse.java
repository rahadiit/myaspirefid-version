
package org.fosstrak.ale.wsdl.ale.epcglobal;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:17.835+02:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "DuplicateNameException", targetNamespace = "urn:epcglobal:ale:wsdl:1")
public class DuplicateNameExceptionResponse extends Exception {
    
    private org.fosstrak.ale.wsdl.ale.epcglobal.DuplicateNameException duplicateNameException;

    public DuplicateNameExceptionResponse() {
        super();
    }
    
    public DuplicateNameExceptionResponse(String message) {
        super(message);
    }
    
    public DuplicateNameExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateNameExceptionResponse(String message, org.fosstrak.ale.wsdl.ale.epcglobal.DuplicateNameException duplicateNameException) {
        super(message);
        this.duplicateNameException = duplicateNameException;
    }

    public DuplicateNameExceptionResponse(String message, org.fosstrak.ale.wsdl.ale.epcglobal.DuplicateNameException duplicateNameException, Throwable cause) {
        super(message, cause);
        this.duplicateNameException = duplicateNameException;
    }

    public org.fosstrak.ale.wsdl.ale.epcglobal.DuplicateNameException getFaultInfo() {
        return this.duplicateNameException;
    }
}
