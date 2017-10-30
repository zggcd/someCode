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
 * ��ɫ�뷶Χֵ�Ĺ�ϵ
 * 
 * @version $Revision$ $Date$
 */
public class Color implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _minValue
     */
    private double _minValue;

    /**
     * keeps track of state for field: _minValue
     */
    private boolean _has_minValue;

    /**
     * Field _maxValue
     */
    private double _maxValue;

    /**
     * keeps track of state for field: _maxValue
     */
    private boolean _has_maxValue;

    /**
     * ��ɫ
     */
    private java.lang.String _code;

    /**
     * Field _alpha
     */
    private int _alpha;

    /**
     * keeps track of state for field: _alpha
     */
    private boolean _has_alpha;


      //----------------/
     //- Constructors -/
    //----------------/

    public Color() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.chart.gauge.Color()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAlpha
     */
    public void deleteAlpha()
    {
        this._has_alpha= false;
    } //-- void deleteAlpha() 

    /**
     * Method deleteMaxValue
     */
    public void deleteMaxValue()
    {
        this._has_maxValue= false;
    } //-- void deleteMaxValue() 

    /**
     * Method deleteMinValue
     */
    public void deleteMinValue()
    {
        this._has_minValue= false;
    } //-- void deleteMinValue() 

    /**
     * Returns the value of field 'alpha'.
     * 
     * @return the value of field 'alpha'.
     */
    public int getAlpha()
    {
        return this._alpha;
    } //-- int getAlpha() 

    /**
     * Returns the value of field 'code'. The field 'code' has the
     * following description: ��ɫ
     * 
     * @return the value of field 'code'.
     */
    public java.lang.String getCode()
    {
        return this._code;
    } //-- java.lang.String getCode() 

    /**
     * Returns the value of field 'maxValue'.
     * 
     * @return the value of field 'maxValue'.
     */
    public double getMaxValue()
    {
        return this._maxValue;
    } //-- double getMaxValue() 

    /**
     * Returns the value of field 'minValue'.
     * 
     * @return the value of field 'minValue'.
     */
    public double getMinValue()
    {
        return this._minValue;
    } //-- double getMinValue() 

    /**
     * Method hasAlpha
     */
    public boolean hasAlpha()
    {
        return this._has_alpha;
    } //-- boolean hasAlpha() 

    /**
     * Method hasMaxValue
     */
    public boolean hasMaxValue()
    {
        return this._has_maxValue;
    } //-- boolean hasMaxValue() 

    /**
     * Method hasMinValue
     */
    public boolean hasMinValue()
    {
        return this._has_minValue;
    } //-- boolean hasMinValue() 

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
     * Sets the value of field 'alpha'.
     * 
     * @param alpha the value of field 'alpha'.
     */
    public void setAlpha(int alpha)
    {
        this._alpha = alpha;
        this._has_alpha = true;
    } //-- void setAlpha(int) 

    /**
     * Sets the value of field 'code'. The field 'code' has the
     * following description: ��ɫ
     * 
     * @param code the value of field 'code'.
     */
    public void setCode(java.lang.String code)
    {
        this._code = code;
    } //-- void setCode(java.lang.String) 

    /**
     * Sets the value of field 'maxValue'.
     * 
     * @param maxValue the value of field 'maxValue'.
     */
    public void setMaxValue(double maxValue)
    {
        this._maxValue = maxValue;
        this._has_maxValue = true;
    } //-- void setMaxValue(double) 

    /**
     * Sets the value of field 'minValue'.
     * 
     * @param minValue the value of field 'minValue'.
     */
    public void setMinValue(double minValue)
    {
        this._minValue = minValue;
        this._has_minValue = true;
    } //-- void setMinValue(double) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.gauge.Color) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.gauge.Color.class, reader);
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
