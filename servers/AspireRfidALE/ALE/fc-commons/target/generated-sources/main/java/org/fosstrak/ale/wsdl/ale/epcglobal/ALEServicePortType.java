package org.fosstrak.ale.wsdl.ale.epcglobal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:17.854+02:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "urn:epcglobal:ale:wsdl:1", name = "ALEServicePortType")
@XmlSeeAlso({ObjectFactory.class, org.fosstrak.ale.xsd.ale.epcglobal.ObjectFactory.class, org.fosstrak.ale.xsd.epcglobal.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ALEServicePortType {

    @WebResult(name = "VoidHolder", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "undefineReturn")
    @WebMethod
    public VoidHolder undefine(
        @WebParam(partName = "parms", name = "Undefine", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        Undefine parms
    ) throws ImplementationExceptionResponse, NoSuchNameExceptionResponse, SecurityExceptionResponse;

    @WebResult(name = "ImmediateResult", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "immediateReturn")
    @WebMethod
    public org.fosstrak.ale.xsd.ale.epcglobal.ECReports immediate(
        @WebParam(partName = "parms", name = "Immediate", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        Immediate parms
    ) throws ImplementationExceptionResponse, SecurityExceptionResponse, ECSpecValidationExceptionResponse;

    @WebResult(name = "GetECSpecNamesResult", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "getECSpecNamesReturn")
    @WebMethod
    public ArrayOfString getECSpecNames(
        @WebParam(partName = "parms", name = "GetECSpecNames", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        EmptyParms parms
    ) throws ImplementationExceptionResponse, SecurityExceptionResponse;

    @WebResult(name = "VoidHolder", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "defineReturn")
    @WebMethod
    public VoidHolder define(
        @WebParam(partName = "parms", name = "Define", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        Define parms
    ) throws ImplementationExceptionResponse, SecurityExceptionResponse, ECSpecValidationExceptionResponse, DuplicateNameExceptionResponse;

    @WebResult(name = "GetStandardVersionResult", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "getStandardVersionReturn")
    @WebMethod
    public java.lang.String getStandardVersion(
        @WebParam(partName = "parms", name = "GetStandardVersion", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        EmptyParms parms
    ) throws ImplementationExceptionResponse;

    @WebResult(name = "VoidHolder", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "unsubscribeReturn")
    @WebMethod
    public VoidHolder unsubscribe(
        @WebParam(partName = "parms", name = "Unsubscribe", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        Unsubscribe parms
    ) throws ImplementationExceptionResponse, NoSuchSubscriberExceptionResponse, NoSuchNameExceptionResponse, SecurityExceptionResponse, InvalidURIExceptionResponse;

    @WebResult(name = "PollResult", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "pollReturn")
    @WebMethod
    public org.fosstrak.ale.xsd.ale.epcglobal.ECReports poll(
        @WebParam(partName = "parms", name = "Poll", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        Poll parms
    ) throws ImplementationExceptionResponse, NoSuchNameExceptionResponse, SecurityExceptionResponse;

    @WebResult(name = "GetVendorVersionResult", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "getVendorVersionReturn")
    @WebMethod
    public java.lang.String getVendorVersion(
        @WebParam(partName = "parms", name = "GetVendorVersion", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        EmptyParms parms
    ) throws ImplementationExceptionResponse;

    @WebResult(name = "GetSubscribersResult", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "getSubscribersReturn")
    @WebMethod
    public ArrayOfString getSubscribers(
        @WebParam(partName = "parms", name = "GetSubscribers", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        GetSubscribers parms
    ) throws ImplementationExceptionResponse, NoSuchNameExceptionResponse, SecurityExceptionResponse;

    @WebResult(name = "VoidHolder", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "subscribeReturn")
    @WebMethod
    public VoidHolder subscribe(
        @WebParam(partName = "parms", name = "Subscribe", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        Subscribe parms
    ) throws ImplementationExceptionResponse, NoSuchNameExceptionResponse, SecurityExceptionResponse, InvalidURIExceptionResponse, DuplicateSubscriptionExceptionResponse;

    @WebResult(name = "GetECSpecResult", targetNamespace = "urn:epcglobal:ale:wsdl:1", partName = "getECSpecReturn")
    @WebMethod
    public org.fosstrak.ale.xsd.ale.epcglobal.ECSpec getECSpec(
        @WebParam(partName = "parms", name = "GetECSpec", targetNamespace = "urn:epcglobal:ale:wsdl:1")
        GetECSpec parms
    ) throws ImplementationExceptionResponse, NoSuchNameExceptionResponse, SecurityExceptionResponse;
}
