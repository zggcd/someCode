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

import com.ccssoft.rsas.common.xmlparser.types.FunParamValueParamObjectTypeType;

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
 * Class FunParamValue.
 * 
 * @version $Revision$ $Date$
 */
public class FunParamValue implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _paramValue
     */
    private java.lang.String _paramValue;

    /**
     * ����ֵ��Դ����ɸѡ������ά�ȣ���
     */
    private com.ccssoft.rsas.common.xmlparser.types.FunParamValueParamObjectTypeType _paramObjectType;


      //----------------/
     //- Constructors -/
    //----------------/

    public FunParamValue() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.FunParamValue()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'paramObjectType'. The field
     * 'paramObjectType' has the following description:
     * ����ֵ��Դ����ɸѡ������ά�ȣ���
     * 
     * @return the value of field 'paramObjectType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.FunParamValueParamObjectTypeType getParamObjectType()
    {
        return this._paramObjectType;
    } //-- com.regaltec.rsas.common.xmlparser.types.FunParamValueParamObjectTypeType getParamObjectType() 

    /**
     * Returns the value of field 'paramValue'.
     * 
     * @return the value of field 'paramValue'.
     */
    public java.lang.String getParamValue()
    {
        return this._paramValue;
    } //-- java.lang.String getParamValue() 

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
     * Sets the value of field 'paramObjectType'. The field
     * 'paramObjectType' has the following description:
     * ����ֵ��Դ����ɸѡ������ά�ȣ���
     * 
     * @param paramObjectType the value of field 'paramObjectType'.
     */
    public void setParamObjectType(com.ccssoft.rsas.common.xmlparser.types.FunParamValueParamObjectTypeType paramObjectType)
    {
        this._paramObjectType = paramObjectType;
    } //-- void setParamObjectType(com.regaltec.rsas.common.xmlparser.types.FunParamValueParamObjectTypeType) 

    /**
     * Sets the value of field 'paramValue'.
     * 
     * @param paramValue the value of field 'paramValue'.
     */
    public void setParamValue(java.lang.String paramValue)
    {
        this._paramValue = paramValue;
    } //-- void setParamValue(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.FunParamValue) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.FunParamValue.class, reader);
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
