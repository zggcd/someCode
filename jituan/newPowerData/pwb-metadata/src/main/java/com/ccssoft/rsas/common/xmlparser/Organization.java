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
 * ��֯����
 * 
 * @version $Revision$ $Date$
 */
public class Organization implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _treeCode
     */
    private java.lang.String _treeCode;

    /**
     * ��λ����
     */
    private java.lang.String _organizationCode;

    /**
     * Field _parendID
     */
    private java.lang.String _parendID;

    /**
     * Field _phone
     */
    private java.lang.String _phone;

    /**
     * Field _fax
     */
    private java.lang.String _fax;

    /**
     * Field _email
     */
    private java.lang.String _email;

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
     * Field _organizations
     */
    private com.ccssoft.rsas.common.xmlparser.Organizations _organizations;

    /**
     * Field _operPermissions
     */
    private com.ccssoft.rsas.common.xmlparser.OperPermissions _operPermissions;

    /**
     * Field _dataAuthorityDivs
     */
    private com.ccssoft.rsas.common.xmlparser.DataAuthorityDivs _dataAuthorityDivs;

    /**
     * Field _dimItemPermissions
     */
    private com.ccssoft.rsas.common.xmlparser.DimItemPermissions _dimItemPermissions;


      //----------------/
     //- Constructors -/
    //----------------/

    public Organization() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Organization()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataAuthorityDivs'.
     * 
     * @return the value of field 'dataAuthorityDivs'.
     */
    public com.ccssoft.rsas.common.xmlparser.DataAuthorityDivs getDataAuthorityDivs()
    {
        return this._dataAuthorityDivs;
    } //-- com.regaltec.rsas.common.xmlparser.DataAuthorityDivs getDataAuthorityDivs() 

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
     * Returns the value of field 'fax'.
     * 
     * @return the value of field 'fax'.
     */
    public java.lang.String getFax()
    {
        return this._fax;
    } //-- java.lang.String getFax() 

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
     * Returns the value of field 'organizationCode'. The field
     * 'organizationCode' has the following description: ��λ����
     * 
     * @return the value of field 'organizationCode'.
     */
    public java.lang.String getOrganizationCode()
    {
        return this._organizationCode;
    } //-- java.lang.String getOrganizationCode() 

    /**
     * Returns the value of field 'organizations'.
     * 
     * @return the value of field 'organizations'.
     */
    public com.ccssoft.rsas.common.xmlparser.Organizations getOrganizations()
    {
        return this._organizations;
    } //-- com.regaltec.rsas.common.xmlparser.Organizations getOrganizations() 

    /**
     * Returns the value of field 'parendID'.
     * 
     * @return the value of field 'parendID'.
     */
    public java.lang.String getParendID()
    {
        return this._parendID;
    } //-- java.lang.String getParendID() 

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
     * Returns the value of field 'treeCode'.
     * 
     * @return the value of field 'treeCode'.
     */
    public java.lang.String getTreeCode()
    {
        return this._treeCode;
    } //-- java.lang.String getTreeCode() 

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
     * Sets the value of field 'dataAuthorityDivs'.
     * 
     * @param dataAuthorityDivs the value of field
     * 'dataAuthorityDivs'.
     */
    public void setDataAuthorityDivs(com.ccssoft.rsas.common.xmlparser.DataAuthorityDivs dataAuthorityDivs)
    {
        this._dataAuthorityDivs = dataAuthorityDivs;
    } //-- void setDataAuthorityDivs(com.regaltec.rsas.common.xmlparser.DataAuthorityDivs) 

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
     * Sets the value of field 'fax'.
     * 
     * @param fax the value of field 'fax'.
     */
    public void setFax(java.lang.String fax)
    {
        this._fax = fax;
    } //-- void setFax(java.lang.String) 

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
     * Sets the value of field 'organizationCode'. The field
     * 'organizationCode' has the following description: ��λ����
     * 
     * @param organizationCode the value of field 'organizationCode'
     */
    public void setOrganizationCode(java.lang.String organizationCode)
    {
        this._organizationCode = organizationCode;
    } //-- void setOrganizationCode(java.lang.String) 

    /**
     * Sets the value of field 'organizations'.
     * 
     * @param organizations the value of field 'organizations'.
     */
    public void setOrganizations(com.ccssoft.rsas.common.xmlparser.Organizations organizations)
    {
        this._organizations = organizations;
    } //-- void setOrganizations(com.regaltec.rsas.common.xmlparser.Organizations) 

    /**
     * Sets the value of field 'parendID'.
     * 
     * @param parendID the value of field 'parendID'.
     */
    public void setParendID(java.lang.String parendID)
    {
        this._parendID = parendID;
    } //-- void setParendID(java.lang.String) 

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
     * Sets the value of field 'treeCode'.
     * 
     * @param treeCode the value of field 'treeCode'.
     */
    public void setTreeCode(java.lang.String treeCode)
    {
        this._treeCode = treeCode;
    } //-- void setTreeCode(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Organization) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Organization.class, reader);
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
