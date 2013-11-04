
package org.fosstrak.ale.wsdl.aleac.epcglobal;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:18.254+02:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "NoSuchRoleException", targetNamespace = "urn:epcglobal:aleac:wsdl:1")
public class NoSuchRoleExceptionResponse extends Exception {
    
    private org.fosstrak.ale.wsdl.aleac.epcglobal.NoSuchRoleException noSuchRoleException;

    public NoSuchRoleExceptionResponse() {
        super();
    }
    
    public NoSuchRoleExceptionResponse(String message) {
        super(message);
    }
    
    public NoSuchRoleExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchRoleExceptionResponse(String message, org.fosstrak.ale.wsdl.aleac.epcglobal.NoSuchRoleException noSuchRoleException) {
        super(message);
        this.noSuchRoleException = noSuchRoleException;
    }

    public NoSuchRoleExceptionResponse(String message, org.fosstrak.ale.wsdl.aleac.epcglobal.NoSuchRoleException noSuchRoleException, Throwable cause) {
        super(message, cause);
        this.noSuchRoleException = noSuchRoleException;
    }

    public org.fosstrak.ale.wsdl.aleac.epcglobal.NoSuchRoleException getFaultInfo() {
        return this.noSuchRoleException;
    }
}
