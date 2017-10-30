/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.config.configparser;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.ccssoft.rsas.common.config.configparser.types.CommandMapCommandTypeType;
import com.ccssoft.rsas.common.config.configparser.types.CommandMapServerTypeType;

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
 * Class CommandMap.
 * 
 * @version $Revision$ $Date$
 */
public class CommandMap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��������
     */
    private com.ccssoft.rsas.common.config.configparser.types.CommandMapCommandTypeType _commandType;

    /**
     * META:Ԫ���ݷ��� APP:Ӧ�÷���
     */
    private com.ccssoft.rsas.common.config.configparser.types.CommandMapServerTypeType _serverType;


      //----------------/
     //- Constructors -/
    //----------------/

    public CommandMap() {
        super();
    } //-- com.regaltec.rsas.common.config.configparser.CommandMap()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'commandType'. The field
     * 'commandType' has the following description: ��������
     * 
     * @return the value of field 'commandType'.
     */
    public com.ccssoft.rsas.common.config.configparser.types.CommandMapCommandTypeType getCommandType()
    {
        return this._commandType;
    } //-- com.regaltec.rsas.common.config.configparser.types.CommandMapCommandTypeType getCommandType() 

    /**
     * Returns the value of field 'serverType'. The field
     * 'serverType' has the following description: META:Ԫ���ݷ���
     * APP:Ӧ�÷���
     * 
     * @return the value of field 'serverType'.
     */
    public com.ccssoft.rsas.common.config.configparser.types.CommandMapServerTypeType getServerType()
    {
        return this._serverType;
    } //-- com.regaltec.rsas.common.config.configparser.types.CommandMapServerTypeType getServerType() 

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
     * Sets the value of field 'commandType'. The field
     * 'commandType' has the following description: ��������
     * 
     * @param commandType the value of field 'commandType'.
     */
    public void setCommandType(com.ccssoft.rsas.common.config.configparser.types.CommandMapCommandTypeType commandType)
    {
        this._commandType = commandType;
    } //-- void setCommandType(com.regaltec.rsas.common.config.configparser.types.CommandMapCommandTypeType) 

    /**
     * Sets the value of field 'serverType'. The field 'serverType'
     * has the following description: META:Ԫ���ݷ��� APP:Ӧ�÷���
     * 
     * @param serverType the value of field 'serverType'.
     */
    public void setServerType(com.ccssoft.rsas.common.config.configparser.types.CommandMapServerTypeType serverType)
    {
        this._serverType = serverType;
    } //-- void setServerType(com.regaltec.rsas.common.config.configparser.types.CommandMapServerTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.config.configparser.CommandMap) Unmarshaller.unmarshal(com.ccssoft.rsas.common.config.configparser.CommandMap.class, reader);
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
