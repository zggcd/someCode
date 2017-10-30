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
 * Class EvaluationValues.
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationValues implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _evaluationValueList
     */
    private java.util.Vector _evaluationValueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EvaluationValues() {
        super();
        _evaluationValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationValues()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addEvaluationValue
     * 
     * @param vEvaluationValue
     */
    public void addEvaluationValue(com.ccssoft.rsas.common.xmlparser.EvaluationValue vEvaluationValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationValueList.addElement(vEvaluationValue);
    } //-- void addEvaluationValue(com.regaltec.rsas.common.xmlparser.EvaluationValue) 

    /**
     * Method addEvaluationValue
     * 
     * @param index
     * @param vEvaluationValue
     */
    public void addEvaluationValue(int index, com.ccssoft.rsas.common.xmlparser.EvaluationValue vEvaluationValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationValueList.insertElementAt(vEvaluationValue, index);
    } //-- void addEvaluationValue(int, com.regaltec.rsas.common.xmlparser.EvaluationValue) 

    /**
     * Method enumerateEvaluationValue
     */
    public java.util.Enumeration enumerateEvaluationValue()
    {
        return _evaluationValueList.elements();
    } //-- java.util.Enumeration enumerateEvaluationValue() 

    /**
     * Method getEvaluationValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationValue getEvaluationValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.EvaluationValue) _evaluationValueList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationValue getEvaluationValue(int) 

    /**
     * Method getEvaluationValue
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationValue[] getEvaluationValue()
    {
        int size = _evaluationValueList.size();
        com.ccssoft.rsas.common.xmlparser.EvaluationValue[] mArray = new com.ccssoft.rsas.common.xmlparser.EvaluationValue[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.EvaluationValue) _evaluationValueList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationValue[] getEvaluationValue() 

    /**
     * Method getEvaluationValueCount
     */
    public int getEvaluationValueCount()
    {
        return _evaluationValueList.size();
    } //-- int getEvaluationValueCount() 

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
     * Method removeAllEvaluationValue
     */
    public void removeAllEvaluationValue()
    {
        _evaluationValueList.removeAllElements();
    } //-- void removeAllEvaluationValue() 

    /**
     * Method removeEvaluationValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationValue removeEvaluationValue(int index)
    {
        java.lang.Object obj = _evaluationValueList.elementAt(index);
        _evaluationValueList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.EvaluationValue) obj;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationValue removeEvaluationValue(int) 

    /**
     * Method setEvaluationValue
     * 
     * @param index
     * @param vEvaluationValue
     */
    public void setEvaluationValue(int index, com.ccssoft.rsas.common.xmlparser.EvaluationValue vEvaluationValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _evaluationValueList.setElementAt(vEvaluationValue, index);
    } //-- void setEvaluationValue(int, com.regaltec.rsas.common.xmlparser.EvaluationValue) 

    /**
     * Method setEvaluationValue
     * 
     * @param evaluationValueArray
     */
    public void setEvaluationValue(com.ccssoft.rsas.common.xmlparser.EvaluationValue[] evaluationValueArray)
    {
        //-- copy array
        _evaluationValueList.removeAllElements();
        for (int i = 0; i < evaluationValueArray.length; i++) {
            _evaluationValueList.addElement(evaluationValueArray[i]);
        }
    } //-- void setEvaluationValue(com.regaltec.rsas.common.xmlparser.EvaluationValue) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.EvaluationValues) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.EvaluationValues.class, reader);
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
