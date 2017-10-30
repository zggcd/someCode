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
 * Class Taskers.
 * 
 * @version $Revision$ $Date$
 */
public class Taskers implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �ƻ�����
     */
    private java.util.Vector _taskerList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Taskers() {
        super();
        _taskerList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Taskers()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTasker
     * 
     * @param vTasker
     */
    public void addTasker(com.ccssoft.rsas.common.xmlparser.Tasker vTasker)
        throws java.lang.IndexOutOfBoundsException
    {
        _taskerList.addElement(vTasker);
    } //-- void addTasker(com.regaltec.rsas.common.xmlparser.Tasker) 

    /**
     * Method addTasker
     * 
     * @param index
     * @param vTasker
     */
    public void addTasker(int index, com.ccssoft.rsas.common.xmlparser.Tasker vTasker)
        throws java.lang.IndexOutOfBoundsException
    {
        _taskerList.insertElementAt(vTasker, index);
    } //-- void addTasker(int, com.regaltec.rsas.common.xmlparser.Tasker) 

    /**
     * Method enumerateTasker
     */
    public java.util.Enumeration enumerateTasker()
    {
        return _taskerList.elements();
    } //-- java.util.Enumeration enumerateTasker() 

    /**
     * Method getTasker
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Tasker getTasker(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _taskerList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Tasker) _taskerList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Tasker getTasker(int) 

    /**
     * Method getTasker
     */
    public com.ccssoft.rsas.common.xmlparser.Tasker[] getTasker()
    {
        int size = _taskerList.size();
        com.ccssoft.rsas.common.xmlparser.Tasker[] mArray = new com.ccssoft.rsas.common.xmlparser.Tasker[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Tasker) _taskerList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Tasker[] getTasker() 

    /**
     * Method getTaskerCount
     */
    public int getTaskerCount()
    {
        return _taskerList.size();
    } //-- int getTaskerCount() 

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
     * Method removeAllTasker
     */
    public void removeAllTasker()
    {
        _taskerList.removeAllElements();
    } //-- void removeAllTasker() 

    /**
     * Method removeTasker
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Tasker removeTasker(int index)
    {
        java.lang.Object obj = _taskerList.elementAt(index);
        _taskerList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Tasker) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Tasker removeTasker(int) 

    /**
     * Method setTasker
     * 
     * @param index
     * @param vTasker
     */
    public void setTasker(int index, com.ccssoft.rsas.common.xmlparser.Tasker vTasker)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _taskerList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _taskerList.setElementAt(vTasker, index);
    } //-- void setTasker(int, com.regaltec.rsas.common.xmlparser.Tasker) 

    /**
     * Method setTasker
     * 
     * @param taskerArray
     */
    public void setTasker(com.ccssoft.rsas.common.xmlparser.Tasker[] taskerArray)
    {
        //-- copy array
        _taskerList.removeAllElements();
        for (int i = 0; i < taskerArray.length; i++) {
            _taskerList.addElement(taskerArray[i]);
        }
    } //-- void setTasker(com.regaltec.rsas.common.xmlparser.Tasker) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Taskers) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Taskers.class, reader);
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
