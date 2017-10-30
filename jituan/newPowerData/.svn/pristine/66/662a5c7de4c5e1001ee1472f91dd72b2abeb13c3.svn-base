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

import com.ccssoft.rsas.common.xmlparser.types.PortalHeightTypeType;
import com.ccssoft.rsas.common.xmlparser.types.PortalPortalTypeType;

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
 * Class Portal.
 * 
 * @version $Revision$ $Date$
 */
public class Portal implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _loginName
     */
    private java.lang.String _loginName;

    /**
     * ������Ŀǰֻ����2��������
     */
    private int _colCount;

    /**
     * keeps track of state for field: _colCount
     */
    private boolean _has_colCount;

    /**
     * ����������ռ����������1��1
     */
    private java.lang.String _colScale;

    /**
     * �߶����ͣ�����Ӧ���趨�߶�
     */
    private com.ccssoft.rsas.common.xmlparser.types.PortalHeightTypeType _heightType;

    /**
     * portal���ͣ��û����ƣ�����ģ�塢����ģ��
     */
    private com.ccssoft.rsas.common.xmlparser.types.PortalPortalTypeType _portalType;

    /**
     * ģ�����ID
     */
    private java.lang.String _PTCategoryID;

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
     * Field _portlets
     */
    private com.ccssoft.rsas.common.xmlparser.Portlets _portlets;

    /**
     * Field _conditionRelationList
     */
    private java.util.Vector _conditionRelationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Portal() {
        super();
        _conditionRelationList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Portal()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConditionRelation
     * 
     * @param vConditionRelation
     */
    public void addConditionRelation(com.ccssoft.rsas.common.xmlparser.ConditionRelation vConditionRelation)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionRelationList.addElement(vConditionRelation);
    } //-- void addConditionRelation(com.regaltec.rsas.common.xmlparser.ConditionRelation) 

    /**
     * Method addConditionRelation
     * 
     * @param index
     * @param vConditionRelation
     */
    public void addConditionRelation(int index, com.ccssoft.rsas.common.xmlparser.ConditionRelation vConditionRelation)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionRelationList.insertElementAt(vConditionRelation, index);
    } //-- void addConditionRelation(int, com.regaltec.rsas.common.xmlparser.ConditionRelation) 

    /**
     * Method deleteColCount
     */
    public void deleteColCount()
    {
        this._has_colCount= false;
    } //-- void deleteColCount() 

    /**
     * Method enumerateConditionRelation
     */
    public java.util.Enumeration enumerateConditionRelation()
    {
        return _conditionRelationList.elements();
    } //-- java.util.Enumeration enumerateConditionRelation() 

    /**
     * Returns the value of field 'colCount'. The field 'colCount'
     * has the following description: ������Ŀǰֻ����2��������
     * 
     * @return the value of field 'colCount'.
     */
    public int getColCount()
    {
        return this._colCount;
    } //-- int getColCount() 

    /**
     * Returns the value of field 'colScale'. The field 'colScale'
     * has the following description: ����������ռ����������1��1
     * 
     * @return the value of field 'colScale'.
     */
    public java.lang.String getColScale()
    {
        return this._colScale;
    } //-- java.lang.String getColScale() 

    /**
     * Method getConditionRelation
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionRelation getConditionRelation(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionRelationList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ConditionRelation) _conditionRelationList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ConditionRelation getConditionRelation(int) 

    /**
     * Method getConditionRelation
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionRelation[] getConditionRelation()
    {
        int size = _conditionRelationList.size();
        com.ccssoft.rsas.common.xmlparser.ConditionRelation[] mArray = new com.ccssoft.rsas.common.xmlparser.ConditionRelation[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ConditionRelation) _conditionRelationList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionRelation[] getConditionRelation() 

    /**
     * Method getConditionRelationCount
     */
    public int getConditionRelationCount()
    {
        return _conditionRelationList.size();
    } //-- int getConditionRelationCount() 

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
     * Returns the value of field 'heightType'. The field
     * 'heightType' has the following description: �߶����ͣ�����Ӧ���趨�߶�
     * 
     * @return the value of field 'heightType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.PortalHeightTypeType getHeightType()
    {
        return this._heightType;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortalHeightTypeType getHeightType() 

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
     * Returns the value of field 'loginName'.
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
     * Returns the value of field 'PTCategoryID'. The field
     * 'PTCategoryID' has the following description: ģ�����ID
     * 
     * @return the value of field 'PTCategoryID'.
     */
    public java.lang.String getPTCategoryID()
    {
        return this._PTCategoryID;
    } //-- java.lang.String getPTCategoryID() 

    /**
     * Returns the value of field 'portalType'. The field
     * 'portalType' has the following description:
     * portal���ͣ��û����ƣ�����ģ�塢����ģ��
     * 
     * @return the value of field 'portalType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.PortalPortalTypeType getPortalType()
    {
        return this._portalType;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortalPortalTypeType getPortalType() 

    /**
     * Returns the value of field 'portlets'.
     * 
     * @return the value of field 'portlets'.
     */
    public com.ccssoft.rsas.common.xmlparser.Portlets getPortlets()
    {
        return this._portlets;
    } //-- com.regaltec.rsas.common.xmlparser.Portlets getPortlets() 

    /**
     * Method hasColCount
     */
    public boolean hasColCount()
    {
        return this._has_colCount;
    } //-- boolean hasColCount() 

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
     * Method removeAllConditionRelation
     */
    public void removeAllConditionRelation()
    {
        _conditionRelationList.removeAllElements();
    } //-- void removeAllConditionRelation() 

    /**
     * Method removeConditionRelation
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionRelation removeConditionRelation(int index)
    {
        java.lang.Object obj = _conditionRelationList.elementAt(index);
        _conditionRelationList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ConditionRelation) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionRelation removeConditionRelation(int) 

    /**
     * Sets the value of field 'colCount'. The field 'colCount' has
     * the following description: ������Ŀǰֻ����2��������
     * 
     * @param colCount the value of field 'colCount'.
     */
    public void setColCount(int colCount)
    {
        this._colCount = colCount;
        this._has_colCount = true;
    } //-- void setColCount(int) 

    /**
     * Sets the value of field 'colScale'. The field 'colScale' has
     * the following description: ����������ռ����������1��1
     * 
     * @param colScale the value of field 'colScale'.
     */
    public void setColScale(java.lang.String colScale)
    {
        this._colScale = colScale;
    } //-- void setColScale(java.lang.String) 

    /**
     * Method setConditionRelation
     * 
     * @param index
     * @param vConditionRelation
     */
    public void setConditionRelation(int index, com.ccssoft.rsas.common.xmlparser.ConditionRelation vConditionRelation)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionRelationList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _conditionRelationList.setElementAt(vConditionRelation, index);
    } //-- void setConditionRelation(int, com.regaltec.rsas.common.xmlparser.ConditionRelation) 

    /**
     * Method setConditionRelation
     * 
     * @param conditionRelationArray
     */
    public void setConditionRelation(com.ccssoft.rsas.common.xmlparser.ConditionRelation[] conditionRelationArray)
    {
        //-- copy array
        _conditionRelationList.removeAllElements();
        for (int i = 0; i < conditionRelationArray.length; i++) {
            _conditionRelationList.addElement(conditionRelationArray[i]);
        }
    } //-- void setConditionRelation(com.regaltec.rsas.common.xmlparser.ConditionRelation) 

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
     * Sets the value of field 'heightType'. The field 'heightType'
     * has the following description: �߶����ͣ�����Ӧ���趨�߶�
     * 
     * @param heightType the value of field 'heightType'.
     */
    public void setHeightType(com.ccssoft.rsas.common.xmlparser.types.PortalHeightTypeType heightType)
    {
        this._heightType = heightType;
    } //-- void setHeightType(com.regaltec.rsas.common.xmlparser.types.PortalHeightTypeType) 

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
     * Sets the value of field 'loginName'.
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
     * Sets the value of field 'PTCategoryID'. The field
     * 'PTCategoryID' has the following description: ģ�����ID
     * 
     * @param PTCategoryID the value of field 'PTCategoryID'.
     */
    public void setPTCategoryID(java.lang.String PTCategoryID)
    {
        this._PTCategoryID = PTCategoryID;
    } //-- void setPTCategoryID(java.lang.String) 

    /**
     * Sets the value of field 'portalType'. The field 'portalType'
     * has the following description: portal���ͣ��û����ƣ�����ģ�塢����ģ��
     * 
     * @param portalType the value of field 'portalType'.
     */
    public void setPortalType(com.ccssoft.rsas.common.xmlparser.types.PortalPortalTypeType portalType)
    {
        this._portalType = portalType;
    } //-- void setPortalType(com.regaltec.rsas.common.xmlparser.types.PortalPortalTypeType) 

    /**
     * Sets the value of field 'portlets'.
     * 
     * @param portlets the value of field 'portlets'.
     */
    public void setPortlets(com.ccssoft.rsas.common.xmlparser.Portlets portlets)
    {
        this._portlets = portlets;
    } //-- void setPortlets(com.regaltec.rsas.common.xmlparser.Portlets) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Portal) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Portal.class, reader);
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
