
package com.dataaccess.webservicesserver;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * The Number Conversion Web Service, implemented with DataFlex, provides functions that convert numbers into words or dollar amounts.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NumberConversion", targetNamespace = "http://www.dataaccess.com/webservicesserver/", wsdlLocation = "http://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL")
public class NumberConversion
    extends Service
{

    private final static URL NUMBERCONVERSION_WSDL_LOCATION;
    private final static WebServiceException NUMBERCONVERSION_EXCEPTION;
    private final static QName NUMBERCONVERSION_QNAME = new QName("http://www.dataaccess.com/webservicesserver/", "NumberConversion");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NUMBERCONVERSION_WSDL_LOCATION = url;
        NUMBERCONVERSION_EXCEPTION = e;
    }

    public NumberConversion() {
        super(__getWsdlLocation(), NUMBERCONVERSION_QNAME);
    }

    public NumberConversion(WebServiceFeature... features) {
        super(__getWsdlLocation(), NUMBERCONVERSION_QNAME, features);
    }

    public NumberConversion(URL wsdlLocation) {
        super(wsdlLocation, NUMBERCONVERSION_QNAME);
    }

    public NumberConversion(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NUMBERCONVERSION_QNAME, features);
    }

    public NumberConversion(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NumberConversion(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NumberConversionSoapType
     */
    @WebEndpoint(name = "NumberConversionSoap")
    public NumberConversionSoapType getNumberConversionSoap() {
        return super.getPort(new QName("http://www.dataaccess.com/webservicesserver/", "NumberConversionSoap"), NumberConversionSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NumberConversionSoapType
     */
    @WebEndpoint(name = "NumberConversionSoap")
    public NumberConversionSoapType getNumberConversionSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dataaccess.com/webservicesserver/", "NumberConversionSoap"), NumberConversionSoapType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NUMBERCONVERSION_EXCEPTION!= null) {
            throw NUMBERCONVERSION_EXCEPTION;
        }
        return NUMBERCONVERSION_WSDL_LOCATION;
    }

}
