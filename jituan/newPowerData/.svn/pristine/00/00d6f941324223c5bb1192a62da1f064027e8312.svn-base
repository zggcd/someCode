/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.config.configparser;

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
 * WebӦ�õ����в���
 * 
 * @version $Revision$ $Date$
 */
public class WebApplication implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _webAppURL
     */
    private java.lang.String _webAppURL;

    /**
     * �������ö��Ӧ�÷����URL����Ҫ��Ϊ�˽������Ⱥ������
     */
    private java.util.Vector _appURLList;


      //----------------/
     //- Constructors -/
    //----------------/

    public WebApplication() {
        super();
        _appURLList = new Vector();
    } //-- com.regaltec.rsas.common.config.configparser.WebApplication()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAppURL
     * 
     * @param vAppURL
     */
    public void addAppURL(com.ccssoft.rsas.common.config.configparser.AppURL vAppURL)
        throws java.lang.IndexOutOfBoundsException
    {
        _appURLList.addElement(vAppURL);
    } //-- void addAppURL(com.regaltec.rsas.common.config.configparser.AppURL) 

    /**
     * Method addAppURL
     * 
     * @param index
     * @param vAppURL
     */
    public void addAppURL(int index, com.ccssoft.rsas.common.config.configparser.AppURL vAppURL)
        throws java.lang.IndexOutOfBoundsException
    {
        _appURLList.insertElementAt(vAppURL, index);
    } //-- void addAppURL(int, com.regaltec.rsas.common.config.configparser.AppURL) 

    /**
     * Method enumerateAppURL
     */
    public java.util.Enumeration enumerateAppURL()
    {
        return _appURLList.elements();
    } //-- java.util.Enumeration enumerateAppURL() 

    /**
     * Method getAppURL
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.config.configparser.AppURL getAppURL(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _appURLList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.config.configparser.AppURL) _appURLList.elementAt(index);
    } //-- com.regaltec.rsas.common.config.configparser.AppURL getAppURL(int) 

    /**
     * Method getAppURL
     */
    public com.ccssoft.rsas.common.config.configparser.AppURL[] getAppURL()
    {
        int size = _appURLList.size();
        com.ccssoft.rsas.common.config.configparser.AppURL[] mArray = new com.ccssoft.rsas.common.config.configparser.AppURL[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.config.configparser.AppURL) _appURLList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.config.configparser.AppURL[] getAppURL() 

    /**
     * Method getAppURLCount
     */
    public int getAppURLCount()
    {
        return _appURLList.size();
    } //-- int getAppURLCount() 

    /**
     * Returns the value of field 'webAppURL'.
     * 
     * @return the value of field 'webAppURL'.
     */
    public java.lang.String getWebAppURL()
    {
        return this._webAppURL;
    } //-- java.lang.String getWebAppURL() 

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
     * Method removeAllAppURL
     */
    public void removeAllAppURL()
    {
        _appURLList.removeAllElements();
    } //-- void removeAllAppURL() 

    /**
     * Method removeAppURL
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.config.configparser.AppURL removeAppURL(int index)
    {
        java.lang.Object obj = _appURLList.elementAt(index);
        _appURLList.removeElementAt(index);
        return (com.ccssoft.rsas.common.config.configparser.AppURL) obj;
    } //-- com.regaltec.rsas.common.config.configparser.AppURL removeAppURL(int) 

    /**
     * Method setAppURL
     * 
     * @param index
     * @param vAppURL
     */
    public void setAppURL(int index, com.ccssoft.rsas.common.config.configparser.AppURL vAppURL)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _appURLList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _appURLList.setElementAt(vAppURL, index);
    } //-- void setAppURL(int, com.regaltec.rsas.common.config.configparser.AppURL) 

    /**
     * Method setAppURL
     * 
     * @param appURLArray
     */
    public void setAppURL(com.ccssoft.rsas.common.config.configparser.AppURL[] appURLArray)
    {
        //-- copy array
        _appURLList.removeAllElements();
        for (int i = 0; i < appURLArray.length; i++) {
            _appURLList.addElement(appURLArray[i]);
        }
    } //-- void setAppURL(com.regaltec.rsas.common.config.configparser.AppURL) 

    /**
     * Sets the value of field 'webAppURL'.
     * 
     * @param webAppURL the value of field 'webAppURL'.
     */
    public void setWebAppURL(java.lang.String webAppURL)
    {
        this._webAppURL = webAppURL;
    } //-- void setWebAppURL(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.config.configparser.WebApplication) Unmarshaller.unmarshal(com.ccssoft.rsas.common.config.configparser.WebApplication.class, reader);
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
