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

import com.ccssoft.rsas.common.xmlparser.types.CommandOptionAttributeDataTypeType;
import com.ccssoft.rsas.common.xmlparser.types.CommandOptionOptionTypeType;
import com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType;

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
 * ���ڴ���������ʱʹ��
 * 
 * @version $Revision$ $Date$
 */
public class CommandOption implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * opSet:�������¶������ԣ�opCondition:������ѯ������ opNormal:��ͨ������
     * opDim:ά�������� opProcedure: �洢���̵Ĳ���opLoad��װ�ض���ʽ
     * opDrill:ģ����ȡ��ǰά�ȳ�ԱID
     */
    private com.ccssoft.rsas.common.xmlparser.types.CommandOptionOptionTypeType _optionType;

    /**
     * ����Ϊִ�б��������ʱ����������дɸѡ����ʹ�õ��ֶ����������Ϊ�洢���̵Ĳ���ֵʱ����������д�洢���̲���������Ϊ��ѯԪ���ݵ�����ʱ����������д���������ݿ��ӳ�����ƣ�����������Ų㼶����ID�������ű仯QueryItemID���������ż������Caption��
     */
    private java.lang.String _attributeName;

    /**
     * ���ύ��������Ҫ�õ�������ʱ����Ӧ�ĺ�����ID������ʱ��ŷ�����㹫ʽID
     */
    private java.lang.String _functionID;

    /**
     * ��Ӧ�ĺ�����
     */
    private java.lang.Object _funcExpress;

    /**
     * ����Ϊ���ɱ��������ʱ�������������ڲ�ѯ����ʱ����������дɸѡ������ID�������Ϊ��ѯ��������������д���ڵĶ�������
     */
    private java.lang.String _queryObjectType;

    /**
     * ɸѡ��������������
     */
    private com.ccssoft.rsas.common.xmlparser.types.CommandOptionAttributeDataTypeType _attributeDataType;

    /**
     * ��Ϊ���ɱ��������ʱ��д�û�ѡ���������ֵ����Ϊ��ѯԪ���ݵ�����ʱ��д��ѯ����
     */
    private java.lang.String _attributeValue;

    /**
     * ��Ϊ���ɱ��������ʱ��д���Ե�����
     */
    private java.lang.String _attributeDesc;

    /**
     * Field _attributeIntValue
     */
    private int _attributeIntValue;

    /**
     * keeps track of state for field: _attributeIntValue
     */
    private boolean _has_attributeIntValue;

    /**
     * Field _attributeFloatValue
     */
    private double _attributeFloatValue;

    /**
     * keeps track of state for field: _attributeFloatValue
     */
    private boolean _has_attributeFloatValue;

    /**
     * ��ѯʹ�õĲ���������=��like��in��not in��
     */
    private java.lang.String _querySymbol;

    /**
     * �����Ƿ��ѡ
     */
    private byte _isMultiSelect;

    /**
     * keeps track of state for field: _isMultiSelect
     */
    private boolean _has_isMultiSelect;

    /**
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     */
    private com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType _objectType;


      //----------------/
     //- Constructors -/
    //----------------/

    public CommandOption() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.CommandOption()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAttributeFloatValue
     */
    public void deleteAttributeFloatValue()
    {
        this._has_attributeFloatValue= false;
    } //-- void deleteAttributeFloatValue() 

    /**
     * Method deleteAttributeIntValue
     */
    public void deleteAttributeIntValue()
    {
        this._has_attributeIntValue= false;
    } //-- void deleteAttributeIntValue() 

    /**
     * Method deleteIsMultiSelect
     */
    public void deleteIsMultiSelect()
    {
        this._has_isMultiSelect= false;
    } //-- void deleteIsMultiSelect() 

    /**
     * Returns the value of field 'attributeDataType'. The field
     * 'attributeDataType' has the following description: ɸѡ��������������
     * 
     * @return the value of field 'attributeDataType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.CommandOptionAttributeDataTypeType getAttributeDataType()
    {
        return this._attributeDataType;
    } //-- com.regaltec.rsas.common.xmlparser.types.CommandOptionAttributeDataTypeType getAttributeDataType() 

    /**
     * Returns the value of field 'attributeDesc'. The field
     * 'attributeDesc' has the following description:
     * ��Ϊ���ɱ��������ʱ��д���Ե�����
     * 
     * @return the value of field 'attributeDesc'.
     */
    public java.lang.String getAttributeDesc()
    {
        return this._attributeDesc;
    } //-- java.lang.String getAttributeDesc() 

    /**
     * Returns the value of field 'attributeFloatValue'.
     * 
     * @return the value of field 'attributeFloatValue'.
     */
    public double getAttributeFloatValue()
    {
        return this._attributeFloatValue;
    } //-- double getAttributeFloatValue() 

    /**
     * Returns the value of field 'attributeIntValue'.
     * 
     * @return the value of field 'attributeIntValue'.
     */
    public int getAttributeIntValue()
    {
        return this._attributeIntValue;
    } //-- int getAttributeIntValue() 

    /**
     * Returns the value of field 'attributeName'. The field
     * 'attributeName' has the following description:
     * ����Ϊִ�б��������ʱ����������дɸѡ����ʹ�õ��ֶ����������Ϊ�洢���̵Ĳ���ֵʱ����������д�洢���̲���������Ϊ��ѯԪ���ݵ�����ʱ����������д���������ݿ��ӳ�����ƣ�����������Ų㼶����ID�������ű仯QueryItemID���������ż������Caption��
     * 
     * @return the value of field 'attributeName'.
     */
    public java.lang.String getAttributeName()
    {
        return this._attributeName;
    } //-- java.lang.String getAttributeName() 

    /**
     * Returns the value of field 'attributeValue'. The field
     * 'attributeValue' has the following description:
     * ��Ϊ���ɱ��������ʱ��д�û�ѡ���������ֵ����Ϊ��ѯԪ���ݵ�����ʱ��д��ѯ����
     * 
     * @return the value of field 'attributeValue'.
     */
    public java.lang.String getAttributeValue()
    {
        return this._attributeValue;
    } //-- java.lang.String getAttributeValue() 

    /**
     * Returns the value of field 'funcExpress'. The field
     * 'funcExpress' has the following description: ��Ӧ�ĺ�����
     * 
     * @return the value of field 'funcExpress'.
     */
    public java.lang.Object getFuncExpress()
    {
        return this._funcExpress;
    } //-- java.lang.Object getFuncExpress() 

    /**
     * Returns the value of field 'functionID'. The field
     * 'functionID' has the following description:
     * ���ύ��������Ҫ�õ�������ʱ����Ӧ�ĺ�����ID������ʱ��ŷ�����㹫ʽID
     * 
     * @return the value of field 'functionID'.
     */
    public java.lang.String getFunctionID()
    {
        return this._functionID;
    } //-- java.lang.String getFunctionID() 

    /**
     * Returns the value of field 'isMultiSelect'. The field
     * 'isMultiSelect' has the following description: �����Ƿ��ѡ
     * 
     * @return the value of field 'isMultiSelect'.
     */
    public byte getIsMultiSelect()
    {
        return this._isMultiSelect;
    } //-- byte getIsMultiSelect() 

    /**
     * Returns the value of field 'objectType'. The field
     * 'objectType' has the following description:
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     * 
     * @return the value of field 'objectType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType getObjectType()
    {
        return this._objectType;
    } //-- com.regaltec.rsas.common.xmlparser.types.RequisitionObjectTypeType getObjectType() 

    /**
     * Returns the value of field 'optionType'. The field
     * 'optionType' has the following description:
     * opSet:�������¶������ԣ�opCondition:������ѯ������ opNormal:��ͨ������
     * opDim:ά�������� opProcedure: �洢���̵Ĳ���opLoad��װ�ض���ʽ
     * opDrill:ģ����ȡ��ǰά�ȳ�ԱID
     * 
     * @return the value of field 'optionType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.CommandOptionOptionTypeType getOptionType()
    {
        return this._optionType;
    } //-- com.regaltec.rsas.common.xmlparser.types.CommandOptionOptionTypeType getOptionType() 

    /**
     * Returns the value of field 'queryObjectType'. The field
     * 'queryObjectType' has the following description:
     * ����Ϊ���ɱ��������ʱ�������������ڲ�ѯ����ʱ����������дɸѡ������ID�������Ϊ��ѯ��������������д���ڵĶ�������
     * 
     * @return the value of field 'queryObjectType'.
     */
    public java.lang.String getQueryObjectType()
    {
        return this._queryObjectType;
    } //-- java.lang.String getQueryObjectType() 

    /**
     * Returns the value of field 'querySymbol'. The field
     * 'querySymbol' has the following description:
     * ��ѯʹ�õĲ���������=��like��in��not in��
     * 
     * @return the value of field 'querySymbol'.
     */
    public java.lang.String getQuerySymbol()
    {
        return this._querySymbol;
    } //-- java.lang.String getQuerySymbol() 

    /**
     * Method hasAttributeFloatValue
     */
    public boolean hasAttributeFloatValue()
    {
        return this._has_attributeFloatValue;
    } //-- boolean hasAttributeFloatValue() 

    /**
     * Method hasAttributeIntValue
     */
    public boolean hasAttributeIntValue()
    {
        return this._has_attributeIntValue;
    } //-- boolean hasAttributeIntValue() 

    /**
     * Method hasIsMultiSelect
     */
    public boolean hasIsMultiSelect()
    {
        return this._has_isMultiSelect;
    } //-- boolean hasIsMultiSelect() 

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
     * Sets the value of field 'attributeDataType'. The field
     * 'attributeDataType' has the following description: ɸѡ��������������
     * 
     * @param attributeDataType the value of field
     * 'attributeDataType'.
     */
    public void setAttributeDataType(com.ccssoft.rsas.common.xmlparser.types.CommandOptionAttributeDataTypeType attributeDataType)
    {
        this._attributeDataType = attributeDataType;
    } //-- void setAttributeDataType(com.regaltec.rsas.common.xmlparser.types.CommandOptionAttributeDataTypeType) 

    /**
     * Sets the value of field 'attributeDesc'. The field
     * 'attributeDesc' has the following description:
     * ��Ϊ���ɱ��������ʱ��д���Ե�����
     * 
     * @param attributeDesc the value of field 'attributeDesc'.
     */
    public void setAttributeDesc(java.lang.String attributeDesc)
    {
        this._attributeDesc = attributeDesc;
    } //-- void setAttributeDesc(java.lang.String) 

    /**
     * Sets the value of field 'attributeFloatValue'.
     * 
     * @param attributeFloatValue the value of field
     * 'attributeFloatValue'.
     */
    public void setAttributeFloatValue(double attributeFloatValue)
    {
        this._attributeFloatValue = attributeFloatValue;
        this._has_attributeFloatValue = true;
    } //-- void setAttributeFloatValue(double) 

    /**
     * Sets the value of field 'attributeIntValue'.
     * 
     * @param attributeIntValue the value of field
     * 'attributeIntValue'.
     */
    public void setAttributeIntValue(int attributeIntValue)
    {
        this._attributeIntValue = attributeIntValue;
        this._has_attributeIntValue = true;
    } //-- void setAttributeIntValue(int) 

    /**
     * Sets the value of field 'attributeName'. The field
     * 'attributeName' has the following description:
     * ����Ϊִ�б��������ʱ����������дɸѡ����ʹ�õ��ֶ����������Ϊ�洢���̵Ĳ���ֵʱ����������д�洢���̲���������Ϊ��ѯԪ���ݵ�����ʱ����������д���������ݿ��ӳ�����ƣ�����������Ų㼶����ID�������ű仯QueryItemID���������ż������Caption��
     * 
     * @param attributeName the value of field 'attributeName'.
     */
    public void setAttributeName(java.lang.String attributeName)
    {
        this._attributeName = attributeName;
    } //-- void setAttributeName(java.lang.String) 

    /**
     * Sets the value of field 'attributeValue'. The field
     * 'attributeValue' has the following description:
     * ��Ϊ���ɱ��������ʱ��д�û�ѡ���������ֵ����Ϊ��ѯԪ���ݵ�����ʱ��д��ѯ����
     * 
     * @param attributeValue the value of field 'attributeValue'.
     */
    public void setAttributeValue(java.lang.String attributeValue)
    {
        this._attributeValue = attributeValue;
    } //-- void setAttributeValue(java.lang.String) 

    /**
     * Sets the value of field 'funcExpress'. The field
     * 'funcExpress' has the following description: ��Ӧ�ĺ�����
     * 
     * @param funcExpress the value of field 'funcExpress'.
     */
    public void setFuncExpress(java.lang.Object funcExpress)
    {
        this._funcExpress = funcExpress;
    } //-- void setFuncExpress(java.lang.Object) 

    /**
     * Sets the value of field 'functionID'. The field 'functionID'
     * has the following description:
     * ���ύ��������Ҫ�õ�������ʱ����Ӧ�ĺ�����ID������ʱ��ŷ�����㹫ʽID
     * 
     * @param functionID the value of field 'functionID'.
     */
    public void setFunctionID(java.lang.String functionID)
    {
        this._functionID = functionID;
    } //-- void setFunctionID(java.lang.String) 

    /**
     * Sets the value of field 'isMultiSelect'. The field
     * 'isMultiSelect' has the following description: �����Ƿ��ѡ
     * 
     * @param isMultiSelect the value of field 'isMultiSelect'.
     */
    public void setIsMultiSelect(byte isMultiSelect)
    {
        this._isMultiSelect = isMultiSelect;
        this._has_isMultiSelect = true;
    } //-- void setIsMultiSelect(byte) 

    /**
     * Sets the value of field 'objectType'. The field 'objectType'
     * has the following description:
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     * 
     * @param objectType the value of field 'objectType'.
     */
    public void setObjectType(com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType objectType)
    {
        this._objectType = objectType;
    } //-- void setObjectType(com.regaltec.rsas.common.xmlparser.types.RequisitionObjectTypeType) 

    /**
     * Sets the value of field 'optionType'. The field 'optionType'
     * has the following description:
     * opSet:�������¶������ԣ�opCondition:������ѯ������ opNormal:��ͨ������
     * opDim:ά�������� opProcedure: �洢���̵Ĳ���opLoad��װ�ض���ʽ
     * opDrill:ģ����ȡ��ǰά�ȳ�ԱID
     * 
     * @param optionType the value of field 'optionType'.
     */
    public void setOptionType(com.ccssoft.rsas.common.xmlparser.types.CommandOptionOptionTypeType optionType)
    {
        this._optionType = optionType;
    } //-- void setOptionType(com.regaltec.rsas.common.xmlparser.types.CommandOptionOptionTypeType) 

    /**
     * Sets the value of field 'queryObjectType'. The field
     * 'queryObjectType' has the following description:
     * ����Ϊ���ɱ��������ʱ�������������ڲ�ѯ����ʱ����������дɸѡ������ID�������Ϊ��ѯ��������������д���ڵĶ�������
     * 
     * @param queryObjectType the value of field 'queryObjectType'.
     */
    public void setQueryObjectType(java.lang.String queryObjectType)
    {
        this._queryObjectType = queryObjectType;
    } //-- void setQueryObjectType(java.lang.String) 

    /**
     * Sets the value of field 'querySymbol'. The field
     * 'querySymbol' has the following description:
     * ��ѯʹ�õĲ���������=��like��in��not in��
     * 
     * @param querySymbol the value of field 'querySymbol'.
     */
    public void setQuerySymbol(java.lang.String querySymbol)
    {
        this._querySymbol = querySymbol;
    } //-- void setQuerySymbol(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.CommandOption) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.CommandOption.class, reader);
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
