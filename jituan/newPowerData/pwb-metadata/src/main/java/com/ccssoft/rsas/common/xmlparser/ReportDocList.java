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
 * Class ReportDocList.
 * 
 * @version $Revision$ $Date$
 */
public class ReportDocList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����ID
     */
    private java.lang.String _reportID;

    /**
     * ��������������ӳ��
     */
    private com.ccssoft.rsas.common.xmlparser.ConditionMaps _conditionMaps;

    /**
     * Field _reportDocs
     */
    private com.ccssoft.rsas.common.xmlparser.ReportDocs _reportDocs;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportDocList() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.ReportDocList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'conditionMaps'. The field
     * 'conditionMaps' has the following description: ��������������ӳ��
     * 
     * @return the value of field 'conditionMaps'.
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionMaps getConditionMaps()
    {
        return this._conditionMaps;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionMaps getConditionMaps() 

    /**
     * Returns the value of field 'reportDocs'.
     * 
     * @return the value of field 'reportDocs'.
     */
    public com.ccssoft.rsas.common.xmlparser.ReportDocs getReportDocs()
    {
        return this._reportDocs;
    } //-- com.regaltec.rsas.common.xmlparser.ReportDocs getReportDocs() 

    /**
     * Returns the value of field 'reportID'. The field 'reportID'
     * has the following description: ����ID
     * 
     * @return the value of field 'reportID'.
     */
    public java.lang.String getReportID()
    {
        return this._reportID;
    } //-- java.lang.String getReportID() 

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
     * Sets the value of field 'conditionMaps'. The field
     * 'conditionMaps' has the following description: ��������������ӳ��
     * 
     * @param conditionMaps the value of field 'conditionMaps'.
     */
    public void setConditionMaps(com.ccssoft.rsas.common.xmlparser.ConditionMaps conditionMaps)
    {
        this._conditionMaps = conditionMaps;
    } //-- void setConditionMaps(com.regaltec.rsas.common.xmlparser.ConditionMaps) 

    /**
     * Sets the value of field 'reportDocs'.
     * 
     * @param reportDocs the value of field 'reportDocs'.
     */
    public void setReportDocs(com.ccssoft.rsas.common.xmlparser.ReportDocs reportDocs)
    {
        this._reportDocs = reportDocs;
    } //-- void setReportDocs(com.regaltec.rsas.common.xmlparser.ReportDocs) 

    /**
     * Sets the value of field 'reportID'. The field 'reportID' has
     * the following description: ����ID
     * 
     * @param reportID the value of field 'reportID'.
     */
    public void setReportID(java.lang.String reportID)
    {
        this._reportID = reportID;
    } //-- void setReportID(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReportDocList) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReportDocList.class, reader);
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
