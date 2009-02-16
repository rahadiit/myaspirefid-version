package org.ow2.aspirerfid.ide.masterdata.soap;

import javax.xml.ws.WebFault;

/**
 * This class was generated by Apache CXF (incubator) 2.0.4-incubator Wed Jan 30
 * 15:43:44 CET 2008 Generated source version: 2.0.4-incubator
 */

@WebFault(name = "NoSuchNameException", targetNamespace = "urn:epcglobal:epcis-query:xsd:1")
public class NoSuchNameExceptionResponse extends Exception {
    public static final long serialVersionUID = 20080130154344L;

    private org.fosstrak.epcis.model.NoSuchNameException noSuchNameException;

    public NoSuchNameExceptionResponse() {
        super();
    }

    public NoSuchNameExceptionResponse(String message) {
        super(message);
    }

    public NoSuchNameExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchNameExceptionResponse(String message, org.fosstrak.epcis.model.NoSuchNameException noSuchNameException) {
        super(message);
        this.noSuchNameException = noSuchNameException;
    }

    public NoSuchNameExceptionResponse(String message, org.fosstrak.epcis.model.NoSuchNameException noSuchNameException,
            Throwable cause) {
        super(message, cause);
        this.noSuchNameException = noSuchNameException;
    }

    public org.fosstrak.epcis.model.NoSuchNameException getFaultInfo() {
        return this.noSuchNameException;
    }
}
