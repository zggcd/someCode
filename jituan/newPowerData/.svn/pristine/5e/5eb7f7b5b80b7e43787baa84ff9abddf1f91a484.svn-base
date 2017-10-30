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
 * Class OperPermissions.
 * 
 * @version $Revision$ $Date$
 */
public class OperPermissions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����Ȩ�޷���
     */
    private java.util.Vector _operPermissionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public OperPermissions() {
        super();
        _operPermissionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.OperPermissions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOperPermission
     * 
     * @param vOperPermission
     */
    public void addOperPermission(com.ccssoft.rsas.common.xmlparser.OperPermission vOperPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        _operPermissionList.addElement(vOperPermission);
    } //-- void addOperPermission(com.regaltec.rsas.common.xmlparser.OperPermission) 

    /**
     * Method addOperPermission
     * 
     * @param index
     * @param vOperPermission
     */
    public void addOperPermission(int index, com.ccssoft.rsas.common.xmlparser.OperPermission vOperPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        _operPermissionList.insertElementAt(vOperPermission, index);
    } //-- void addOperPermission(int, com.regaltec.rsas.common.xmlparser.OperPermission) 

    /**
     * Method enumerateOperPermission
     */
    public java.util.Enumeration enumerateOperPermission()
    {
        return _operPermissionList.elements();
    } //-- java.util.Enumeration enumerateOperPermission() 

    /**
     * Method getOperPermission
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.OperPermission getOperPermission(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _operPermissionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.OperPermission) _operPermissionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.OperPermission getOperPermission(int) 

    /**
     * Method getOperPermission
     */
    public com.ccssoft.rsas.common.xmlparser.OperPermission[] getOperPermission()
    {
        int size = _operPermissionList.size();
        com.ccssoft.rsas.common.xmlparser.OperPermission[] mArray = new com.ccssoft.rsas.common.xmlparser.OperPermission[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.OperPermission) _operPermissionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.OperPermission[] getOperPermission() 

    /**
     * Method getOperPermissionCount
     */
    public int getOperPermissionCount()
    {
        return _operPermissionList.size();
    } //-- int getOperPermissionCount() 

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
     * Method removeAllOperPermission
     */
    public void removeAllOperPermission()
    {
        _operPermissionList.removeAllElements();
    } //-- void removeAllOperPermission() 

    /**
     * Method removeOperPermission
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.OperPermission removeOperPermission(int index)
    {
        java.lang.Object obj = _operPermissionList.elementAt(index);
        _operPermissionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.OperPermission) obj;
    } //-- com.regaltec.rsas.common.xmlparser.OperPermission removeOperPermission(int) 

    /**
     * Method setOperPermission
     * 
     * @param index
     * @param vOperPermission
     */
    public void setOperPermission(int index, com.ccssoft.rsas.common.xmlparser.OperPermission vOperPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _operPermissionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _operPermissionList.setElementAt(vOperPermission, index);
    } //-- void setOperPermission(int, com.regaltec.rsas.common.xmlparser.OperPermission) 

    /**
     * Method setOperPermission
     * 
     * @param operPermissionArray
     */
    public void setOperPermission(com.ccssoft.rsas.common.xmlparser.OperPermission[] operPermissionArray)
    {
        //-- copy array
        _operPermissionList.removeAllElements();
        for (int i = 0; i < operPermissionArray.length; i++) {
            _operPermissionList.addElement(operPermissionArray[i]);
        }
    } //-- void setOperPermission(com.regaltec.rsas.common.xmlparser.OperPermission) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.OperPermissions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.OperPermissions.class, reader);
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
