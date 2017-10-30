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

import com.ccssoft.rsas.common.xmlparser.types.HierarchyOwnerObjectTypeType;

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
 * ά�Ȼ���Ĳ㼶
 * 
 * @version $Revision$ $Date$
 */
public class Hierarchy implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * DIM:ά���� FLD:����� RPT:����
     */
    private com.ccssoft.rsas.common.xmlparser.types.HierarchyOwnerObjectTypeType _ownerObjectType;

    /**
     * �ϼ������ά�ȵ�ID
     */
    private java.lang.String _upperObjectID;

    /**
     * ���������ά��Ϊ�ϼ���ԱID���������Ϊ������Ϊ��ѯ��ItemID
     */
    private java.lang.String _upperItemID;

    /**
     * �¼������ά�ȳ�Ա��ID
     */
    private java.lang.String _lowerObjectID;

    /**
     * �Ƿ����ӵ��ⲿϵͳ
     */
    private byte _linkApplication;

    /**
     * keeps track of state for field: _linkApplication
     */
    private boolean _has_linkApplication;

    /**
     * �Բ㼶ʹ��Լ������
     */
    private int _useConstraint;

    /**
     * keeps track of state for field: _useConstraint
     */
    private boolean _has_useConstraint;

    /**
     * �Ƿ��ںϼ��л��߷���ϼ����Ͽ�����ȡ
     */
    private short _isDrillSum;

    /**
     * keeps track of state for field: _isDrillSum
     */
    private boolean _has_isDrillSum;

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
     * �㼶�е�ÿ���ڵ�
     */
    private java.util.Vector _hierarchyItemList;

    /**
     * �ⲿӦ��ϵͳ
     */
    private com.ccssoft.rsas.common.xmlparser.Application _application;

    /**
     * �㼶��Լ������
     */
    private com.ccssoft.rsas.common.xmlparser.HierarchyLimit _hierarchyLimit;

    /**
     * Field _hierarchyRule
     */
    private com.ccssoft.rsas.common.xmlparser.HierarchyRule _hierarchyRule;

    /**
     * �㼶����Ч��Լ������
     */
    private com.ccssoft.rsas.common.xmlparser.HierarchyConstraint _hierarchyConstraint;

    /**
     * ���ϼ������ȡ�����ñ����ɸѡ�����Ķ�Ӧ��ϵ
     */
    private com.ccssoft.rsas.common.xmlparser.HierarchyRepConditionMaps _hierarchyRepConditionMaps;


      //----------------/
     //- Constructors -/
    //----------------/

    public Hierarchy() {
        super();
        _hierarchyItemList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Hierarchy()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addHierarchyItem
     * 
     * @param vHierarchyItem
     */
    public void addHierarchyItem(com.ccssoft.rsas.common.xmlparser.HierarchyItem vHierarchyItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _hierarchyItemList.addElement(vHierarchyItem);
    } //-- void addHierarchyItem(com.regaltec.rsas.common.xmlparser.HierarchyItem) 

    /**
     * Method addHierarchyItem
     * 
     * @param index
     * @param vHierarchyItem
     */
    public void addHierarchyItem(int index, com.ccssoft.rsas.common.xmlparser.HierarchyItem vHierarchyItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _hierarchyItemList.insertElementAt(vHierarchyItem, index);
    } //-- void addHierarchyItem(int, com.regaltec.rsas.common.xmlparser.HierarchyItem) 

    /**
     * Method deleteIsDrillSum
     */
    public void deleteIsDrillSum()
    {
        this._has_isDrillSum= false;
    } //-- void deleteIsDrillSum() 

    /**
     * Method deleteLinkApplication
     */
    public void deleteLinkApplication()
    {
        this._has_linkApplication= false;
    } //-- void deleteLinkApplication() 

    /**
     * Method deleteUseConstraint
     */
    public void deleteUseConstraint()
    {
        this._has_useConstraint= false;
    } //-- void deleteUseConstraint() 

    /**
     * Method enumerateHierarchyItem
     */
    public java.util.Enumeration enumerateHierarchyItem()
    {
        return _hierarchyItemList.elements();
    } //-- java.util.Enumeration enumerateHierarchyItem() 

    /**
     * Returns the value of field 'application'. The field
     * 'application' has the following description: �ⲿӦ��ϵͳ
     * 
     * @return the value of field 'application'.
     */
    public com.ccssoft.rsas.common.xmlparser.Application getApplication()
    {
        return this._application;
    } //-- com.regaltec.rsas.common.xmlparser.Application getApplication() 

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
     * Returns the value of field 'hierarchyConstraint'. The field
     * 'hierarchyConstraint' has the following description:
     * �㼶����Ч��Լ������
     * 
     * @return the value of field 'hierarchyConstraint'.
     */
    public com.ccssoft.rsas.common.xmlparser.HierarchyConstraint getHierarchyConstraint()
    {
        return this._hierarchyConstraint;
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyConstraint getHierarchyConstraint() 

    /**
     * Method getHierarchyItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.HierarchyItem getHierarchyItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _hierarchyItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.HierarchyItem) _hierarchyItemList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyItem getHierarchyItem(int) 

    /**
     * Method getHierarchyItem
     */
    public com.ccssoft.rsas.common.xmlparser.HierarchyItem[] getHierarchyItem()
    {
        int size = _hierarchyItemList.size();
        com.ccssoft.rsas.common.xmlparser.HierarchyItem[] mArray = new com.ccssoft.rsas.common.xmlparser.HierarchyItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.HierarchyItem) _hierarchyItemList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyItem[] getHierarchyItem() 

    /**
     * Method getHierarchyItemCount
     */
    public int getHierarchyItemCount()
    {
        return _hierarchyItemList.size();
    } //-- int getHierarchyItemCount() 

    /**
     * Returns the value of field 'hierarchyLimit'. The field
     * 'hierarchyLimit' has the following description: �㼶��Լ������
     * 
     * @return the value of field 'hierarchyLimit'.
     */
    public com.ccssoft.rsas.common.xmlparser.HierarchyLimit getHierarchyLimit()
    {
        return this._hierarchyLimit;
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyLimit getHierarchyLimit() 

    /**
     * Returns the value of field 'hierarchyRepConditionMaps'. The
     * field 'hierarchyRepConditionMaps' has the following
     * description: ���ϼ������ȡ�����ñ����ɸѡ�����Ķ�Ӧ��ϵ
     * 
     * @return the value of field 'hierarchyRepConditionMaps'.
     */
    public com.ccssoft.rsas.common.xmlparser.HierarchyRepConditionMaps getHierarchyRepConditionMaps()
    {
        return this._hierarchyRepConditionMaps;
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyRepConditionMaps getHierarchyRepConditionMaps() 

    /**
     * Returns the value of field 'hierarchyRule'.
     * 
     * @return the value of field 'hierarchyRule'.
     */
    public com.ccssoft.rsas.common.xmlparser.HierarchyRule getHierarchyRule()
    {
        return this._hierarchyRule;
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyRule getHierarchyRule() 

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
     * Returns the value of field 'isDrillSum'. The field
     * 'isDrillSum' has the following description:
     * �Ƿ��ںϼ��л��߷���ϼ����Ͽ�����ȡ
     * 
     * @return the value of field 'isDrillSum'.
     */
    public short getIsDrillSum()
    {
        return this._isDrillSum;
    } //-- short getIsDrillSum() 

    /**
     * Returns the value of field 'linkApplication'. The field
     * 'linkApplication' has the following description: �Ƿ����ӵ��ⲿϵͳ
     * 
     * @return the value of field 'linkApplication'.
     */
    public byte getLinkApplication()
    {
        return this._linkApplication;
    } //-- byte getLinkApplication() 

    /**
     * Returns the value of field 'lowerObjectID'. The field
     * 'lowerObjectID' has the following description: �¼������ά�ȳ�Ա��ID
     * 
     * @return the value of field 'lowerObjectID'.
     */
    public java.lang.String getLowerObjectID()
    {
        return this._lowerObjectID;
    } //-- java.lang.String getLowerObjectID() 

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
     * Returns the value of field 'ownerObjectType'. The field
     * 'ownerObjectType' has the following description: DIM:ά����
     * FLD:����� RPT:����
     * 
     * @return the value of field 'ownerObjectType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.HierarchyOwnerObjectTypeType getOwnerObjectType()
    {
        return this._ownerObjectType;
    } //-- com.regaltec.rsas.common.xmlparser.types.HierarchyOwnerObjectTypeType getOwnerObjectType() 

    /**
     * Returns the value of field 'upperItemID'. The field
     * 'upperItemID' has the following description:
     * ���������ά��Ϊ�ϼ���ԱID���������Ϊ������Ϊ��ѯ��ItemID
     * 
     * @return the value of field 'upperItemID'.
     */
    public java.lang.String getUpperItemID()
    {
        return this._upperItemID;
    } //-- java.lang.String getUpperItemID() 

    /**
     * Returns the value of field 'upperObjectID'. The field
     * 'upperObjectID' has the following description: �ϼ������ά�ȵ�ID
     * 
     * @return the value of field 'upperObjectID'.
     */
    public java.lang.String getUpperObjectID()
    {
        return this._upperObjectID;
    } //-- java.lang.String getUpperObjectID() 

    /**
     * Returns the value of field 'useConstraint'. The field
     * 'useConstraint' has the following description: �Բ㼶ʹ��Լ������
     * 
     * @return the value of field 'useConstraint'.
     */
    public int getUseConstraint()
    {
        return this._useConstraint;
    } //-- int getUseConstraint() 

    /**
     * Method hasIsDrillSum
     */
    public boolean hasIsDrillSum()
    {
        return this._has_isDrillSum;
    } //-- boolean hasIsDrillSum() 

    /**
     * Method hasLinkApplication
     */
    public boolean hasLinkApplication()
    {
        return this._has_linkApplication;
    } //-- boolean hasLinkApplication() 

    /**
     * Method hasUseConstraint
     */
    public boolean hasUseConstraint()
    {
        return this._has_useConstraint;
    } //-- boolean hasUseConstraint() 

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
     * Method removeAllHierarchyItem
     */
    public void removeAllHierarchyItem()
    {
        _hierarchyItemList.removeAllElements();
    } //-- void removeAllHierarchyItem() 

    /**
     * Method removeHierarchyItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.HierarchyItem removeHierarchyItem(int index)
    {
        java.lang.Object obj = _hierarchyItemList.elementAt(index);
        _hierarchyItemList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.HierarchyItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyItem removeHierarchyItem(int) 

    /**
     * Sets the value of field 'application'. The field
     * 'application' has the following description: �ⲿӦ��ϵͳ
     * 
     * @param application the value of field 'application'.
     */
    public void setApplication(com.ccssoft.rsas.common.xmlparser.Application application)
    {
        this._application = application;
    } //-- void setApplication(com.regaltec.rsas.common.xmlparser.Application) 

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
     * Sets the value of field 'hierarchyConstraint'. The field
     * 'hierarchyConstraint' has the following description:
     * �㼶����Ч��Լ������
     * 
     * @param hierarchyConstraint the value of field
     * 'hierarchyConstraint'.
     */
    public void setHierarchyConstraint(com.ccssoft.rsas.common.xmlparser.HierarchyConstraint hierarchyConstraint)
    {
        this._hierarchyConstraint = hierarchyConstraint;
    } //-- void setHierarchyConstraint(com.regaltec.rsas.common.xmlparser.HierarchyConstraint) 

    /**
     * Method setHierarchyItem
     * 
     * @param index
     * @param vHierarchyItem
     */
    public void setHierarchyItem(int index, com.ccssoft.rsas.common.xmlparser.HierarchyItem vHierarchyItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _hierarchyItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _hierarchyItemList.setElementAt(vHierarchyItem, index);
    } //-- void setHierarchyItem(int, com.regaltec.rsas.common.xmlparser.HierarchyItem) 

    /**
     * Method setHierarchyItem
     * 
     * @param hierarchyItemArray
     */
    public void setHierarchyItem(com.ccssoft.rsas.common.xmlparser.HierarchyItem[] hierarchyItemArray)
    {
        //-- copy array
        _hierarchyItemList.removeAllElements();
        for (int i = 0; i < hierarchyItemArray.length; i++) {
            _hierarchyItemList.addElement(hierarchyItemArray[i]);
        }
    } //-- void setHierarchyItem(com.regaltec.rsas.common.xmlparser.HierarchyItem) 

    /**
     * Sets the value of field 'hierarchyLimit'. The field
     * 'hierarchyLimit' has the following description: �㼶��Լ������
     * 
     * @param hierarchyLimit the value of field 'hierarchyLimit'.
     */
    public void setHierarchyLimit(com.ccssoft.rsas.common.xmlparser.HierarchyLimit hierarchyLimit)
    {
        this._hierarchyLimit = hierarchyLimit;
    } //-- void setHierarchyLimit(com.regaltec.rsas.common.xmlparser.HierarchyLimit) 

    /**
     * Sets the value of field 'hierarchyRepConditionMaps'. The
     * field 'hierarchyRepConditionMaps' has the following
     * description: ���ϼ������ȡ�����ñ����ɸѡ�����Ķ�Ӧ��ϵ
     * 
     * @param hierarchyRepConditionMaps the value of field
     * 'hierarchyRepConditionMaps'.
     */
    public void setHierarchyRepConditionMaps(com.ccssoft.rsas.common.xmlparser.HierarchyRepConditionMaps hierarchyRepConditionMaps)
    {
        this._hierarchyRepConditionMaps = hierarchyRepConditionMaps;
    } //-- void setHierarchyRepConditionMaps(com.regaltec.rsas.common.xmlparser.HierarchyRepConditionMaps) 

    /**
     * Sets the value of field 'hierarchyRule'.
     * 
     * @param hierarchyRule the value of field 'hierarchyRule'.
     */
    public void setHierarchyRule(com.ccssoft.rsas.common.xmlparser.HierarchyRule hierarchyRule)
    {
        this._hierarchyRule = hierarchyRule;
    } //-- void setHierarchyRule(com.regaltec.rsas.common.xmlparser.HierarchyRule) 

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
     * Sets the value of field 'isDrillSum'. The field 'isDrillSum'
     * has the following description: �Ƿ��ںϼ��л��߷���ϼ����Ͽ�����ȡ
     * 
     * @param isDrillSum the value of field 'isDrillSum'.
     */
    public void setIsDrillSum(short isDrillSum)
    {
        this._isDrillSum = isDrillSum;
        this._has_isDrillSum = true;
    } //-- void setIsDrillSum(short) 

    /**
     * Sets the value of field 'linkApplication'. The field
     * 'linkApplication' has the following description: �Ƿ����ӵ��ⲿϵͳ
     * 
     * @param linkApplication the value of field 'linkApplication'.
     */
    public void setLinkApplication(byte linkApplication)
    {
        this._linkApplication = linkApplication;
        this._has_linkApplication = true;
    } //-- void setLinkApplication(byte) 

    /**
     * Sets the value of field 'lowerObjectID'. The field
     * 'lowerObjectID' has the following description: �¼������ά�ȳ�Ա��ID
     * 
     * @param lowerObjectID the value of field 'lowerObjectID'.
     */
    public void setLowerObjectID(java.lang.String lowerObjectID)
    {
        this._lowerObjectID = lowerObjectID;
    } //-- void setLowerObjectID(java.lang.String) 

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
     * Sets the value of field 'ownerObjectType'. The field
     * 'ownerObjectType' has the following description: DIM:ά����
     * FLD:����� RPT:����
     * 
     * @param ownerObjectType the value of field 'ownerObjectType'.
     */
    public void setOwnerObjectType(com.ccssoft.rsas.common.xmlparser.types.HierarchyOwnerObjectTypeType ownerObjectType)
    {
        this._ownerObjectType = ownerObjectType;
    } //-- void setOwnerObjectType(com.regaltec.rsas.common.xmlparser.types.HierarchyOwnerObjectTypeType) 

    /**
     * Sets the value of field 'upperItemID'. The field
     * 'upperItemID' has the following description:
     * ���������ά��Ϊ�ϼ���ԱID���������Ϊ������Ϊ��ѯ��ItemID
     * 
     * @param upperItemID the value of field 'upperItemID'.
     */
    public void setUpperItemID(java.lang.String upperItemID)
    {
        this._upperItemID = upperItemID;
    } //-- void setUpperItemID(java.lang.String) 

    /**
     * Sets the value of field 'upperObjectID'. The field
     * 'upperObjectID' has the following description: �ϼ������ά�ȵ�ID
     * 
     * @param upperObjectID the value of field 'upperObjectID'.
     */
    public void setUpperObjectID(java.lang.String upperObjectID)
    {
        this._upperObjectID = upperObjectID;
    } //-- void setUpperObjectID(java.lang.String) 

    /**
     * Sets the value of field 'useConstraint'. The field
     * 'useConstraint' has the following description: �Բ㼶ʹ��Լ������
     * 
     * @param useConstraint the value of field 'useConstraint'.
     */
    public void setUseConstraint(int useConstraint)
    {
        this._useConstraint = useConstraint;
        this._has_useConstraint = true;
    } //-- void setUseConstraint(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Hierarchy) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Hierarchy.class, reader);
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
