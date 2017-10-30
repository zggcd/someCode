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
 * HTML �ƶ�������ҳ��Ŀ����
 * 
 * @version $Revision$ $Date$
 */
public class MIDHomeItems implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * HTML �ƶ�������ҳ��Ŀ
     */
    private java.util.Vector _MIDHomeItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MIDHomeItems() {
        super();
        _MIDHomeItemList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MIDHomeItems()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMIDHomeItem
     * 
     * @param vMIDHomeItem
     */
    public void addMIDHomeItem(com.ccssoft.rsas.common.xmlparser.MIDHomeItem vMIDHomeItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDHomeItemList.addElement(vMIDHomeItem);
    } //-- void addMIDHomeItem(com.regaltec.rsas.common.xmlparser.MIDHomeItem) 

    /**
     * Method addMIDHomeItem
     * 
     * @param index
     * @param vMIDHomeItem
     */
    public void addMIDHomeItem(int index, com.ccssoft.rsas.common.xmlparser.MIDHomeItem vMIDHomeItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDHomeItemList.insertElementAt(vMIDHomeItem, index);
    } //-- void addMIDHomeItem(int, com.regaltec.rsas.common.xmlparser.MIDHomeItem) 

    /**
     * Method enumerateMIDHomeItem
     */
    public java.util.Enumeration enumerateMIDHomeItem()
    {
        return _MIDHomeItemList.elements();
    } //-- java.util.Enumeration enumerateMIDHomeItem() 

    /**
     * Method getMIDHomeItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDHomeItem getMIDHomeItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDHomeItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MIDHomeItem) _MIDHomeItemList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MIDHomeItem getMIDHomeItem(int) 

    /**
     * Method getMIDHomeItem
     */
    public com.ccssoft.rsas.common.xmlparser.MIDHomeItem[] getMIDHomeItem()
    {
        int size = _MIDHomeItemList.size();
        com.ccssoft.rsas.common.xmlparser.MIDHomeItem[] mArray = new com.ccssoft.rsas.common.xmlparser.MIDHomeItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MIDHomeItem) _MIDHomeItemList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MIDHomeItem[] getMIDHomeItem() 

    /**
     * Method getMIDHomeItemCount
     */
    public int getMIDHomeItemCount()
    {
        return _MIDHomeItemList.size();
    } //-- int getMIDHomeItemCount() 

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
     * Method removeAllMIDHomeItem
     */
    public void removeAllMIDHomeItem()
    {
        _MIDHomeItemList.removeAllElements();
    } //-- void removeAllMIDHomeItem() 

    /**
     * Method removeMIDHomeItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDHomeItem removeMIDHomeItem(int index)
    {
        java.lang.Object obj = _MIDHomeItemList.elementAt(index);
        _MIDHomeItemList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MIDHomeItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MIDHomeItem removeMIDHomeItem(int) 

    /**
     * Method setMIDHomeItem
     * 
     * @param index
     * @param vMIDHomeItem
     */
    public void setMIDHomeItem(int index, com.ccssoft.rsas.common.xmlparser.MIDHomeItem vMIDHomeItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDHomeItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _MIDHomeItemList.setElementAt(vMIDHomeItem, index);
    } //-- void setMIDHomeItem(int, com.regaltec.rsas.common.xmlparser.MIDHomeItem) 

    /**
     * Method setMIDHomeItem
     * 
     * @param MIDHomeItemArray
     */
    public void setMIDHomeItem(com.ccssoft.rsas.common.xmlparser.MIDHomeItem[] MIDHomeItemArray)
    {
        //-- copy array
        _MIDHomeItemList.removeAllElements();
        for (int i = 0; i < MIDHomeItemArray.length; i++) {
            _MIDHomeItemList.addElement(MIDHomeItemArray[i]);
        }
    } //-- void setMIDHomeItem(com.regaltec.rsas.common.xmlparser.MIDHomeItem) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MIDHomeItems) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MIDHomeItems.class, reader);
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
