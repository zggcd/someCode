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
import com.ccssoft.rsas.common.saschart.types.LegendPositionType;
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
 * ͼ��
 * 
 * @version $Revision$ $Date$
 */
public class Legend implements java.io.Serializable {


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
     * ͼ���ڷŵ�λ��
     */
    private com.ccssoft.rsas.common.saschart.types.LegendPositionType _position;

    /**
     * Field _customPosition
     */
    private byte _customPosition;

    /**
     * keeps track of state for field: _customPosition
     */
    private boolean _has_customPosition;

    /**
     * Field _leftPosition
     */
    private int _leftPosition;

    /**
     * keeps track of state for field: _leftPosition
     */
    private boolean _has_leftPosition;

    /**
     * Field _topPosition
     */
    private int _topPosition;

    /**
     * keeps track of state for field: _topPosition
     */
    private boolean _has_topPosition;

    /**
     * ������ɫ
     */
    private int _backColor;

    /**
     * keeps track of state for field: _backColor
     */
    private boolean _has_backColor;

    /**
     * ͼ��������˳���Ƿ񷴷���
     */
    private short _inverted;

    /**
     * keeps track of state for field: _inverted
     */
    private boolean _has_inverted;

    /**
     * ˮƽ��ʾͼ�����������
     */
    private int _maxiMum;

    /**
     * keeps track of state for field: _maxiMum
     */
    private boolean _has_maxiMum;

    /**
     * �����Ƿ��Զ�����ͼ��λ�ã���ֹ��ͼ���ص�
     */
    private short _resizeChart;

    /**
     * keeps track of state for field: _resizeChart
     */
    private boolean _has_resizeChart;

    /**
     * ����ͼ����֮��Ĵ�ֱ��ࣨ���أ�
     */
    private int _vertSpacing;

    /**
     * keeps track of state for field: _vertSpacing
     */
    private boolean _has_vertSpacing;

    /**
     * ����ͼ����ͼ�����֮�����ش�ֱ�߾�
     */
    private int _vertMargin;

    /**
     * keeps track of state for field: _vertMargin
     */
    private boolean _has_vertMargin;

    /**
     * �Ƿ���ʾͼ����ѡ��
     */
    private short _checkBoxes;

    /**
     * keeps track of state for field: _checkBoxes
     */
    private boolean _has_checkBoxes;

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

    public Legend() {
        super();
    } //-- com.regaltec.rsas.common.saschart.Legend()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteBackColor
     */
    public void deleteBackColor()
    {
        this._has_backColor= false;
    } //-- void deleteBackColor() 

    /**
     * Method deleteBorderVisible
     */
    public void deleteBorderVisible()
    {
        this._has_borderVisible= false;
    } //-- void deleteBorderVisible() 

    /**
     * Method deleteCheckBoxes
     */
    public void deleteCheckBoxes()
    {
        this._has_checkBoxes= false;
    } //-- void deleteCheckBoxes() 

    /**
     * Method deleteColor
     */
    public void deleteColor()
    {
        this._has_color= false;
    } //-- void deleteColor() 

    /**
     * Method deleteCustomPosition
     */
    public void deleteCustomPosition()
    {
        this._has_customPosition= false;
    } //-- void deleteCustomPosition() 

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
     * Method deleteInverted
     */
    public void deleteInverted()
    {
        this._has_inverted= false;
    } //-- void deleteInverted() 

    /**
     * Method deleteLeftPosition
     */
    public void deleteLeftPosition()
    {
        this._has_leftPosition= false;
    } //-- void deleteLeftPosition() 

    /**
     * Method deleteMaxiMum
     */
    public void deleteMaxiMum()
    {
        this._has_maxiMum= false;
    } //-- void deleteMaxiMum() 

    /**
     * Method deleteMiddleColor
     */
    public void deleteMiddleColor()
    {
        this._has_middleColor= false;
    } //-- void deleteMiddleColor() 

    /**
     * Method deleteResizeChart
     */
    public void deleteResizeChart()
    {
        this._has_resizeChart= false;
    } //-- void deleteResizeChart() 

    /**
     * Method deleteStartColor
     */
    public void deleteStartColor()
    {
        this._has_startColor= false;
    } //-- void deleteStartColor() 

    /**
     * Method deleteTopPosition
     */
    public void deleteTopPosition()
    {
        this._has_topPosition= false;
    } //-- void deleteTopPosition() 

    /**
     * Method deleteUseMiddle
     */
    public void deleteUseMiddle()
    {
        this._has_useMiddle= false;
    } //-- void deleteUseMiddle() 

    /**
     * Method deleteVertMargin
     */
    public void deleteVertMargin()
    {
        this._has_vertMargin= false;
    } //-- void deleteVertMargin() 

    /**
     * Method deleteVertSpacing
     */
    public void deleteVertSpacing()
    {
        this._has_vertSpacing= false;
    } //-- void deleteVertSpacing() 

    /**
     * Method deleteVisible
     */
    public void deleteVisible()
    {
        this._has_visible= false;
    } //-- void deleteVisible() 

    /**
     * Method deleteWidth
     */
    public void deleteWidth()
    {
        this._has_width= false;
    } //-- void deleteWidth() 

    /**
     * Returns the value of field 'backColor'. The field
     * 'backColor' has the following description: ������ɫ
     * 
     * @return the value of field 'backColor'.
     */
    public int getBackColor()
    {
        return this._backColor;
    } //-- int getBackColor() 

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
     * Returns the value of field 'checkBoxes'. The field
     * 'checkBoxes' has the following description: �Ƿ���ʾͼ����ѡ��
     * 
     * @return the value of field 'checkBoxes'.
     */
    public short getCheckBoxes()
    {
        return this._checkBoxes;
    } //-- short getCheckBoxes() 

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
     * Returns the value of field 'customPosition'.
     * 
     * @return the value of field 'customPosition'.
     */
    public byte getCustomPosition()
    {
        return this._customPosition;
    } //-- byte getCustomPosition() 

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
     * Returns the value of field 'inverted'. The field 'inverted'
     * has the following description: ͼ��������˳���Ƿ񷴷���
     * 
     * @return the value of field 'inverted'.
     */
    public short getInverted()
    {
        return this._inverted;
    } //-- short getInverted() 

    /**
     * Returns the value of field 'leftPosition'.
     * 
     * @return the value of field 'leftPosition'.
     */
    public int getLeftPosition()
    {
        return this._leftPosition;
    } //-- int getLeftPosition() 

    /**
     * Returns the value of field 'maxiMum'. The field 'maxiMum'
     * has the following description: ˮƽ��ʾͼ�����������
     * 
     * @return the value of field 'maxiMum'.
     */
    public int getMaxiMum()
    {
        return this._maxiMum;
    } //-- int getMaxiMum() 

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
     * Returns the value of field 'position'. The field 'position'
     * has the following description: ͼ���ڷŵ�λ��
     * 
     * @return the value of field 'position'.
     */
    public com.ccssoft.rsas.common.saschart.types.LegendPositionType getPosition()
    {
        return this._position;
    } //-- com.regaltec.rsas.common.saschart.types.LegendPositionType getPosition() 

    /**
     * Returns the value of field 'resizeChart'. The field
     * 'resizeChart' has the following description:
     * �����Ƿ��Զ�����ͼ��λ�ã���ֹ��ͼ���ص�
     * 
     * @return the value of field 'resizeChart'.
     */
    public short getResizeChart()
    {
        return this._resizeChart;
    } //-- short getResizeChart() 

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
     * Returns the value of field 'topPosition'.
     * 
     * @return the value of field 'topPosition'.
     */
    public int getTopPosition()
    {
        return this._topPosition;
    } //-- int getTopPosition() 

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
     * Returns the value of field 'vertMargin'. The field
     * 'vertMargin' has the following description:
     * ����ͼ����ͼ�����֮�����ش�ֱ�߾�
     * 
     * @return the value of field 'vertMargin'.
     */
    public int getVertMargin()
    {
        return this._vertMargin;
    } //-- int getVertMargin() 

    /**
     * Returns the value of field 'vertSpacing'. The field
     * 'vertSpacing' has the following description:
     * ����ͼ����֮��Ĵ�ֱ��ࣨ���أ�
     * 
     * @return the value of field 'vertSpacing'.
     */
    public int getVertSpacing()
    {
        return this._vertSpacing;
    } //-- int getVertSpacing() 

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
     * Method hasBackColor
     */
    public boolean hasBackColor()
    {
        return this._has_backColor;
    } //-- boolean hasBackColor() 

    /**
     * Method hasBorderVisible
     */
    public boolean hasBorderVisible()
    {
        return this._has_borderVisible;
    } //-- boolean hasBorderVisible() 

    /**
     * Method hasCheckBoxes
     */
    public boolean hasCheckBoxes()
    {
        return this._has_checkBoxes;
    } //-- boolean hasCheckBoxes() 

    /**
     * Method hasColor
     */
    public boolean hasColor()
    {
        return this._has_color;
    } //-- boolean hasColor() 

    /**
     * Method hasCustomPosition
     */
    public boolean hasCustomPosition()
    {
        return this._has_customPosition;
    } //-- boolean hasCustomPosition() 

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
     * Method hasInverted
     */
    public boolean hasInverted()
    {
        return this._has_inverted;
    } //-- boolean hasInverted() 

    /**
     * Method hasLeftPosition
     */
    public boolean hasLeftPosition()
    {
        return this._has_leftPosition;
    } //-- boolean hasLeftPosition() 

    /**
     * Method hasMaxiMum
     */
    public boolean hasMaxiMum()
    {
        return this._has_maxiMum;
    } //-- boolean hasMaxiMum() 

    /**
     * Method hasMiddleColor
     */
    public boolean hasMiddleColor()
    {
        return this._has_middleColor;
    } //-- boolean hasMiddleColor() 

    /**
     * Method hasResizeChart
     */
    public boolean hasResizeChart()
    {
        return this._has_resizeChart;
    } //-- boolean hasResizeChart() 

    /**
     * Method hasStartColor
     */
    public boolean hasStartColor()
    {
        return this._has_startColor;
    } //-- boolean hasStartColor() 

    /**
     * Method hasTopPosition
     */
    public boolean hasTopPosition()
    {
        return this._has_topPosition;
    } //-- boolean hasTopPosition() 

    /**
     * Method hasUseMiddle
     */
    public boolean hasUseMiddle()
    {
        return this._has_useMiddle;
    } //-- boolean hasUseMiddle() 

    /**
     * Method hasVertMargin
     */
    public boolean hasVertMargin()
    {
        return this._has_vertMargin;
    } //-- boolean hasVertMargin() 

    /**
     * Method hasVertSpacing
     */
    public boolean hasVertSpacing()
    {
        return this._has_vertSpacing;
    } //-- boolean hasVertSpacing() 

    /**
     * Method hasVisible
     */
    public boolean hasVisible()
    {
        return this._has_visible;
    } //-- boolean hasVisible() 

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
     * Sets the value of field 'backColor'. The field 'backColor'
     * has the following description: ������ɫ
     * 
     * @param backColor the value of field 'backColor'.
     */
    public void setBackColor(int backColor)
    {
        this._backColor = backColor;
        this._has_backColor = true;
    } //-- void setBackColor(int) 

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
     * Sets the value of field 'checkBoxes'. The field 'checkBoxes'
     * has the following description: �Ƿ���ʾͼ����ѡ��
     * 
     * @param checkBoxes the value of field 'checkBoxes'.
     */
    public void setCheckBoxes(short checkBoxes)
    {
        this._checkBoxes = checkBoxes;
        this._has_checkBoxes = true;
    } //-- void setCheckBoxes(short) 

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
     * Sets the value of field 'customPosition'.
     * 
     * @param customPosition the value of field 'customPosition'.
     */
    public void setCustomPosition(byte customPosition)
    {
        this._customPosition = customPosition;
        this._has_customPosition = true;
    } //-- void setCustomPosition(byte) 

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
     * Sets the value of field 'inverted'. The field 'inverted' has
     * the following description: ͼ��������˳���Ƿ񷴷���
     * 
     * @param inverted the value of field 'inverted'.
     */
    public void setInverted(short inverted)
    {
        this._inverted = inverted;
        this._has_inverted = true;
    } //-- void setInverted(short) 

    /**
     * Sets the value of field 'leftPosition'.
     * 
     * @param leftPosition the value of field 'leftPosition'.
     */
    public void setLeftPosition(int leftPosition)
    {
        this._leftPosition = leftPosition;
        this._has_leftPosition = true;
    } //-- void setLeftPosition(int) 

    /**
     * Sets the value of field 'maxiMum'. The field 'maxiMum' has
     * the following description: ˮƽ��ʾͼ�����������
     * 
     * @param maxiMum the value of field 'maxiMum'.
     */
    public void setMaxiMum(int maxiMum)
    {
        this._maxiMum = maxiMum;
        this._has_maxiMum = true;
    } //-- void setMaxiMum(int) 

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
     * Sets the value of field 'position'. The field 'position' has
     * the following description: ͼ���ڷŵ�λ��
     * 
     * @param position the value of field 'position'.
     */
    public void setPosition(com.ccssoft.rsas.common.saschart.types.LegendPositionType position)
    {
        this._position = position;
    } //-- void setPosition(com.regaltec.rsas.common.saschart.types.LegendPositionType) 

    /**
     * Sets the value of field 'resizeChart'. The field
     * 'resizeChart' has the following description:
     * �����Ƿ��Զ�����ͼ��λ�ã���ֹ��ͼ���ص�
     * 
     * @param resizeChart the value of field 'resizeChart'.
     */
    public void setResizeChart(short resizeChart)
    {
        this._resizeChart = resizeChart;
        this._has_resizeChart = true;
    } //-- void setResizeChart(short) 

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
     * Sets the value of field 'topPosition'.
     * 
     * @param topPosition the value of field 'topPosition'.
     */
    public void setTopPosition(int topPosition)
    {
        this._topPosition = topPosition;
        this._has_topPosition = true;
    } //-- void setTopPosition(int) 

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
     * Sets the value of field 'vertMargin'. The field 'vertMargin'
     * has the following description: ����ͼ����ͼ�����֮�����ش�ֱ�߾�
     * 
     * @param vertMargin the value of field 'vertMargin'.
     */
    public void setVertMargin(int vertMargin)
    {
        this._vertMargin = vertMargin;
        this._has_vertMargin = true;
    } //-- void setVertMargin(int) 

    /**
     * Sets the value of field 'vertSpacing'. The field
     * 'vertSpacing' has the following description:
     * ����ͼ����֮��Ĵ�ֱ��ࣨ���أ�
     * 
     * @param vertSpacing the value of field 'vertSpacing'.
     */
    public void setVertSpacing(int vertSpacing)
    {
        this._vertSpacing = vertSpacing;
        this._has_vertSpacing = true;
    } //-- void setVertSpacing(int) 

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
        return (com.ccssoft.rsas.common.saschart.Legend) Unmarshaller.unmarshal(com.ccssoft.rsas.common.saschart.Legend.class, reader);
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
