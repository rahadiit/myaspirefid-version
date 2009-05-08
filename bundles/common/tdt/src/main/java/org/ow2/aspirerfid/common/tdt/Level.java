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
import org.ow2.aspirerfid.common.tdt.types.LevelTypeList;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Level.
 * 
 * @version $Revision$ $Date$
 */
public class Level implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type
     */
    private org.ow2.aspirerfid.common.tdt.types.LevelTypeList _type;

    /**
     * Field _prefixMatch
     */
    private java.lang.String _prefixMatch;

    /**
     * Field _requiredParsingParameters
     */
    private java.lang.String _requiredParsingParameters;

    /**
     * Field _requiredFormattingParameters
     */
    private java.lang.String _requiredFormattingParameters;

    /**
     * Field _optionList
     */
    private java.util.ArrayList _optionList;

    /**
     * Field _ruleList
     */
    private java.util.ArrayList _ruleList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Level() 
     {
        super();
        _optionList = new ArrayList();
        _ruleList = new ArrayList();
    } //-- org.ow2.aspirerfid.common.tdt.Level()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOption
     * 
     * 
     * 
     * @param vOption
     */
    public void addOption(org.ow2.aspirerfid.common.tdt.Option vOption)
        throws java.lang.IndexOutOfBoundsException
    {
        _optionList.add(vOption);
    } //-- void addOption(org.ow2.aspirerfid.common.tdt.Option) 

    /**
     * Method addOption
     * 
     * 
     * 
     * @param index
     * @param vOption
     */
    public void addOption(int index, org.ow2.aspirerfid.common.tdt.Option vOption)
        throws java.lang.IndexOutOfBoundsException
    {
        _optionList.add(index, vOption);
    } //-- void addOption(int, org.ow2.aspirerfid.common.tdt.Option) 

    /**
     * Method addRule
     * 
     * 
     * 
     * @param vRule
     */
    public void addRule(org.ow2.aspirerfid.common.tdt.Rule vRule)
        throws java.lang.IndexOutOfBoundsException
    {
        _ruleList.add(vRule);
    } //-- void addRule(org.ow2.aspirerfid.common.tdt.Rule) 

    /**
     * Method addRule
     * 
     * 
     * 
     * @param index
     * @param vRule
     */
    public void addRule(int index, org.ow2.aspirerfid.common.tdt.Rule vRule)
        throws java.lang.IndexOutOfBoundsException
    {
        _ruleList.add(index, vRule);
    } //-- void addRule(int, org.ow2.aspirerfid.common.tdt.Rule) 

    /**
     * Method clearOption
     * 
     */
    public void clearOption()
    {
        _optionList.clear();
    } //-- void clearOption() 

    /**
     * Method clearRule
     * 
     */
    public void clearRule()
    {
        _ruleList.clear();
    } //-- void clearRule() 

    /**
     * Method enumerateOption
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOption()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_optionList.iterator());
    } //-- java.util.Enumeration enumerateOption() 

    /**
     * Method enumerateRule
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateRule()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_ruleList.iterator());
    } //-- java.util.Enumeration enumerateRule() 

    /**
     * Method getOption
     * 
     * 
     * 
     * @param index
     * @return Option
     */
    public org.ow2.aspirerfid.common.tdt.Option getOption(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _optionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.ow2.aspirerfid.common.tdt.Option) _optionList.get(index);
    } //-- org.ow2.aspirerfid.common.tdt.Option getOption(int) 

    /**
     * Method getOption
     * 
     * 
     * 
     * @return Option
     */
    public org.ow2.aspirerfid.common.tdt.Option[] getOption()
    {
        int size = _optionList.size();
        org.ow2.aspirerfid.common.tdt.Option[] mArray = new org.ow2.aspirerfid.common.tdt.Option[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.ow2.aspirerfid.common.tdt.Option) _optionList.get(index);
        }
        return mArray;
    } //-- org.ow2.aspirerfid.common.tdt.Option[] getOption() 

    /**
     * Method getOptionCount
     * 
     * 
     * 
     * @return int
     */
    public int getOptionCount()
    {
        return _optionList.size();
    } //-- int getOptionCount() 

    /**
     * Returns the value of field 'prefixMatch'.
     * 
     * @return String
     * @return the value of field 'prefixMatch'.
     */
    public java.lang.String getPrefixMatch()
    {
        return this._prefixMatch;
    } //-- java.lang.String getPrefixMatch() 

    /**
     * Returns the value of field 'requiredFormattingParameters'.
     * 
     * @return String
     * @return the value of field 'requiredFormattingParameters'.
     */
    public java.lang.String getRequiredFormattingParameters()
    {
        return this._requiredFormattingParameters;
    } //-- java.lang.String getRequiredFormattingParameters() 

    /**
     * Returns the value of field 'requiredParsingParameters'.
     * 
     * @return String
     * @return the value of field 'requiredParsingParameters'.
     */
    public java.lang.String getRequiredParsingParameters()
    {
        return this._requiredParsingParameters;
    } //-- java.lang.String getRequiredParsingParameters() 

    /**
     * Method getRule
     * 
     * 
     * 
     * @param index
     * @return Rule
     */
    public org.ow2.aspirerfid.common.tdt.Rule getRule(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _ruleList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.ow2.aspirerfid.common.tdt.Rule) _ruleList.get(index);
    } //-- org.ow2.aspirerfid.common.tdt.Rule getRule(int) 

    /**
     * Method getRule
     * 
     * 
     * 
     * @return Rule
     */
    public org.ow2.aspirerfid.common.tdt.Rule[] getRule()
    {
        int size = _ruleList.size();
        org.ow2.aspirerfid.common.tdt.Rule[] mArray = new org.ow2.aspirerfid.common.tdt.Rule[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.ow2.aspirerfid.common.tdt.Rule) _ruleList.get(index);
        }
        return mArray;
    } //-- org.ow2.aspirerfid.common.tdt.Rule[] getRule() 

    /**
     * Method getRuleCount
     * 
     * 
     * 
     * @return int
     */
    public int getRuleCount()
    {
        return _ruleList.size();
    } //-- int getRuleCount() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return LevelTypeList
     * @return the value of field 'type'.
     */
    public org.ow2.aspirerfid.common.tdt.types.LevelTypeList getType()
    {
        return this._type;
    } //-- org.ow2.aspirerfid.common.tdt.types.LevelTypeList getType() 

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
     * Method removeOption
     * 
     * 
     * 
     * @param vOption
     * @return boolean
     */
    public boolean removeOption(org.ow2.aspirerfid.common.tdt.Option vOption)
    {
        boolean removed = _optionList.remove(vOption);
        return removed;
    } //-- boolean removeOption(org.ow2.aspirerfid.common.tdt.Option) 

    /**
     * Method removeRule
     * 
     * 
     * 
     * @param vRule
     * @return boolean
     */
    public boolean removeRule(org.ow2.aspirerfid.common.tdt.Rule vRule)
    {
        boolean removed = _ruleList.remove(vRule);
        return removed;
    } //-- boolean removeRule(org.ow2.aspirerfid.common.tdt.Rule) 

    /**
     * Method setOption
     * 
     * 
     * 
     * @param index
     * @param vOption
     */
    public void setOption(int index, org.ow2.aspirerfid.common.tdt.Option vOption)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _optionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _optionList.set(index, vOption);
    } //-- void setOption(int, org.ow2.aspirerfid.common.tdt.Option) 

    /**
     * Method setOption
     * 
     * 
     * 
     * @param optionArray
     */
    public void setOption(org.ow2.aspirerfid.common.tdt.Option[] optionArray)
    {
        //-- copy array
        _optionList.clear();
        for (int i = 0; i < optionArray.length; i++) {
            _optionList.add(optionArray[i]);
        }
    } //-- void setOption(org.ow2.aspirerfid.common.tdt.Option) 

    /**
     * Sets the value of field 'prefixMatch'.
     * 
     * @param prefixMatch the value of field 'prefixMatch'.
     */
    public void setPrefixMatch(java.lang.String prefixMatch)
    {
        this._prefixMatch = prefixMatch;
    } //-- void setPrefixMatch(java.lang.String) 

    /**
     * Sets the value of field 'requiredFormattingParameters'.
     * 
     * @param requiredFormattingParameters the value of field
     * 'requiredFormattingParameters'.
     */
    public void setRequiredFormattingParameters(java.lang.String requiredFormattingParameters)
    {
        this._requiredFormattingParameters = requiredFormattingParameters;
    } //-- void setRequiredFormattingParameters(java.lang.String) 

    /**
     * Sets the value of field 'requiredParsingParameters'.
     * 
     * @param requiredParsingParameters the value of field
     * 'requiredParsingParameters'.
     */
    public void setRequiredParsingParameters(java.lang.String requiredParsingParameters)
    {
        this._requiredParsingParameters = requiredParsingParameters;
    } //-- void setRequiredParsingParameters(java.lang.String) 

    /**
     * Method setRule
     * 
     * 
     * 
     * @param index
     * @param vRule
     */
    public void setRule(int index, org.ow2.aspirerfid.common.tdt.Rule vRule)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _ruleList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _ruleList.set(index, vRule);
    } //-- void setRule(int, org.ow2.aspirerfid.common.tdt.Rule) 

    /**
     * Method setRule
     * 
     * 
     * 
     * @param ruleArray
     */
    public void setRule(org.ow2.aspirerfid.common.tdt.Rule[] ruleArray)
    {
        //-- copy array
        _ruleList.clear();
        for (int i = 0; i < ruleArray.length; i++) {
            _ruleList.add(ruleArray[i]);
        }
    } //-- void setRule(org.ow2.aspirerfid.common.tdt.Rule) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(org.ow2.aspirerfid.common.tdt.types.LevelTypeList type)
    {
        this._type = type;
    } //-- void setType(org.ow2.aspirerfid.common.tdt.types.LevelTypeList) 

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
        return (org.ow2.aspirerfid.common.tdt.Level) Unmarshaller.unmarshal(org.ow2.aspirerfid.common.tdt.Level.class, reader);
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
