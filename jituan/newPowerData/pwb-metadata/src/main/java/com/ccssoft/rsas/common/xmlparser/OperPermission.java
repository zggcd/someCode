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

import com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType;

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
 * ����Ȩ�޷���
 * 
 * @version $Revision$ $Date$
 */
public class OperPermission implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     */
    private com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType _objectType;

    /**
     * Field _objectID
     */
    private java.lang.Object _objectID;

    /**
     * ָ��ǰ����ģ�����ɾ���ĵȲ���
     */
    private java.util.Vector _operList;


      //----------------/
     //- Constructors -/
    //----------------/

    public OperPermission() {
        super();
        _operList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.OperPermission()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOper
     * 
     * @param vOper
     */
    public void addOper(com.ccssoft.rsas.common.xmlparser.Oper vOper)
        throws java.lang.IndexOutOfBoundsException
    {
        _operList.addElement(vOper);
    } //-- void addOper(com.regaltec.rsas.common.xmlparser.Oper) 

    /**
     * Method addOper
     * 
     * @param index
     * @param vOper
     */
    public void addOper(int index, com.ccssoft.rsas.common.xmlparser.Oper vOper)
        throws java.lang.IndexOutOfBoundsException
    {
        _operList.insertElementAt(vOper, index);
    } //-- void addOper(int, com.regaltec.rsas.common.xmlparser.Oper) 

    /**
     * Method enumerateOper
     */
    public java.util.Enumeration enumerateOper()
    {
        return _operList.elements();
    } //-- java.util.Enumeration enumerateOper() 

    /**
     * Returns the value of field 'objectID'.
     * 
     * @return the value of field 'objectID'.
     */
    public java.lang.Object getObjectID()
    {
        return this._objectID;
    } //-- java.lang.Object getObjectID() 

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
     * Method getOper
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Oper getOper(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _operList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Oper) _operList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Oper getOper(int) 

    /**
     * Method getOper
     */
    public com.ccssoft.rsas.common.xmlparser.Oper[] getOper()
    {
        int size = _operList.size();
        com.ccssoft.rsas.common.xmlparser.Oper[] mArray = new com.ccssoft.rsas.common.xmlparser.Oper[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Oper) _operList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Oper[] getOper() 

    /**
     * Method getOperCount
     */
    public int getOperCount()
    {
        return _operList.size();
    } //-- int getOperCount() 

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
     * Method removeAllOper
     */
    public void removeAllOper()
    {
        _operList.removeAllElements();
    } //-- void removeAllOper() 

    /**
     * Method removeOper
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Oper removeOper(int index)
    {
        java.lang.Object obj = _operList.elementAt(index);
        _operList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Oper) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Oper removeOper(int) 

    /**
     * Sets the value of field 'objectID'.
     * 
     * @param objectID the value of field 'objectID'.
     */
    public void setObjectID(java.lang.Object objectID)
    {
        this._objectID = objectID;
    } //-- void setObjectID(java.lang.Object) 

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
     * Method setOper
     * 
     * @param index
     * @param vOper
     */
    public void setOper(int index, com.ccssoft.rsas.common.xmlparser.Oper vOper)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _operList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _operList.setElementAt(vOper, index);
    } //-- void setOper(int, com.regaltec.rsas.common.xmlparser.Oper) 

    /**
     * Method setOper
     * 
     * @param operArray
     */
    public void setOper(com.ccssoft.rsas.common.xmlparser.Oper[] operArray)
    {
        //-- copy array
        _operList.removeAllElements();
        for (int i = 0; i < operArray.length; i++) {
            _operList.addElement(operArray[i]);
        }
    } //-- void setOper(com.regaltec.rsas.common.xmlparser.Oper) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.OperPermission) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.OperPermission.class, reader);
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
