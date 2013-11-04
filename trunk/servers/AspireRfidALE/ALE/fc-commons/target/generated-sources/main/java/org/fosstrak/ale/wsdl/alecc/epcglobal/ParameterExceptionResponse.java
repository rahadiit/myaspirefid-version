
package org.fosstrak.ale.wsdl.alecc.epcglobal;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:18.835+02:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "ParameterException", targetNamespace = "urn:epcglobal:alecc:wsdl:1")
public class ParameterExceptionResponse extends Exception {
    
    private org.fosstrak.ale.wsdl.alecc.epcglobal.ParameterException parameterException;

    public ParameterExceptionResponse() {
        super();
    }
    
    public ParameterExceptionResponse(String message) {
        super(message);
    }
    
    public ParameterExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public ParameterExceptionResponse(String message, org.fosstrak.ale.wsdl.alecc.epcglobal.ParameterException parameterException) {
        super(message);
        this.parameterException = parameterException;
    }

    public ParameterExceptionResponse(String message, org.fosstrak.ale.wsdl.alecc.epcglobal.ParameterException parameterException, Throwable cause) {
        super(message, cause);
        this.parameterException = parameterException;
    }

    public org.fosstrak.ale.wsdl.alecc.epcglobal.ParameterException getFaultInfo() {
        return this.parameterException;
    }
}
