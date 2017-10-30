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
 * �ⲿWebӦ��ϵͳ����
 * 
 * @version $Revision$ $Date$
 */
public class WebApplications implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �ⲿWebӦ��ϵͳ
     */
    private java.util.Vector _webApplicationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public WebApplications() {
        super();
        _webApplicationList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.WebApplications()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addWebApplication
     * 
     * @param vWebApplication
     */
    public void addWebApplication(com.ccssoft.rsas.common.xmlparser.WebApplication vWebApplication)
        throws java.lang.IndexOutOfBoundsException
    {
        _webApplicationList.addElement(vWebApplication);
    } //-- void addWebApplication(com.regaltec.rsas.common.xmlparser.WebApplication) 

    /**
     * Method addWebApplication
     * 
     * @param index
     * @param vWebApplication
     */
    public void addWebApplication(int index, com.ccssoft.rsas.common.xmlparser.WebApplication vWebApplication)
        throws java.lang.IndexOutOfBoundsException
    {
        _webApplicationList.insertElementAt(vWebApplication, index);
    } //-- void addWebApplication(int, com.regaltec.rsas.common.xmlparser.WebApplication) 

    /**
     * Method enumerateWebApplication
     */
    public java.util.Enumeration enumerateWebApplication()
    {
        return _webApplicationList.elements();
    } //-- java.util.Enumeration enumerateWebApplication() 

    /**
     * Method getWebApplication
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.WebApplication getWebApplication(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _webApplicationList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.WebApplication) _webApplicationList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.WebApplication getWebApplication(int) 

    /**
     * Method getWebApplication
     */
    public com.ccssoft.rsas.common.xmlparser.WebApplication[] getWebApplication()
    {
        int size = _webApplicationList.size();
        com.ccssoft.rsas.common.xmlparser.WebApplication[] mArray = new com.ccssoft.rsas.common.xmlparser.WebApplication[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.WebApplication) _webApplicationList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.WebApplication[] getWebApplication() 

    /**
     * Method getWebApplicationCount
     */
    public int getWebApplicationCount()
    {
        return _webApplicationList.size();
    } //-- int getWebApplicationCount() 

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
     * Method removeAllWebApplication
     */
    public void removeAllWebApplication()
    {
        _webApplicationList.removeAllElements();
    } //-- void removeAllWebApplication() 

    /**
     * Method removeWebApplication
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.WebApplication removeWebApplication(int index)
    {
        java.lang.Object obj = _webApplicationList.elementAt(index);
        _webApplicationList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.WebApplication) obj;
    } //-- com.regaltec.rsas.common.xmlparser.WebApplication removeWebApplication(int) 

    /**
     * Method setWebApplication
     * 
     * @param index
     * @param vWebApplication
     */
    public void setWebApplication(int index, com.ccssoft.rsas.common.xmlparser.WebApplication vWebApplication)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _webApplicationList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _webApplicationList.setElementAt(vWebApplication, index);
    } //-- void setWebApplication(int, com.regaltec.rsas.common.xmlparser.WebApplication) 

    /**
     * Method setWebApplication
     * 
     * @param webApplicationArray
     */
    public void setWebApplication(com.ccssoft.rsas.common.xmlparser.WebApplication[] webApplicationArray)
    {
        //-- copy array
        _webApplicationList.removeAllElements();
        for (int i = 0; i < webApplicationArray.length; i++) {
            _webApplicationList.addElement(webApplicationArray[i]);
        }
    } //-- void setWebApplication(com.regaltec.rsas.common.xmlparser.WebApplication) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.WebApplications) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.WebApplications.class, reader);
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
