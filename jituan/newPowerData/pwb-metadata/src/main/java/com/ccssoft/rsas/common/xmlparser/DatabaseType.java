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

import com.ccssoft.rsas.common.xmlparser.types.DatabaseTypeDataSourceTypeType;
import com.ccssoft.rsas.common.xmlparser.types.DatabaseTypeDbTypeType;

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
 * ���ݿ�ϵͳ����
 * 
 * @version $Revision$ $Date$
 */
public class DatabaseType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���ݿ�ϵͳ������
     */
    private com.ccssoft.rsas.common.xmlparser.types.DatabaseTypeDbTypeType _dbType;

    /**
     * Field _dataSourceType
     */
    private com.ccssoft.rsas.common.xmlparser.types.DatabaseTypeDataSourceTypeType _dataSourceType;

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


      //----------------/
     //- Constructors -/
    //----------------/

    public DatabaseType() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.DatabaseType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataSourceType'.
     * 
     * @return the value of field 'dataSourceType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DatabaseTypeDataSourceTypeType getDataSourceType()
    {
        return this._dataSourceType;
    } //-- com.regaltec.rsas.common.xmlparser.types.DatabaseTypeDataSourceTypeType getDataSourceType() 

    /**
     * Returns the value of field 'dbType'. The field 'dbType' has
     * the following description: ���ݿ�ϵͳ������
     * 
     * @return the value of field 'dbType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DatabaseTypeDbTypeType getDbType()
    {
        return this._dbType;
    } //-- com.regaltec.rsas.common.xmlparser.types.DatabaseTypeDbTypeType getDbType() 

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
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

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
     * Sets the value of field 'dataSourceType'.
     * 
     * @param dataSourceType the value of field 'dataSourceType'.
     */
    public void setDataSourceType(com.ccssoft.rsas.common.xmlparser.types.DatabaseTypeDataSourceTypeType dataSourceType)
    {
        this._dataSourceType = dataSourceType;
    } //-- void setDataSourceType(com.regaltec.rsas.common.xmlparser.types.DatabaseTypeDataSourceTypeType) 

    /**
     * Sets the value of field 'dbType'. The field 'dbType' has the
     * following description: ���ݿ�ϵͳ������
     * 
     * @param dbType the value of field 'dbType'.
     */
    public void setDbType(com.ccssoft.rsas.common.xmlparser.types.DatabaseTypeDbTypeType dbType)
    {
        this._dbType = dbType;
    } //-- void setDbType(com.regaltec.rsas.common.xmlparser.types.DatabaseTypeDbTypeType) 

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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DatabaseType) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DatabaseType.class, reader);
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
