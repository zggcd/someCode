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
 * Class BindProcedureParam.
 * 
 * @version $Revision$ $Date$
 */
public class BindProcedureParam implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _queryID
     */
    private java.lang.String _queryID;

    /**
     * Field _conditionID
     */
    private java.lang.String _conditionID;

    /**
     * Field _procedureName
     */
    private java.lang.String _procedureName;

    /**
     * Field _paramName
     */
    private java.lang.String _paramName;

    /**
     * Field _defaultValue
     */
    private java.lang.String _defaultValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public BindProcedureParam() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.BindProcedureParam()


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
     * Returns the value of field 'procedureName'.
     * 
     * @return the value of field 'procedureName'.
     */
    public java.lang.String getProcedureName()
    {
        return this._procedureName;
    } //-- java.lang.String getProcedureName() 

    /**
     * Returns the value of field 'queryID'.
     * 
     * @return the value of field 'queryID'.
     */
    public java.lang.String getQueryID()
    {
        return this._queryID;
    } //-- java.lang.String getQueryID() 

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
     * Sets the value of field 'procedureName'.
     * 
     * @param procedureName the value of field 'procedureName'.
     */
    public void setProcedureName(java.lang.String procedureName)
    {
        this._procedureName = procedureName;
    } //-- void setProcedureName(java.lang.String) 

    /**
     * Sets the value of field 'queryID'.
     * 
     * @param queryID the value of field 'queryID'.
     */
    public void setQueryID(java.lang.String queryID)
    {
        this._queryID = queryID;
    } //-- void setQueryID(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.BindProcedureParam) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.BindProcedureParam.class, reader);
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
