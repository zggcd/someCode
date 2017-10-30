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
 * Class ReportConditions.
 * 
 * @version $Revision$ $Date$
 */
public class ReportConditions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportConditionList
     */
    private java.util.Vector _reportConditionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportConditions() {
        super();
        _reportConditionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ReportConditions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addReportCondition
     * 
     * @param vReportCondition
     */
    public void addReportCondition(com.ccssoft.rsas.common.xmlparser.ReportCondition vReportCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportConditionList.addElement(vReportCondition);
    } //-- void addReportCondition(com.regaltec.rsas.common.xmlparser.ReportCondition) 

    /**
     * Method addReportCondition
     * 
     * @param index
     * @param vReportCondition
     */
    public void addReportCondition(int index, com.ccssoft.rsas.common.xmlparser.ReportCondition vReportCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _reportConditionList.insertElementAt(vReportCondition, index);
    } //-- void addReportCondition(int, com.regaltec.rsas.common.xmlparser.ReportCondition) 

    /**
     * Method enumerateReportCondition
     */
    public java.util.Enumeration enumerateReportCondition()
    {
        return _reportConditionList.elements();
    } //-- java.util.Enumeration enumerateReportCondition() 

    /**
     * Method getReportCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportCondition getReportCondition(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ReportCondition) _reportConditionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ReportCondition getReportCondition(int) 

    /**
     * Method getReportCondition
     */
    public com.ccssoft.rsas.common.xmlparser.ReportCondition[] getReportCondition()
    {
        int size = _reportConditionList.size();
        com.ccssoft.rsas.common.xmlparser.ReportCondition[] mArray = new com.ccssoft.rsas.common.xmlparser.ReportCondition[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ReportCondition) _reportConditionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ReportCondition[] getReportCondition() 

    /**
     * Method getReportConditionCount
     */
    public int getReportConditionCount()
    {
        return _reportConditionList.size();
    } //-- int getReportConditionCount() 

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
     * Method removeAllReportCondition
     */
    public void removeAllReportCondition()
    {
        _reportConditionList.removeAllElements();
    } //-- void removeAllReportCondition() 

    /**
     * Method removeReportCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ReportCondition removeReportCondition(int index)
    {
        java.lang.Object obj = _reportConditionList.elementAt(index);
        _reportConditionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ReportCondition) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ReportCondition removeReportCondition(int) 

    /**
     * Method setReportCondition
     * 
     * @param index
     * @param vReportCondition
     */
    public void setReportCondition(int index, com.ccssoft.rsas.common.xmlparser.ReportCondition vReportCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _reportConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _reportConditionList.setElementAt(vReportCondition, index);
    } //-- void setReportCondition(int, com.regaltec.rsas.common.xmlparser.ReportCondition) 

    /**
     * Method setReportCondition
     * 
     * @param reportConditionArray
     */
    public void setReportCondition(com.ccssoft.rsas.common.xmlparser.ReportCondition[] reportConditionArray)
    {
        //-- copy array
        _reportConditionList.removeAllElements();
        for (int i = 0; i < reportConditionArray.length; i++) {
            _reportConditionList.addElement(reportConditionArray[i]);
        }
    } //-- void setReportCondition(com.regaltec.rsas.common.xmlparser.ReportCondition) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReportConditions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReportConditions.class, reader);
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
