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

import com.ccssoft.rsas.common.xmlparser.types.FlashChartChartTypeType;
import com.ccssoft.rsas.common.xmlparser.types.FlashChartRefTypeType;

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
 * Flashͼ��
 * 
 * @version $Revision$ $Date$
 */
public class FlashChart implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

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
     * �������ͣ�����ΪPortlet��Report��(2011-05-14����)
     */
    private com.ccssoft.rsas.common.xmlparser.types.FlashChartRefTypeType _refType;

    /**
     * ���ö����ID���ֱ���дPortletContentID��ReportID
     */
    private java.lang.String _refObjectID;

    /**
     * Field _reportID
     */
    private java.lang.String _reportID;

    /**
     * Field _chartType
     */
    private com.ccssoft.rsas.common.xmlparser.types.FlashChartChartTypeType _chartType;

    /**
     * �Ƿ���ʾ3Dͼ��Ĭ��Ϊ0
     */
    private int _isShow3D;

    /**
     * keeps track of state for field: _isShow3D
     */
    private boolean _has_isShow3D;

    /**
     * Flash��XML�ļ�
     */
    private java.lang.String _modality;


      //----------------/
     //- Constructors -/
    //----------------/

    public FlashChart() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.FlashChart()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteIsShow3D
     */
    public void deleteIsShow3D()
    {
        this._has_isShow3D= false;
    } //-- void deleteIsShow3D() 

    /**
     * Returns the value of field 'chartType'.
     * 
     * @return the value of field 'chartType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.FlashChartChartTypeType getChartType()
    {
        return this._chartType;
    } //-- com.regaltec.rsas.common.xmlparser.types.FlashChartChartTypeType getChartType() 

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
     * Returns the value of field 'isShow3D'. The field 'isShow3D'
     * has the following description: �Ƿ���ʾ3Dͼ��Ĭ��Ϊ0
     * 
     * @return the value of field 'isShow3D'.
     */
    public int getIsShow3D()
    {
        return this._isShow3D;
    } //-- int getIsShow3D() 

    /**
     * Returns the value of field 'modality'. The field 'modality'
     * has the following description: Flash��XML�ļ�
     * 
     * @return the value of field 'modality'.
     */
    public java.lang.String getModality()
    {
        return this._modality;
    } //-- java.lang.String getModality() 

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
     * Returns the value of field 'refObjectID'. The field
     * 'refObjectID' has the following description:
     * ���ö����ID���ֱ���дPortletContentID��ReportID
     * 
     * @return the value of field 'refObjectID'.
     */
    public java.lang.String getRefObjectID()
    {
        return this._refObjectID;
    } //-- java.lang.String getRefObjectID() 

    /**
     * Returns the value of field 'refType'. The field 'refType'
     * has the following description:
     * �������ͣ�����ΪPortlet��Report��(2011-05-14����)
     * 
     * @return the value of field 'refType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.FlashChartRefTypeType getRefType()
    {
        return this._refType;
    } //-- com.regaltec.rsas.common.xmlparser.types.FlashChartRefTypeType getRefType() 

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
     * Method hasIsShow3D
     */
    public boolean hasIsShow3D()
    {
        return this._has_isShow3D;
    } //-- boolean hasIsShow3D() 

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
     * Sets the value of field 'chartType'.
     * 
     * @param chartType the value of field 'chartType'.
     */
    public void setChartType(com.ccssoft.rsas.common.xmlparser.types.FlashChartChartTypeType chartType)
    {
        this._chartType = chartType;
    } //-- void setChartType(com.regaltec.rsas.common.xmlparser.types.FlashChartChartTypeType) 

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
     * Sets the value of field 'isShow3D'. The field 'isShow3D' has
     * the following description: �Ƿ���ʾ3Dͼ��Ĭ��Ϊ0
     * 
     * @param isShow3D the value of field 'isShow3D'.
     */
    public void setIsShow3D(int isShow3D)
    {
        this._isShow3D = isShow3D;
        this._has_isShow3D = true;
    } //-- void setIsShow3D(int) 

    /**
     * Sets the value of field 'modality'. The field 'modality' has
     * the following description: Flash��XML�ļ�
     * 
     * @param modality the value of field 'modality'.
     */
    public void setModality(java.lang.String modality)
    {
        this._modality = modality;
    } //-- void setModality(java.lang.String) 

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
     * Sets the value of field 'refObjectID'. The field
     * 'refObjectID' has the following description:
     * ���ö����ID���ֱ���дPortletContentID��ReportID
     * 
     * @param refObjectID the value of field 'refObjectID'.
     */
    public void setRefObjectID(java.lang.String refObjectID)
    {
        this._refObjectID = refObjectID;
    } //-- void setRefObjectID(java.lang.String) 

    /**
     * Sets the value of field 'refType'. The field 'refType' has
     * the following description:
     * �������ͣ�����ΪPortlet��Report��(2011-05-14����)
     * 
     * @param refType the value of field 'refType'.
     */
    public void setRefType(com.ccssoft.rsas.common.xmlparser.types.FlashChartRefTypeType refType)
    {
        this._refType = refType;
    } //-- void setRefType(com.regaltec.rsas.common.xmlparser.types.FlashChartRefTypeType) 

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
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.FlashChart) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.FlashChart.class, reader);
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
