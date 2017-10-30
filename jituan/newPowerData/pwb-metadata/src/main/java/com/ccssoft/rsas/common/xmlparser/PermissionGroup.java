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
 * Ȩ����(��ɫ)
 * 
 * @version $Revision$ $Date$
 */
public class PermissionGroup implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

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

    public PermissionGroup() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.PermissionGroup()


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
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PermissionGroup) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PermissionGroup.class, reader);
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
