package org.ow2.aspirerfid.ide.masterdata.soap;

import javax.xml.ws.WebFault;

/**
 * This class was generated by Apache CXF (incubator) 2.0.4-incubator Wed Jan 30
 * 15:43:44 CET 2008 Generated source version: 2.0.4-incubator
 */

@WebFault(name = "QueryParameterException", targetNamespace = "urn:epcglobal:epcis-query:xsd:1")
public class QueryParameterExceptionResponse extends Exception {
    public static final long serialVersionUID = 20080130154344L;

    private org.fosstrak.epcis.model.QueryParameterException queryParameterException;

    public QueryParameterExceptionResponse() {
        super();
    }

    public QueryParameterExceptionResponse(String message) {
        super(message);
    }

    public QueryParameterExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryParameterExceptionResponse(String message,
            org.fosstrak.epcis.model.QueryParameterException queryParameterException) {
        super(message);
        this.queryParameterException = queryParameterException;
    }

    public QueryParameterExceptionResponse(String message,
            org.fosstrak.epcis.model.QueryParameterException queryParameterException, Throwable cause) {
        super(message, cause);
        this.queryParameterException = queryParameterException;
    }

    public org.fosstrak.epcis.model.QueryParameterException getFaultInfo() {
        return this.queryParameterException;
    }
}