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
 * ����Ȩ�޷���
 * 
 * @version $Revision$ $Date$
 */
public class Permission implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _dataAuthorityDivID
     */
    private java.lang.Object _dataAuthorityDivID;

    /**
     * Field _desc
     */
    private java.lang.String _desc;

    /**
     * Field _resourceID
     */
    private java.lang.String _resourceID;


      //----------------/
     //- Constructors -/
    //----------------/

    public Permission() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Permission()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataAuthorityDivID'.
     * 
     * @return the value of field 'dataAuthorityDivID'.
     */
    public java.lang.Object getDataAuthorityDivID()
    {
        return this._dataAuthorityDivID;
    } //-- java.lang.Object getDataAuthorityDivID() 

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
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

    /**
     * Returns the value of field 'resourceID'.
     * 
     * @return the value of field 'resourceID'.
     */
    public java.lang.String getResourceID()
    {
        return this._resourceID;
    } //-- java.lang.String getResourceID() 

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
     * Sets the value of field 'dataAuthorityDivID'.
     * 
     * @param dataAuthorityDivID the value of field
     * 'dataAuthorityDivID'.
     */
    public void setDataAuthorityDivID(java.lang.Object dataAuthorityDivID)
    {
        this._dataAuthorityDivID = dataAuthorityDivID;
    } //-- void setDataAuthorityDivID(java.lang.Object) 

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
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

    /**
     * Sets the value of field 'resourceID'.
     * 
     * @param resourceID the value of field 'resourceID'.
     */
    public void setResourceID(java.lang.String resourceID)
    {
        this._resourceID = resourceID;
    } //-- void setResourceID(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Permission) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Permission.class, reader);
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
