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
 * Class CompareMeasure.
 * 
 * @version $Revision$ $Date$
 */
public class CompareMeasure implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _measureItemID
     */
    private java.lang.String _measureItemID;

    /**
     * Field _functionID
     */
    private java.lang.String _functionID;

    /**
     * Field _funcExpression
     */
    private java.lang.String _funcExpression;

    /**
     * Field _funParamValueList
     */
    private java.util.Vector _funParamValueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CompareMeasure() {
        super();
        _funParamValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.CompareMeasure()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addFunParamValue
     * 
     * @param vFunParamValue
     */
    public void addFunParamValue(com.ccssoft.rsas.common.xmlparser.FunParamValue vFunParamValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _funParamValueList.addElement(vFunParamValue);
    } //-- void addFunParamValue(com.regaltec.rsas.common.xmlparser.FunParamValue) 

    /**
     * Method addFunParamValue
     * 
     * @param index
     * @param vFunParamValue
     */
    public void addFunParamValue(int index, com.ccssoft.rsas.common.xmlparser.FunParamValue vFunParamValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _funParamValueList.insertElementAt(vFunParamValue, index);
    } //-- void addFunParamValue(int, com.regaltec.rsas.common.xmlparser.FunParamValue) 

    /**
     * Method enumerateFunParamValue
     */
    public java.util.Enumeration enumerateFunParamValue()
    {
        return _funParamValueList.elements();
    } //-- java.util.Enumeration enumerateFunParamValue() 

    /**
     * Method getFunParamValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.FunParamValue getFunParamValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _funParamValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.FunParamValue) _funParamValueList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.FunParamValue getFunParamValue(int) 

    /**
     * Method getFunParamValue
     */
    public com.ccssoft.rsas.common.xmlparser.FunParamValue[] getFunParamValue()
    {
        int size = _funParamValueList.size();
        com.ccssoft.rsas.common.xmlparser.FunParamValue[] mArray = new com.ccssoft.rsas.common.xmlparser.FunParamValue[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.FunParamValue) _funParamValueList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.FunParamValue[] getFunParamValue() 

    /**
     * Method getFunParamValueCount
     */
    public int getFunParamValueCount()
    {
        return _funParamValueList.size();
    } //-- int getFunParamValueCount() 

    /**
     * Returns the value of field 'funcExpression'.
     * 
     * @return the value of field 'funcExpression'.
     */
    public java.lang.String getFuncExpression()
    {
        return this._funcExpression;
    } //-- java.lang.String getFuncExpression() 

    /**
     * Returns the value of field 'functionID'.
     * 
     * @return the value of field 'functionID'.
     */
    public java.lang.String getFunctionID()
    {
        return this._functionID;
    } //-- java.lang.String getFunctionID() 

    /**
     * Returns the value of field 'measureItemID'.
     * 
     * @return the value of field 'measureItemID'.
     */
    public java.lang.String getMeasureItemID()
    {
        return this._measureItemID;
    } //-- java.lang.String getMeasureItemID() 

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
     * Method removeAllFunParamValue
     */
    public void removeAllFunParamValue()
    {
        _funParamValueList.removeAllElements();
    } //-- void removeAllFunParamValue() 

    /**
     * Method removeFunParamValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.FunParamValue removeFunParamValue(int index)
    {
        java.lang.Object obj = _funParamValueList.elementAt(index);
        _funParamValueList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.FunParamValue) obj;
    } //-- com.regaltec.rsas.common.xmlparser.FunParamValue removeFunParamValue(int) 

    /**
     * Method setFunParamValue
     * 
     * @param index
     * @param vFunParamValue
     */
    public void setFunParamValue(int index, com.ccssoft.rsas.common.xmlparser.FunParamValue vFunParamValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _funParamValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _funParamValueList.setElementAt(vFunParamValue, index);
    } //-- void setFunParamValue(int, com.regaltec.rsas.common.xmlparser.FunParamValue) 

    /**
     * Method setFunParamValue
     * 
     * @param funParamValueArray
     */
    public void setFunParamValue(com.ccssoft.rsas.common.xmlparser.FunParamValue[] funParamValueArray)
    {
        //-- copy array
        _funParamValueList.removeAllElements();
        for (int i = 0; i < funParamValueArray.length; i++) {
            _funParamValueList.addElement(funParamValueArray[i]);
        }
    } //-- void setFunParamValue(com.regaltec.rsas.common.xmlparser.FunParamValue) 

    /**
     * Sets the value of field 'funcExpression'.
     * 
     * @param funcExpression the value of field 'funcExpression'.
     */
    public void setFuncExpression(java.lang.String funcExpression)
    {
        this._funcExpression = funcExpression;
    } //-- void setFuncExpression(java.lang.String) 

    /**
     * Sets the value of field 'functionID'.
     * 
     * @param functionID the value of field 'functionID'.
     */
    public void setFunctionID(java.lang.String functionID)
    {
        this._functionID = functionID;
    } //-- void setFunctionID(java.lang.String) 

    /**
     * Sets the value of field 'measureItemID'.
     * 
     * @param measureItemID the value of field 'measureItemID'.
     */
    public void setMeasureItemID(java.lang.String measureItemID)
    {
        this._measureItemID = measureItemID;
    } //-- void setMeasureItemID(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.CompareMeasure) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.CompareMeasure.class, reader);
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
