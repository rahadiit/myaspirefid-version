/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.7</a>, using an XML
 * Schema.
 * $Id$
 */

package org.ow2.aspirerfid.common.tdt;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Enumeration;
import org.ow2.aspirerfid.common.tdt.types.SchemeNameList;
import org.ow2.aspirerfid.common.tdt.types.TagLengthList;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Scheme.
 * 
 * @version $Revision$ $Date$
 */
public class Scheme implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private org.ow2.aspirerfid.common.tdt.types.SchemeNameList _name;

    /**
     * Field _optionKey
     */
    private java.lang.String _optionKey;

    /**
     * Field _tagLength
     */
    private org.ow2.aspirerfid.common.tdt.types.TagLengthList _tagLength;

    /**
     * Field _levelList
     */
    private java.util.ArrayList _levelList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Scheme() 
     {
        super();
        _levelList = new ArrayList();
    } //-- org.ow2.aspirerfid.common.tdt.Scheme()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addLevel
     * 
     * 
     * 
     * @param vLevel
     */
    public void addLevel(org.ow2.aspirerfid.common.tdt.Level vLevel)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_levelList.size() < 5)) {
            throw new IndexOutOfBoundsException();
        }
        _levelList.add(vLevel);
    } //-- void addLevel(org.ow2.aspirerfid.common.tdt.Level) 

    /**
     * Method addLevel
     * 
     * 
     * 
     * @param index
     * @param vLevel
     */
    public void addLevel(int index, org.ow2.aspirerfid.common.tdt.Level vLevel)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_levelList.size() < 5)) {
            throw new IndexOutOfBoundsException();
        }
        _levelList.add(index, vLevel);
    } //-- void addLevel(int, org.ow2.aspirerfid.common.tdt.Level) 

    /**
     * Method clearLevel
     * 
     */
    public void clearLevel()
    {
        _levelList.clear();
    } //-- void clearLevel() 

    /**
     * Method enumerateLevel
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateLevel()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_levelList.iterator());
    } //-- java.util.Enumeration enumerateLevel() 

    /**
     * Method getLevel
     * 
     * 
     * 
     * @param index
     * @return Level
     */
    public org.ow2.aspirerfid.common.tdt.Level getLevel(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _levelList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.ow2.aspirerfid.common.tdt.Level) _levelList.get(index);
    } //-- org.ow2.aspirerfid.common.tdt.Level getLevel(int) 

    /**
     * Method getLevel
     * 
     * 
     * 
     * @return Level
     */
    public org.ow2.aspirerfid.common.tdt.Level[] getLevel()
    {
        int size = _levelList.size();
        org.ow2.aspirerfid.common.tdt.Level[] mArray = new org.ow2.aspirerfid.common.tdt.Level[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.ow2.aspirerfid.common.tdt.Level) _levelList.get(index);
        }
        return mArray;
    } //-- org.ow2.aspirerfid.common.tdt.Level[] getLevel() 

    /**
     * Method getLevelCount
     * 
     * 
     * 
     * @return int
     */
    public int getLevelCount()
    {
        return _levelList.size();
    } //-- int getLevelCount() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return SchemeNameList
     * @return the value of field 'name'.
     */
    public org.ow2.aspirerfid.common.tdt.types.SchemeNameList getName()
    {
        return this._name;
    } //-- org.ow2.aspirerfid.common.tdt.types.SchemeNameList getName() 

    /**
     * Returns the value of field 'optionKey'.
     * 
     * @return String
     * @return the value of field 'optionKey'.
     */
    public java.lang.String getOptionKey()
    {
        return this._optionKey;
    } //-- java.lang.String getOptionKey() 

    /**
     * Returns the value of field 'tagLength'.
     * 
     * @return TagLengthList
     * @return the value of field 'tagLength'.
     */
    public org.ow2.aspirerfid.common.tdt.types.TagLengthList getTagLength()
    {
        return this._tagLength;
    } //-- org.ow2.aspirerfid.common.tdt.types.TagLengthList getTagLength() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeLevel
     * 
     * 
     * 
     * @param vLevel
     * @return boolean
     */
    public boolean removeLevel(org.ow2.aspirerfid.common.tdt.Level vLevel)
    {
        boolean removed = _levelList.remove(vLevel);
        return removed;
    } //-- boolean removeLevel(org.ow2.aspirerfid.common.tdt.Level) 

    /**
     * Method setLevel
     * 
     * 
     * 
     * @param index
     * @param vLevel
     */
    public void setLevel(int index, org.ow2.aspirerfid.common.tdt.Level vLevel)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _levelList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 5)) {
            throw new IndexOutOfBoundsException();
        }
        _levelList.set(index, vLevel);
    } //-- void setLevel(int, org.ow2.aspirerfid.common.tdt.Level) 

    /**
     * Method setLevel
     * 
     * 
     * 
     * @param levelArray
     */
    public void setLevel(org.ow2.aspirerfid.common.tdt.Level[] levelArray)
    {
        //-- copy array
        _levelList.clear();
        for (int i = 0; i < levelArray.length; i++) {
            _levelList.add(levelArray[i]);
        }
    } //-- void setLevel(org.ow2.aspirerfid.common.tdt.Level) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(org.ow2.aspirerfid.common.tdt.types.SchemeNameList name)
    {
        this._name = name;
    } //-- void setName(org.ow2.aspirerfid.common.tdt.types.SchemeNameList) 

    /**
     * Sets the value of field 'optionKey'.
     * 
     * @param optionKey the value of field 'optionKey'.
     */
    public void setOptionKey(java.lang.String optionKey)
    {
        this._optionKey = optionKey;
    } //-- void setOptionKey(java.lang.String) 

    /**
     * Sets the value of field 'tagLength'.
     * 
     * @param tagLength the value of field 'tagLength'.
     */
    public void setTagLength(org.ow2.aspirerfid.common.tdt.types.TagLengthList tagLength)
    {
        this._tagLength = tagLength;
    } //-- void setTagLength(org.ow2.aspirerfid.common.tdt.types.TagLengthList) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.ow2.aspirerfid.common.tdt.Scheme) Unmarshaller.unmarshal(org.ow2.aspirerfid.common.tdt.Scheme.class, reader);
    } //-- java.lang.Object unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
