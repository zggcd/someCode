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
 * Class DimItemPermissions.
 * 
 * @version $Revision$ $Date$
 */
public class DimItemPermissions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��(��ѡ��)Ȩ��
     */
    private java.util.Vector _dimItemPermissionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DimItemPermissions() {
        super();
        _dimItemPermissionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DimItemPermissions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDimItemPermission
     * 
     * @param vDimItemPermission
     */
    public void addDimItemPermission(com.ccssoft.rsas.common.xmlparser.DimItemPermission vDimItemPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimItemPermissionList.addElement(vDimItemPermission);
    } //-- void addDimItemPermission(com.regaltec.rsas.common.xmlparser.DimItemPermission) 

    /**
     * Method addDimItemPermission
     * 
     * @param index
     * @param vDimItemPermission
     */
    public void addDimItemPermission(int index, com.ccssoft.rsas.common.xmlparser.DimItemPermission vDimItemPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimItemPermissionList.insertElementAt(vDimItemPermission, index);
    } //-- void addDimItemPermission(int, com.regaltec.rsas.common.xmlparser.DimItemPermission) 

    /**
     * Method enumerateDimItemPermission
     */
    public java.util.Enumeration enumerateDimItemPermission()
    {
        return _dimItemPermissionList.elements();
    } //-- java.util.Enumeration enumerateDimItemPermission() 

    /**
     * Method getDimItemPermission
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimItemPermission getDimItemPermission(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimItemPermissionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DimItemPermission) _dimItemPermissionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DimItemPermission getDimItemPermission(int) 

    /**
     * Method getDimItemPermission
     */
    public com.ccssoft.rsas.common.xmlparser.DimItemPermission[] getDimItemPermission()
    {
        int size = _dimItemPermissionList.size();
        com.ccssoft.rsas.common.xmlparser.DimItemPermission[] mArray = new com.ccssoft.rsas.common.xmlparser.DimItemPermission[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DimItemPermission) _dimItemPermissionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DimItemPermission[] getDimItemPermission() 

    /**
     * Method getDimItemPermissionCount
     */
    public int getDimItemPermissionCount()
    {
        return _dimItemPermissionList.size();
    } //-- int getDimItemPermissionCount() 

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
     * Method removeAllDimItemPermission
     */
    public void removeAllDimItemPermission()
    {
        _dimItemPermissionList.removeAllElements();
    } //-- void removeAllDimItemPermission() 

    /**
     * Method removeDimItemPermission
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimItemPermission removeDimItemPermission(int index)
    {
        java.lang.Object obj = _dimItemPermissionList.elementAt(index);
        _dimItemPermissionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DimItemPermission) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DimItemPermission removeDimItemPermission(int) 

    /**
     * Method setDimItemPermission
     * 
     * @param index
     * @param vDimItemPermission
     */
    public void setDimItemPermission(int index, com.ccssoft.rsas.common.xmlparser.DimItemPermission vDimItemPermission)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimItemPermissionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dimItemPermissionList.setElementAt(vDimItemPermission, index);
    } //-- void setDimItemPermission(int, com.regaltec.rsas.common.xmlparser.DimItemPermission) 

    /**
     * Method setDimItemPermission
     * 
     * @param dimItemPermissionArray
     */
    public void setDimItemPermission(com.ccssoft.rsas.common.xmlparser.DimItemPermission[] dimItemPermissionArray)
    {
        //-- copy array
        _dimItemPermissionList.removeAllElements();
        for (int i = 0; i < dimItemPermissionArray.length; i++) {
            _dimItemPermissionList.addElement(dimItemPermissionArray[i]);
        }
    } //-- void setDimItemPermission(com.regaltec.rsas.common.xmlparser.DimItemPermission) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DimItemPermissions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DimItemPermissions.class, reader);
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
