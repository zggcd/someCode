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
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * ϵͳ�˵�/ģ�����
 * 
 * @version $Revision$ $Date$
 */
public class SysMenus implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �˵���/ϵͳģ��
     */
    private java.util.Vector _sysMenuItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SysMenus() {
        super();
        _sysMenuItemList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.SysMenus()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSysMenuItem
     * 
     * @param vSysMenuItem
     */
    public void addSysMenuItem(com.ccssoft.rsas.common.xmlparser.SysMenuItem vSysMenuItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _sysMenuItemList.addElement(vSysMenuItem);
    } //-- void addSysMenuItem(com.regaltec.rsas.common.xmlparser.SysMenuItem) 

    /**
     * Method addSysMenuItem
     * 
     * @param index
     * @param vSysMenuItem
     */
    public void addSysMenuItem(int index, com.ccssoft.rsas.common.xmlparser.SysMenuItem vSysMenuItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _sysMenuItemList.insertElementAt(vSysMenuItem, index);
    } //-- void addSysMenuItem(int, com.regaltec.rsas.common.xmlparser.SysMenuItem) 

    /**
     * Method enumerateSysMenuItem
     */
    public java.util.Enumeration enumerateSysMenuItem()
    {
        return _sysMenuItemList.elements();
    } //-- java.util.Enumeration enumerateSysMenuItem() 

    /**
     * Method getSysMenuItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.SysMenuItem getSysMenuItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _sysMenuItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.SysMenuItem) _sysMenuItemList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.SysMenuItem getSysMenuItem(int) 

    /**
     * Method getSysMenuItem
     */
    public com.ccssoft.rsas.common.xmlparser.SysMenuItem[] getSysMenuItem()
    {
        int size = _sysMenuItemList.size();
        com.ccssoft.rsas.common.xmlparser.SysMenuItem[] mArray = new com.ccssoft.rsas.common.xmlparser.SysMenuItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.SysMenuItem) _sysMenuItemList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.SysMenuItem[] getSysMenuItem() 

    /**
     * Method getSysMenuItemCount
     */
    public int getSysMenuItemCount()
    {
        return _sysMenuItemList.size();
    } //-- int getSysMenuItemCount() 

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
     * Method removeAllSysMenuItem
     */
    public void removeAllSysMenuItem()
    {
        _sysMenuItemList.removeAllElements();
    } //-- void removeAllSysMenuItem() 

    /**
     * Method removeSysMenuItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.SysMenuItem removeSysMenuItem(int index)
    {
        java.lang.Object obj = _sysMenuItemList.elementAt(index);
        _sysMenuItemList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.SysMenuItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.SysMenuItem removeSysMenuItem(int) 

    /**
     * Method setSysMenuItem
     * 
     * @param index
     * @param vSysMenuItem
     */
    public void setSysMenuItem(int index, com.ccssoft.rsas.common.xmlparser.SysMenuItem vSysMenuItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _sysMenuItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _sysMenuItemList.setElementAt(vSysMenuItem, index);
    } //-- void setSysMenuItem(int, com.regaltec.rsas.common.xmlparser.SysMenuItem) 

    /**
     * Method setSysMenuItem
     * 
     * @param sysMenuItemArray
     */
    public void setSysMenuItem(com.ccssoft.rsas.common.xmlparser.SysMenuItem[] sysMenuItemArray)
    {
        //-- copy array
        _sysMenuItemList.removeAllElements();
        for (int i = 0; i < sysMenuItemArray.length; i++) {
            _sysMenuItemList.addElement(sysMenuItemArray[i]);
        }
    } //-- void setSysMenuItem(com.regaltec.rsas.common.xmlparser.SysMenuItem) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.SysMenus) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.SysMenus.class, reader);
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
