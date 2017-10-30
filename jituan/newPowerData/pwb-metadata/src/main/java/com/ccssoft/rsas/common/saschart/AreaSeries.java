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

import com.ccssoft.rsas.common.saschart.types.AreaSeriesMultipleAreaType;
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
 * ���ͼ����
 * 
 * @version $Revision$ $Date$
 */
public class AreaSeries implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _areaColor
     */
    private int _areaColor;

    /**
     * keeps track of state for field: _areaColor
     */
    private boolean _has_areaColor;

    /**
     * �������
     */
    private com.ccssoft.rsas.common.saschart.types.AreaSeriesMultipleAreaType _multipleArea;

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


      //----------------/
     //- Constructors -/
    //----------------/

    public AreaSeries() {
        super();
    } //-- com.regaltec.rsas.common.saschart.AreaSeries()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAreaColor
     */
    public void deleteAreaColor()
    {
        this._has_areaColor= false;
    } //-- void deleteAreaColor() 

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
     * Returns the value of field 'areaColor'.
     * 
     * @return the value of field 'areaColor'.
     */
    public int getAreaColor()
    {
        return this._areaColor;
    } //-- int getAreaColor() 

    /**
     * Returns the value of field 'multipleArea'. The field
     * 'multipleArea' has the following description: �������
     * 
     * @return the value of field 'multipleArea'.
     */
    public com.ccssoft.rsas.common.saschart.types.AreaSeriesMultipleAreaType getMultipleArea()
    {
        return this._multipleArea;
    } //-- com.regaltec.rsas.common.saschart.types.AreaSeriesMultipleAreaType getMultipleArea() 

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
     * Method hasAreaColor
     */
    public boolean hasAreaColor()
    {
        return this._has_areaColor;
    } //-- boolean hasAreaColor() 

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
     * Sets the value of field 'areaColor'.
     * 
     * @param areaColor the value of field 'areaColor'.
     */
    public void setAreaColor(int areaColor)
    {
        this._areaColor = areaColor;
        this._has_areaColor = true;
    } //-- void setAreaColor(int) 

    /**
     * Sets the value of field 'multipleArea'. The field
     * 'multipleArea' has the following description: �������
     * 
     * @param multipleArea the value of field 'multipleArea'.
     */
    public void setMultipleArea(com.ccssoft.rsas.common.saschart.types.AreaSeriesMultipleAreaType multipleArea)
    {
        this._multipleArea = multipleArea;
    } //-- void setMultipleArea(com.regaltec.rsas.common.saschart.types.AreaSeriesMultipleAreaType) 

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
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.saschart.AreaSeries) Unmarshaller.unmarshal(com.ccssoft.rsas.common.saschart.AreaSeries.class, reader);
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
