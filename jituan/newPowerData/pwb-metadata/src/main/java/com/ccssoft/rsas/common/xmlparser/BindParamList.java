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
 * Class BindParamList.
 * 
 * @version $Revision$ $Date$
 */
public class BindParamList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _bindProcedureParamList
     */
    private java.util.Vector _bindProcedureParamList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BindParamList() {
        super();
        _bindProcedureParamList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.BindParamList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addBindProcedureParam
     * 
     * @param vBindProcedureParam
     */
    public void addBindProcedureParam(com.ccssoft.rsas.common.xmlparser.BindProcedureParam vBindProcedureParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _bindProcedureParamList.addElement(vBindProcedureParam);
    } //-- void addBindProcedureParam(com.regaltec.rsas.common.xmlparser.BindProcedureParam) 

    /**
     * Method addBindProcedureParam
     * 
     * @param index
     * @param vBindProcedureParam
     */
    public void addBindProcedureParam(int index, com.ccssoft.rsas.common.xmlparser.BindProcedureParam vBindProcedureParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _bindProcedureParamList.insertElementAt(vBindProcedureParam, index);
    } //-- void addBindProcedureParam(int, com.regaltec.rsas.common.xmlparser.BindProcedureParam) 

    /**
     * Method enumerateBindProcedureParam
     */
    public java.util.Enumeration enumerateBindProcedureParam()
    {
        return _bindProcedureParamList.elements();
    } //-- java.util.Enumeration enumerateBindProcedureParam() 

    /**
     * Method getBindProcedureParam
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.BindProcedureParam getBindProcedureParam(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _bindProcedureParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.BindProcedureParam) _bindProcedureParamList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.BindProcedureParam getBindProcedureParam(int) 

    /**
     * Method getBindProcedureParam
     */
    public com.ccssoft.rsas.common.xmlparser.BindProcedureParam[] getBindProcedureParam()
    {
        int size = _bindProcedureParamList.size();
        com.ccssoft.rsas.common.xmlparser.BindProcedureParam[] mArray = new com.ccssoft.rsas.common.xmlparser.BindProcedureParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.BindProcedureParam) _bindProcedureParamList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.BindProcedureParam[] getBindProcedureParam() 

    /**
     * Method getBindProcedureParamCount
     */
    public int getBindProcedureParamCount()
    {
        return _bindProcedureParamList.size();
    } //-- int getBindProcedureParamCount() 

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
     * Method removeAllBindProcedureParam
     */
    public void removeAllBindProcedureParam()
    {
        _bindProcedureParamList.removeAllElements();
    } //-- void removeAllBindProcedureParam() 

    /**
     * Method removeBindProcedureParam
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.BindProcedureParam removeBindProcedureParam(int index)
    {
        java.lang.Object obj = _bindProcedureParamList.elementAt(index);
        _bindProcedureParamList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.BindProcedureParam) obj;
    } //-- com.regaltec.rsas.common.xmlparser.BindProcedureParam removeBindProcedureParam(int) 

    /**
     * Method setBindProcedureParam
     * 
     * @param index
     * @param vBindProcedureParam
     */
    public void setBindProcedureParam(int index, com.ccssoft.rsas.common.xmlparser.BindProcedureParam vBindProcedureParam)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _bindProcedureParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _bindProcedureParamList.setElementAt(vBindProcedureParam, index);
    } //-- void setBindProcedureParam(int, com.regaltec.rsas.common.xmlparser.BindProcedureParam) 

    /**
     * Method setBindProcedureParam
     * 
     * @param bindProcedureParamArray
     */
    public void setBindProcedureParam(com.ccssoft.rsas.common.xmlparser.BindProcedureParam[] bindProcedureParamArray)
    {
        //-- copy array
        _bindProcedureParamList.removeAllElements();
        for (int i = 0; i < bindProcedureParamArray.length; i++) {
            _bindProcedureParamList.addElement(bindProcedureParamArray[i]);
        }
    } //-- void setBindProcedureParam(com.regaltec.rsas.common.xmlparser.BindProcedureParam) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.BindParamList) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.BindParamList.class, reader);
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
