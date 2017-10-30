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
import com.ccssoft.rsas.common.saschart.types.PieSeriesDirectionType;

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
 * ��ͼ���󣬵�SeriesTypeΪPie��Donutʱʹ�øö����������
 * 
 * @version $Revision$ $Date$
 */
public class PieSeries implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �Ƿ�Ϊ��Բ��
     */
    private byte _circled;

    /**
     * keeps track of state for field: _circled
     */
    private boolean _has_circled;

    /**
     * Field _gradientVisible
     */
    private byte _gradientVisible;

    /**
     * keeps track of state for field: _gradientVisible
     */
    private boolean _has_gradientVisible;

    /**
     * ������ʼ��ɫ
     */
    private int _startColor;

    /**
     * keeps track of state for field: _startColor
     */
    private boolean _has_startColor;

    /**
     * �����м���ɫ
     */
    private int _middleColor;

    /**
     * keeps track of state for field: _middleColor
     */
    private boolean _has_middleColor;

    /**
     * ���������ɫ
     */
    private int _endColor;

    /**
     * keeps track of state for field: _endColor
     */
    private boolean _has_endColor;

    /**
     * �Ƿ����ý����м�ɫ
     */
    private byte _useMiddle;

    /**
     * keeps track of state for field: _useMiddle
     */
    private boolean _has_useMiddle;

    /**
     * ����ɫ��������
     */
    private com.ccssoft.rsas.common.saschart.types.PieSeriesDirectionType _direction;

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

    public PieSeries() {
        super();
    } //-- com.regaltec.rsas.common.saschart.PieSeries()


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
     * Method deleteCircled
     */
    public void deleteCircled()
    {
        this._has_circled= false;
    } //-- void deleteCircled() 

    /**
     * Method deleteColor
     */
    public void deleteColor()
    {
        this._has_color= false;
    } //-- void deleteColor() 

    /**
     * Method deleteEndColor
     */
    public void deleteEndColor()
    {
        this._has_endColor= false;
    } //-- void deleteEndColor() 

    /**
     * Method deleteGradientVisible
     */
    public void deleteGradientVisible()
    {
        this._has_gradientVisible= false;
    } //-- void deleteGradientVisible() 

    /**
     * Method deleteMiddleColor
     */
    public void deleteMiddleColor()
    {
        this._has_middleColor= false;
    } //-- void deleteMiddleColor() 

    /**
     * Method deleteStartColor
     */
    public void deleteStartColor()
    {
        this._has_startColor= false;
    } //-- void deleteStartColor() 

    /**
     * Method deleteUseMiddle
     */
    public void deleteUseMiddle()
    {
        this._has_useMiddle= false;
    } //-- void deleteUseMiddle() 

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
     * Returns the value of field 'circled'. The field 'circled'
     * has the following description: �Ƿ�Ϊ��Բ��
     * 
     * @return the value of field 'circled'.
     */
    public byte getCircled()
    {
        return this._circled;
    } //-- byte getCircled() 

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
     * Returns the value of field 'direction'. The field
     * 'direction' has the following description: ����ɫ��������
     * 
     * @return the value of field 'direction'.
     */
    public com.ccssoft.rsas.common.saschart.types.PieSeriesDirectionType getDirection()
    {
        return this._direction;
    } //-- com.regaltec.rsas.common.saschart.types.PieSeriesDirectionType getDirection() 

    /**
     * Returns the value of field 'endColor'. The field 'endColor'
     * has the following description: ���������ɫ
     * 
     * @return the value of field 'endColor'.
     */
    public int getEndColor()
    {
        return this._endColor;
    } //-- int getEndColor() 

    /**
     * Returns the value of field 'gradientVisible'.
     * 
     * @return the value of field 'gradientVisible'.
     */
    public byte getGradientVisible()
    {
        return this._gradientVisible;
    } //-- byte getGradientVisible() 

    /**
     * Returns the value of field 'middleColor'. The field
     * 'middleColor' has the following description: �����м���ɫ
     * 
     * @return the value of field 'middleColor'.
     */
    public int getMiddleColor()
    {
        return this._middleColor;
    } //-- int getMiddleColor() 

    /**
     * Returns the value of field 'startColor'. The field
     * 'startColor' has the following description: ������ʼ��ɫ
     * 
     * @return the value of field 'startColor'.
     */
    public int getStartColor()
    {
        return this._startColor;
    } //-- int getStartColor() 

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
     * Returns the value of field 'useMiddle'. The field
     * 'useMiddle' has the following description: �Ƿ����ý����м�ɫ
     * 
     * @return the value of field 'useMiddle'.
     */
    public byte getUseMiddle()
    {
        return this._useMiddle;
    } //-- byte getUseMiddle() 

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
     * Method hasCircled
     */
    public boolean hasCircled()
    {
        return this._has_circled;
    } //-- boolean hasCircled() 

    /**
     * Method hasColor
     */
    public boolean hasColor()
    {
        return this._has_color;
    } //-- boolean hasColor() 

    /**
     * Method hasEndColor
     */
    public boolean hasEndColor()
    {
        return this._has_endColor;
    } //-- boolean hasEndColor() 

    /**
     * Method hasGradientVisible
     */
    public boolean hasGradientVisible()
    {
        return this._has_gradientVisible;
    } //-- boolean hasGradientVisible() 

    /**
     * Method hasMiddleColor
     */
    public boolean hasMiddleColor()
    {
        return this._has_middleColor;
    } //-- boolean hasMiddleColor() 

    /**
     * Method hasStartColor
     */
    public boolean hasStartColor()
    {
        return this._has_startColor;
    } //-- boolean hasStartColor() 

    /**
     * Method hasUseMiddle
     */
    public boolean hasUseMiddle()
    {
        return this._has_useMiddle;
    } //-- boolean hasUseMiddle() 

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
     * Sets the value of field 'circled'. The field 'circled' has
     * the following description: �Ƿ�Ϊ��Բ��
     * 
     * @param circled the value of field 'circled'.
     */
    public void setCircled(byte circled)
    {
        this._circled = circled;
        this._has_circled = true;
    } //-- void setCircled(byte) 

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
     * Sets the value of field 'direction'. The field 'direction'
     * has the following description: ����ɫ��������
     * 
     * @param direction the value of field 'direction'.
     */
    public void setDirection(com.ccssoft.rsas.common.saschart.types.PieSeriesDirectionType direction)
    {
        this._direction = direction;
    } //-- void setDirection(com.regaltec.rsas.common.saschart.types.PieSeriesDirectionType) 

    /**
     * Sets the value of field 'endColor'. The field 'endColor' has
     * the following description: ���������ɫ
     * 
     * @param endColor the value of field 'endColor'.
     */
    public void setEndColor(int endColor)
    {
        this._endColor = endColor;
        this._has_endColor = true;
    } //-- void setEndColor(int) 

    /**
     * Sets the value of field 'gradientVisible'.
     * 
     * @param gradientVisible the value of field 'gradientVisible'.
     */
    public void setGradientVisible(byte gradientVisible)
    {
        this._gradientVisible = gradientVisible;
        this._has_gradientVisible = true;
    } //-- void setGradientVisible(byte) 

    /**
     * Sets the value of field 'middleColor'. The field
     * 'middleColor' has the following description: �����м���ɫ
     * 
     * @param middleColor the value of field 'middleColor'.
     */
    public void setMiddleColor(int middleColor)
    {
        this._middleColor = middleColor;
        this._has_middleColor = true;
    } //-- void setMiddleColor(int) 

    /**
     * Sets the value of field 'startColor'. The field 'startColor'
     * has the following description: ������ʼ��ɫ
     * 
     * @param startColor the value of field 'startColor'.
     */
    public void setStartColor(int startColor)
    {
        this._startColor = startColor;
        this._has_startColor = true;
    } //-- void setStartColor(int) 

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
     * Sets the value of field 'useMiddle'. The field 'useMiddle'
     * has the following description: �Ƿ����ý����м�ɫ
     * 
     * @param useMiddle the value of field 'useMiddle'.
     */
    public void setUseMiddle(byte useMiddle)
    {
        this._useMiddle = useMiddle;
        this._has_useMiddle = true;
    } //-- void setUseMiddle(byte) 

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
        return (com.ccssoft.rsas.common.saschart.PieSeries) Unmarshaller.unmarshal(com.ccssoft.rsas.common.saschart.PieSeries.class, reader);
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
