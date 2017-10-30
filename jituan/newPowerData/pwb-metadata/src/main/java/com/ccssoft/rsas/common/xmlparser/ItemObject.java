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

import com.ccssoft.rsas.common.xmlparser.types.ItemObjectItemObjectTypeType;

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
 * Class ItemObject.
 * 
 * @version $Revision$ $Date$
 */
public class ItemObject implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ������Ŀ��������ͣ�����Ϊ�����ָ��
     */
    private com.ccssoft.rsas.common.xmlparser.types.ItemObjectItemObjectTypeType _itemObjectType;

    /**
     * �����õĶ����ID�������Ǳ���ID����ָ��ID
     */
    private java.lang.String _refObjectID;

    /**
     * ָ����򣬵���ָ��ʱΪ0�����ָ��ʱ��������
     */
    private int _itemOrder;

    /**
     * keeps track of state for field: _itemOrder
     */
    private boolean _has_itemOrder;

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
     * Ԥ��
     */
    private com.ccssoft.rsas.common.xmlparser.WarningLevels _warningLevels;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemObject() {
        super();
        _conditionSetValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ItemObject()


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
     * Method deleteItemOrder
     */
    public void deleteItemOrder()
    {
        this._has_itemOrder= false;
    } //-- void deleteItemOrder() 

    /**
     * Method enumerateConditionSetValue
     */
    public java.util.Enumeration enumerateConditionSetValue()
    {
        return _conditionSetValueList.elements();
    } //-- java.util.Enumeration enumerateConditionSetValue() 

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
     * Returns the value of field 'itemObjectType'. The field
     * 'itemObjectType' has the following description:
     * ������Ŀ��������ͣ�����Ϊ�����ָ��
     * 
     * @return the value of field 'itemObjectType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.ItemObjectItemObjectTypeType getItemObjectType()
    {
        return this._itemObjectType;
    } //-- com.regaltec.rsas.common.xmlparser.types.ItemObjectItemObjectTypeType getItemObjectType() 

    /**
     * Returns the value of field 'itemOrder'. The field
     * 'itemOrder' has the following description:
     * ָ����򣬵���ָ��ʱΪ0�����ָ��ʱ��������
     * 
     * @return the value of field 'itemOrder'.
     */
    public int getItemOrder()
    {
        return this._itemOrder;
    } //-- int getItemOrder() 

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
     * �����õĶ����ID�������Ǳ���ID����ָ��ID
     * 
     * @return the value of field 'refObjectID'.
     */
    public java.lang.String getRefObjectID()
    {
        return this._refObjectID;
    } //-- java.lang.String getRefObjectID() 

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
     * Method hasItemOrder
     */
    public boolean hasItemOrder()
    {
        return this._has_itemOrder;
    } //-- boolean hasItemOrder() 

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
     * Sets the value of field 'itemObjectType'. The field
     * 'itemObjectType' has the following description:
     * ������Ŀ��������ͣ�����Ϊ�����ָ��
     * 
     * @param itemObjectType the value of field 'itemObjectType'.
     */
    public void setItemObjectType(com.ccssoft.rsas.common.xmlparser.types.ItemObjectItemObjectTypeType itemObjectType)
    {
        this._itemObjectType = itemObjectType;
    } //-- void setItemObjectType(com.regaltec.rsas.common.xmlparser.types.ItemObjectItemObjectTypeType) 

    /**
     * Sets the value of field 'itemOrder'. The field 'itemOrder'
     * has the following description: ָ����򣬵���ָ��ʱΪ0�����ָ��ʱ��������
     * 
     * @param itemOrder the value of field 'itemOrder'.
     */
    public void setItemOrder(int itemOrder)
    {
        this._itemOrder = itemOrder;
        this._has_itemOrder = true;
    } //-- void setItemOrder(int) 

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
     * �����õĶ����ID�������Ǳ���ID����ָ��ID
     * 
     * @param refObjectID the value of field 'refObjectID'.
     */
    public void setRefObjectID(java.lang.String refObjectID)
    {
        this._refObjectID = refObjectID;
    } //-- void setRefObjectID(java.lang.String) 

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
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ItemObject) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ItemObject.class, reader);
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
