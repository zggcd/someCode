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
 * Class Reports.
 * 
 * @version $Revision$ $Date$
 */
public class Reports implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �������
     */
    private java.util.Vector _reportList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Reports() {
        super();
        _reportList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Reports()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addReport
     * 
     * @param vReport
     */
    public void addReport(com.ccssoft.rsas.common.xmlparser.Report vReport)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportList.addElement(vReport);
    } //-- void addReport(com.regaltec.rsas.common.xmlparser.Report) 

    /**
     * Method addReport
     * 
     * @param index
     * @param vReport
     */
    public void addReport(int index, com.ccssoft.rsas.common.xmlparser.Report vReport)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportList.insertElementAt(vReport, index);
    } //-- void addReport(int, com.regaltec.rsas.common.xmlparser.Report) 

    /**
     * Method enumerateReport
     */
    public java.util.Enumeration enumerateReport()
    {
        return _reportList.elements();
    } //-- java.util.Enumeration enumerateReport() 

    /**
     * Method getReport
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Report getReport(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Report) _reportList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Report getReport(int) 

    /**
     * Method getReport
     */
    public com.ccssoft.rsas.common.xmlparser.Report[] getReport()
    {
        int size = _reportList.size();
        com.ccssoft.rsas.common.xmlparser.Report[] mArray = new com.ccssoft.rsas.common.xmlparser.Report[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Report) _reportList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Report[] getReport() 

    /**
     * Method getReportCount
     */
    public int getReportCount()
    {
        return _reportList.size();
    } //-- int getReportCount() 

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
     * Method removeAllReport
     */
    public void removeAllReport()
    {
        _reportList.removeAllElements();
    } //-- void removeAllReport() 

    /**
     * Method removeReport
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Report removeReport(int index)
    {
        java.lang.Object obj = _reportList.elementAt(index);
        _reportList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Report) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Report removeReport(int) 

    /**
     * Method setReport
     * 
     * @param index
     * @param vReport
     */
    public void setReport(int index, com.ccssoft.rsas.common.xmlparser.Report vReport)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _reportList.setElementAt(vReport, index);
    } //-- void setReport(int, com.regaltec.rsas.common.xmlparser.Report) 

    /**
     * Method setReport
     * 
     * @param reportArray
     */
    public void setReport(com.ccssoft.rsas.common.xmlparser.Report[] reportArray)
    {
        //-- copy array
        _reportList.removeAllElements();
        for (int i = 0; i < reportArray.length; i++) {
            _reportList.addElement(reportArray[i]);
        }
    } //-- void setReport(com.regaltec.rsas.common.xmlparser.Report) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Reports) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Reports.class, reader);
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
