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
 * ����Ȩ�����ӷ��䵽ɸѡ��ӳ�����
 * 
 * @version $Revision$ $Date$
 */
public class DivDistributer implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _desc
     */
    private java.lang.String _desc;

    /**
     * Field _joinFieldName
     */
    private java.lang.String _joinFieldName;

    /**
     * ����Ȩ������
     */
    private com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv _dataAuthorityDiv;

    /**
     * ����ɸѡ��������
     */
    private com.ccssoft.rsas.common.xmlparser.Condition _condition;


      //----------------/
     //- Constructors -/
    //----------------/

    public DivDistributer() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.DivDistributer()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'condition'. The field
     * 'condition' has the following description: ����ɸѡ��������
     * 
     * @return the value of field 'condition'.
     */
    public com.ccssoft.rsas.common.xmlparser.Condition getCondition()
    {
        return this._condition;
    } //-- com.regaltec.rsas.common.xmlparser.Condition getCondition() 

    /**
     * Returns the value of field 'dataAuthorityDiv'. The field
     * 'dataAuthorityDiv' has the following description: ����Ȩ������
     * 
     * @return the value of field 'dataAuthorityDiv'.
     */
    public com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv getDataAuthorityDiv()
    {
        return this._dataAuthorityDiv;
    } //-- com.regaltec.rsas.common.xmlparser.DataAuthorityDiv getDataAuthorityDiv() 

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
     * Returns the value of field 'joinFieldName'.
     * 
     * @return the value of field 'joinFieldName'.
     */
    public java.lang.String getJoinFieldName()
    {
        return this._joinFieldName;
    } //-- java.lang.String getJoinFieldName() 

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
     * Sets the value of field 'condition'. The field 'condition'
     * has the following description: ����ɸѡ��������
     * 
     * @param condition the value of field 'condition'.
     */
    public void setCondition(com.ccssoft.rsas.common.xmlparser.Condition condition)
    {
        this._condition = condition;
    } //-- void setCondition(com.regaltec.rsas.common.xmlparser.Condition) 

    /**
     * Sets the value of field 'dataAuthorityDiv'. The field
     * 'dataAuthorityDiv' has the following description: ����Ȩ������
     * 
     * @param dataAuthorityDiv the value of field 'dataAuthorityDiv'
     */
    public void setDataAuthorityDiv(com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv dataAuthorityDiv)
    {
        this._dataAuthorityDiv = dataAuthorityDiv;
    } //-- void setDataAuthorityDiv(com.regaltec.rsas.common.xmlparser.DataAuthorityDiv) 

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
     * Sets the value of field 'joinFieldName'.
     * 
     * @param joinFieldName the value of field 'joinFieldName'.
     */
    public void setJoinFieldName(java.lang.String joinFieldName)
    {
        this._joinFieldName = joinFieldName;
    } //-- void setJoinFieldName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DivDistributer) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DivDistributer.class, reader);
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
