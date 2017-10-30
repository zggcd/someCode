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

import com.ccssoft.rsas.common.xmlparser.types.EvaluationDisplayTypeType;
import com.ccssoft.rsas.common.xmlparser.types.EvaluationExecuteTimeModeType;

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
 * ��������
 * 
 * @version $Revision$ $Date$
 */
public class Evaluation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ִ������
     */
    private com.ccssoft.rsas.common.xmlparser.types.EvaluationExecuteTimeModeType _executeTimeMode;

    /**
     * �����ڲ�����
     */
    private short _step;

    /**
     * keeps track of state for field: _step
     */
    private boolean _has_step;

    /**
     * �����ھ����Valueֵ
     */
    private java.lang.String _timeValue;

    /**
     * ������ִ������
     */
    private java.lang.String _executeDate;

    /**
     * ����ִ��ʱ��
     */
    private java.lang.String _executeTime;

    /**
     * ��Ч��ʼ����
     */
    private java.lang.String _validBeginDate;

    /**
     * ��Ч��������
     */
    private java.lang.String _validEndDate;

    /**
     * �´�ִ��ʱ��(����+ʱ��)����ʼ��ΪNULL
     */
    private java.lang.String _nextExecuteTime;

    /**
     * չ�ַ�ʽ���д�ͳ��ʽ��dtClassic����Portal��ʽ��dtPortal����Ĭ��Ϊ��ͳ��ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.types.EvaluationDisplayTypeType _displayType;

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
     * Field _evaluationReportList
     */
    private java.util.Vector _evaluationReportList;

    /**
     * ����ģ��
     */
    private com.ccssoft.rsas.common.xmlparser.EvaluationTemplate _evaluationTemplate;

    /**
     * Field _portal
     */
    private com.ccssoft.rsas.common.xmlparser.Portal _portal;


      //----------------/
     //- Constructors -/
    //----------------/

    public Evaluation() {
        super();
        _evaluationReportList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Evaluation()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addEvaluationReport
     * 
     * @param vEvaluationReport
     */
    public void addEvaluationReport(com.ccssoft.rsas.common.xmlparser.EvaluationReport vEvaluationReport)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationReportList.addElement(vEvaluationReport);
    } //-- void addEvaluationReport(com.regaltec.rsas.common.xmlparser.EvaluationReport) 

    /**
     * Method addEvaluationReport
     * 
     * @param index
     * @param vEvaluationReport
     */
    public void addEvaluationReport(int index, com.ccssoft.rsas.common.xmlparser.EvaluationReport vEvaluationReport)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationReportList.insertElementAt(vEvaluationReport, index);
    } //-- void addEvaluationReport(int, com.regaltec.rsas.common.xmlparser.EvaluationReport) 

    /**
     * Method deleteStep
     */
    public void deleteStep()
    {
        this._has_step= false;
    } //-- void deleteStep() 

    /**
     * Method enumerateEvaluationReport
     */
    public java.util.Enumeration enumerateEvaluationReport()
    {
        return _evaluationReportList.elements();
    } //-- java.util.Enumeration enumerateEvaluationReport() 

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
     * Returns the value of field 'displayType'. The field
     * 'displayType' has the following description:
     * չ�ַ�ʽ���д�ͳ��ʽ��dtClassic����Portal��ʽ��dtPortal����Ĭ��Ϊ��ͳ��ʽ
     * 
     * @return the value of field 'displayType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.EvaluationDisplayTypeType getDisplayType()
    {
        return this._displayType;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationDisplayTypeType getDisplayType() 

    /**
     * Method getEvaluationReport
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationReport getEvaluationReport(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationReportList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.EvaluationReport) _evaluationReportList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationReport getEvaluationReport(int) 

    /**
     * Method getEvaluationReport
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationReport[] getEvaluationReport()
    {
        int size = _evaluationReportList.size();
        com.ccssoft.rsas.common.xmlparser.EvaluationReport[] mArray = new com.ccssoft.rsas.common.xmlparser.EvaluationReport[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.EvaluationReport) _evaluationReportList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationReport[] getEvaluationReport() 

    /**
     * Method getEvaluationReportCount
     */
    public int getEvaluationReportCount()
    {
        return _evaluationReportList.size();
    } //-- int getEvaluationReportCount() 

    /**
     * Returns the value of field 'evaluationTemplate'. The field
     * 'evaluationTemplate' has the following description: ����ģ��
     * 
     * @return the value of field 'evaluationTemplate'.
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationTemplate getEvaluationTemplate()
    {
        return this._evaluationTemplate;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationTemplate getEvaluationTemplate() 

    /**
     * Returns the value of field 'executeDate'. The field
     * 'executeDate' has the following description: ������ִ������
     * 
     * @return the value of field 'executeDate'.
     */
    public java.lang.String getExecuteDate()
    {
        return this._executeDate;
    } //-- java.lang.String getExecuteDate() 

    /**
     * Returns the value of field 'executeTime'. The field
     * 'executeTime' has the following description: ����ִ��ʱ��
     * 
     * @return the value of field 'executeTime'.
     */
    public java.lang.String getExecuteTime()
    {
        return this._executeTime;
    } //-- java.lang.String getExecuteTime() 

    /**
     * Returns the value of field 'executeTimeMode'. The field
     * 'executeTimeMode' has the following description: ִ������
     * 
     * @return the value of field 'executeTimeMode'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.EvaluationExecuteTimeModeType getExecuteTimeMode()
    {
        return this._executeTimeMode;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationExecuteTimeModeType getExecuteTimeMode() 

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
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'nextExecuteTime'. The field
     * 'nextExecuteTime' has the following description:
     * �´�ִ��ʱ��(����+ʱ��)����ʼ��ΪNULL
     * 
     * @return the value of field 'nextExecuteTime'.
     */
    public java.lang.String getNextExecuteTime()
    {
        return this._nextExecuteTime;
    } //-- java.lang.String getNextExecuteTime() 

    /**
     * Returns the value of field 'portal'.
     * 
     * @return the value of field 'portal'.
     */
    public com.ccssoft.rsas.common.xmlparser.Portal getPortal()
    {
        return this._portal;
    } //-- com.regaltec.rsas.common.xmlparser.Portal getPortal() 

    /**
     * Returns the value of field 'step'. The field 'step' has the
     * following description: �����ڲ�����
     * 
     * @return the value of field 'step'.
     */
    public short getStep()
    {
        return this._step;
    } //-- short getStep() 

    /**
     * Returns the value of field 'timeValue'. The field
     * 'timeValue' has the following description: �����ھ����Valueֵ
     * 
     * @return the value of field 'timeValue'.
     */
    public java.lang.String getTimeValue()
    {
        return this._timeValue;
    } //-- java.lang.String getTimeValue() 

    /**
     * Returns the value of field 'validBeginDate'. The field
     * 'validBeginDate' has the following description: ��Ч��ʼ����
     * 
     * @return the value of field 'validBeginDate'.
     */
    public java.lang.String getValidBeginDate()
    {
        return this._validBeginDate;
    } //-- java.lang.String getValidBeginDate() 

    /**
     * Returns the value of field 'validEndDate'. The field
     * 'validEndDate' has the following description: ��Ч��������
     * 
     * @return the value of field 'validEndDate'.
     */
    public java.lang.String getValidEndDate()
    {
        return this._validEndDate;
    } //-- java.lang.String getValidEndDate() 

    /**
     * Method hasStep
     */
    public boolean hasStep()
    {
        return this._has_step;
    } //-- boolean hasStep() 

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
     * Method removeAllEvaluationReport
     */
    public void removeAllEvaluationReport()
    {
        _evaluationReportList.removeAllElements();
    } //-- void removeAllEvaluationReport() 

    /**
     * Method removeEvaluationReport
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationReport removeEvaluationReport(int index)
    {
        java.lang.Object obj = _evaluationReportList.elementAt(index);
        _evaluationReportList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.EvaluationReport) obj;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationReport removeEvaluationReport(int) 

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
     * Sets the value of field 'displayType'. The field
     * 'displayType' has the following description:
     * չ�ַ�ʽ���д�ͳ��ʽ��dtClassic����Portal��ʽ��dtPortal����Ĭ��Ϊ��ͳ��ʽ
     * 
     * @param displayType the value of field 'displayType'.
     */
    public void setDisplayType(com.ccssoft.rsas.common.xmlparser.types.EvaluationDisplayTypeType displayType)
    {
        this._displayType = displayType;
    } //-- void setDisplayType(com.regaltec.rsas.common.xmlparser.types.EvaluationDisplayTypeType) 

    /**
     * Method setEvaluationReport
     * 
     * @param index
     * @param vEvaluationReport
     */
    public void setEvaluationReport(int index, com.ccssoft.rsas.common.xmlparser.EvaluationReport vEvaluationReport)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationReportList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _evaluationReportList.setElementAt(vEvaluationReport, index);
    } //-- void setEvaluationReport(int, com.regaltec.rsas.common.xmlparser.EvaluationReport) 

    /**
     * Method setEvaluationReport
     * 
     * @param evaluationReportArray
     */
    public void setEvaluationReport(com.ccssoft.rsas.common.xmlparser.EvaluationReport[] evaluationReportArray)
    {
        //-- copy array
        _evaluationReportList.removeAllElements();
        for (int i = 0; i < evaluationReportArray.length; i++) {
            _evaluationReportList.addElement(evaluationReportArray[i]);
        }
    } //-- void setEvaluationReport(com.regaltec.rsas.common.xmlparser.EvaluationReport) 

    /**
     * Sets the value of field 'evaluationTemplate'. The field
     * 'evaluationTemplate' has the following description: ����ģ��
     * 
     * @param evaluationTemplate the value of field
     * 'evaluationTemplate'.
     */
    public void setEvaluationTemplate(com.ccssoft.rsas.common.xmlparser.EvaluationTemplate evaluationTemplate)
    {
        this._evaluationTemplate = evaluationTemplate;
    } //-- void setEvaluationTemplate(com.regaltec.rsas.common.xmlparser.EvaluationTemplate) 

    /**
     * Sets the value of field 'executeDate'. The field
     * 'executeDate' has the following description: ������ִ������
     * 
     * @param executeDate the value of field 'executeDate'.
     */
    public void setExecuteDate(java.lang.String executeDate)
    {
        this._executeDate = executeDate;
    } //-- void setExecuteDate(java.lang.String) 

    /**
     * Sets the value of field 'executeTime'. The field
     * 'executeTime' has the following description: ����ִ��ʱ��
     * 
     * @param executeTime the value of field 'executeTime'.
     */
    public void setExecuteTime(java.lang.String executeTime)
    {
        this._executeTime = executeTime;
    } //-- void setExecuteTime(java.lang.String) 

    /**
     * Sets the value of field 'executeTimeMode'. The field
     * 'executeTimeMode' has the following description: ִ������
     * 
     * @param executeTimeMode the value of field 'executeTimeMode'.
     */
    public void setExecuteTimeMode(com.ccssoft.rsas.common.xmlparser.types.EvaluationExecuteTimeModeType executeTimeMode)
    {
        this._executeTimeMode = executeTimeMode;
    } //-- void setExecuteTimeMode(com.regaltec.rsas.common.xmlparser.types.EvaluationExecuteTimeModeType) 

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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'nextExecuteTime'. The field
     * 'nextExecuteTime' has the following description:
     * �´�ִ��ʱ��(����+ʱ��)����ʼ��ΪNULL
     * 
     * @param nextExecuteTime the value of field 'nextExecuteTime'.
     */
    public void setNextExecuteTime(java.lang.String nextExecuteTime)
    {
        this._nextExecuteTime = nextExecuteTime;
    } //-- void setNextExecuteTime(java.lang.String) 

    /**
     * Sets the value of field 'portal'.
     * 
     * @param portal the value of field 'portal'.
     */
    public void setPortal(com.ccssoft.rsas.common.xmlparser.Portal portal)
    {
        this._portal = portal;
    } //-- void setPortal(com.regaltec.rsas.common.xmlparser.Portal) 

    /**
     * Sets the value of field 'step'. The field 'step' has the
     * following description: �����ڲ�����
     * 
     * @param step the value of field 'step'.
     */
    public void setStep(short step)
    {
        this._step = step;
        this._has_step = true;
    } //-- void setStep(short) 

    /**
     * Sets the value of field 'timeValue'. The field 'timeValue'
     * has the following description: �����ھ����Valueֵ
     * 
     * @param timeValue the value of field 'timeValue'.
     */
    public void setTimeValue(java.lang.String timeValue)
    {
        this._timeValue = timeValue;
    } //-- void setTimeValue(java.lang.String) 

    /**
     * Sets the value of field 'validBeginDate'. The field
     * 'validBeginDate' has the following description: ��Ч��ʼ����
     * 
     * @param validBeginDate the value of field 'validBeginDate'.
     */
    public void setValidBeginDate(java.lang.String validBeginDate)
    {
        this._validBeginDate = validBeginDate;
    } //-- void setValidBeginDate(java.lang.String) 

    /**
     * Sets the value of field 'validEndDate'. The field
     * 'validEndDate' has the following description: ��Ч��������
     * 
     * @param validEndDate the value of field 'validEndDate'.
     */
    public void setValidEndDate(java.lang.String validEndDate)
    {
        this._validEndDate = validEndDate;
    } //-- void setValidEndDate(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Evaluation) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Evaluation.class, reader);
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
