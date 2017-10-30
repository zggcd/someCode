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
 * Class MIDReports.
 * 
 * @version $Revision$ $Date$
 */
public class MIDReports implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �ƶ�����
     */
    private java.util.Vector _MIDReportList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MIDReports() {
        super();
        _MIDReportList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MIDReports()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMIDReport
     * 
     * @param vMIDReport
     */
    public void addMIDReport(com.ccssoft.rsas.common.xmlparser.MIDReport vMIDReport)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDReportList.addElement(vMIDReport);
    } //-- void addMIDReport(com.regaltec.rsas.common.xmlparser.MIDReport) 

    /**
     * Method addMIDReport
     * 
     * @param index
     * @param vMIDReport
     */
    public void addMIDReport(int index, com.ccssoft.rsas.common.xmlparser.MIDReport vMIDReport)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDReportList.insertElementAt(vMIDReport, index);
    } //-- void addMIDReport(int, com.regaltec.rsas.common.xmlparser.MIDReport) 

    /**
     * Method enumerateMIDReport
     */
    public java.util.Enumeration enumerateMIDReport()
    {
        return _MIDReportList.elements();
    } //-- java.util.Enumeration enumerateMIDReport() 

    /**
     * Method getMIDReport
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDReport getMIDReport(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDReportList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MIDReport) _MIDReportList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MIDReport getMIDReport(int) 

    /**
     * Method getMIDReport
     */
    public com.ccssoft.rsas.common.xmlparser.MIDReport[] getMIDReport()
    {
        int size = _MIDReportList.size();
        com.ccssoft.rsas.common.xmlparser.MIDReport[] mArray = new com.ccssoft.rsas.common.xmlparser.MIDReport[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MIDReport) _MIDReportList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MIDReport[] getMIDReport() 

    /**
     * Method getMIDReportCount
     */
    public int getMIDReportCount()
    {
        return _MIDReportList.size();
    } //-- int getMIDReportCount() 

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
     * Method removeAllMIDReport
     */
    public void removeAllMIDReport()
    {
        _MIDReportList.removeAllElements();
    } //-- void removeAllMIDReport() 

    /**
     * Method removeMIDReport
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDReport removeMIDReport(int index)
    {
        java.lang.Object obj = _MIDReportList.elementAt(index);
        _MIDReportList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MIDReport) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MIDReport removeMIDReport(int) 

    /**
     * Method setMIDReport
     * 
     * @param index
     * @param vMIDReport
     */
    public void setMIDReport(int index, com.ccssoft.rsas.common.xmlparser.MIDReport vMIDReport)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDReportList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _MIDReportList.setElementAt(vMIDReport, index);
    } //-- void setMIDReport(int, com.regaltec.rsas.common.xmlparser.MIDReport) 

    /**
     * Method setMIDReport
     * 
     * @param MIDReportArray
     */
    public void setMIDReport(com.ccssoft.rsas.common.xmlparser.MIDReport[] MIDReportArray)
    {
        //-- copy array
        _MIDReportList.removeAllElements();
        for (int i = 0; i < MIDReportArray.length; i++) {
            _MIDReportList.addElement(MIDReportArray[i]);
        }
    } //-- void setMIDReport(com.regaltec.rsas.common.xmlparser.MIDReport) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MIDReports) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MIDReports.class, reader);
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
