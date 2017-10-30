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
 * Class DimensionHeader.
 * 
 * @version $Revision$ $Date$
 */
public class DimensionHeader implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fieldName
     */
    private java.lang.String _fieldName;

    /**
     * Field _caption
     */
    private java.lang.String _caption;

    /**
     * Field _dimensionID
     */
    private java.lang.String _dimensionID;


      //----------------/
     //- Constructors -/
    //----------------/

    public DimensionHeader() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.DimensionHeader()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'caption'.
     * 
     * @return the value of field 'caption'.
     */
    public java.lang.String getCaption()
    {
        return this._caption;
    } //-- java.lang.String getCaption() 

    /**
     * Returns the value of field 'dimensionID'.
     * 
     * @return the value of field 'dimensionID'.
     */
    public java.lang.String getDimensionID()
    {
        return this._dimensionID;
    } //-- java.lang.String getDimensionID() 

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
     * Sets the value of field 'caption'.
     * 
     * @param caption the value of field 'caption'.
     */
    public void setCaption(java.lang.String caption)
    {
        this._caption = caption;
    } //-- void setCaption(java.lang.String) 

    /**
     * Sets the value of field 'dimensionID'.
     * 
     * @param dimensionID the value of field 'dimensionID'.
     */
    public void setDimensionID(java.lang.String dimensionID)
    {
        this._dimensionID = dimensionID;
    } //-- void setDimensionID(java.lang.String) 

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
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DimensionHeader) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DimensionHeader.class, reader);
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
