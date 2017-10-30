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
 * Portalģ�����
 * 
 * @version $Revision$ $Date$
 */
public class PTCategory implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _parentID
     */
    private java.lang.String _parentID;

    /**
     * Field _treecode
     */
    private java.lang.String _treecode;

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
     * Field _portals
     */
    private com.ccssoft.rsas.common.xmlparser.Portals _portals;

    /**
     * Field _portletContents
     */
    private com.ccssoft.rsas.common.xmlparser.PortletContents _portletContents;

    /**
     * Field _PTCategorys
     */
    private com.ccssoft.rsas.common.xmlparser.PTCategorys _PTCategorys;


      //----------------/
     //- Constructors -/
    //----------------/

    public PTCategory() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.PTCategory()


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
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'PTCategorys'.
     * 
     * @return the value of field 'PTCategorys'.
     */
    public com.ccssoft.rsas.common.xmlparser.PTCategorys getPTCategorys()
    {
        return this._PTCategorys;
    } //-- com.regaltec.rsas.common.xmlparser.PTCategorys getPTCategorys() 

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
     * Returns the value of field 'portals'.
     * 
     * @return the value of field 'portals'.
     */
    public com.ccssoft.rsas.common.xmlparser.Portals getPortals()
    {
        return this._portals;
    } //-- com.regaltec.rsas.common.xmlparser.Portals getPortals() 

    /**
     * Returns the value of field 'portletContents'.
     * 
     * @return the value of field 'portletContents'.
     */
    public com.ccssoft.rsas.common.xmlparser.PortletContents getPortletContents()
    {
        return this._portletContents;
    } //-- com.regaltec.rsas.common.xmlparser.PortletContents getPortletContents() 

    /**
     * Returns the value of field 'treecode'.
     * 
     * @return the value of field 'treecode'.
     */
    public java.lang.String getTreecode()
    {
        return this._treecode;
    } //-- java.lang.String getTreecode() 

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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'PTCategorys'.
     * 
     * @param PTCategorys the value of field 'PTCategorys'.
     */
    public void setPTCategorys(com.ccssoft.rsas.common.xmlparser.PTCategorys PTCategorys)
    {
        this._PTCategorys = PTCategorys;
    } //-- void setPTCategorys(com.regaltec.rsas.common.xmlparser.PTCategorys) 

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
     * Sets the value of field 'portals'.
     * 
     * @param portals the value of field 'portals'.
     */
    public void setPortals(com.ccssoft.rsas.common.xmlparser.Portals portals)
    {
        this._portals = portals;
    } //-- void setPortals(com.regaltec.rsas.common.xmlparser.Portals) 

    /**
     * Sets the value of field 'portletContents'.
     * 
     * @param portletContents the value of field 'portletContents'.
     */
    public void setPortletContents(com.ccssoft.rsas.common.xmlparser.PortletContents portletContents)
    {
        this._portletContents = portletContents;
    } //-- void setPortletContents(com.regaltec.rsas.common.xmlparser.PortletContents) 

    /**
     * Sets the value of field 'treecode'.
     * 
     * @param treecode the value of field 'treecode'.
     */
    public void setTreecode(java.lang.String treecode)
    {
        this._treecode = treecode;
    } //-- void setTreecode(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PTCategory) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PTCategory.class, reader);
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
