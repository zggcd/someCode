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
 * Class OperElement.
 * 
 * @version $Revision$ $Date$
 */
public class OperElement implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.lang.String _content = "";

    /**
     * Field _elementName
     */
    private java.lang.String _elementName;

    /**
     * Field _elementCode
     */
    private java.lang.String _elementCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public OperElement() {
        super();
        setContent("");
    } //-- com.regaltec.rsas.common.xmlparser.OperElement()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'content'.
     */
    public java.lang.String getContent()
    {
        return this._content;
    } //-- java.lang.String getContent() 

    /**
     * Returns the value of field 'elementCode'.
     * 
     * @return the value of field 'elementCode'.
     */
    public java.lang.String getElementCode()
    {
        return this._elementCode;
    } //-- java.lang.String getElementCode() 

    /**
     * Returns the value of field 'elementName'.
     * 
     * @return the value of field 'elementName'.
     */
    public java.lang.String getElementName()
    {
        return this._elementName;
    } //-- java.lang.String getElementName() 

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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(java.lang.String content)
    {
        this._content = content;
    } //-- void setContent(java.lang.String) 

    /**
     * Sets the value of field 'elementCode'.
     * 
     * @param elementCode the value of field 'elementCode'.
     */
    public void setElementCode(java.lang.String elementCode)
    {
        this._elementCode = elementCode;
    } //-- void setElementCode(java.lang.String) 

    /**
     * Sets the value of field 'elementName'.
     * 
     * @param elementName the value of field 'elementName'.
     */
    public void setElementName(java.lang.String elementName)
    {
        this._elementName = elementName;
    } //-- void setElementName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.OperElement) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.OperElement.class, reader);
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
