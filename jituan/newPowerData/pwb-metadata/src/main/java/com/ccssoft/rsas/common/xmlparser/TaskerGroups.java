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
 * Class TaskerGroups.
 * 
 * @version $Revision$ $Date$
 */
public class TaskerGroups implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �ƻ�������
     */
    private java.util.Vector _taskerGroupList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TaskerGroups() {
        super();
        _taskerGroupList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.TaskerGroups()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTaskerGroup
     * 
     * @param vTaskerGroup
     */
    public void addTaskerGroup(com.ccssoft.rsas.common.xmlparser.TaskerGroup vTaskerGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        _taskerGroupList.addElement(vTaskerGroup);
    } //-- void addTaskerGroup(com.regaltec.rsas.common.xmlparser.TaskerGroup) 

    /**
     * Method addTaskerGroup
     * 
     * @param index
     * @param vTaskerGroup
     */
    public void addTaskerGroup(int index, com.ccssoft.rsas.common.xmlparser.TaskerGroup vTaskerGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        _taskerGroupList.insertElementAt(vTaskerGroup, index);
    } //-- void addTaskerGroup(int, com.regaltec.rsas.common.xmlparser.TaskerGroup) 

    /**
     * Method enumerateTaskerGroup
     */
    public java.util.Enumeration enumerateTaskerGroup()
    {
        return _taskerGroupList.elements();
    } //-- java.util.Enumeration enumerateTaskerGroup() 

    /**
     * Method getTaskerGroup
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.TaskerGroup getTaskerGroup(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _taskerGroupList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.TaskerGroup) _taskerGroupList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.TaskerGroup getTaskerGroup(int) 

    /**
     * Method getTaskerGroup
     */
    public com.ccssoft.rsas.common.xmlparser.TaskerGroup[] getTaskerGroup()
    {
        int size = _taskerGroupList.size();
        com.ccssoft.rsas.common.xmlparser.TaskerGroup[] mArray = new com.ccssoft.rsas.common.xmlparser.TaskerGroup[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.TaskerGroup) _taskerGroupList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.TaskerGroup[] getTaskerGroup() 

    /**
     * Method getTaskerGroupCount
     */
    public int getTaskerGroupCount()
    {
        return _taskerGroupList.size();
    } //-- int getTaskerGroupCount() 

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
     * Method removeAllTaskerGroup
     */
    public void removeAllTaskerGroup()
    {
        _taskerGroupList.removeAllElements();
    } //-- void removeAllTaskerGroup() 

    /**
     * Method removeTaskerGroup
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.TaskerGroup removeTaskerGroup(int index)
    {
        java.lang.Object obj = _taskerGroupList.elementAt(index);
        _taskerGroupList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.TaskerGroup) obj;
    } //-- com.regaltec.rsas.common.xmlparser.TaskerGroup removeTaskerGroup(int) 

    /**
     * Method setTaskerGroup
     * 
     * @param index
     * @param vTaskerGroup
     */
    public void setTaskerGroup(int index, com.ccssoft.rsas.common.xmlparser.TaskerGroup vTaskerGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _taskerGroupList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _taskerGroupList.setElementAt(vTaskerGroup, index);
    } //-- void setTaskerGroup(int, com.regaltec.rsas.common.xmlparser.TaskerGroup) 

    /**
     * Method setTaskerGroup
     * 
     * @param taskerGroupArray
     */
    public void setTaskerGroup(com.ccssoft.rsas.common.xmlparser.TaskerGroup[] taskerGroupArray)
    {
        //-- copy array
        _taskerGroupList.removeAllElements();
        for (int i = 0; i < taskerGroupArray.length; i++) {
            _taskerGroupList.addElement(taskerGroupArray[i]);
        }
    } //-- void setTaskerGroup(com.regaltec.rsas.common.xmlparser.TaskerGroup) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.TaskerGroups) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.TaskerGroups.class, reader);
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
