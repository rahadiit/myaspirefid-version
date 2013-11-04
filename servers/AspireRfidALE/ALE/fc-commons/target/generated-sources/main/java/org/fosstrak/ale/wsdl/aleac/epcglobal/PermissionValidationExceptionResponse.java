
package org.fosstrak.ale.wsdl.aleac.epcglobal;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:18.281+02:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "PermissionValidationException", targetNamespace = "urn:epcglobal:aleac:wsdl:1")
public class PermissionValidationExceptionResponse extends Exception {
    
    private org.fosstrak.ale.wsdl.aleac.epcglobal.PermissionValidationException permissionValidationException;

    public PermissionValidationExceptionResponse() {
        super();
    }
    
    public PermissionValidationExceptionResponse(String message) {
        super(message);
    }
    
    public PermissionValidationExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionValidationExceptionResponse(String message, org.fosstrak.ale.wsdl.aleac.epcglobal.PermissionValidationException permissionValidationException) {
        super(message);
        this.permissionValidationException = permissionValidationException;
    }

    public PermissionValidationExceptionResponse(String message, org.fosstrak.ale.wsdl.aleac.epcglobal.PermissionValidationException permissionValidationException, Throwable cause) {
        super(message, cause);
        this.permissionValidationException = permissionValidationException;
    }

    public org.fosstrak.ale.wsdl.aleac.epcglobal.PermissionValidationException getFaultInfo() {
        return this.permissionValidationException;
    }
}
