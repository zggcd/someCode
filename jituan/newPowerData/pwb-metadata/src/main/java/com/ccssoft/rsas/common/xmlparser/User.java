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
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * �û�
 * 
 * @version $Revision$ $Date$
 */
public class User implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _loginName
     */
    private java.lang.String _loginName;

    /**
     * Field _password
     */
    private java.lang.String _password;

    /**
     * Field _phone
     */
    private java.lang.String _phone;

    /**
     * Field _mobile
     */
    private java.lang.String _mobile;

    /**
     * Field _email
     */
    private java.lang.String _email;

    /**
     * Ա������
     */
    private java.lang.String _employeeID;

    /**
     * ��һ���޸������ʱ��
     */
    private java.lang.String _lastModifyPswTime;

    /**
     * ��һ�ε�¼ʱ��
     */
    private java.lang.String _lastLoginTime;

    /**
     * �����¼UID
     */
    private java.lang.String _loginUID;

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _desc
     */
    private java.lang.String _desc;

    /**
     * Field _usrOrgPermissions
     */
    private com.ccssoft.rsas.common.xmlparser.UsrOrgPermissions _usrOrgPermissions;

    /**
     * Field _usrGroupPermissions
     */
    private com.ccssoft.rsas.common.xmlparser.UsrGroupPermissions _usrGroupPermissions;

    /**
     * Field _operPermissions
     */
    private com.ccssoft.rsas.common.xmlparser.OperPermissions _operPermissions;

    /**
     * Field _dataPermissions
     */
    private com.ccssoft.rsas.common.xmlparser.DataPermissions _dataPermissions;

    /**
     * Field _dimItemPermissions
     */
    private com.ccssoft.rsas.common.xmlparser.DimItemPermissions _dimItemPermissions;


      //----------------/
     //- Constructors -/
    //----------------/

    public User() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.User()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataPermissions'.
     * 
     * @return the value of field 'dataPermissions'.
     */
    public com.ccssoft.rsas.common.xmlparser.DataPermissions getDataPermissions()
    {
        return this._dataPermissions;
    } //-- com.regaltec.rsas.common.xmlparser.DataPermissions getDataPermissions() 

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'desc'.
     */
    public java.lang.String getDesc()
    {
        return this._desc;
    } //-- java.lang.String getDesc() 

    /**
     * Returns the value of field 'dimItemPermissions'.
     * 
     * @return the value of field 'dimItemPermissions'.
     */
    public com.ccssoft.rsas.common.xmlparser.DimItemPermissions getDimItemPermissions()
    {
        return this._dimItemPermissions;
    } //-- com.regaltec.rsas.common.xmlparser.DimItemPermissions getDimItemPermissions() 

    /**
     * Returns the value of field 'email'.
     * 
     * @return the value of field 'email'.
     */
    public java.lang.String getEmail()
    {
        return this._email;
    } //-- java.lang.String getEmail() 

    /**
     * Returns the value of field 'employeeID'. The field
     * 'employeeID' has the following description: Ա������
     * 
     * @return the value of field 'employeeID'.
     */
    public java.lang.String getEmployeeID()
    {
        return this._employeeID;
    } //-- java.lang.String getEmployeeID() 

    /**
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

    /**
     * Returns the value of field 'lastLoginTime'. The field
     * 'lastLoginTime' has the following description: ��һ�ε�¼ʱ��
     * 
     * @return the value of field 'lastLoginTime'.
     */
    public java.lang.String getLastLoginTime()
    {
        return this._lastLoginTime;
    } //-- java.lang.String getLastLoginTime() 

    /**
     * Returns the value of field 'lastModifyPswTime'. The field
     * 'lastModifyPswTime' has the following description:
     * ��һ���޸������ʱ��
     * 
     * @return the value of field 'lastModifyPswTime'.
     */
    public java.lang.String getLastModifyPswTime()
    {
        return this._lastModifyPswTime;
    } //-- java.lang.String getLastModifyPswTime() 

    /**
     * Returns the value of field 'loginName'.
     * 
     * @return the value of field 'loginName'.
     */
    public java.lang.String getLoginName()
    {
        return this._loginName;
    } //-- java.lang.String getLoginName() 

    /**
     * Returns the value of field 'loginUID'. The field 'loginUID'
     * has the following description: �����¼UID
     * 
     * @return the value of field 'loginUID'.
     */
    public java.lang.String getLoginUID()
    {
        return this._loginUID;
    } //-- java.lang.String getLoginUID() 

    /**
     * Returns the value of field 'mobile'.
     * 
     * @return the value of field 'mobile'.
     */
    public java.lang.String getMobile()
    {
        return this._mobile;
    } //-- java.lang.String getMobile() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'operPermissions'.
     * 
     * @return the value of field 'operPermissions'.
     */
    public com.ccssoft.rsas.common.xmlparser.OperPermissions getOperPermissions()
    {
        return this._operPermissions;
    } //-- com.regaltec.rsas.common.xmlparser.OperPermissions getOperPermissions() 

    /**
     * Returns the value of field 'password'.
     * 
     * @return the value of field 'password'.
     */
    public java.lang.String getPassword()
    {
        return this._password;
    } //-- java.lang.String getPassword() 

    /**
     * Returns the value of field 'phone'.
     * 
     * @return the value of field 'phone'.
     */
    public java.lang.String getPhone()
    {
        return this._phone;
    } //-- java.lang.String getPhone() 

    /**
     * Returns the value of field 'usrGroupPermissions'.
     * 
     * @return the value of field 'usrGroupPermissions'.
     */
    public com.ccssoft.rsas.common.xmlparser.UsrGroupPermissions getUsrGroupPermissions()
    {
        return this._usrGroupPermissions;
    } //-- com.regaltec.rsas.common.xmlparser.UsrGroupPermissions getUsrGroupPermissions() 

    /**
     * Returns the value of field 'usrOrgPermissions'.
     * 
     * @return the value of field 'usrOrgPermissions'.
     */
    public com.ccssoft.rsas.common.xmlparser.UsrOrgPermissions getUsrOrgPermissions()
    {
        return this._usrOrgPermissions;
    } //-- com.regaltec.rsas.common.xmlparser.UsrOrgPermissions getUsrOrgPermissions() 

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
     * Sets the value of field 'dataPermissions'.
     * 
     * @param dataPermissions the value of field 'dataPermissions'.
     */
    public void setDataPermissions(com.ccssoft.rsas.common.xmlparser.DataPermissions dataPermissions)
    {
        this._dataPermissions = dataPermissions;
    } //-- void setDataPermissions(com.regaltec.rsas.common.xmlparser.DataPermissions) 

    /**
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(java.lang.String desc)
    {
        this._desc = desc;
    } //-- void setDesc(java.lang.String) 

    /**
     * Sets the value of field 'dimItemPermissions'.
     * 
     * @param dimItemPermissions the value of field
     * 'dimItemPermissions'.
     */
    public void setDimItemPermissions(com.ccssoft.rsas.common.xmlparser.DimItemPermissions dimItemPermissions)
    {
        this._dimItemPermissions = dimItemPermissions;
    } //-- void setDimItemPermissions(com.regaltec.rsas.common.xmlparser.DimItemPermissions) 

    /**
     * Sets the value of field 'email'.
     * 
     * @param email the value of field 'email'.
     */
    public void setEmail(java.lang.String email)
    {
        this._email = email;
    } //-- void setEmail(java.lang.String) 

    /**
     * Sets the value of field 'employeeID'. The field 'employeeID'
     * has the following description: Ա������
     * 
     * @param employeeID the value of field 'employeeID'.
     */
    public void setEmployeeID(java.lang.String employeeID)
    {
        this._employeeID = employeeID;
    } //-- void setEmployeeID(java.lang.String) 

    /**
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

    /**
     * Sets the value of field 'lastLoginTime'. The field
     * 'lastLoginTime' has the following description: ��һ�ε�¼ʱ��
     * 
     * @param lastLoginTime the value of field 'lastLoginTime'.
     */
    public void setLastLoginTime(java.lang.String lastLoginTime)
    {
        this._lastLoginTime = lastLoginTime;
    } //-- void setLastLoginTime(java.lang.String) 

    /**
     * Sets the value of field 'lastModifyPswTime'. The field
     * 'lastModifyPswTime' has the following description:
     * ��һ���޸������ʱ��
     * 
     * @param lastModifyPswTime the value of field
     * 'lastModifyPswTime'.
     */
    public void setLastModifyPswTime(java.lang.String lastModifyPswTime)
    {
        this._lastModifyPswTime = lastModifyPswTime;
    } //-- void setLastModifyPswTime(java.lang.String) 

    /**
     * Sets the value of field 'loginName'.
     * 
     * @param loginName the value of field 'loginName'.
     */
    public void setLoginName(java.lang.String loginName)
    {
        this._loginName = loginName;
    } //-- void setLoginName(java.lang.String) 

    /**
     * Sets the value of field 'loginUID'. The field 'loginUID' has
     * the following description: �����¼UID
     * 
     * @param loginUID the value of field 'loginUID'.
     */
    public void setLoginUID(java.lang.String loginUID)
    {
        this._loginUID = loginUID;
    } //-- void setLoginUID(java.lang.String) 

    /**
     * Sets the value of field 'mobile'.
     * 
     * @param mobile the value of field 'mobile'.
     */
    public void setMobile(java.lang.String mobile)
    {
        this._mobile = mobile;
    } //-- void setMobile(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'operPermissions'.
     * 
     * @param operPermissions the value of field 'operPermissions'.
     */
    public void setOperPermissions(com.ccssoft.rsas.common.xmlparser.OperPermissions operPermissions)
    {
        this._operPermissions = operPermissions;
    } //-- void setOperPermissions(com.regaltec.rsas.common.xmlparser.OperPermissions) 

    /**
     * Sets the value of field 'password'.
     * 
     * @param password the value of field 'password'.
     */
    public void setPassword(java.lang.String password)
    {
        this._password = password;
    } //-- void setPassword(java.lang.String) 

    /**
     * Sets the value of field 'phone'.
     * 
     * @param phone the value of field 'phone'.
     */
    public void setPhone(java.lang.String phone)
    {
        this._phone = phone;
    } //-- void setPhone(java.lang.String) 

    /**
     * Sets the value of field 'usrGroupPermissions'.
     * 
     * @param usrGroupPermissions the value of field
     * 'usrGroupPermissions'.
     */
    public void setUsrGroupPermissions(com.ccssoft.rsas.common.xmlparser.UsrGroupPermissions usrGroupPermissions)
    {
        this._usrGroupPermissions = usrGroupPermissions;
    } //-- void setUsrGroupPermissions(com.regaltec.rsas.common.xmlparser.UsrGroupPermissions) 

    /**
     * Sets the value of field 'usrOrgPermissions'.
     * 
     * @param usrOrgPermissions the value of field
     * 'usrOrgPermissions'.
     */
    public void setUsrOrgPermissions(com.ccssoft.rsas.common.xmlparser.UsrOrgPermissions usrOrgPermissions)
    {
        this._usrOrgPermissions = usrOrgPermissions;
    } //-- void setUsrOrgPermissions(com.regaltec.rsas.common.xmlparser.UsrOrgPermissions) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.User) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.User.class, reader);
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
