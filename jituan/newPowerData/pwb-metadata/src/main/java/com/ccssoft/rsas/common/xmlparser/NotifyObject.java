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

import com.ccssoft.rsas.common.xmlparser.types.NotifyObjectGrouptypeType;

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
 * ֪ͨ�û�����
 * 
 * @version $Revision$ $Date$
 */
public class NotifyObject implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �ʼ�����
     */
    private java.lang.String _subject;

    /**
     * ���ݷ�������,������ʽ���ۺ�gtComp ;�ֱ� gtApart �������ۺϱ��������ݡ��麣����ɽ�ֱ�
     * 98%��85%,89%;�ֱ����������ݣ�98%���麣��85%����ɽ��89%
     */
    private com.ccssoft.rsas.common.xmlparser.types.NotifyObjectGrouptypeType _grouptype;

    /**
     * �ʼ�����
     */
    private java.lang.String _content;

    /**
     * ��Ϣ֪ͨ����
     */
    private java.lang.String _messageContent;

    /**
     * �����ļ����ļ���������������[��������],[����ɸѡ],����ɸѡ����ǰ����
     */
    private java.lang.String _attachFileName;

    /**
     * �����Ƿ�ѹ�� ��0-��ѹ�� ��1-ѹ��
     */
    private short _isFileZip;

    /**
     * keeps track of state for field: _isFileZip
     */
    private boolean _has_isFileZip;

    /**
     * FTP�����������Ӳ���,��ʽ��server:port@root#loginname.password������127.0.0.1:23@/usr#test.test
     */
    private java.lang.Object _FTPParams;

    /**
     * ֪ͨ�û����󼯺�
     */
    private com.ccssoft.rsas.common.xmlparser.NotifyUsers _notifyUsers;


      //----------------/
     //- Constructors -/
    //----------------/

    public NotifyObject() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.NotifyObject()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteIsFileZip
     */
    public void deleteIsFileZip()
    {
        this._has_isFileZip= false;
    } //-- void deleteIsFileZip() 

    /**
     * Returns the value of field 'attachFileName'. The field
     * 'attachFileName' has the following description:
     * �����ļ����ļ���������������[��������],[����ɸѡ],����ɸѡ����ǰ����
     * 
     * @return the value of field 'attachFileName'.
     */
    public java.lang.String getAttachFileName()
    {
        return this._attachFileName;
    } //-- java.lang.String getAttachFileName() 

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: �ʼ�����
     * 
     * @return the value of field 'content'.
     */
    public java.lang.String getContent()
    {
        return this._content;
    } //-- java.lang.String getContent() 

    /**
     * Returns the value of field 'FTPParams'. The field
     * 'FTPParams' has the following description:
     * FTP�����������Ӳ���,��ʽ��server:port@root#loginname.password������127.0.0.1:23@/usr#test.test
     * 
     * @return the value of field 'FTPParams'.
     */
    public java.lang.Object getFTPParams()
    {
        return this._FTPParams;
    } //-- java.lang.Object getFTPParams() 

    /**
     * Returns the value of field 'grouptype'. The field
     * 'grouptype' has the following description:
     * ���ݷ�������,������ʽ���ۺ�gtComp ;�ֱ� gtApart �������ۺϱ��������ݡ��麣����ɽ�ֱ�
     * 98%��85%,89%;�ֱ����������ݣ�98%���麣��85%����ɽ��89%
     * 
     * @return the value of field 'grouptype'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.NotifyObjectGrouptypeType getGrouptype()
    {
        return this._grouptype;
    } //-- com.regaltec.rsas.common.xmlparser.types.NotifyObjectGrouptypeType getGrouptype() 

    /**
     * Returns the value of field 'isFileZip'. The field
     * 'isFileZip' has the following description: �����Ƿ�ѹ�� ��0-��ѹ��
     * ��1-ѹ��
     * 
     * @return the value of field 'isFileZip'.
     */
    public short getIsFileZip()
    {
        return this._isFileZip;
    } //-- short getIsFileZip() 

    /**
     * Returns the value of field 'messageContent'. The field
     * 'messageContent' has the following description: ��Ϣ֪ͨ����
     * 
     * @return the value of field 'messageContent'.
     */
    public java.lang.String getMessageContent()
    {
        return this._messageContent;
    } //-- java.lang.String getMessageContent() 

    /**
     * Returns the value of field 'notifyUsers'. The field
     * 'notifyUsers' has the following description: ֪ͨ�û����󼯺�
     * 
     * @return the value of field 'notifyUsers'.
     */
    public com.ccssoft.rsas.common.xmlparser.NotifyUsers getNotifyUsers()
    {
        return this._notifyUsers;
    } //-- com.regaltec.rsas.common.xmlparser.NotifyUsers getNotifyUsers() 

    /**
     * Returns the value of field 'subject'. The field 'subject'
     * has the following description: �ʼ�����
     * 
     * @return the value of field 'subject'.
     */
    public java.lang.String getSubject()
    {
        return this._subject;
    } //-- java.lang.String getSubject() 

    /**
     * Method hasIsFileZip
     */
    public boolean hasIsFileZip()
    {
        return this._has_isFileZip;
    } //-- boolean hasIsFileZip() 

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
     * Sets the value of field 'attachFileName'. The field
     * 'attachFileName' has the following description:
     * �����ļ����ļ���������������[��������],[����ɸѡ],����ɸѡ����ǰ����
     * 
     * @param attachFileName the value of field 'attachFileName'.
     */
    public void setAttachFileName(java.lang.String attachFileName)
    {
        this._attachFileName = attachFileName;
    } //-- void setAttachFileName(java.lang.String) 

    /**
     * Sets the value of field 'content'. The field 'content' has
     * the following description: �ʼ�����
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(java.lang.String content)
    {
        this._content = content;
    } //-- void setContent(java.lang.String) 

    /**
     * Sets the value of field 'FTPParams'. The field 'FTPParams'
     * has the following description:
     * FTP�����������Ӳ���,��ʽ��server:port@root#loginname.password������127.0.0.1:23@/usr#test.test
     * 
     * @param FTPParams the value of field 'FTPParams'.
     */
    public void setFTPParams(java.lang.Object FTPParams)
    {
        this._FTPParams = FTPParams;
    } //-- void setFTPParams(java.lang.Object) 

    /**
     * Sets the value of field 'grouptype'. The field 'grouptype'
     * has the following description: ���ݷ�������,������ʽ���ۺ�gtComp ;�ֱ�
     * gtApart �������ۺϱ��������ݡ��麣����ɽ�ֱ�
     * 98%��85%,89%;�ֱ����������ݣ�98%���麣��85%����ɽ��89%
     * 
     * @param grouptype the value of field 'grouptype'.
     */
    public void setGrouptype(com.ccssoft.rsas.common.xmlparser.types.NotifyObjectGrouptypeType grouptype)
    {
        this._grouptype = grouptype;
    } //-- void setGrouptype(com.regaltec.rsas.common.xmlparser.types.NotifyObjectGrouptypeType) 

    /**
     * Sets the value of field 'isFileZip'. The field 'isFileZip'
     * has the following description: �����Ƿ�ѹ�� ��0-��ѹ�� ��1-ѹ��
     * 
     * @param isFileZip the value of field 'isFileZip'.
     */
    public void setIsFileZip(short isFileZip)
    {
        this._isFileZip = isFileZip;
        this._has_isFileZip = true;
    } //-- void setIsFileZip(short) 

    /**
     * Sets the value of field 'messageContent'. The field
     * 'messageContent' has the following description: ��Ϣ֪ͨ����
     * 
     * @param messageContent the value of field 'messageContent'.
     */
    public void setMessageContent(java.lang.String messageContent)
    {
        this._messageContent = messageContent;
    } //-- void setMessageContent(java.lang.String) 

    /**
     * Sets the value of field 'notifyUsers'. The field
     * 'notifyUsers' has the following description: ֪ͨ�û����󼯺�
     * 
     * @param notifyUsers the value of field 'notifyUsers'.
     */
    public void setNotifyUsers(com.ccssoft.rsas.common.xmlparser.NotifyUsers notifyUsers)
    {
        this._notifyUsers = notifyUsers;
    } //-- void setNotifyUsers(com.regaltec.rsas.common.xmlparser.NotifyUsers) 

    /**
     * Sets the value of field 'subject'. The field 'subject' has
     * the following description: �ʼ�����
     * 
     * @param subject the value of field 'subject'.
     */
    public void setSubject(java.lang.String subject)
    {
        this._subject = subject;
    } //-- void setSubject(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.NotifyObject) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.NotifyObject.class, reader);
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
