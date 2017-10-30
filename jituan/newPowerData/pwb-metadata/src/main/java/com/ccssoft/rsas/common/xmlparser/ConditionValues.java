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
 * Class ConditionValues.
 * 
 * @version $Revision$ $Date$
 */
public class ConditionValues implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ɸѡ����ֵ
     */
    private java.util.Vector _conditionValueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConditionValues() {
        super();
        _conditionValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ConditionValues()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConditionValue
     * 
     * @param vConditionValue
     */
    public void addConditionValue(com.ccssoft.rsas.common.xmlparser.ConditionValue vConditionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionValueList.addElement(vConditionValue);
    } //-- void addConditionValue(com.regaltec.rsas.common.xmlparser.ConditionValue) 

    /**
     * Method addConditionValue
     * 
     * @param index
     * @param vConditionValue
     */
    public void addConditionValue(int index, com.ccssoft.rsas.common.xmlparser.ConditionValue vConditionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionValueList.insertElementAt(vConditionValue, index);
    } //-- void addConditionValue(int, com.regaltec.rsas.common.xmlparser.ConditionValue) 

    /**
     * Method enumerateConditionValue
     */
    public java.util.Enumeration enumerateConditionValue()
    {
        return _conditionValueList.elements();
    } //-- java.util.Enumeration enumerateConditionValue() 

    /**
     * Method getConditionValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionValue getConditionValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ConditionValue) _conditionValueList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ConditionValue getConditionValue(int) 

    /**
     * Method getConditionValue
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionValue[] getConditionValue()
    {
        int size = _conditionValueList.size();
        com.ccssoft.rsas.common.xmlparser.ConditionValue[] mArray = new com.ccssoft.rsas.common.xmlparser.ConditionValue[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ConditionValue) _conditionValueList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionValue[] getConditionValue() 

    /**
     * Method getConditionValueCount
     */
    public int getConditionValueCount()
    {
        return _conditionValueList.size();
    } //-- int getConditionValueCount() 

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
     * Method removeAllConditionValue
     */
    public void removeAllConditionValue()
    {
        _conditionValueList.removeAllElements();
    } //-- void removeAllConditionValue() 

    /**
     * Method removeConditionValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionValue removeConditionValue(int index)
    {
        java.lang.Object obj = _conditionValueList.elementAt(index);
        _conditionValueList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ConditionValue) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionValue removeConditionValue(int) 

    /**
     * Method setConditionValue
     * 
     * @param index
     * @param vConditionValue
     */
    public void setConditionValue(int index, com.ccssoft.rsas.common.xmlparser.ConditionValue vConditionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _conditionValueList.setElementAt(vConditionValue, index);
    } //-- void setConditionValue(int, com.regaltec.rsas.common.xmlparser.ConditionValue) 

    /**
     * Method setConditionValue
     * 
     * @param conditionValueArray
     */
    public void setConditionValue(com.ccssoft.rsas.common.xmlparser.ConditionValue[] conditionValueArray)
    {
        //-- copy array
        _conditionValueList.removeAllElements();
        for (int i = 0; i < conditionValueArray.length; i++) {
            _conditionValueList.addElement(conditionValueArray[i]);
        }
    } //-- void setConditionValue(com.regaltec.rsas.common.xmlparser.ConditionValue) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ConditionValues) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ConditionValues.class, reader);
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
