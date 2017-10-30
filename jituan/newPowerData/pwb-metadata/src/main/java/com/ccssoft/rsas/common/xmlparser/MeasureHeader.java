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

import com.ccssoft.rsas.common.xmlparser.types.MeasureHeaderHeaderTypeType;

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
 * Class MeasureHeader.
 * 
 * @version $Revision$ $Date$
 */
public class MeasureHeader implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _caption
     */
    private java.lang.String _caption;

    /**
     * meaData������Ϊ���ݶ����� meaCal��������
     */
    private com.ccssoft.rsas.common.xmlparser.types.MeasureHeaderHeaderTypeType _headerType;

    /**
     * �п�
     */
    private int _width;

    /**
     * keeps track of state for field: _width
     */
    private boolean _has_width;

    /**
     * HeaderTypeΪmeaCalʱ��д������ļ��㹫ʽ
     */
    private java.lang.String _formula;

    /**
     * Field _format
     */
    private java.lang.String _format;

    /**
     * �Ƿ���Ԥ��
     */
    private byte _hasWarning;

    /**
     * keeps track of state for field: _hasWarning
     */
    private boolean _has_hasWarning;

    /**
     * �Ƿ��з���
     */
    private byte _hasAnalysis;

    /**
     * keeps track of state for field: _hasAnalysis
     */
    private boolean _has_hasAnalysis;

    /**
     * Field _visible
     */
    private byte _visible;

    /**
     * keeps track of state for field: _visible
     */
    private boolean _has_visible;

    /**
     * Ԥ��
     */
    private com.ccssoft.rsas.common.xmlparser.WarningLevels _warningLevels;

    /**
     * �����ķ�������
     */
    private com.ccssoft.rsas.common.xmlparser.Analyses _analyses;

    /**
     * ��������
     */
    private com.ccssoft.rsas.common.xmlparser.MeasureGroupBys _measureGroupBys;


      //----------------/
     //- Constructors -/
    //----------------/

    public MeasureHeader() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.MeasureHeader()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteHasAnalysis
     */
    public void deleteHasAnalysis()
    {
        this._has_hasAnalysis= false;
    } //-- void deleteHasAnalysis() 

    /**
     * Method deleteHasWarning
     */
    public void deleteHasWarning()
    {
        this._has_hasWarning= false;
    } //-- void deleteHasWarning() 

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
     * Returns the value of field 'analyses'. The field 'analyses'
     * has the following description: �����ķ�������
     * 
     * @return the value of field 'analyses'.
     */
    public com.ccssoft.rsas.common.xmlparser.Analyses getAnalyses()
    {
        return this._analyses;
    } //-- com.regaltec.rsas.common.xmlparser.Analyses getAnalyses() 

    /**
     * Returns the value of field 'caption'.
     * 
     * @return the value of field 'caption'.
     */
    public java.lang.String getCaption()
    {
        return this._caption;
    } //-- java.lang.String getCaption() 

    /**
     * Returns the value of field 'format'.
     * 
     * @return the value of field 'format'.
     */
    public java.lang.String getFormat()
    {
        return this._format;
    } //-- java.lang.String getFormat() 

    /**
     * Returns the value of field 'formula'. The field 'formula'
     * has the following description: HeaderTypeΪmeaCalʱ��д������ļ��㹫ʽ
     * 
     * @return the value of field 'formula'.
     */
    public java.lang.String getFormula()
    {
        return this._formula;
    } //-- java.lang.String getFormula() 

    /**
     * Returns the value of field 'hasAnalysis'. The field
     * 'hasAnalysis' has the following description: �Ƿ��з���
     * 
     * @return the value of field 'hasAnalysis'.
     */
    public byte getHasAnalysis()
    {
        return this._hasAnalysis;
    } //-- byte getHasAnalysis() 

    /**
     * Returns the value of field 'hasWarning'. The field
     * 'hasWarning' has the following description: �Ƿ���Ԥ��
     * 
     * @return the value of field 'hasWarning'.
     */
    public byte getHasWarning()
    {
        return this._hasWarning;
    } //-- byte getHasWarning() 

    /**
     * Returns the value of field 'headerType'. The field
     * 'headerType' has the following description: meaData������Ϊ���ݶ�����
     * meaCal��������
     * 
     * @return the value of field 'headerType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.MeasureHeaderHeaderTypeType getHeaderType()
    {
        return this._headerType;
    } //-- com.regaltec.rsas.common.xmlparser.types.MeasureHeaderHeaderTypeType getHeaderType() 

    /**
     * Returns the value of field 'measureGroupBys'. The field
     * 'measureGroupBys' has the following description: ��������
     * 
     * @return the value of field 'measureGroupBys'.
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureGroupBys getMeasureGroupBys()
    {
        return this._measureGroupBys;
    } //-- com.regaltec.rsas.common.xmlparser.MeasureGroupBys getMeasureGroupBys() 

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
     * Returns the value of field 'visible'.
     * 
     * @return the value of field 'visible'.
     */
    public byte getVisible()
    {
        return this._visible;
    } //-- byte getVisible() 

    /**
     * Returns the value of field 'warningLevels'. The field
     * 'warningLevels' has the following description: Ԥ��
     * 
     * @return the value of field 'warningLevels'.
     */
    public com.ccssoft.rsas.common.xmlparser.WarningLevels getWarningLevels()
    {
        return this._warningLevels;
    } //-- com.regaltec.rsas.common.xmlparser.WarningLevels getWarningLevels() 

    /**
     * Returns the value of field 'width'. The field 'width' has
     * the following description: �п�
     * 
     * @return the value of field 'width'.
     */
    public int getWidth()
    {
        return this._width;
    } //-- int getWidth() 

    /**
     * Method hasHasAnalysis
     */
    public boolean hasHasAnalysis()
    {
        return this._has_hasAnalysis;
    } //-- boolean hasHasAnalysis() 

    /**
     * Method hasHasWarning
     */
    public boolean hasHasWarning()
    {
        return this._has_hasWarning;
    } //-- boolean hasHasWarning() 

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
     * Sets the value of field 'analyses'. The field 'analyses' has
     * the following description: �����ķ�������
     * 
     * @param analyses the value of field 'analyses'.
     */
    public void setAnalyses(com.ccssoft.rsas.common.xmlparser.Analyses analyses)
    {
        this._analyses = analyses;
    } //-- void setAnalyses(com.regaltec.rsas.common.xmlparser.Analyses) 

    /**
     * Sets the value of field 'caption'.
     * 
     * @param caption the value of field 'caption'.
     */
    public void setCaption(java.lang.String caption)
    {
        this._caption = caption;
    } //-- void setCaption(java.lang.String) 

    /**
     * Sets the value of field 'format'.
     * 
     * @param format the value of field 'format'.
     */
    public void setFormat(java.lang.String format)
    {
        this._format = format;
    } //-- void setFormat(java.lang.String) 

    /**
     * Sets the value of field 'formula'. The field 'formula' has
     * the following description: HeaderTypeΪmeaCalʱ��д������ļ��㹫ʽ
     * 
     * @param formula the value of field 'formula'.
     */
    public void setFormula(java.lang.String formula)
    {
        this._formula = formula;
    } //-- void setFormula(java.lang.String) 

    /**
     * Sets the value of field 'hasAnalysis'. The field
     * 'hasAnalysis' has the following description: �Ƿ��з���
     * 
     * @param hasAnalysis the value of field 'hasAnalysis'.
     */
    public void setHasAnalysis(byte hasAnalysis)
    {
        this._hasAnalysis = hasAnalysis;
        this._has_hasAnalysis = true;
    } //-- void setHasAnalysis(byte) 

    /**
     * Sets the value of field 'hasWarning'. The field 'hasWarning'
     * has the following description: �Ƿ���Ԥ��
     * 
     * @param hasWarning the value of field 'hasWarning'.
     */
    public void setHasWarning(byte hasWarning)
    {
        this._hasWarning = hasWarning;
        this._has_hasWarning = true;
    } //-- void setHasWarning(byte) 

    /**
     * Sets the value of field 'headerType'. The field 'headerType'
     * has the following description: meaData������Ϊ���ݶ����� meaCal��������
     * 
     * @param headerType the value of field 'headerType'.
     */
    public void setHeaderType(com.ccssoft.rsas.common.xmlparser.types.MeasureHeaderHeaderTypeType headerType)
    {
        this._headerType = headerType;
    } //-- void setHeaderType(com.regaltec.rsas.common.xmlparser.types.MeasureHeaderHeaderTypeType) 

    /**
     * Sets the value of field 'measureGroupBys'. The field
     * 'measureGroupBys' has the following description: ��������
     * 
     * @param measureGroupBys the value of field 'measureGroupBys'.
     */
    public void setMeasureGroupBys(com.ccssoft.rsas.common.xmlparser.MeasureGroupBys measureGroupBys)
    {
        this._measureGroupBys = measureGroupBys;
    } //-- void setMeasureGroupBys(com.regaltec.rsas.common.xmlparser.MeasureGroupBys) 

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
     * Sets the value of field 'visible'.
     * 
     * @param visible the value of field 'visible'.
     */
    public void setVisible(byte visible)
    {
        this._visible = visible;
        this._has_visible = true;
    } //-- void setVisible(byte) 

    /**
     * Sets the value of field 'warningLevels'. The field
     * 'warningLevels' has the following description: Ԥ��
     * 
     * @param warningLevels the value of field 'warningLevels'.
     */
    public void setWarningLevels(com.ccssoft.rsas.common.xmlparser.WarningLevels warningLevels)
    {
        this._warningLevels = warningLevels;
    } //-- void setWarningLevels(com.regaltec.rsas.common.xmlparser.WarningLevels) 

    /**
     * Sets the value of field 'width'. The field 'width' has the
     * following description: �п�
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
        return (com.ccssoft.rsas.common.xmlparser.MeasureHeader) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MeasureHeader.class, reader);
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
