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

import com.ccssoft.rsas.common.xmlparser.types.RefObjectRefObjectTypeType;

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
 * �������ñ������
 * 
 * @version $Revision$ $Date$
 */
public class RefObject implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _refObjectType
     */
    private com.ccssoft.rsas.common.xmlparser.types.RefObjectRefObjectTypeType _refObjectType;

    /**
     * Field _objectID
     */
    private java.lang.String _objectID;

    /**
     * Field _objectName
     */
    private java.lang.String _objectName;


      //----------------/
     //- Constructors -/
    //----------------/

    public RefObject() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.RefObject()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'objectID'.
     * 
     * @return the value of field 'objectID'.
     */
    public java.lang.String getObjectID()
    {
        return this._objectID;
    } //-- java.lang.String getObjectID() 

    /**
     * Returns the value of field 'objectName'.
     * 
     * @return the value of field 'objectName'.
     */
    public java.lang.String getObjectName()
    {
        return this._objectName;
    } //-- java.lang.String getObjectName() 

    /**
     * Returns the value of field 'refObjectType'.
     * 
     * @return the value of field 'refObjectType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.RefObjectRefObjectTypeType getRefObjectType()
    {
        return this._refObjectType;
    } //-- com.regaltec.rsas.common.xmlparser.types.RefObjectRefObjectTypeType getRefObjectType() 

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
     * Sets the value of field 'objectID'.
     * 
     * @param objectID the value of field 'objectID'.
     */
    public void setObjectID(java.lang.String objectID)
    {
        this._objectID = objectID;
    } //-- void setObjectID(java.lang.String) 

    /**
     * Sets the value of field 'objectName'.
     * 
     * @param objectName the value of field 'objectName'.
     */
    public void setObjectName(java.lang.String objectName)
    {
        this._objectName = objectName;
    } //-- void setObjectName(java.lang.String) 

    /**
     * Sets the value of field 'refObjectType'.
     * 
     * @param refObjectType the value of field 'refObjectType'.
     */
    public void setRefObjectType(com.ccssoft.rsas.common.xmlparser.types.RefObjectRefObjectTypeType refObjectType)
    {
        this._refObjectType = refObjectType;
    } //-- void setRefObjectType(com.regaltec.rsas.common.xmlparser.types.RefObjectRefObjectTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.RefObject) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.RefObject.class, reader);
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
