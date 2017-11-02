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

import com.ccssoft.rsas.common.xmlparser.types.EvaluationTemplateTemplateTypeType;
import com.ccssoft.rsas.common.xmlparser.types.ReportResultEncodeTypeType;

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
 * ����ģ��
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationTemplate implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ģ������
     */
    private com.ccssoft.rsas.common.xmlparser.types.EvaluationTemplateTemplateTypeType _templateType;

    /**
     * ���ݵı��뷽ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.types.ReportResultEncodeTypeType _encodeType;

    /**
     * ģ�屣������
     */
    private java.lang.String _modality;

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


      //----------------/
     //- Constructors -/
    //----------------/

    public EvaluationTemplate() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationTemplate()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'encodeType'. The field
     * 'encodeType' has the following description: ���ݵı��뷽ʽ
     * 
     * @return the value of field 'encodeType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.ReportResultEncodeTypeType getEncodeType()
    {
        return this._encodeType;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportResultEncodeTypeType getEncodeType() 

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
     * Returns the value of field 'modality'. The field 'modality'
     * has the following description: ģ�屣������
     * 
     * @return the value of field 'modality'.
     */
    public java.lang.String getModality()
    {
        return this._modality;
    } //-- java.lang.String getModality() 

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
     * Returns the value of field 'templateType'. The field
     * 'templateType' has the following description: ģ������
     * 
     * @return the value of field 'templateType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.EvaluationTemplateTemplateTypeType getTemplateType()
    {
        return this._templateType;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationTemplateTemplateTypeType getTemplateType() 

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
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(java.lang.String desc)
    {
        this._desc = desc;
    } //-- void setDesc(java.lang.String) 

    /**
     * Sets the value of field 'encodeType'. The field 'encodeType'
     * has the following description: ���ݵı��뷽ʽ
     * 
     * @param encodeType the value of field 'encodeType'.
     */
    public void setEncodeType(com.ccssoft.rsas.common.xmlparser.types.ReportResultEncodeTypeType encodeType)
    {
        this._encodeType = encodeType;
    } //-- void setEncodeType(com.regaltec.rsas.common.xmlparser.types.ReportResultEncodeTypeType) 

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
     * Sets the value of field 'modality'. The field 'modality' has
     * the following description: ģ�屣������
     * 
     * @param modality the value of field 'modality'.
     */
    public void setModality(java.lang.String modality)
    {
        this._modality = modality;
    } //-- void setModality(java.lang.String) 

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
     * Sets the value of field 'templateType'. The field
     * 'templateType' has the following description: ģ������
     * 
     * @param templateType the value of field 'templateType'.
     */
    public void setTemplateType(com.ccssoft.rsas.common.xmlparser.types.EvaluationTemplateTemplateTypeType templateType)
    {
        this._templateType = templateType;
    } //-- void setTemplateType(com.regaltec.rsas.common.xmlparser.types.EvaluationTemplateTemplateTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.EvaluationTemplate) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.EvaluationTemplate.class, reader);
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