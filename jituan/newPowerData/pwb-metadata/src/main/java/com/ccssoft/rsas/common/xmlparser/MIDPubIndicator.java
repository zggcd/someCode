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

import com.ccssoft.rsas.common.xmlparser.types.MIDPubIndicatorIndicatorTypeType;

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
 * HTML �ƶ���������ָ��
 * 
 * @version $Revision$ $Date$
 */
public class MIDPubIndicator implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ָ������
     */
    private com.ccssoft.rsas.common.xmlparser.types.MIDPubIndicatorIndicatorTypeType _indicatorType;

    /**
     * ָ��ID
     */
    private java.lang.String _indicatorID;

    /**
     * ָ��Ĵ���
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
     * Field _MIDPubConditionList
     */
    private java.util.Vector _MIDPubConditionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MIDPubIndicator() {
        super();
        _MIDPubConditionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MIDPubIndicator()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMIDPubCondition
     * 
     * @param vMIDPubCondition
     */
    public void addMIDPubCondition(com.ccssoft.rsas.common.xmlparser.MIDPubCondition vMIDPubCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDPubConditionList.addElement(vMIDPubCondition);
    } //-- void addMIDPubCondition(com.regaltec.rsas.common.xmlparser.MIDPubCondition) 

    /**
     * Method addMIDPubCondition
     * 
     * @param index
     * @param vMIDPubCondition
     */
    public void addMIDPubCondition(int index, com.ccssoft.rsas.common.xmlparser.MIDPubCondition vMIDPubCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDPubConditionList.insertElementAt(vMIDPubCondition, index);
    } //-- void addMIDPubCondition(int, com.regaltec.rsas.common.xmlparser.MIDPubCondition) 

    /**
     * Method deleteItemOrder
     */
    public void deleteItemOrder()
    {
        this._has_itemOrder= false;
    } //-- void deleteItemOrder() 

    /**
     * Method enumerateMIDPubCondition
     */
    public java.util.Enumeration enumerateMIDPubCondition()
    {
        return _MIDPubConditionList.elements();
    } //-- java.util.Enumeration enumerateMIDPubCondition() 

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
     * Returns the value of field 'indicatorID'. The field
     * 'indicatorID' has the following description: ָ��ID
     * 
     * @return the value of field 'indicatorID'.
     */
    public java.lang.String getIndicatorID()
    {
        return this._indicatorID;
    } //-- java.lang.String getIndicatorID() 

    /**
     * Returns the value of field 'indicatorType'. The field
     * 'indicatorType' has the following description: ָ������
     * 
     * @return the value of field 'indicatorType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.MIDPubIndicatorIndicatorTypeType getIndicatorType()
    {
        return this._indicatorType;
    } //-- com.regaltec.rsas.common.xmlparser.types.MIDPubIndicatorIndicatorTypeType getIndicatorType() 

    /**
     * Returns the value of field 'itemOrder'. The field
     * 'itemOrder' has the following description: ָ��Ĵ���
     * 
     * @return the value of field 'itemOrder'.
     */
    public int getItemOrder()
    {
        return this._itemOrder;
    } //-- int getItemOrder() 

    /**
     * Method getMIDPubCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDPubCondition getMIDPubCondition(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDPubConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MIDPubCondition) _MIDPubConditionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MIDPubCondition getMIDPubCondition(int) 

    /**
     * Method getMIDPubCondition
     */
    public com.ccssoft.rsas.common.xmlparser.MIDPubCondition[] getMIDPubCondition()
    {
        int size = _MIDPubConditionList.size();
        com.ccssoft.rsas.common.xmlparser.MIDPubCondition[] mArray = new com.ccssoft.rsas.common.xmlparser.MIDPubCondition[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MIDPubCondition) _MIDPubConditionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MIDPubCondition[] getMIDPubCondition() 

    /**
     * Method getMIDPubConditionCount
     */
    public int getMIDPubConditionCount()
    {
        return _MIDPubConditionList.size();
    } //-- int getMIDPubConditionCount() 

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
     * Method removeAllMIDPubCondition
     */
    public void removeAllMIDPubCondition()
    {
        _MIDPubConditionList.removeAllElements();
    } //-- void removeAllMIDPubCondition() 

    /**
     * Method removeMIDPubCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDPubCondition removeMIDPubCondition(int index)
    {
        java.lang.Object obj = _MIDPubConditionList.elementAt(index);
        _MIDPubConditionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MIDPubCondition) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MIDPubCondition removeMIDPubCondition(int) 

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
     * Sets the value of field 'indicatorID'. The field
     * 'indicatorID' has the following description: ָ��ID
     * 
     * @param indicatorID the value of field 'indicatorID'.
     */
    public void setIndicatorID(java.lang.String indicatorID)
    {
        this._indicatorID = indicatorID;
    } //-- void setIndicatorID(java.lang.String) 

    /**
     * Sets the value of field 'indicatorType'. The field
     * 'indicatorType' has the following description: ָ������
     * 
     * @param indicatorType the value of field 'indicatorType'.
     */
    public void setIndicatorType(com.ccssoft.rsas.common.xmlparser.types.MIDPubIndicatorIndicatorTypeType indicatorType)
    {
        this._indicatorType = indicatorType;
    } //-- void setIndicatorType(com.regaltec.rsas.common.xmlparser.types.MIDPubIndicatorIndicatorTypeType) 

    /**
     * Sets the value of field 'itemOrder'. The field 'itemOrder'
     * has the following description: ָ��Ĵ���
     * 
     * @param itemOrder the value of field 'itemOrder'.
     */
    public void setItemOrder(int itemOrder)
    {
        this._itemOrder = itemOrder;
        this._has_itemOrder = true;
    } //-- void setItemOrder(int) 

    /**
     * Method setMIDPubCondition
     * 
     * @param index
     * @param vMIDPubCondition
     */
    public void setMIDPubCondition(int index, com.ccssoft.rsas.common.xmlparser.MIDPubCondition vMIDPubCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDPubConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _MIDPubConditionList.setElementAt(vMIDPubCondition, index);
    } //-- void setMIDPubCondition(int, com.regaltec.rsas.common.xmlparser.MIDPubCondition) 

    /**
     * Method setMIDPubCondition
     * 
     * @param MIDPubConditionArray
     */
    public void setMIDPubCondition(com.ccssoft.rsas.common.xmlparser.MIDPubCondition[] MIDPubConditionArray)
    {
        //-- copy array
        _MIDPubConditionList.removeAllElements();
        for (int i = 0; i < MIDPubConditionArray.length; i++) {
            _MIDPubConditionList.addElement(MIDPubConditionArray[i]);
        }
    } //-- void setMIDPubCondition(com.regaltec.rsas.common.xmlparser.MIDPubCondition) 

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
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MIDPubIndicator) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MIDPubIndicator.class, reader);
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
