//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.18 at 04:40:35 PM CEST 
//


package org.fosstrak.ale.server.readers.gen;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gen package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LRSpec }
     * 
     */
    public LRSpec createLRSpec() {
        return new LRSpec();
    }

    /**
     * Create an instance of {@link LRProperty }
     * 
     */
    public LRProperty createLRProperty() {
        return new LRProperty();
    }

    /**
     * Create an instance of {@link LogicalReaders }
     * 
     */
    public LogicalReaders createLogicalReaders() {
        return new LogicalReaders();
    }

    /**
     * Create an instance of {@link LogicalReader }
     * 
     */
    public LogicalReader createLogicalReader() {
        return new LogicalReader();
    }

}
