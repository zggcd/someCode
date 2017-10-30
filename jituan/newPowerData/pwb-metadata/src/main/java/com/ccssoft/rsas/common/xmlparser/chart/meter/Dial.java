/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.meter;

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
     * �߿���ɫ
     */
    private java.lang.String _bordercolor;

    /**
     * ������ɫ�����磺bebcb0, f0efea, bebcb0
     */
    private java.lang.String _bgColor;

    /**
     * �߿�͸����
     */
    private int _borderAlpha;

    /**
     * keeps track of state for field: _borderAlpha
     */
    private boolean _has_borderAlpha;

    /**
     * ָ��ͷ���
     */
    private int _baseWidth;

    /**
     * keeps track of state for field: _baseWidth
     */
    private boolean _has_baseWidth;

    /**
     * ָ��β���
     */
    private int _topWidth;

    /**
     * keeps track of state for field: _topWidth
     */
    private boolean _has_topWidth;

    /**
     * URL
     */
    private java.lang.String _link;


      //----------------/
     //- Constructors -/
    //----------------/

    public Dial() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Dial()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteBaseWidth
     */
    public void deleteBaseWidth()
    {
        this._has_baseWidth= false;
    } //-- void deleteBaseWidth() 

    /**
     * Method deleteBorderAlpha
     */
    public void deleteBorderAlpha()
    {
        this._has_borderAlpha= false;
    } //-- void deleteBorderAlpha() 

    /**
     * Method deleteTopWidth
     */
    public void deleteTopWidth()
    {
        this._has_topWidth= false;
    } //-- void deleteTopWidth() 

    /**
     * Method deleteValue
     */
    public void deleteValue()
    {
        this._has_value= false;
    } //-- void deleteValue() 

    /**
     * Returns the value of field 'baseWidth'. The field
     * 'baseWidth' has the following description: ָ��ͷ���
     * 
     * @return the value of field 'baseWidth'.
     */
    public int getBaseWidth()
    {
        return this._baseWidth;
    } //-- int getBaseWidth() 

    /**
     * Returns the value of field 'bgColor'. The field 'bgColor'
     * has the following description: ������ɫ�����磺bebcb0, f0efea,
     * bebcb0
     * 
     * @return the value of field 'bgColor'.
     */
    public java.lang.String getBgColor()
    {
        return this._bgColor;
    } //-- java.lang.String getBgColor() 

    /**
     * Returns the value of field 'borderAlpha'. The field
     * 'borderAlpha' has the following description: �߿�͸����
     * 
     * @return the value of field 'borderAlpha'.
     */
    public int getBorderAlpha()
    {
        return this._borderAlpha;
    } //-- int getBorderAlpha() 

    /**
     * Returns the value of field 'bordercolor'. The field
     * 'bordercolor' has the following description: �߿���ɫ
     * 
     * @return the value of field 'bordercolor'.
     */
    public java.lang.String getBordercolor()
    {
        return this._bordercolor;
    } //-- java.lang.String getBordercolor() 

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
     * Returns the value of field 'topWidth'. The field 'topWidth'
     * has the following description: ָ��β���
     * 
     * @return the value of field 'topWidth'.
     */
    public int getTopWidth()
    {
        return this._topWidth;
    } //-- int getTopWidth() 

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
     * Method hasBaseWidth
     */
    public boolean hasBaseWidth()
    {
        return this._has_baseWidth;
    } //-- boolean hasBaseWidth() 

    /**
     * Method hasBorderAlpha
     */
    public boolean hasBorderAlpha()
    {
        return this._has_borderAlpha;
    } //-- boolean hasBorderAlpha() 

    /**
     * Method hasTopWidth
     */
    public boolean hasTopWidth()
    {
        return this._has_topWidth;
    } //-- boolean hasTopWidth() 

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
     * Sets the value of field 'baseWidth'. The field 'baseWidth'
     * has the following description: ָ��ͷ���
     * 
     * @param baseWidth the value of field 'baseWidth'.
     */
    public void setBaseWidth(int baseWidth)
    {
        this._baseWidth = baseWidth;
        this._has_baseWidth = true;
    } //-- void setBaseWidth(int) 

    /**
     * Sets the value of field 'bgColor'. The field 'bgColor' has
     * the following description: ������ɫ�����磺bebcb0, f0efea, bebcb0
     * 
     * @param bgColor the value of field 'bgColor'.
     */
    public void setBgColor(java.lang.String bgColor)
    {
        this._bgColor = bgColor;
    } //-- void setBgColor(java.lang.String) 

    /**
     * Sets the value of field 'borderAlpha'. The field
     * 'borderAlpha' has the following description: �߿�͸����
     * 
     * @param borderAlpha the value of field 'borderAlpha'.
     */
    public void setBorderAlpha(int borderAlpha)
    {
        this._borderAlpha = borderAlpha;
        this._has_borderAlpha = true;
    } //-- void setBorderAlpha(int) 

    /**
     * Sets the value of field 'bordercolor'. The field
     * 'bordercolor' has the following description: �߿���ɫ
     * 
     * @param bordercolor the value of field 'bordercolor'.
     */
    public void setBordercolor(java.lang.String bordercolor)
    {
        this._bordercolor = bordercolor;
    } //-- void setBordercolor(java.lang.String) 

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
     * Sets the value of field 'topWidth'. The field 'topWidth' has
     * the following description: ָ��β���
     * 
     * @param topWidth the value of field 'topWidth'.
     */
    public void setTopWidth(int topWidth)
    {
        this._topWidth = topWidth;
        this._has_topWidth = true;
    } //-- void setTopWidth(int) 

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
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.Dial) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.meter.Dial.class, reader);
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
