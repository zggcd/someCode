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

import com.ccssoft.rsas.common.saschart.types.SeriesSeriesTypeType;

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
 * ͼ��ϵ��
 * 
 * @version $Revision$ $Date$
 */
public class Series implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ͼ��ϵ�����ͣ�����ϵ�е����;���ȡ�ĸ�ϵ�ж���
     */
    private com.ccssoft.rsas.common.saschart.types.SeriesSeriesTypeType _seriesType;

    /**
     * ��ǰϵ��ʹ�õ�ˮƽ�����
     */
    private short _horizontalAxis;

    /**
     * keeps track of state for field: _horizontalAxis
     */
    private boolean _has_horizontalAxis;

    /**
     * ��ǰϵ��ʹ�õĴ�ֱ�����
     */
    private short _verticalAxis;

    /**
     * keeps track of state for field: _verticalAxis
     */
    private boolean _has_verticalAxis;

    /**
     * ϵ��ʹ�õĲ�ѯ�ж���ID
     */
    private java.lang.String _measureItem;

    /**
     * ϵ��ʹ�õĲ�ѯ��ά��ID
     */
    private java.lang.String _dimensionItem;

    /**
     * ����ϵ������ʾ��ĸ�ʽֵ
     */
    private java.lang.String _valueFormat;

    /**
     * ����ϵ������ʾ��İٷֵ��ʽֵ
     */
    private java.lang.String _percentFormat;

    /**
     * �Ƿ���ͼ������ʾ��ϵ�б���
     */
    private short _showInLegend;

    /**
     * keeps track of state for field: _showInLegend
     */
    private boolean _has_showInLegend;

    /**
     * ϵ�����Ͷ���
     */
    private com.ccssoft.rsas.common.saschart.SeriesObj _seriesObj;

    /**
     * ͼ��ϵ�еı�Ƕ���
     */
    private com.ccssoft.rsas.common.saschart.Marks _marks;


      //----------------/
     //- Constructors -/
    //----------------/

    public Series() {
        super();
    } //-- com.regaltec.rsas.common.saschart.Series()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteHorizontalAxis
     */
    public void deleteHorizontalAxis()
    {
        this._has_horizontalAxis= false;
    } //-- void deleteHorizontalAxis() 

    /**
     * Method deleteShowInLegend
     */
    public void deleteShowInLegend()
    {
        this._has_showInLegend= false;
    } //-- void deleteShowInLegend() 

    /**
     * Method deleteVerticalAxis
     */
    public void deleteVerticalAxis()
    {
        this._has_verticalAxis= false;
    } //-- void deleteVerticalAxis() 

    /**
     * Returns the value of field 'dimensionItem'. The field
     * 'dimensionItem' has the following description: ϵ��ʹ�õĲ�ѯ��ά��ID
     * 
     * @return the value of field 'dimensionItem'.
     */
    public java.lang.String getDimensionItem()
    {
        return this._dimensionItem;
    } //-- java.lang.String getDimensionItem() 

    /**
     * Returns the value of field 'horizontalAxis'. The field
     * 'horizontalAxis' has the following description: ��ǰϵ��ʹ�õ�ˮƽ�����
     * 
     * @return the value of field 'horizontalAxis'.
     */
    public short getHorizontalAxis()
    {
        return this._horizontalAxis;
    } //-- short getHorizontalAxis() 

    /**
     * Returns the value of field 'marks'. The field 'marks' has
     * the following description: ͼ��ϵ�еı�Ƕ���
     * 
     * @return the value of field 'marks'.
     */
    public com.ccssoft.rsas.common.saschart.Marks getMarks()
    {
        return this._marks;
    } //-- com.regaltec.rsas.common.saschart.Marks getMarks() 

    /**
     * Returns the value of field 'measureItem'. The field
     * 'measureItem' has the following description: ϵ��ʹ�õĲ�ѯ�ж���ID
     * 
     * @return the value of field 'measureItem'.
     */
    public java.lang.String getMeasureItem()
    {
        return this._measureItem;
    } //-- java.lang.String getMeasureItem() 

    /**
     * Returns the value of field 'percentFormat'. The field
     * 'percentFormat' has the following description:
     * ����ϵ������ʾ��İٷֵ��ʽֵ
     * 
     * @return the value of field 'percentFormat'.
     */
    public java.lang.String getPercentFormat()
    {
        return this._percentFormat;
    } //-- java.lang.String getPercentFormat() 

    /**
     * Returns the value of field 'seriesObj'. The field
     * 'seriesObj' has the following description: ϵ�����Ͷ���
     * 
     * @return the value of field 'seriesObj'.
     */
    public com.ccssoft.rsas.common.saschart.SeriesObj getSeriesObj()
    {
        return this._seriesObj;
    } //-- com.regaltec.rsas.common.saschart.SeriesObj getSeriesObj() 

    /**
     * Returns the value of field 'seriesType'. The field
     * 'seriesType' has the following description:
     * ͼ��ϵ�����ͣ�����ϵ�е����;���ȡ�ĸ�ϵ�ж���
     * 
     * @return the value of field 'seriesType'.
     */
    public com.ccssoft.rsas.common.saschart.types.SeriesSeriesTypeType getSeriesType()
    {
        return this._seriesType;
    } //-- com.regaltec.rsas.common.saschart.types.SeriesSeriesTypeType getSeriesType() 

    /**
     * Returns the value of field 'showInLegend'. The field
     * 'showInLegend' has the following description: �Ƿ���ͼ������ʾ��ϵ�б���
     * 
     * @return the value of field 'showInLegend'.
     */
    public short getShowInLegend()
    {
        return this._showInLegend;
    } //-- short getShowInLegend() 

    /**
     * Returns the value of field 'valueFormat'. The field
     * 'valueFormat' has the following description: ����ϵ������ʾ��ĸ�ʽֵ
     * 
     * @return the value of field 'valueFormat'.
     */
    public java.lang.String getValueFormat()
    {
        return this._valueFormat;
    } //-- java.lang.String getValueFormat() 

    /**
     * Returns the value of field 'verticalAxis'. The field
     * 'verticalAxis' has the following description: ��ǰϵ��ʹ�õĴ�ֱ�����
     * 
     * @return the value of field 'verticalAxis'.
     */
    public short getVerticalAxis()
    {
        return this._verticalAxis;
    } //-- short getVerticalAxis() 

    /**
     * Method hasHorizontalAxis
     */
    public boolean hasHorizontalAxis()
    {
        return this._has_horizontalAxis;
    } //-- boolean hasHorizontalAxis() 

    /**
     * Method hasShowInLegend
     */
    public boolean hasShowInLegend()
    {
        return this._has_showInLegend;
    } //-- boolean hasShowInLegend() 

    /**
     * Method hasVerticalAxis
     */
    public boolean hasVerticalAxis()
    {
        return this._has_verticalAxis;
    } //-- boolean hasVerticalAxis() 

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
     * Sets the value of field 'dimensionItem'. The field
     * 'dimensionItem' has the following description: ϵ��ʹ�õĲ�ѯ��ά��ID
     * 
     * @param dimensionItem the value of field 'dimensionItem'.
     */
    public void setDimensionItem(java.lang.String dimensionItem)
    {
        this._dimensionItem = dimensionItem;
    } //-- void setDimensionItem(java.lang.String) 

    /**
     * Sets the value of field 'horizontalAxis'. The field
     * 'horizontalAxis' has the following description: ��ǰϵ��ʹ�õ�ˮƽ�����
     * 
     * @param horizontalAxis the value of field 'horizontalAxis'.
     */
    public void setHorizontalAxis(short horizontalAxis)
    {
        this._horizontalAxis = horizontalAxis;
        this._has_horizontalAxis = true;
    } //-- void setHorizontalAxis(short) 

    /**
     * Sets the value of field 'marks'. The field 'marks' has the
     * following description: ͼ��ϵ�еı�Ƕ���
     * 
     * @param marks the value of field 'marks'.
     */
    public void setMarks(com.ccssoft.rsas.common.saschart.Marks marks)
    {
        this._marks = marks;
    } //-- void setMarks(com.regaltec.rsas.common.saschart.Marks) 

    /**
     * Sets the value of field 'measureItem'. The field
     * 'measureItem' has the following description: ϵ��ʹ�õĲ�ѯ�ж���ID
     * 
     * @param measureItem the value of field 'measureItem'.
     */
    public void setMeasureItem(java.lang.String measureItem)
    {
        this._measureItem = measureItem;
    } //-- void setMeasureItem(java.lang.String) 

    /**
     * Sets the value of field 'percentFormat'. The field
     * 'percentFormat' has the following description:
     * ����ϵ������ʾ��İٷֵ��ʽֵ
     * 
     * @param percentFormat the value of field 'percentFormat'.
     */
    public void setPercentFormat(java.lang.String percentFormat)
    {
        this._percentFormat = percentFormat;
    } //-- void setPercentFormat(java.lang.String) 

    /**
     * Sets the value of field 'seriesObj'. The field 'seriesObj'
     * has the following description: ϵ�����Ͷ���
     * 
     * @param seriesObj the value of field 'seriesObj'.
     */
    public void setSeriesObj(com.ccssoft.rsas.common.saschart.SeriesObj seriesObj)
    {
        this._seriesObj = seriesObj;
    } //-- void setSeriesObj(com.regaltec.rsas.common.saschart.SeriesObj) 

    /**
     * Sets the value of field 'seriesType'. The field 'seriesType'
     * has the following description: ͼ��ϵ�����ͣ�����ϵ�е����;���ȡ�ĸ�ϵ�ж���
     * 
     * @param seriesType the value of field 'seriesType'.
     */
    public void setSeriesType(com.ccssoft.rsas.common.saschart.types.SeriesSeriesTypeType seriesType)
    {
        this._seriesType = seriesType;
    } //-- void setSeriesType(com.regaltec.rsas.common.saschart.types.SeriesSeriesTypeType) 

    /**
     * Sets the value of field 'showInLegend'. The field
     * 'showInLegend' has the following description: �Ƿ���ͼ������ʾ��ϵ�б���
     * 
     * @param showInLegend the value of field 'showInLegend'.
     */
    public void setShowInLegend(short showInLegend)
    {
        this._showInLegend = showInLegend;
        this._has_showInLegend = true;
    } //-- void setShowInLegend(short) 

    /**
     * Sets the value of field 'valueFormat'. The field
     * 'valueFormat' has the following description: ����ϵ������ʾ��ĸ�ʽֵ
     * 
     * @param valueFormat the value of field 'valueFormat'.
     */
    public void setValueFormat(java.lang.String valueFormat)
    {
        this._valueFormat = valueFormat;
    } //-- void setValueFormat(java.lang.String) 

    /**
     * Sets the value of field 'verticalAxis'. The field
     * 'verticalAxis' has the following description: ��ǰϵ��ʹ�õĴ�ֱ�����
     * 
     * @param verticalAxis the value of field 'verticalAxis'.
     */
    public void setVerticalAxis(short verticalAxis)
    {
        this._verticalAxis = verticalAxis;
        this._has_verticalAxis = true;
    } //-- void setVerticalAxis(short) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.saschart.Series) Unmarshaller.unmarshal(com.ccssoft.rsas.common.saschart.Series.class, reader);
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
