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
 * Class Applications.
 * 
 * @version $Revision$ $Date$
 */
public class Applications implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �ⲿӦ��ϵͳ
     */
    private java.util.Vector _applicationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Applications() {
        super();
        _applicationList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Applications()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addApplication
     * 
     * @param vApplication
     */
    public void addApplication(com.ccssoft.rsas.common.xmlparser.Application vApplication)
        throws java.lang.IndexOutOfBoundsException
    {
        _applicationList.addElement(vApplication);
    } //-- void addApplication(com.regaltec.rsas.common.xmlparser.Application) 

    /**
     * Method addApplication
     * 
     * @param index
     * @param vApplication
     */
    public void addApplication(int index, com.ccssoft.rsas.common.xmlparser.Application vApplication)
        throws java.lang.IndexOutOfBoundsException
    {
        _applicationList.insertElementAt(vApplication, index);
    } //-- void addApplication(int, com.regaltec.rsas.common.xmlparser.Application) 

    /**
     * Method enumerateApplication
     */
    public java.util.Enumeration enumerateApplication()
    {
        return _applicationList.elements();
    } //-- java.util.Enumeration enumerateApplication() 

    /**
     * Method getApplication
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Application getApplication(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _applicationList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Application) _applicationList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Application getApplication(int) 

    /**
     * Method getApplication
     */
    public com.ccssoft.rsas.common.xmlparser.Application[] getApplication()
    {
        int size = _applicationList.size();
        com.ccssoft.rsas.common.xmlparser.Application[] mArray = new com.ccssoft.rsas.common.xmlparser.Application[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Application) _applicationList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Application[] getApplication() 

    /**
     * Method getApplicationCount
     */
    public int getApplicationCount()
    {
        return _applicationList.size();
    } //-- int getApplicationCount() 

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
     * Method removeAllApplication
     */
    public void removeAllApplication()
    {
        _applicationList.removeAllElements();
    } //-- void removeAllApplication() 

    /**
     * Method removeApplication
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Application removeApplication(int index)
    {
        java.lang.Object obj = _applicationList.elementAt(index);
        _applicationList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Application) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Application removeApplication(int) 

    /**
     * Method setApplication
     * 
     * @param index
     * @param vApplication
     */
    public void setApplication(int index, com.ccssoft.rsas.common.xmlparser.Application vApplication)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _applicationList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _applicationList.setElementAt(vApplication, index);
    } //-- void setApplication(int, com.regaltec.rsas.common.xmlparser.Application) 

    /**
     * Method setApplication
     * 
     * @param applicationArray
     */
    public void setApplication(com.ccssoft.rsas.common.xmlparser.Application[] applicationArray)
    {
        //-- copy array
        _applicationList.removeAllElements();
        for (int i = 0; i < applicationArray.length; i++) {
            _applicationList.addElement(applicationArray[i]);
        }
    } //-- void setApplication(com.regaltec.rsas.common.xmlparser.Application) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Applications) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Applications.class, reader);
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
