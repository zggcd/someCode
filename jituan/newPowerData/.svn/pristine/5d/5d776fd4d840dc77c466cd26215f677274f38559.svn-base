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
 * Class PTCategorys.
 * 
 * @version $Revision$ $Date$
 */
public class PTCategorys implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Portalģ�����
     */
    private java.util.Vector _PTCategoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PTCategorys() {
        super();
        _PTCategoryList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.PTCategorys()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPTCategory
     * 
     * @param vPTCategory
     */
    public void addPTCategory(com.ccssoft.rsas.common.xmlparser.PTCategory vPTCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _PTCategoryList.addElement(vPTCategory);
    } //-- void addPTCategory(com.regaltec.rsas.common.xmlparser.PTCategory) 

    /**
     * Method addPTCategory
     * 
     * @param index
     * @param vPTCategory
     */
    public void addPTCategory(int index, com.ccssoft.rsas.common.xmlparser.PTCategory vPTCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _PTCategoryList.insertElementAt(vPTCategory, index);
    } //-- void addPTCategory(int, com.regaltec.rsas.common.xmlparser.PTCategory) 

    /**
     * Method enumeratePTCategory
     */
    public java.util.Enumeration enumeratePTCategory()
    {
        return _PTCategoryList.elements();
    } //-- java.util.Enumeration enumeratePTCategory() 

    /**
     * Method getPTCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PTCategory getPTCategory(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _PTCategoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.PTCategory) _PTCategoryList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.PTCategory getPTCategory(int) 

    /**
     * Method getPTCategory
     */
    public com.ccssoft.rsas.common.xmlparser.PTCategory[] getPTCategory()
    {
        int size = _PTCategoryList.size();
        com.ccssoft.rsas.common.xmlparser.PTCategory[] mArray = new com.ccssoft.rsas.common.xmlparser.PTCategory[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.PTCategory) _PTCategoryList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.PTCategory[] getPTCategory() 

    /**
     * Method getPTCategoryCount
     */
    public int getPTCategoryCount()
    {
        return _PTCategoryList.size();
    } //-- int getPTCategoryCount() 

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
     * Method removeAllPTCategory
     */
    public void removeAllPTCategory()
    {
        _PTCategoryList.removeAllElements();
    } //-- void removeAllPTCategory() 

    /**
     * Method removePTCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PTCategory removePTCategory(int index)
    {
        java.lang.Object obj = _PTCategoryList.elementAt(index);
        _PTCategoryList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.PTCategory) obj;
    } //-- com.regaltec.rsas.common.xmlparser.PTCategory removePTCategory(int) 

    /**
     * Method setPTCategory
     * 
     * @param index
     * @param vPTCategory
     */
    public void setPTCategory(int index, com.ccssoft.rsas.common.xmlparser.PTCategory vPTCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _PTCategoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _PTCategoryList.setElementAt(vPTCategory, index);
    } //-- void setPTCategory(int, com.regaltec.rsas.common.xmlparser.PTCategory) 

    /**
     * Method setPTCategory
     * 
     * @param PTCategoryArray
     */
    public void setPTCategory(com.ccssoft.rsas.common.xmlparser.PTCategory[] PTCategoryArray)
    {
        //-- copy array
        _PTCategoryList.removeAllElements();
        for (int i = 0; i < PTCategoryArray.length; i++) {
            _PTCategoryList.addElement(PTCategoryArray[i]);
        }
    } //-- void setPTCategory(com.regaltec.rsas.common.xmlparser.PTCategory) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PTCategorys) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PTCategorys.class, reader);
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
