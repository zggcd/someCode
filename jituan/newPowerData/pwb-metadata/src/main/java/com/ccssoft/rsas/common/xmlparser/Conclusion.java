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
 * ����
 * 
 * @version $Revision$ $Date$
 */
public class Conclusion implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����ID
     */
    private java.lang.String _reportID;

    /**
     * ��ѯID
     */
    private java.lang.String _queryID;

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _desc
     */
    private java.lang.String _desc;

    /**
     * ����������
     */
    private com.ccssoft.rsas.common.xmlparser.Relation _relation;

    /**
     * Field _conclusionReturns
     */
    private com.ccssoft.rsas.common.xmlparser.ConclusionReturns _conclusionReturns;


      //----------------/
     //- Constructors -/
    //----------------/

    public Conclusion() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.Conclusion()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'conclusionReturns'.
     * 
     * @return the value of field 'conclusionReturns'.
     */
    public com.ccssoft.rsas.common.xmlparser.ConclusionReturns getConclusionReturns()
    {
        return this._conclusionReturns;
    } //-- com.regaltec.rsas.common.xmlparser.ConclusionReturns getConclusionReturns() 

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'desc'.
     */
    public java.lang.String getDesc()
    {
        return this._desc;
    } //-- java.lang.String getDesc() 

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
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'queryID'. The field 'queryID'
     * has the following description: ��ѯID
     * 
     * @return the value of field 'queryID'.
     */
    public java.lang.String getQueryID()
    {
        return this._queryID;
    } //-- java.lang.String getQueryID() 

    /**
     * Returns the value of field 'relation'. The field 'relation'
     * has the following description: ����������
     * 
     * @return the value of field 'relation'.
     */
    public com.ccssoft.rsas.common.xmlparser.Relation getRelation()
    {
        return this._relation;
    } //-- com.regaltec.rsas.common.xmlparser.Relation getRelation() 

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
     * Sets the value of field 'conclusionReturns'.
     * 
     * @param conclusionReturns the value of field
     * 'conclusionReturns'.
     */
    public void setConclusionReturns(com.ccssoft.rsas.common.xmlparser.ConclusionReturns conclusionReturns)
    {
        this._conclusionReturns = conclusionReturns;
    } //-- void setConclusionReturns(com.regaltec.rsas.common.xmlparser.ConclusionReturns) 

    /**
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(java.lang.String desc)
    {
        this._desc = desc;
    } //-- void setDesc(java.lang.String) 

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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'queryID'. The field 'queryID' has
     * the following description: ��ѯID
     * 
     * @param queryID the value of field 'queryID'.
     */
    public void setQueryID(java.lang.String queryID)
    {
        this._queryID = queryID;
    } //-- void setQueryID(java.lang.String) 

    /**
     * Sets the value of field 'relation'. The field 'relation' has
     * the following description: ����������
     * 
     * @param relation the value of field 'relation'.
     */
    public void setRelation(com.ccssoft.rsas.common.xmlparser.Relation relation)
    {
        this._relation = relation;
    } //-- void setRelation(com.regaltec.rsas.common.xmlparser.Relation) 

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
        return (com.ccssoft.rsas.common.xmlparser.Conclusion) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Conclusion.class, reader);
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
