/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.other;

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
 * Class Bind.
 * 
 * @version $Revision$ $Date$
 */
public class Bind implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dimensionItemId
     */
    private java.lang.String _dimensionItemId;

    /**
     * Field _dimensionItemName
     */
    private java.lang.String _dimensionItemName;

    /**
     * Field _itemList
     */
    private java.util.Vector _itemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Bind() {
        super();
        _itemList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Bind()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addItem
     * 
     * @param vItem
     */
    public void addItem(com.ccssoft.rsas.common.xmlparser.chart.other.Item vItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _itemList.addElement(vItem);
    } //-- void addItem(com.regaltec.rsas.common.xmlparser.chart.other.Item) 

    /**
     * Method addItem
     * 
     * @param index
     * @param vItem
     */
    public void addItem(int index, com.ccssoft.rsas.common.xmlparser.chart.other.Item vItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _itemList.insertElementAt(vItem, index);
    } //-- void addItem(int, com.regaltec.rsas.common.xmlparser.chart.other.Item) 

    /**
     * Method enumerateItem
     */
    public java.util.Enumeration enumerateItem()
    {
        return _itemList.elements();
    } //-- java.util.Enumeration enumerateItem() 

    /**
     * Returns the value of field 'dimensionItemId'.
     * 
     * @return the value of field 'dimensionItemId'.
     */
    public java.lang.String getDimensionItemId()
    {
        return this._dimensionItemId;
    } //-- java.lang.String getDimensionItemId() 

    /**
     * Returns the value of field 'dimensionItemName'.
     * 
     * @return the value of field 'dimensionItemName'.
     */
    public java.lang.String getDimensionItemName()
    {
        return this._dimensionItemName;
    } //-- java.lang.String getDimensionItemName() 

    /**
     * Method getItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Item getItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _itemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Item) _itemList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Item getItem(int) 

    /**
     * Method getItem
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Item[] getItem()
    {
        int size = _itemList.size();
        com.ccssoft.rsas.common.xmlparser.chart.other.Item[] mArray = new com.ccssoft.rsas.common.xmlparser.chart.other.Item[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.chart.other.Item) _itemList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Item[] getItem() 

    /**
     * Method getItemCount
     */
    public int getItemCount()
    {
        return _itemList.size();
    } //-- int getItemCount() 

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
     * Method removeAllItem
     */
    public void removeAllItem()
    {
        _itemList.removeAllElements();
    } //-- void removeAllItem() 

    /**
     * Method removeItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.other.Item removeItem(int index)
    {
        java.lang.Object obj = _itemList.elementAt(index);
        _itemList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Item) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.other.Item removeItem(int) 

    /**
     * Sets the value of field 'dimensionItemId'.
     * 
     * @param dimensionItemId the value of field 'dimensionItemId'.
     */
    public void setDimensionItemId(java.lang.String dimensionItemId)
    {
        this._dimensionItemId = dimensionItemId;
    } //-- void setDimensionItemId(java.lang.String) 

    /**
     * Sets the value of field 'dimensionItemName'.
     * 
     * @param dimensionItemName the value of field
     * 'dimensionItemName'.
     */
    public void setDimensionItemName(java.lang.String dimensionItemName)
    {
        this._dimensionItemName = dimensionItemName;
    } //-- void setDimensionItemName(java.lang.String) 

    /**
     * Method setItem
     * 
     * @param index
     * @param vItem
     */
    public void setItem(int index, com.ccssoft.rsas.common.xmlparser.chart.other.Item vItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _itemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _itemList.setElementAt(vItem, index);
    } //-- void setItem(int, com.regaltec.rsas.common.xmlparser.chart.other.Item) 

    /**
     * Method setItem
     * 
     * @param itemArray
     */
    public void setItem(com.ccssoft.rsas.common.xmlparser.chart.other.Item[] itemArray)
    {
        //-- copy array
        _itemList.removeAllElements();
        for (int i = 0; i < itemArray.length; i++) {
            _itemList.addElement(itemArray[i]);
        }
    } //-- void setItem(com.regaltec.rsas.common.xmlparser.chart.other.Item) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.other.Bind) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.other.Bind.class, reader);
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
