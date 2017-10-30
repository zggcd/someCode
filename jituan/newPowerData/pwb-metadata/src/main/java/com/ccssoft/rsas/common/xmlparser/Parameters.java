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

import com.ccssoft.rsas.common.xmlparser.types.ParametersParamsDataTypeType;
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
 * Class Parameters.
 * 
 * @version $Revision$ $Date$
 */
public class Parameters implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ������������
     */
    private com.ccssoft.rsas.common.xmlparser.types.ParametersParamsDataTypeType _paramsDataType;

    /**
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     */
    private com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType _objectType;

    /**
     * ��������
     */
    private java.lang.Object _paramsDesc;

    /**
     * Field _optional
     */
    private java.lang.String _optional;


      //----------------/
     //- Constructors -/
    //----------------/

    public Parameters() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Parameters()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'optional'.
     * 
     * @return the value of field 'optional'.
     */
    public java.lang.String getOptional()
    {
        return this._optional;
    } //-- java.lang.String getOptional() 

    /**
     * Returns the value of field 'paramsDataType'. The field
     * 'paramsDataType' has the following description: ������������
     * 
     * @return the value of field 'paramsDataType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.ParametersParamsDataTypeType getParamsDataType()
    {
        return this._paramsDataType;
    } //-- com.regaltec.rsas.common.xmlparser.types.ParametersParamsDataTypeType getParamsDataType() 

    /**
     * Returns the value of field 'paramsDesc'. The field
     * 'paramsDesc' has the following description: ��������
     * 
     * @return the value of field 'paramsDesc'.
     */
    public java.lang.Object getParamsDesc()
    {
        return this._paramsDesc;
    } //-- java.lang.Object getParamsDesc() 

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
     * Sets the value of field 'optional'.
     * 
     * @param optional the value of field 'optional'.
     */
    public void setOptional(java.lang.String optional)
    {
        this._optional = optional;
    } //-- void setOptional(java.lang.String) 

    /**
     * Sets the value of field 'paramsDataType'. The field
     * 'paramsDataType' has the following description: ������������
     * 
     * @param paramsDataType the value of field 'paramsDataType'.
     */
    public void setParamsDataType(com.ccssoft.rsas.common.xmlparser.types.ParametersParamsDataTypeType paramsDataType)
    {
        this._paramsDataType = paramsDataType;
    } //-- void setParamsDataType(com.regaltec.rsas.common.xmlparser.types.ParametersParamsDataTypeType) 

    /**
     * Sets the value of field 'paramsDesc'. The field 'paramsDesc'
     * has the following description: ��������
     * 
     * @param paramsDesc the value of field 'paramsDesc'.
     */
    public void setParamsDesc(java.lang.Object paramsDesc)
    {
        this._paramsDesc = paramsDesc;
    } //-- void setParamsDesc(java.lang.Object) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Parameters) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Parameters.class, reader);
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
