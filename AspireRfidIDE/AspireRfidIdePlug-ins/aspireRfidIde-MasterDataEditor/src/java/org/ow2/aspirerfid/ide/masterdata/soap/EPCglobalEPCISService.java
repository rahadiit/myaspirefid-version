package org.ow2.aspirerfid.ide.masterdata.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by Apache CXF (incubator) 2.0.4-incubator Wed Jan 30
 * 15:43:44 CET 2008 Generated source version: 2.0.4-incubator
 */

@WebServiceClient(name = "EPCglobalEPCISService", targetNamespace = "urn:epcglobal:epcis:wsdl:1")
public class EPCglobalEPCISService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:epcglobal:epcis:wsdl:1", "EPCglobalEPCISService");
    public final static QName EPCglobalEPCISServicePort = new QName("urn:epcglobal:epcis:wsdl:1",
            "EPCglobalEPCISServicePort");

    static {
        URL url = null;
        try {
            url = new URL("http://demo.accada.org/epcis/query?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://demo.accada.org/epcis/query?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EPCglobalEPCISService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EPCglobalEPCISService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EPCglobalEPCISService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * @return returns EPCglobalEPCISServicePort
     */
    @WebEndpoint(name = "EPCglobalEPCISServicePort")
    public EPCISServicePortType getEPCglobalEPCISServicePort() {
        return (EPCISServicePortType) super.getPort(EPCglobalEPCISServicePort, EPCISServicePortType.class);
    }

}
