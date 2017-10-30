/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.saschart;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.ccssoft.rsas.common.saschart.types.BarSeriesStyleType;
import com.ccssoft.rsas.common.saschart.types.LineSeriesPointStyleType;

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
 * ����ͼ���󣬵�SeriesTypeΪLine��FastLineʱʹ�øö����������
 * 
 * @version $Revision$ $Date$
 */
public class LineSeries implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��ǰϵ�е���ɫ
     */
    private int _lineColor;

    /**
     * keeps track of state for field: _lineColor
     */
    private boolean _has_lineColor;

    /**
     * Field _pointVisible
     */
    private byte _pointVisible;

    /**
     * keeps track of state for field: _pointVisible
     */
    private boolean _has_pointVisible;

    /**
     * Field _pointStyle
     */
    private com.ccssoft.rsas.common.saschart.types.LineSeriesPointStyleType _pointStyle;

    /**
     * Field _pointWidth
     */
    private short _pointWidth;

    /**
     * keeps track of state for field: _pointWidth
     */
    private boolean _has_pointWidth;

    /**
     * Field _pointHeight
     */
    private short _pointHeight;

    /**
     * keeps track of state for field: _pointHeight
     */
    private boolean _has_pointHeight;

    /**
     * Field _borderVisible
     */
    private byte _borderVisible;

    /**
     * keeps track of state for field: _borderVisible
     */
    private boolean _has_borderVisible;

    /**
     * ����
     */
    private com.ccssoft.rsas.common.saschart.types.BarSeriesStyleType _style;

    /**
     * Field _color
     */
    private int _color;

    /**
     * keeps track of state for field: _color
     */
    private boolean _has_color;

    /**
     * �߿�
     */
    private int _width;

    /**
     * keeps track of state for field: _width
     */
    private boolean _has_width;


      //----------------/
     //- Constructors -/
    //----------------/

    public LineSeries() {
        super();
    } //-- com.regaltec.rsas.common.saschart.LineSeries()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteBorderVisible
     */
    public void deleteBorderVisible()
    {
        this._has_borderVisible= false;
    } //-- void deleteBorderVisible() 

    /**
     * Method deleteColor
     */
    public void deleteColor()
    {
        this._has_color= false;
    } //-- void deleteColor() 

    /**
     * Method deleteLineColor
     */
    public void deleteLineColor()
    {
        this._has_lineColor= false;
    } //-- void deleteLineColor() 

    /**
     * Method deletePointHeight
     */
    public void deletePointHeight()
    {
        this._has_pointHeight= false;
    } //-- void deletePointHeight() 

    /**
     * Method deletePointVisible
     */
    public void deletePointVisible()
    {
        this._has_pointVisible= false;
    } //-- void deletePointVisible() 

    /**
     * Method deletePointWidth
     */
    public void deletePointWidth()
    {
        this._has_pointWidth= false;
    } //-- void deletePointWidth() 

    /**
     * Method deleteWidth
     */
    public void deleteWidth()
    {
        this._has_width= false;
    } //-- void deleteWidth() 

    /**
     * Returns the value of field 'borderVisible'.
     * 
     * @return the value of field 'borderVisible'.
     */
    public byte getBorderVisible()
    {
        return this._borderVisible;
    } //-- byte getBorderVisible() 

    /**
     * Returns the value of field 'color'.
     * 
     * @return the value of field 'color'.
     */
    public int getColor()
    {
        return this._color;
    } //-- int getColor() 

    /**
     * Returns the value of field 'lineColor'. The field
     * 'lineColor' has the following description: ��ǰϵ�е���ɫ
     * 
     * @return the value of field 'lineColor'.
     */
    public int getLineColor()
    {
        return this._lineColor;
    } //-- int getLineColor() 

    /**
     * Returns the value of field 'pointHeight'.
     * 
     * @return the value of field 'pointHeight'.
     */
    public short getPointHeight()
    {
        return this._pointHeight;
    } //-- short getPointHeight() 

    /**
     * Returns the value of field 'pointStyle'.
     * 
     * @return the value of field 'pointStyle'.
     */
    public com.ccssoft.rsas.common.saschart.types.LineSeriesPointStyleType getPointStyle()
    {
        return this._pointStyle;
    } //-- com.regaltec.rsas.common.saschart.types.LineSeriesPointStyleType getPointStyle() 

    /**
     * Returns the value of field 'pointVisible'.
     * 
     * @return the value of field 'pointVisible'.
     */
    public byte getPointVisible()
    {
        return this._pointVisible;
    } //-- byte getPointVisible() 

    /**
     * Returns the value of field 'pointWidth'.
     * 
     * @return the value of field 'pointWidth'.
     */
    public short getPointWidth()
    {
        return this._pointWidth;
    } //-- short getPointWidth() 

    /**
     * Returns the value of field 'style'. The field 'style' has
     * the following description: ����
     * 
     * @return the value of field 'style'.
     */
    public com.ccssoft.rsas.common.saschart.types.BarSeriesStyleType getStyle()
    {
        return this._style;
    } //-- com.regaltec.rsas.common.saschart.types.BarSeriesStyleType getStyle() 

    /**
     * Returns the value of field 'width'. The field 'width' has
     * the following description: �߿�
     * 
     * @return the value of field 'width'.
     */
    public int getWidth()
    {
        return this._width;
    } //-- int getWidth() 

    /**
     * Method hasBorderVisible
     */
    public boolean hasBorderVisible()
    {
        return this._has_borderVisible;
    } //-- boolean hasBorderVisible() 

    /**
     * Method hasColor
     */
    public boolean hasColor()
    {
        return this._has_color;
    } //-- boolean hasColor() 

    /**
     * Method hasLineColor
     */
    public boolean hasLineColor()
    {
        return this._has_lineColor;
    } //-- boolean hasLineColor() 

    /**
     * Method hasPointHeight
     */
    public boolean hasPointHeight()
    {
        return this._has_pointHeight;
    } //-- boolean hasPointHeight() 

    /**
     * Method hasPointVisible
     */
    public boolean hasPointVisible()
    {
        return this._has_pointVisible;
    } //-- boolean hasPointVisible() 

    /**
     * Method hasPointWidth
     */
    public boolean hasPointWidth()
    {
        return this._has_pointWidth;
    } //-- boolean hasPointWidth() 

    /**
     * Method hasWidth
     */
    public boolean hasWidth()
    {
        return this._has_width;
    } //-- boolean hasWidth() 

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
     * Sets the value of field 'borderVisible'.
     * 
     * @param borderVisible the value of field 'borderVisible'.
     */
    public void setBorderVisible(byte borderVisible)
    {
        this._borderVisible = borderVisible;
        this._has_borderVisible = true;
    } //-- void setBorderVisible(byte) 

    /**
     * Sets the value of field 'color'.
     * 
     * @param color the value of field 'color'.
     */
    public void setColor(int color)
    {
        this._color = color;
        this._has_color = true;
    } //-- void setColor(int) 

    /**
     * Sets the value of field 'lineColor'. The field 'lineColor'
     * has the following description: ��ǰϵ�е���ɫ
     * 
     * @param lineColor the value of field 'lineColor'.
     */
    public void setLineColor(int lineColor)
    {
        this._lineColor = lineColor;
        this._has_lineColor = true;
    } //-- void setLineColor(int) 

    /**
     * Sets the value of field 'pointHeight'.
     * 
     * @param pointHeight the value of field 'pointHeight'.
     */
    public void setPointHeight(short pointHeight)
    {
        this._pointHeight = pointHeight;
        this._has_pointHeight = true;
    } //-- void setPointHeight(short) 

    /**
     * Sets the value of field 'pointStyle'.
     * 
     * @param pointStyle the value of field 'pointStyle'.
     */
    public void setPointStyle(com.ccssoft.rsas.common.saschart.types.LineSeriesPointStyleType pointStyle)
    {
        this._pointStyle = pointStyle;
    } //-- void setPointStyle(com.regaltec.rsas.common.saschart.types.LineSeriesPointStyleType) 

    /**
     * Sets the value of field 'pointVisible'.
     * 
     * @param pointVisible the value of field 'pointVisible'.
     */
    public void setPointVisible(byte pointVisible)
    {
        this._pointVisible = pointVisible;
        this._has_pointVisible = true;
    } //-- void setPointVisible(byte) 

    /**
     * Sets the value of field 'pointWidth'.
     * 
     * @param pointWidth the value of field 'pointWidth'.
     */
    public void setPointWidth(short pointWidth)
    {
        this._pointWidth = pointWidth;
        this._has_pointWidth = true;
    } //-- void setPointWidth(short) 

    /**
     * Sets the value of field 'style'. The field 'style' has the
     * following description: ����
     * 
     * @param style the value of field 'style'.
     */
    public void setStyle(com.ccssoft.rsas.common.saschart.types.BarSeriesStyleType style)
    {
        this._style = style;
    } //-- void setStyle(com.regaltec.rsas.common.saschart.types.BarSeriesStyleType) 

    /**
     * Sets the value of field 'width'. The field 'width' has the
     * following description: �߿�
     * 
     * @param width the value of field 'width'.
     */
    public void setWidth(int width)
    {
        this._width = width;
        this._has_width = true;
    } //-- void setWidth(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.saschart.LineSeries) Unmarshaller.unmarshal(com.ccssoft.rsas.common.saschart.LineSeries.class, reader);
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
