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
 * ����Ԫ���ݿ��޹أ�
 * 
 * @version $Revision$ $Date$
 */
public class ReportResults implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����Ľ������Ԫ���ݿ��޹أ�
     */
    private java.util.Vector _reportResultList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportResults() {
        super();
        _reportResultList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ReportResults()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addReportResult
     * 
     * @param vReportResult
     */
    public void addReportResult(com.ccssoft.rsas.common.xmlparser.ReportResult vReportResult)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportResultList.addElement(vReportResult);
    } //-- void addReportResult(com.regaltec.rsas.common.xmlparser.ReportResult) 

    /**
     * Method addReportResult
     * 
     * @param index
     * @param vReportResult
     */
    public void addReportResult(int index, com.ccssoft.rsas.common.xmlparser.ReportResult vReportResult)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportResultList.insertElementAt(vReportResult, index);
    } //-- void addReportResult(int, com.regaltec.rsas.common.xmlparser.ReportResult) 

    /**
     * Method enumerateReportResult
     */
    public java.util.Enumeration enumerateReportResult()
    {
        return _reportResultList.elements();
    } //-- java.util.Enumeration enumerateReportResult() 

    /**
     * Method getReportResult
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportResult getReportResult(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportResultList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ReportResult) _reportResultList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ReportResult getReportResult(int) 

    /**
     * Method getReportResult
     */
    public com.ccssoft.rsas.common.xmlparser.ReportResult[] getReportResult()
    {
        int size = _reportResultList.size();
        com.ccssoft.rsas.common.xmlparser.ReportResult[] mArray = new com.ccssoft.rsas.common.xmlparser.ReportResult[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ReportResult) _reportResultList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ReportResult[] getReportResult() 

    /**
     * Method getReportResultCount
     */
    public int getReportResultCount()
    {
        return _reportResultList.size();
    } //-- int getReportResultCount() 

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
     * Method removeAllReportResult
     */
    public void removeAllReportResult()
    {
        _reportResultList.removeAllElements();
    } //-- void removeAllReportResult() 

    /**
     * Method removeReportResult
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportResult removeReportResult(int index)
    {
        java.lang.Object obj = _reportResultList.elementAt(index);
        _reportResultList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ReportResult) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ReportResult removeReportResult(int) 

    /**
     * Method setReportResult
     * 
     * @param index
     * @param vReportResult
     */
    public void setReportResult(int index, com.ccssoft.rsas.common.xmlparser.ReportResult vReportResult)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportResultList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _reportResultList.setElementAt(vReportResult, index);
    } //-- void setReportResult(int, com.regaltec.rsas.common.xmlparser.ReportResult) 

    /**
     * Method setReportResult
     * 
     * @param reportResultArray
     */
    public void setReportResult(com.ccssoft.rsas.common.xmlparser.ReportResult[] reportResultArray)
    {
        //-- copy array
        _reportResultList.removeAllElements();
        for (int i = 0; i < reportResultArray.length; i++) {
            _reportResultList.addElement(reportResultArray[i]);
        }
    } //-- void setReportResult(com.regaltec.rsas.common.xmlparser.ReportResult) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReportResults) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReportResults.class, reader);
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
