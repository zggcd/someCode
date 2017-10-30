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
 * ����������־��Ϣ
 * 
 * @version $Revision$ $Date$
 */
public class LogInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��־����
     */
    private org.exolab.castor.types.Date _logDate;

    /**
     * ����ID
     */
    private java.lang.String _reportID;

    /**
     * ��������
     */
    private java.lang.String _reportName;

    /**
     * �洢���̱���Ĵ洢��������
     */
    private java.lang.String _runProcedureName;

    /**
     * ���ɱ���ĵ�¼�û�
     */
    private java.lang.String _loginName;

    /**
     * ��ȡ���ݼ�ʱ��
     */
    private int _runSQLLong;

    /**
     * keeps track of state for field: _runSQLLong
     */
    private boolean _has_runSQLLong;

    /**
     * ����ģ�����ʱ��
     */
    private int _compileTmpLong;

    /**
     * keeps track of state for field: _compileTmpLong
     */
    private boolean _has_compileTmpLong;

    /**
     * �������ʱ��
     */
    private int _reportFillLong;

    /**
     * keeps track of state for field: _reportFillLong
     */
    private boolean _has_reportFillLong;

    /**
     * �������е���ʱ��
     */
    private int _runReportLong;

    /**
     * keeps track of state for field: _runReportLong
     */
    private boolean _has_runReportLong;

    /**
     * Field _logInfo
     */
    private java.lang.String _logInfo;


      //----------------/
     //- Constructors -/
    //----------------/

    public LogInfo() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.LogInfo()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCompileTmpLong
     */
    public void deleteCompileTmpLong()
    {
        this._has_compileTmpLong= false;
    } //-- void deleteCompileTmpLong() 

    /**
     * Method deleteReportFillLong
     */
    public void deleteReportFillLong()
    {
        this._has_reportFillLong= false;
    } //-- void deleteReportFillLong() 

    /**
     * Method deleteRunReportLong
     */
    public void deleteRunReportLong()
    {
        this._has_runReportLong= false;
    } //-- void deleteRunReportLong() 

    /**
     * Method deleteRunSQLLong
     */
    public void deleteRunSQLLong()
    {
        this._has_runSQLLong= false;
    } //-- void deleteRunSQLLong() 

    /**
     * Returns the value of field 'compileTmpLong'. The field
     * 'compileTmpLong' has the following description: ����ģ�����ʱ��
     * 
     * @return the value of field 'compileTmpLong'.
     */
    public int getCompileTmpLong()
    {
        return this._compileTmpLong;
    } //-- int getCompileTmpLong() 

    /**
     * Returns the value of field 'logDate'. The field 'logDate'
     * has the following description: ��־����
     * 
     * @return the value of field 'logDate'.
     */
    public org.exolab.castor.types.Date getLogDate()
    {
        return this._logDate;
    } //-- org.exolab.castor.types.Date getLogDate() 

    /**
     * Returns the value of field 'logInfo'.
     * 
     * @return the value of field 'logInfo'.
     */
    public java.lang.String getLogInfo()
    {
        return this._logInfo;
    } //-- java.lang.String getLogInfo() 

    /**
     * Returns the value of field 'loginName'. The field
     * 'loginName' has the following description: ���ɱ���ĵ�¼�û�
     * 
     * @return the value of field 'loginName'.
     */
    public java.lang.String getLoginName()
    {
        return this._loginName;
    } //-- java.lang.String getLoginName() 

    /**
     * Returns the value of field 'reportFillLong'. The field
     * 'reportFillLong' has the following description: �������ʱ��
     * 
     * @return the value of field 'reportFillLong'.
     */
    public int getReportFillLong()
    {
        return this._reportFillLong;
    } //-- int getReportFillLong() 

    /**
     * Returns the value of field 'reportID'. The field 'reportID'
     * has the following description: ����ID
     * 
     * @return the value of field 'reportID'.
     */
    public java.lang.String getReportID()
    {
        return this._reportID;
    } //-- java.lang.String getReportID() 

    /**
     * Returns the value of field 'reportName'. The field
     * 'reportName' has the following description: ��������
     * 
     * @return the value of field 'reportName'.
     */
    public java.lang.String getReportName()
    {
        return this._reportName;
    } //-- java.lang.String getReportName() 

    /**
     * Returns the value of field 'runProcedureName'. The field
     * 'runProcedureName' has the following description:
     * �洢���̱���Ĵ洢��������
     * 
     * @return the value of field 'runProcedureName'.
     */
    public java.lang.String getRunProcedureName()
    {
        return this._runProcedureName;
    } //-- java.lang.String getRunProcedureName() 

    /**
     * Returns the value of field 'runReportLong'. The field
     * 'runReportLong' has the following description: �������е���ʱ��
     * 
     * @return the value of field 'runReportLong'.
     */
    public int getRunReportLong()
    {
        return this._runReportLong;
    } //-- int getRunReportLong() 

    /**
     * Returns the value of field 'runSQLLong'. The field
     * 'runSQLLong' has the following description: ��ȡ���ݼ�ʱ��
     * 
     * @return the value of field 'runSQLLong'.
     */
    public int getRunSQLLong()
    {
        return this._runSQLLong;
    } //-- int getRunSQLLong() 

    /**
     * Method hasCompileTmpLong
     */
    public boolean hasCompileTmpLong()
    {
        return this._has_compileTmpLong;
    } //-- boolean hasCompileTmpLong() 

    /**
     * Method hasReportFillLong
     */
    public boolean hasReportFillLong()
    {
        return this._has_reportFillLong;
    } //-- boolean hasReportFillLong() 

    /**
     * Method hasRunReportLong
     */
    public boolean hasRunReportLong()
    {
        return this._has_runReportLong;
    } //-- boolean hasRunReportLong() 

    /**
     * Method hasRunSQLLong
     */
    public boolean hasRunSQLLong()
    {
        return this._has_runSQLLong;
    } //-- boolean hasRunSQLLong() 

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
     * Sets the value of field 'compileTmpLong'. The field
     * 'compileTmpLong' has the following description: ����ģ�����ʱ��
     * 
     * @param compileTmpLong the value of field 'compileTmpLong'.
     */
    public void setCompileTmpLong(int compileTmpLong)
    {
        this._compileTmpLong = compileTmpLong;
        this._has_compileTmpLong = true;
    } //-- void setCompileTmpLong(int) 

    /**
     * Sets the value of field 'logDate'. The field 'logDate' has
     * the following description: ��־����
     * 
     * @param logDate the value of field 'logDate'.
     */
    public void setLogDate(org.exolab.castor.types.Date logDate)
    {
        this._logDate = logDate;
    } //-- void setLogDate(org.exolab.castor.types.Date) 

    /**
     * Sets the value of field 'logInfo'.
     * 
     * @param logInfo the value of field 'logInfo'.
     */
    public void setLogInfo(java.lang.String logInfo)
    {
        this._logInfo = logInfo;
    } //-- void setLogInfo(java.lang.String) 

    /**
     * Sets the value of field 'loginName'. The field 'loginName'
     * has the following description: ���ɱ���ĵ�¼�û�
     * 
     * @param loginName the value of field 'loginName'.
     */
    public void setLoginName(java.lang.String loginName)
    {
        this._loginName = loginName;
    } //-- void setLoginName(java.lang.String) 

    /**
     * Sets the value of field 'reportFillLong'. The field
     * 'reportFillLong' has the following description: �������ʱ��
     * 
     * @param reportFillLong the value of field 'reportFillLong'.
     */
    public void setReportFillLong(int reportFillLong)
    {
        this._reportFillLong = reportFillLong;
        this._has_reportFillLong = true;
    } //-- void setReportFillLong(int) 

    /**
     * Sets the value of field 'reportID'. The field 'reportID' has
     * the following description: ����ID
     * 
     * @param reportID the value of field 'reportID'.
     */
    public void setReportID(java.lang.String reportID)
    {
        this._reportID = reportID;
    } //-- void setReportID(java.lang.String) 

    /**
     * Sets the value of field 'reportName'. The field 'reportName'
     * has the following description: ��������
     * 
     * @param reportName the value of field 'reportName'.
     */
    public void setReportName(java.lang.String reportName)
    {
        this._reportName = reportName;
    } //-- void setReportName(java.lang.String) 

    /**
     * Sets the value of field 'runProcedureName'. The field
     * 'runProcedureName' has the following description:
     * �洢���̱���Ĵ洢��������
     * 
     * @param runProcedureName the value of field 'runProcedureName'
     */
    public void setRunProcedureName(java.lang.String runProcedureName)
    {
        this._runProcedureName = runProcedureName;
    } //-- void setRunProcedureName(java.lang.String) 

    /**
     * Sets the value of field 'runReportLong'. The field
     * 'runReportLong' has the following description: �������е���ʱ��
     * 
     * @param runReportLong the value of field 'runReportLong'.
     */
    public void setRunReportLong(int runReportLong)
    {
        this._runReportLong = runReportLong;
        this._has_runReportLong = true;
    } //-- void setRunReportLong(int) 

    /**
     * Sets the value of field 'runSQLLong'. The field 'runSQLLong'
     * has the following description: ��ȡ���ݼ�ʱ��
     * 
     * @param runSQLLong the value of field 'runSQLLong'.
     */
    public void setRunSQLLong(int runSQLLong)
    {
        this._runSQLLong = runSQLLong;
        this._has_runSQLLong = true;
    } //-- void setRunSQLLong(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.LogInfo) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.LogInfo.class, reader);
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
