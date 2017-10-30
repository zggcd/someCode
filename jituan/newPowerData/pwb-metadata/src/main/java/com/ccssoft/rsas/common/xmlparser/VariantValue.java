/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.ccssoft.rsas.common.xmlparser.types.VariantValueVariantTypeType;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class VariantValue.
 * 
 * @version $Revision$ $Date$
 */
public class VariantValue implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _variantType
     */
    private com.ccssoft.rsas.common.xmlparser.types.VariantValueVariantTypeType _variantType;

    /**
     * Field _variantDataType
     */
    private java.lang.String _variantDataType;

    /**
     * Field _stringValue
     */
    private java.lang.String _stringValue;

    /**
     * Field _intValue
     */
    private int _intValue;

    /**
     * keeps track of state for field: _intValue
     */
    private boolean _has_intValue;

    /**
     * Field _floatValue
     */
    private float _floatValue;

    /**
     * keeps track of state for field: _floatValue
     */
    private boolean _has_floatValue;

    /**
     * Field _dateValue
     */
    private java.lang.String _dateValue;

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _desc
     */
    private java.lang.String _desc;


      //----------------/
     //- Constructors -/
    //----------------/

    public VariantValue() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.VariantValue()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteFloatValue
     */
    public void deleteFloatValue()
    {
        this._has_floatValue= false;
    } //-- void deleteFloatValue() 

    /**
     * Method deleteIntValue
     */
    public void deleteIntValue()
    {
        this._has_intValue= false;
    } //-- void deleteIntValue() 

    /**
     * Returns the value of field 'dateValue'.
     * 
     * @return the value of field 'dateValue'.
     */
    public java.lang.String getDateValue()
    {
        return this._dateValue;
    } //-- java.lang.String getDateValue() 

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'desc'.
     */
    public java.lang.String getDesc()
    {
        return this._desc;
    } //-- java.lang.String getDesc() 

    /**
     * Returns the value of field 'floatValue'.
     * 
     * @return the value of field 'floatValue'.
     */
    public float getFloatValue()
    {
        return this._floatValue;
    } //-- float getFloatValue() 

    /**
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

    /**
     * Returns the value of field 'intValue'.
     * 
     * @return the value of field 'intValue'.
     */
    public int getIntValue()
    {
        return this._intValue;
    } //-- int getIntValue() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'stringValue'.
     * 
     * @return the value of field 'stringValue'.
     */
    public java.lang.String getStringValue()
    {
        return this._stringValue;
    } //-- java.lang.String getStringValue() 

    /**
     * Returns the value of field 'variantDataType'.
     * 
     * @return the value of field 'variantDataType'.
     */
    public java.lang.String getVariantDataType()
    {
        return this._variantDataType;
    } //-- java.lang.String getVariantDataType() 

    /**
     * Returns the value of field 'variantType'.
     * 
     * @return the value of field 'variantType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.VariantValueVariantTypeType getVariantType()
    {
        return this._variantType;
    } //-- com.regaltec.rsas.common.xmlparser.types.VariantValueVariantTypeType getVariantType() 

    /**
     * Method hasFloatValue
     */
    public boolean hasFloatValue()
    {
        return this._has_floatValue;
    } //-- boolean hasFloatValue() 

    /**
     * Method hasIntValue
     */
    public boolean hasIntValue()
    {
        return this._has_intValue;
    } //-- boolean hasIntValue() 

    /**
     * Method isValid
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
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'dateValue'.
     * 
     * @param dateValue the value of field 'dateValue'.
     */
    public void setDateValue(java.lang.String dateValue)
    {
        this._dateValue = dateValue;
    } //-- void setDateValue(java.lang.String) 

    /**
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(java.lang.String desc)
    {
        this._desc = desc;
    } //-- void setDesc(java.lang.String) 

    /**
     * Sets the value of field 'floatValue'.
     * 
     * @param floatValue the value of field 'floatValue'.
     */
    public void setFloatValue(float floatValue)
    {
        this._floatValue = floatValue;
        this._has_floatValue = true;
    } //-- void setFloatValue(float) 

    /**
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

    /**
     * Sets the value of field 'intValue'.
     * 
     * @param intValue the value of field 'intValue'.
     */
    public void setIntValue(int intValue)
    {
        this._intValue = intValue;
        this._has_intValue = true;
    } //-- void setIntValue(int) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'stringValue'.
     * 
     * @param stringValue the value of field 'stringValue'.
     */
    public void setStringValue(java.lang.String stringValue)
    {
        this._stringValue = stringValue;
    } //-- void setStringValue(java.lang.String) 

    /**
     * Sets the value of field 'variantDataType'.
     * 
     * @param variantDataType the value of field 'variantDataType'.
     */
    public void setVariantDataType(java.lang.String variantDataType)
    {
        this._variantDataType = variantDataType;
    } //-- void setVariantDataType(java.lang.String) 

    /**
     * Sets the value of field 'variantType'.
     * 
     * @param variantType the value of field 'variantType'.
     */
    public void setVariantType(com.ccssoft.rsas.common.xmlparser.types.VariantValueVariantTypeType variantType)
    {
        this._variantType = variantType;
    } //-- void setVariantType(com.regaltec.rsas.common.xmlparser.types.VariantValueVariantTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.VariantValue) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.VariantValue.class, reader);
    } //-- java.lang.Object unmarshal(java.io.Reader) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
