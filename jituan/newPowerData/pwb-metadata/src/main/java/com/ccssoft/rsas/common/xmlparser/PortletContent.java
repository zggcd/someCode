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

import com.ccssoft.rsas.common.xmlparser.types.PortletContentContentTypeType;
import com.ccssoft.rsas.common.xmlparser.types.PortletContentPortletContentTypeType;
import com.ccssoft.rsas.common.xmlparser.types.PortletContentRepContentTypeType;

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
 * Portal����
 * 
 * @version $Revision$ $Date$
 */
public class PortletContent implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _contentType
     */
    private com.ccssoft.rsas.common.xmlparser.types.PortletContentContentTypeType _contentType;

    /**
     * Field _URL
     */
    private java.lang.Object _URL;

    /**
     * Field _reportID
     */
    private java.lang.String _reportID;

    /**
     * Field _repContentType
     */
    private com.ccssoft.rsas.common.xmlparser.types.PortletContentRepContentTypeType _repContentType;

    /**
     * Field _gridID
     */
    private java.lang.String _gridID;

    /**
     * Field _chartID
     */
    private java.lang.String _chartID;

    /**
     * �Ƿ���ʾɸѡ����
     */
    private byte _showCondition;

    /**
     * keeps track of state for field: _showCondition
     */
    private boolean _has_showCondition;

    /**
     * ��������:�û����塢����ģ��
     */
    private com.ccssoft.rsas.common.xmlparser.types.PortletContentPortletContentTypeType _portletContentType;

    /**
     * ģ�����ID
     */
    private java.lang.String _PTCategoryID;

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
     * Field _conditionSetValueList
     */
    private java.util.Vector _conditionSetValueList;

    /**
     * Flashͼ��
     */
    private com.ccssoft.rsas.common.xmlparser.FlashChart _flashChart;

    /**
     * Field _indicatorContent
     */
    private com.ccssoft.rsas.common.xmlparser.IndicatorContent _indicatorContent;

    /**
     * Field _SPMContent
     */
    private com.ccssoft.rsas.common.xmlparser.SPMContent _SPMContent;


      //----------------/
     //- Constructors -/
    //----------------/

    public PortletContent() {
        super();
        _conditionSetValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.PortletContent()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConditionSetValue
     * 
     * @param vConditionSetValue
     */
    public void addConditionSetValue(com.ccssoft.rsas.common.xmlparser.ConditionSetValue vConditionSetValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionSetValueList.addElement(vConditionSetValue);
    } //-- void addConditionSetValue(com.regaltec.rsas.common.xmlparser.ConditionSetValue) 

    /**
     * Method addConditionSetValue
     * 
     * @param index
     * @param vConditionSetValue
     */
    public void addConditionSetValue(int index, com.ccssoft.rsas.common.xmlparser.ConditionSetValue vConditionSetValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionSetValueList.insertElementAt(vConditionSetValue, index);
    } //-- void addConditionSetValue(int, com.regaltec.rsas.common.xmlparser.ConditionSetValue) 

    /**
     * Method deleteShowCondition
     */
    public void deleteShowCondition()
    {
        this._has_showCondition= false;
    } //-- void deleteShowCondition() 

    /**
     * Method enumerateConditionSetValue
     */
    public java.util.Enumeration enumerateConditionSetValue()
    {
        return _conditionSetValueList.elements();
    } //-- java.util.Enumeration enumerateConditionSetValue() 

    /**
     * Returns the value of field 'chartID'.
     * 
     * @return the value of field 'chartID'.
     */
    public java.lang.String getChartID()
    {
        return this._chartID;
    } //-- java.lang.String getChartID() 

    /**
     * Method getConditionSetValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionSetValue getConditionSetValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionSetValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ConditionSetValue) _conditionSetValueList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ConditionSetValue getConditionSetValue(int) 

    /**
     * Method getConditionSetValue
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionSetValue[] getConditionSetValue()
    {
        int size = _conditionSetValueList.size();
        com.ccssoft.rsas.common.xmlparser.ConditionSetValue[] mArray = new com.ccssoft.rsas.common.xmlparser.ConditionSetValue[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ConditionSetValue) _conditionSetValueList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionSetValue[] getConditionSetValue() 

    /**
     * Method getConditionSetValueCount
     */
    public int getConditionSetValueCount()
    {
        return _conditionSetValueList.size();
    } //-- int getConditionSetValueCount() 

    /**
     * Returns the value of field 'contentType'.
     * 
     * @return the value of field 'contentType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.PortletContentContentTypeType getContentType()
    {
        return this._contentType;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortletContentContentTypeType getContentType() 

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
     * Returns the value of field 'flashChart'. The field
     * 'flashChart' has the following description: Flashͼ��
     * 
     * @return the value of field 'flashChart'.
     */
    public com.ccssoft.rsas.common.xmlparser.FlashChart getFlashChart()
    {
        return this._flashChart;
    } //-- com.regaltec.rsas.common.xmlparser.FlashChart getFlashChart() 

    /**
     * Returns the value of field 'gridID'.
     * 
     * @return the value of field 'gridID'.
     */
    public java.lang.String getGridID()
    {
        return this._gridID;
    } //-- java.lang.String getGridID() 

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
     * Returns the value of field 'indicatorContent'.
     * 
     * @return the value of field 'indicatorContent'.
     */
    public com.ccssoft.rsas.common.xmlparser.IndicatorContent getIndicatorContent()
    {
        return this._indicatorContent;
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorContent getIndicatorContent() 

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
     * Returns the value of field 'PTCategoryID'. The field
     * 'PTCategoryID' has the following description: ģ�����ID
     * 
     * @return the value of field 'PTCategoryID'.
     */
    public java.lang.String getPTCategoryID()
    {
        return this._PTCategoryID;
    } //-- java.lang.String getPTCategoryID() 

    /**
     * Returns the value of field 'portletContentType'. The field
     * 'portletContentType' has the following description:
     * ��������:�û����塢����ģ��
     * 
     * @return the value of field 'portletContentType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.PortletContentPortletContentTypeType getPortletContentType()
    {
        return this._portletContentType;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortletContentPortletContentTypeType getPortletContentType() 

    /**
     * Returns the value of field 'repContentType'.
     * 
     * @return the value of field 'repContentType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.PortletContentRepContentTypeType getRepContentType()
    {
        return this._repContentType;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortletContentRepContentTypeType getRepContentType() 

    /**
     * Returns the value of field 'reportID'.
     * 
     * @return the value of field 'reportID'.
     */
    public java.lang.String getReportID()
    {
        return this._reportID;
    } //-- java.lang.String getReportID() 

    /**
     * Returns the value of field 'SPMContent'.
     * 
     * @return the value of field 'SPMContent'.
     */
    public com.ccssoft.rsas.common.xmlparser.SPMContent getSPMContent()
    {
        return this._SPMContent;
    } //-- com.regaltec.rsas.common.xmlparser.SPMContent getSPMContent() 

    /**
     * Returns the value of field 'showCondition'. The field
     * 'showCondition' has the following description: �Ƿ���ʾɸѡ����
     * 
     * @return the value of field 'showCondition'.
     */
    public byte getShowCondition()
    {
        return this._showCondition;
    } //-- byte getShowCondition() 

    /**
     * Returns the value of field 'URL'.
     * 
     * @return the value of field 'URL'.
     */
    public java.lang.Object getURL()
    {
        return this._URL;
    } //-- java.lang.Object getURL() 

    /**
     * Method hasShowCondition
     */
    public boolean hasShowCondition()
    {
        return this._has_showCondition;
    } //-- boolean hasShowCondition() 

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
     * Method removeAllConditionSetValue
     */
    public void removeAllConditionSetValue()
    {
        _conditionSetValueList.removeAllElements();
    } //-- void removeAllConditionSetValue() 

    /**
     * Method removeConditionSetValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionSetValue removeConditionSetValue(int index)
    {
        java.lang.Object obj = _conditionSetValueList.elementAt(index);
        _conditionSetValueList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ConditionSetValue) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionSetValue removeConditionSetValue(int) 

    /**
     * Sets the value of field 'chartID'.
     * 
     * @param chartID the value of field 'chartID'.
     */
    public void setChartID(java.lang.String chartID)
    {
        this._chartID = chartID;
    } //-- void setChartID(java.lang.String) 

    /**
     * Method setConditionSetValue
     * 
     * @param index
     * @param vConditionSetValue
     */
    public void setConditionSetValue(int index, com.ccssoft.rsas.common.xmlparser.ConditionSetValue vConditionSetValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionSetValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _conditionSetValueList.setElementAt(vConditionSetValue, index);
    } //-- void setConditionSetValue(int, com.regaltec.rsas.common.xmlparser.ConditionSetValue) 

    /**
     * Method setConditionSetValue
     * 
     * @param conditionSetValueArray
     */
    public void setConditionSetValue(com.ccssoft.rsas.common.xmlparser.ConditionSetValue[] conditionSetValueArray)
    {
        //-- copy array
        _conditionSetValueList.removeAllElements();
        for (int i = 0; i < conditionSetValueArray.length; i++) {
            _conditionSetValueList.addElement(conditionSetValueArray[i]);
        }
    } //-- void setConditionSetValue(com.regaltec.rsas.common.xmlparser.ConditionSetValue) 

    /**
     * Sets the value of field 'contentType'.
     * 
     * @param contentType the value of field 'contentType'.
     */
    public void setContentType(com.ccssoft.rsas.common.xmlparser.types.PortletContentContentTypeType contentType)
    {
        this._contentType = contentType;
    } //-- void setContentType(com.regaltec.rsas.common.xmlparser.types.PortletContentContentTypeType) 

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
     * Sets the value of field 'flashChart'. The field 'flashChart'
     * has the following description: Flashͼ��
     * 
     * @param flashChart the value of field 'flashChart'.
     */
    public void setFlashChart(com.ccssoft.rsas.common.xmlparser.FlashChart flashChart)
    {
        this._flashChart = flashChart;
    } //-- void setFlashChart(com.regaltec.rsas.common.xmlparser.FlashChart) 

    /**
     * Sets the value of field 'gridID'.
     * 
     * @param gridID the value of field 'gridID'.
     */
    public void setGridID(java.lang.String gridID)
    {
        this._gridID = gridID;
    } //-- void setGridID(java.lang.String) 

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
     * Sets the value of field 'indicatorContent'.
     * 
     * @param indicatorContent the value of field 'indicatorContent'
     */
    public void setIndicatorContent(com.ccssoft.rsas.common.xmlparser.IndicatorContent indicatorContent)
    {
        this._indicatorContent = indicatorContent;
    } //-- void setIndicatorContent(com.regaltec.rsas.common.xmlparser.IndicatorContent) 

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
     * Sets the value of field 'PTCategoryID'. The field
     * 'PTCategoryID' has the following description: ģ�����ID
     * 
     * @param PTCategoryID the value of field 'PTCategoryID'.
     */
    public void setPTCategoryID(java.lang.String PTCategoryID)
    {
        this._PTCategoryID = PTCategoryID;
    } //-- void setPTCategoryID(java.lang.String) 

    /**
     * Sets the value of field 'portletContentType'. The field
     * 'portletContentType' has the following description:
     * ��������:�û����塢����ģ��
     * 
     * @param portletContentType the value of field
     * 'portletContentType'.
     */
    public void setPortletContentType(com.ccssoft.rsas.common.xmlparser.types.PortletContentPortletContentTypeType portletContentType)
    {
        this._portletContentType = portletContentType;
    } //-- void setPortletContentType(com.regaltec.rsas.common.xmlparser.types.PortletContentPortletContentTypeType) 

    /**
     * Sets the value of field 'repContentType'.
     * 
     * @param repContentType the value of field 'repContentType'.
     */
    public void setRepContentType(com.ccssoft.rsas.common.xmlparser.types.PortletContentRepContentTypeType repContentType)
    {
        this._repContentType = repContentType;
    } //-- void setRepContentType(com.regaltec.rsas.common.xmlparser.types.PortletContentRepContentTypeType) 

    /**
     * Sets the value of field 'reportID'.
     * 
     * @param reportID the value of field 'reportID'.
     */
    public void setReportID(java.lang.String reportID)
    {
        this._reportID = reportID;
    } //-- void setReportID(java.lang.String) 

    /**
     * Sets the value of field 'SPMContent'.
     * 
     * @param SPMContent the value of field 'SPMContent'.
     */
    public void setSPMContent(com.ccssoft.rsas.common.xmlparser.SPMContent SPMContent)
    {
        this._SPMContent = SPMContent;
    } //-- void setSPMContent(com.regaltec.rsas.common.xmlparser.SPMContent) 

    /**
     * Sets the value of field 'showCondition'. The field
     * 'showCondition' has the following description: �Ƿ���ʾɸѡ����
     * 
     * @param showCondition the value of field 'showCondition'.
     */
    public void setShowCondition(byte showCondition)
    {
        this._showCondition = showCondition;
        this._has_showCondition = true;
    } //-- void setShowCondition(byte) 

    /**
     * Sets the value of field 'URL'.
     * 
     * @param URL the value of field 'URL'.
     */
    public void setURL(java.lang.Object URL)
    {
        this._URL = URL;
    } //-- void setURL(java.lang.Object) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PortletContent) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PortletContent.class, reader);
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
