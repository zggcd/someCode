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
 * Class Measures.
 * 
 * @version $Revision$ $Date$
 */
public class Measures implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _measureTableList
     */
    private java.util.Vector _measureTableList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Measures() {
        super();
        _measureTableList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Measures()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMeasureTable
     * 
     * @param vMeasureTable
     */
    public void addMeasureTable(com.ccssoft.rsas.common.xmlparser.MeasureTable vMeasureTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _measureTableList.addElement(vMeasureTable);
    } //-- void addMeasureTable(com.regaltec.rsas.common.xmlparser.MeasureTable) 

    /**
     * Method addMeasureTable
     * 
     * @param index
     * @param vMeasureTable
     */
    public void addMeasureTable(int index, com.ccssoft.rsas.common.xmlparser.MeasureTable vMeasureTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _measureTableList.insertElementAt(vMeasureTable, index);
    } //-- void addMeasureTable(int, com.regaltec.rsas.common.xmlparser.MeasureTable) 

    /**
     * Method enumerateMeasureTable
     */
    public java.util.Enumeration enumerateMeasureTable()
    {
        return _measureTableList.elements();
    } //-- java.util.Enumeration enumerateMeasureTable() 

    /**
     * Method getMeasureTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureTable getMeasureTable(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _measureTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MeasureTable) _measureTableList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MeasureTable getMeasureTable(int) 

    /**
     * Method getMeasureTable
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureTable[] getMeasureTable()
    {
        int size = _measureTableList.size();
        com.ccssoft.rsas.common.xmlparser.MeasureTable[] mArray = new com.ccssoft.rsas.common.xmlparser.MeasureTable[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MeasureTable) _measureTableList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MeasureTable[] getMeasureTable() 

    /**
     * Method getMeasureTableCount
     */
    public int getMeasureTableCount()
    {
        return _measureTableList.size();
    } //-- int getMeasureTableCount() 

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
     * Method removeAllMeasureTable
     */
    public void removeAllMeasureTable()
    {
        _measureTableList.removeAllElements();
    } //-- void removeAllMeasureTable() 

    /**
     * Method removeMeasureTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureTable removeMeasureTable(int index)
    {
        java.lang.Object obj = _measureTableList.elementAt(index);
        _measureTableList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MeasureTable) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MeasureTable removeMeasureTable(int) 

    /**
     * Method setMeasureTable
     * 
     * @param index
     * @param vMeasureTable
     */
    public void setMeasureTable(int index, com.ccssoft.rsas.common.xmlparser.MeasureTable vMeasureTable)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _measureTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _measureTableList.setElementAt(vMeasureTable, index);
    } //-- void setMeasureTable(int, com.regaltec.rsas.common.xmlparser.MeasureTable) 

    /**
     * Method setMeasureTable
     * 
     * @param measureTableArray
     */
    public void setMeasureTable(com.ccssoft.rsas.common.xmlparser.MeasureTable[] measureTableArray)
    {
        //-- copy array
        _measureTableList.removeAllElements();
        for (int i = 0; i < measureTableArray.length; i++) {
            _measureTableList.addElement(measureTableArray[i]);
        }
    } //-- void setMeasureTable(com.regaltec.rsas.common.xmlparser.MeasureTable) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Measures) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Measures.class, reader);
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
