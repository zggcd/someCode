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
 * Class PermissionGroups.
 * 
 * @version $Revision$ $Date$
 */
public class PermissionGroups implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Ȩ����(��ɫ)
     */
    private java.util.Vector _permissionGroupList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PermissionGroups() {
        super();
        _permissionGroupList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.PermissionGroups()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPermissionGroup
     * 
     * @param vPermissionGroup
     */
    public void addPermissionGroup(com.ccssoft.rsas.common.xmlparser.PermissionGroup vPermissionGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        _permissionGroupList.addElement(vPermissionGroup);
    } //-- void addPermissionGroup(com.regaltec.rsas.common.xmlparser.PermissionGroup) 

    /**
     * Method addPermissionGroup
     * 
     * @param index
     * @param vPermissionGroup
     */
    public void addPermissionGroup(int index, com.ccssoft.rsas.common.xmlparser.PermissionGroup vPermissionGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        _permissionGroupList.insertElementAt(vPermissionGroup, index);
    } //-- void addPermissionGroup(int, com.regaltec.rsas.common.xmlparser.PermissionGroup) 

    /**
     * Method enumeratePermissionGroup
     */
    public java.util.Enumeration enumeratePermissionGroup()
    {
        return _permissionGroupList.elements();
    } //-- java.util.Enumeration enumeratePermissionGroup() 

    /**
     * Method getPermissionGroup
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PermissionGroup getPermissionGroup(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _permissionGroupList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.PermissionGroup) _permissionGroupList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.PermissionGroup getPermissionGroup(int) 

    /**
     * Method getPermissionGroup
     */
    public com.ccssoft.rsas.common.xmlparser.PermissionGroup[] getPermissionGroup()
    {
        int size = _permissionGroupList.size();
        com.ccssoft.rsas.common.xmlparser.PermissionGroup[] mArray = new com.ccssoft.rsas.common.xmlparser.PermissionGroup[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.PermissionGroup) _permissionGroupList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.PermissionGroup[] getPermissionGroup() 

    /**
     * Method getPermissionGroupCount
     */
    public int getPermissionGroupCount()
    {
        return _permissionGroupList.size();
    } //-- int getPermissionGroupCount() 

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
     * Method removeAllPermissionGroup
     */
    public void removeAllPermissionGroup()
    {
        _permissionGroupList.removeAllElements();
    } //-- void removeAllPermissionGroup() 

    /**
     * Method removePermissionGroup
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PermissionGroup removePermissionGroup(int index)
    {
        java.lang.Object obj = _permissionGroupList.elementAt(index);
        _permissionGroupList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.PermissionGroup) obj;
    } //-- com.regaltec.rsas.common.xmlparser.PermissionGroup removePermissionGroup(int) 

    /**
     * Method setPermissionGroup
     * 
     * @param index
     * @param vPermissionGroup
     */
    public void setPermissionGroup(int index, com.ccssoft.rsas.common.xmlparser.PermissionGroup vPermissionGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _permissionGroupList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _permissionGroupList.setElementAt(vPermissionGroup, index);
    } //-- void setPermissionGroup(int, com.regaltec.rsas.common.xmlparser.PermissionGroup) 

    /**
     * Method setPermissionGroup
     * 
     * @param permissionGroupArray
     */
    public void setPermissionGroup(com.ccssoft.rsas.common.xmlparser.PermissionGroup[] permissionGroupArray)
    {
        //-- copy array
        _permissionGroupList.removeAllElements();
        for (int i = 0; i < permissionGroupArray.length; i++) {
            _permissionGroupList.addElement(permissionGroupArray[i]);
        }
    } //-- void setPermissionGroup(com.regaltec.rsas.common.xmlparser.PermissionGroup) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PermissionGroups) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PermissionGroups.class, reader);
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
