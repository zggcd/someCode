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

import com.ccssoft.rsas.common.xmlparser.types.SubscriptionExportTypeType;
import com.ccssoft.rsas.common.xmlparser.types.SubscriptionInformTypeType;
import com.ccssoft.rsas.common.xmlparser.types.SubscriptionSubObjectTypeType;

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
 * ����
 * 
 * @version $Revision$ $Date$
 */
public class Subscription implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��������(������)
     */
    private java.lang.String _taskerGroupID;

    /**
     * �����û�
     */
    private java.lang.String _loginName;

    /**
     * ���Ķ�������:����,����
     */
    private com.ccssoft.rsas.common.xmlparser.types.SubscriptionSubObjectTypeType _subObjectType;

    /**
     * ���ı���ID
     */
    private java.lang.String _subObjectID;

    /**
     * ����������
     */
    private com.ccssoft.rsas.common.xmlparser.types.SubscriptionExportTypeType _exportType;

    /**
     * ֪ͨ����
     */
    private com.ccssoft.rsas.common.xmlparser.types.SubscriptionInformTypeType _informType;

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
     * ɸѡ����ֵ
     */
    private java.util.Vector _conditionValueList;

    /**
     * ֪ͨ�û�����
     */
    private com.ccssoft.rsas.common.xmlparser.NotifyObject _notifyObject;


      //----------------/
     //- Constructors -/
    //----------------/

    public Subscription() {
        super();
        _conditionValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Subscription()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConditionValue
     * 
     * @param vConditionValue
     */
    public void addConditionValue(com.ccssoft.rsas.common.xmlparser.ConditionValue vConditionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionValueList.addElement(vConditionValue);
    } //-- void addConditionValue(com.regaltec.rsas.common.xmlparser.ConditionValue) 

    /**
     * Method addConditionValue
     * 
     * @param index
     * @param vConditionValue
     */
    public void addConditionValue(int index, com.ccssoft.rsas.common.xmlparser.ConditionValue vConditionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionValueList.insertElementAt(vConditionValue, index);
    } //-- void addConditionValue(int, com.regaltec.rsas.common.xmlparser.ConditionValue) 

    /**
     * Method enumerateConditionValue
     */
    public java.util.Enumeration enumerateConditionValue()
    {
        return _conditionValueList.elements();
    } //-- java.util.Enumeration enumerateConditionValue() 

    /**
     * Method getConditionValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionValue getConditionValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ConditionValue) _conditionValueList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ConditionValue getConditionValue(int) 

    /**
     * Method getConditionValue
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionValue[] getConditionValue()
    {
        int size = _conditionValueList.size();
        com.ccssoft.rsas.common.xmlparser.ConditionValue[] mArray = new com.ccssoft.rsas.common.xmlparser.ConditionValue[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ConditionValue) _conditionValueList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionValue[] getConditionValue() 

    /**
     * Method getConditionValueCount
     */
    public int getConditionValueCount()
    {
        return _conditionValueList.size();
    } //-- int getConditionValueCount() 

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
     * Returns the value of field 'exportType'. The field
     * 'exportType' has the following description: ����������
     * 
     * @return the value of field 'exportType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.SubscriptionExportTypeType getExportType()
    {
        return this._exportType;
    } //-- com.regaltec.rsas.common.xmlparser.types.SubscriptionExportTypeType getExportType() 

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
     * Returns the value of field 'informType'. The field
     * 'informType' has the following description: ֪ͨ����
     * 
     * @return the value of field 'informType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.SubscriptionInformTypeType getInformType()
    {
        return this._informType;
    } //-- com.regaltec.rsas.common.xmlparser.types.SubscriptionInformTypeType getInformType() 

    /**
     * Returns the value of field 'loginName'. The field
     * 'loginName' has the following description: �����û�
     * 
     * @return the value of field 'loginName'.
     */
    public java.lang.String getLoginName()
    {
        return this._loginName;
    } //-- java.lang.String getLoginName() 

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
     * Returns the value of field 'subObjectID'. The field
     * 'subObjectID' has the following description: ���ı���ID
     * 
     * @return the value of field 'subObjectID'.
     */
    public java.lang.String getSubObjectID()
    {
        return this._subObjectID;
    } //-- java.lang.String getSubObjectID() 

    /**
     * Returns the value of field 'subObjectType'. The field
     * 'subObjectType' has the following description: ���Ķ�������:����,����
     * 
     * @return the value of field 'subObjectType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.SubscriptionSubObjectTypeType getSubObjectType()
    {
        return this._subObjectType;
    } //-- com.regaltec.rsas.common.xmlparser.types.SubscriptionSubObjectTypeType getSubObjectType() 

    /**
     * Returns the value of field 'taskerGroupID'. The field
     * 'taskerGroupID' has the following description: ��������(������)
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
     * Method removeAllConditionValue
     */
    public void removeAllConditionValue()
    {
        _conditionValueList.removeAllElements();
    } //-- void removeAllConditionValue() 

    /**
     * Method removeConditionValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionValue removeConditionValue(int index)
    {
        java.lang.Object obj = _conditionValueList.elementAt(index);
        _conditionValueList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ConditionValue) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionValue removeConditionValue(int) 

    /**
     * Method setConditionValue
     * 
     * @param index
     * @param vConditionValue
     */
    public void setConditionValue(int index, com.ccssoft.rsas.common.xmlparser.ConditionValue vConditionValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _conditionValueList.setElementAt(vConditionValue, index);
    } //-- void setConditionValue(int, com.regaltec.rsas.common.xmlparser.ConditionValue) 

    /**
     * Method setConditionValue
     * 
     * @param conditionValueArray
     */
    public void setConditionValue(com.ccssoft.rsas.common.xmlparser.ConditionValue[] conditionValueArray)
    {
        //-- copy array
        _conditionValueList.removeAllElements();
        for (int i = 0; i < conditionValueArray.length; i++) {
            _conditionValueList.addElement(conditionValueArray[i]);
        }
    } //-- void setConditionValue(com.regaltec.rsas.common.xmlparser.ConditionValue) 

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
     * Sets the value of field 'exportType'. The field 'exportType'
     * has the following description: ����������
     * 
     * @param exportType the value of field 'exportType'.
     */
    public void setExportType(com.ccssoft.rsas.common.xmlparser.types.SubscriptionExportTypeType exportType)
    {
        this._exportType = exportType;
    } //-- void setExportType(com.regaltec.rsas.common.xmlparser.types.SubscriptionExportTypeType) 

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
     * Sets the value of field 'informType'. The field 'informType'
     * has the following description: ֪ͨ����
     * 
     * @param informType the value of field 'informType'.
     */
    public void setInformType(com.ccssoft.rsas.common.xmlparser.types.SubscriptionInformTypeType informType)
    {
        this._informType = informType;
    } //-- void setInformType(com.regaltec.rsas.common.xmlparser.types.SubscriptionInformTypeType) 

    /**
     * Sets the value of field 'loginName'. The field 'loginName'
     * has the following description: �����û�
     * 
     * @param loginName the value of field 'loginName'.
     */
    public void setLoginName(java.lang.String loginName)
    {
        this._loginName = loginName;
    } //-- void setLoginName(java.lang.String) 

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
     * Sets the value of field 'subObjectID'. The field
     * 'subObjectID' has the following description: ���ı���ID
     * 
     * @param subObjectID the value of field 'subObjectID'.
     */
    public void setSubObjectID(java.lang.String subObjectID)
    {
        this._subObjectID = subObjectID;
    } //-- void setSubObjectID(java.lang.String) 

    /**
     * Sets the value of field 'subObjectType'. The field
     * 'subObjectType' has the following description: ���Ķ�������:����,����
     * 
     * @param subObjectType the value of field 'subObjectType'.
     */
    public void setSubObjectType(com.ccssoft.rsas.common.xmlparser.types.SubscriptionSubObjectTypeType subObjectType)
    {
        this._subObjectType = subObjectType;
    } //-- void setSubObjectType(com.regaltec.rsas.common.xmlparser.types.SubscriptionSubObjectTypeType) 

    /**
     * Sets the value of field 'taskerGroupID'. The field
     * 'taskerGroupID' has the following description: ��������(������)
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
        return (com.ccssoft.rsas.common.xmlparser.Subscription) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Subscription.class, reader);
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
