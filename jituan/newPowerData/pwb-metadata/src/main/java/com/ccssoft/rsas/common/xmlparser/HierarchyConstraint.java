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
 * �㼶����Ч��Լ������
 * 
 * @version $Revision$ $Date$
 */
public class HierarchyConstraint implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _constraintItemList
     */
    private java.util.Vector _constraintItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public HierarchyConstraint() {
        super();
        _constraintItemList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyConstraint()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConstraintItem
     * 
     * @param vConstraintItem
     */
    public void addConstraintItem(com.ccssoft.rsas.common.xmlparser.ConstraintItem vConstraintItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _constraintItemList.addElement(vConstraintItem);
    } //-- void addConstraintItem(com.regaltec.rsas.common.xmlparser.ConstraintItem) 

    /**
     * Method addConstraintItem
     * 
     * @param index
     * @param vConstraintItem
     */
    public void addConstraintItem(int index, com.ccssoft.rsas.common.xmlparser.ConstraintItem vConstraintItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _constraintItemList.insertElementAt(vConstraintItem, index);
    } //-- void addConstraintItem(int, com.regaltec.rsas.common.xmlparser.ConstraintItem) 

    /**
     * Method enumerateConstraintItem
     */
    public java.util.Enumeration enumerateConstraintItem()
    {
        return _constraintItemList.elements();
    } //-- java.util.Enumeration enumerateConstraintItem() 

    /**
     * Method getConstraintItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConstraintItem getConstraintItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _constraintItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ConstraintItem) _constraintItemList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ConstraintItem getConstraintItem(int) 

    /**
     * Method getConstraintItem
     */
    public com.ccssoft.rsas.common.xmlparser.ConstraintItem[] getConstraintItem()
    {
        int size = _constraintItemList.size();
        com.ccssoft.rsas.common.xmlparser.ConstraintItem[] mArray = new com.ccssoft.rsas.common.xmlparser.ConstraintItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ConstraintItem) _constraintItemList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ConstraintItem[] getConstraintItem() 

    /**
     * Method getConstraintItemCount
     */
    public int getConstraintItemCount()
    {
        return _constraintItemList.size();
    } //-- int getConstraintItemCount() 

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
     * Method removeAllConstraintItem
     */
    public void removeAllConstraintItem()
    {
        _constraintItemList.removeAllElements();
    } //-- void removeAllConstraintItem() 

    /**
     * Method removeConstraintItem
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConstraintItem removeConstraintItem(int index)
    {
        java.lang.Object obj = _constraintItemList.elementAt(index);
        _constraintItemList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ConstraintItem) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ConstraintItem removeConstraintItem(int) 

    /**
     * Method setConstraintItem
     * 
     * @param index
     * @param vConstraintItem
     */
    public void setConstraintItem(int index, com.ccssoft.rsas.common.xmlparser.ConstraintItem vConstraintItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _constraintItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _constraintItemList.setElementAt(vConstraintItem, index);
    } //-- void setConstraintItem(int, com.regaltec.rsas.common.xmlparser.ConstraintItem) 

    /**
     * Method setConstraintItem
     * 
     * @param constraintItemArray
     */
    public void setConstraintItem(com.ccssoft.rsas.common.xmlparser.ConstraintItem[] constraintItemArray)
    {
        //-- copy array
        _constraintItemList.removeAllElements();
        for (int i = 0; i < constraintItemArray.length; i++) {
            _constraintItemList.addElement(constraintItemArray[i]);
        }
    } //-- void setConstraintItem(com.regaltec.rsas.common.xmlparser.ConstraintItem) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.HierarchyConstraint) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.HierarchyConstraint.class, reader);
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
