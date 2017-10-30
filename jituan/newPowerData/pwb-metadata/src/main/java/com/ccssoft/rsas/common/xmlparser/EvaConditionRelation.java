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
 * ����ɸѡ����������ɸѡ����������ϵ
 * 
 * @version $Revision$ $Date$
 */
public class EvaConditionRelation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����������ID
     */
    private java.lang.String _pubConditionID;

    /**
     * Field _destEvaID
     */
    private java.lang.String _destEvaID;

    /**
     * Field _destConditionID
     */
    private java.lang.String _destConditionID;


      //----------------/
     //- Constructors -/
    //----------------/

    public EvaConditionRelation() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.EvaConditionRelation()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'destConditionID'.
     * 
     * @return the value of field 'destConditionID'.
     */
    public java.lang.String getDestConditionID()
    {
        return this._destConditionID;
    } //-- java.lang.String getDestConditionID() 

    /**
     * Returns the value of field 'destEvaID'.
     * 
     * @return the value of field 'destEvaID'.
     */
    public java.lang.String getDestEvaID()
    {
        return this._destEvaID;
    } //-- java.lang.String getDestEvaID() 

    /**
     * Returns the value of field 'pubConditionID'. The field
     * 'pubConditionID' has the following description: ����������ID
     * 
     * @return the value of field 'pubConditionID'.
     */
    public java.lang.String getPubConditionID()
    {
        return this._pubConditionID;
    } //-- java.lang.String getPubConditionID() 

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
     * Sets the value of field 'destConditionID'.
     * 
     * @param destConditionID the value of field 'destConditionID'.
     */
    public void setDestConditionID(java.lang.String destConditionID)
    {
        this._destConditionID = destConditionID;
    } //-- void setDestConditionID(java.lang.String) 

    /**
     * Sets the value of field 'destEvaID'.
     * 
     * @param destEvaID the value of field 'destEvaID'.
     */
    public void setDestEvaID(java.lang.String destEvaID)
    {
        this._destEvaID = destEvaID;
    } //-- void setDestEvaID(java.lang.String) 

    /**
     * Sets the value of field 'pubConditionID'. The field
     * 'pubConditionID' has the following description: ����������ID
     * 
     * @param pubConditionID the value of field 'pubConditionID'.
     */
    public void setPubConditionID(java.lang.String pubConditionID)
    {
        this._pubConditionID = pubConditionID;
    } //-- void setPubConditionID(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.EvaConditionRelation) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.EvaConditionRelation.class, reader);
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
