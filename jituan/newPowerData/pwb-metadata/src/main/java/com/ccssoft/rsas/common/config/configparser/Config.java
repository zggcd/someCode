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
 * Comment describing your root element
 * 
 * @version $Revision$ $Date$
 */
public class Config implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _runTimeParameter
     */
    private com.ccssoft.rsas.common.config.configparser.RunTimeParameter _runTimeParameter;

    /**
     * Field _objectFactory
     */
    private com.ccssoft.rsas.common.config.configparser.ObjectFactory _objectFactory;

    /**
     * Field _commandMaps
     */
    private com.ccssoft.rsas.common.config.configparser.CommandMaps _commandMaps;


      //----------------/
     //- Constructors -/
    //----------------/

    public Config() {
        super();
    } //-- com.regaltec.rsas.common.config.configparser.Config()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'commandMaps'.
     * 
     * @return the value of field 'commandMaps'.
     */
    public com.ccssoft.rsas.common.config.configparser.CommandMaps getCommandMaps()
    {
        return this._commandMaps;
    } //-- com.regaltec.rsas.common.config.configparser.CommandMaps getCommandMaps() 

    /**
     * Returns the value of field 'objectFactory'.
     * 
     * @return the value of field 'objectFactory'.
     */
    public com.ccssoft.rsas.common.config.configparser.ObjectFactory getObjectFactory()
    {
        return this._objectFactory;
    } //-- com.regaltec.rsas.common.config.configparser.ObjectFactory getObjectFactory() 

    /**
     * Returns the value of field 'runTimeParameter'.
     * 
     * @return the value of field 'runTimeParameter'.
     */
    public com.ccssoft.rsas.common.config.configparser.RunTimeParameter getRunTimeParameter()
    {
        return this._runTimeParameter;
    } //-- com.regaltec.rsas.common.config.configparser.RunTimeParameter getRunTimeParameter() 

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
     * Sets the value of field 'commandMaps'.
     * 
     * @param commandMaps the value of field 'commandMaps'.
     */
    public void setCommandMaps(com.ccssoft.rsas.common.config.configparser.CommandMaps commandMaps)
    {
        this._commandMaps = commandMaps;
    } //-- void setCommandMaps(com.regaltec.rsas.common.config.configparser.CommandMaps) 

    /**
     * Sets the value of field 'objectFactory'.
     * 
     * @param objectFactory the value of field 'objectFactory'.
     */
    public void setObjectFactory(com.ccssoft.rsas.common.config.configparser.ObjectFactory objectFactory)
    {
        this._objectFactory = objectFactory;
    } //-- void setObjectFactory(com.regaltec.rsas.common.config.configparser.ObjectFactory) 

    /**
     * Sets the value of field 'runTimeParameter'.
     * 
     * @param runTimeParameter the value of field 'runTimeParameter'
     */
    public void setRunTimeParameter(com.ccssoft.rsas.common.config.configparser.RunTimeParameter runTimeParameter)
    {
        this._runTimeParameter = runTimeParameter;
    } //-- void setRunTimeParameter(com.regaltec.rsas.common.config.configparser.RunTimeParameter) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.config.configparser.Config) Unmarshaller.unmarshal(com.ccssoft.rsas.common.config.configparser.Config.class, reader);
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
