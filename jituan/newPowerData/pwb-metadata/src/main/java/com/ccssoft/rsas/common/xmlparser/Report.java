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

import com.ccssoft.rsas.common.xmlparser.types.ReportReportShowModeType;
import com.ccssoft.rsas.common.xmlparser.types.ReportReportTypeType;

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
 * �������
 * 
 * @version $Revision$ $Date$
 */
public class Report implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportType
     */
    private com.ccssoft.rsas.common.xmlparser.types.ReportReportTypeType _reportType;

    /**
     * Field _caption
     */
    private java.lang.String _caption;

    /**
     * ��������к��б������ڸ����Լ�¼����ı��ʽ
     */
    private java.lang.String _expression;

    /**
     * ���������ֵΪ�����ʾ����δ����
     */
    private java.lang.String _publishID;

    /**
     * Field _pageWidth
     */
    private int _pageWidth;

    /**
     * keeps track of state for field: _pageWidth
     */
    private boolean _has_pageWidth;

    /**
     * �Ƿ�ʹ�û���
     */
    private byte _useCache;

    /**
     * keeps track of state for field: _useCache
     */
    private boolean _has_useCache;

    /**
     * �����չ�ַ�ʽ:��ʽģʽ,���ݱ��,ֱ�ӵ���ģʽ
     */
    private com.ccssoft.rsas.common.xmlparser.types.ReportReportShowModeType _reportShowMode;

    /**
     * ÿҳ��¼��
     * ReportShowMode=rsmDataGrid��Ч
     * ֵΪ0ʱ�������еļ�¼��
     */
    private int _pageRow;

    /**
     * keeps track of state for field: _pageRow
     */
    private boolean _has_pageRow;

    /**
     * �����Ĳ�ѯID,
     * ��������Ϊ��ʱ�����Ĳ�ѯΪ�����һ��ѯ��
     */
    private java.lang.String _gridQueryID;

    /**
     * ����Excel�İٷֱȸ�ʽ�Ƿ����% 0 �� 1 ��
     */
    private byte _isExcelPerFormat;

    /**
     * keeps track of state for field: _isExcelPerFormat
     */
    private boolean _has_isExcelPerFormat;

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
     * ʹ�õı�����ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.Template _template;

    /**
     * Field _reportDefines
     */
    private com.ccssoft.rsas.common.xmlparser.ReportDefines _reportDefines;


      //----------------/
     //- Constructors -/
    //----------------/

    public Report() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Report()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteIsExcelPerFormat
     */
    public void deleteIsExcelPerFormat()
    {
        this._has_isExcelPerFormat= false;
    } //-- void deleteIsExcelPerFormat() 

    /**
     * Method deletePageRow
     */
    public void deletePageRow()
    {
        this._has_pageRow= false;
    } //-- void deletePageRow() 

    /**
     * Method deletePageWidth
     */
    public void deletePageWidth()
    {
        this._has_pageWidth= false;
    } //-- void deletePageWidth() 

    /**
     * Method deleteUseCache
     */
    public void deleteUseCache()
    {
        this._has_useCache= false;
    } //-- void deleteUseCache() 

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
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'desc'.
     */
    public java.lang.String getDesc()
    {
        return this._desc;
    } //-- java.lang.String getDesc() 

    /**
     * Returns the value of field 'expression'. The field
     * 'expression' has the following description:
     * ��������к��б������ڸ����Լ�¼����ı��ʽ
     * 
     * @return the value of field 'expression'.
     */
    public java.lang.String getExpression()
    {
        return this._expression;
    } //-- java.lang.String getExpression() 

    /**
     * Returns the value of field 'gridQueryID'. The field
     * 'gridQueryID' has the following description: �����Ĳ�ѯID,
     * ��������Ϊ��ʱ�����Ĳ�ѯΪ�����һ��ѯ��
     * 
     * @return the value of field 'gridQueryID'.
     */
    public java.lang.String getGridQueryID()
    {
        return this._gridQueryID;
    } //-- java.lang.String getGridQueryID() 

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
     * Returns the value of field 'isExcelPerFormat'. The field
     * 'isExcelPerFormat' has the following description:
     * ����Excel�İٷֱȸ�ʽ�Ƿ����% 0 �� 1 ��
     * 
     * @return the value of field 'isExcelPerFormat'.
     */
    public byte getIsExcelPerFormat()
    {
        return this._isExcelPerFormat;
    } //-- byte getIsExcelPerFormat() 

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
     * Returns the value of field 'pageRow'. The field 'pageRow'
     * has the following description: ÿҳ��¼��
     * ReportShowMode=rsmDataGrid��Ч
     * ֵΪ0ʱ�������еļ�¼��
     * 
     * @return the value of field 'pageRow'.
     */
    public int getPageRow()
    {
        return this._pageRow;
    } //-- int getPageRow() 

    /**
     * Returns the value of field 'pageWidth'.
     * 
     * @return the value of field 'pageWidth'.
     */
    public int getPageWidth()
    {
        return this._pageWidth;
    } //-- int getPageWidth() 

    /**
     * Returns the value of field 'publishID'. The field
     * 'publishID' has the following description: ���������ֵΪ�����ʾ����δ����
     * 
     * @return the value of field 'publishID'.
     */
    public java.lang.String getPublishID()
    {
        return this._publishID;
    } //-- java.lang.String getPublishID() 

    /**
     * Returns the value of field 'reportDefines'.
     * 
     * @return the value of field 'reportDefines'.
     */
    public com.ccssoft.rsas.common.xmlparser.ReportDefines getReportDefines()
    {
        return this._reportDefines;
    } //-- com.regaltec.rsas.common.xmlparser.ReportDefines getReportDefines() 

    /**
     * Returns the value of field 'reportShowMode'. The field
     * 'reportShowMode' has the following description:
     * �����չ�ַ�ʽ:��ʽģʽ,���ݱ��,ֱ�ӵ���ģʽ
     * 
     * @return the value of field 'reportShowMode'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.ReportReportShowModeType getReportShowMode()
    {
        return this._reportShowMode;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportReportShowModeType getReportShowMode() 

    /**
     * Returns the value of field 'reportType'.
     * 
     * @return the value of field 'reportType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.ReportReportTypeType getReportType()
    {
        return this._reportType;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportReportTypeType getReportType() 

    /**
     * Returns the value of field 'template'. The field 'template'
     * has the following description: ʹ�õı�����ʽ
     * 
     * @return the value of field 'template'.
     */
    public com.ccssoft.rsas.common.xmlparser.Template getTemplate()
    {
        return this._template;
    } //-- com.regaltec.rsas.common.xmlparser.Template getTemplate() 

    /**
     * Returns the value of field 'useCache'. The field 'useCache'
     * has the following description: �Ƿ�ʹ�û���
     * 
     * @return the value of field 'useCache'.
     */
    public byte getUseCache()
    {
        return this._useCache;
    } //-- byte getUseCache() 

    /**
     * Method hasIsExcelPerFormat
     */
    public boolean hasIsExcelPerFormat()
    {
        return this._has_isExcelPerFormat;
    } //-- boolean hasIsExcelPerFormat() 

    /**
     * Method hasPageRow
     */
    public boolean hasPageRow()
    {
        return this._has_pageRow;
    } //-- boolean hasPageRow() 

    /**
     * Method hasPageWidth
     */
    public boolean hasPageWidth()
    {
        return this._has_pageWidth;
    } //-- boolean hasPageWidth() 

    /**
     * Method hasUseCache
     */
    public boolean hasUseCache()
    {
        return this._has_useCache;
    } //-- boolean hasUseCache() 

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
     * Sets the value of field 'caption'.
     * 
     * @param caption the value of field 'caption'.
     */
    public void setCaption(java.lang.String caption)
    {
        this._caption = caption;
    } //-- void setCaption(java.lang.String) 

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
     * Sets the value of field 'expression'. The field 'expression'
     * has the following description: ��������к��б������ڸ����Լ�¼����ı��ʽ
     * 
     * @param expression the value of field 'expression'.
     */
    public void setExpression(java.lang.String expression)
    {
        this._expression = expression;
    } //-- void setExpression(java.lang.String) 

    /**
     * Sets the value of field 'gridQueryID'. The field
     * 'gridQueryID' has the following description: �����Ĳ�ѯID,
     * ��������Ϊ��ʱ�����Ĳ�ѯΪ�����һ��ѯ��
     * 
     * @param gridQueryID the value of field 'gridQueryID'.
     */
    public void setGridQueryID(java.lang.String gridQueryID)
    {
        this._gridQueryID = gridQueryID;
    } //-- void setGridQueryID(java.lang.String) 

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
     * Sets the value of field 'isExcelPerFormat'. The field
     * 'isExcelPerFormat' has the following description:
     * ����Excel�İٷֱȸ�ʽ�Ƿ����% 0 �� 1 ��
     * 
     * @param isExcelPerFormat the value of field 'isExcelPerFormat'
     */
    public void setIsExcelPerFormat(byte isExcelPerFormat)
    {
        this._isExcelPerFormat = isExcelPerFormat;
        this._has_isExcelPerFormat = true;
    } //-- void setIsExcelPerFormat(byte) 

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
     * Sets the value of field 'pageRow'. The field 'pageRow' has
     * the following description: ÿҳ��¼��
     * ReportShowMode=rsmDataGrid��Ч
     * ֵΪ0ʱ�������еļ�¼��
     * 
     * @param pageRow the value of field 'pageRow'.
     */
    public void setPageRow(int pageRow)
    {
        this._pageRow = pageRow;
        this._has_pageRow = true;
    } //-- void setPageRow(int) 

    /**
     * Sets the value of field 'pageWidth'.
     * 
     * @param pageWidth the value of field 'pageWidth'.
     */
    public void setPageWidth(int pageWidth)
    {
        this._pageWidth = pageWidth;
        this._has_pageWidth = true;
    } //-- void setPageWidth(int) 

    /**
     * Sets the value of field 'publishID'. The field 'publishID'
     * has the following description: ���������ֵΪ�����ʾ����δ����
     * 
     * @param publishID the value of field 'publishID'.
     */
    public void setPublishID(java.lang.String publishID)
    {
        this._publishID = publishID;
    } //-- void setPublishID(java.lang.String) 

    /**
     * Sets the value of field 'reportDefines'.
     * 
     * @param reportDefines the value of field 'reportDefines'.
     */
    public void setReportDefines(com.ccssoft.rsas.common.xmlparser.ReportDefines reportDefines)
    {
        this._reportDefines = reportDefines;
    } //-- void setReportDefines(com.regaltec.rsas.common.xmlparser.ReportDefines) 

    /**
     * Sets the value of field 'reportShowMode'. The field
     * 'reportShowMode' has the following description:
     * �����չ�ַ�ʽ:��ʽģʽ,���ݱ��,ֱ�ӵ���ģʽ
     * 
     * @param reportShowMode the value of field 'reportShowMode'.
     */
    public void setReportShowMode(com.ccssoft.rsas.common.xmlparser.types.ReportReportShowModeType reportShowMode)
    {
        this._reportShowMode = reportShowMode;
    } //-- void setReportShowMode(com.regaltec.rsas.common.xmlparser.types.ReportReportShowModeType) 

    /**
     * Sets the value of field 'reportType'.
     * 
     * @param reportType the value of field 'reportType'.
     */
    public void setReportType(com.ccssoft.rsas.common.xmlparser.types.ReportReportTypeType reportType)
    {
        this._reportType = reportType;
    } //-- void setReportType(com.regaltec.rsas.common.xmlparser.types.ReportReportTypeType) 

    /**
     * Sets the value of field 'template'. The field 'template' has
     * the following description: ʹ�õı�����ʽ
     * 
     * @param template the value of field 'template'.
     */
    public void setTemplate(com.ccssoft.rsas.common.xmlparser.Template template)
    {
        this._template = template;
    } //-- void setTemplate(com.regaltec.rsas.common.xmlparser.Template) 

    /**
     * Sets the value of field 'useCache'. The field 'useCache' has
     * the following description: �Ƿ�ʹ�û���
     * 
     * @param useCache the value of field 'useCache'.
     */
    public void setUseCache(byte useCache)
    {
        this._useCache = useCache;
        this._has_useCache = true;
    } //-- void setUseCache(byte) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Report) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Report.class, reader);
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
