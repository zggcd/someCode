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

import com.ccssoft.rsas.common.xmlparser.types.CheckTableMarkFieldDataTypeType;

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
 * ���ݺ˶Ա����
 * 
 * @version $Revision$ $Date$
 */
public class CheckTable implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * ����
     */
    private java.lang.String _tableName;

    /**
     * ��ı���
     */
    private java.lang.String _caption;

    /**
     * �˶Ժ��ǵ��ֶ�
     */
    private java.lang.String _markField;

    /**
     * ����ֶε���������
     */
    private com.ccssoft.rsas.common.xmlparser.types.CheckTableMarkFieldDataTypeType _markFieldDataType;

    /**
     * ���ֵ����д��ʽΪ��trueValue,falseValue����1,0
     */
    private java.lang.String _markValue;

    /**
     * �����ֶ�
     */
    private java.lang.String _primaryField;

    /**
     * ���ݺ˶��ֶμ�������󼯺�
     */
    private com.ccssoft.rsas.common.xmlparser.CheckFields _checkFields;


      //----------------/
     //- Constructors -/
    //----------------/

    public CheckTable() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.CheckTable()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'caption'. The field 'caption'
     * has the following description: ��ı���
     * 
     * @return the value of field 'caption'.
     */
    public java.lang.String getCaption()
    {
        return this._caption;
    } //-- java.lang.String getCaption() 

    /**
     * Returns the value of field 'checkFields'. The field
     * 'checkFields' has the following description: ���ݺ˶��ֶμ�������󼯺�
     * 
     * @return the value of field 'checkFields'.
     */
    public com.ccssoft.rsas.common.xmlparser.CheckFields getCheckFields()
    {
        return this._checkFields;
    } //-- com.regaltec.rsas.common.xmlparser.CheckFields getCheckFields() 

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
     * Returns the value of field 'markField'. The field
     * 'markField' has the following description: �˶Ժ��ǵ��ֶ�
     * 
     * @return the value of field 'markField'.
     */
    public java.lang.String getMarkField()
    {
        return this._markField;
    } //-- java.lang.String getMarkField() 

    /**
     * Returns the value of field 'markFieldDataType'. The field
     * 'markFieldDataType' has the following description: ����ֶε���������
     * 
     * @return the value of field 'markFieldDataType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.CheckTableMarkFieldDataTypeType getMarkFieldDataType()
    {
        return this._markFieldDataType;
    } //-- com.regaltec.rsas.common.xmlparser.types.CheckTableMarkFieldDataTypeType getMarkFieldDataType() 

    /**
     * Returns the value of field 'markValue'. The field
     * 'markValue' has the following description:
     * ���ֵ����д��ʽΪ��trueValue,falseValue����1,0
     * 
     * @return the value of field 'markValue'.
     */
    public java.lang.String getMarkValue()
    {
        return this._markValue;
    } //-- java.lang.String getMarkValue() 

    /**
     * Returns the value of field 'primaryField'. The field
     * 'primaryField' has the following description: �����ֶ�
     * 
     * @return the value of field 'primaryField'.
     */
    public java.lang.String getPrimaryField()
    {
        return this._primaryField;
    } //-- java.lang.String getPrimaryField() 

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
     * Sets the value of field 'caption'. The field 'caption' has
     * the following description: ��ı���
     * 
     * @param caption the value of field 'caption'.
     */
    public void setCaption(java.lang.String caption)
    {
        this._caption = caption;
    } //-- void setCaption(java.lang.String) 

    /**
     * Sets the value of field 'checkFields'. The field
     * 'checkFields' has the following description: ���ݺ˶��ֶμ�������󼯺�
     * 
     * @param checkFields the value of field 'checkFields'.
     */
    public void setCheckFields(com.ccssoft.rsas.common.xmlparser.CheckFields checkFields)
    {
        this._checkFields = checkFields;
    } //-- void setCheckFields(com.regaltec.rsas.common.xmlparser.CheckFields) 

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
     * Sets the value of field 'markField'. The field 'markField'
     * has the following description: �˶Ժ��ǵ��ֶ�
     * 
     * @param markField the value of field 'markField'.
     */
    public void setMarkField(java.lang.String markField)
    {
        this._markField = markField;
    } //-- void setMarkField(java.lang.String) 

    /**
     * Sets the value of field 'markFieldDataType'. The field
     * 'markFieldDataType' has the following description: ����ֶε���������
     * 
     * @param markFieldDataType the value of field
     * 'markFieldDataType'.
     */
    public void setMarkFieldDataType(com.ccssoft.rsas.common.xmlparser.types.CheckTableMarkFieldDataTypeType markFieldDataType)
    {
        this._markFieldDataType = markFieldDataType;
    } //-- void setMarkFieldDataType(com.regaltec.rsas.common.xmlparser.types.CheckTableMarkFieldDataTypeType) 

    /**
     * Sets the value of field 'markValue'. The field 'markValue'
     * has the following description:
     * ���ֵ����д��ʽΪ��trueValue,falseValue����1,0
     * 
     * @param markValue the value of field 'markValue'.
     */
    public void setMarkValue(java.lang.String markValue)
    {
        this._markValue = markValue;
    } //-- void setMarkValue(java.lang.String) 

    /**
     * Sets the value of field 'primaryField'. The field
     * 'primaryField' has the following description: �����ֶ�
     * 
     * @param primaryField the value of field 'primaryField'.
     */
    public void setPrimaryField(java.lang.String primaryField)
    {
        this._primaryField = primaryField;
    } //-- void setPrimaryField(java.lang.String) 

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
        return (com.ccssoft.rsas.common.xmlparser.CheckTable) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.CheckTable.class, reader);
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
