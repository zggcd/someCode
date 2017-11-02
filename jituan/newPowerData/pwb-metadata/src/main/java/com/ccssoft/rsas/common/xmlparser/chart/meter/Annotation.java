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

import com.ccssoft.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType;

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
 * ��ߵ���Χ��
 * typeֵ
 * Բ��xPos, yPos,startAngle, endAngle, radius���á�
 * ���Σ�x�� y��toX�� toY��fillAngle���á�
 * ��ֵ��annotationGroup��typeֵһ�¡�
 * 
 * 
 * @version $Revision$ $Date$
 */
public class Annotation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��ߵ���Χ�������.Բ�����Σ�
     */
    private com.ccssoft.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType _type;

    /**
     * Բ�ĵĿ�ʼλ��X��
     */
    private int _xPos;

    /**
     * keeps track of state for field: _xPos
     */
    private boolean _has_xPos;

    /**
     * Բ�ĵĿ�ʼλ��Y��
     */
    private int _yPos;

    /**
     * keeps track of state for field: _yPos
     */
    private boolean _has_yPos;

    /**
     * Բ��ʼ�Ƕ�
     */
    private int _startAngle;

    /**
     * keeps track of state for field: _startAngle
     */
    private boolean _has_startAngle;

    /**
     * Բ�����Ƕ�
     */
    private int _endAngle;

    /**
     * keeps track of state for field: _endAngle
     */
    private boolean _has_endAngle;

    /**
     * Բ�뾶
     */
    private int _radius;

    /**
     * keeps track of state for field: _radius
     */
    private boolean _has_radius;

    /**
     * �����ɫ��
     * ����ffffff, 00ff00
     */
    private java.lang.String _fillColor;

    /**
     * ������,��fillColorƥ��ʹ�á�
     * ����50,50
     */
    private java.lang.String _fillRatio;

    /**
     * �������Ͻǵ�X������
     */
    private int _x;

    /**
     * keeps track of state for field: _x
     */
    private boolean _has_x;

    /**
     * �������Ͻǵ�Y������
     */
    private int _y;

    /**
     * keeps track of state for field: _y
     */
    private boolean _has_y;

    /**
     * �������½ǵ�X������
     */
    private int _toX;

    /**
     * keeps track of state for field: _toX
     */
    private boolean _has_toX;

    /**
     * �������½ǵ�Y������
     */
    private int _toY;

    /**
     * keeps track of state for field: _toY
     */
    private boolean _has_toY;

    /**
     * �������Ƕȣ�����90
     */
    private int _fillAngle;

    /**
     * keeps track of state for field: _fillAngle
     */
    private boolean _has_fillAngle;


      //----------------/
     //- Constructors -/
    //----------------/

    public Annotation() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Annotation()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteEndAngle
     */
    public void deleteEndAngle()
    {
        this._has_endAngle= false;
    } //-- void deleteEndAngle() 

    /**
     * Method deleteFillAngle
     */
    public void deleteFillAngle()
    {
        this._has_fillAngle= false;
    } //-- void deleteFillAngle() 

    /**
     * Method deleteRadius
     */
    public void deleteRadius()
    {
        this._has_radius= false;
    } //-- void deleteRadius() 

    /**
     * Method deleteStartAngle
     */
    public void deleteStartAngle()
    {
        this._has_startAngle= false;
    } //-- void deleteStartAngle() 

    /**
     * Method deleteToX
     */
    public void deleteToX()
    {
        this._has_toX= false;
    } //-- void deleteToX() 

    /**
     * Method deleteToY
     */
    public void deleteToY()
    {
        this._has_toY= false;
    } //-- void deleteToY() 

    /**
     * Method deleteX
     */
    public void deleteX()
    {
        this._has_x= false;
    } //-- void deleteX() 

    /**
     * Method deleteXPos
     */
    public void deleteXPos()
    {
        this._has_xPos= false;
    } //-- void deleteXPos() 

    /**
     * Method deleteY
     */
    public void deleteY()
    {
        this._has_y= false;
    } //-- void deleteY() 

    /**
     * Method deleteYPos
     */
    public void deleteYPos()
    {
        this._has_yPos= false;
    } //-- void deleteYPos() 

    /**
     * Returns the value of field 'endAngle'. The field 'endAngle'
     * has the following description: Բ�����Ƕ�
     * 
     * @return the value of field 'endAngle'.
     */
    public int getEndAngle()
    {
        return this._endAngle;
    } //-- int getEndAngle() 

    /**
     * Returns the value of field 'fillAngle'. The field
     * 'fillAngle' has the following description: �������Ƕȣ�����90
     * 
     * @return the value of field 'fillAngle'.
     */
    public int getFillAngle()
    {
        return this._fillAngle;
    } //-- int getFillAngle() 

    /**
     * Returns the value of field 'fillColor'. The field
     * 'fillColor' has the following description: �����ɫ��
     * ����ffffff, 00ff00
     * 
     * @return the value of field 'fillColor'.
     */
    public java.lang.String getFillColor()
    {
        return this._fillColor;
    } //-- java.lang.String getFillColor() 

    /**
     * Returns the value of field 'fillRatio'. The field
     * 'fillRatio' has the following description:
     * ������,��fillColorƥ��ʹ�á�
     * ����50,50
     * 
     * 
     * @return the value of field 'fillRatio'.
     */
    public java.lang.String getFillRatio()
    {
        return this._fillRatio;
    } //-- java.lang.String getFillRatio() 

    /**
     * Returns the value of field 'radius'. The field 'radius' has
     * the following description: Բ�뾶
     * 
     * @return the value of field 'radius'.
     */
    public int getRadius()
    {
        return this._radius;
    } //-- int getRadius() 

    /**
     * Returns the value of field 'startAngle'. The field
     * 'startAngle' has the following description: Բ��ʼ�Ƕ�
     * 
     * @return the value of field 'startAngle'.
     */
    public int getStartAngle()
    {
        return this._startAngle;
    } //-- int getStartAngle() 

    /**
     * Returns the value of field 'toX'. The field 'toX' has the
     * following description: �������½ǵ�X������
     * 
     * @return the value of field 'toX'.
     */
    public int getToX()
    {
        return this._toX;
    } //-- int getToX() 

    /**
     * Returns the value of field 'toY'. The field 'toY' has the
     * following description: �������½ǵ�Y������
     * 
     * @return the value of field 'toY'.
     */
    public int getToY()
    {
        return this._toY;
    } //-- int getToY() 

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: ��ߵ���Χ�������.Բ�����Σ�
     * 
     * 
     * @return the value of field 'type'.
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType getType()
    {
        return this._type;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType getType() 

    /**
     * Returns the value of field 'x'. The field 'x' has the
     * following description: �������Ͻǵ�X������
     * 
     * @return the value of field 'x'.
     */
    public int getX()
    {
        return this._x;
    } //-- int getX() 

    /**
     * Returns the value of field 'xPos'. The field 'xPos' has the
     * following description: Բ�ĵĿ�ʼλ��X��
     * 
     * @return the value of field 'xPos'.
     */
    public int getXPos()
    {
        return this._xPos;
    } //-- int getXPos() 

    /**
     * Returns the value of field 'y'. The field 'y' has the
     * following description: �������Ͻǵ�Y������
     * 
     * @return the value of field 'y'.
     */
    public int getY()
    {
        return this._y;
    } //-- int getY() 

    /**
     * Returns the value of field 'yPos'. The field 'yPos' has the
     * following description: Բ�ĵĿ�ʼλ��Y��
     * 
     * @return the value of field 'yPos'.
     */
    public int getYPos()
    {
        return this._yPos;
    } //-- int getYPos() 

    /**
     * Method hasEndAngle
     */
    public boolean hasEndAngle()
    {
        return this._has_endAngle;
    } //-- boolean hasEndAngle() 

    /**
     * Method hasFillAngle
     */
    public boolean hasFillAngle()
    {
        return this._has_fillAngle;
    } //-- boolean hasFillAngle() 

    /**
     * Method hasRadius
     */
    public boolean hasRadius()
    {
        return this._has_radius;
    } //-- boolean hasRadius() 

    /**
     * Method hasStartAngle
     */
    public boolean hasStartAngle()
    {
        return this._has_startAngle;
    } //-- boolean hasStartAngle() 

    /**
     * Method hasToX
     */
    public boolean hasToX()
    {
        return this._has_toX;
    } //-- boolean hasToX() 

    /**
     * Method hasToY
     */
    public boolean hasToY()
    {
        return this._has_toY;
    } //-- boolean hasToY() 

    /**
     * Method hasX
     */
    public boolean hasX()
    {
        return this._has_x;
    } //-- boolean hasX() 

    /**
     * Method hasXPos
     */
    public boolean hasXPos()
    {
        return this._has_xPos;
    } //-- boolean hasXPos() 

    /**
     * Method hasY
     */
    public boolean hasY()
    {
        return this._has_y;
    } //-- boolean hasY() 

    /**
     * Method hasYPos
     */
    public boolean hasYPos()
    {
        return this._has_yPos;
    } //-- boolean hasYPos() 

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
     * Sets the value of field 'endAngle'. The field 'endAngle' has
     * the following description: Բ�����Ƕ�
     * 
     * @param endAngle the value of field 'endAngle'.
     */
    public void setEndAngle(int endAngle)
    {
        this._endAngle = endAngle;
        this._has_endAngle = true;
    } //-- void setEndAngle(int) 

    /**
     * Sets the value of field 'fillAngle'. The field 'fillAngle'
     * has the following description: �������Ƕȣ�����90
     * 
     * @param fillAngle the value of field 'fillAngle'.
     */
    public void setFillAngle(int fillAngle)
    {
        this._fillAngle = fillAngle;
        this._has_fillAngle = true;
    } //-- void setFillAngle(int) 

    /**
     * Sets the value of field 'fillColor'. The field 'fillColor'
     * has the following description: �����ɫ��
     * ����ffffff, 00ff00
     * 
     * @param fillColor the value of field 'fillColor'.
     */
    public void setFillColor(java.lang.String fillColor)
    {
        this._fillColor = fillColor;
    } //-- void setFillColor(java.lang.String) 

    /**
     * Sets the value of field 'fillRatio'. The field 'fillRatio'
     * has the following description: ������,��fillColorƥ��ʹ�á�
     * ����50,50
     * 
     * 
     * @param fillRatio the value of field 'fillRatio'.
     */
    public void setFillRatio(java.lang.String fillRatio)
    {
        this._fillRatio = fillRatio;
    } //-- void setFillRatio(java.lang.String) 

    /**
     * Sets the value of field 'radius'. The field 'radius' has the
     * following description: Բ�뾶
     * 
     * @param radius the value of field 'radius'.
     */
    public void setRadius(int radius)
    {
        this._radius = radius;
        this._has_radius = true;
    } //-- void setRadius(int) 

    /**
     * Sets the value of field 'startAngle'. The field 'startAngle'
     * has the following description: Բ��ʼ�Ƕ�
     * 
     * @param startAngle the value of field 'startAngle'.
     */
    public void setStartAngle(int startAngle)
    {
        this._startAngle = startAngle;
        this._has_startAngle = true;
    } //-- void setStartAngle(int) 

    /**
     * Sets the value of field 'toX'. The field 'toX' has the
     * following description: �������½ǵ�X������
     * 
     * @param toX the value of field 'toX'.
     */
    public void setToX(int toX)
    {
        this._toX = toX;
        this._has_toX = true;
    } //-- void setToX(int) 

    /**
     * Sets the value of field 'toY'. The field 'toY' has the
     * following description: �������½ǵ�Y������
     * 
     * @param toY the value of field 'toY'.
     */
    public void setToY(int toY)
    {
        this._toY = toY;
        this._has_toY = true;
    } //-- void setToY(int) 

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: ��ߵ���Χ�������.Բ�����Σ�
     * 
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.ccssoft.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType type)
    {
        this._type = type;
    } //-- void setType(com.regaltec.rsas.common.xmlparser.chart.meter.types.AnnotationGroupItemTypeType) 

    /**
     * Sets the value of field 'x'. The field 'x' has the following
     * description: �������Ͻǵ�X������
     * 
     * @param x the value of field 'x'.
     */
    public void setX(int x)
    {
        this._x = x;
        this._has_x = true;
    } //-- void setX(int) 

    /**
     * Sets the value of field 'xPos'. The field 'xPos' has the
     * following description: Բ�ĵĿ�ʼλ��X��
     * 
     * @param xPos the value of field 'xPos'.
     */
    public void setXPos(int xPos)
    {
        this._xPos = xPos;
        this._has_xPos = true;
    } //-- void setXPos(int) 

    /**
     * Sets the value of field 'y'. The field 'y' has the following
     * description: �������Ͻǵ�Y������
     * 
     * @param y the value of field 'y'.
     */
    public void setY(int y)
    {
        this._y = y;
        this._has_y = true;
    } //-- void setY(int) 

    /**
     * Sets the value of field 'yPos'. The field 'yPos' has the
     * following description: Բ�ĵĿ�ʼλ��Y��
     * 
     * @param yPos the value of field 'yPos'.
     */
    public void setYPos(int yPos)
    {
        this._yPos = yPos;
        this._has_yPos = true;
    } //-- void setYPos(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.Annotation) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.meter.Annotation.class, reader);
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