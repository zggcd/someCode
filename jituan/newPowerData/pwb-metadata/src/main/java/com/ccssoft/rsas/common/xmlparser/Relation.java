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
 * ����������
 * 
 * @version $Revision$ $Date$
 */
public class Relation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * ������֮��Ĺ�ϵ����
     */
    private java.util.Vector _relationItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Relation() {
        super();
        _relationItemList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Relation()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addRelationItem
     * 
     * @param vRelationItem
     */
    public void addRelationItem(com.ccssoft.rsas.common.xmlparser.RelationItem vRelationItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _relationItemList.addElement(vRelationItem);
    } //-- void addRelationItem(com.regaltec.rsas.common.xmlparser.RelationItem) 

    /**
     * Method addRelationItem
     * 
     * @param index
     * @param vRelationItem
     */
    public void addRelationItem(int index, com.ccssoft.rsas.common.xmlparser.RelationItem vRelationItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _relationItemList.insertElementAt(vRelationItem, index);
    } //-- void addRelationItem(int, com.regaltec.rsas.common.xmlparser.RelationItem) 

    /**
     * Method enumerateRelationItem
     */
    public java.util.Enumeration enumerateRelationItem()
    {
        return _relationItemList.elements();
    } //-- java.util.Enumeration enumerateRelationItem() 

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
     * Method getRelationItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.RelationItem getRelationItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _relationItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.RelationItem) _relationItemList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.RelationItem getRelationItem(int) 

    /**
     * Method getRelationItem
     */
    public com.ccssoft.rsas.common.xmlparser.RelationItem[] getRelationItem()
    {
        int size = _relationItemList.size();
        com.ccssoft.rsas.common.xmlparser.RelationItem[] mArray = new com.ccssoft.rsas.common.xmlparser.RelationItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.RelationItem) _relationItemList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.RelationItem[] getRelationItem() 

    /**
     * Method getRelationItemCount
     */
    public int getRelationItemCount()
    {
        return _relationItemList.size();
    } //-- int getRelationItemCount() 

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
     * Method removeAllRelationItem
     */
    public void removeAllRelationItem()
    {
        _relationItemList.removeAllElements();
    } //-- void removeAllRelationItem() 

    /**
     * Method removeRelationItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.RelationItem removeRelationItem(int index)
    {
        java.lang.Object obj = _relationItemList.elementAt(index);
        _relationItemList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.RelationItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.RelationItem removeRelationItem(int) 

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
     * Method setRelationItem
     * 
     * @param index
     * @param vRelationItem
     */
    public void setRelationItem(int index, com.ccssoft.rsas.common.xmlparser.RelationItem vRelationItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _relationItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _relationItemList.setElementAt(vRelationItem, index);
    } //-- void setRelationItem(int, com.regaltec.rsas.common.xmlparser.RelationItem) 

    /**
     * Method setRelationItem
     * 
     * @param relationItemArray
     */
    public void setRelationItem(com.ccssoft.rsas.common.xmlparser.RelationItem[] relationItemArray)
    {
        //-- copy array
        _relationItemList.removeAllElements();
        for (int i = 0; i < relationItemArray.length; i++) {
            _relationItemList.addElement(relationItemArray[i]);
        }
    } //-- void setRelationItem(com.regaltec.rsas.common.xmlparser.RelationItem) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Relation) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Relation.class, reader);
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
