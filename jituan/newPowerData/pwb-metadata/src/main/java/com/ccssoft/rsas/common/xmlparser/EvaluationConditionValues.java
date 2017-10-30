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
 * Class EvaluationConditionValues.
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationConditionValues implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _evaluationConditionValueList
     */
    private java.util.Vector _evaluationConditionValueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EvaluationConditionValues() {
        super();
        _evaluationConditionValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationConditionValues()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addEvaluationConditionValue
     * 
     * @param vEvaluationConditionValue
     */
    public void addEvaluationConditionValue(com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue vEvaluationConditionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationConditionValueList.addElement(vEvaluationConditionValue);
    } //-- void addEvaluationConditionValue(com.regaltec.rsas.common.xmlparser.EvaluationConditionValue) 

    /**
     * Method addEvaluationConditionValue
     * 
     * @param index
     * @param vEvaluationConditionValue
     */
    public void addEvaluationConditionValue(int index, com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue vEvaluationConditionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationConditionValueList.insertElementAt(vEvaluationConditionValue, index);
    } //-- void addEvaluationConditionValue(int, com.regaltec.rsas.common.xmlparser.EvaluationConditionValue) 

    /**
     * Method enumerateEvaluationConditionValue
     */
    public java.util.Enumeration enumerateEvaluationConditionValue()
    {
        return _evaluationConditionValueList.elements();
    } //-- java.util.Enumeration enumerateEvaluationConditionValue() 

    /**
     * Method getEvaluationConditionValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue getEvaluationConditionValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationConditionValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue) _evaluationConditionValueList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationConditionValue getEvaluationConditionValue(int) 

    /**
     * Method getEvaluationConditionValue
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue[] getEvaluationConditionValue()
    {
        int size = _evaluationConditionValueList.size();
        com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue[] mArray = new com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue) _evaluationConditionValueList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationConditionValue[] getEvaluationConditionValue() 

    /**
     * Method getEvaluationConditionValueCount
     */
    public int getEvaluationConditionValueCount()
    {
        return _evaluationConditionValueList.size();
    } //-- int getEvaluationConditionValueCount() 

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
     * Method removeAllEvaluationConditionValue
     */
    public void removeAllEvaluationConditionValue()
    {
        _evaluationConditionValueList.removeAllElements();
    } //-- void removeAllEvaluationConditionValue() 

    /**
     * Method removeEvaluationConditionValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue removeEvaluationConditionValue(int index)
    {
        java.lang.Object obj = _evaluationConditionValueList.elementAt(index);
        _evaluationConditionValueList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue) obj;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationConditionValue removeEvaluationConditionValue(int) 

    /**
     * Method setEvaluationConditionValue
     * 
     * @param index
     * @param vEvaluationConditionValue
     */
    public void setEvaluationConditionValue(int index, com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue vEvaluationConditionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationConditionValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _evaluationConditionValueList.setElementAt(vEvaluationConditionValue, index);
    } //-- void setEvaluationConditionValue(int, com.regaltec.rsas.common.xmlparser.EvaluationConditionValue) 

    /**
     * Method setEvaluationConditionValue
     * 
     * @param evaluationConditionValueArray
     */
    public void setEvaluationConditionValue(com.ccssoft.rsas.common.xmlparser.EvaluationConditionValue[] evaluationConditionValueArray)
    {
        //-- copy array
        _evaluationConditionValueList.removeAllElements();
        for (int i = 0; i < evaluationConditionValueArray.length; i++) {
            _evaluationConditionValueList.addElement(evaluationConditionValueArray[i]);
        }
    } //-- void setEvaluationConditionValue(com.regaltec.rsas.common.xmlparser.EvaluationConditionValue) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.EvaluationConditionValues) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.EvaluationConditionValues.class, reader);
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
