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
 * ָ��Ŀ¼
 * 
 * @version $Revision$ $Date$
 */
public class IndicatorCategory implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _treeCode
     */
    private java.lang.String _treeCode;

    /**
     * Field _parentID
     */
    private java.lang.String _parentID;

    /**
     * Ŀ¼��������
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
     * Field _indicatorCategorys
     */
    private com.ccssoft.rsas.common.xmlparser.IndicatorCategorys _indicatorCategorys;

    /**
     * Field _indicators
     */
    private com.ccssoft.rsas.common.xmlparser.Indicators _indicators;

    /**
     * Field _publicConditions
     */
    private com.ccssoft.rsas.common.xmlparser.PublicConditions _publicConditions;


      //----------------/
     //- Constructors -/
    //----------------/

    public IndicatorCategory() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorCategory()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteItemOrder
     */
    public void deleteItemOrder()
    {
        this._has_itemOrder= false;
    } //-- void deleteItemOrder() 

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
     * Returns the value of field 'indicatorCategorys'.
     * 
     * @return the value of field 'indicatorCategorys'.
     */
    public com.ccssoft.rsas.common.xmlparser.IndicatorCategorys getIndicatorCategorys()
    {
        return this._indicatorCategorys;
    } //-- com.regaltec.rsas.common.xmlparser.IndicatorCategorys getIndicatorCategorys() 

    /**
     * Returns the value of field 'indicators'.
     * 
     * @return the value of field 'indicators'.
     */
    public com.ccssoft.rsas.common.xmlparser.Indicators getIndicators()
    {
        return this._indicators;
    } //-- com.regaltec.rsas.common.xmlparser.Indicators getIndicators() 

    /**
     * Returns the value of field 'itemOrder'. The field
     * 'itemOrder' has the following description: Ŀ¼��������
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
     * Returns the value of field 'parentID'.
     * 
     * @return the value of field 'parentID'.
     */
    public java.lang.String getParentID()
    {
        return this._parentID;
    } //-- java.lang.String getParentID() 

    /**
     * Returns the value of field 'publicConditions'.
     * 
     * @return the value of field 'publicConditions'.
     */
    public com.ccssoft.rsas.common.xmlparser.PublicConditions getPublicConditions()
    {
        return this._publicConditions;
    } //-- com.regaltec.rsas.common.xmlparser.PublicConditions getPublicConditions() 

    /**
     * Returns the value of field 'treeCode'.
     * 
     * @return the value of field 'treeCode'.
     */
    public java.lang.String getTreeCode()
    {
        return this._treeCode;
    } //-- java.lang.String getTreeCode() 

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
     * Sets the value of field 'indicatorCategorys'.
     * 
     * @param indicatorCategorys the value of field
     * 'indicatorCategorys'.
     */
    public void setIndicatorCategorys(com.ccssoft.rsas.common.xmlparser.IndicatorCategorys indicatorCategorys)
    {
        this._indicatorCategorys = indicatorCategorys;
    } //-- void setIndicatorCategorys(com.regaltec.rsas.common.xmlparser.IndicatorCategorys) 

    /**
     * Sets the value of field 'indicators'.
     * 
     * @param indicators the value of field 'indicators'.
     */
    public void setIndicators(com.ccssoft.rsas.common.xmlparser.Indicators indicators)
    {
        this._indicators = indicators;
    } //-- void setIndicators(com.regaltec.rsas.common.xmlparser.Indicators) 

    /**
     * Sets the value of field 'itemOrder'. The field 'itemOrder'
     * has the following description: Ŀ¼��������
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
     * Sets the value of field 'parentID'.
     * 
     * @param parentID the value of field 'parentID'.
     */
    public void setParentID(java.lang.String parentID)
    {
        this._parentID = parentID;
    } //-- void setParentID(java.lang.String) 

    /**
     * Sets the value of field 'publicConditions'.
     * 
     * @param publicConditions the value of field 'publicConditions'
     */
    public void setPublicConditions(com.ccssoft.rsas.common.xmlparser.PublicConditions publicConditions)
    {
        this._publicConditions = publicConditions;
    } //-- void setPublicConditions(com.regaltec.rsas.common.xmlparser.PublicConditions) 

    /**
     * Sets the value of field 'treeCode'.
     * 
     * @param treeCode the value of field 'treeCode'.
     */
    public void setTreeCode(java.lang.String treeCode)
    {
        this._treeCode = treeCode;
    } //-- void setTreeCode(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.IndicatorCategory) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.IndicatorCategory.class, reader);
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
