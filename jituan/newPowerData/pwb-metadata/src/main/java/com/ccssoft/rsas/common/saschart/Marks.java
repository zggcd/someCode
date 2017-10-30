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

import com.ccssoft.rsas.common.saschart.types.MarksMarkStyleType;
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
 * ͼ��ϵ�еı�Ƕ���
 * 
 * @version $Revision$ $Date$
 */
public class Marks implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �Ƿ�ɼ�����
     */
    private byte _visible;

    /**
     * keeps track of state for field: _visible
     */
    private boolean _has_visible;

    /**
     * ��ǵ�����
     */
    private com.ccssoft.rsas.common.saschart.types.MarksMarkStyleType _markStyle;

    /**
     * ��ͷ�ĳ���
     */
    private short _arrowLength;

    /**
     * keeps track of state for field: _arrowLength
     */
    private boolean _has_arrowLength;

    /**
     * ��ͷ���λ��
     */
    private short _distance;

    /**
     * keeps track of state for field: _distance
     */
    private boolean _has_distance;

    /**
     * ��ǵı���ɫ
     */
    private int _frameColor;

    /**
     * keeps track of state for field: _frameColor
     */
    private boolean _has_frameColor;

    /**
     * �Ƿ�ʹ��Բ��Frame
     */
    private byte _roundFrame;

    /**
     * keeps track of state for field: _roundFrame
     */
    private boolean _has_roundFrame;

    /**
     * �Ƿ�͸�����
     */
    private byte _transParent;

    /**
     * keeps track of state for field: _transParent
     */
    private boolean _has_transParent;

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


      //----------------/
     //- Constructors -/
    //----------------/

    public Marks() {
        super();
    } //-- com.regaltec.rsas.common.saschart.Marks()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteArrowLength
     */
    public void deleteArrowLength()
    {
        this._has_arrowLength= false;
    } //-- void deleteArrowLength() 

    /**
     * Method deleteDistance
     */
    public void deleteDistance()
    {
        this._has_distance= false;
    } //-- void deleteDistance() 

    /**
     * Method deleteEndColor
     */
    public void deleteEndColor()
    {
        this._has_endColor= false;
    } //-- void deleteEndColor() 

    /**
     * Method deleteFrameColor
     */
    public void deleteFrameColor()
    {
        this._has_frameColor= false;
    } //-- void deleteFrameColor() 

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
     * Method deleteRoundFrame
     */
    public void deleteRoundFrame()
    {
        this._has_roundFrame= false;
    } //-- void deleteRoundFrame() 

    /**
     * Method deleteStartColor
     */
    public void deleteStartColor()
    {
        this._has_startColor= false;
    } //-- void deleteStartColor() 

    /**
     * Method deleteTransParent
     */
    public void deleteTransParent()
    {
        this._has_transParent= false;
    } //-- void deleteTransParent() 

    /**
     * Method deleteUseMiddle
     */
    public void deleteUseMiddle()
    {
        this._has_useMiddle= false;
    } //-- void deleteUseMiddle() 

    /**
     * Method deleteVisible
     */
    public void deleteVisible()
    {
        this._has_visible= false;
    } //-- void deleteVisible() 

    /**
     * Returns the value of field 'arrowLength'. The field
     * 'arrowLength' has the following description: ��ͷ�ĳ���
     * 
     * @return the value of field 'arrowLength'.
     */
    public short getArrowLength()
    {
        return this._arrowLength;
    } //-- short getArrowLength() 

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
     * Returns the value of field 'distance'. The field 'distance'
     * has the following description: ��ͷ���λ��
     * 
     * @return the value of field 'distance'.
     */
    public short getDistance()
    {
        return this._distance;
    } //-- short getDistance() 

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
     * Returns the value of field 'frameColor'. The field
     * 'frameColor' has the following description: ��ǵı���ɫ
     * 
     * @return the value of field 'frameColor'.
     */
    public int getFrameColor()
    {
        return this._frameColor;
    } //-- int getFrameColor() 

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
     * Returns the value of field 'markStyle'. The field
     * 'markStyle' has the following description: ��ǵ�����
     * 
     * @return the value of field 'markStyle'.
     */
    public com.ccssoft.rsas.common.saschart.types.MarksMarkStyleType getMarkStyle()
    {
        return this._markStyle;
    } //-- com.regaltec.rsas.common.saschart.types.MarksMarkStyleType getMarkStyle() 

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
     * Returns the value of field 'roundFrame'. The field
     * 'roundFrame' has the following description: �Ƿ�ʹ��Բ��Frame
     * 
     * @return the value of field 'roundFrame'.
     */
    public byte getRoundFrame()
    {
        return this._roundFrame;
    } //-- byte getRoundFrame() 

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
     * Returns the value of field 'transParent'. The field
     * 'transParent' has the following description: �Ƿ�͸�����
     * 
     * @return the value of field 'transParent'.
     */
    public byte getTransParent()
    {
        return this._transParent;
    } //-- byte getTransParent() 

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
     * Returns the value of field 'visible'. The field 'visible'
     * has the following description: �Ƿ�ɼ�����
     * 
     * @return the value of field 'visible'.
     */
    public byte getVisible()
    {
        return this._visible;
    } //-- byte getVisible() 

    /**
     * Method hasArrowLength
     */
    public boolean hasArrowLength()
    {
        return this._has_arrowLength;
    } //-- boolean hasArrowLength() 

    /**
     * Method hasDistance
     */
    public boolean hasDistance()
    {
        return this._has_distance;
    } //-- boolean hasDistance() 

    /**
     * Method hasEndColor
     */
    public boolean hasEndColor()
    {
        return this._has_endColor;
    } //-- boolean hasEndColor() 

    /**
     * Method hasFrameColor
     */
    public boolean hasFrameColor()
    {
        return this._has_frameColor;
    } //-- boolean hasFrameColor() 

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
     * Method hasRoundFrame
     */
    public boolean hasRoundFrame()
    {
        return this._has_roundFrame;
    } //-- boolean hasRoundFrame() 

    /**
     * Method hasStartColor
     */
    public boolean hasStartColor()
    {
        return this._has_startColor;
    } //-- boolean hasStartColor() 

    /**
     * Method hasTransParent
     */
    public boolean hasTransParent()
    {
        return this._has_transParent;
    } //-- boolean hasTransParent() 

    /**
     * Method hasUseMiddle
     */
    public boolean hasUseMiddle()
    {
        return this._has_useMiddle;
    } //-- boolean hasUseMiddle() 

    /**
     * Method hasVisible
     */
    public boolean hasVisible()
    {
        return this._has_visible;
    } //-- boolean hasVisible() 

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
     * Sets the value of field 'arrowLength'. The field
     * 'arrowLength' has the following description: ��ͷ�ĳ���
     * 
     * @param arrowLength the value of field 'arrowLength'.
     */
    public void setArrowLength(short arrowLength)
    {
        this._arrowLength = arrowLength;
        this._has_arrowLength = true;
    } //-- void setArrowLength(short) 

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
     * Sets the value of field 'distance'. The field 'distance' has
     * the following description: ��ͷ���λ��
     * 
     * @param distance the value of field 'distance'.
     */
    public void setDistance(short distance)
    {
        this._distance = distance;
        this._has_distance = true;
    } //-- void setDistance(short) 

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
     * Sets the value of field 'frameColor'. The field 'frameColor'
     * has the following description: ��ǵı���ɫ
     * 
     * @param frameColor the value of field 'frameColor'.
     */
    public void setFrameColor(int frameColor)
    {
        this._frameColor = frameColor;
        this._has_frameColor = true;
    } //-- void setFrameColor(int) 

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
     * Sets the value of field 'markStyle'. The field 'markStyle'
     * has the following description: ��ǵ�����
     * 
     * @param markStyle the value of field 'markStyle'.
     */
    public void setMarkStyle(com.ccssoft.rsas.common.saschart.types.MarksMarkStyleType markStyle)
    {
        this._markStyle = markStyle;
    } //-- void setMarkStyle(com.regaltec.rsas.common.saschart.types.MarksMarkStyleType) 

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
     * Sets the value of field 'roundFrame'. The field 'roundFrame'
     * has the following description: �Ƿ�ʹ��Բ��Frame
     * 
     * @param roundFrame the value of field 'roundFrame'.
     */
    public void setRoundFrame(byte roundFrame)
    {
        this._roundFrame = roundFrame;
        this._has_roundFrame = true;
    } //-- void setRoundFrame(byte) 

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
     * Sets the value of field 'transParent'. The field
     * 'transParent' has the following description: �Ƿ�͸�����
     * 
     * @param transParent the value of field 'transParent'.
     */
    public void setTransParent(byte transParent)
    {
        this._transParent = transParent;
        this._has_transParent = true;
    } //-- void setTransParent(byte) 

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
     * Sets the value of field 'visible'. The field 'visible' has
     * the following description: �Ƿ�ɼ�����
     * 
     * @param visible the value of field 'visible'.
     */
    public void setVisible(byte visible)
    {
        this._visible = visible;
        this._has_visible = true;
    } //-- void setVisible(byte) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.saschart.Marks) Unmarshaller.unmarshal(com.ccssoft.rsas.common.saschart.Marks.class, reader);
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
