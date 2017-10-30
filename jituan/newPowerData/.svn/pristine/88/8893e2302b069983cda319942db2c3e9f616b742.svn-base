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
 * Class Databases.
 * 
 * @version $Revision$ $Date$
 */
public class Databases implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���ݿ�ϵͳ�е����ݿ�
     */
    private java.util.Vector _databaseList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Databases() {
        super();
        _databaseList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Databases()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDatabase
     * 
     * @param vDatabase
     */
    public void addDatabase(com.ccssoft.rsas.common.xmlparser.Database vDatabase)
        throws java.lang.IndexOutOfBoundsException
    {
        _databaseList.addElement(vDatabase);
    } //-- void addDatabase(com.regaltec.rsas.common.xmlparser.Database) 

    /**
     * Method addDatabase
     * 
     * @param index
     * @param vDatabase
     */
    public void addDatabase(int index, com.ccssoft.rsas.common.xmlparser.Database vDatabase)
        throws java.lang.IndexOutOfBoundsException
    {
        _databaseList.insertElementAt(vDatabase, index);
    } //-- void addDatabase(int, com.regaltec.rsas.common.xmlparser.Database) 

    /**
     * Method enumerateDatabase
     */
    public java.util.Enumeration enumerateDatabase()
    {
        return _databaseList.elements();
    } //-- java.util.Enumeration enumerateDatabase() 

    /**
     * Method getDatabase
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Database getDatabase(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _databaseList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Database) _databaseList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Database getDatabase(int) 

    /**
     * Method getDatabase
     */
    public com.ccssoft.rsas.common.xmlparser.Database[] getDatabase()
    {
        int size = _databaseList.size();
        com.ccssoft.rsas.common.xmlparser.Database[] mArray = new com.ccssoft.rsas.common.xmlparser.Database[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Database) _databaseList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Database[] getDatabase() 

    /**
     * Method getDatabaseCount
     */
    public int getDatabaseCount()
    {
        return _databaseList.size();
    } //-- int getDatabaseCount() 

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
     * Method removeAllDatabase
     */
    public void removeAllDatabase()
    {
        _databaseList.removeAllElements();
    } //-- void removeAllDatabase() 

    /**
     * Method removeDatabase
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Database removeDatabase(int index)
    {
        java.lang.Object obj = _databaseList.elementAt(index);
        _databaseList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Database) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Database removeDatabase(int) 

    /**
     * Method setDatabase
     * 
     * @param index
     * @param vDatabase
     */
    public void setDatabase(int index, com.ccssoft.rsas.common.xmlparser.Database vDatabase)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _databaseList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _databaseList.setElementAt(vDatabase, index);
    } //-- void setDatabase(int, com.regaltec.rsas.common.xmlparser.Database) 

    /**
     * Method setDatabase
     * 
     * @param databaseArray
     */
    public void setDatabase(com.ccssoft.rsas.common.xmlparser.Database[] databaseArray)
    {
        //-- copy array
        _databaseList.removeAllElements();
        for (int i = 0; i < databaseArray.length; i++) {
            _databaseList.addElement(databaseArray[i]);
        }
    } //-- void setDatabase(com.regaltec.rsas.common.xmlparser.Database) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Databases) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Databases.class, reader);
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
