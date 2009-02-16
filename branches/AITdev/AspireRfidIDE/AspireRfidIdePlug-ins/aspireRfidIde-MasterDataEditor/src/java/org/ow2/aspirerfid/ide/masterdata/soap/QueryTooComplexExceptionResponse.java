package org.ow2.aspirerfid.ide.masterdata.soap;

import javax.xml.ws.WebFault;

/**
 * This class was generated by Apache CXF (incubator) 2.0.4-incubator Wed Jan 30
 * 15:43:44 CET 2008 Generated source version: 2.0.4-incubator
 */

@WebFault(name = "QueryTooComplexException", targetNamespace = "urn:epcglobal:epcis-query:xsd:1")
public class QueryTooComplexExceptionResponse extends Exception {
    public static final long serialVersionUID = 20080130154344L;

    private org.fosstrak.epcis.model.QueryTooComplexException queryTooComplexException;

    public QueryTooComplexExceptionResponse() {
        super();
    }

    public QueryTooComplexExceptionResponse(String message) {
        super(message);
    }

    public QueryTooComplexExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryTooComplexExceptionResponse(String message,
            org.fosstrak.epcis.model.QueryTooComplexException queryTooComplexException) {
        super(message);
        this.queryTooComplexException = queryTooComplexException;
    }

    public QueryTooComplexExceptionResponse(String message,
            org.fosstrak.epcis.model.QueryTooComplexException queryTooComplexException, Throwable cause) {
        super(message, cause);
        this.queryTooComplexException = queryTooComplexException;
    }

    public org.fosstrak.epcis.model.QueryTooComplexException getFaultInfo() {
        return this.queryTooComplexException;
    }
}
