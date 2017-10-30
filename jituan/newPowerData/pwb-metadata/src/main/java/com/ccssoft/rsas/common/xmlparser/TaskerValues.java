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
 * Class TaskerValues.
 * 
 * @version $Revision$ $Date$
 */
public class TaskerValues implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _taskerValueList
     */
    private java.util.Vector _taskerValueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TaskerValues() {
        super();
        _taskerValueList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.TaskerValues()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTaskerValue
     * 
     * @param vTaskerValue
     */
    public void addTaskerValue(com.ccssoft.rsas.common.xmlparser.TaskerValue vTaskerValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _taskerValueList.addElement(vTaskerValue);
    } //-- void addTaskerValue(com.regaltec.rsas.common.xmlparser.TaskerValue) 

    /**
     * Method addTaskerValue
     * 
     * @param index
     * @param vTaskerValue
     */
    public void addTaskerValue(int index, com.ccssoft.rsas.common.xmlparser.TaskerValue vTaskerValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _taskerValueList.insertElementAt(vTaskerValue, index);
    } //-- void addTaskerValue(int, com.regaltec.rsas.common.xmlparser.TaskerValue) 

    /**
     * Method enumerateTaskerValue
     */
    public java.util.Enumeration enumerateTaskerValue()
    {
        return _taskerValueList.elements();
    } //-- java.util.Enumeration enumerateTaskerValue() 

    /**
     * Method getTaskerValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.TaskerValue getTaskerValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _taskerValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.TaskerValue) _taskerValueList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.TaskerValue getTaskerValue(int) 

    /**
     * Method getTaskerValue
     */
    public com.ccssoft.rsas.common.xmlparser.TaskerValue[] getTaskerValue()
    {
        int size = _taskerValueList.size();
        com.ccssoft.rsas.common.xmlparser.TaskerValue[] mArray = new com.ccssoft.rsas.common.xmlparser.TaskerValue[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.TaskerValue) _taskerValueList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.TaskerValue[] getTaskerValue() 

    /**
     * Method getTaskerValueCount
     */
    public int getTaskerValueCount()
    {
        return _taskerValueList.size();
    } //-- int getTaskerValueCount() 

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
     * Method removeAllTaskerValue
     */
    public void removeAllTaskerValue()
    {
        _taskerValueList.removeAllElements();
    } //-- void removeAllTaskerValue() 

    /**
     * Method removeTaskerValue
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.TaskerValue removeTaskerValue(int index)
    {
        java.lang.Object obj = _taskerValueList.elementAt(index);
        _taskerValueList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.TaskerValue) obj;
    } //-- com.regaltec.rsas.common.xmlparser.TaskerValue removeTaskerValue(int) 

    /**
     * Method setTaskerValue
     * 
     * @param index
     * @param vTaskerValue
     */
    public void setTaskerValue(int index, com.ccssoft.rsas.common.xmlparser.TaskerValue vTaskerValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _taskerValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _taskerValueList.setElementAt(vTaskerValue, index);
    } //-- void setTaskerValue(int, com.regaltec.rsas.common.xmlparser.TaskerValue) 

    /**
     * Method setTaskerValue
     * 
     * @param taskerValueArray
     */
    public void setTaskerValue(com.ccssoft.rsas.common.xmlparser.TaskerValue[] taskerValueArray)
    {
        //-- copy array
        _taskerValueList.removeAllElements();
        for (int i = 0; i < taskerValueArray.length; i++) {
            _taskerValueList.addElement(taskerValueArray[i]);
        }
    } //-- void setTaskerValue(com.regaltec.rsas.common.xmlparser.TaskerValue) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.TaskerValues) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.TaskerValues.class, reader);
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
