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
 * Class Permissions.
 * 
 * @version $Revision$ $Date$
 */
public class Permissions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����Ȩ�޷���
     */
    private java.util.Vector _permissionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Permissions() {
        super();
        _permissionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Permissions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPermission
     * 
     * @param vPermission
     */
    public void addPermission(com.ccssoft.rsas.common.xmlparser.Permission vPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        _permissionList.addElement(vPermission);
    } //-- void addPermission(com.regaltec.rsas.common.xmlparser.Permission) 

    /**
     * Method addPermission
     * 
     * @param index
     * @param vPermission
     */
    public void addPermission(int index, com.ccssoft.rsas.common.xmlparser.Permission vPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        _permissionList.insertElementAt(vPermission, index);
    } //-- void addPermission(int, com.regaltec.rsas.common.xmlparser.Permission) 

    /**
     * Method enumeratePermission
     */
    public java.util.Enumeration enumeratePermission()
    {
        return _permissionList.elements();
    } //-- java.util.Enumeration enumeratePermission() 

    /**
     * Method getPermission
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Permission getPermission(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _permissionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Permission) _permissionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Permission getPermission(int) 

    /**
     * Method getPermission
     */
    public com.ccssoft.rsas.common.xmlparser.Permission[] getPermission()
    {
        int size = _permissionList.size();
        com.ccssoft.rsas.common.xmlparser.Permission[] mArray = new com.ccssoft.rsas.common.xmlparser.Permission[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Permission) _permissionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Permission[] getPermission() 

    /**
     * Method getPermissionCount
     */
    public int getPermissionCount()
    {
        return _permissionList.size();
    } //-- int getPermissionCount() 

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
     * Method removeAllPermission
     */
    public void removeAllPermission()
    {
        _permissionList.removeAllElements();
    } //-- void removeAllPermission() 

    /**
     * Method removePermission
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Permission removePermission(int index)
    {
        java.lang.Object obj = _permissionList.elementAt(index);
        _permissionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Permission) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Permission removePermission(int) 

    /**
     * Method setPermission
     * 
     * @param index
     * @param vPermission
     */
    public void setPermission(int index, com.ccssoft.rsas.common.xmlparser.Permission vPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _permissionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _permissionList.setElementAt(vPermission, index);
    } //-- void setPermission(int, com.regaltec.rsas.common.xmlparser.Permission) 

    /**
     * Method setPermission
     * 
     * @param permissionArray
     */
    public void setPermission(com.ccssoft.rsas.common.xmlparser.Permission[] permissionArray)
    {
        //-- copy array
        _permissionList.removeAllElements();
        for (int i = 0; i < permissionArray.length; i++) {
            _permissionList.addElement(permissionArray[i]);
        }
    } //-- void setPermission(com.regaltec.rsas.common.xmlparser.Permission) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Permissions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Permissions.class, reader);
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
