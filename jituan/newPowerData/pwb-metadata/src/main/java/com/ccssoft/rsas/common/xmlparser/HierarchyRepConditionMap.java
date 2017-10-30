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
 * �㼶�������ɸѡ������Ӧ��ϵ
 * 
 * @version $Revision$ $Date$
 */
public class HierarchyRepConditionMap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _upperObjectID
     */
    private java.lang.String _upperObjectID;

    /**
     * Field _upperConditionID
     */
    private java.lang.String _upperConditionID;

    /**
     * Field _lowerObjectID
     */
    private java.lang.String _lowerObjectID;

    /**
     * Field _lowerConditionID
     */
    private java.lang.String _lowerConditionID;


      //----------------/
     //- Constructors -/
    //----------------/

    public HierarchyRepConditionMap() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyRepConditionMap()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'lowerConditionID'.
     * 
     * @return the value of field 'lowerConditionID'.
     */
    public java.lang.String getLowerConditionID()
    {
        return this._lowerConditionID;
    } //-- java.lang.String getLowerConditionID() 

    /**
     * Returns the value of field 'lowerObjectID'.
     * 
     * @return the value of field 'lowerObjectID'.
     */
    public java.lang.String getLowerObjectID()
    {
        return this._lowerObjectID;
    } //-- java.lang.String getLowerObjectID() 

    /**
     * Returns the value of field 'upperConditionID'.
     * 
     * @return the value of field 'upperConditionID'.
     */
    public java.lang.String getUpperConditionID()
    {
        return this._upperConditionID;
    } //-- java.lang.String getUpperConditionID() 

    /**
     * Returns the value of field 'upperObjectID'.
     * 
     * @return the value of field 'upperObjectID'.
     */
    public java.lang.String getUpperObjectID()
    {
        return this._upperObjectID;
    } //-- java.lang.String getUpperObjectID() 

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
     * Sets the value of field 'lowerConditionID'.
     * 
     * @param lowerConditionID the value of field 'lowerConditionID'
     */
    public void setLowerConditionID(java.lang.String lowerConditionID)
    {
        this._lowerConditionID = lowerConditionID;
    } //-- void setLowerConditionID(java.lang.String) 

    /**
     * Sets the value of field 'lowerObjectID'.
     * 
     * @param lowerObjectID the value of field 'lowerObjectID'.
     */
    public void setLowerObjectID(java.lang.String lowerObjectID)
    {
        this._lowerObjectID = lowerObjectID;
    } //-- void setLowerObjectID(java.lang.String) 

    /**
     * Sets the value of field 'upperConditionID'.
     * 
     * @param upperConditionID the value of field 'upperConditionID'
     */
    public void setUpperConditionID(java.lang.String upperConditionID)
    {
        this._upperConditionID = upperConditionID;
    } //-- void setUpperConditionID(java.lang.String) 

    /**
     * Sets the value of field 'upperObjectID'.
     * 
     * @param upperObjectID the value of field 'upperObjectID'.
     */
    public void setUpperObjectID(java.lang.String upperObjectID)
    {
        this._upperObjectID = upperObjectID;
    } //-- void setUpperObjectID(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.HierarchyRepConditionMap) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.HierarchyRepConditionMap.class, reader);
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
