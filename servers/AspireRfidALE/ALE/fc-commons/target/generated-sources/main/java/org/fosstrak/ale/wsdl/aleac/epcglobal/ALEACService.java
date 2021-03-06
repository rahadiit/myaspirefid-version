package org.fosstrak.ale.wsdl.aleac.epcglobal;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-03T11:31:18.310+02:00
 * Generated source version: 2.6.1
 * 
 */
@WebServiceClient(name = "ALEACService", 
                  wsdlLocation = "file:/home/driss/Fosstrak/fc/trunk/fc-commons/src/main/resources/wsdl/EPCglobal-ale-1_1-aleac.wsdl",
                  targetNamespace = "urn:epcglobal:aleac:wsdl:1") 
public class ALEACService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:epcglobal:aleac:wsdl:1", "ALEACService");
    public final static QName ALEACServicePort = new QName("urn:epcglobal:aleac:wsdl:1", "ALEACServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/driss/Fosstrak/fc/trunk/fc-commons/src/main/resources/wsdl/EPCglobal-ale-1_1-aleac.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ALEACService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/driss/Fosstrak/fc/trunk/fc-commons/src/main/resources/wsdl/EPCglobal-ale-1_1-aleac.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ALEACService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ALEACService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ALEACService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ALEACServicePortType
     */
    @WebEndpoint(name = "ALEACServicePort")
    public ALEACServicePortType getALEACServicePort() {
        return super.getPort(ALEACServicePort, ALEACServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ALEACServicePortType
     */
    @WebEndpoint(name = "ALEACServicePort")
    public ALEACServicePortType getALEACServicePort(WebServiceFeature... features) {
        return super.getPort(ALEACServicePort, ALEACServicePortType.class, features);
    }

}
