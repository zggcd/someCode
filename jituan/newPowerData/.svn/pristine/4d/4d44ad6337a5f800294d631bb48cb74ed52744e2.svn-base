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
 * Class FunParameters.
 * 
 * @version $Revision$ $Date$
 */
public class FunParameters implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _funParameterList
     */
    private java.util.Vector _funParameterList;


      //----------------/
     //- Constructors -/
    //----------------/

    public FunParameters() {
        super();
        _funParameterList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.FunParameters()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addFunParameter
     * 
     * @param vFunParameter
     */
    public void addFunParameter(com.ccssoft.rsas.common.xmlparser.FunParameter vFunParameter)
        throws java.lang.IndexOutOfBoundsException
    {
        _funParameterList.addElement(vFunParameter);
    } //-- void addFunParameter(com.regaltec.rsas.common.xmlparser.FunParameter) 

    /**
     * Method addFunParameter
     * 
     * @param index
     * @param vFunParameter
     */
    public void addFunParameter(int index, com.ccssoft.rsas.common.xmlparser.FunParameter vFunParameter)
        throws java.lang.IndexOutOfBoundsException
    {
        _funParameterList.insertElementAt(vFunParameter, index);
    } //-- void addFunParameter(int, com.regaltec.rsas.common.xmlparser.FunParameter) 

    /**
     * Method enumerateFunParameter
     */
    public java.util.Enumeration enumerateFunParameter()
    {
        return _funParameterList.elements();
    } //-- java.util.Enumeration enumerateFunParameter() 

    /**
     * Method getFunParameter
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.FunParameter getFunParameter(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _funParameterList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.FunParameter) _funParameterList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.FunParameter getFunParameter(int) 

    /**
     * Method getFunParameter
     */
    public com.ccssoft.rsas.common.xmlparser.FunParameter[] getFunParameter()
    {
        int size = _funParameterList.size();
        com.ccssoft.rsas.common.xmlparser.FunParameter[] mArray = new com.ccssoft.rsas.common.xmlparser.FunParameter[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.FunParameter) _funParameterList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.FunParameter[] getFunParameter() 

    /**
     * Method getFunParameterCount
     */
    public int getFunParameterCount()
    {
        return _funParameterList.size();
    } //-- int getFunParameterCount() 

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
     * Method removeAllFunParameter
     */
    public void removeAllFunParameter()
    {
        _funParameterList.removeAllElements();
    } //-- void removeAllFunParameter() 

    /**
     * Method removeFunParameter
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.FunParameter removeFunParameter(int index)
    {
        java.lang.Object obj = _funParameterList.elementAt(index);
        _funParameterList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.FunParameter) obj;
    } //-- com.regaltec.rsas.common.xmlparser.FunParameter removeFunParameter(int) 

    /**
     * Method setFunParameter
     * 
     * @param index
     * @param vFunParameter
     */
    public void setFunParameter(int index, com.ccssoft.rsas.common.xmlparser.FunParameter vFunParameter)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _funParameterList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _funParameterList.setElementAt(vFunParameter, index);
    } //-- void setFunParameter(int, com.regaltec.rsas.common.xmlparser.FunParameter) 

    /**
     * Method setFunParameter
     * 
     * @param funParameterArray
     */
    public void setFunParameter(com.ccssoft.rsas.common.xmlparser.FunParameter[] funParameterArray)
    {
        //-- copy array
        _funParameterList.removeAllElements();
        for (int i = 0; i < funParameterArray.length; i++) {
            _funParameterList.addElement(funParameterArray[i]);
        }
    } //-- void setFunParameter(com.regaltec.rsas.common.xmlparser.FunParameter) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.FunParameters) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.FunParameters.class, reader);
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
