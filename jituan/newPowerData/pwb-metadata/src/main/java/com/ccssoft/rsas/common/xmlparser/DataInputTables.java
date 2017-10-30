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
 * Class DataInputTables.
 * 
 * @version $Revision$ $Date$
 */
public class DataInputTables implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���������
     */
    private java.util.Vector _dataInputTableList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataInputTables() {
        super();
        _dataInputTableList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DataInputTables()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDataInputTable
     * 
     * @param vDataInputTable
     */
    public void addDataInputTable(com.ccssoft.rsas.common.xmlparser.DataInputTable vDataInputTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataInputTableList.addElement(vDataInputTable);
    } //-- void addDataInputTable(com.regaltec.rsas.common.xmlparser.DataInputTable) 

    /**
     * Method addDataInputTable
     * 
     * @param index
     * @param vDataInputTable
     */
    public void addDataInputTable(int index, com.ccssoft.rsas.common.xmlparser.DataInputTable vDataInputTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataInputTableList.insertElementAt(vDataInputTable, index);
    } //-- void addDataInputTable(int, com.regaltec.rsas.common.xmlparser.DataInputTable) 

    /**
     * Method enumerateDataInputTable
     */
    public java.util.Enumeration enumerateDataInputTable()
    {
        return _dataInputTableList.elements();
    } //-- java.util.Enumeration enumerateDataInputTable() 

    /**
     * Method getDataInputTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DataInputTable getDataInputTable(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataInputTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DataInputTable) _dataInputTableList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DataInputTable getDataInputTable(int) 

    /**
     * Method getDataInputTable
     */
    public com.ccssoft.rsas.common.xmlparser.DataInputTable[] getDataInputTable()
    {
        int size = _dataInputTableList.size();
        com.ccssoft.rsas.common.xmlparser.DataInputTable[] mArray = new com.ccssoft.rsas.common.xmlparser.DataInputTable[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DataInputTable) _dataInputTableList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DataInputTable[] getDataInputTable() 

    /**
     * Method getDataInputTableCount
     */
    public int getDataInputTableCount()
    {
        return _dataInputTableList.size();
    } //-- int getDataInputTableCount() 

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
     * Method removeAllDataInputTable
     */
    public void removeAllDataInputTable()
    {
        _dataInputTableList.removeAllElements();
    } //-- void removeAllDataInputTable() 

    /**
     * Method removeDataInputTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DataInputTable removeDataInputTable(int index)
    {
        java.lang.Object obj = _dataInputTableList.elementAt(index);
        _dataInputTableList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DataInputTable) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DataInputTable removeDataInputTable(int) 

    /**
     * Method setDataInputTable
     * 
     * @param index
     * @param vDataInputTable
     */
    public void setDataInputTable(int index, com.ccssoft.rsas.common.xmlparser.DataInputTable vDataInputTable)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataInputTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dataInputTableList.setElementAt(vDataInputTable, index);
    } //-- void setDataInputTable(int, com.regaltec.rsas.common.xmlparser.DataInputTable) 

    /**
     * Method setDataInputTable
     * 
     * @param dataInputTableArray
     */
    public void setDataInputTable(com.ccssoft.rsas.common.xmlparser.DataInputTable[] dataInputTableArray)
    {
        //-- copy array
        _dataInputTableList.removeAllElements();
        for (int i = 0; i < dataInputTableArray.length; i++) {
            _dataInputTableList.addElement(dataInputTableArray[i]);
        }
    } //-- void setDataInputTable(com.regaltec.rsas.common.xmlparser.DataInputTable) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DataInputTables) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DataInputTables.class, reader);
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
