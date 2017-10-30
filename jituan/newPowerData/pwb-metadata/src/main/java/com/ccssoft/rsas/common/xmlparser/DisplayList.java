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

import com.ccssoft.rsas.common.xmlparser.types.DisplayListFieldDataTypeType;
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
 * ��������������ݿ⣬KeyField����д�ֶ���������Ƕ�̬������KeyField��дPrimaryField��CaptionField��дList�е�������ά������KeyField��дά��ID��CaptionField��д��������̬+ά�ȣ�KeyField��дPrimaryField��CaptionField��д������OptionField��дά�ȵ�ID
 * 
 * @version $Revision$ $Date$
 */
public class DisplayList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _tableName
     */
    private java.lang.String _tableName;

    /**
     * �������ͨ������ű����ֶ����������̬�������������������������ConditionID��
     */
    private java.lang.String _keyField;

    /**
     * Field _captionField
     */
    private java.lang.String _captionField;

    /**
     * ��̬+����ʱ��Ź̶��б��е����ڴ���������ȡֵ����̬+ά���������ά�ȵ�ID����������ʱ�����Ϊ��ǰ������ѯʱ���������ֶ�����
     */
    private java.lang.String _optionField;

    /**
     * ��������οؼ�����ָ����ǰ�ֶ��Ƿ�Ϊ��ID�ֶ�
     */
    private byte _isParentField;

    /**
     * keeps track of state for field: _isParentField
     */
    private boolean _has_isParentField;

    /**
     * Field _isValueField
     */
    private byte _isValueField;

    /**
     * keeps track of state for field: _isValueField
     */
    private boolean _has_isValueField;

    /**
     * ��ǰ�ֶ��Ƿ�����
     */
    private byte _isHide;

    /**
     * keeps track of state for field: _isHide
     */
    private boolean _has_isHide;

    /**
     * ��ǰ�ֶ��Ƿ�Ϊ�ؼ��ֶ�
     */
    private byte _isPrimary;

    /**
     * keeps track of state for field: _isPrimary
     */
    private boolean _has_isPrimary;

    /**
     * �Ƿ�����ʾ�ڿؼ��б��ʽ���ֶ�
     */
    private byte _isExpression;

    /**
     * keeps track of state for field: _isExpression
     */
    private boolean _has_isExpression;

    /**
     * ����ǵ�����񣬴����Ƿ���ɸѡ����
     */
    private byte _isCondition;

    /**
     * keeps track of state for field: _isCondition
     */
    private boolean _has_isCondition;

    /**
     * ����Ǳ����ʾʱ���п�
     */
    private int _columnWidth;

    /**
     * keeps track of state for field: _columnWidth
     */
    private boolean _has_columnWidth;

    /**
     * Field _dependID
     */
    private java.lang.String _dependID;

    /**
     * 0��û��������������1����
     */
    private byte _hasChild;

    /**
     * keeps track of state for field: _hasChild
     */
    private boolean _has_hasChild;

    /**
     * ��ѯ��ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.types.WarningComboSearchKindType _searchKind;

    /**
     * ��ǰ�ֶε����ݿ�����
     */
    private com.ccssoft.rsas.common.xmlparser.types.DisplayListFieldDataTypeType _fieldDataType;


      //----------------/
     //- Constructors -/
    //----------------/

    public DisplayList() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.DisplayList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteColumnWidth
     */
    public void deleteColumnWidth()
    {
        this._has_columnWidth= false;
    } //-- void deleteColumnWidth() 

    /**
     * Method deleteHasChild
     */
    public void deleteHasChild()
    {
        this._has_hasChild= false;
    } //-- void deleteHasChild() 

    /**
     * Method deleteIsCondition
     */
    public void deleteIsCondition()
    {
        this._has_isCondition= false;
    } //-- void deleteIsCondition() 

    /**
     * Method deleteIsExpression
     */
    public void deleteIsExpression()
    {
        this._has_isExpression= false;
    } //-- void deleteIsExpression() 

    /**
     * Method deleteIsHide
     */
    public void deleteIsHide()
    {
        this._has_isHide= false;
    } //-- void deleteIsHide() 

    /**
     * Method deleteIsParentField
     */
    public void deleteIsParentField()
    {
        this._has_isParentField= false;
    } //-- void deleteIsParentField() 

    /**
     * Method deleteIsPrimary
     */
    public void deleteIsPrimary()
    {
        this._has_isPrimary= false;
    } //-- void deleteIsPrimary() 

    /**
     * Method deleteIsValueField
     */
    public void deleteIsValueField()
    {
        this._has_isValueField= false;
    } //-- void deleteIsValueField() 

    /**
     * Returns the value of field 'captionField'.
     * 
     * @return the value of field 'captionField'.
     */
    public java.lang.String getCaptionField()
    {
        return this._captionField;
    } //-- java.lang.String getCaptionField() 

    /**
     * Returns the value of field 'columnWidth'. The field
     * 'columnWidth' has the following description: ����Ǳ����ʾʱ���п�
     * 
     * @return the value of field 'columnWidth'.
     */
    public int getColumnWidth()
    {
        return this._columnWidth;
    } //-- int getColumnWidth() 

    /**
     * Returns the value of field 'dependID'.
     * 
     * @return the value of field 'dependID'.
     */
    public java.lang.String getDependID()
    {
        return this._dependID;
    } //-- java.lang.String getDependID() 

    /**
     * Returns the value of field 'fieldDataType'. The field
     * 'fieldDataType' has the following description: ��ǰ�ֶε����ݿ�����
     * 
     * @return the value of field 'fieldDataType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DisplayListFieldDataTypeType getFieldDataType()
    {
        return this._fieldDataType;
    } //-- com.regaltec.rsas.common.xmlparser.types.DisplayListFieldDataTypeType getFieldDataType() 

    /**
     * Returns the value of field 'hasChild'. The field 'hasChild'
     * has the following description: 0��û��������������1����
     * 
     * @return the value of field 'hasChild'.
     */
    public byte getHasChild()
    {
        return this._hasChild;
    } //-- byte getHasChild() 

    /**
     * Returns the value of field 'isCondition'. The field
     * 'isCondition' has the following description:
     * ����ǵ�����񣬴����Ƿ���ɸѡ����
     * 
     * @return the value of field 'isCondition'.
     */
    public byte getIsCondition()
    {
        return this._isCondition;
    } //-- byte getIsCondition() 

    /**
     * Returns the value of field 'isExpression'. The field
     * 'isExpression' has the following description:
     * �Ƿ�����ʾ�ڿؼ��б��ʽ���ֶ�
     * 
     * @return the value of field 'isExpression'.
     */
    public byte getIsExpression()
    {
        return this._isExpression;
    } //-- byte getIsExpression() 

    /**
     * Returns the value of field 'isHide'. The field 'isHide' has
     * the following description: ��ǰ�ֶ��Ƿ�����
     * 
     * @return the value of field 'isHide'.
     */
    public byte getIsHide()
    {
        return this._isHide;
    } //-- byte getIsHide() 

    /**
     * Returns the value of field 'isParentField'. The field
     * 'isParentField' has the following description:
     * ��������οؼ�����ָ����ǰ�ֶ��Ƿ�Ϊ��ID�ֶ�
     * 
     * @return the value of field 'isParentField'.
     */
    public byte getIsParentField()
    {
        return this._isParentField;
    } //-- byte getIsParentField() 

    /**
     * Returns the value of field 'isPrimary'. The field
     * 'isPrimary' has the following description: ��ǰ�ֶ��Ƿ�Ϊ�ؼ��ֶ�
     * 
     * @return the value of field 'isPrimary'.
     */
    public byte getIsPrimary()
    {
        return this._isPrimary;
    } //-- byte getIsPrimary() 

    /**
     * Returns the value of field 'isValueField'.
     * 
     * @return the value of field 'isValueField'.
     */
    public byte getIsValueField()
    {
        return this._isValueField;
    } //-- byte getIsValueField() 

    /**
     * Returns the value of field 'keyField'. The field 'keyField'
     * has the following description:
     * �������ͨ������ű����ֶ����������̬�������������������������ConditionID��
     * 
     * @return the value of field 'keyField'.
     */
    public java.lang.String getKeyField()
    {
        return this._keyField;
    } //-- java.lang.String getKeyField() 

    /**
     * Returns the value of field 'optionField'. The field
     * 'optionField' has the following description:
     * ��̬+����ʱ��Ź̶��б��е����ڴ���������ȡֵ����̬+ά���������ά�ȵ�ID����������ʱ�����Ϊ��ǰ������ѯʱ���������ֶ�����
     * 
     * @return the value of field 'optionField'.
     */
    public java.lang.String getOptionField()
    {
        return this._optionField;
    } //-- java.lang.String getOptionField() 

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
     * Returns the value of field 'tableName'.
     * 
     * @return the value of field 'tableName'.
     */
    public java.lang.String getTableName()
    {
        return this._tableName;
    } //-- java.lang.String getTableName() 

    /**
     * Method hasColumnWidth
     */
    public boolean hasColumnWidth()
    {
        return this._has_columnWidth;
    } //-- boolean hasColumnWidth() 

    /**
     * Method hasHasChild
     */
    public boolean hasHasChild()
    {
        return this._has_hasChild;
    } //-- boolean hasHasChild() 

    /**
     * Method hasIsCondition
     */
    public boolean hasIsCondition()
    {
        return this._has_isCondition;
    } //-- boolean hasIsCondition() 

    /**
     * Method hasIsExpression
     */
    public boolean hasIsExpression()
    {
        return this._has_isExpression;
    } //-- boolean hasIsExpression() 

    /**
     * Method hasIsHide
     */
    public boolean hasIsHide()
    {
        return this._has_isHide;
    } //-- boolean hasIsHide() 

    /**
     * Method hasIsParentField
     */
    public boolean hasIsParentField()
    {
        return this._has_isParentField;
    } //-- boolean hasIsParentField() 

    /**
     * Method hasIsPrimary
     */
    public boolean hasIsPrimary()
    {
        return this._has_isPrimary;
    } //-- boolean hasIsPrimary() 

    /**
     * Method hasIsValueField
     */
    public boolean hasIsValueField()
    {
        return this._has_isValueField;
    } //-- boolean hasIsValueField() 

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
     * Sets the value of field 'captionField'.
     * 
     * @param captionField the value of field 'captionField'.
     */
    public void setCaptionField(java.lang.String captionField)
    {
        this._captionField = captionField;
    } //-- void setCaptionField(java.lang.String) 

    /**
     * Sets the value of field 'columnWidth'. The field
     * 'columnWidth' has the following description: ����Ǳ����ʾʱ���п�
     * 
     * @param columnWidth the value of field 'columnWidth'.
     */
    public void setColumnWidth(int columnWidth)
    {
        this._columnWidth = columnWidth;
        this._has_columnWidth = true;
    } //-- void setColumnWidth(int) 

    /**
     * Sets the value of field 'dependID'.
     * 
     * @param dependID the value of field 'dependID'.
     */
    public void setDependID(java.lang.String dependID)
    {
        this._dependID = dependID;
    } //-- void setDependID(java.lang.String) 

    /**
     * Sets the value of field 'fieldDataType'. The field
     * 'fieldDataType' has the following description: ��ǰ�ֶε����ݿ�����
     * 
     * @param fieldDataType the value of field 'fieldDataType'.
     */
    public void setFieldDataType(com.ccssoft.rsas.common.xmlparser.types.DisplayListFieldDataTypeType fieldDataType)
    {
        this._fieldDataType = fieldDataType;
    } //-- void setFieldDataType(com.regaltec.rsas.common.xmlparser.types.DisplayListFieldDataTypeType) 

    /**
     * Sets the value of field 'hasChild'. The field 'hasChild' has
     * the following description: 0��û��������������1����
     * 
     * @param hasChild the value of field 'hasChild'.
     */
    public void setHasChild(byte hasChild)
    {
        this._hasChild = hasChild;
        this._has_hasChild = true;
    } //-- void setHasChild(byte) 

    /**
     * Sets the value of field 'isCondition'. The field
     * 'isCondition' has the following description:
     * ����ǵ�����񣬴����Ƿ���ɸѡ����
     * 
     * @param isCondition the value of field 'isCondition'.
     */
    public void setIsCondition(byte isCondition)
    {
        this._isCondition = isCondition;
        this._has_isCondition = true;
    } //-- void setIsCondition(byte) 

    /**
     * Sets the value of field 'isExpression'. The field
     * 'isExpression' has the following description:
     * �Ƿ�����ʾ�ڿؼ��б��ʽ���ֶ�
     * 
     * @param isExpression the value of field 'isExpression'.
     */
    public void setIsExpression(byte isExpression)
    {
        this._isExpression = isExpression;
        this._has_isExpression = true;
    } //-- void setIsExpression(byte) 

    /**
     * Sets the value of field 'isHide'. The field 'isHide' has the
     * following description: ��ǰ�ֶ��Ƿ�����
     * 
     * @param isHide the value of field 'isHide'.
     */
    public void setIsHide(byte isHide)
    {
        this._isHide = isHide;
        this._has_isHide = true;
    } //-- void setIsHide(byte) 

    /**
     * Sets the value of field 'isParentField'. The field
     * 'isParentField' has the following description:
     * ��������οؼ�����ָ����ǰ�ֶ��Ƿ�Ϊ��ID�ֶ�
     * 
     * @param isParentField the value of field 'isParentField'.
     */
    public void setIsParentField(byte isParentField)
    {
        this._isParentField = isParentField;
        this._has_isParentField = true;
    } //-- void setIsParentField(byte) 

    /**
     * Sets the value of field 'isPrimary'. The field 'isPrimary'
     * has the following description: ��ǰ�ֶ��Ƿ�Ϊ�ؼ��ֶ�
     * 
     * @param isPrimary the value of field 'isPrimary'.
     */
    public void setIsPrimary(byte isPrimary)
    {
        this._isPrimary = isPrimary;
        this._has_isPrimary = true;
    } //-- void setIsPrimary(byte) 

    /**
     * Sets the value of field 'isValueField'.
     * 
     * @param isValueField the value of field 'isValueField'.
     */
    public void setIsValueField(byte isValueField)
    {
        this._isValueField = isValueField;
        this._has_isValueField = true;
    } //-- void setIsValueField(byte) 

    /**
     * Sets the value of field 'keyField'. The field 'keyField' has
     * the following description:
     * �������ͨ������ű����ֶ����������̬�������������������������ConditionID��
     * 
     * @param keyField the value of field 'keyField'.
     */
    public void setKeyField(java.lang.String keyField)
    {
        this._keyField = keyField;
    } //-- void setKeyField(java.lang.String) 

    /**
     * Sets the value of field 'optionField'. The field
     * 'optionField' has the following description:
     * ��̬+����ʱ��Ź̶��б��е����ڴ���������ȡֵ����̬+ά���������ά�ȵ�ID����������ʱ�����Ϊ��ǰ������ѯʱ���������ֶ�����
     * 
     * @param optionField the value of field 'optionField'.
     */
    public void setOptionField(java.lang.String optionField)
    {
        this._optionField = optionField;
    } //-- void setOptionField(java.lang.String) 

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
     * Sets the value of field 'tableName'.
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
        return (com.ccssoft.rsas.common.xmlparser.DisplayList) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DisplayList.class, reader);
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
