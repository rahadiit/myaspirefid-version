
/*
 * 
 */

package org.ow2.aspirerfid.commons.epcis.wsdl.query;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.4
 * Tue Feb 23 21:46:38 EET 2010
 * Generated source version: 2.2.4
 * 
 */


@WebServiceClient(name = "EPCglobalEPCISService", 
                  wsdlLocation = "/epcglobal/epcis/EPCglobal-epcis-query-1_0.wsdl",
                  targetNamespace = "urn:epcglobal:epcis:wsdl:1") 
public class EPCglobalEPCISService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:epcglobal:epcis:wsdl:1", "EPCglobalEPCISService");
    public final static QName EPCglobalEPCISServicePort = new QName("urn:epcglobal:epcis:wsdl:1", "EPCglobalEPCISServicePort");
    static {
        WSDL_LOCATION = EPCglobalEPCISService.class.getResource("/epcglobal/epcis/EPCglobal-epcis-query-1_0.wsdl");
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
     * 
     * @return
     *     returns EPCISServicePortType
     */
    @WebEndpoint(name = "EPCglobalEPCISServicePort")
    public EPCISServicePortType getEPCglobalEPCISServicePort() {
        return super.getPort(EPCglobalEPCISServicePort, EPCISServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EPCISServicePortType
     */
    @WebEndpoint(name = "EPCglobalEPCISServicePort")
    public EPCISServicePortType getEPCglobalEPCISServicePort(WebServiceFeature... features) {
        return super.getPort(EPCglobalEPCISServicePort, EPCISServicePortType.class, features);
    }

}
