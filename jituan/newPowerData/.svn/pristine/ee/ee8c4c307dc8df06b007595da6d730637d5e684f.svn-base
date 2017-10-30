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
 * Class DimensionItems.
 * 
 * @version $Revision$ $Date$
 */
public class DimensionItems implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dimensionItemList
     */
    private java.util.Vector _dimensionItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DimensionItems() {
        super();
        _dimensionItemList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DimensionItems()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDimensionItem
     * 
     * @param vDimensionItem
     */
    public void addDimensionItem(com.ccssoft.rsas.common.xmlparser.DimensionItem vDimensionItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimensionItemList.addElement(vDimensionItem);
    } //-- void addDimensionItem(com.regaltec.rsas.common.xmlparser.DimensionItem) 

    /**
     * Method addDimensionItem
     * 
     * @param index
     * @param vDimensionItem
     */
    public void addDimensionItem(int index, com.ccssoft.rsas.common.xmlparser.DimensionItem vDimensionItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _dimensionItemList.insertElementAt(vDimensionItem, index);
    } //-- void addDimensionItem(int, com.regaltec.rsas.common.xmlparser.DimensionItem) 

    /**
     * Method enumerateDimensionItem
     */
    public java.util.Enumeration enumerateDimensionItem()
    {
        return _dimensionItemList.elements();
    } //-- java.util.Enumeration enumerateDimensionItem() 

    /**
     * Method getDimensionItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimensionItem getDimensionItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimensionItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DimensionItem) _dimensionItemList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DimensionItem getDimensionItem(int) 

    /**
     * Method getDimensionItem
     */
    public com.ccssoft.rsas.common.xmlparser.DimensionItem[] getDimensionItem()
    {
        int size = _dimensionItemList.size();
        com.ccssoft.rsas.common.xmlparser.DimensionItem[] mArray = new com.ccssoft.rsas.common.xmlparser.DimensionItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DimensionItem) _dimensionItemList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DimensionItem[] getDimensionItem() 

    /**
     * Method getDimensionItemCount
     */
    public int getDimensionItemCount()
    {
        return _dimensionItemList.size();
    } //-- int getDimensionItemCount() 

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
     * Method removeAllDimensionItem
     */
    public void removeAllDimensionItem()
    {
        _dimensionItemList.removeAllElements();
    } //-- void removeAllDimensionItem() 

    /**
     * Method removeDimensionItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DimensionItem removeDimensionItem(int index)
    {
        java.lang.Object obj = _dimensionItemList.elementAt(index);
        _dimensionItemList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DimensionItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DimensionItem removeDimensionItem(int) 

    /**
     * Method setDimensionItem
     * 
     * @param index
     * @param vDimensionItem
     */
    public void setDimensionItem(int index, com.ccssoft.rsas.common.xmlparser.DimensionItem vDimensionItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dimensionItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dimensionItemList.setElementAt(vDimensionItem, index);
    } //-- void setDimensionItem(int, com.regaltec.rsas.common.xmlparser.DimensionItem) 

    /**
     * Method setDimensionItem
     * 
     * @param dimensionItemArray
     */
    public void setDimensionItem(com.ccssoft.rsas.common.xmlparser.DimensionItem[] dimensionItemArray)
    {
        //-- copy array
        _dimensionItemList.removeAllElements();
        for (int i = 0; i < dimensionItemArray.length; i++) {
            _dimensionItemList.addElement(dimensionItemArray[i]);
        }
    } //-- void setDimensionItem(com.regaltec.rsas.common.xmlparser.DimensionItem) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DimensionItems) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DimensionItems.class, reader);
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
