/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.chart.meter;

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
 * Class Dials.
 * 
 * @version $Revision$ $Date$
 */
public class Dials implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����ID
     */
    private java.lang.Object _measureItemId;

    /**
     * Field _items
     */
    private java.util.Vector _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public Dials() {
        super();
        _items = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.Dials()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDialsItem
     * 
     * @param vDialsItem
     */
    public void addDialsItem(com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem vDialsItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _items.addElement(vDialsItem);
    } //-- void addDialsItem(com.regaltec.rsas.common.xmlparser.chart.meter.DialsItem) 

    /**
     * Method addDialsItem
     * 
     * @param index
     * @param vDialsItem
     */
    public void addDialsItem(int index, com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem vDialsItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _items.insertElementAt(vDialsItem, index);
    } //-- void addDialsItem(int, com.regaltec.rsas.common.xmlparser.chart.meter.DialsItem) 

    /**
     * Method enumerateDialsItem
     */
    public java.util.Enumeration enumerateDialsItem()
    {
        return _items.elements();
    } //-- java.util.Enumeration enumerateDialsItem() 

    /**
     * Method getDialsItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem getDialsItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _items.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem) _items.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.DialsItem getDialsItem(int) 

    /**
     * Method getDialsItem
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem[] getDialsItem()
    {
        int size = _items.size();
        com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem[] mArray = new com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem) _items.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.DialsItem[] getDialsItem() 

    /**
     * Method getDialsItemCount
     */
    public int getDialsItemCount()
    {
        return _items.size();
    } //-- int getDialsItemCount() 

    /**
     * Returns the value of field 'measureItemId'. The field
     * 'measureItemId' has the following description: ����ID
     * 
     * @return the value of field 'measureItemId'.
     */
    public java.lang.Object getMeasureItemId()
    {
        return this._measureItemId;
    } //-- java.lang.Object getMeasureItemId() 

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
     * Method removeAllDialsItem
     */
    public void removeAllDialsItem()
    {
        _items.removeAllElements();
    } //-- void removeAllDialsItem() 

    /**
     * Method removeDialsItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem removeDialsItem(int index)
    {
        java.lang.Object obj = _items.elementAt(index);
        _items.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.chart.meter.DialsItem removeDialsItem(int) 

    /**
     * Method setDialsItem
     * 
     * @param index
     * @param vDialsItem
     */
    public void setDialsItem(int index, com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem vDialsItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _items.size())) {
            throw new IndexOutOfBoundsException();
        }
        _items.setElementAt(vDialsItem, index);
    } //-- void setDialsItem(int, com.regaltec.rsas.common.xmlparser.chart.meter.DialsItem) 

    /**
     * Method setDialsItem
     * 
     * @param dialsItemArray
     */
    public void setDialsItem(com.ccssoft.rsas.common.xmlparser.chart.meter.DialsItem[] dialsItemArray)
    {
        //-- copy array
        _items.removeAllElements();
        for (int i = 0; i < dialsItemArray.length; i++) {
            _items.addElement(dialsItemArray[i]);
        }
    } //-- void setDialsItem(com.regaltec.rsas.common.xmlparser.chart.meter.DialsItem) 

    /**
     * Sets the value of field 'measureItemId'. The field
     * 'measureItemId' has the following description: ����ID
     * 
     * @param measureItemId the value of field 'measureItemId'.
     */
    public void setMeasureItemId(java.lang.Object measureItemId)
    {
        this._measureItemId = measureItemId;
    } //-- void setMeasureItemId(java.lang.Object) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.chart.meter.Dials) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.chart.meter.Dials.class, reader);
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
