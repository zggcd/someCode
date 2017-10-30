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
 * Class Indicatorlist.
 * 
 * @version $Revision$ $Date$
 */
public class Indicatorlist implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _indicatorID
     */
    private java.lang.String _indicatorID;

    /**
     * Field _indicatorName
     */
    private java.lang.String _indicatorName;

    /**
     * Field _DESC
     */
    private java.lang.String _DESC;


      //----------------/
     //- Constructors -/
    //----------------/

    public Indicatorlist() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Indicatorlist()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'DESC'.
     * 
     * @return the value of field 'DESC'.
     */
    public java.lang.String getDESC()
    {
        return this._DESC;
    } //-- java.lang.String getDESC() 

    /**
     * Returns the value of field 'indicatorID'.
     * 
     * @return the value of field 'indicatorID'.
     */
    public java.lang.String getIndicatorID()
    {
        return this._indicatorID;
    } //-- java.lang.String getIndicatorID() 

    /**
     * Returns the value of field 'indicatorName'.
     * 
     * @return the value of field 'indicatorName'.
     */
    public java.lang.String getIndicatorName()
    {
        return this._indicatorName;
    } //-- java.lang.String getIndicatorName() 

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
     * Sets the value of field 'DESC'.
     * 
     * @param DESC the value of field 'DESC'.
     */
    public void setDESC(java.lang.String DESC)
    {
        this._DESC = DESC;
    } //-- void setDESC(java.lang.String) 

    /**
     * Sets the value of field 'indicatorID'.
     * 
     * @param indicatorID the value of field 'indicatorID'.
     */
    public void setIndicatorID(java.lang.String indicatorID)
    {
        this._indicatorID = indicatorID;
    } //-- void setIndicatorID(java.lang.String) 

    /**
     * Sets the value of field 'indicatorName'.
     * 
     * @param indicatorName the value of field 'indicatorName'.
     */
    public void setIndicatorName(java.lang.String indicatorName)
    {
        this._indicatorName = indicatorName;
    } //-- void setIndicatorName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Indicatorlist) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Indicatorlist.class, reader);
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
