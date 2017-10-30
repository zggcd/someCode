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

import com.ccssoft.rsas.common.xmlparser.types.CheckFieldDataTypeType;
import com.ccssoft.rsas.common.xmlparser.types.WarningComboSearchKindType;

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
 * ���ݺ˶��ֶμ��������
 * 
 * @version $Revision$ $Date$
 */
public class CheckField implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _fieldName
     */
    private java.lang.String _fieldName;

    /**
     * �ֶα���
     */
    private java.lang.String _caption;

    /**
     * �ֶε���������
     */
    private com.ccssoft.rsas.common.xmlparser.types.CheckFieldDataTypeType _dataType;

    /**
     * �Ƿ�Ϊ����Ϊ��
     */
    private int _notNull;

    /**
     * keeps track of state for field: _notNull
     */
    private boolean _has_notNull;

    /**
     * �ֶε���Сֵ�����ֶ���������Ϊ���Ρ����㡢���ڵ�����ʱ������д������
     */
    private java.lang.String _minValue;

    /**
     * �ֶε����ֵ�����ֶ���������Ϊ���Ρ����㡢���ڵ�����ʱ������д������
     */
    private java.lang.String _maxValue;

    /**
     * ��ѯ��ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.types.WarningComboSearchKindType _searchKind;

    /**
     * ��MinValue��MaxValue���ʹ�ã�����ֵ���ڷ�Χ��ʱ�����жϵ�ֵ
     */
    private java.lang.String _outOfRange;

    /**
     * ͨ���б�Ϊʹ�ù̶��б�ֵ���ֶ�ʹ�ã�ʹ��|�ָ�����д��ʽ�磺 A|B|C|D
     */
    private java.lang.String _regularList;

    /**
     * ��ʽ�ַ�������������ʱ��д���ڴ���ʽ���磺YYYY-MM-DD HH:MI:SS������������д�����ʽ��
     */
    private java.lang.String _format;

    /**
     * ʹ���˿�ֵ�滻�ַ������磺NULL����ʱ�����ж�Format�᲻��ͨ�������Format����Ӧ�úͱ����Խ��ʹ��
     */
    private java.lang.String _nullString;


      //----------------/
     //- Constructors -/
    //----------------/

    public CheckField() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.CheckField()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteNotNull
     */
    public void deleteNotNull()
    {
        this._has_notNull= false;
    } //-- void deleteNotNull() 

    /**
     * Returns the value of field 'caption'. The field 'caption'
     * has the following description: �ֶα���
     * 
     * @return the value of field 'caption'.
     */
    public java.lang.String getCaption()
    {
        return this._caption;
    } //-- java.lang.String getCaption() 

    /**
     * Returns the value of field 'dataType'. The field 'dataType'
     * has the following description: �ֶε���������
     * 
     * @return the value of field 'dataType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.CheckFieldDataTypeType getDataType()
    {
        return this._dataType;
    } //-- com.regaltec.rsas.common.xmlparser.types.CheckFieldDataTypeType getDataType() 

    /**
     * Returns the value of field 'fieldName'.
     * 
     * @return the value of field 'fieldName'.
     */
    public java.lang.String getFieldName()
    {
        return this._fieldName;
    } //-- java.lang.String getFieldName() 

    /**
     * Returns the value of field 'format'. The field 'format' has
     * the following description: ��ʽ�ַ�������������ʱ��д���ڴ���ʽ���磺YYYY-MM-DD
     * HH:MI:SS������������д�����ʽ��
     * 
     * @return the value of field 'format'.
     */
    public java.lang.String getFormat()
    {
        return this._format;
    } //-- java.lang.String getFormat() 

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
     * Returns the value of field 'maxValue'. The field 'maxValue'
     * has the following description:
     * �ֶε����ֵ�����ֶ���������Ϊ���Ρ����㡢���ڵ�����ʱ������д������
     * 
     * @return the value of field 'maxValue'.
     */
    public java.lang.String getMaxValue()
    {
        return this._maxValue;
    } //-- java.lang.String getMaxValue() 

    /**
     * Returns the value of field 'minValue'. The field 'minValue'
     * has the following description:
     * �ֶε���Сֵ�����ֶ���������Ϊ���Ρ����㡢���ڵ�����ʱ������д������
     * 
     * @return the value of field 'minValue'.
     */
    public java.lang.String getMinValue()
    {
        return this._minValue;
    } //-- java.lang.String getMinValue() 

    /**
     * Returns the value of field 'notNull'. The field 'notNull'
     * has the following description: �Ƿ�Ϊ����Ϊ��
     * 
     * @return the value of field 'notNull'.
     */
    public int getNotNull()
    {
        return this._notNull;
    } //-- int getNotNull() 

    /**
     * Returns the value of field 'nullString'. The field
     * 'nullString' has the following description:
     * ʹ���˿�ֵ�滻�ַ������磺NULL����ʱ�����ж�Format�᲻��ͨ�������Format����Ӧ�úͱ����Խ��ʹ��
     * 
     * @return the value of field 'nullString'.
     */
    public java.lang.String getNullString()
    {
        return this._nullString;
    } //-- java.lang.String getNullString() 

    /**
     * Returns the value of field 'outOfRange'. The field
     * 'outOfRange' has the following description:
     * ��MinValue��MaxValue���ʹ�ã�����ֵ���ڷ�Χ��ʱ�����жϵ�ֵ
     * 
     * @return the value of field 'outOfRange'.
     */
    public java.lang.String getOutOfRange()
    {
        return this._outOfRange;
    } //-- java.lang.String getOutOfRange() 

    /**
     * Returns the value of field 'regularList'. The field
     * 'regularList' has the following description:
     * ͨ���б�Ϊʹ�ù̶��б�ֵ���ֶ�ʹ�ã�ʹ��|�ָ�����д��ʽ�磺 A|B|C|D
     * 
     * @return the value of field 'regularList'.
     */
    public java.lang.String getRegularList()
    {
        return this._regularList;
    } //-- java.lang.String getRegularList() 

    /**
     * Returns the value of field 'searchKind'. The field
     * 'searchKind' has the following description: ��ѯ��ʽ
     * 
     * @return the value of field 'searchKind'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.WarningComboSearchKindType getSearchKind()
    {
        return this._searchKind;
    } //-- com.regaltec.rsas.common.xmlparser.types.WarningComboSearchKindType getSearchKind() 

    /**
     * Method hasNotNull
     */
    public boolean hasNotNull()
    {
        return this._has_notNull;
    } //-- boolean hasNotNull() 

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
     * the following description: �ֶα���
     * 
     * @param caption the value of field 'caption'.
     */
    public void setCaption(java.lang.String caption)
    {
        this._caption = caption;
    } //-- void setCaption(java.lang.String) 

    /**
     * Sets the value of field 'dataType'. The field 'dataType' has
     * the following description: �ֶε���������
     * 
     * @param dataType the value of field 'dataType'.
     */
    public void setDataType(com.ccssoft.rsas.common.xmlparser.types.CheckFieldDataTypeType dataType)
    {
        this._dataType = dataType;
    } //-- void setDataType(com.regaltec.rsas.common.xmlparser.types.CheckFieldDataTypeType) 

    /**
     * Sets the value of field 'fieldName'.
     * 
     * @param fieldName the value of field 'fieldName'.
     */
    public void setFieldName(java.lang.String fieldName)
    {
        this._fieldName = fieldName;
    } //-- void setFieldName(java.lang.String) 

    /**
     * Sets the value of field 'format'. The field 'format' has the
     * following description: ��ʽ�ַ�������������ʱ��д���ڴ���ʽ���磺YYYY-MM-DD
     * HH:MI:SS������������д�����ʽ��
     * 
     * @param format the value of field 'format'.
     */
    public void setFormat(java.lang.String format)
    {
        this._format = format;
    } //-- void setFormat(java.lang.String) 

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
     * Sets the value of field 'maxValue'. The field 'maxValue' has
     * the following description:
     * �ֶε����ֵ�����ֶ���������Ϊ���Ρ����㡢���ڵ�����ʱ������д������
     * 
     * @param maxValue the value of field 'maxValue'.
     */
    public void setMaxValue(java.lang.String maxValue)
    {
        this._maxValue = maxValue;
    } //-- void setMaxValue(java.lang.String) 

    /**
     * Sets the value of field 'minValue'. The field 'minValue' has
     * the following description:
     * �ֶε���Сֵ�����ֶ���������Ϊ���Ρ����㡢���ڵ�����ʱ������д������
     * 
     * @param minValue the value of field 'minValue'.
     */
    public void setMinValue(java.lang.String minValue)
    {
        this._minValue = minValue;
    } //-- void setMinValue(java.lang.String) 

    /**
     * Sets the value of field 'notNull'. The field 'notNull' has
     * the following description: �Ƿ�Ϊ����Ϊ��
     * 
     * @param notNull the value of field 'notNull'.
     */
    public void setNotNull(int notNull)
    {
        this._notNull = notNull;
        this._has_notNull = true;
    } //-- void setNotNull(int) 

    /**
     * Sets the value of field 'nullString'. The field 'nullString'
     * has the following description:
     * ʹ���˿�ֵ�滻�ַ������磺NULL����ʱ�����ж�Format�᲻��ͨ�������Format����Ӧ�úͱ����Խ��ʹ��
     * 
     * @param nullString the value of field 'nullString'.
     */
    public void setNullString(java.lang.String nullString)
    {
        this._nullString = nullString;
    } //-- void setNullString(java.lang.String) 

    /**
     * Sets the value of field 'outOfRange'. The field 'outOfRange'
     * has the following description:
     * ��MinValue��MaxValue���ʹ�ã�����ֵ���ڷ�Χ��ʱ�����жϵ�ֵ
     * 
     * @param outOfRange the value of field 'outOfRange'.
     */
    public void setOutOfRange(java.lang.String outOfRange)
    {
        this._outOfRange = outOfRange;
    } //-- void setOutOfRange(java.lang.String) 

    /**
     * Sets the value of field 'regularList'. The field
     * 'regularList' has the following description:
     * ͨ���б�Ϊʹ�ù̶��б�ֵ���ֶ�ʹ�ã�ʹ��|�ָ�����д��ʽ�磺 A|B|C|D
     * 
     * @param regularList the value of field 'regularList'.
     */
    public void setRegularList(java.lang.String regularList)
    {
        this._regularList = regularList;
    } //-- void setRegularList(java.lang.String) 

    /**
     * Sets the value of field 'searchKind'. The field 'searchKind'
     * has the following description: ��ѯ��ʽ
     * 
     * @param searchKind the value of field 'searchKind'.
     */
    public void setSearchKind(com.ccssoft.rsas.common.xmlparser.types.WarningComboSearchKindType searchKind)
    {
        this._searchKind = searchKind;
    } //-- void setSearchKind(com.regaltec.rsas.common.xmlparser.types.WarningComboSearchKindType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.CheckField) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.CheckField.class, reader);
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
