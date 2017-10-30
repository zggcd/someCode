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
 * Class OperItems.
 * 
 * @version $Revision$ $Date$
 */
public class OperItems implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����Ĳ�������
     */
    private java.util.Vector _operItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public OperItems() {
        super();
        _operItemList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.OperItems()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOperItem
     * 
     * @param vOperItem
     */
    public void addOperItem(com.ccssoft.rsas.common.xmlparser.OperItem vOperItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _operItemList.addElement(vOperItem);
    } //-- void addOperItem(com.regaltec.rsas.common.xmlparser.OperItem) 

    /**
     * Method addOperItem
     * 
     * @param index
     * @param vOperItem
     */
    public void addOperItem(int index, com.ccssoft.rsas.common.xmlparser.OperItem vOperItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _operItemList.insertElementAt(vOperItem, index);
    } //-- void addOperItem(int, com.regaltec.rsas.common.xmlparser.OperItem) 

    /**
     * Method enumerateOperItem
     */
    public java.util.Enumeration enumerateOperItem()
    {
        return _operItemList.elements();
    } //-- java.util.Enumeration enumerateOperItem() 

    /**
     * Method getOperItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.OperItem getOperItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _operItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.OperItem) _operItemList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.OperItem getOperItem(int) 

    /**
     * Method getOperItem
     */
    public com.ccssoft.rsas.common.xmlparser.OperItem[] getOperItem()
    {
        int size = _operItemList.size();
        com.ccssoft.rsas.common.xmlparser.OperItem[] mArray = new com.ccssoft.rsas.common.xmlparser.OperItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.OperItem) _operItemList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.OperItem[] getOperItem() 

    /**
     * Method getOperItemCount
     */
    public int getOperItemCount()
    {
        return _operItemList.size();
    } //-- int getOperItemCount() 

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
     * Method removeAllOperItem
     */
    public void removeAllOperItem()
    {
        _operItemList.removeAllElements();
    } //-- void removeAllOperItem() 

    /**
     * Method removeOperItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.OperItem removeOperItem(int index)
    {
        java.lang.Object obj = _operItemList.elementAt(index);
        _operItemList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.OperItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.OperItem removeOperItem(int) 

    /**
     * Method setOperItem
     * 
     * @param index
     * @param vOperItem
     */
    public void setOperItem(int index, com.ccssoft.rsas.common.xmlparser.OperItem vOperItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _operItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _operItemList.setElementAt(vOperItem, index);
    } //-- void setOperItem(int, com.regaltec.rsas.common.xmlparser.OperItem) 

    /**
     * Method setOperItem
     * 
     * @param operItemArray
     */
    public void setOperItem(com.ccssoft.rsas.common.xmlparser.OperItem[] operItemArray)
    {
        //-- copy array
        _operItemList.removeAllElements();
        for (int i = 0; i < operItemArray.length; i++) {
            _operItemList.addElement(operItemArray[i]);
        }
    } //-- void setOperItem(com.regaltec.rsas.common.xmlparser.OperItem) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.OperItems) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.OperItems.class, reader);
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
