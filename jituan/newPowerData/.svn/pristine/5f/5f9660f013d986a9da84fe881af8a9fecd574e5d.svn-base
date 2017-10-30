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
 * ��Ŀָ�꼯��
 * 
 * @version $Revision$ $Date$
 */
public class ItemObjects implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemObjectList
     */
    private java.util.Vector _itemObjectList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemObjects() {
        super();
        _itemObjectList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ItemObjects()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addItemObject
     * 
     * @param vItemObject
     */
    public void addItemObject(com.ccssoft.rsas.common.xmlparser.ItemObject vItemObject)
        throws java.lang.IndexOutOfBoundsException
    {
        _itemObjectList.addElement(vItemObject);
    } //-- void addItemObject(com.regaltec.rsas.common.xmlparser.ItemObject) 

    /**
     * Method addItemObject
     * 
     * @param index
     * @param vItemObject
     */
    public void addItemObject(int index, com.ccssoft.rsas.common.xmlparser.ItemObject vItemObject)
        throws java.lang.IndexOutOfBoundsException
    {
        _itemObjectList.insertElementAt(vItemObject, index);
    } //-- void addItemObject(int, com.regaltec.rsas.common.xmlparser.ItemObject) 

    /**
     * Method enumerateItemObject
     */
    public java.util.Enumeration enumerateItemObject()
    {
        return _itemObjectList.elements();
    } //-- java.util.Enumeration enumerateItemObject() 

    /**
     * Method getItemObject
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ItemObject getItemObject(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _itemObjectList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ItemObject) _itemObjectList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ItemObject getItemObject(int) 

    /**
     * Method getItemObject
     */
    public com.ccssoft.rsas.common.xmlparser.ItemObject[] getItemObject()
    {
        int size = _itemObjectList.size();
        com.ccssoft.rsas.common.xmlparser.ItemObject[] mArray = new com.ccssoft.rsas.common.xmlparser.ItemObject[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ItemObject) _itemObjectList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ItemObject[] getItemObject() 

    /**
     * Method getItemObjectCount
     */
    public int getItemObjectCount()
    {
        return _itemObjectList.size();
    } //-- int getItemObjectCount() 

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
     * Method removeAllItemObject
     */
    public void removeAllItemObject()
    {
        _itemObjectList.removeAllElements();
    } //-- void removeAllItemObject() 

    /**
     * Method removeItemObject
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ItemObject removeItemObject(int index)
    {
        java.lang.Object obj = _itemObjectList.elementAt(index);
        _itemObjectList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ItemObject) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ItemObject removeItemObject(int) 

    /**
     * Method setItemObject
     * 
     * @param index
     * @param vItemObject
     */
    public void setItemObject(int index, com.ccssoft.rsas.common.xmlparser.ItemObject vItemObject)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _itemObjectList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _itemObjectList.setElementAt(vItemObject, index);
    } //-- void setItemObject(int, com.regaltec.rsas.common.xmlparser.ItemObject) 

    /**
     * Method setItemObject
     * 
     * @param itemObjectArray
     */
    public void setItemObject(com.ccssoft.rsas.common.xmlparser.ItemObject[] itemObjectArray)
    {
        //-- copy array
        _itemObjectList.removeAllElements();
        for (int i = 0; i < itemObjectArray.length; i++) {
            _itemObjectList.addElement(itemObjectArray[i]);
        }
    } //-- void setItemObject(com.regaltec.rsas.common.xmlparser.ItemObject) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ItemObjects) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ItemObjects.class, reader);
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
