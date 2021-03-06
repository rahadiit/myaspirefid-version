
package org.ow2.aspirerfid.commons.ale.wsdl.ale;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.4
 * Tue Jan 26 18:52:19 EET 2010
 * Generated source version: 2.2.4
 * 
 */

@WebFault(name = "NoSuchNameException", targetNamespace = "urn:epcglobal:ale:wsdl:1")
public class NoSuchNameExceptionResponse extends Exception {
    public static final long serialVersionUID = 20100126185219L;
    
    private org.ow2.aspirerfid.commons.ale.wsdl.ale.NoSuchNameException noSuchNameException;

    public NoSuchNameExceptionResponse() {
        super();
    }
    
    public NoSuchNameExceptionResponse(String message) {
        super(message);
    }
    
    public NoSuchNameExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchNameExceptionResponse(String message, org.ow2.aspirerfid.commons.ale.wsdl.ale.NoSuchNameException noSuchNameException) {
        super(message);
        this.noSuchNameException = noSuchNameException;
    }

    public NoSuchNameExceptionResponse(String message, org.ow2.aspirerfid.commons.ale.wsdl.ale.NoSuchNameException noSuchNameException, Throwable cause) {
        super(message, cause);
        this.noSuchNameException = noSuchNameException;
    }

    public org.ow2.aspirerfid.commons.ale.wsdl.ale.NoSuchNameException getFaultInfo() {
        return this.noSuchNameException;
    }
}
