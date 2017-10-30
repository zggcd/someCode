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

import com.ccssoft.rsas.common.xmlparser.types.DataInputTableShowTypeType;

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
 * ���������
 * 
 * @version $Revision$ $Date$
 */
public class DataInputTable implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����Դ
     */
    private java.lang.String _linkID;

    /**
     * ����
     */
    private java.lang.String _tableName;

    /**
     * չ�����ͣ����Σ����
     */
    private com.ccssoft.rsas.common.xmlparser.types.DataInputTableShowTypeType _showType;

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
     * Field _dataInputFields
     */
    private com.ccssoft.rsas.common.xmlparser.DataInputFields _dataInputFields;

    /**
     * ����ӳ������
     */
    private com.ccssoft.rsas.common.xmlparser.DataMap _dataMap;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataInputTable() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.DataInputTable()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataInputFields'.
     * 
     * @return the value of field 'dataInputFields'.
     */
    public com.ccssoft.rsas.common.xmlparser.DataInputFields getDataInputFields()
    {
        return this._dataInputFields;
    } //-- com.regaltec.rsas.common.xmlparser.DataInputFields getDataInputFields() 

    /**
     * Returns the value of field 'dataMap'. The field 'dataMap'
     * has the following description: ����ӳ������
     * 
     * @return the value of field 'dataMap'.
     */
    public com.ccssoft.rsas.common.xmlparser.DataMap getDataMap()
    {
        return this._dataMap;
    } //-- com.regaltec.rsas.common.xmlparser.DataMap getDataMap() 

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
     * Returns the value of field 'linkID'. The field 'linkID' has
     * the following description: ����Դ
     * 
     * @return the value of field 'linkID'.
     */
    public java.lang.String getLinkID()
    {
        return this._linkID;
    } //-- java.lang.String getLinkID() 

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
     * Returns the value of field 'showType'. The field 'showType'
     * has the following description: չ�����ͣ����Σ����
     * 
     * @return the value of field 'showType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DataInputTableShowTypeType getShowType()
    {
        return this._showType;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataInputTableShowTypeType getShowType() 

    /**
     * Returns the value of field 'tableName'. The field
     * 'tableName' has the following description: ����
     * 
     * @return the value of field 'tableName'.
     */
    public java.lang.String getTableName()
    {
        return this._tableName;
    } //-- java.lang.String getTableName() 

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
     * Sets the value of field 'dataInputFields'.
     * 
     * @param dataInputFields the value of field 'dataInputFields'.
     */
    public void setDataInputFields(com.ccssoft.rsas.common.xmlparser.DataInputFields dataInputFields)
    {
        this._dataInputFields = dataInputFields;
    } //-- void setDataInputFields(com.regaltec.rsas.common.xmlparser.DataInputFields) 

    /**
     * Sets the value of field 'dataMap'. The field 'dataMap' has
     * the following description: ����ӳ������
     * 
     * @param dataMap the value of field 'dataMap'.
     */
    public void setDataMap(com.ccssoft.rsas.common.xmlparser.DataMap dataMap)
    {
        this._dataMap = dataMap;
    } //-- void setDataMap(com.regaltec.rsas.common.xmlparser.DataMap) 

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
     * Sets the value of field 'linkID'. The field 'linkID' has the
     * following description: ����Դ
     * 
     * @param linkID the value of field 'linkID'.
     */
    public void setLinkID(java.lang.String linkID)
    {
        this._linkID = linkID;
    } //-- void setLinkID(java.lang.String) 

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
     * Sets the value of field 'showType'. The field 'showType' has
     * the following description: չ�����ͣ����Σ����
     * 
     * @param showType the value of field 'showType'.
     */
    public void setShowType(com.ccssoft.rsas.common.xmlparser.types.DataInputTableShowTypeType showType)
    {
        this._showType = showType;
    } //-- void setShowType(com.regaltec.rsas.common.xmlparser.types.DataInputTableShowTypeType) 

    /**
     * Sets the value of field 'tableName'. The field 'tableName'
     * has the following description: ����
     * 
     * @param tableName the value of field 'tableName'.
     */
    public void setTableName(java.lang.String tableName)
    {
        this._tableName = tableName;
    } //-- void setTableName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DataInputTable) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DataInputTable.class, reader);
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
