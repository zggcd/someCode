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
 * �ϱ����ݱ����
 * 
 * @version $Revision$ $Date$
 */
public class ReportTables implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �ϱ����ݱ����
     */
    private java.util.Vector _reportTableList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportTables() {
        super();
        _reportTableList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ReportTables()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addReportTable
     * 
     * @param vReportTable
     */
    public void addReportTable(com.ccssoft.rsas.common.xmlparser.ReportTable vReportTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportTableList.addElement(vReportTable);
    } //-- void addReportTable(com.regaltec.rsas.common.xmlparser.ReportTable) 

    /**
     * Method addReportTable
     * 
     * @param index
     * @param vReportTable
     */
    public void addReportTable(int index, com.ccssoft.rsas.common.xmlparser.ReportTable vReportTable)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportTableList.insertElementAt(vReportTable, index);
    } //-- void addReportTable(int, com.regaltec.rsas.common.xmlparser.ReportTable) 

    /**
     * Method enumerateReportTable
     */
    public java.util.Enumeration enumerateReportTable()
    {
        return _reportTableList.elements();
    } //-- java.util.Enumeration enumerateReportTable() 

    /**
     * Method getReportTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportTable getReportTable(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ReportTable) _reportTableList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ReportTable getReportTable(int) 

    /**
     * Method getReportTable
     */
    public com.ccssoft.rsas.common.xmlparser.ReportTable[] getReportTable()
    {
        int size = _reportTableList.size();
        com.ccssoft.rsas.common.xmlparser.ReportTable[] mArray = new com.ccssoft.rsas.common.xmlparser.ReportTable[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ReportTable) _reportTableList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ReportTable[] getReportTable() 

    /**
     * Method getReportTableCount
     */
    public int getReportTableCount()
    {
        return _reportTableList.size();
    } //-- int getReportTableCount() 

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
     * Method removeAllReportTable
     */
    public void removeAllReportTable()
    {
        _reportTableList.removeAllElements();
    } //-- void removeAllReportTable() 

    /**
     * Method removeReportTable
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportTable removeReportTable(int index)
    {
        java.lang.Object obj = _reportTableList.elementAt(index);
        _reportTableList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ReportTable) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ReportTable removeReportTable(int) 

    /**
     * Method setReportTable
     * 
     * @param index
     * @param vReportTable
     */
    public void setReportTable(int index, com.ccssoft.rsas.common.xmlparser.ReportTable vReportTable)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportTableList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _reportTableList.setElementAt(vReportTable, index);
    } //-- void setReportTable(int, com.regaltec.rsas.common.xmlparser.ReportTable) 

    /**
     * Method setReportTable
     * 
     * @param reportTableArray
     */
    public void setReportTable(com.ccssoft.rsas.common.xmlparser.ReportTable[] reportTableArray)
    {
        //-- copy array
        _reportTableList.removeAllElements();
        for (int i = 0; i < reportTableArray.length; i++) {
            _reportTableList.addElement(reportTableArray[i]);
        }
    } //-- void setReportTable(com.regaltec.rsas.common.xmlparser.ReportTable) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReportTables) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReportTables.class, reader);
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
