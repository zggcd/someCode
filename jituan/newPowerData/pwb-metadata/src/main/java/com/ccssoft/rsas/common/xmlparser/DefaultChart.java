/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.ccssoft.rsas.common.xmlparser.types.DefaultChartChartTypeType;
import com.ccssoft.rsas.common.xmlparser.types.DefaultChartDataPositionType;

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
 * Ϊ�����趨��Ĭ��ͼ��
 * 
 * @version $Revision$ $Date$
 */
public class DefaultChart implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �򿪱���ʱֱ����ʾͼ��
     */
    private short _isShowChartFirst;

    /**
     * keeps track of state for field: _isShowChartFirst
     */
    private boolean _has_isShowChartFirst;

    /**
     * Ĭ����ʾ��ͼ������
     */
    private com.ccssoft.rsas.common.xmlparser.types.DefaultChartChartTypeType _chartType;

    /**
     * ��������λ�ã��ֱ������С�����
     */
    private com.ccssoft.rsas.common.xmlparser.types.DefaultChartDataPositionType _dataPosition;

    /**
     * �Ƿ���ʾ3Dͼ����ͼĬ��Ϊ3D������Ĭ��Ϊ2D
     */
    private short _is3D;

    /**
     * keeps track of state for field: _is3D
     */
    private boolean _has_is3D;

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _desc
     */
    private java.lang.String _desc;

    /**
     * Field _seriesList
     */
    private java.util.Vector _seriesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DefaultChart() {
        super();
        _seriesList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DefaultChart()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSeries
     * 
     * @param vSeries
     */
    public void addSeries(com.ccssoft.rsas.common.xmlparser.Series vSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        _seriesList.addElement(vSeries);
    } //-- void addSeries(com.regaltec.rsas.common.xmlparser.Series) 

    /**
     * Method addSeries
     * 
     * @param index
     * @param vSeries
     */
    public void addSeries(int index, com.ccssoft.rsas.common.xmlparser.Series vSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        _seriesList.insertElementAt(vSeries, index);
    } //-- void addSeries(int, com.regaltec.rsas.common.xmlparser.Series) 

    /**
     * Method deleteIs3D
     */
    public void deleteIs3D()
    {
        this._has_is3D= false;
    } //-- void deleteIs3D() 

    /**
     * Method deleteIsShowChartFirst
     */
    public void deleteIsShowChartFirst()
    {
        this._has_isShowChartFirst= false;
    } //-- void deleteIsShowChartFirst() 

    /**
     * Method enumerateSeries
     */
    public java.util.Enumeration enumerateSeries()
    {
        return _seriesList.elements();
    } //-- java.util.Enumeration enumerateSeries() 

    /**
     * Returns the value of field 'chartType'. The field
     * 'chartType' has the following description: Ĭ����ʾ��ͼ������
     * 
     * @return the value of field 'chartType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DefaultChartChartTypeType getChartType()
    {
        return this._chartType;
    } //-- com.regaltec.rsas.common.xmlparser.types.DefaultChartChartTypeType getChartType() 

    /**
     * Returns the value of field 'dataPosition'. The field
     * 'dataPosition' has the following description:
     * ��������λ�ã��ֱ������С�����
     * 
     * @return the value of field 'dataPosition'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.DefaultChartDataPositionType getDataPosition()
    {
        return this._dataPosition;
    } //-- com.regaltec.rsas.common.xmlparser.types.DefaultChartDataPositionType getDataPosition() 

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'desc'.
     */
    public java.lang.String getDesc()
    {
        return this._desc;
    } //-- java.lang.String getDesc() 

    /**
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

    /**
     * Returns the value of field 'is3D'. The field 'is3D' has the
     * following description: �Ƿ���ʾ3Dͼ����ͼĬ��Ϊ3D������Ĭ��Ϊ2D
     * 
     * @return the value of field 'is3D'.
     */
    public short getIs3D()
    {
        return this._is3D;
    } //-- short getIs3D() 

    /**
     * Returns the value of field 'isShowChartFirst'. The field
     * 'isShowChartFirst' has the following description:
     * �򿪱���ʱֱ����ʾͼ��
     * 
     * @return the value of field 'isShowChartFirst'.
     */
    public short getIsShowChartFirst()
    {
        return this._isShowChartFirst;
    } //-- short getIsShowChartFirst() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Method getSeries
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Series getSeries(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _seriesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Series) _seriesList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Series getSeries(int) 

    /**
     * Method getSeries
     */
    public com.ccssoft.rsas.common.xmlparser.Series[] getSeries()
    {
        int size = _seriesList.size();
        com.ccssoft.rsas.common.xmlparser.Series[] mArray = new com.ccssoft.rsas.common.xmlparser.Series[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Series) _seriesList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Series[] getSeries() 

    /**
     * Method getSeriesCount
     */
    public int getSeriesCount()
    {
        return _seriesList.size();
    } //-- int getSeriesCount() 

    /**
     * Method hasIs3D
     */
    public boolean hasIs3D()
    {
        return this._has_is3D;
    } //-- boolean hasIs3D() 

    /**
     * Method hasIsShowChartFirst
     */
    public boolean hasIsShowChartFirst()
    {
        return this._has_isShowChartFirst;
    } //-- boolean hasIsShowChartFirst() 

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
     * Method removeAllSeries
     */
    public void removeAllSeries()
    {
        _seriesList.removeAllElements();
    } //-- void removeAllSeries() 

    /**
     * Method removeSeries
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Series removeSeries(int index)
    {
        java.lang.Object obj = _seriesList.elementAt(index);
        _seriesList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Series) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Series removeSeries(int) 

    /**
     * Sets the value of field 'chartType'. The field 'chartType'
     * has the following description: Ĭ����ʾ��ͼ������
     * 
     * @param chartType the value of field 'chartType'.
     */
    public void setChartType(com.ccssoft.rsas.common.xmlparser.types.DefaultChartChartTypeType chartType)
    {
        this._chartType = chartType;
    } //-- void setChartType(com.regaltec.rsas.common.xmlparser.types.DefaultChartChartTypeType) 

    /**
     * Sets the value of field 'dataPosition'. The field
     * 'dataPosition' has the following description:
     * ��������λ�ã��ֱ������С�����
     * 
     * @param dataPosition the value of field 'dataPosition'.
     */
    public void setDataPosition(com.ccssoft.rsas.common.xmlparser.types.DefaultChartDataPositionType dataPosition)
    {
        this._dataPosition = dataPosition;
    } //-- void setDataPosition(com.regaltec.rsas.common.xmlparser.types.DefaultChartDataPositionType) 

    /**
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(java.lang.String desc)
    {
        this._desc = desc;
    } //-- void setDesc(java.lang.String) 

    /**
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

    /**
     * Sets the value of field 'is3D'. The field 'is3D' has the
     * following description: �Ƿ���ʾ3Dͼ����ͼĬ��Ϊ3D������Ĭ��Ϊ2D
     * 
     * @param is3D the value of field 'is3D'.
     */
    public void setIs3D(short is3D)
    {
        this._is3D = is3D;
        this._has_is3D = true;
    } //-- void setIs3D(short) 

    /**
     * Sets the value of field 'isShowChartFirst'. The field
     * 'isShowChartFirst' has the following description:
     * �򿪱���ʱֱ����ʾͼ��
     * 
     * @param isShowChartFirst the value of field 'isShowChartFirst'
     */
    public void setIsShowChartFirst(short isShowChartFirst)
    {
        this._isShowChartFirst = isShowChartFirst;
        this._has_isShowChartFirst = true;
    } //-- void setIsShowChartFirst(short) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Method setSeries
     * 
     * @param index
     * @param vSeries
     */
    public void setSeries(int index, com.ccssoft.rsas.common.xmlparser.Series vSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _seriesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _seriesList.setElementAt(vSeries, index);
    } //-- void setSeries(int, com.regaltec.rsas.common.xmlparser.Series) 

    /**
     * Method setSeries
     * 
     * @param seriesArray
     */
    public void setSeries(com.ccssoft.rsas.common.xmlparser.Series[] seriesArray)
    {
        //-- copy array
        _seriesList.removeAllElements();
        for (int i = 0; i < seriesArray.length; i++) {
            _seriesList.addElement(seriesArray[i]);
        }
    } //-- void setSeries(com.regaltec.rsas.common.xmlparser.Series) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DefaultChart) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DefaultChart.class, reader);
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
