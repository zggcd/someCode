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
import java.util.Enumeration;
import java.util.Vector;
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
public class Chart implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����ɫ
     */
    private java.lang.String _bgColor;

    /**
     * ��߿�ʼ�̶�
     */
    private int _gaugeStartAngle;

    /**
     * keeps track of state for field: _gaugeStartAngle
     */
    private boolean _has_gaugeStartAngle;

    /**
     * ��߽����̶�
     */
    private int _gaugeEndAngle;

    /**
     * keeps track of state for field: _gaugeEndAngle
     */
    private boolean _has_gaugeEndAngle;

    /**
     * ���ֵ
     */
    private double _upperLimit;

    /**
     * keeps track of state for field: _upperLimit
     */
    private boolean _has_upperLimit;

    /**
     * ��Сֵ
     */
    private double _lowerLimit;

    /**
     * keeps track of state for field: _lowerLimit
     */
    private boolean _has_lowerLimit;

    /**
     * �Ƿ���ʾ�����Сֵ
     */
    private java.lang.String _showLimits;

    /**
     * ������ɫ
     */
    private java.lang.String _baseFontColor;

    /**
     * ���̶ȸ���
     */
    private int _majorTMNumber;

    /**
     * keeps track of state for field: _majorTMNumber
     */
    private boolean _has_majorTMNumber;

    /**
     * ���̶���ɫ
     */
    private java.lang.String _majorTMColor;

    /**
     * ���̶ȸ߶�
     */
    private int _majorTMHeight;

    /**
     * keeps track of state for field: _majorTMHeight
     */
    private boolean _has_majorTMHeight;

    /**
     * С�̶ȸ���
     */
    private int _minorTMNumber;

    /**
     * keeps track of state for field: _minorTMNumber
     */
    private boolean _has_minorTMNumber;

    /**
     * С�̶���ɫ
     */
    private java.lang.String _minorTMColor;

    /**
     * С�̶ȸ߶�
     */
    private int _minorTMHeight;

    /**
     * keeps track of state for field: _minorTMHeight
     */
    private boolean _has_minorTMHeight;

    /**
     * ��תԲ�뾶
     */
    private int _pivotRadius;

    /**
     * keeps track of state for field: _pivotRadius
     */
    private boolean _has_pivotRadius;

    /**
     * �Ƿ���ʾ��߱߿�
     */
    private int _showGaugeBorder;

    /**
     * keeps track of state for field: _showGaugeBorder
     */
    private boolean _has_showGaugeBorder;

    /**
     * �����Χ�뾶
     */
    private int _gaugeOuterRadius;

    /**
     * keeps track of state for field: _gaugeOuterRadius
     */
    private boolean _has_gaugeOuterRadius;

    /**
     * ����ڲ��뾶
     */
    private int _gaugeInnerRadius;

    /**
     * keeps track of state for field: _gaugeInnerRadius
     */
    private boolean _has_gaugeInnerRadius;

    /**
     * ��߿�ʼλ�ã���ֵ��ͼ��ĸ߶ȣ���ȼ��������
     */
    private int _gaugeOriginX;

    /**
     * keeps track of state for field: _gaugeOriginX
     */
    private boolean _has_gaugeOriginX;

    /**
     * Field _gaugeOriginY
     */
    private int _gaugeOriginY;

    /**
     * keeps track of state for field: _gaugeOriginY
     */
    private boolean _has_gaugeOriginY;

    /**
     * ��ʾ�̶�ֵ�ľ���
     */
    private int _displayValueDistance;

    /**
     * keeps track of state for field: _displayValueDistance
     */
    private boolean _has_displayValueDistance;

    /**
     * ��߿̶�ֵ�Ƿ�ڷ������棺1������ ����������
     */
    private byte _placeValuesInside;

    /**
     * keeps track of state for field: _placeValuesInside
     */
    private boolean _has_placeValuesInside;

    /**
     * �����������ͣ������ԶԿ̶���ʾ��Ӱ�졣
     */
    private java.lang.String _gaugeFillMix;

    /**
     * ��תԲ�������ɫ������{F0EFEA}, {BEBCB0}
     */
    private java.lang.String _pivotFillMix;

    /**
     * ��תԲ���ı�������pivotFillMix����ʹ�á�
     */
    private java.lang.String _pivotfillRatio;

    /**
     * ��תԲ�߿���ɫ
     */
    private java.lang.String _pivotBorderColor;

    /**
     * �Ƿ���ʾ��Ӱ
     */
    private byte _showShadow;

    /**
     * keeps track of state for field: _showShadow
     */
    private boolean _has_showShadow;

    /**
     * ��ɫ�뷶Χֵ�Ĺ�ϵ
     */
    private com.ccssoft.rsas.common.xmlparser.chart.meter.ColorRange _colorRange;

    /**
     * ��λ
     */
    private java.util.Vector _trendpointsList;

    /**
     * Field _annotations
     */
    private com.ccssoft.rsas.common.xmlparser.chart.meter.Annotations _annotations;

    /**
     * Field _dials
     */
    private com.ccssoft.rsas.common.xmlparser.chart.meter.Dials _dials;


      //----------------/
     //- Constructors -/
    //----------------/

    public Chart() {
        super();
        _trendpointsList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Chart()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTrendpoints
     * 
     * @param vTrendpoints
     */
    public void addTrendpoints(com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints vTrendpoints)
        throws java.lang.IndexOutOfBoundsException
    {
        _trendpointsList.addElement(vTrendpoints);
    } //-- void addTrendpoints(com.regaltec.rsas.common.xmlparser.chart.meter.Trendpoints) 

    /**
     * Method addTrendpoints
     * 
     * @param index
     * @param vTrendpoints
     */
    public void addTrendpoints(int index, com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints vTrendpoints)
        throws java.lang.IndexOutOfBoundsException
    {
        _trendpointsList.insertElementAt(vTrendpoints, index);
    } //-- void addTrendpoints(int, com.regaltec.rsas.common.xmlparser.chart.meter.Trendpoints) 

    /**
     * Method deleteDisplayValueDistance
     */
    public void deleteDisplayValueDistance()
    {
        this._has_displayValueDistance= false;
    } //-- void deleteDisplayValueDistance() 

    /**
     * Method deleteGaugeEndAngle
     */
    public void deleteGaugeEndAngle()
    {
        this._has_gaugeEndAngle= false;
    } //-- void deleteGaugeEndAngle() 

    /**
     * Method deleteGaugeInnerRadius
     */
    public void deleteGaugeInnerRadius()
    {
        this._has_gaugeInnerRadius= false;
    } //-- void deleteGaugeInnerRadius() 

    /**
     * Method deleteGaugeOriginX
     */
    public void deleteGaugeOriginX()
    {
        this._has_gaugeOriginX= false;
    } //-- void deleteGaugeOriginX() 

    /**
     * Method deleteGaugeOriginY
     */
    public void deleteGaugeOriginY()
    {
        this._has_gaugeOriginY= false;
    } //-- void deleteGaugeOriginY() 

    /**
     * Method deleteGaugeOuterRadius
     */
    public void deleteGaugeOuterRadius()
    {
        this._has_gaugeOuterRadius= false;
    } //-- void deleteGaugeOuterRadius() 

    /**
     * Method deleteGaugeStartAngle
     */
    public void deleteGaugeStartAngle()
    {
        this._has_gaugeStartAngle= false;
    } //-- void deleteGaugeStartAngle() 

    /**
     * Method deleteLowerLimit
     */
    public void deleteLowerLimit()
    {
        this._has_lowerLimit= false;
    } //-- void deleteLowerLimit() 

    /**
     * Method deleteMajorTMHeight
     */
    public void deleteMajorTMHeight()
    {
        this._has_majorTMHeight= false;
    } //-- void deleteMajorTMHeight() 

    /**
     * Method deleteMajorTMNumber
     */
    public void deleteMajorTMNumber()
    {
        this._has_majorTMNumber= false;
    } //-- void deleteMajorTMNumber() 

    /**
     * Method deleteMinorTMHeight
     */
    public void deleteMinorTMHeight()
    {
        this._has_minorTMHeight= false;
    } //-- void deleteMinorTMHeight() 

    /**
     * Method deleteMinorTMNumber
     */
    public void deleteMinorTMNumber()
    {
        this._has_minorTMNumber= false;
    } //-- void deleteMinorTMNumber() 

    /**
     * Method deletePivotRadius
     */
    public void deletePivotRadius()
    {
        this._has_pivotRadius= false;
    } //-- void deletePivotRadius() 

    /**
     * Method deletePlaceValuesInside
     */
    public void deletePlaceValuesInside()
    {
        this._has_placeValuesInside= false;
    } //-- void deletePlaceValuesInside() 

    /**
     * Method deleteShowGaugeBorder
     */
    public void deleteShowGaugeBorder()
    {
        this._has_showGaugeBorder= false;
    } //-- void deleteShowGaugeBorder() 

    /**
     * Method deleteShowShadow
     */
    public void deleteShowShadow()
    {
        this._has_showShadow= false;
    } //-- void deleteShowShadow() 

    /**
     * Method deleteUpperLimit
     */
    public void deleteUpperLimit()
    {
        this._has_upperLimit= false;
    } //-- void deleteUpperLimit() 

    /**
     * Method enumerateTrendpoints
     */
    public java.util.Enumeration enumerateTrendpoints()
    {
        return _trendpointsList.elements();
    } //-- java.util.Enumeration enumerateTrendpoints() 

    /**
     * Returns the value of field 'annotations'.
     * 
     * @return the value of field 'annotations'.
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.Annotations getAnnotations()
    {
        return this._annotations;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Annotations getAnnotations() 

    /**
     * Returns the value of field 'baseFontColor'. The field
     * 'baseFontColor' has the following description: ������ɫ
     * 
     * @return the value of field 'baseFontColor'.
     */
    public java.lang.String getBaseFontColor()
    {
        return this._baseFontColor;
    } //-- java.lang.String getBaseFontColor() 

    /**
     * Returns the value of field 'bgColor'. The field 'bgColor'
     * has the following description: ����ɫ
     * 
     * @return the value of field 'bgColor'.
     */
    public java.lang.String getBgColor()
    {
        return this._bgColor;
    } //-- java.lang.String getBgColor() 

    /**
     * Returns the value of field 'colorRange'. The field
     * 'colorRange' has the following description: ��ɫ�뷶Χֵ�Ĺ�ϵ
     * 
     * @return the value of field 'colorRange'.
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.ColorRange getColorRange()
    {
        return this._colorRange;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.ColorRange getColorRange() 

    /**
     * Returns the value of field 'dials'.
     * 
     * @return the value of field 'dials'.
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.Dials getDials()
    {
        return this._dials;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Dials getDials() 

    /**
     * Returns the value of field 'displayValueDistance'. The field
     * 'displayValueDistance' has the following description:
     * ��ʾ�̶�ֵ�ľ���
     * 
     * @return the value of field 'displayValueDistance'.
     */
    public int getDisplayValueDistance()
    {
        return this._displayValueDistance;
    } //-- int getDisplayValueDistance() 

    /**
     * Returns the value of field 'gaugeEndAngle'. The field
     * 'gaugeEndAngle' has the following description: ��߽����̶�
     * 
     * @return the value of field 'gaugeEndAngle'.
     */
    public int getGaugeEndAngle()
    {
        return this._gaugeEndAngle;
    } //-- int getGaugeEndAngle() 

    /**
     * Returns the value of field 'gaugeFillMix'. The field
     * 'gaugeFillMix' has the following description:
     * �����������ͣ������ԶԿ̶���ʾ��Ӱ�졣
     * 
     * @return the value of field 'gaugeFillMix'.
     */
    public java.lang.String getGaugeFillMix()
    {
        return this._gaugeFillMix;
    } //-- java.lang.String getGaugeFillMix() 

    /**
     * Returns the value of field 'gaugeInnerRadius'. The field
     * 'gaugeInnerRadius' has the following description: ����ڲ��뾶
     * 
     * @return the value of field 'gaugeInnerRadius'.
     */
    public int getGaugeInnerRadius()
    {
        return this._gaugeInnerRadius;
    } //-- int getGaugeInnerRadius() 

    /**
     * Returns the value of field 'gaugeOriginX'. The field
     * 'gaugeOriginX' has the following description:
     * ��߿�ʼλ�ã���ֵ��ͼ��ĸ߶ȣ���ȼ��������
     * 
     * @return the value of field 'gaugeOriginX'.
     */
    public int getGaugeOriginX()
    {
        return this._gaugeOriginX;
    } //-- int getGaugeOriginX() 

    /**
     * Returns the value of field 'gaugeOriginY'.
     * 
     * @return the value of field 'gaugeOriginY'.
     */
    public int getGaugeOriginY()
    {
        return this._gaugeOriginY;
    } //-- int getGaugeOriginY() 

    /**
     * Returns the value of field 'gaugeOuterRadius'. The field
     * 'gaugeOuterRadius' has the following description: �����Χ�뾶
     * 
     * @return the value of field 'gaugeOuterRadius'.
     */
    public int getGaugeOuterRadius()
    {
        return this._gaugeOuterRadius;
    } //-- int getGaugeOuterRadius() 

    /**
     * Returns the value of field 'gaugeStartAngle'. The field
     * 'gaugeStartAngle' has the following description: ��߿�ʼ�̶�
     * 
     * @return the value of field 'gaugeStartAngle'.
     */
    public int getGaugeStartAngle()
    {
        return this._gaugeStartAngle;
    } //-- int getGaugeStartAngle() 

    /**
     * Returns the value of field 'lowerLimit'. The field
     * 'lowerLimit' has the following description: ��Сֵ
     * 
     * @return the value of field 'lowerLimit'.
     */
    public double getLowerLimit()
    {
        return this._lowerLimit;
    } //-- double getLowerLimit() 

    /**
     * Returns the value of field 'majorTMColor'. The field
     * 'majorTMColor' has the following description: ���̶���ɫ
     * 
     * @return the value of field 'majorTMColor'.
     */
    public java.lang.String getMajorTMColor()
    {
        return this._majorTMColor;
    } //-- java.lang.String getMajorTMColor() 

    /**
     * Returns the value of field 'majorTMHeight'. The field
     * 'majorTMHeight' has the following description: ���̶ȸ߶�
     * 
     * @return the value of field 'majorTMHeight'.
     */
    public int getMajorTMHeight()
    {
        return this._majorTMHeight;
    } //-- int getMajorTMHeight() 

    /**
     * Returns the value of field 'majorTMNumber'. The field
     * 'majorTMNumber' has the following description: ���̶ȸ���
     * 
     * @return the value of field 'majorTMNumber'.
     */
    public int getMajorTMNumber()
    {
        return this._majorTMNumber;
    } //-- int getMajorTMNumber() 

    /**
     * Returns the value of field 'minorTMColor'. The field
     * 'minorTMColor' has the following description: С�̶���ɫ
     * 
     * @return the value of field 'minorTMColor'.
     */
    public java.lang.String getMinorTMColor()
    {
        return this._minorTMColor;
    } //-- java.lang.String getMinorTMColor() 

    /**
     * Returns the value of field 'minorTMHeight'. The field
     * 'minorTMHeight' has the following description: С�̶ȸ߶�
     * 
     * @return the value of field 'minorTMHeight'.
     */
    public int getMinorTMHeight()
    {
        return this._minorTMHeight;
    } //-- int getMinorTMHeight() 

    /**
     * Returns the value of field 'minorTMNumber'. The field
     * 'minorTMNumber' has the following description: С�̶ȸ���
     * 
     * @return the value of field 'minorTMNumber'.
     */
    public int getMinorTMNumber()
    {
        return this._minorTMNumber;
    } //-- int getMinorTMNumber() 

    /**
     * Returns the value of field 'pivotBorderColor'. The field
     * 'pivotBorderColor' has the following description: ��תԲ�߿���ɫ
     * 
     * @return the value of field 'pivotBorderColor'.
     */
    public java.lang.String getPivotBorderColor()
    {
        return this._pivotBorderColor;
    } //-- java.lang.String getPivotBorderColor() 

    /**
     * Returns the value of field 'pivotFillMix'. The field
     * 'pivotFillMix' has the following description:
     * ��תԲ�������ɫ������{F0EFEA}, {BEBCB0}
     * 
     * @return the value of field 'pivotFillMix'.
     */
    public java.lang.String getPivotFillMix()
    {
        return this._pivotFillMix;
    } //-- java.lang.String getPivotFillMix() 

    /**
     * Returns the value of field 'pivotRadius'. The field
     * 'pivotRadius' has the following description: ��תԲ�뾶
     * 
     * @return the value of field 'pivotRadius'.
     */
    public int getPivotRadius()
    {
        return this._pivotRadius;
    } //-- int getPivotRadius() 

    /**
     * Returns the value of field 'pivotfillRatio'. The field
     * 'pivotfillRatio' has the following description:
     * ��תԲ���ı�������pivotFillMix����ʹ�á�
     * 
     * @return the value of field 'pivotfillRatio'.
     */
    public java.lang.String getPivotfillRatio()
    {
        return this._pivotfillRatio;
    } //-- java.lang.String getPivotfillRatio() 

    /**
     * Returns the value of field 'placeValuesInside'. The field
     * 'placeValuesInside' has the following description:
     * ��߿̶�ֵ�Ƿ�ڷ������棺1������ ����������
     * 
     * @return the value of field 'placeValuesInside'.
     */
    public byte getPlaceValuesInside()
    {
        return this._placeValuesInside;
    } //-- byte getPlaceValuesInside() 

    /**
     * Returns the value of field 'showGaugeBorder'. The field
     * 'showGaugeBorder' has the following description: �Ƿ���ʾ��߱߿�
     * 
     * @return the value of field 'showGaugeBorder'.
     */
    public int getShowGaugeBorder()
    {
        return this._showGaugeBorder;
    } //-- int getShowGaugeBorder() 

    /**
     * Returns the value of field 'showLimits'. The field
     * 'showLimits' has the following description: �Ƿ���ʾ�����Сֵ
     * 
     * @return the value of field 'showLimits'.
     */
    public java.lang.String getShowLimits()
    {
        return this._showLimits;
    } //-- java.lang.String getShowLimits() 

    /**
     * Returns the value of field 'showShadow'. The field
     * 'showShadow' has the following description: �Ƿ���ʾ��Ӱ
     * 
     * @return the value of field 'showShadow'.
     */
    public byte getShowShadow()
    {
        return this._showShadow;
    } //-- byte getShowShadow() 

    /**
     * Method getTrendpoints
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints getTrendpoints(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _trendpointsList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints) _trendpointsList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Trendpoints getTrendpoints(int) 

    /**
     * Method getTrendpoints
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints[] getTrendpoints()
    {
        int size = _trendpointsList.size();
        com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints[] mArray = new com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints) _trendpointsList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Trendpoints[] getTrendpoints() 

    /**
     * Method getTrendpointsCount
     */
    public int getTrendpointsCount()
    {
        return _trendpointsList.size();
    } //-- int getTrendpointsCount() 

    /**
     * Returns the value of field 'upperLimit'. The field
     * 'upperLimit' has the following description: ���ֵ
     * 
     * @return the value of field 'upperLimit'.
     */
    public double getUpperLimit()
    {
        return this._upperLimit;
    } //-- double getUpperLimit() 

    /**
     * Method hasDisplayValueDistance
     */
    public boolean hasDisplayValueDistance()
    {
        return this._has_displayValueDistance;
    } //-- boolean hasDisplayValueDistance() 

    /**
     * Method hasGaugeEndAngle
     */
    public boolean hasGaugeEndAngle()
    {
        return this._has_gaugeEndAngle;
    } //-- boolean hasGaugeEndAngle() 

    /**
     * Method hasGaugeInnerRadius
     */
    public boolean hasGaugeInnerRadius()
    {
        return this._has_gaugeInnerRadius;
    } //-- boolean hasGaugeInnerRadius() 

    /**
     * Method hasGaugeOriginX
     */
    public boolean hasGaugeOriginX()
    {
        return this._has_gaugeOriginX;
    } //-- boolean hasGaugeOriginX() 

    /**
     * Method hasGaugeOriginY
     */
    public boolean hasGaugeOriginY()
    {
        return this._has_gaugeOriginY;
    } //-- boolean hasGaugeOriginY() 

    /**
     * Method hasGaugeOuterRadius
     */
    public boolean hasGaugeOuterRadius()
    {
        return this._has_gaugeOuterRadius;
    } //-- boolean hasGaugeOuterRadius() 

    /**
     * Method hasGaugeStartAngle
     */
    public boolean hasGaugeStartAngle()
    {
        return this._has_gaugeStartAngle;
    } //-- boolean hasGaugeStartAngle() 

    /**
     * Method hasLowerLimit
     */
    public boolean hasLowerLimit()
    {
        return this._has_lowerLimit;
    } //-- boolean hasLowerLimit() 

    /**
     * Method hasMajorTMHeight
     */
    public boolean hasMajorTMHeight()
    {
        return this._has_majorTMHeight;
    } //-- boolean hasMajorTMHeight() 

    /**
     * Method hasMajorTMNumber
     */
    public boolean hasMajorTMNumber()
    {
        return this._has_majorTMNumber;
    } //-- boolean hasMajorTMNumber() 

    /**
     * Method hasMinorTMHeight
     */
    public boolean hasMinorTMHeight()
    {
        return this._has_minorTMHeight;
    } //-- boolean hasMinorTMHeight() 

    /**
     * Method hasMinorTMNumber
     */
    public boolean hasMinorTMNumber()
    {
        return this._has_minorTMNumber;
    } //-- boolean hasMinorTMNumber() 

    /**
     * Method hasPivotRadius
     */
    public boolean hasPivotRadius()
    {
        return this._has_pivotRadius;
    } //-- boolean hasPivotRadius() 

    /**
     * Method hasPlaceValuesInside
     */
    public boolean hasPlaceValuesInside()
    {
        return this._has_placeValuesInside;
    } //-- boolean hasPlaceValuesInside() 

    /**
     * Method hasShowGaugeBorder
     */
    public boolean hasShowGaugeBorder()
    {
        return this._has_showGaugeBorder;
    } //-- boolean hasShowGaugeBorder() 

    /**
     * Method hasShowShadow
     */
    public boolean hasShowShadow()
    {
        return this._has_showShadow;
    } //-- boolean hasShowShadow() 

    /**
     * Method hasUpperLimit
     */
    public boolean hasUpperLimit()
    {
        return this._has_upperLimit;
    } //-- boolean hasUpperLimit() 

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
     * Method removeAllTrendpoints
     */
    public void removeAllTrendpoints()
    {
        _trendpointsList.removeAllElements();
    } //-- void removeAllTrendpoints() 

    /**
     * Method removeTrendpoints
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints removeTrendpoints(int index)
    {
        java.lang.Object obj = _trendpointsList.elementAt(index);
        _trendpointsList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Trendpoints removeTrendpoints(int) 

    /**
     * Sets the value of field 'annotations'.
     * 
     * @param annotations the value of field 'annotations'.
     */
    public void setAnnotations(com.ccssoft.rsas.common.xmlparser.chart.meter.Annotations annotations)
    {
        this._annotations = annotations;
    } //-- void setAnnotations(com.regaltec.rsas.common.xmlparser.chart.meter.Annotations) 

    /**
     * Sets the value of field 'baseFontColor'. The field
     * 'baseFontColor' has the following description: ������ɫ
     * 
     * @param baseFontColor the value of field 'baseFontColor'.
     */
    public void setBaseFontColor(java.lang.String baseFontColor)
    {
        this._baseFontColor = baseFontColor;
    } //-- void setBaseFontColor(java.lang.String) 

    /**
     * Sets the value of field 'bgColor'. The field 'bgColor' has
     * the following description: ����ɫ
     * 
     * @param bgColor the value of field 'bgColor'.
     */
    public void setBgColor(java.lang.String bgColor)
    {
        this._bgColor = bgColor;
    } //-- void setBgColor(java.lang.String) 

    /**
     * Sets the value of field 'colorRange'. The field 'colorRange'
     * has the following description: ��ɫ�뷶Χֵ�Ĺ�ϵ
     * 
     * @param colorRange the value of field 'colorRange'.
     */
    public void setColorRange(com.ccssoft.rsas.common.xmlparser.chart.meter.ColorRange colorRange)
    {
        this._colorRange = colorRange;
    } //-- void setColorRange(com.regaltec.rsas.common.xmlparser.chart.meter.ColorRange) 

    /**
     * Sets the value of field 'dials'.
     * 
     * @param dials the value of field 'dials'.
     */
    public void setDials(com.ccssoft.rsas.common.xmlparser.chart.meter.Dials dials)
    {
        this._dials = dials;
    } //-- void setDials(com.regaltec.rsas.common.xmlparser.chart.meter.Dials) 

    /**
     * Sets the value of field 'displayValueDistance'. The field
     * 'displayValueDistance' has the following description:
     * ��ʾ�̶�ֵ�ľ���
     * 
     * @param displayValueDistance the value of field
     * 'displayValueDistance'.
     */
    public void setDisplayValueDistance(int displayValueDistance)
    {
        this._displayValueDistance = displayValueDistance;
        this._has_displayValueDistance = true;
    } //-- void setDisplayValueDistance(int) 

    /**
     * Sets the value of field 'gaugeEndAngle'. The field
     * 'gaugeEndAngle' has the following description: ��߽����̶�
     * 
     * @param gaugeEndAngle the value of field 'gaugeEndAngle'.
     */
    public void setGaugeEndAngle(int gaugeEndAngle)
    {
        this._gaugeEndAngle = gaugeEndAngle;
        this._has_gaugeEndAngle = true;
    } //-- void setGaugeEndAngle(int) 

    /**
     * Sets the value of field 'gaugeFillMix'. The field
     * 'gaugeFillMix' has the following description:
     * �����������ͣ������ԶԿ̶���ʾ��Ӱ�졣
     * 
     * @param gaugeFillMix the value of field 'gaugeFillMix'.
     */
    public void setGaugeFillMix(java.lang.String gaugeFillMix)
    {
        this._gaugeFillMix = gaugeFillMix;
    } //-- void setGaugeFillMix(java.lang.String) 

    /**
     * Sets the value of field 'gaugeInnerRadius'. The field
     * 'gaugeInnerRadius' has the following description: ����ڲ��뾶
     * 
     * @param gaugeInnerRadius the value of field 'gaugeInnerRadius'
     */
    public void setGaugeInnerRadius(int gaugeInnerRadius)
    {
        this._gaugeInnerRadius = gaugeInnerRadius;
        this._has_gaugeInnerRadius = true;
    } //-- void setGaugeInnerRadius(int) 

    /**
     * Sets the value of field 'gaugeOriginX'. The field
     * 'gaugeOriginX' has the following description:
     * ��߿�ʼλ�ã���ֵ��ͼ��ĸ߶ȣ���ȼ��������
     * 
     * @param gaugeOriginX the value of field 'gaugeOriginX'.
     */
    public void setGaugeOriginX(int gaugeOriginX)
    {
        this._gaugeOriginX = gaugeOriginX;
        this._has_gaugeOriginX = true;
    } //-- void setGaugeOriginX(int) 

    /**
     * Sets the value of field 'gaugeOriginY'.
     * 
     * @param gaugeOriginY the value of field 'gaugeOriginY'.
     */
    public void setGaugeOriginY(int gaugeOriginY)
    {
        this._gaugeOriginY = gaugeOriginY;
        this._has_gaugeOriginY = true;
    } //-- void setGaugeOriginY(int) 

    /**
     * Sets the value of field 'gaugeOuterRadius'. The field
     * 'gaugeOuterRadius' has the following description: �����Χ�뾶
     * 
     * @param gaugeOuterRadius the value of field 'gaugeOuterRadius'
     */
    public void setGaugeOuterRadius(int gaugeOuterRadius)
    {
        this._gaugeOuterRadius = gaugeOuterRadius;
        this._has_gaugeOuterRadius = true;
    } //-- void setGaugeOuterRadius(int) 

    /**
     * Sets the value of field 'gaugeStartAngle'. The field
     * 'gaugeStartAngle' has the following description: ��߿�ʼ�̶�
     * 
     * @param gaugeStartAngle the value of field 'gaugeStartAngle'.
     */
    public void setGaugeStartAngle(int gaugeStartAngle)
    {
        this._gaugeStartAngle = gaugeStartAngle;
        this._has_gaugeStartAngle = true;
    } //-- void setGaugeStartAngle(int) 

    /**
     * Sets the value of field 'lowerLimit'. The field 'lowerLimit'
     * has the following description: ��Сֵ
     * 
     * @param lowerLimit the value of field 'lowerLimit'.
     */
    public void setLowerLimit(double lowerLimit)
    {
        this._lowerLimit = lowerLimit;
        this._has_lowerLimit = true;
    } //-- void setLowerLimit(double) 

    /**
     * Sets the value of field 'majorTMColor'. The field
     * 'majorTMColor' has the following description: ���̶���ɫ
     * 
     * @param majorTMColor the value of field 'majorTMColor'.
     */
    public void setMajorTMColor(java.lang.String majorTMColor)
    {
        this._majorTMColor = majorTMColor;
    } //-- void setMajorTMColor(java.lang.String) 

    /**
     * Sets the value of field 'majorTMHeight'. The field
     * 'majorTMHeight' has the following description: ���̶ȸ߶�
     * 
     * @param majorTMHeight the value of field 'majorTMHeight'.
     */
    public void setMajorTMHeight(int majorTMHeight)
    {
        this._majorTMHeight = majorTMHeight;
        this._has_majorTMHeight = true;
    } //-- void setMajorTMHeight(int) 

    /**
     * Sets the value of field 'majorTMNumber'. The field
     * 'majorTMNumber' has the following description: ���̶ȸ���
     * 
     * @param majorTMNumber the value of field 'majorTMNumber'.
     */
    public void setMajorTMNumber(int majorTMNumber)
    {
        this._majorTMNumber = majorTMNumber;
        this._has_majorTMNumber = true;
    } //-- void setMajorTMNumber(int) 

    /**
     * Sets the value of field 'minorTMColor'. The field
     * 'minorTMColor' has the following description: С�̶���ɫ
     * 
     * @param minorTMColor the value of field 'minorTMColor'.
     */
    public void setMinorTMColor(java.lang.String minorTMColor)
    {
        this._minorTMColor = minorTMColor;
    } //-- void setMinorTMColor(java.lang.String) 

    /**
     * Sets the value of field 'minorTMHeight'. The field
     * 'minorTMHeight' has the following description: С�̶ȸ߶�
     * 
     * @param minorTMHeight the value of field 'minorTMHeight'.
     */
    public void setMinorTMHeight(int minorTMHeight)
    {
        this._minorTMHeight = minorTMHeight;
        this._has_minorTMHeight = true;
    } //-- void setMinorTMHeight(int) 

    /**
     * Sets the value of field 'minorTMNumber'. The field
     * 'minorTMNumber' has the following description: С�̶ȸ���
     * 
     * @param minorTMNumber the value of field 'minorTMNumber'.
     */
    public void setMinorTMNumber(int minorTMNumber)
    {
        this._minorTMNumber = minorTMNumber;
        this._has_minorTMNumber = true;
    } //-- void setMinorTMNumber(int) 

    /**
     * Sets the value of field 'pivotBorderColor'. The field
     * 'pivotBorderColor' has the following description: ��תԲ�߿���ɫ
     * 
     * @param pivotBorderColor the value of field 'pivotBorderColor'
     */
    public void setPivotBorderColor(java.lang.String pivotBorderColor)
    {
        this._pivotBorderColor = pivotBorderColor;
    } //-- void setPivotBorderColor(java.lang.String) 

    /**
     * Sets the value of field 'pivotFillMix'. The field
     * 'pivotFillMix' has the following description:
     * ��תԲ�������ɫ������{F0EFEA}, {BEBCB0}
     * 
     * @param pivotFillMix the value of field 'pivotFillMix'.
     */
    public void setPivotFillMix(java.lang.String pivotFillMix)
    {
        this._pivotFillMix = pivotFillMix;
    } //-- void setPivotFillMix(java.lang.String) 

    /**
     * Sets the value of field 'pivotRadius'. The field
     * 'pivotRadius' has the following description: ��תԲ�뾶
     * 
     * @param pivotRadius the value of field 'pivotRadius'.
     */
    public void setPivotRadius(int pivotRadius)
    {
        this._pivotRadius = pivotRadius;
        this._has_pivotRadius = true;
    } //-- void setPivotRadius(int) 

    /**
     * Sets the value of field 'pivotfillRatio'. The field
     * 'pivotfillRatio' has the following description:
     * ��תԲ���ı�������pivotFillMix����ʹ�á�
     * 
     * @param pivotfillRatio the value of field 'pivotfillRatio'.
     */
    public void setPivotfillRatio(java.lang.String pivotfillRatio)
    {
        this._pivotfillRatio = pivotfillRatio;
    } //-- void setPivotfillRatio(java.lang.String) 

    /**
     * Sets the value of field 'placeValuesInside'. The field
     * 'placeValuesInside' has the following description:
     * ��߿̶�ֵ�Ƿ�ڷ������棺1������ ����������
     * 
     * @param placeValuesInside the value of field
     * 'placeValuesInside'.
     */
    public void setPlaceValuesInside(byte placeValuesInside)
    {
        this._placeValuesInside = placeValuesInside;
        this._has_placeValuesInside = true;
    } //-- void setPlaceValuesInside(byte) 

    /**
     * Sets the value of field 'showGaugeBorder'. The field
     * 'showGaugeBorder' has the following description: �Ƿ���ʾ��߱߿�
     * 
     * @param showGaugeBorder the value of field 'showGaugeBorder'.
     */
    public void setShowGaugeBorder(int showGaugeBorder)
    {
        this._showGaugeBorder = showGaugeBorder;
        this._has_showGaugeBorder = true;
    } //-- void setShowGaugeBorder(int) 

    /**
     * Sets the value of field 'showLimits'. The field 'showLimits'
     * has the following description: �Ƿ���ʾ�����Сֵ
     * 
     * @param showLimits the value of field 'showLimits'.
     */
    public void setShowLimits(java.lang.String showLimits)
    {
        this._showLimits = showLimits;
    } //-- void setShowLimits(java.lang.String) 

    /**
     * Sets the value of field 'showShadow'. The field 'showShadow'
     * has the following description: �Ƿ���ʾ��Ӱ
     * 
     * @param showShadow the value of field 'showShadow'.
     */
    public void setShowShadow(byte showShadow)
    {
        this._showShadow = showShadow;
        this._has_showShadow = true;
    } //-- void setShowShadow(byte) 

    /**
     * Method setTrendpoints
     * 
     * @param index
     * @param vTrendpoints
     */
    public void setTrendpoints(int index, com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints vTrendpoints)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _trendpointsList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _trendpointsList.setElementAt(vTrendpoints, index);
    } //-- void setTrendpoints(int, com.regaltec.rsas.common.xmlparser.chart.meter.Trendpoints) 

    /**
     * Method setTrendpoints
     * 
     * @param trendpointsArray
     */
    public void setTrendpoints(com.ccssoft.rsas.common.xmlparser.chart.meter.Trendpoints[] trendpointsArray)
    {
        //-- copy array
        _trendpointsList.removeAllElements();
        for (int i = 0; i < trendpointsArray.length; i++) {
            _trendpointsList.addElement(trendpointsArray[i]);
        }
    } //-- void setTrendpoints(com.regaltec.rsas.common.xmlparser.chart.meter.Trendpoints) 

    /**
     * Sets the value of field 'upperLimit'. The field 'upperLimit'
     * has the following description: ���ֵ
     * 
     * @param upperLimit the value of field 'upperLimit'.
     */
    public void setUpperLimit(double upperLimit)
    {
        this._upperLimit = upperLimit;
        this._has_upperLimit = true;
    } //-- void setUpperLimit(double) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.Chart) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.meter.Chart.class, reader);
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
