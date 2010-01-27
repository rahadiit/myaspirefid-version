
package org.ow2.aspirerfid.commons.ale.wsdl.alelr;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.4
 * Tue Jan 26 18:57:22 EET 2010
 * Generated source version: 2.2.4
 * 
 */

@WebFault(name = "DuplicateNameException", targetNamespace = "urn:epcglobal:alelr:wsdl:1")
public class DuplicateNameExceptionResponse extends Exception {
    public static final long serialVersionUID = 20100126185722L;
    
    private org.ow2.aspirerfid.commons.ale.wsdl.alelr.DuplicateNameException duplicateNameException;

    public DuplicateNameExceptionResponse() {
        super();
    }
    
    public DuplicateNameExceptionResponse(String message) {
        super(message);
    }
    
    public DuplicateNameExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateNameExceptionResponse(String message, org.ow2.aspirerfid.commons.ale.wsdl.alelr.DuplicateNameException duplicateNameException) {
        super(message);
        this.duplicateNameException = duplicateNameException;
    }

    public DuplicateNameExceptionResponse(String message, org.ow2.aspirerfid.commons.ale.wsdl.alelr.DuplicateNameException duplicateNameException, Throwable cause) {
        super(message, cause);
        this.duplicateNameException = duplicateNameException;
    }

    public org.ow2.aspirerfid.commons.ale.wsdl.alelr.DuplicateNameException getFaultInfo() {
        return this.duplicateNameException;
    }
}
