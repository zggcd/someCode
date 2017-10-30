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

import com.ccssoft.rsas.common.xmlparser.types.SysMenuItemWebAppMatchTypeType;

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
 * �˵���/ϵͳģ��
 * 
 * @version $Revision$ $Date$
 */
public class SysMenuItem implements java.io.Serializable {


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
     * ��¼��URL�������ƣ�Ĭ��Ϊ��loginName
     */
    private java.lang.String _loginNameParam;

    /**
     * ��URL�����ӹ���
     */
    private int _useEmployeeID;

    /**
     * keeps track of state for field: _useEmployeeID
     */
    private boolean _has_useEmployeeID;

    /**
     * URL���Ų������ƣ�Ĭ��Ϊ��employeeID
     */
    private java.lang.String _employeeIDParam;

    /**
     * �����JavaScript�ű����ڵ���˵�ʱ������
     */
    private java.lang.String _javaScript;

    /**
     * ��Ϊ��¼���Ĭ�Ͻ��棬0��Ĭ�ϣ�1Ĭ��
     */
    private short _isDefault;

    /**
     * keeps track of state for field: _isDefault
     */
    private boolean _has_isDefault;

    /**
     * ģ��code
     */
    private java.lang.String _menuItemCode;

    /**
     * �Ƿ�˵���
     */
    private int _isMenu;

    /**
     * keeps track of state for field: _isMenu
     */
    private boolean _has_isMenu;

    /**
     * �Ƿ����ϵͳ
     */
    private int _isOtherSys;

    /**
     * keeps track of state for field: _isOtherSys
     */
    private boolean _has_isOtherSys;

    /**
     * �Ƿ�Ȩ�޿���
     */
    private java.lang.Object _isRightControl;

    /**
     * �ⲿWebϵͳ����ƥ�䷽ʽ���ֱ��У���ƥ�䡢��IP�ĵ�һ�Σ�ǰ���Σ�ǰ���Σ�ȫ�Ρ�ȡ����ƥ����������
     */
    private com.ccssoft.rsas.common.xmlparser.types.SysMenuItemWebAppMatchTypeType _webAppMatchType;

    /**
     * Ĭ��ʹ�õ��ⲿWEBϵͳID��������WebApplication
     */
    private java.lang.String _defaultWebAppID;

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
     * ģ��Ԫ�ض���
     */
    private java.util.Vector _menuItemElementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SysMenuItem() {
        super();
        _menuItemElementList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.SysMenuItem()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMenuItemElement
     * 
     * @param vMenuItemElement
     */
    public void addMenuItemElement(com.ccssoft.rsas.common.xmlparser.MenuItemElement vMenuItemElement)
        throws java.lang.IndexOutOfBoundsException
    {
        _menuItemElementList.addElement(vMenuItemElement);
    } //-- void addMenuItemElement(com.regaltec.rsas.common.xmlparser.MenuItemElement) 

    /**
     * Method addMenuItemElement
     * 
     * @param index
     * @param vMenuItemElement
     */
    public void addMenuItemElement(int index, com.ccssoft.rsas.common.xmlparser.MenuItemElement vMenuItemElement)
        throws java.lang.IndexOutOfBoundsException
    {
        _menuItemElementList.insertElementAt(vMenuItemElement, index);
    } //-- void addMenuItemElement(int, com.regaltec.rsas.common.xmlparser.MenuItemElement) 

    /**
     * Method deleteEnabled
     */
    public void deleteEnabled()
    {
        this._has_enabled= false;
    } //-- void deleteEnabled() 

    /**
     * Method deleteIsDefault
     */
    public void deleteIsDefault()
    {
        this._has_isDefault= false;
    } //-- void deleteIsDefault() 

    /**
     * Method deleteIsMenu
     */
    public void deleteIsMenu()
    {
        this._has_isMenu= false;
    } //-- void deleteIsMenu() 

    /**
     * Method deleteIsOtherSys
     */
    public void deleteIsOtherSys()
    {
        this._has_isOtherSys= false;
    } //-- void deleteIsOtherSys() 

    /**
     * Method deleteItemOrder
     */
    public void deleteItemOrder()
    {
        this._has_itemOrder= false;
    } //-- void deleteItemOrder() 

    /**
     * Method deleteUseEmployeeID
     */
    public void deleteUseEmployeeID()
    {
        this._has_useEmployeeID= false;
    } //-- void deleteUseEmployeeID() 

    /**
     * Method deleteUseLoginName
     */
    public void deleteUseLoginName()
    {
        this._has_useLoginName= false;
    } //-- void deleteUseLoginName() 

    /**
     * Method enumerateMenuItemElement
     */
    public java.util.Enumeration enumerateMenuItemElement()
    {
        return _menuItemElementList.elements();
    } //-- java.util.Enumeration enumerateMenuItemElement() 

    /**
     * Returns the value of field 'defaultWebAppID'. The field
     * 'defaultWebAppID' has the following description:
     * Ĭ��ʹ�õ��ⲿWEBϵͳID��������WebApplication
     * 
     * @return the value of field 'defaultWebAppID'.
     */
    public java.lang.String getDefaultWebAppID()
    {
        return this._defaultWebAppID;
    } //-- java.lang.String getDefaultWebAppID() 

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
     * Returns the value of field 'employeeIDParam'. The field
     * 'employeeIDParam' has the following description:
     * URL���Ų������ƣ�Ĭ��Ϊ��employeeID
     * 
     * @return the value of field 'employeeIDParam'.
     */
    public java.lang.String getEmployeeIDParam()
    {
        return this._employeeIDParam;
    } //-- java.lang.String getEmployeeIDParam() 

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
     * Returns the value of field 'isDefault'. The field
     * 'isDefault' has the following description:
     * ��Ϊ��¼���Ĭ�Ͻ��棬0��Ĭ�ϣ�1Ĭ��
     * 
     * @return the value of field 'isDefault'.
     */
    public short getIsDefault()
    {
        return this._isDefault;
    } //-- short getIsDefault() 

    /**
     * Returns the value of field 'isMenu'. The field 'isMenu' has
     * the following description: �Ƿ�˵���
     * 
     * @return the value of field 'isMenu'.
     */
    public int getIsMenu()
    {
        return this._isMenu;
    } //-- int getIsMenu() 

    /**
     * Returns the value of field 'isOtherSys'. The field
     * 'isOtherSys' has the following description: �Ƿ����ϵͳ
     * 
     * @return the value of field 'isOtherSys'.
     */
    public int getIsOtherSys()
    {
        return this._isOtherSys;
    } //-- int getIsOtherSys() 

    /**
     * Returns the value of field 'isRightControl'. The field
     * 'isRightControl' has the following description: �Ƿ�Ȩ�޿���
     * 
     * @return the value of field 'isRightControl'.
     */
    public java.lang.Object getIsRightControl()
    {
        return this._isRightControl;
    } //-- java.lang.Object getIsRightControl() 

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
     * Returns the value of field 'loginNameParam'. The field
     * 'loginNameParam' has the following description:
     * ��¼��URL�������ƣ�Ĭ��Ϊ��loginName
     * 
     * @return the value of field 'loginNameParam'.
     */
    public java.lang.String getLoginNameParam()
    {
        return this._loginNameParam;
    } //-- java.lang.String getLoginNameParam() 

    /**
     * Returns the value of field 'menuItemCode'. The field
     * 'menuItemCode' has the following description: ģ��code
     * 
     * @return the value of field 'menuItemCode'.
     */
    public java.lang.String getMenuItemCode()
    {
        return this._menuItemCode;
    } //-- java.lang.String getMenuItemCode() 

    /**
     * Method getMenuItemElement
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MenuItemElement getMenuItemElement(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _menuItemElementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MenuItemElement) _menuItemElementList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MenuItemElement getMenuItemElement(int) 

    /**
     * Method getMenuItemElement
     */
    public com.ccssoft.rsas.common.xmlparser.MenuItemElement[] getMenuItemElement()
    {
        int size = _menuItemElementList.size();
        com.ccssoft.rsas.common.xmlparser.MenuItemElement[] mArray = new com.ccssoft.rsas.common.xmlparser.MenuItemElement[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MenuItemElement) _menuItemElementList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MenuItemElement[] getMenuItemElement() 

    /**
     * Method getMenuItemElementCount
     */
    public int getMenuItemElementCount()
    {
        return _menuItemElementList.size();
    } //-- int getMenuItemElementCount() 

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
     * Returns the value of field 'useEmployeeID'. The field
     * 'useEmployeeID' has the following description: ��URL�����ӹ���
     * 
     * @return the value of field 'useEmployeeID'.
     */
    public int getUseEmployeeID()
    {
        return this._useEmployeeID;
    } //-- int getUseEmployeeID() 

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
     * Returns the value of field 'webAppMatchType'. The field
     * 'webAppMatchType' has the following description:
     * �ⲿWebϵͳ����ƥ�䷽ʽ���ֱ��У���ƥ�䡢��IP�ĵ�һ�Σ�ǰ���Σ�ǰ���Σ�ȫ�Ρ�ȡ����ƥ����������
     * 
     * @return the value of field 'webAppMatchType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.SysMenuItemWebAppMatchTypeType getWebAppMatchType()
    {
        return this._webAppMatchType;
    } //-- com.regaltec.rsas.common.xmlparser.types.SysMenuItemWebAppMatchTypeType getWebAppMatchType() 

    /**
     * Method hasEnabled
     */
    public boolean hasEnabled()
    {
        return this._has_enabled;
    } //-- boolean hasEnabled() 

    /**
     * Method hasIsDefault
     */
    public boolean hasIsDefault()
    {
        return this._has_isDefault;
    } //-- boolean hasIsDefault() 

    /**
     * Method hasIsMenu
     */
    public boolean hasIsMenu()
    {
        return this._has_isMenu;
    } //-- boolean hasIsMenu() 

    /**
     * Method hasIsOtherSys
     */
    public boolean hasIsOtherSys()
    {
        return this._has_isOtherSys;
    } //-- boolean hasIsOtherSys() 

    /**
     * Method hasItemOrder
     */
    public boolean hasItemOrder()
    {
        return this._has_itemOrder;
    } //-- boolean hasItemOrder() 

    /**
     * Method hasUseEmployeeID
     */
    public boolean hasUseEmployeeID()
    {
        return this._has_useEmployeeID;
    } //-- boolean hasUseEmployeeID() 

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
     * Method removeAllMenuItemElement
     */
    public void removeAllMenuItemElement()
    {
        _menuItemElementList.removeAllElements();
    } //-- void removeAllMenuItemElement() 

    /**
     * Method removeMenuItemElement
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MenuItemElement removeMenuItemElement(int index)
    {
        java.lang.Object obj = _menuItemElementList.elementAt(index);
        _menuItemElementList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MenuItemElement) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MenuItemElement removeMenuItemElement(int) 

    /**
     * Sets the value of field 'defaultWebAppID'. The field
     * 'defaultWebAppID' has the following description:
     * Ĭ��ʹ�õ��ⲿWEBϵͳID��������WebApplication
     * 
     * @param defaultWebAppID the value of field 'defaultWebAppID'.
     */
    public void setDefaultWebAppID(java.lang.String defaultWebAppID)
    {
        this._defaultWebAppID = defaultWebAppID;
    } //-- void setDefaultWebAppID(java.lang.String) 

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
     * Sets the value of field 'employeeIDParam'. The field
     * 'employeeIDParam' has the following description:
     * URL���Ų������ƣ�Ĭ��Ϊ��employeeID
     * 
     * @param employeeIDParam the value of field 'employeeIDParam'.
     */
    public void setEmployeeIDParam(java.lang.String employeeIDParam)
    {
        this._employeeIDParam = employeeIDParam;
    } //-- void setEmployeeIDParam(java.lang.String) 

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
     * Sets the value of field 'isDefault'. The field 'isDefault'
     * has the following description: ��Ϊ��¼���Ĭ�Ͻ��棬0��Ĭ�ϣ�1Ĭ��
     * 
     * @param isDefault the value of field 'isDefault'.
     */
    public void setIsDefault(short isDefault)
    {
        this._isDefault = isDefault;
        this._has_isDefault = true;
    } //-- void setIsDefault(short) 

    /**
     * Sets the value of field 'isMenu'. The field 'isMenu' has the
     * following description: �Ƿ�˵���
     * 
     * @param isMenu the value of field 'isMenu'.
     */
    public void setIsMenu(int isMenu)
    {
        this._isMenu = isMenu;
        this._has_isMenu = true;
    } //-- void setIsMenu(int) 

    /**
     * Sets the value of field 'isOtherSys'. The field 'isOtherSys'
     * has the following description: �Ƿ����ϵͳ
     * 
     * @param isOtherSys the value of field 'isOtherSys'.
     */
    public void setIsOtherSys(int isOtherSys)
    {
        this._isOtherSys = isOtherSys;
        this._has_isOtherSys = true;
    } //-- void setIsOtherSys(int) 

    /**
     * Sets the value of field 'isRightControl'. The field
     * 'isRightControl' has the following description: �Ƿ�Ȩ�޿���
     * 
     * @param isRightControl the value of field 'isRightControl'.
     */
    public void setIsRightControl(java.lang.Object isRightControl)
    {
        this._isRightControl = isRightControl;
    } //-- void setIsRightControl(java.lang.Object) 

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
     * Sets the value of field 'loginNameParam'. The field
     * 'loginNameParam' has the following description:
     * ��¼��URL�������ƣ�Ĭ��Ϊ��loginName
     * 
     * @param loginNameParam the value of field 'loginNameParam'.
     */
    public void setLoginNameParam(java.lang.String loginNameParam)
    {
        this._loginNameParam = loginNameParam;
    } //-- void setLoginNameParam(java.lang.String) 

    /**
     * Sets the value of field 'menuItemCode'. The field
     * 'menuItemCode' has the following description: ģ��code
     * 
     * @param menuItemCode the value of field 'menuItemCode'.
     */
    public void setMenuItemCode(java.lang.String menuItemCode)
    {
        this._menuItemCode = menuItemCode;
    } //-- void setMenuItemCode(java.lang.String) 

    /**
     * Method setMenuItemElement
     * 
     * @param index
     * @param vMenuItemElement
     */
    public void setMenuItemElement(int index, com.ccssoft.rsas.common.xmlparser.MenuItemElement vMenuItemElement)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _menuItemElementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _menuItemElementList.setElementAt(vMenuItemElement, index);
    } //-- void setMenuItemElement(int, com.regaltec.rsas.common.xmlparser.MenuItemElement) 

    /**
     * Method setMenuItemElement
     * 
     * @param menuItemElementArray
     */
    public void setMenuItemElement(com.ccssoft.rsas.common.xmlparser.MenuItemElement[] menuItemElementArray)
    {
        //-- copy array
        _menuItemElementList.removeAllElements();
        for (int i = 0; i < menuItemElementArray.length; i++) {
            _menuItemElementList.addElement(menuItemElementArray[i]);
        }
    } //-- void setMenuItemElement(com.regaltec.rsas.common.xmlparser.MenuItemElement) 

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
     * Sets the value of field 'useEmployeeID'. The field
     * 'useEmployeeID' has the following description: ��URL�����ӹ���
     * 
     * @param useEmployeeID the value of field 'useEmployeeID'.
     */
    public void setUseEmployeeID(int useEmployeeID)
    {
        this._useEmployeeID = useEmployeeID;
        this._has_useEmployeeID = true;
    } //-- void setUseEmployeeID(int) 

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
     * Sets the value of field 'webAppMatchType'. The field
     * 'webAppMatchType' has the following description:
     * �ⲿWebϵͳ����ƥ�䷽ʽ���ֱ��У���ƥ�䡢��IP�ĵ�һ�Σ�ǰ���Σ�ǰ���Σ�ȫ�Ρ�ȡ����ƥ����������
     * 
     * @param webAppMatchType the value of field 'webAppMatchType'.
     */
    public void setWebAppMatchType(com.ccssoft.rsas.common.xmlparser.types.SysMenuItemWebAppMatchTypeType webAppMatchType)
    {
        this._webAppMatchType = webAppMatchType;
    } //-- void setWebAppMatchType(com.regaltec.rsas.common.xmlparser.types.SysMenuItemWebAppMatchTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.SysMenuItem) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.SysMenuItem.class, reader);
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
