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

import com.ccssoft.rsas.common.xmlparser.types.MIDReportShowTypeType;

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
 * �ƶ�����
 * 
 * @version $Revision$ $Date$
 */
public class MIDReport implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �������
     */
    private java.lang.String _alias;

    /**
     * Field _reportID
     */
    private java.lang.String _reportID;

    /**
     * �������ʾ��ʽ����������ͨ��ʽ��ֱ�۷�ʽ��Ĭ��Ϊ��ͨ��ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.types.MIDReportShowTypeType _showType;

    /**
     * ����
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
     * Field _MIDQueryItemList
     */
    private java.util.Vector _MIDQueryItemList;

    /**
     * Field _MIDPubConditionList
     */
    private java.util.Vector _MIDPubConditionList;

    /**
     * Ϊ�����趨��Ĭ��ͼ��
     */
    private com.ccssoft.rsas.common.xmlparser.DefaultChart _defaultChart;


      //----------------/
     //- Constructors -/
    //----------------/

    public MIDReport() {
        super();
        _MIDQueryItemList = new Vector();
        _MIDPubConditionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MIDReport()


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
     * Method addMIDQueryItem
     * 
     * @param vMIDQueryItem
     */
    public void addMIDQueryItem(com.ccssoft.rsas.common.xmlparser.MIDQueryItem vMIDQueryItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDQueryItemList.addElement(vMIDQueryItem);
    } //-- void addMIDQueryItem(com.regaltec.rsas.common.xmlparser.MIDQueryItem) 

    /**
     * Method addMIDQueryItem
     * 
     * @param index
     * @param vMIDQueryItem
     */
    public void addMIDQueryItem(int index, com.ccssoft.rsas.common.xmlparser.MIDQueryItem vMIDQueryItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDQueryItemList.insertElementAt(vMIDQueryItem, index);
    } //-- void addMIDQueryItem(int, com.regaltec.rsas.common.xmlparser.MIDQueryItem) 

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
     * Method enumerateMIDQueryItem
     */
    public java.util.Enumeration enumerateMIDQueryItem()
    {
        return _MIDQueryItemList.elements();
    } //-- java.util.Enumeration enumerateMIDQueryItem() 

    /**
     * Returns the value of field 'alias'. The field 'alias' has
     * the following description: �������
     * 
     * @return the value of field 'alias'.
     */
    public java.lang.String getAlias()
    {
        return this._alias;
    } //-- java.lang.String getAlias() 

    /**
     * Returns the value of field 'defaultChart'. The field
     * 'defaultChart' has the following description: Ϊ�����趨��Ĭ��ͼ��
     * 
     * @return the value of field 'defaultChart'.
     */
    public com.ccssoft.rsas.common.xmlparser.DefaultChart getDefaultChart()
    {
        return this._defaultChart;
    } //-- com.regaltec.rsas.common.xmlparser.DefaultChart getDefaultChart() 

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
     * Returns the value of field 'itemOrder'. The field
     * 'itemOrder' has the following description: ����
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
     * Method getMIDQueryItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDQueryItem getMIDQueryItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDQueryItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MIDQueryItem) _MIDQueryItemList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MIDQueryItem getMIDQueryItem(int) 

    /**
     * Method getMIDQueryItem
     */
    public com.ccssoft.rsas.common.xmlparser.MIDQueryItem[] getMIDQueryItem()
    {
        int size = _MIDQueryItemList.size();
        com.ccssoft.rsas.common.xmlparser.MIDQueryItem[] mArray = new com.ccssoft.rsas.common.xmlparser.MIDQueryItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MIDQueryItem) _MIDQueryItemList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MIDQueryItem[] getMIDQueryItem() 

    /**
     * Method getMIDQueryItemCount
     */
    public int getMIDQueryItemCount()
    {
        return _MIDQueryItemList.size();
    } //-- int getMIDQueryItemCount() 

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
     * Returns the value of field 'reportID'.
     * 
     * @return the value of field 'reportID'.
     */
    public java.lang.String getReportID()
    {
        return this._reportID;
    } //-- java.lang.String getReportID() 

    /**
     * Returns the value of field 'showType'. The field 'showType'
     * has the following description: �������ʾ��ʽ����������ͨ��ʽ��ֱ�۷�ʽ��Ĭ��Ϊ��ͨ��ʽ
     * 
     * @return the value of field 'showType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.MIDReportShowTypeType getShowType()
    {
        return this._showType;
    } //-- com.regaltec.rsas.common.xmlparser.types.MIDReportShowTypeType getShowType() 

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
     * Method removeAllMIDQueryItem
     */
    public void removeAllMIDQueryItem()
    {
        _MIDQueryItemList.removeAllElements();
    } //-- void removeAllMIDQueryItem() 

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
     * Method removeMIDQueryItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDQueryItem removeMIDQueryItem(int index)
    {
        java.lang.Object obj = _MIDQueryItemList.elementAt(index);
        _MIDQueryItemList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MIDQueryItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MIDQueryItem removeMIDQueryItem(int) 

    /**
     * Sets the value of field 'alias'. The field 'alias' has the
     * following description: �������
     * 
     * @param alias the value of field 'alias'.
     */
    public void setAlias(java.lang.String alias)
    {
        this._alias = alias;
    } //-- void setAlias(java.lang.String) 

    /**
     * Sets the value of field 'defaultChart'. The field
     * 'defaultChart' has the following description: Ϊ�����趨��Ĭ��ͼ��
     * 
     * @param defaultChart the value of field 'defaultChart'.
     */
    public void setDefaultChart(com.ccssoft.rsas.common.xmlparser.DefaultChart defaultChart)
    {
        this._defaultChart = defaultChart;
    } //-- void setDefaultChart(com.regaltec.rsas.common.xmlparser.DefaultChart) 

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
     * Sets the value of field 'itemOrder'. The field 'itemOrder'
     * has the following description: ����
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
     * Method setMIDQueryItem
     * 
     * @param index
     * @param vMIDQueryItem
     */
    public void setMIDQueryItem(int index, com.ccssoft.rsas.common.xmlparser.MIDQueryItem vMIDQueryItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDQueryItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _MIDQueryItemList.setElementAt(vMIDQueryItem, index);
    } //-- void setMIDQueryItem(int, com.regaltec.rsas.common.xmlparser.MIDQueryItem) 

    /**
     * Method setMIDQueryItem
     * 
     * @param MIDQueryItemArray
     */
    public void setMIDQueryItem(com.ccssoft.rsas.common.xmlparser.MIDQueryItem[] MIDQueryItemArray)
    {
        //-- copy array
        _MIDQueryItemList.removeAllElements();
        for (int i = 0; i < MIDQueryItemArray.length; i++) {
            _MIDQueryItemList.addElement(MIDQueryItemArray[i]);
        }
    } //-- void setMIDQueryItem(com.regaltec.rsas.common.xmlparser.MIDQueryItem) 

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
     * Sets the value of field 'reportID'.
     * 
     * @param reportID the value of field 'reportID'.
     */
    public void setReportID(java.lang.String reportID)
    {
        this._reportID = reportID;
    } //-- void setReportID(java.lang.String) 

    /**
     * Sets the value of field 'showType'. The field 'showType' has
     * the following description: �������ʾ��ʽ����������ͨ��ʽ��ֱ�۷�ʽ��Ĭ��Ϊ��ͨ��ʽ
     * 
     * @param showType the value of field 'showType'.
     */
    public void setShowType(com.ccssoft.rsas.common.xmlparser.types.MIDReportShowTypeType showType)
    {
        this._showType = showType;
    } //-- void setShowType(com.regaltec.rsas.common.xmlparser.types.MIDReportShowTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MIDReport) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MIDReport.class, reader);
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
