/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.gauge;

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
 * ֵ
 * 
 * @version $Revision$ $Date$
 */
public class Dial implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _value
     */
    private double _value;

    /**
     * keeps track of state for field: _value
     */
    private boolean _has_value;

    /**
     * Field _rearExtension
     */
    private int _rearExtension;

    /**
     * keeps track of state for field: _rearExtension
     */
    private boolean _has_rearExtension;

    /**
     * URL
     */
    private java.lang.String _link;


      //----------------/
     //- Constructors -/
    //----------------/

    public Dial() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.chart.gauge.Dial()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteRearExtension
     */
    public void deleteRearExtension()
    {
        this._has_rearExtension= false;
    } //-- void deleteRearExtension() 

    /**
     * Method deleteValue
     */
    public void deleteValue()
    {
        this._has_value= false;
    } //-- void deleteValue() 

    /**
     * Returns the value of field 'link'. The field 'link' has the
     * following description: URL
     * 
     * @return the value of field 'link'.
     */
    public java.lang.String getLink()
    {
        return this._link;
    } //-- java.lang.String getLink() 

    /**
     * Returns the value of field 'rearExtension'.
     * 
     * @return the value of field 'rearExtension'.
     */
    public int getRearExtension()
    {
        return this._rearExtension;
    } //-- int getRearExtension() 

    /**
     * Returns the value of field 'value'.
     * 
     * @return the value of field 'value'.
     */
    public double getValue()
    {
        return this._value;
    } //-- double getValue() 

    /**
     * Method hasRearExtension
     */
    public boolean hasRearExtension()
    {
        return this._has_rearExtension;
    } //-- boolean hasRearExtension() 

    /**
     * Method hasValue
     */
    public boolean hasValue()
    {
        return this._has_value;
    } //-- boolean hasValue() 

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
     * Sets the value of field 'link'. The field 'link' has the
     * following description: URL
     * 
     * @param link the value of field 'link'.
     */
    public void setLink(java.lang.String link)
    {
        this._link = link;
    } //-- void setLink(java.lang.String) 

    /**
     * Sets the value of field 'rearExtension'.
     * 
     * @param rearExtension the value of field 'rearExtension'.
     */
    public void setRearExtension(int rearExtension)
    {
        this._rearExtension = rearExtension;
        this._has_rearExtension = true;
    } //-- void setRearExtension(int) 

    /**
     * Sets the value of field 'value'.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(double value)
    {
        this._value = value;
        this._has_value = true;
    } //-- void setValue(double) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.gauge.Dial) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.gauge.Dial.class, reader);
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
