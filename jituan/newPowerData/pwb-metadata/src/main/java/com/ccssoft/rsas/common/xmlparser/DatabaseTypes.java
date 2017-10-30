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
 * Class DatabaseTypes.
 * 
 * @version $Revision$ $Date$
 */
public class DatabaseTypes implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���ݿ�ϵͳ����
     */
    private java.util.Vector _databaseTypeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DatabaseTypes() {
        super();
        _databaseTypeList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DatabaseTypes()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDatabaseType
     * 
     * @param vDatabaseType
     */
    public void addDatabaseType(com.ccssoft.rsas.common.xmlparser.DatabaseType vDatabaseType)
        throws java.lang.IndexOutOfBoundsException
    {
        _databaseTypeList.addElement(vDatabaseType);
    } //-- void addDatabaseType(com.regaltec.rsas.common.xmlparser.DatabaseType) 

    /**
     * Method addDatabaseType
     * 
     * @param index
     * @param vDatabaseType
     */
    public void addDatabaseType(int index, com.ccssoft.rsas.common.xmlparser.DatabaseType vDatabaseType)
        throws java.lang.IndexOutOfBoundsException
    {
        _databaseTypeList.insertElementAt(vDatabaseType, index);
    } //-- void addDatabaseType(int, com.regaltec.rsas.common.xmlparser.DatabaseType) 

    /**
     * Method enumerateDatabaseType
     */
    public java.util.Enumeration enumerateDatabaseType()
    {
        return _databaseTypeList.elements();
    } //-- java.util.Enumeration enumerateDatabaseType() 

    /**
     * Method getDatabaseType
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DatabaseType getDatabaseType(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _databaseTypeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DatabaseType) _databaseTypeList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DatabaseType getDatabaseType(int) 

    /**
     * Method getDatabaseType
     */
    public com.ccssoft.rsas.common.xmlparser.DatabaseType[] getDatabaseType()
    {
        int size = _databaseTypeList.size();
        com.ccssoft.rsas.common.xmlparser.DatabaseType[] mArray = new com.ccssoft.rsas.common.xmlparser.DatabaseType[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DatabaseType) _databaseTypeList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DatabaseType[] getDatabaseType() 

    /**
     * Method getDatabaseTypeCount
     */
    public int getDatabaseTypeCount()
    {
        return _databaseTypeList.size();
    } //-- int getDatabaseTypeCount() 

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
     * Method removeAllDatabaseType
     */
    public void removeAllDatabaseType()
    {
        _databaseTypeList.removeAllElements();
    } //-- void removeAllDatabaseType() 

    /**
     * Method removeDatabaseType
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DatabaseType removeDatabaseType(int index)
    {
        java.lang.Object obj = _databaseTypeList.elementAt(index);
        _databaseTypeList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DatabaseType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DatabaseType removeDatabaseType(int) 

    /**
     * Method setDatabaseType
     * 
     * @param index
     * @param vDatabaseType
     */
    public void setDatabaseType(int index, com.ccssoft.rsas.common.xmlparser.DatabaseType vDatabaseType)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _databaseTypeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _databaseTypeList.setElementAt(vDatabaseType, index);
    } //-- void setDatabaseType(int, com.regaltec.rsas.common.xmlparser.DatabaseType) 

    /**
     * Method setDatabaseType
     * 
     * @param databaseTypeArray
     */
    public void setDatabaseType(com.ccssoft.rsas.common.xmlparser.DatabaseType[] databaseTypeArray)
    {
        //-- copy array
        _databaseTypeList.removeAllElements();
        for (int i = 0; i < databaseTypeArray.length; i++) {
            _databaseTypeList.addElement(databaseTypeArray[i]);
        }
    } //-- void setDatabaseType(com.regaltec.rsas.common.xmlparser.DatabaseType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DatabaseTypes) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DatabaseTypes.class, reader);
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
