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

import com.ccssoft.rsas.common.xmlparser.types.EvaluationReportDrillOrderTypeType;

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
 * Class EvaluationReport.
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationReport implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _reportID
     */
    private java.lang.String _reportID;

    /**
     * Field _drillOrderType
     */
    private com.ccssoft.rsas.common.xmlparser.types.EvaluationReportDrillOrderTypeType _drillOrderType;

    /**
     * Field _evaluationConditionValues
     */
    private com.ccssoft.rsas.common.xmlparser.EvaluationConditionValues _evaluationConditionValues;

    /**
     * Field _evaluationReportSequence
     */
    private com.ccssoft.rsas.common.xmlparser.EvaluationReportSequence _evaluationReportSequence;


      //----------------/
     //- Constructors -/
    //----------------/

    public EvaluationReport() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationReport()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'drillOrderType'.
     * 
     * @return the value of field 'drillOrderType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.EvaluationReportDrillOrderTypeType getDrillOrderType()
    {
        return this._drillOrderType;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationReportDrillOrderTypeType getDrillOrderType() 

    /**
     * Returns the value of field 'evaluationConditionValues'.
     * 
     * @return the value of field 'evaluationConditionValues'.
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationConditionValues getEvaluationConditionValues()
    {
        return this._evaluationConditionValues;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationConditionValues getEvaluationConditionValues() 

    /**
     * Returns the value of field 'evaluationReportSequence'.
     * 
     * @return the value of field 'evaluationReportSequence'.
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationReportSequence getEvaluationReportSequence()
    {
        return this._evaluationReportSequence;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationReportSequence getEvaluationReportSequence() 

    /**
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

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
     * Sets the value of field 'drillOrderType'.
     * 
     * @param drillOrderType the value of field 'drillOrderType'.
     */
    public void setDrillOrderType(com.ccssoft.rsas.common.xmlparser.types.EvaluationReportDrillOrderTypeType drillOrderType)
    {
        this._drillOrderType = drillOrderType;
    } //-- void setDrillOrderType(com.regaltec.rsas.common.xmlparser.types.EvaluationReportDrillOrderTypeType) 

    /**
     * Sets the value of field 'evaluationConditionValues'.
     * 
     * @param evaluationConditionValues the value of field
     * 'evaluationConditionValues'.
     */
    public void setEvaluationConditionValues(com.ccssoft.rsas.common.xmlparser.EvaluationConditionValues evaluationConditionValues)
    {
        this._evaluationConditionValues = evaluationConditionValues;
    } //-- void setEvaluationConditionValues(com.regaltec.rsas.common.xmlparser.EvaluationConditionValues) 

    /**
     * Sets the value of field 'evaluationReportSequence'.
     * 
     * @param evaluationReportSequence the value of field
     * 'evaluationReportSequence'.
     */
    public void setEvaluationReportSequence(com.ccssoft.rsas.common.xmlparser.EvaluationReportSequence evaluationReportSequence)
    {
        this._evaluationReportSequence = evaluationReportSequence;
    } //-- void setEvaluationReportSequence(com.regaltec.rsas.common.xmlparser.EvaluationReportSequence) 

    /**
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

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
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.EvaluationReport) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.EvaluationReport.class, reader);
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
