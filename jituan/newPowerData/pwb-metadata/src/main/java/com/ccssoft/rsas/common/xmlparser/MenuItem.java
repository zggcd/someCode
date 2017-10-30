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
 * �˵���
 * 
 * @version $Revision$ $Date$
 */
public class MenuItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �ϼ��˵���ID������˵����ϼ�IDΪnull
     */
    private java.lang.String _parentID;

    /**
     * �˵���ָ��URL
     */
    private java.lang.String _URL;

    /**
     * ͬ���˵���������ǣ����ۺ����������ʹ�ø�������������
     */
    private int _itemOrder;

    /**
     * keeps track of state for field: _itemOrder
     */
    private boolean _has_itemOrder;

    /**
     * �˵�ͼ����ʽ
     */
    private java.lang.String _iconCls;

    /**
     * �˵��Ƿ����
     */
    private int _enabled;

    /**
     * keeps track of state for field: _enabled
     */
    private boolean _has_enabled;

    /**
     * �Ƿ���ӵ�¼����URL����Ϊ������
     */
    private int _useLoginName;

    /**
     * keeps track of state for field: _useLoginName
     */
    private boolean _has_useLoginName;

    /**
     * �����JavaScript�ű����ڵ���˵�ʱ������
     */
    private java.lang.String _javaScript;

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


      //----------------/
     //- Constructors -/
    //----------------/

    public MenuItem() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.MenuItem()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteEnabled
     */
    public void deleteEnabled()
    {
        this._has_enabled= false;
    } //-- void deleteEnabled() 

    /**
     * Method deleteItemOrder
     */
    public void deleteItemOrder()
    {
        this._has_itemOrder= false;
    } //-- void deleteItemOrder() 

    /**
     * Method deleteUseLoginName
     */
    public void deleteUseLoginName()
    {
        this._has_useLoginName= false;
    } //-- void deleteUseLoginName() 

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
     * Returns the value of field 'enabled'. The field 'enabled'
     * has the following description: �˵��Ƿ����
     * 
     * @return the value of field 'enabled'.
     */
    public int getEnabled()
    {
        return this._enabled;
    } //-- int getEnabled() 

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
     * Returns the value of field 'iconCls'. The field 'iconCls'
     * has the following description: �˵�ͼ����ʽ
     * 
     * @return the value of field 'iconCls'.
     */
    public java.lang.String getIconCls()
    {
        return this._iconCls;
    } //-- java.lang.String getIconCls() 

    /**
     * Returns the value of field 'itemOrder'. The field
     * 'itemOrder' has the following description:
     * ͬ���˵���������ǣ����ۺ����������ʹ�ø�������������
     * 
     * @return the value of field 'itemOrder'.
     */
    public int getItemOrder()
    {
        return this._itemOrder;
    } //-- int getItemOrder() 

    /**
     * Returns the value of field 'javaScript'. The field
     * 'javaScript' has the following description:
     * �����JavaScript�ű����ڵ���˵�ʱ������
     * 
     * @return the value of field 'javaScript'.
     */
    public java.lang.String getJavaScript()
    {
        return this._javaScript;
    } //-- java.lang.String getJavaScript() 

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
     * Returns the value of field 'parentID'. The field 'parentID'
     * has the following description: �ϼ��˵���ID������˵����ϼ�IDΪnull
     * 
     * @return the value of field 'parentID'.
     */
    public java.lang.String getParentID()
    {
        return this._parentID;
    } //-- java.lang.String getParentID() 

    /**
     * Returns the value of field 'URL'. The field 'URL' has the
     * following description: �˵���ָ��URL
     * 
     * @return the value of field 'URL'.
     */
    public java.lang.String getURL()
    {
        return this._URL;
    } //-- java.lang.String getURL() 

    /**
     * Returns the value of field 'useLoginName'. The field
     * 'useLoginName' has the following description:
     * �Ƿ���ӵ�¼����URL����Ϊ������
     * 
     * @return the value of field 'useLoginName'.
     */
    public int getUseLoginName()
    {
        return this._useLoginName;
    } //-- int getUseLoginName() 

    /**
     * Method hasEnabled
     */
    public boolean hasEnabled()
    {
        return this._has_enabled;
    } //-- boolean hasEnabled() 

    /**
     * Method hasItemOrder
     */
    public boolean hasItemOrder()
    {
        return this._has_itemOrder;
    } //-- boolean hasItemOrder() 

    /**
     * Method hasUseLoginName
     */
    public boolean hasUseLoginName()
    {
        return this._has_useLoginName;
    } //-- boolean hasUseLoginName() 

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
     * Sets the value of field 'enabled'. The field 'enabled' has
     * the following description: �˵��Ƿ����
     * 
     * @param enabled the value of field 'enabled'.
     */
    public void setEnabled(int enabled)
    {
        this._enabled = enabled;
        this._has_enabled = true;
    } //-- void setEnabled(int) 

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
     * Sets the value of field 'iconCls'. The field 'iconCls' has
     * the following description: �˵�ͼ����ʽ
     * 
     * @param iconCls the value of field 'iconCls'.
     */
    public void setIconCls(java.lang.String iconCls)
    {
        this._iconCls = iconCls;
    } //-- void setIconCls(java.lang.String) 

    /**
     * Sets the value of field 'itemOrder'. The field 'itemOrder'
     * has the following description:
     * ͬ���˵���������ǣ����ۺ����������ʹ�ø�������������
     * 
     * @param itemOrder the value of field 'itemOrder'.
     */
    public void setItemOrder(int itemOrder)
    {
        this._itemOrder = itemOrder;
        this._has_itemOrder = true;
    } //-- void setItemOrder(int) 

    /**
     * Sets the value of field 'javaScript'. The field 'javaScript'
     * has the following description: �����JavaScript�ű����ڵ���˵�ʱ������
     * 
     * @param javaScript the value of field 'javaScript'.
     */
    public void setJavaScript(java.lang.String javaScript)
    {
        this._javaScript = javaScript;
    } //-- void setJavaScript(java.lang.String) 

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
     * Sets the value of field 'parentID'. The field 'parentID' has
     * the following description: �ϼ��˵���ID������˵����ϼ�IDΪnull
     * 
     * @param parentID the value of field 'parentID'.
     */
    public void setParentID(java.lang.String parentID)
    {
        this._parentID = parentID;
    } //-- void setParentID(java.lang.String) 

    /**
     * Sets the value of field 'URL'. The field 'URL' has the
     * following description: �˵���ָ��URL
     * 
     * @param URL the value of field 'URL'.
     */
    public void setURL(java.lang.String URL)
    {
        this._URL = URL;
    } //-- void setURL(java.lang.String) 

    /**
     * Sets the value of field 'useLoginName'. The field
     * 'useLoginName' has the following description:
     * �Ƿ���ӵ�¼����URL����Ϊ������
     * 
     * @param useLoginName the value of field 'useLoginName'.
     */
    public void setUseLoginName(int useLoginName)
    {
        this._useLoginName = useLoginName;
        this._has_useLoginName = true;
    } //-- void setUseLoginName(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MenuItem) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MenuItem.class, reader);
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
