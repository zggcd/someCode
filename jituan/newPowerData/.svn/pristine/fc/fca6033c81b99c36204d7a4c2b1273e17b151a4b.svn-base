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
 * Class Hierarchys.
 * 
 * @version $Revision$ $Date$
 */
public class Hierarchys implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ά�Ȼ���Ĳ㼶
     */
    private java.util.Vector _hierarchyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Hierarchys() {
        super();
        _hierarchyList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Hierarchys()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addHierarchy
     * 
     * @param vHierarchy
     */
    public void addHierarchy(com.ccssoft.rsas.common.xmlparser.Hierarchy vHierarchy)
        throws java.lang.IndexOutOfBoundsException
    {
        _hierarchyList.addElement(vHierarchy);
    } //-- void addHierarchy(com.regaltec.rsas.common.xmlparser.Hierarchy) 

    /**
     * Method addHierarchy
     * 
     * @param index
     * @param vHierarchy
     */
    public void addHierarchy(int index, com.ccssoft.rsas.common.xmlparser.Hierarchy vHierarchy)
        throws java.lang.IndexOutOfBoundsException
    {
        _hierarchyList.insertElementAt(vHierarchy, index);
    } //-- void addHierarchy(int, com.regaltec.rsas.common.xmlparser.Hierarchy) 

    /**
     * Method enumerateHierarchy
     */
    public java.util.Enumeration enumerateHierarchy()
    {
        return _hierarchyList.elements();
    } //-- java.util.Enumeration enumerateHierarchy() 

    /**
     * Method getHierarchy
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Hierarchy getHierarchy(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _hierarchyList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Hierarchy) _hierarchyList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Hierarchy getHierarchy(int) 

    /**
     * Method getHierarchy
     */
    public com.ccssoft.rsas.common.xmlparser.Hierarchy[] getHierarchy()
    {
        int size = _hierarchyList.size();
        com.ccssoft.rsas.common.xmlparser.Hierarchy[] mArray = new com.ccssoft.rsas.common.xmlparser.Hierarchy[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Hierarchy) _hierarchyList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Hierarchy[] getHierarchy() 

    /**
     * Method getHierarchyCount
     */
    public int getHierarchyCount()
    {
        return _hierarchyList.size();
    } //-- int getHierarchyCount() 

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
     * Method removeAllHierarchy
     */
    public void removeAllHierarchy()
    {
        _hierarchyList.removeAllElements();
    } //-- void removeAllHierarchy() 

    /**
     * Method removeHierarchy
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Hierarchy removeHierarchy(int index)
    {
        java.lang.Object obj = _hierarchyList.elementAt(index);
        _hierarchyList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Hierarchy) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Hierarchy removeHierarchy(int) 

    /**
     * Method setHierarchy
     * 
     * @param index
     * @param vHierarchy
     */
    public void setHierarchy(int index, com.ccssoft.rsas.common.xmlparser.Hierarchy vHierarchy)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _hierarchyList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _hierarchyList.setElementAt(vHierarchy, index);
    } //-- void setHierarchy(int, com.regaltec.rsas.common.xmlparser.Hierarchy) 

    /**
     * Method setHierarchy
     * 
     * @param hierarchyArray
     */
    public void setHierarchy(com.ccssoft.rsas.common.xmlparser.Hierarchy[] hierarchyArray)
    {
        //-- copy array
        _hierarchyList.removeAllElements();
        for (int i = 0; i < hierarchyArray.length; i++) {
            _hierarchyList.addElement(hierarchyArray[i]);
        }
    } //-- void setHierarchy(com.regaltec.rsas.common.xmlparser.Hierarchy) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Hierarchys) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Hierarchys.class, reader);
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
