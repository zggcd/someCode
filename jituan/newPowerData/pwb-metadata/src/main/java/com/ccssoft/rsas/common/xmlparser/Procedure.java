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
 * ����Ҫ���еĴ洢����
 * 
 * @version $Revision$ $Date$
 */
public class Procedure implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _procedureName
     */
    private java.lang.String _procedureName;

    /**
     * Field _linkID
     */
    private java.lang.String _linkID;

    /**
     * �洢���̵Ĵ���
     */
    private java.lang.String _procCode;

    /**
     * Field _procedureParams
     */
    private com.ccssoft.rsas.common.xmlparser.ProcedureParams _procedureParams;


      //----------------/
     //- Constructors -/
    //----------------/

    public Procedure() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Procedure()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'linkID'.
     * 
     * @return the value of field 'linkID'.
     */
    public java.lang.String getLinkID()
    {
        return this._linkID;
    } //-- java.lang.String getLinkID() 

    /**
     * Returns the value of field 'procCode'. The field 'procCode'
     * has the following description: �洢���̵Ĵ���
     * 
     * @return the value of field 'procCode'.
     */
    public java.lang.String getProcCode()
    {
        return this._procCode;
    } //-- java.lang.String getProcCode() 

    /**
     * Returns the value of field 'procedureName'.
     * 
     * @return the value of field 'procedureName'.
     */
    public java.lang.String getProcedureName()
    {
        return this._procedureName;
    } //-- java.lang.String getProcedureName() 

    /**
     * Returns the value of field 'procedureParams'.
     * 
     * @return the value of field 'procedureParams'.
     */
    public com.ccssoft.rsas.common.xmlparser.ProcedureParams getProcedureParams()
    {
        return this._procedureParams;
    } //-- com.regaltec.rsas.common.xmlparser.ProcedureParams getProcedureParams() 

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
     * Sets the value of field 'linkID'.
     * 
     * @param linkID the value of field 'linkID'.
     */
    public void setLinkID(java.lang.String linkID)
    {
        this._linkID = linkID;
    } //-- void setLinkID(java.lang.String) 

    /**
     * Sets the value of field 'procCode'. The field 'procCode' has
     * the following description: �洢���̵Ĵ���
     * 
     * @param procCode the value of field 'procCode'.
     */
    public void setProcCode(java.lang.String procCode)
    {
        this._procCode = procCode;
    } //-- void setProcCode(java.lang.String) 

    /**
     * Sets the value of field 'procedureName'.
     * 
     * @param procedureName the value of field 'procedureName'.
     */
    public void setProcedureName(java.lang.String procedureName)
    {
        this._procedureName = procedureName;
    } //-- void setProcedureName(java.lang.String) 

    /**
     * Sets the value of field 'procedureParams'.
     * 
     * @param procedureParams the value of field 'procedureParams'.
     */
    public void setProcedureParams(com.ccssoft.rsas.common.xmlparser.ProcedureParams procedureParams)
    {
        this._procedureParams = procedureParams;
    } //-- void setProcedureParams(com.regaltec.rsas.common.xmlparser.ProcedureParams) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Procedure) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Procedure.class, reader);
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
