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

import com.ccssoft.rsas.common.xmlparser.types.TaskerExportTypeType;
import com.ccssoft.rsas.common.xmlparser.types.TaskerNotifyTypeType;
import com.ccssoft.rsas.common.xmlparser.types.TaskerSendBacklogMsgTypeType;
import com.ccssoft.rsas.common.xmlparser.types.TaskerTaskObjectTypeType;
import com.ccssoft.rsas.common.xmlparser.types.TaskerTaskStatusType;

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
 * �ƻ�����
 * 
 * @version $Revision$ $Date$
 */
public class Tasker implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����������ͣ���������
     */
    private com.ccssoft.rsas.common.xmlparser.types.TaskerTaskObjectTypeType _taskObjectType;

    /**
     * Field _objectID
     */
    private java.lang.String _objectID;

    /**
     * Field _taskerGroupID
     */
    private java.lang.String _taskerGroupID;

    /**
     * Field _exportType
     */
    private com.ccssoft.rsas.common.xmlparser.types.TaskerExportTypeType _exportType;

    /**
     * ��ǰ���������ִ��״̬��satPrepare��׼��ִ�У�satRunning������ִ�У�satComplete��ִ�гɹ���satWaiting���ȴ��´�����
     */
    private com.ccssoft.rsas.common.xmlparser.types.TaskerTaskStatusType _taskStatus;

    /**
     * ��¼��
     */
    private java.lang.String _loginName;

    /**
     * ֪ͨ��ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.types.TaskerNotifyTypeType _notifyType;

    /**
     * ���Ų�֪ͨʱ�䣻�����Ե�֪ͨ��ʽ�����ж��ŷ�ʽʱ���ã���ʽ����ʼʱ��1, ����ʱ��1; ��ʼʱ��2, ����ʱ��2;
     * ...��ʼʱ��n, ����ʱ��n���磺22:00:00,23:59:59;00:00:00,08:30:00;...
     */
    private java.lang.String _msgWithoutNoticeTime;

    /**
     * ���ͻ�ѹ����֪ͨ���ͣ��������ͣ����ԡ�������ʱ��������������͡���ָ����ʱ�䷢��
     */
    private com.ccssoft.rsas.common.xmlparser.types.TaskerSendBacklogMsgTypeType _sendBacklogMsgType;

    /**
     * ָ���ķ��Ͷ���ʱ��
     */
    private java.lang.String _specifiedSendMsgTime;

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
     * Field _conditionValues
     */
    private com.ccssoft.rsas.common.xmlparser.ConditionValues _conditionValues;

    /**
     * ֪ͨ�û�����
     */
    private com.ccssoft.rsas.common.xmlparser.NotifyObject _notifyObject;


      //----------------/
     //- Constructors -/
    //----------------/

    public Tasker() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Tasker()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'conditionValues'.
     * 
     * @return the value of field 'conditionValues'.
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionValues getConditionValues()
    {
        return this._conditionValues;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionValues getConditionValues() 

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
     * Returns the value of field 'exportType'.
     * 
     * @return the value of field 'exportType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.TaskerExportTypeType getExportType()
    {
        return this._exportType;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerExportTypeType getExportType() 

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
     * Returns the value of field 'loginName'. The field
     * 'loginName' has the following description: ��¼��
     * 
     * @return the value of field 'loginName'.
     */
    public java.lang.String getLoginName()
    {
        return this._loginName;
    } //-- java.lang.String getLoginName() 

    /**
     * Returns the value of field 'msgWithoutNoticeTime'. The field
     * 'msgWithoutNoticeTime' has the following description:
     * ���Ų�֪ͨʱ�䣻�����Ե�֪ͨ��ʽ�����ж��ŷ�ʽʱ���ã���ʽ����ʼʱ��1, ����ʱ��1; ��ʼʱ��2, ����ʱ��2;
     * ...��ʼʱ��n, ����ʱ��n���磺22:00:00,23:59:59;00:00:00,08:30:00;...
     * 
     * @return the value of field 'msgWithoutNoticeTime'.
     */
    public java.lang.String getMsgWithoutNoticeTime()
    {
        return this._msgWithoutNoticeTime;
    } //-- java.lang.String getMsgWithoutNoticeTime() 

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
     * Returns the value of field 'notifyObject'. The field
     * 'notifyObject' has the following description: ֪ͨ�û�����
     * 
     * @return the value of field 'notifyObject'.
     */
    public com.ccssoft.rsas.common.xmlparser.NotifyObject getNotifyObject()
    {
        return this._notifyObject;
    } //-- com.regaltec.rsas.common.xmlparser.NotifyObject getNotifyObject() 

    /**
     * Returns the value of field 'notifyType'. The field
     * 'notifyType' has the following description: ֪ͨ��ʽ
     * 
     * @return the value of field 'notifyType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.TaskerNotifyTypeType getNotifyType()
    {
        return this._notifyType;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerNotifyTypeType getNotifyType() 

    /**
     * Returns the value of field 'objectID'.
     * 
     * @return the value of field 'objectID'.
     */
    public java.lang.String getObjectID()
    {
        return this._objectID;
    } //-- java.lang.String getObjectID() 

    /**
     * Returns the value of field 'sendBacklogMsgType'. The field
     * 'sendBacklogMsgType' has the following description:
     * ���ͻ�ѹ����֪ͨ���ͣ��������ͣ����ԡ�������ʱ��������������͡���ָ����ʱ�䷢��
     * 
     * @return the value of field 'sendBacklogMsgType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.TaskerSendBacklogMsgTypeType getSendBacklogMsgType()
    {
        return this._sendBacklogMsgType;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerSendBacklogMsgTypeType getSendBacklogMsgType() 

    /**
     * Returns the value of field 'specifiedSendMsgTime'. The field
     * 'specifiedSendMsgTime' has the following description:
     * ָ���ķ��Ͷ���ʱ��
     * 
     * @return the value of field 'specifiedSendMsgTime'.
     */
    public java.lang.String getSpecifiedSendMsgTime()
    {
        return this._specifiedSendMsgTime;
    } //-- java.lang.String getSpecifiedSendMsgTime() 

    /**
     * Returns the value of field 'taskObjectType'. The field
     * 'taskObjectType' has the following description: ����������ͣ���������
     * 
     * @return the value of field 'taskObjectType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.TaskerTaskObjectTypeType getTaskObjectType()
    {
        return this._taskObjectType;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerTaskObjectTypeType getTaskObjectType() 

    /**
     * Returns the value of field 'taskStatus'. The field
     * 'taskStatus' has the following description:
     * ��ǰ���������ִ��״̬��satPrepare��׼��ִ�У�satRunning������ִ�У�satComplete��ִ�гɹ���satWaiting���ȴ��´�����
     * 
     * @return the value of field 'taskStatus'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.TaskerTaskStatusType getTaskStatus()
    {
        return this._taskStatus;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerTaskStatusType getTaskStatus() 

    /**
     * Returns the value of field 'taskerGroupID'.
     * 
     * @return the value of field 'taskerGroupID'.
     */
    public java.lang.String getTaskerGroupID()
    {
        return this._taskerGroupID;
    } //-- java.lang.String getTaskerGroupID() 

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
     * Sets the value of field 'conditionValues'.
     * 
     * @param conditionValues the value of field 'conditionValues'.
     */
    public void setConditionValues(com.ccssoft.rsas.common.xmlparser.ConditionValues conditionValues)
    {
        this._conditionValues = conditionValues;
    } //-- void setConditionValues(com.regaltec.rsas.common.xmlparser.ConditionValues) 

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
     * Sets the value of field 'exportType'.
     * 
     * @param exportType the value of field 'exportType'.
     */
    public void setExportType(com.ccssoft.rsas.common.xmlparser.types.TaskerExportTypeType exportType)
    {
        this._exportType = exportType;
    } //-- void setExportType(com.regaltec.rsas.common.xmlparser.types.TaskerExportTypeType) 

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
     * Sets the value of field 'loginName'. The field 'loginName'
     * has the following description: ��¼��
     * 
     * @param loginName the value of field 'loginName'.
     */
    public void setLoginName(java.lang.String loginName)
    {
        this._loginName = loginName;
    } //-- void setLoginName(java.lang.String) 

    /**
     * Sets the value of field 'msgWithoutNoticeTime'. The field
     * 'msgWithoutNoticeTime' has the following description:
     * ���Ų�֪ͨʱ�䣻�����Ե�֪ͨ��ʽ�����ж��ŷ�ʽʱ���ã���ʽ����ʼʱ��1, ����ʱ��1; ��ʼʱ��2, ����ʱ��2;
     * ...��ʼʱ��n, ����ʱ��n���磺22:00:00,23:59:59;00:00:00,08:30:00;...
     * 
     * @param msgWithoutNoticeTime the value of field
     * 'msgWithoutNoticeTime'.
     */
    public void setMsgWithoutNoticeTime(java.lang.String msgWithoutNoticeTime)
    {
        this._msgWithoutNoticeTime = msgWithoutNoticeTime;
    } //-- void setMsgWithoutNoticeTime(java.lang.String) 

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
     * Sets the value of field 'notifyObject'. The field
     * 'notifyObject' has the following description: ֪ͨ�û�����
     * 
     * @param notifyObject the value of field 'notifyObject'.
     */
    public void setNotifyObject(com.ccssoft.rsas.common.xmlparser.NotifyObject notifyObject)
    {
        this._notifyObject = notifyObject;
    } //-- void setNotifyObject(com.regaltec.rsas.common.xmlparser.NotifyObject) 

    /**
     * Sets the value of field 'notifyType'. The field 'notifyType'
     * has the following description: ֪ͨ��ʽ
     * 
     * @param notifyType the value of field 'notifyType'.
     */
    public void setNotifyType(com.ccssoft.rsas.common.xmlparser.types.TaskerNotifyTypeType notifyType)
    {
        this._notifyType = notifyType;
    } //-- void setNotifyType(com.regaltec.rsas.common.xmlparser.types.TaskerNotifyTypeType) 

    /**
     * Sets the value of field 'objectID'.
     * 
     * @param objectID the value of field 'objectID'.
     */
    public void setObjectID(java.lang.String objectID)
    {
        this._objectID = objectID;
    } //-- void setObjectID(java.lang.String) 

    /**
     * Sets the value of field 'sendBacklogMsgType'. The field
     * 'sendBacklogMsgType' has the following description:
     * ���ͻ�ѹ����֪ͨ���ͣ��������ͣ����ԡ�������ʱ��������������͡���ָ����ʱ�䷢��
     * 
     * @param sendBacklogMsgType the value of field
     * 'sendBacklogMsgType'.
     */
    public void setSendBacklogMsgType(com.ccssoft.rsas.common.xmlparser.types.TaskerSendBacklogMsgTypeType sendBacklogMsgType)
    {
        this._sendBacklogMsgType = sendBacklogMsgType;
    } //-- void setSendBacklogMsgType(com.regaltec.rsas.common.xmlparser.types.TaskerSendBacklogMsgTypeType) 

    /**
     * Sets the value of field 'specifiedSendMsgTime'. The field
     * 'specifiedSendMsgTime' has the following description:
     * ָ���ķ��Ͷ���ʱ��
     * 
     * @param specifiedSendMsgTime the value of field
     * 'specifiedSendMsgTime'.
     */
    public void setSpecifiedSendMsgTime(java.lang.String specifiedSendMsgTime)
    {
        this._specifiedSendMsgTime = specifiedSendMsgTime;
    } //-- void setSpecifiedSendMsgTime(java.lang.String) 

    /**
     * Sets the value of field 'taskObjectType'. The field
     * 'taskObjectType' has the following description: ����������ͣ���������
     * 
     * @param taskObjectType the value of field 'taskObjectType'.
     */
    public void setTaskObjectType(com.ccssoft.rsas.common.xmlparser.types.TaskerTaskObjectTypeType taskObjectType)
    {
        this._taskObjectType = taskObjectType;
    } //-- void setTaskObjectType(com.regaltec.rsas.common.xmlparser.types.TaskerTaskObjectTypeType) 

    /**
     * Sets the value of field 'taskStatus'. The field 'taskStatus'
     * has the following description:
     * ��ǰ���������ִ��״̬��satPrepare��׼��ִ�У�satRunning������ִ�У�satComplete��ִ�гɹ���satWaiting���ȴ��´�����
     * 
     * @param taskStatus the value of field 'taskStatus'.
     */
    public void setTaskStatus(com.ccssoft.rsas.common.xmlparser.types.TaskerTaskStatusType taskStatus)
    {
        this._taskStatus = taskStatus;
    } //-- void setTaskStatus(com.regaltec.rsas.common.xmlparser.types.TaskerTaskStatusType) 

    /**
     * Sets the value of field 'taskerGroupID'.
     * 
     * @param taskerGroupID the value of field 'taskerGroupID'.
     */
    public void setTaskerGroupID(java.lang.String taskerGroupID)
    {
        this._taskerGroupID = taskerGroupID;
    } //-- void setTaskerGroupID(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Tasker) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Tasker.class, reader);
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
