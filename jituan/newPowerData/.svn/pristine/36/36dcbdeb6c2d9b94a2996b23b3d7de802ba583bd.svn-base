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
 * ���ݺ˶Ա���󼯺�
 * 
 * @version $Revision$ $Date$
 */
public class CheckTables implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���ݺ˶Ա����
     */
    private java.util.Vector _checkTableList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CheckTables() {
        super();
        _checkTableList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.CheckTables()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addCheckTable
     * 
     * @param vCheckTable
     */
    public void addCheckTable(com.ccssoft.rsas.common.xmlparser.CheckTable vCheckTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _checkTableList.addElement(vCheckTable);
    } //-- void addCheckTable(com.regaltec.rsas.common.xmlparser.CheckTable) 

    /**
     * Method addCheckTable
     * 
     * @param index
     * @param vCheckTable
     */
    public void addCheckTable(int index, com.ccssoft.rsas.common.xmlparser.CheckTable vCheckTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _checkTableList.insertElementAt(vCheckTable, index);
    } //-- void addCheckTable(int, com.regaltec.rsas.common.xmlparser.CheckTable) 

    /**
     * Method enumerateCheckTable
     */
    public java.util.Enumeration enumerateCheckTable()
    {
        return _checkTableList.elements();
    } //-- java.util.Enumeration enumerateCheckTable() 

    /**
     * Method getCheckTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.CheckTable getCheckTable(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _checkTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.CheckTable) _checkTableList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.CheckTable getCheckTable(int) 

    /**
     * Method getCheckTable
     */
    public com.ccssoft.rsas.common.xmlparser.CheckTable[] getCheckTable()
    {
        int size = _checkTableList.size();
        com.ccssoft.rsas.common.xmlparser.CheckTable[] mArray = new com.ccssoft.rsas.common.xmlparser.CheckTable[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.CheckTable) _checkTableList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.CheckTable[] getCheckTable() 

    /**
     * Method getCheckTableCount
     */
    public int getCheckTableCount()
    {
        return _checkTableList.size();
    } //-- int getCheckTableCount() 

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
     * Method removeAllCheckTable
     */
    public void removeAllCheckTable()
    {
        _checkTableList.removeAllElements();
    } //-- void removeAllCheckTable() 

    /**
     * Method removeCheckTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.CheckTable removeCheckTable(int index)
    {
        java.lang.Object obj = _checkTableList.elementAt(index);
        _checkTableList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.CheckTable) obj;
    } //-- com.regaltec.rsas.common.xmlparser.CheckTable removeCheckTable(int) 

    /**
     * Method setCheckTable
     * 
     * @param index
     * @param vCheckTable
     */
    public void setCheckTable(int index, com.ccssoft.rsas.common.xmlparser.CheckTable vCheckTable)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _checkTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _checkTableList.setElementAt(vCheckTable, index);
    } //-- void setCheckTable(int, com.regaltec.rsas.common.xmlparser.CheckTable) 

    /**
     * Method setCheckTable
     * 
     * @param checkTableArray
     */
    public void setCheckTable(com.ccssoft.rsas.common.xmlparser.CheckTable[] checkTableArray)
    {
        //-- copy array
        _checkTableList.removeAllElements();
        for (int i = 0; i < checkTableArray.length; i++) {
            _checkTableList.addElement(checkTableArray[i]);
        }
    } //-- void setCheckTable(com.regaltec.rsas.common.xmlparser.CheckTable) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.CheckTables) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.CheckTables.class, reader);
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
