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

import com.ccssoft.rsas.common.xmlparser.types.ProcedureParamParamTypeType;
import com.ccssoft.rsas.common.xmlparser.types.ProcedureParamSQLDataTypeType;

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
 * Class ProcedureParam.
 * 
 * @version $Revision$ $Date$
 */
public class ProcedureParam implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _paramName
     */
    private java.lang.String _paramName;

    /**
     * Field _paramType
     */
    private com.ccssoft.rsas.common.xmlparser.types.ProcedureParamParamTypeType _paramType;

    /**
     * ���ݿ��ֶ���������
     */
    private com.ccssoft.rsas.common.xmlparser.types.ProcedureParamSQLDataTypeType _SQLDataType;

    /**
     * Field _conditionID
     */
    private java.lang.String _conditionID;

    /**
     * Field _defaultValue
     */
    private java.lang.String _defaultValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProcedureParam() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.ProcedureParam()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'conditionID'.
     * 
     * @return the value of field 'conditionID'.
     */
    public java.lang.String getConditionID()
    {
        return this._conditionID;
    } //-- java.lang.String getConditionID() 

    /**
     * Returns the value of field 'defaultValue'.
     * 
     * @return the value of field 'defaultValue'.
     */
    public java.lang.String getDefaultValue()
    {
        return this._defaultValue;
    } //-- java.lang.String getDefaultValue() 

    /**
     * Returns the value of field 'paramName'.
     * 
     * @return the value of field 'paramName'.
     */
    public java.lang.String getParamName()
    {
        return this._paramName;
    } //-- java.lang.String getParamName() 

    /**
     * Returns the value of field 'paramType'.
     * 
     * @return the value of field 'paramType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.ProcedureParamParamTypeType getParamType()
    {
        return this._paramType;
    } //-- com.regaltec.rsas.common.xmlparser.types.ProcedureParamParamTypeType getParamType() 

    /**
     * Returns the value of field 'SQLDataType'. The field
     * 'SQLDataType' has the following description: ���ݿ��ֶ���������
     * 
     * @return the value of field 'SQLDataType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.ProcedureParamSQLDataTypeType getSQLDataType()
    {
        return this._SQLDataType;
    } //-- com.regaltec.rsas.common.xmlparser.types.ProcedureParamSQLDataTypeType getSQLDataType() 

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
     * Sets the value of field 'conditionID'.
     * 
     * @param conditionID the value of field 'conditionID'.
     */
    public void setConditionID(java.lang.String conditionID)
    {
        this._conditionID = conditionID;
    } //-- void setConditionID(java.lang.String) 

    /**
     * Sets the value of field 'defaultValue'.
     * 
     * @param defaultValue the value of field 'defaultValue'.
     */
    public void setDefaultValue(java.lang.String defaultValue)
    {
        this._defaultValue = defaultValue;
    } //-- void setDefaultValue(java.lang.String) 

    /**
     * Sets the value of field 'paramName'.
     * 
     * @param paramName the value of field 'paramName'.
     */
    public void setParamName(java.lang.String paramName)
    {
        this._paramName = paramName;
    } //-- void setParamName(java.lang.String) 

    /**
     * Sets the value of field 'paramType'.
     * 
     * @param paramType the value of field 'paramType'.
     */
    public void setParamType(com.ccssoft.rsas.common.xmlparser.types.ProcedureParamParamTypeType paramType)
    {
        this._paramType = paramType;
    } //-- void setParamType(com.regaltec.rsas.common.xmlparser.types.ProcedureParamParamTypeType) 

    /**
     * Sets the value of field 'SQLDataType'. The field
     * 'SQLDataType' has the following description: ���ݿ��ֶ���������
     * 
     * @param SQLDataType the value of field 'SQLDataType'.
     */
    public void setSQLDataType(com.ccssoft.rsas.common.xmlparser.types.ProcedureParamSQLDataTypeType SQLDataType)
    {
        this._SQLDataType = SQLDataType;
    } //-- void setSQLDataType(com.regaltec.rsas.common.xmlparser.types.ProcedureParamSQLDataTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ProcedureParam) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ProcedureParam.class, reader);
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
