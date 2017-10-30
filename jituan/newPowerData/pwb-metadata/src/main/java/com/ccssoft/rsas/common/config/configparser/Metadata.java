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
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Ԫ���ݷ��������в���
 * 
 * @version $Revision$ $Date$
 */
public class Metadata implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���ݿ����������
     */
    private int _maxLinkNumber;

    /**
     * keeps track of state for field: _maxLinkNumber
     */
    private boolean _has_maxLinkNumber;

    /**
     * ���ݿ���С������
     */
    private int _minLinkNumber;

    /**
     * keeps track of state for field: _minLinkNumber
     */
    private boolean _has_minLinkNumber;

    /**
     * ���ݿ�Ĭ�����������������ӳأ�
     */
    private int _defaultLinkNumber;

    /**
     * keeps track of state for field: _defaultLinkNumber
     */
    private boolean _has_defaultLinkNumber;

    /**
     * Field _maxThread
     */
    private int _maxThread;

    /**
     * keeps track of state for field: _maxThread
     */
    private boolean _has_maxThread;

    /**
     * ԭ���ݿ�����
     */
    private java.lang.String _metadataDatabaseType;

    /**
     * Field _databaseDriver
     */
    private java.lang.String _databaseDriver;

    /**
     * Field _databaseURL
     */
    private java.lang.String _databaseURL;

    /**
     * Field _loginUserName
     */
    private java.lang.String _loginUserName;

    /**
     * Field _loginPassword
     */
    private java.lang.String _loginPassword;


      //----------------/
     //- Constructors -/
    //----------------/

    public Metadata() {
        super();
    } //-- com.regaltec.rsas.common.config.configparser.Metadata()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteDefaultLinkNumber
     */
    public void deleteDefaultLinkNumber()
    {
        this._has_defaultLinkNumber= false;
    } //-- void deleteDefaultLinkNumber() 

    /**
     * Method deleteMaxLinkNumber
     */
    public void deleteMaxLinkNumber()
    {
        this._has_maxLinkNumber= false;
    } //-- void deleteMaxLinkNumber() 

    /**
     * Method deleteMaxThread
     */
    public void deleteMaxThread()
    {
        this._has_maxThread= false;
    } //-- void deleteMaxThread() 

    /**
     * Method deleteMinLinkNumber
     */
    public void deleteMinLinkNumber()
    {
        this._has_minLinkNumber= false;
    } //-- void deleteMinLinkNumber() 

    /**
     * Returns the value of field 'databaseDriver'.
     * 
     * @return the value of field 'databaseDriver'.
     */
    public java.lang.String getDatabaseDriver()
    {
        return this._databaseDriver;
    } //-- java.lang.String getDatabaseDriver() 

    /**
     * Returns the value of field 'databaseURL'.
     * 
     * @return the value of field 'databaseURL'.
     */
    public java.lang.String getDatabaseURL()
    {
        return this._databaseURL;
    } //-- java.lang.String getDatabaseURL() 

    /**
     * Returns the value of field 'defaultLinkNumber'. The field
     * 'defaultLinkNumber' has the following description:
     * ���ݿ�Ĭ�����������������ӳأ�
     * 
     * @return the value of field 'defaultLinkNumber'.
     */
    public int getDefaultLinkNumber()
    {
        return this._defaultLinkNumber;
    } //-- int getDefaultLinkNumber() 

    /**
     * Returns the value of field 'loginPassword'.
     * 
     * @return the value of field 'loginPassword'.
     */
    public java.lang.String getLoginPassword()
    {
        return this._loginPassword;
    } //-- java.lang.String getLoginPassword() 

    /**
     * Returns the value of field 'loginUserName'.
     * 
     * @return the value of field 'loginUserName'.
     */
    public java.lang.String getLoginUserName()
    {
        return this._loginUserName;
    } //-- java.lang.String getLoginUserName() 

    /**
     * Returns the value of field 'maxLinkNumber'. The field
     * 'maxLinkNumber' has the following description: ���ݿ����������
     * 
     * @return the value of field 'maxLinkNumber'.
     */
    public int getMaxLinkNumber()
    {
        return this._maxLinkNumber;
    } //-- int getMaxLinkNumber() 

    /**
     * Returns the value of field 'maxThread'.
     * 
     * @return the value of field 'maxThread'.
     */
    public int getMaxThread()
    {
        return this._maxThread;
    } //-- int getMaxThread() 

    /**
     * Returns the value of field 'metadataDatabaseType'. The field
     * 'metadataDatabaseType' has the following description: ԭ���ݿ�����
     * 
     * @return the value of field 'metadataDatabaseType'.
     */
    public java.lang.String getMetadataDatabaseType()
    {
        return this._metadataDatabaseType;
    } //-- java.lang.String getMetadataDatabaseType() 

    /**
     * Returns the value of field 'minLinkNumber'. The field
     * 'minLinkNumber' has the following description: ���ݿ���С������
     * 
     * @return the value of field 'minLinkNumber'.
     */
    public int getMinLinkNumber()
    {
        return this._minLinkNumber;
    } //-- int getMinLinkNumber() 

    /**
     * Method hasDefaultLinkNumber
     */
    public boolean hasDefaultLinkNumber()
    {
        return this._has_defaultLinkNumber;
    } //-- boolean hasDefaultLinkNumber() 

    /**
     * Method hasMaxLinkNumber
     */
    public boolean hasMaxLinkNumber()
    {
        return this._has_maxLinkNumber;
    } //-- boolean hasMaxLinkNumber() 

    /**
     * Method hasMaxThread
     */
    public boolean hasMaxThread()
    {
        return this._has_maxThread;
    } //-- boolean hasMaxThread() 

    /**
     * Method hasMinLinkNumber
     */
    public boolean hasMinLinkNumber()
    {
        return this._has_minLinkNumber;
    } //-- boolean hasMinLinkNumber() 

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
     * Sets the value of field 'databaseDriver'.
     * 
     * @param databaseDriver the value of field 'databaseDriver'.
     */
    public void setDatabaseDriver(java.lang.String databaseDriver)
    {
        this._databaseDriver = databaseDriver;
    } //-- void setDatabaseDriver(java.lang.String) 

    /**
     * Sets the value of field 'databaseURL'.
     * 
     * @param databaseURL the value of field 'databaseURL'.
     */
    public void setDatabaseURL(java.lang.String databaseURL)
    {
        this._databaseURL = databaseURL;
    } //-- void setDatabaseURL(java.lang.String) 

    /**
     * Sets the value of field 'defaultLinkNumber'. The field
     * 'defaultLinkNumber' has the following description:
     * ���ݿ�Ĭ�����������������ӳأ�
     * 
     * @param defaultLinkNumber the value of field
     * 'defaultLinkNumber'.
     */
    public void setDefaultLinkNumber(int defaultLinkNumber)
    {
        this._defaultLinkNumber = defaultLinkNumber;
        this._has_defaultLinkNumber = true;
    } //-- void setDefaultLinkNumber(int) 

    /**
     * Sets the value of field 'loginPassword'.
     * 
     * @param loginPassword the value of field 'loginPassword'.
     */
    public void setLoginPassword(java.lang.String loginPassword)
    {
        this._loginPassword = loginPassword;
    } //-- void setLoginPassword(java.lang.String) 

    /**
     * Sets the value of field 'loginUserName'.
     * 
     * @param loginUserName the value of field 'loginUserName'.
     */
    public void setLoginUserName(java.lang.String loginUserName)
    {
        this._loginUserName = loginUserName;
    } //-- void setLoginUserName(java.lang.String) 

    /**
     * Sets the value of field 'maxLinkNumber'. The field
     * 'maxLinkNumber' has the following description: ���ݿ����������
     * 
     * @param maxLinkNumber the value of field 'maxLinkNumber'.
     */
    public void setMaxLinkNumber(int maxLinkNumber)
    {
        this._maxLinkNumber = maxLinkNumber;
        this._has_maxLinkNumber = true;
    } //-- void setMaxLinkNumber(int) 

    /**
     * Sets the value of field 'maxThread'.
     * 
     * @param maxThread the value of field 'maxThread'.
     */
    public void setMaxThread(int maxThread)
    {
        this._maxThread = maxThread;
        this._has_maxThread = true;
    } //-- void setMaxThread(int) 

    /**
     * Sets the value of field 'metadataDatabaseType'. The field
     * 'metadataDatabaseType' has the following description: ԭ���ݿ�����
     * 
     * @param metadataDatabaseType the value of field
     * 'metadataDatabaseType'.
     */
    public void setMetadataDatabaseType(java.lang.String metadataDatabaseType)
    {
        this._metadataDatabaseType = metadataDatabaseType;
    } //-- void setMetadataDatabaseType(java.lang.String) 

    /**
     * Sets the value of field 'minLinkNumber'. The field
     * 'minLinkNumber' has the following description: ���ݿ���С������
     * 
     * @param minLinkNumber the value of field 'minLinkNumber'.
     */
    public void setMinLinkNumber(int minLinkNumber)
    {
        this._minLinkNumber = minLinkNumber;
        this._has_minLinkNumber = true;
    } //-- void setMinLinkNumber(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.config.configparser.Metadata) Unmarshaller.unmarshal(com.ccssoft.rsas.common.config.configparser.Metadata.class, reader);
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
