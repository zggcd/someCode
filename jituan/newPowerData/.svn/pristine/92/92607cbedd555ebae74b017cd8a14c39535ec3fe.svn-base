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
 * Class EvaluationReportSequence.
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationReportSequence implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���õı������
     */
    private java.util.Vector _refReportList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EvaluationReportSequence() {
        super();
        _refReportList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationReportSequence()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addRefReport
     * 
     * @param vRefReport
     */
    public void addRefReport(com.ccssoft.rsas.common.xmlparser.RefReport vRefReport)
        throws java.lang.IndexOutOfBoundsException
    {
        _refReportList.addElement(vRefReport);
    } //-- void addRefReport(com.regaltec.rsas.common.xmlparser.RefReport) 

    /**
     * Method addRefReport
     * 
     * @param index
     * @param vRefReport
     */
    public void addRefReport(int index, com.ccssoft.rsas.common.xmlparser.RefReport vRefReport)
        throws java.lang.IndexOutOfBoundsException
    {
        _refReportList.insertElementAt(vRefReport, index);
    } //-- void addRefReport(int, com.regaltec.rsas.common.xmlparser.RefReport) 

    /**
     * Method enumerateRefReport
     */
    public java.util.Enumeration enumerateRefReport()
    {
        return _refReportList.elements();
    } //-- java.util.Enumeration enumerateRefReport() 

    /**
     * Method getRefReport
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.RefReport getRefReport(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _refReportList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.RefReport) _refReportList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.RefReport getRefReport(int) 

    /**
     * Method getRefReport
     */
    public com.ccssoft.rsas.common.xmlparser.RefReport[] getRefReport()
    {
        int size = _refReportList.size();
        com.ccssoft.rsas.common.xmlparser.RefReport[] mArray = new com.ccssoft.rsas.common.xmlparser.RefReport[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.RefReport) _refReportList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.RefReport[] getRefReport() 

    /**
     * Method getRefReportCount
     */
    public int getRefReportCount()
    {
        return _refReportList.size();
    } //-- int getRefReportCount() 

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
     * Method removeAllRefReport
     */
    public void removeAllRefReport()
    {
        _refReportList.removeAllElements();
    } //-- void removeAllRefReport() 

    /**
     * Method removeRefReport
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.RefReport removeRefReport(int index)
    {
        java.lang.Object obj = _refReportList.elementAt(index);
        _refReportList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.RefReport) obj;
    } //-- com.regaltec.rsas.common.xmlparser.RefReport removeRefReport(int) 

    /**
     * Method setRefReport
     * 
     * @param index
     * @param vRefReport
     */
    public void setRefReport(int index, com.ccssoft.rsas.common.xmlparser.RefReport vRefReport)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _refReportList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _refReportList.setElementAt(vRefReport, index);
    } //-- void setRefReport(int, com.regaltec.rsas.common.xmlparser.RefReport) 

    /**
     * Method setRefReport
     * 
     * @param refReportArray
     */
    public void setRefReport(com.ccssoft.rsas.common.xmlparser.RefReport[] refReportArray)
    {
        //-- copy array
        _refReportList.removeAllElements();
        for (int i = 0; i < refReportArray.length; i++) {
            _refReportList.addElement(refReportArray[i]);
        }
    } //-- void setRefReport(com.regaltec.rsas.common.xmlparser.RefReport) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.EvaluationReportSequence) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.EvaluationReportSequence.class, reader);
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
