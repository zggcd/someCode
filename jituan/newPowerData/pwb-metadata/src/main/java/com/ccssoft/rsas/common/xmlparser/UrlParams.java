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
 * �ⲿWebϵͳ��URL�̶�����
 * 
 * @version $Revision$ $Date$
 */
public class UrlParams implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _urlParamList
     */
    private java.util.Vector _urlParamList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UrlParams() {
        super();
        _urlParamList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.UrlParams()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addUrlParam
     * 
     * @param vUrlParam
     */
    public void addUrlParam(com.ccssoft.rsas.common.xmlparser.UrlParam vUrlParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _urlParamList.addElement(vUrlParam);
    } //-- void addUrlParam(com.regaltec.rsas.common.xmlparser.UrlParam) 

    /**
     * Method addUrlParam
     * 
     * @param index
     * @param vUrlParam
     */
    public void addUrlParam(int index, com.ccssoft.rsas.common.xmlparser.UrlParam vUrlParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _urlParamList.insertElementAt(vUrlParam, index);
    } //-- void addUrlParam(int, com.regaltec.rsas.common.xmlparser.UrlParam) 

    /**
     * Method enumerateUrlParam
     */
    public java.util.Enumeration enumerateUrlParam()
    {
        return _urlParamList.elements();
    } //-- java.util.Enumeration enumerateUrlParam() 

    /**
     * Method getUrlParam
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.UrlParam getUrlParam(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _urlParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.UrlParam) _urlParamList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.UrlParam getUrlParam(int) 

    /**
     * Method getUrlParam
     */
    public com.ccssoft.rsas.common.xmlparser.UrlParam[] getUrlParam()
    {
        int size = _urlParamList.size();
        com.ccssoft.rsas.common.xmlparser.UrlParam[] mArray = new com.ccssoft.rsas.common.xmlparser.UrlParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.UrlParam) _urlParamList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.UrlParam[] getUrlParam() 

    /**
     * Method getUrlParamCount
     */
    public int getUrlParamCount()
    {
        return _urlParamList.size();
    } //-- int getUrlParamCount() 

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
     * Method removeAllUrlParam
     */
    public void removeAllUrlParam()
    {
        _urlParamList.removeAllElements();
    } //-- void removeAllUrlParam() 

    /**
     * Method removeUrlParam
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.UrlParam removeUrlParam(int index)
    {
        java.lang.Object obj = _urlParamList.elementAt(index);
        _urlParamList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.UrlParam) obj;
    } //-- com.regaltec.rsas.common.xmlparser.UrlParam removeUrlParam(int) 

    /**
     * Method setUrlParam
     * 
     * @param index
     * @param vUrlParam
     */
    public void setUrlParam(int index, com.ccssoft.rsas.common.xmlparser.UrlParam vUrlParam)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _urlParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _urlParamList.setElementAt(vUrlParam, index);
    } //-- void setUrlParam(int, com.regaltec.rsas.common.xmlparser.UrlParam) 

    /**
     * Method setUrlParam
     * 
     * @param urlParamArray
     */
    public void setUrlParam(com.ccssoft.rsas.common.xmlparser.UrlParam[] urlParamArray)
    {
        //-- copy array
        _urlParamList.removeAllElements();
        for (int i = 0; i < urlParamArray.length; i++) {
            _urlParamList.addElement(urlParamArray[i]);
        }
    } //-- void setUrlParam(com.regaltec.rsas.common.xmlparser.UrlParam) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.UrlParams) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.UrlParams.class, reader);
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
