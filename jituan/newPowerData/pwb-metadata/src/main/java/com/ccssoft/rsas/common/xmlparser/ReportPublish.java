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
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ReportPublish.
 * 
 * @version $Revision$ $Date$
 */
public class ReportPublish implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportID
     */
    private java.lang.String _reportID;

    /**
     * Field _reportName
     */
    private java.lang.String _reportName;

    /**
     * Field _reportConditions
     */
    private com.ccssoft.rsas.common.xmlparser.ReportConditions _reportConditions;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportPublish() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.ReportPublish()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'reportConditions'.
     * 
     * @return the value of field 'reportConditions'.
     */
    public com.ccssoft.rsas.common.xmlparser.ReportConditions getReportConditions()
    {
        return this._reportConditions;
    } //-- com.regaltec.rsas.common.xmlparser.ReportConditions getReportConditions() 

    /**
     * Returns the value of field 'reportID'.
     * 
     * @return the value of field 'reportID'.
     */
    public java.lang.String getReportID()
    {
        return this._reportID;
    } //-- java.lang.String getReportID() 

    /**
     * Returns the value of field 'reportName'.
     * 
     * @return the value of field 'reportName'.
     */
    public java.lang.String getReportName()
    {
        return this._reportName;
    } //-- java.lang.String getReportName() 

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
     * Sets the value of field 'reportConditions'.
     * 
     * @param reportConditions the value of field 'reportConditions'
     */
    public void setReportConditions(com.ccssoft.rsas.common.xmlparser.ReportConditions reportConditions)
    {
        this._reportConditions = reportConditions;
    } //-- void setReportConditions(com.regaltec.rsas.common.xmlparser.ReportConditions) 

    /**
     * Sets the value of field 'reportID'.
     * 
     * @param reportID the value of field 'reportID'.
     */
    public void setReportID(java.lang.String reportID)
    {
        this._reportID = reportID;
    } //-- void setReportID(java.lang.String) 

    /**
     * Sets the value of field 'reportName'.
     * 
     * @param reportName the value of field 'reportName'.
     */
    public void setReportName(java.lang.String reportName)
    {
        this._reportName = reportName;
    } //-- void setReportName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReportPublish) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReportPublish.class, reader);
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
