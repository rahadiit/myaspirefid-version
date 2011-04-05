//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.11 at 04:01:40 �� EET 
//


package org.ow2.aspirerfid.commons.tracking.trackerdoc.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ow2.aspirerfid.commons.tracking.trackerdoc.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Region_QNAME = new QName("", "region");
    private final static QName _Time_QNAME = new QName("", "time");
    private final static QName _Fax_QNAME = new QName("", "fax");
    private final static QName _Email_QNAME = new QName("", "email");
    private final static QName _Address_QNAME = new QName("", "address");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Tel_QNAME = new QName("", "tel");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _GeoCoords_QNAME = new QName("", "geoCoords");
    private final static QName _Country_QNAME = new QName("", "country");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ow2.aspirerfid.commons.tracking.trackerdoc.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompanyInfo }
     * 
     */
    public CompanyInfo createCompanyInfo() {
        return new CompanyInfo();
    }

    /**
     * Create an instance of {@link TagEvent }
     * 
     */
    public TagEvent createTagEvent() {
        return new TagEvent();
    }

    /**
     * Create an instance of {@link Tag }
     * 
     */
    public Tag createTag() {
        return new Tag();
    }

    /**
     * Create an instance of {@link UserData }
     * 
     */
    public UserData createUserData() {
        return new UserData();
    }

    /**
     * Create an instance of {@link EpcClassProperty }
     * 
     */
    public EpcClassProperty createEpcClassProperty() {
        return new EpcClassProperty();
    }

    /**
     * Create an instance of {@link Trackerdocument }
     * 
     */
    public Trackerdocument createTrackerdocument() {
        return new Trackerdocument();
    }

    /**
     * Create an instance of {@link TagIdList }
     * 
     */
    public TagIdList createTagIdList() {
        return new TagIdList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "region")
    public JAXBElement<String> createRegion(String value) {
        return new JAXBElement<String>(_Region_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time")
    public JAXBElement<XMLGregorianCalendar> createTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Time_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fax")
    public JAXBElement<String> createFax(String value) {
        return new JAXBElement<String>(_Fax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address")
    public JAXBElement<String> createAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tel")
    public JAXBElement<String> createTel(String value) {
        return new JAXBElement<String>(_Tel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "geoCoords")
    public JAXBElement<String> createGeoCoords(String value) {
        return new JAXBElement<String>(_GeoCoords_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

}
