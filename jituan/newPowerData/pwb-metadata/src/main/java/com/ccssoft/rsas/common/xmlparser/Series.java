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

import com.ccssoft.rsas.common.xmlparser.types.SeriesAxisPositionType;
import com.ccssoft.rsas.common.xmlparser.types.SeriesSeriesTypeType;

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
 * Class Series.
 * 
 * @version $Revision$ $Date$
 */
public class Series implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * ����ID
     */
    private java.lang.String _measureItemID;

    /**
     * ����������
     */
    private java.lang.String _measureItemName;

    /**
     * ����
     */
    private java.lang.String _alias;

    /**
     * ��ͼ������Ϊ���ͼʱ��������д������
     */
    private com.ccssoft.rsas.common.xmlparser.types.SeriesSeriesTypeType _seriesType;

    /**
     * ������ȡ����λ�ã��ֱ�����������
     */
    private com.ccssoft.rsas.common.xmlparser.types.SeriesAxisPositionType _axisPosition;

    /**
     * ��ı���
     */
    private java.lang.String _axisTitle;


      //----------------/
     //- Constructors -/
    //----------------/

    public Series() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Series()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'alias'. The field 'alias' has
     * the following description: ����
     * 
     * @return the value of field 'alias'.
     */
    public java.lang.String getAlias()
    {
        return this._alias;
    } //-- java.lang.String getAlias() 

    /**
     * Returns the value of field 'axisPosition'. The field
     * 'axisPosition' has the following description:
     * ������ȡ����λ�ã��ֱ�����������
     * 
     * @return the value of field 'axisPosition'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.SeriesAxisPositionType getAxisPosition()
    {
        return this._axisPosition;
    } //-- com.regaltec.rsas.common.xmlparser.types.SeriesAxisPositionType getAxisPosition() 

    /**
     * Returns the value of field 'axisTitle'. The field
     * 'axisTitle' has the following description: ��ı���
     * 
     * @return the value of field 'axisTitle'.
     */
    public java.lang.String getAxisTitle()
    {
        return this._axisTitle;
    } //-- java.lang.String getAxisTitle() 

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
     * Returns the value of field 'measureItemID'. The field
     * 'measureItemID' has the following description: ����ID
     * 
     * @return the value of field 'measureItemID'.
     */
    public java.lang.String getMeasureItemID()
    {
        return this._measureItemID;
    } //-- java.lang.String getMeasureItemID() 

    /**
     * Returns the value of field 'measureItemName'. The field
     * 'measureItemName' has the following description: ����������
     * 
     * @return the value of field 'measureItemName'.
     */
    public java.lang.String getMeasureItemName()
    {
        return this._measureItemName;
    } //-- java.lang.String getMeasureItemName() 

    /**
     * Returns the value of field 'seriesType'. The field
     * 'seriesType' has the following description:
     * ��ͼ������Ϊ���ͼʱ��������д������
     * 
     * @return the value of field 'seriesType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.SeriesSeriesTypeType getSeriesType()
    {
        return this._seriesType;
    } //-- com.regaltec.rsas.common.xmlparser.types.SeriesSeriesTypeType getSeriesType() 

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
     * Sets the value of field 'alias'. The field 'alias' has the
     * following description: ����
     * 
     * @param alias the value of field 'alias'.
     */
    public void setAlias(java.lang.String alias)
    {
        this._alias = alias;
    } //-- void setAlias(java.lang.String) 

    /**
     * Sets the value of field 'axisPosition'. The field
     * 'axisPosition' has the following description:
     * ������ȡ����λ�ã��ֱ�����������
     * 
     * @param axisPosition the value of field 'axisPosition'.
     */
    public void setAxisPosition(com.ccssoft.rsas.common.xmlparser.types.SeriesAxisPositionType axisPosition)
    {
        this._axisPosition = axisPosition;
    } //-- void setAxisPosition(com.regaltec.rsas.common.xmlparser.types.SeriesAxisPositionType) 

    /**
     * Sets the value of field 'axisTitle'. The field 'axisTitle'
     * has the following description: ��ı���
     * 
     * @param axisTitle the value of field 'axisTitle'.
     */
    public void setAxisTitle(java.lang.String axisTitle)
    {
        this._axisTitle = axisTitle;
    } //-- void setAxisTitle(java.lang.String) 

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
     * Sets the value of field 'measureItemID'. The field
     * 'measureItemID' has the following description: ����ID
     * 
     * @param measureItemID the value of field 'measureItemID'.
     */
    public void setMeasureItemID(java.lang.String measureItemID)
    {
        this._measureItemID = measureItemID;
    } //-- void setMeasureItemID(java.lang.String) 

    /**
     * Sets the value of field 'measureItemName'. The field
     * 'measureItemName' has the following description: ����������
     * 
     * @param measureItemName the value of field 'measureItemName'.
     */
    public void setMeasureItemName(java.lang.String measureItemName)
    {
        this._measureItemName = measureItemName;
    } //-- void setMeasureItemName(java.lang.String) 

    /**
     * Sets the value of field 'seriesType'. The field 'seriesType'
     * has the following description: ��ͼ������Ϊ���ͼʱ��������д������
     * 
     * @param seriesType the value of field 'seriesType'.
     */
    public void setSeriesType(com.ccssoft.rsas.common.xmlparser.types.SeriesSeriesTypeType seriesType)
    {
        this._seriesType = seriesType;
    } //-- void setSeriesType(com.regaltec.rsas.common.xmlparser.types.SeriesSeriesTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Series) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Series.class, reader);
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
