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
 * Class DBTables.
 * 
 * @version $Revision$ $Date$
 */
public class DBTables implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���ݿ��еı���
     */
    private java.util.Vector _DBTableList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DBTables() {
        super();
        _DBTableList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DBTables()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDBTable
     * 
     * @param vDBTable
     */
    public void addDBTable(com.ccssoft.rsas.common.xmlparser.DBTable vDBTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _DBTableList.addElement(vDBTable);
    } //-- void addDBTable(com.regaltec.rsas.common.xmlparser.DBTable) 

    /**
     * Method addDBTable
     * 
     * @param index
     * @param vDBTable
     */
    public void addDBTable(int index, com.ccssoft.rsas.common.xmlparser.DBTable vDBTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _DBTableList.insertElementAt(vDBTable, index);
    } //-- void addDBTable(int, com.regaltec.rsas.common.xmlparser.DBTable) 

    /**
     * Method enumerateDBTable
     */
    public java.util.Enumeration enumerateDBTable()
    {
        return _DBTableList.elements();
    } //-- java.util.Enumeration enumerateDBTable() 

    /**
     * Method getDBTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DBTable getDBTable(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _DBTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DBTable) _DBTableList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DBTable getDBTable(int) 

    /**
     * Method getDBTable
     */
    public com.ccssoft.rsas.common.xmlparser.DBTable[] getDBTable()
    {
        int size = _DBTableList.size();
        com.ccssoft.rsas.common.xmlparser.DBTable[] mArray = new com.ccssoft.rsas.common.xmlparser.DBTable[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DBTable) _DBTableList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DBTable[] getDBTable() 

    /**
     * Method getDBTableCount
     */
    public int getDBTableCount()
    {
        return _DBTableList.size();
    } //-- int getDBTableCount() 

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
     * Method removeAllDBTable
     */
    public void removeAllDBTable()
    {
        _DBTableList.removeAllElements();
    } //-- void removeAllDBTable() 

    /**
     * Method removeDBTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DBTable removeDBTable(int index)
    {
        java.lang.Object obj = _DBTableList.elementAt(index);
        _DBTableList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DBTable) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DBTable removeDBTable(int) 

    /**
     * Method setDBTable
     * 
     * @param index
     * @param vDBTable
     */
    public void setDBTable(int index, com.ccssoft.rsas.common.xmlparser.DBTable vDBTable)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _DBTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _DBTableList.setElementAt(vDBTable, index);
    } //-- void setDBTable(int, com.regaltec.rsas.common.xmlparser.DBTable) 

    /**
     * Method setDBTable
     * 
     * @param DBTableArray
     */
    public void setDBTable(com.ccssoft.rsas.common.xmlparser.DBTable[] DBTableArray)
    {
        //-- copy array
        _DBTableList.removeAllElements();
        for (int i = 0; i < DBTableArray.length; i++) {
            _DBTableList.addElement(DBTableArray[i]);
        }
    } //-- void setDBTable(com.regaltec.rsas.common.xmlparser.DBTable) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DBTables) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DBTables.class, reader);
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
