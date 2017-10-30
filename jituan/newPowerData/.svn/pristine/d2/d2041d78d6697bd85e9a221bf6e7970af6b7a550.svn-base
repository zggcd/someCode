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
 * ����Ĳ�������
 * 
 * @version $Revision$ $Date$
 */
public class OperItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����ֵ��Դ�����������ĳ�����ں�������ʱ��ֻ������ĳ����Ϊ��ʱ����ȡֵ
     */
    private com.ccssoft.rsas.common.xmlparser.types.RequisitionObjectTypeType _objectType;

    /**
     * Field _operElementList
     */
    private java.util.Vector _operElementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public OperItem() {
        super();
        _operElementList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.OperItem()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOperElement
     * 
     * @param vOperElement
     */
    public void addOperElement(com.ccssoft.rsas.common.xmlparser.OperElement vOperElement)
        throws java.lang.IndexOutOfBoundsException
    {
        _operElementList.addElement(vOperElement);
    } //-- void addOperElement(com.regaltec.rsas.common.xmlparser.OperElement) 

    /**
     * Method addOperElement
     * 
     * @param index
     * @param vOperElement
     */
    public void addOperElement(int index, com.ccssoft.rsas.common.xmlparser.OperElement vOperElement)
        throws java.lang.IndexOutOfBoundsException
    {
        _operElementList.insertElementAt(vOperElement, index);
    } //-- void addOperElement(int, com.regaltec.rsas.common.xmlparser.OperElement) 

    /**
     * Method enumerateOperElement
     */
    public java.util.Enumeration enumerateOperElement()
    {
        return _operElementList.elements();
    } //-- java.util.Enumeration enumerateOperElement() 

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
     * Method getOperElement
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.OperElement getOperElement(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _operElementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.OperElement) _operElementList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.OperElement getOperElement(int) 

    /**
     * Method getOperElement
     */
    public com.ccssoft.rsas.common.xmlparser.OperElement[] getOperElement()
    {
        int size = _operElementList.size();
        com.ccssoft.rsas.common.xmlparser.OperElement[] mArray = new com.ccssoft.rsas.common.xmlparser.OperElement[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.OperElement) _operElementList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.OperElement[] getOperElement() 

    /**
     * Method getOperElementCount
     */
    public int getOperElementCount()
    {
        return _operElementList.size();
    } //-- int getOperElementCount() 

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
     * Method removeAllOperElement
     */
    public void removeAllOperElement()
    {
        _operElementList.removeAllElements();
    } //-- void removeAllOperElement() 

    /**
     * Method removeOperElement
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.OperElement removeOperElement(int index)
    {
        java.lang.Object obj = _operElementList.elementAt(index);
        _operElementList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.OperElement) obj;
    } //-- com.regaltec.rsas.common.xmlparser.OperElement removeOperElement(int) 

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
     * Method setOperElement
     * 
     * @param index
     * @param vOperElement
     */
    public void setOperElement(int index, com.ccssoft.rsas.common.xmlparser.OperElement vOperElement)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _operElementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _operElementList.setElementAt(vOperElement, index);
    } //-- void setOperElement(int, com.regaltec.rsas.common.xmlparser.OperElement) 

    /**
     * Method setOperElement
     * 
     * @param operElementArray
     */
    public void setOperElement(com.ccssoft.rsas.common.xmlparser.OperElement[] operElementArray)
    {
        //-- copy array
        _operElementList.removeAllElements();
        for (int i = 0; i < operElementArray.length; i++) {
            _operElementList.addElement(operElementArray[i]);
        }
    } //-- void setOperElement(com.regaltec.rsas.common.xmlparser.OperElement) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.OperItem) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.OperItem.class, reader);
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
