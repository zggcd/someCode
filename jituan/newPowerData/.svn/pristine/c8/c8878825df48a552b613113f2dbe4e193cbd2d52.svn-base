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

import com.ccssoft.rsas.common.xmlparser.types.RequisitionCommandType;
import com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType;
import com.ccssoft.rsas.common.xmlparser.types.RequisitionOptionType;
import com.ccssoft.rsas.common.xmlparser.types.RequisitionResponseType;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * ֪ͨ��
 * 
 * @version $Revision$ $Date$
 */
public class Requisition implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _command
     */
    private com.ccssoft.rsas.common.xmlparser.types.RequisitionCommandType _command;

    /**
     * 0��ʹ��Attachment�ڵĶ������������ݣ�1��ʹ��Option���������ݡ�
     */
    private byte _useOption;

    /**
     * keeps track of state for field: _useOption
     */
    private boolean _has_useOption;

    /**
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     */
    private com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType _objectType;

    /**
     * Field _objectID
     */
    private java.lang.String _objectID;

    /**
     * �Ƿ�װ�ظ��Ӷ���
     */
    private byte _loadAdditional;

    /**
     * keeps track of state for field: _loadAdditional
     */
    private boolean _has_loadAdditional;

    /**
     * ֻ��������ΪDrill��Pivotʱ�Ż�ʹ��
     */
    private com.ccssoft.rsas.common.xmlparser.types.RequisitionOptionType _option;

    /**
     * SYN:ͬ�� ASYN:�첽
     */
    private com.ccssoft.rsas.common.xmlparser.types.RequisitionResponseType _response;

    /**
     * ��¼��
     */
    private java.lang.String _loginName;

    /**
     * ���ڴ���������ʱʹ��
     */
    private java.util.Vector _commandOptionList;

    /**
     * Field _attachment
     */
    private com.ccssoft.rsas.common.xmlparser.Attachment _attachment;


      //----------------/
     //- Constructors -/
    //----------------/

    public Requisition() {
        super();
        _commandOptionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Requisition()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addCommandOption
     * 
     * @param vCommandOption
     */
    public void addCommandOption(com.ccssoft.rsas.common.xmlparser.CommandOption vCommandOption)
        throws java.lang.IndexOutOfBoundsException
    {
        _commandOptionList.addElement(vCommandOption);
    } //-- void addCommandOption(com.regaltec.rsas.common.xmlparser.CommandOption) 

    /**
     * Method addCommandOption
     * 
     * @param index
     * @param vCommandOption
     */
    public void addCommandOption(int index, com.ccssoft.rsas.common.xmlparser.CommandOption vCommandOption)
        throws java.lang.IndexOutOfBoundsException
    {
        _commandOptionList.insertElementAt(vCommandOption, index);
    } //-- void addCommandOption(int, com.regaltec.rsas.common.xmlparser.CommandOption) 

    /**
     * Method deleteLoadAdditional
     */
    public void deleteLoadAdditional()
    {
        this._has_loadAdditional= false;
    } //-- void deleteLoadAdditional() 

    /**
     * Method deleteUseOption
     */
    public void deleteUseOption()
    {
        this._has_useOption= false;
    } //-- void deleteUseOption() 

    /**
     * Method enumerateCommandOption
     */
    public java.util.Enumeration enumerateCommandOption()
    {
        return _commandOptionList.elements();
    } //-- java.util.Enumeration enumerateCommandOption() 

    /**
     * Returns the value of field 'attachment'.
     * 
     * @return the value of field 'attachment'.
     */
    public com.ccssoft.rsas.common.xmlparser.Attachment getAttachment()
    {
        return this._attachment;
    } //-- com.regaltec.rsas.common.xmlparser.Attachment getAttachment() 

    /**
     * Returns the value of field 'command'.
     * 
     * @return the value of field 'command'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.RequisitionCommandType getCommand()
    {
        return this._command;
    } //-- com.regaltec.rsas.common.xmlparser.types.RequisitionCommandType getCommand() 

    /**
     * Method getCommandOption
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.CommandOption getCommandOption(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _commandOptionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.CommandOption) _commandOptionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.CommandOption getCommandOption(int) 

    /**
     * Method getCommandOption
     */
    public com.ccssoft.rsas.common.xmlparser.CommandOption[] getCommandOption()
    {
        int size = _commandOptionList.size();
        com.ccssoft.rsas.common.xmlparser.CommandOption[] mArray = new com.ccssoft.rsas.common.xmlparser.CommandOption[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.CommandOption) _commandOptionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.CommandOption[] getCommandOption() 

    /**
     * Method getCommandOptionCount
     */
    public int getCommandOptionCount()
    {
        return _commandOptionList.size();
    } //-- int getCommandOptionCount() 

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
     * Returns the value of field 'loadAdditional'. The field
     * 'loadAdditional' has the following description: �Ƿ�װ�ظ��Ӷ���
     * 
     * @return the value of field 'loadAdditional'.
     */
    public byte getLoadAdditional()
    {
        return this._loadAdditional;
    } //-- byte getLoadAdditional() 

    /**
     * Returns the value of field 'loginName'. The field
     * 'loginName' has the following description: ��¼��
     * 
     * @return the value of field 'loginName'.
     */
    public java.lang.String getLoginName()
    {
        return this._loginName;
    } //-- java.lang.String getLoginName() 

    /**
     * Returns the value of field 'objectID'.
     * 
     * @return the value of field 'objectID'.
     */
    public java.lang.String getObjectID()
    {
        return this._objectID;
    } //-- java.lang.String getObjectID() 

    /**
     * Returns the value of field 'objectType'. The field
     * 'objectType' has the following description:
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     * 
     * @return the value of field 'objectType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType getObjectType()
    {
        return this._objectType;
    } //-- com.regaltec.rsas.common.xmlparser.types.RequisitionObjectTypeType getObjectType() 

    /**
     * Returns the value of field 'option'. The field 'option' has
     * the following description: ֻ��������ΪDrill��Pivotʱ�Ż�ʹ��
     * 
     * @return the value of field 'option'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.RequisitionOptionType getOption()
    {
        return this._option;
    } //-- com.regaltec.rsas.common.xmlparser.types.RequisitionOptionType getOption() 

    /**
     * Returns the value of field 'response'. The field 'response'
     * has the following description: SYN:ͬ�� ASYN:�첽
     * 
     * @return the value of field 'response'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.RequisitionResponseType getResponse()
    {
        return this._response;
    } //-- com.regaltec.rsas.common.xmlparser.types.RequisitionResponseType getResponse() 

    /**
     * Returns the value of field 'useOption'. The field
     * 'useOption' has the following description:
     * 0��ʹ��Attachment�ڵĶ������������ݣ�1��ʹ��Option���������ݡ�
     * 
     * @return the value of field 'useOption'.
     */
    public byte getUseOption()
    {
        return this._useOption;
    } //-- byte getUseOption() 

    /**
     * Method hasLoadAdditional
     */
    public boolean hasLoadAdditional()
    {
        return this._has_loadAdditional;
    } //-- boolean hasLoadAdditional() 

    /**
     * Method hasUseOption
     */
    public boolean hasUseOption()
    {
        return this._has_useOption;
    } //-- boolean hasUseOption() 

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
     * Method removeAllCommandOption
     */
    public void removeAllCommandOption()
    {
        _commandOptionList.removeAllElements();
    } //-- void removeAllCommandOption() 

    /**
     * Method removeCommandOption
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.CommandOption removeCommandOption(int index)
    {
        java.lang.Object obj = _commandOptionList.elementAt(index);
        _commandOptionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.CommandOption) obj;
    } //-- com.regaltec.rsas.common.xmlparser.CommandOption removeCommandOption(int) 

    /**
     * Sets the value of field 'attachment'.
     * 
     * @param attachment the value of field 'attachment'.
     */
    public void setAttachment(com.ccssoft.rsas.common.xmlparser.Attachment attachment)
    {
        this._attachment = attachment;
    } //-- void setAttachment(com.regaltec.rsas.common.xmlparser.Attachment) 

    /**
     * Sets the value of field 'command'.
     * 
     * @param command the value of field 'command'.
     */
    public void setCommand(com.ccssoft.rsas.common.xmlparser.types.RequisitionCommandType command)
    {
        this._command = command;
    } //-- void setCommand(com.regaltec.rsas.common.xmlparser.types.RequisitionCommandType) 

    /**
     * Method setCommandOption
     * 
     * @param index
     * @param vCommandOption
     */
    public void setCommandOption(int index, com.ccssoft.rsas.common.xmlparser.CommandOption vCommandOption)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _commandOptionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _commandOptionList.setElementAt(vCommandOption, index);
    } //-- void setCommandOption(int, com.regaltec.rsas.common.xmlparser.CommandOption) 

    /**
     * Method setCommandOption
     * 
     * @param commandOptionArray
     */
    public void setCommandOption(com.ccssoft.rsas.common.xmlparser.CommandOption[] commandOptionArray)
    {
        //-- copy array
        _commandOptionList.removeAllElements();
        for (int i = 0; i < commandOptionArray.length; i++) {
            _commandOptionList.addElement(commandOptionArray[i]);
        }
    } //-- void setCommandOption(com.regaltec.rsas.common.xmlparser.CommandOption) 

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
     * Sets the value of field 'loadAdditional'. The field
     * 'loadAdditional' has the following description: �Ƿ�װ�ظ��Ӷ���
     * 
     * @param loadAdditional the value of field 'loadAdditional'.
     */
    public void setLoadAdditional(byte loadAdditional)
    {
        this._loadAdditional = loadAdditional;
        this._has_loadAdditional = true;
    } //-- void setLoadAdditional(byte) 

    /**
     * Sets the value of field 'loginName'. The field 'loginName'
     * has the following description: ��¼��
     * 
     * @param loginName the value of field 'loginName'.
     */
    public void setLoginName(java.lang.String loginName)
    {
        this._loginName = loginName;
    } //-- void setLoginName(java.lang.String) 

    /**
     * Sets the value of field 'objectID'.
     * 
     * @param objectID the value of field 'objectID'.
     */
    public void setObjectID(java.lang.String objectID)
    {
        this._objectID = objectID;
    } //-- void setObjectID(java.lang.String) 

    /**
     * Sets the value of field 'objectType'. The field 'objectType'
     * has the following description:
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     * 
     * @param objectType the value of field 'objectType'.
     */
    public void setObjectType(com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType objectType)
    {
        this._objectType = objectType;
    } //-- void setObjectType(com.regaltec.rsas.common.xmlparser.types.RequisitionObjectTypeType) 

    /**
     * Sets the value of field 'option'. The field 'option' has the
     * following description: ֻ��������ΪDrill��Pivotʱ�Ż�ʹ��
     * 
     * @param option the value of field 'option'.
     */
    public void setOption(com.ccssoft.rsas.common.xmlparser.types.RequisitionOptionType option)
    {
        this._option = option;
    } //-- void setOption(com.regaltec.rsas.common.xmlparser.types.RequisitionOptionType) 

    /**
     * Sets the value of field 'response'. The field 'response' has
     * the following description: SYN:ͬ�� ASYN:�첽
     * 
     * @param response the value of field 'response'.
     */
    public void setResponse(com.ccssoft.rsas.common.xmlparser.types.RequisitionResponseType response)
    {
        this._response = response;
    } //-- void setResponse(com.regaltec.rsas.common.xmlparser.types.RequisitionResponseType) 

    /**
     * Sets the value of field 'useOption'. The field 'useOption'
     * has the following description:
     * 0��ʹ��Attachment�ڵĶ������������ݣ�1��ʹ��Option���������ݡ�
     * 
     * @param useOption the value of field 'useOption'.
     */
    public void setUseOption(byte useOption)
    {
        this._useOption = useOption;
        this._has_useOption = true;
    } //-- void setUseOption(byte) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Requisition) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Requisition.class, reader);
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
