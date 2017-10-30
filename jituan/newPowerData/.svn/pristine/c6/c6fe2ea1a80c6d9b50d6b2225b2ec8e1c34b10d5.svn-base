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

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * ϵͳ���б���
 * 
 * @version $Revision$ $Date$
 */
public class SystemVariant implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _variantValueList
     */
    private java.util.Vector _variantValueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SystemVariant() {
        super();
        _variantValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.SystemVariant()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addVariantValue
     * 
     * @param vVariantValue
     */
    public void addVariantValue(com.ccssoft.rsas.common.xmlparser.VariantValue vVariantValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _variantValueList.addElement(vVariantValue);
    } //-- void addVariantValue(com.regaltec.rsas.common.xmlparser.VariantValue) 

    /**
     * Method addVariantValue
     * 
     * @param index
     * @param vVariantValue
     */
    public void addVariantValue(int index, com.ccssoft.rsas.common.xmlparser.VariantValue vVariantValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _variantValueList.insertElementAt(vVariantValue, index);
    } //-- void addVariantValue(int, com.regaltec.rsas.common.xmlparser.VariantValue) 

    /**
     * Method enumerateVariantValue
     */
    public java.util.Enumeration enumerateVariantValue()
    {
        return _variantValueList.elements();
    } //-- java.util.Enumeration enumerateVariantValue() 

    /**
     * Method getVariantValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.VariantValue getVariantValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _variantValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.VariantValue) _variantValueList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.VariantValue getVariantValue(int) 

    /**
     * Method getVariantValue
     */
    public com.ccssoft.rsas.common.xmlparser.VariantValue[] getVariantValue()
    {
        int size = _variantValueList.size();
        com.ccssoft.rsas.common.xmlparser.VariantValue[] mArray = new com.ccssoft.rsas.common.xmlparser.VariantValue[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.VariantValue) _variantValueList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.VariantValue[] getVariantValue() 

    /**
     * Method getVariantValueCount
     */
    public int getVariantValueCount()
    {
        return _variantValueList.size();
    } //-- int getVariantValueCount() 

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
     * Method removeAllVariantValue
     */
    public void removeAllVariantValue()
    {
        _variantValueList.removeAllElements();
    } //-- void removeAllVariantValue() 

    /**
     * Method removeVariantValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.VariantValue removeVariantValue(int index)
    {
        java.lang.Object obj = _variantValueList.elementAt(index);
        _variantValueList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.VariantValue) obj;
    } //-- com.regaltec.rsas.common.xmlparser.VariantValue removeVariantValue(int) 

    /**
     * Method setVariantValue
     * 
     * @param index
     * @param vVariantValue
     */
    public void setVariantValue(int index, com.ccssoft.rsas.common.xmlparser.VariantValue vVariantValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _variantValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _variantValueList.setElementAt(vVariantValue, index);
    } //-- void setVariantValue(int, com.regaltec.rsas.common.xmlparser.VariantValue) 

    /**
     * Method setVariantValue
     * 
     * @param variantValueArray
     */
    public void setVariantValue(com.ccssoft.rsas.common.xmlparser.VariantValue[] variantValueArray)
    {
        //-- copy array
        _variantValueList.removeAllElements();
        for (int i = 0; i < variantValueArray.length; i++) {
            _variantValueList.addElement(variantValueArray[i]);
        }
    } //-- void setVariantValue(com.regaltec.rsas.common.xmlparser.VariantValue) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.SystemVariant) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.SystemVariant.class, reader);
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
