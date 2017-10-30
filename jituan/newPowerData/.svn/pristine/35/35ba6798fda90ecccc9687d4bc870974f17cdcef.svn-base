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
 * ��ȡ·��
 * 
 * @version $Revision$ $Date$
 */
public class Directory implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportID
     */
    private java.lang.String _reportID;

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
     * ά�Ȼ���Ĳ㼶
     */
    private java.util.Vector _hierarchyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Directory() {
        super();
        _hierarchyList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Directory()


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
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'desc'.
     */
    public java.lang.String getDesc()
    {
        return this._desc;
    } //-- java.lang.String getDesc() 

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
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

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
     * Returns the value of field 'reportID'.
     * 
     * @return the value of field 'reportID'.
     */
    public java.lang.String getReportID()
    {
        return this._reportID;
    } //-- java.lang.String getReportID() 

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
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(java.lang.String desc)
    {
        this._desc = desc;
    } //-- void setDesc(java.lang.String) 

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
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

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
     * Sets the value of field 'reportID'.
     * 
     * @param reportID the value of field 'reportID'.
     */
    public void setReportID(java.lang.String reportID)
    {
        this._reportID = reportID;
    } //-- void setReportID(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Directory) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Directory.class, reader);
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
