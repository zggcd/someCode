/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.other;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.ccssoft.rsas.common.xmlparser.chart.other.types.DatasetParentYAxisType;
import com.ccssoft.rsas.common.xmlparser.chart.other.types.DatasetRenderAsType;

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
 * Class Dataset.
 * 
 * @version $Revision$ $Date$
 */
public class Dataset implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��������
     */
    private java.lang.String _seriesName;

    /**
     * ͼ������
     */
    private com.ccssoft.rsas.common.xmlparser.chart.other.types.DatasetRenderAsType _renderAs;

    /**
     * �߿��
     */
    private int _lineThickness;

    /**
     * keeps track of state for field: _lineThickness
     */
    private boolean _has_lineThickness;

    /**
     * ���ж��ڵ�Y��
     */
    private com.ccssoft.rsas.common.xmlparser.chart.other.types.DatasetParentYAxisType _parentYAxis;

    /**
     * ��ɫ
     */
    private java.lang.String _color;

    /**
     * ͸����
     */
    private int _alpha;

    /**
     * keeps track of state for field: _alpha
     */
    private boolean _has_alpha;

    /**
     * �Ƿ���ʾֵ
     */
    private byte _showValues;

    /**
     * keeps track of state for field: _showValues
     */
    private boolean _has_showValues;

    /**
     * ���ж�Ӧ�Ķ���
     */
    private java.lang.String _measureItem;

    /**
     * �Ƿ���ʾ�����У�Ĭ��Ϊ��ʾ��1������Ҫ˵������װ������ʱ�����������Ϊ����ʾʱ����Ҫ������ɾ����
     */
    private int _isShow;

    /**
     * keeps track of state for field: _isShow
     */
    private boolean _has_isShow;

    /**
     * Field _setList
     */
    private java.util.Vector _setList;

    /**
     * Field _bind
     */
    private com.ccssoft.rsas.common.xmlparser.chart.other.Bind _bind;


      //----------------/
     //- Constructors -/
    //----------------/

    public Dataset() {
        super();
        _setList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Dataset()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSet
     * 
     * @param vSet
     */
    public void addSet(com.ccssoft.rsas.common.xmlparser.chart.other.Set vSet)
        throws java.lang.IndexOutOfBoundsException
    {
        _setList.addElement(vSet);
    } //-- void addSet(com.regaltec.rsas.common.xmlparser.chart.other.Set) 

    /**
     * Method addSet
     * 
     * @param index
     * @param vSet
     */
    public void addSet(int index, com.ccssoft.rsas.common.xmlparser.chart.other.Set vSet)
        throws java.lang.IndexOutOfBoundsException
    {
        _setList.insertElementAt(vSet, index);
    } //-- void addSet(int, com.regaltec.rsas.common.xmlparser.chart.other.Set) 

    /**
     * Method deleteAlpha
     */
    public void deleteAlpha()
    {
        this._has_alpha= false;
    } //-- void deleteAlpha() 

    /**
     * Method deleteIsShow
     */
    public void deleteIsShow()
    {
        this._has_isShow= false;
    } //-- void deleteIsShow() 

    /**
     * Method deleteLineThickness
     */
    public void deleteLineThickness()
    {
        this._has_lineThickness= false;
    } //-- void deleteLineThickness() 

    /**
     * Method deleteShowValues
     */
    public void deleteShowValues()
    {
        this._has_showValues= false;
    } //-- void deleteShowValues() 

    /**
     * Method enumerateSet
     */
    public java.util.Enumeration enumerateSet()
    {
        return _setList.elements();
    } //-- java.util.Enumeration enumerateSet() 

    /**
     * Returns the value of field 'alpha'. The field 'alpha' has
     * the following description: ͸����
     * 
     * @return the value of field 'alpha'.
     */
    public int getAlpha()
    {
        return this._alpha;
    } //-- int getAlpha() 

    /**
     * Returns the value of field 'bind'.
     * 
     * @return the value of field 'bind'.
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Bind getBind()
    {
        return this._bind;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Bind getBind() 

    /**
     * Returns the value of field 'color'. The field 'color' has
     * the following description: ��ɫ
     * 
     * @return the value of field 'color'.
     */
    public java.lang.String getColor()
    {
        return this._color;
    } //-- java.lang.String getColor() 

    /**
     * Returns the value of field 'isShow'. The field 'isShow' has
     * the following description:
     * �Ƿ���ʾ�����У�Ĭ��Ϊ��ʾ��1������Ҫ˵������װ������ʱ�����������Ϊ����ʾʱ����Ҫ������ɾ����
     * 
     * @return the value of field 'isShow'.
     */
    public int getIsShow()
    {
        return this._isShow;
    } //-- int getIsShow() 

    /**
     * Returns the value of field 'lineThickness'. The field
     * 'lineThickness' has the following description: �߿��
     * 
     * @return the value of field 'lineThickness'.
     */
    public int getLineThickness()
    {
        return this._lineThickness;
    } //-- int getLineThickness() 

    /**
     * Returns the value of field 'measureItem'. The field
     * 'measureItem' has the following description: ���ж�Ӧ�Ķ���
     * 
     * @return the value of field 'measureItem'.
     */
    public java.lang.String getMeasureItem()
    {
        return this._measureItem;
    } //-- java.lang.String getMeasureItem() 

    /**
     * Returns the value of field 'parentYAxis'. The field
     * 'parentYAxis' has the following description: ���ж��ڵ�Y��
     * 
     * @return the value of field 'parentYAxis'.
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.types.DatasetParentYAxisType getParentYAxis()
    {
        return this._parentYAxis;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.types.DatasetParentYAxisType getParentYAxis() 

    /**
     * Returns the value of field 'renderAs'. The field 'renderAs'
     * has the following description: ͼ������
     * 
     * @return the value of field 'renderAs'.
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.types.DatasetRenderAsType getRenderAs()
    {
        return this._renderAs;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.types.DatasetRenderAsType getRenderAs() 

    /**
     * Returns the value of field 'seriesName'. The field
     * 'seriesName' has the following description: ��������
     * 
     * @return the value of field 'seriesName'.
     */
    public java.lang.String getSeriesName()
    {
        return this._seriesName;
    } //-- java.lang.String getSeriesName() 

    /**
     * Method getSet
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Set getSet(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _setList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Set) _setList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Set getSet(int) 

    /**
     * Method getSet
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Set[] getSet()
    {
        int size = _setList.size();
        com.ccssoft.rsas.common.xmlparser.chart.other.Set[] mArray = new com.ccssoft.rsas.common.xmlparser.chart.other.Set[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.chart.other.Set) _setList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Set[] getSet() 

    /**
     * Method getSetCount
     */
    public int getSetCount()
    {
        return _setList.size();
    } //-- int getSetCount() 

    /**
     * Returns the value of field 'showValues'. The field
     * 'showValues' has the following description: �Ƿ���ʾֵ
     * 
     * @return the value of field 'showValues'.
     */
    public byte getShowValues()
    {
        return this._showValues;
    } //-- byte getShowValues() 

    /**
     * Method hasAlpha
     */
    public boolean hasAlpha()
    {
        return this._has_alpha;
    } //-- boolean hasAlpha() 

    /**
     * Method hasIsShow
     */
    public boolean hasIsShow()
    {
        return this._has_isShow;
    } //-- boolean hasIsShow() 

    /**
     * Method hasLineThickness
     */
    public boolean hasLineThickness()
    {
        return this._has_lineThickness;
    } //-- boolean hasLineThickness() 

    /**
     * Method hasShowValues
     */
    public boolean hasShowValues()
    {
        return this._has_showValues;
    } //-- boolean hasShowValues() 

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
     * Method removeAllSet
     */
    public void removeAllSet()
    {
        _setList.removeAllElements();
    } //-- void removeAllSet() 

    /**
     * Method removeSet
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Set removeSet(int index)
    {
        java.lang.Object obj = _setList.elementAt(index);
        _setList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Set) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Set removeSet(int) 

    /**
     * Sets the value of field 'alpha'. The field 'alpha' has the
     * following description: ͸����
     * 
     * @param alpha the value of field 'alpha'.
     */
    public void setAlpha(int alpha)
    {
        this._alpha = alpha;
        this._has_alpha = true;
    } //-- void setAlpha(int) 

    /**
     * Sets the value of field 'bind'.
     * 
     * @param bind the value of field 'bind'.
     */
    public void setBind(com.ccssoft.rsas.common.xmlparser.chart.other.Bind bind)
    {
        this._bind = bind;
    } //-- void setBind(com.regaltec.rsas.common.xmlparser.chart.other.Bind) 

    /**
     * Sets the value of field 'color'. The field 'color' has the
     * following description: ��ɫ
     * 
     * @param color the value of field 'color'.
     */
    public void setColor(java.lang.String color)
    {
        this._color = color;
    } //-- void setColor(java.lang.String) 

    /**
     * Sets the value of field 'isShow'. The field 'isShow' has the
     * following description:
     * �Ƿ���ʾ�����У�Ĭ��Ϊ��ʾ��1������Ҫ˵������װ������ʱ�����������Ϊ����ʾʱ����Ҫ������ɾ����
     * 
     * @param isShow the value of field 'isShow'.
     */
    public void setIsShow(int isShow)
    {
        this._isShow = isShow;
        this._has_isShow = true;
    } //-- void setIsShow(int) 

    /**
     * Sets the value of field 'lineThickness'. The field
     * 'lineThickness' has the following description: �߿��
     * 
     * @param lineThickness the value of field 'lineThickness'.
     */
    public void setLineThickness(int lineThickness)
    {
        this._lineThickness = lineThickness;
        this._has_lineThickness = true;
    } //-- void setLineThickness(int) 

    /**
     * Sets the value of field 'measureItem'. The field
     * 'measureItem' has the following description: ���ж�Ӧ�Ķ���
     * 
     * @param measureItem the value of field 'measureItem'.
     */
    public void setMeasureItem(java.lang.String measureItem)
    {
        this._measureItem = measureItem;
    } //-- void setMeasureItem(java.lang.String) 

    /**
     * Sets the value of field 'parentYAxis'. The field
     * 'parentYAxis' has the following description: ���ж��ڵ�Y��
     * 
     * @param parentYAxis the value of field 'parentYAxis'.
     */
    public void setParentYAxis(com.ccssoft.rsas.common.xmlparser.chart.other.types.DatasetParentYAxisType parentYAxis)
    {
        this._parentYAxis = parentYAxis;
    } //-- void setParentYAxis(com.regaltec.rsas.common.xmlparser.chart.other.types.DatasetParentYAxisType) 

    /**
     * Sets the value of field 'renderAs'. The field 'renderAs' has
     * the following description: ͼ������
     * 
     * @param renderAs the value of field 'renderAs'.
     */
    public void setRenderAs(com.ccssoft.rsas.common.xmlparser.chart.other.types.DatasetRenderAsType renderAs)
    {
        this._renderAs = renderAs;
    } //-- void setRenderAs(com.regaltec.rsas.common.xmlparser.chart.other.types.DatasetRenderAsType) 

    /**
     * Sets the value of field 'seriesName'. The field 'seriesName'
     * has the following description: ��������
     * 
     * @param seriesName the value of field 'seriesName'.
     */
    public void setSeriesName(java.lang.String seriesName)
    {
        this._seriesName = seriesName;
    } //-- void setSeriesName(java.lang.String) 

    /**
     * Method setSet
     * 
     * @param index
     * @param vSet
     */
    public void setSet(int index, com.ccssoft.rsas.common.xmlparser.chart.other.Set vSet)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _setList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _setList.setElementAt(vSet, index);
    } //-- void setSet(int, com.regaltec.rsas.common.xmlparser.chart.other.Set) 

    /**
     * Method setSet
     * 
     * @param setArray
     */
    public void setSet(com.ccssoft.rsas.common.xmlparser.chart.other.Set[] setArray)
    {
        //-- copy array
        _setList.removeAllElements();
        for (int i = 0; i < setArray.length; i++) {
            _setList.addElement(setArray[i]);
        }
    } //-- void setSet(com.regaltec.rsas.common.xmlparser.chart.other.Set) 

    /**
     * Sets the value of field 'showValues'. The field 'showValues'
     * has the following description: �Ƿ���ʾֵ
     * 
     * @param showValues the value of field 'showValues'.
     */
    public void setShowValues(byte showValues)
    {
        this._showValues = showValues;
        this._has_showValues = true;
    } //-- void setShowValues(byte) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Dataset) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.other.Dataset.class, reader);
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
