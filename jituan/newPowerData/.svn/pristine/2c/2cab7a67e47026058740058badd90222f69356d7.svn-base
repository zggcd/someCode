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
 * Comment describing your root element
 * 
 * @version $Revision$ $Date$
 */
public class Request implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ֪ͨ��
     */
    private java.util.Vector _requisitionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
        _requisitionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Request()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addRequisition
     * 
     * @param vRequisition
     */
    public void addRequisition(com.ccssoft.rsas.common.xmlparser.Requisition vRequisition)
        throws java.lang.IndexOutOfBoundsException
    {
        _requisitionList.addElement(vRequisition);
    } //-- void addRequisition(com.regaltec.rsas.common.xmlparser.Requisition) 

    /**
     * Method addRequisition
     * 
     * @param index
     * @param vRequisition
     */
    public void addRequisition(int index, com.ccssoft.rsas.common.xmlparser.Requisition vRequisition)
        throws java.lang.IndexOutOfBoundsException
    {
        _requisitionList.insertElementAt(vRequisition, index);
    } //-- void addRequisition(int, com.regaltec.rsas.common.xmlparser.Requisition) 

    /**
     * Method enumerateRequisition
     */
    public java.util.Enumeration enumerateRequisition()
    {
        return _requisitionList.elements();
    } //-- java.util.Enumeration enumerateRequisition() 

    /**
     * Method getRequisition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Requisition getRequisition(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _requisitionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Requisition) _requisitionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Requisition getRequisition(int) 

    /**
     * Method getRequisition
     */
    public com.ccssoft.rsas.common.xmlparser.Requisition[] getRequisition()
    {
        int size = _requisitionList.size();
        com.ccssoft.rsas.common.xmlparser.Requisition[] mArray = new com.ccssoft.rsas.common.xmlparser.Requisition[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Requisition) _requisitionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Requisition[] getRequisition() 

    /**
     * Method getRequisitionCount
     */
    public int getRequisitionCount()
    {
        return _requisitionList.size();
    } //-- int getRequisitionCount() 

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
     * Method removeAllRequisition
     */
    public void removeAllRequisition()
    {
        _requisitionList.removeAllElements();
    } //-- void removeAllRequisition() 

    /**
     * Method removeRequisition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Requisition removeRequisition(int index)
    {
        java.lang.Object obj = _requisitionList.elementAt(index);
        _requisitionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Requisition) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Requisition removeRequisition(int) 

    /**
     * Method setRequisition
     * 
     * @param index
     * @param vRequisition
     */
    public void setRequisition(int index, com.ccssoft.rsas.common.xmlparser.Requisition vRequisition)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _requisitionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _requisitionList.setElementAt(vRequisition, index);
    } //-- void setRequisition(int, com.regaltec.rsas.common.xmlparser.Requisition) 

    /**
     * Method setRequisition
     * 
     * @param requisitionArray
     */
    public void setRequisition(com.ccssoft.rsas.common.xmlparser.Requisition[] requisitionArray)
    {
        //-- copy array
        _requisitionList.removeAllElements();
        for (int i = 0; i < requisitionArray.length; i++) {
            _requisitionList.addElement(requisitionArray[i]);
        }
    } //-- void setRequisition(com.regaltec.rsas.common.xmlparser.Requisition) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Request) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Request.class, reader);
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
