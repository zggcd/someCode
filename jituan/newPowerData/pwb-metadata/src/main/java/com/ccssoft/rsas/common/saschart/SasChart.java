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

import com.ccssoft.rsas.common.saschart.types.PieSeriesDirectionType;
import com.ccssoft.rsas.common.saschart.types.SasChartDataStyleType;
import com.ccssoft.rsas.common.saschart.types.SasChartThemesType;

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
 * ͼ�����
 * 
 * @version $Revision$ $Date$
 */
public class SasChart implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ������ɫ
     */
    private int _backColor;

    /**
     * keeps track of state for field: _backColor
     */
    private boolean _has_backColor;

    /**
     * �Ƿ�ʹ��3Dͼ��
     */
    private byte _use3D;

    /**
     * keeps track of state for field: _use3D
     */
    private boolean _has_use3D;

    /**
     * 3Dͼ��ĺ�ȣ�%
     */
    private short _thick3D;

    /**
     * keeps track of state for field: _thick3D
     */
    private boolean _has_thick3D;

    /**
     * �Ƿ�������ͼ
     */
    private byte _orthogonal;

    /**
     * keeps track of state for field: _orthogonal
     */
    private boolean _has_orthogonal;

    /**
     * ����ͼ�ĽǶ�
     */
    private short _orthogonalAngle;

    /**
     * keeps track of state for field: _orthogonalAngle
     */
    private boolean _has_orthogonalAngle;

    /**
     * �����������
     */
    private com.ccssoft.rsas.common.saschart.types.SasChartDataStyleType _dataStyle;

    /**
     * ͼ��ѡ�õ�����
     */
    private com.ccssoft.rsas.common.saschart.types.SasChartThemesType _themes;

    /**
     * ��ɫ��
     */
    private java.lang.String _colorPalette;

    /**
     * ͼ�����õĲ�ѯ
     */
    private java.lang.String _queryID;

    /**
     * ����ά�ȣ�null�������飬���ݼ������������Զ�ѡ����,�ֿ���
     */
    private java.lang.String _groupDimensionItem;

    /**
     * ά����ת����ά����ת�ɶ�������ɲ��̶�����
     */
    private java.lang.String _measureDimensionItem;

    /**
     * Field _top
     */
    private int _top;

    /**
     * keeps track of state for field: _top
     */
    private boolean _has_top;

    /**
     * Field _left
     */
    private int _left;

    /**
     * keeps track of state for field: _left
     */
    private boolean _has_left;

    /**
     * Field _width
     */
    private int _width;

    /**
     * keeps track of state for field: _width
     */
    private boolean _has_width;

    /**
     * Field _height
     */
    private int _height;

    /**
     * keeps track of state for field: _height
     */
    private boolean _has_height;

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
     * ϵ�м���
     */
    private com.ccssoft.rsas.common.saschart.SeriesList _seriesList;

    /**
     * ��ļ�����ǰ6��Ԫ��Ϊϵͳ�̶�Ҫ�������ᣬ�ֱ�Ϊ���ҡ��ϡ��¡�����ȡ�����ȵ��ᣬ�ӵ�7��Ԫ�ؿ�ʼΪ�Զ�����
     */
    private com.ccssoft.rsas.common.saschart.Axises _axises;

    /**
     * ͼ�����
     */
    private com.ccssoft.rsas.common.saschart.Title _title;

    /**
     * ͼ��
     */
    private com.ccssoft.rsas.common.saschart.Legend _legend;

    /**
     * ����
     */
    private com.ccssoft.rsas.common.saschart.QueryOrders _queryOrders;


      //----------------/
     //- Constructors -/
    //----------------/

    public SasChart() {
        super();
    } //-- com.regaltec.rsas.common.saschart.SasChart()


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
     * Method deleteHeight
     */
    public void deleteHeight()
    {
        this._has_height= false;
    } //-- void deleteHeight() 

    /**
     * Method deleteLeft
     */
    public void deleteLeft()
    {
        this._has_left= false;
    } //-- void deleteLeft() 

    /**
     * Method deleteMiddleColor
     */
    public void deleteMiddleColor()
    {
        this._has_middleColor= false;
    } //-- void deleteMiddleColor() 

    /**
     * Method deleteOrthogonal
     */
    public void deleteOrthogonal()
    {
        this._has_orthogonal= false;
    } //-- void deleteOrthogonal() 

    /**
     * Method deleteOrthogonalAngle
     */
    public void deleteOrthogonalAngle()
    {
        this._has_orthogonalAngle= false;
    } //-- void deleteOrthogonalAngle() 

    /**
     * Method deleteStartColor
     */
    public void deleteStartColor()
    {
        this._has_startColor= false;
    } //-- void deleteStartColor() 

    /**
     * Method deleteThick3D
     */
    public void deleteThick3D()
    {
        this._has_thick3D= false;
    } //-- void deleteThick3D() 

    /**
     * Method deleteTop
     */
    public void deleteTop()
    {
        this._has_top= false;
    } //-- void deleteTop() 

    /**
     * Method deleteUse3D
     */
    public void deleteUse3D()
    {
        this._has_use3D= false;
    } //-- void deleteUse3D() 

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
     * Returns the value of field 'axises'. The field 'axises' has
     * the following description:
     * ��ļ�����ǰ6��Ԫ��Ϊϵͳ�̶�Ҫ�������ᣬ�ֱ�Ϊ���ҡ��ϡ��¡�����ȡ�����ȵ��ᣬ�ӵ�7��Ԫ�ؿ�ʼΪ�Զ�����
     * 
     * @return the value of field 'axises'.
     */
    public com.ccssoft.rsas.common.saschart.Axises getAxises()
    {
        return this._axises;
    } //-- com.regaltec.rsas.common.saschart.Axises getAxises() 

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
     * Returns the value of field 'colorPalette'. The field
     * 'colorPalette' has the following description: ��ɫ��
     * 
     * @return the value of field 'colorPalette'.
     */
    public java.lang.String getColorPalette()
    {
        return this._colorPalette;
    } //-- java.lang.String getColorPalette() 

    /**
     * Returns the value of field 'dataStyle'. The field
     * 'dataStyle' has the following description: �����������
     * 
     * @return the value of field 'dataStyle'.
     */
    public com.ccssoft.rsas.common.saschart.types.SasChartDataStyleType getDataStyle()
    {
        return this._dataStyle;
    } //-- com.regaltec.rsas.common.saschart.types.SasChartDataStyleType getDataStyle() 

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
     * Returns the value of field 'groupDimensionItem'. The field
     * 'groupDimensionItem' has the following description:
     * ����ά�ȣ�null�������飬���ݼ������������Զ�ѡ����,�ֿ���
     * 
     * @return the value of field 'groupDimensionItem'.
     */
    public java.lang.String getGroupDimensionItem()
    {
        return this._groupDimensionItem;
    } //-- java.lang.String getGroupDimensionItem() 

    /**
     * Returns the value of field 'height'.
     * 
     * @return the value of field 'height'.
     */
    public int getHeight()
    {
        return this._height;
    } //-- int getHeight() 

    /**
     * Returns the value of field 'left'.
     * 
     * @return the value of field 'left'.
     */
    public int getLeft()
    {
        return this._left;
    } //-- int getLeft() 

    /**
     * Returns the value of field 'legend'. The field 'legend' has
     * the following description: ͼ��
     * 
     * @return the value of field 'legend'.
     */
    public com.ccssoft.rsas.common.saschart.Legend getLegend()
    {
        return this._legend;
    } //-- com.regaltec.rsas.common.saschart.Legend getLegend() 

    /**
     * Returns the value of field 'measureDimensionItem'. The field
     * 'measureDimensionItem' has the following description:
     * ά����ת����ά����ת�ɶ�������ɲ��̶�����
     * 
     * @return the value of field 'measureDimensionItem'.
     */
    public java.lang.String getMeasureDimensionItem()
    {
        return this._measureDimensionItem;
    } //-- java.lang.String getMeasureDimensionItem() 

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
     * Returns the value of field 'orthogonal'. The field
     * 'orthogonal' has the following description: �Ƿ�������ͼ
     * 
     * @return the value of field 'orthogonal'.
     */
    public byte getOrthogonal()
    {
        return this._orthogonal;
    } //-- byte getOrthogonal() 

    /**
     * Returns the value of field 'orthogonalAngle'. The field
     * 'orthogonalAngle' has the following description: ����ͼ�ĽǶ�
     * 
     * @return the value of field 'orthogonalAngle'.
     */
    public short getOrthogonalAngle()
    {
        return this._orthogonalAngle;
    } //-- short getOrthogonalAngle() 

    /**
     * Returns the value of field 'queryID'. The field 'queryID'
     * has the following description: ͼ�����õĲ�ѯ
     * 
     * @return the value of field 'queryID'.
     */
    public java.lang.String getQueryID()
    {
        return this._queryID;
    } //-- java.lang.String getQueryID() 

    /**
     * Returns the value of field 'queryOrders'. The field
     * 'queryOrders' has the following description: ����
     * 
     * @return the value of field 'queryOrders'.
     */
    public com.ccssoft.rsas.common.saschart.QueryOrders getQueryOrders()
    {
        return this._queryOrders;
    } //-- com.regaltec.rsas.common.saschart.QueryOrders getQueryOrders() 

    /**
     * Returns the value of field 'seriesList'. The field
     * 'seriesList' has the following description: ϵ�м���
     * 
     * @return the value of field 'seriesList'.
     */
    public com.ccssoft.rsas.common.saschart.SeriesList getSeriesList()
    {
        return this._seriesList;
    } //-- com.regaltec.rsas.common.saschart.SeriesList getSeriesList() 

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
     * Returns the value of field 'themes'. The field 'themes' has
     * the following description: ͼ��ѡ�õ�����
     * 
     * @return the value of field 'themes'.
     */
    public com.ccssoft.rsas.common.saschart.types.SasChartThemesType getThemes()
    {
        return this._themes;
    } //-- com.regaltec.rsas.common.saschart.types.SasChartThemesType getThemes() 

    /**
     * Returns the value of field 'thick3D'. The field 'thick3D'
     * has the following description: 3Dͼ��ĺ�ȣ�%
     * 
     * @return the value of field 'thick3D'.
     */
    public short getThick3D()
    {
        return this._thick3D;
    } //-- short getThick3D() 

    /**
     * Returns the value of field 'title'. The field 'title' has
     * the following description: ͼ�����
     * 
     * @return the value of field 'title'.
     */
    public com.ccssoft.rsas.common.saschart.Title getTitle()
    {
        return this._title;
    } //-- com.regaltec.rsas.common.saschart.Title getTitle() 

    /**
     * Returns the value of field 'top'.
     * 
     * @return the value of field 'top'.
     */
    public int getTop()
    {
        return this._top;
    } //-- int getTop() 

    /**
     * Returns the value of field 'use3D'. The field 'use3D' has
     * the following description: �Ƿ�ʹ��3Dͼ��
     * 
     * @return the value of field 'use3D'.
     */
    public byte getUse3D()
    {
        return this._use3D;
    } //-- byte getUse3D() 

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
     * Returns the value of field 'width'.
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
     * Method hasHeight
     */
    public boolean hasHeight()
    {
        return this._has_height;
    } //-- boolean hasHeight() 

    /**
     * Method hasLeft
     */
    public boolean hasLeft()
    {
        return this._has_left;
    } //-- boolean hasLeft() 

    /**
     * Method hasMiddleColor
     */
    public boolean hasMiddleColor()
    {
        return this._has_middleColor;
    } //-- boolean hasMiddleColor() 

    /**
     * Method hasOrthogonal
     */
    public boolean hasOrthogonal()
    {
        return this._has_orthogonal;
    } //-- boolean hasOrthogonal() 

    /**
     * Method hasOrthogonalAngle
     */
    public boolean hasOrthogonalAngle()
    {
        return this._has_orthogonalAngle;
    } //-- boolean hasOrthogonalAngle() 

    /**
     * Method hasStartColor
     */
    public boolean hasStartColor()
    {
        return this._has_startColor;
    } //-- boolean hasStartColor() 

    /**
     * Method hasThick3D
     */
    public boolean hasThick3D()
    {
        return this._has_thick3D;
    } //-- boolean hasThick3D() 

    /**
     * Method hasTop
     */
    public boolean hasTop()
    {
        return this._has_top;
    } //-- boolean hasTop() 

    /**
     * Method hasUse3D
     */
    public boolean hasUse3D()
    {
        return this._has_use3D;
    } //-- boolean hasUse3D() 

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
     * Sets the value of field 'axises'. The field 'axises' has the
     * following description:
     * ��ļ�����ǰ6��Ԫ��Ϊϵͳ�̶�Ҫ�������ᣬ�ֱ�Ϊ���ҡ��ϡ��¡�����ȡ�����ȵ��ᣬ�ӵ�7��Ԫ�ؿ�ʼΪ�Զ�����
     * 
     * @param axises the value of field 'axises'.
     */
    public void setAxises(com.ccssoft.rsas.common.saschart.Axises axises)
    {
        this._axises = axises;
    } //-- void setAxises(com.regaltec.rsas.common.saschart.Axises) 

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
     * Sets the value of field 'colorPalette'. The field
     * 'colorPalette' has the following description: ��ɫ��
     * 
     * @param colorPalette the value of field 'colorPalette'.
     */
    public void setColorPalette(java.lang.String colorPalette)
    {
        this._colorPalette = colorPalette;
    } //-- void setColorPalette(java.lang.String) 

    /**
     * Sets the value of field 'dataStyle'. The field 'dataStyle'
     * has the following description: �����������
     * 
     * @param dataStyle the value of field 'dataStyle'.
     */
    public void setDataStyle(com.ccssoft.rsas.common.saschart.types.SasChartDataStyleType dataStyle)
    {
        this._dataStyle = dataStyle;
    } //-- void setDataStyle(com.regaltec.rsas.common.saschart.types.SasChartDataStyleType) 

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
     * Sets the value of field 'groupDimensionItem'. The field
     * 'groupDimensionItem' has the following description:
     * ����ά�ȣ�null�������飬���ݼ������������Զ�ѡ����,�ֿ���
     * 
     * @param groupDimensionItem the value of field
     * 'groupDimensionItem'.
     */
    public void setGroupDimensionItem(java.lang.String groupDimensionItem)
    {
        this._groupDimensionItem = groupDimensionItem;
    } //-- void setGroupDimensionItem(java.lang.String) 

    /**
     * Sets the value of field 'height'.
     * 
     * @param height the value of field 'height'.
     */
    public void setHeight(int height)
    {
        this._height = height;
        this._has_height = true;
    } //-- void setHeight(int) 

    /**
     * Sets the value of field 'left'.
     * 
     * @param left the value of field 'left'.
     */
    public void setLeft(int left)
    {
        this._left = left;
        this._has_left = true;
    } //-- void setLeft(int) 

    /**
     * Sets the value of field 'legend'. The field 'legend' has the
     * following description: ͼ��
     * 
     * @param legend the value of field 'legend'.
     */
    public void setLegend(com.ccssoft.rsas.common.saschart.Legend legend)
    {
        this._legend = legend;
    } //-- void setLegend(com.regaltec.rsas.common.saschart.Legend) 

    /**
     * Sets the value of field 'measureDimensionItem'. The field
     * 'measureDimensionItem' has the following description:
     * ά����ת����ά����ת�ɶ�������ɲ��̶�����
     * 
     * @param measureDimensionItem the value of field
     * 'measureDimensionItem'.
     */
    public void setMeasureDimensionItem(java.lang.String measureDimensionItem)
    {
        this._measureDimensionItem = measureDimensionItem;
    } //-- void setMeasureDimensionItem(java.lang.String) 

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
     * Sets the value of field 'orthogonal'. The field 'orthogonal'
     * has the following description: �Ƿ�������ͼ
     * 
     * @param orthogonal the value of field 'orthogonal'.
     */
    public void setOrthogonal(byte orthogonal)
    {
        this._orthogonal = orthogonal;
        this._has_orthogonal = true;
    } //-- void setOrthogonal(byte) 

    /**
     * Sets the value of field 'orthogonalAngle'. The field
     * 'orthogonalAngle' has the following description: ����ͼ�ĽǶ�
     * 
     * @param orthogonalAngle the value of field 'orthogonalAngle'.
     */
    public void setOrthogonalAngle(short orthogonalAngle)
    {
        this._orthogonalAngle = orthogonalAngle;
        this._has_orthogonalAngle = true;
    } //-- void setOrthogonalAngle(short) 

    /**
     * Sets the value of field 'queryID'. The field 'queryID' has
     * the following description: ͼ�����õĲ�ѯ
     * 
     * @param queryID the value of field 'queryID'.
     */
    public void setQueryID(java.lang.String queryID)
    {
        this._queryID = queryID;
    } //-- void setQueryID(java.lang.String) 

    /**
     * Sets the value of field 'queryOrders'. The field
     * 'queryOrders' has the following description: ����
     * 
     * @param queryOrders the value of field 'queryOrders'.
     */
    public void setQueryOrders(com.ccssoft.rsas.common.saschart.QueryOrders queryOrders)
    {
        this._queryOrders = queryOrders;
    } //-- void setQueryOrders(com.regaltec.rsas.common.saschart.QueryOrders) 

    /**
     * Sets the value of field 'seriesList'. The field 'seriesList'
     * has the following description: ϵ�м���
     * 
     * @param seriesList the value of field 'seriesList'.
     */
    public void setSeriesList(com.ccssoft.rsas.common.saschart.SeriesList seriesList)
    {
        this._seriesList = seriesList;
    } //-- void setSeriesList(com.regaltec.rsas.common.saschart.SeriesList) 

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
     * Sets the value of field 'themes'. The field 'themes' has the
     * following description: ͼ��ѡ�õ�����
     * 
     * @param themes the value of field 'themes'.
     */
    public void setThemes(com.ccssoft.rsas.common.saschart.types.SasChartThemesType themes)
    {
        this._themes = themes;
    } //-- void setThemes(com.regaltec.rsas.common.saschart.types.SasChartThemesType) 

    /**
     * Sets the value of field 'thick3D'. The field 'thick3D' has
     * the following description: 3Dͼ��ĺ�ȣ�%
     * 
     * @param thick3D the value of field 'thick3D'.
     */
    public void setThick3D(short thick3D)
    {
        this._thick3D = thick3D;
        this._has_thick3D = true;
    } //-- void setThick3D(short) 

    /**
     * Sets the value of field 'title'. The field 'title' has the
     * following description: ͼ�����
     * 
     * @param title the value of field 'title'.
     */
    public void setTitle(com.ccssoft.rsas.common.saschart.Title title)
    {
        this._title = title;
    } //-- void setTitle(com.regaltec.rsas.common.saschart.Title) 

    /**
     * Sets the value of field 'top'.
     * 
     * @param top the value of field 'top'.
     */
    public void setTop(int top)
    {
        this._top = top;
        this._has_top = true;
    } //-- void setTop(int) 

    /**
     * Sets the value of field 'use3D'. The field 'use3D' has the
     * following description: �Ƿ�ʹ��3Dͼ��
     * 
     * @param use3D the value of field 'use3D'.
     */
    public void setUse3D(byte use3D)
    {
        this._use3D = use3D;
        this._has_use3D = true;
    } //-- void setUse3D(byte) 

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
     * Sets the value of field 'width'.
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
        return (com.ccssoft.rsas.common.saschart.SasChart) Unmarshaller.unmarshal(com.ccssoft.rsas.common.saschart.SasChart.class, reader);
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
