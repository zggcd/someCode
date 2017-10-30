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
 * Class DataPermissions.
 * 
 * @version $Revision$ $Date$
 */
public class DataPermissions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����Ȩ�޷���
     */
    private java.util.Vector _dataPermissionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataPermissions() {
        super();
        _dataPermissionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DataPermissions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDataPermission
     * 
     * @param vDataPermission
     */
    public void addDataPermission(com.ccssoft.rsas.common.xmlparser.DataPermission vDataPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataPermissionList.addElement(vDataPermission);
    } //-- void addDataPermission(com.regaltec.rsas.common.xmlparser.DataPermission) 

    /**
     * Method addDataPermission
     * 
     * @param index
     * @param vDataPermission
     */
    public void addDataPermission(int index, com.ccssoft.rsas.common.xmlparser.DataPermission vDataPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataPermissionList.insertElementAt(vDataPermission, index);
    } //-- void addDataPermission(int, com.regaltec.rsas.common.xmlparser.DataPermission) 

    /**
     * Method enumerateDataPermission
     */
    public java.util.Enumeration enumerateDataPermission()
    {
        return _dataPermissionList.elements();
    } //-- java.util.Enumeration enumerateDataPermission() 

    /**
     * Method getDataPermission
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DataPermission getDataPermission(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataPermissionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DataPermission) _dataPermissionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DataPermission getDataPermission(int) 

    /**
     * Method getDataPermission
     */
    public com.ccssoft.rsas.common.xmlparser.DataPermission[] getDataPermission()
    {
        int size = _dataPermissionList.size();
        com.ccssoft.rsas.common.xmlparser.DataPermission[] mArray = new com.ccssoft.rsas.common.xmlparser.DataPermission[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DataPermission) _dataPermissionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DataPermission[] getDataPermission() 

    /**
     * Method getDataPermissionCount
     */
    public int getDataPermissionCount()
    {
        return _dataPermissionList.size();
    } //-- int getDataPermissionCount() 

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
     * Method removeAllDataPermission
     */
    public void removeAllDataPermission()
    {
        _dataPermissionList.removeAllElements();
    } //-- void removeAllDataPermission() 

    /**
     * Method removeDataPermission
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DataPermission removeDataPermission(int index)
    {
        java.lang.Object obj = _dataPermissionList.elementAt(index);
        _dataPermissionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DataPermission) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DataPermission removeDataPermission(int) 

    /**
     * Method setDataPermission
     * 
     * @param index
     * @param vDataPermission
     */
    public void setDataPermission(int index, com.ccssoft.rsas.common.xmlparser.DataPermission vDataPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataPermissionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dataPermissionList.setElementAt(vDataPermission, index);
    } //-- void setDataPermission(int, com.regaltec.rsas.common.xmlparser.DataPermission) 

    /**
     * Method setDataPermission
     * 
     * @param dataPermissionArray
     */
    public void setDataPermission(com.ccssoft.rsas.common.xmlparser.DataPermission[] dataPermissionArray)
    {
        //-- copy array
        _dataPermissionList.removeAllElements();
        for (int i = 0; i < dataPermissionArray.length; i++) {
            _dataPermissionList.addElement(dataPermissionArray[i]);
        }
    } //-- void setDataPermission(com.regaltec.rsas.common.xmlparser.DataPermission) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DataPermissions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DataPermissions.class, reader);
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
