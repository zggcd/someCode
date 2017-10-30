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

import com.ccssoft.rsas.common.xmlparser.types.EvaluationTemplateEncodeTypeType;
import com.ccssoft.rsas.common.xmlparser.types.ReportResultResultTypeType;

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
 * ����Ľ������Ԫ���ݿ��޹أ�
 * 
 * @version $Revision$ $Date$
 */
public class ReportResult implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���ؽ���Ĵ洢����
     */
    private com.ccssoft.rsas.common.xmlparser.types.ReportResultResultTypeType _resultType;

    /**
     * �������豣����ļ�������д�ļ��洢�����·��
     */
    private java.lang.String _path;

    /**
     * ���ݵı��뷽ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.types.ReportResultEncodeTypeType _encodeType;

    /**
     * ��ǰ����Ƿ�Ҫ��ʾ�ڿͻ���
     */
    private byte _isShow;

    /**
     * keeps track of state for field: _isShow
     */
    private boolean _has_isShow;

    /**
     * ���ص�����
     */
    private java.lang.String _content;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportResult() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.ReportResult()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteIsShow
     */
    public void deleteIsShow()
    {
        this._has_isShow= false;
    } //-- void deleteIsShow() 

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: ���ص�����
     * 
     * @return the value of field 'content'.
     */
    public java.lang.String getContent()
    {
        return this._content;
    } //-- java.lang.String getContent() 

    /**
     * Returns the value of field 'encodeType'. The field
     * 'encodeType' has the following description: ���ݵı��뷽ʽ
     * 
     * @return the value of field 'encodeType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.ReportResultEncodeTypeType getEncodeType()
    {
        return this._encodeType;
    } //-- com.regaltec.rsas.common.xmlparser.types.EvaluationTemplateEncodeTypeType getEncodeType() 

    /**
     * Returns the value of field 'isShow'. The field 'isShow' has
     * the following description: ��ǰ����Ƿ�Ҫ��ʾ�ڿͻ���
     * 
     * @return the value of field 'isShow'.
     */
    public byte getIsShow()
    {
        return this._isShow;
    } //-- byte getIsShow() 

    /**
     * Returns the value of field 'path'. The field 'path' has the
     * following description: �������豣����ļ�������д�ļ��洢�����·��
     * 
     * @return the value of field 'path'.
     */
    public java.lang.String getPath()
    {
        return this._path;
    } //-- java.lang.String getPath() 

    /**
     * Returns the value of field 'resultType'. The field
     * 'resultType' has the following description: ���ؽ���Ĵ洢����
     * 
     * @return the value of field 'resultType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.ReportResultResultTypeType getResultType()
    {
        return this._resultType;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportResultResultTypeType getResultType() 

    /**
     * Method hasIsShow
     */
    public boolean hasIsShow()
    {
        return this._has_isShow;
    } //-- boolean hasIsShow() 

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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: ���ص�����
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(java.lang.String content)
    {
        this._content = content;
    } //-- void setContent(java.lang.String) 

    /**
     * Sets the value of field 'encodeType'. The field 'encodeType'
     * has the following description: ���ݵı��뷽ʽ
     * 
     * @param encodeType the value of field 'encodeType'.
     */
    public void setEncodeType(com.ccssoft.rsas.common.xmlparser.types.ReportResultEncodeTypeType encodeType)
    {
        this._encodeType = encodeType;
    } //-- void setEncodeType(com.regaltec.rsas.common.xmlparser.types.EvaluationTemplateEncodeTypeType) 

    /**
     * Sets the value of field 'isShow'. The field 'isShow' has the
     * following description: ��ǰ����Ƿ�Ҫ��ʾ�ڿͻ���
     * 
     * @param isShow the value of field 'isShow'.
     */
    public void setIsShow(byte isShow)
    {
        this._isShow = isShow;
        this._has_isShow = true;
    } //-- void setIsShow(byte) 

    /**
     * Sets the value of field 'path'. The field 'path' has the
     * following description: �������豣����ļ�������д�ļ��洢�����·��
     * 
     * @param path the value of field 'path'.
     */
    public void setPath(java.lang.String path)
    {
        this._path = path;
    } //-- void setPath(java.lang.String) 

    /**
     * Sets the value of field 'resultType'. The field 'resultType'
     * has the following description: ���ؽ���Ĵ洢����
     * 
     * @param resultType the value of field 'resultType'.
     */
    public void setResultType(com.ccssoft.rsas.common.xmlparser.types.ReportResultResultTypeType resultType)
    {
        this._resultType = resultType;
    } //-- void setResultType(com.regaltec.rsas.common.xmlparser.types.ReportResultResultTypeType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReportResult) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReportResult.class, reader);
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
