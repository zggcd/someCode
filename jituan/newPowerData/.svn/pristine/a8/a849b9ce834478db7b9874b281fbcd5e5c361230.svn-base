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
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * ���ɱ�����������
 * 
 * @version $Revision$ $Date$
 */
public class DocConditions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ���ɱ������������������������ӳ��һһ��Ӧ�����������û��ֵ��������������ֵΪ��
     */
    private java.util.Vector _docConditionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DocConditions() {
        super();
        _docConditionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DocConditions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDocCondition
     * 
     * @param vDocCondition
     */
    public void addDocCondition(com.ccssoft.rsas.common.xmlparser.DocCondition vDocCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _docConditionList.addElement(vDocCondition);
    } //-- void addDocCondition(com.regaltec.rsas.common.xmlparser.DocCondition) 

    /**
     * Method addDocCondition
     * 
     * @param index
     * @param vDocCondition
     */
    public void addDocCondition(int index, com.ccssoft.rsas.common.xmlparser.DocCondition vDocCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _docConditionList.insertElementAt(vDocCondition, index);
    } //-- void addDocCondition(int, com.regaltec.rsas.common.xmlparser.DocCondition) 

    /**
     * Method enumerateDocCondition
     */
    public java.util.Enumeration enumerateDocCondition()
    {
        return _docConditionList.elements();
    } //-- java.util.Enumeration enumerateDocCondition() 

    /**
     * Method getDocCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DocCondition getDocCondition(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _docConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DocCondition) _docConditionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DocCondition getDocCondition(int) 

    /**
     * Method getDocCondition
     */
    public com.ccssoft.rsas.common.xmlparser.DocCondition[] getDocCondition()
    {
        int size = _docConditionList.size();
        com.ccssoft.rsas.common.xmlparser.DocCondition[] mArray = new com.ccssoft.rsas.common.xmlparser.DocCondition[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DocCondition) _docConditionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DocCondition[] getDocCondition() 

    /**
     * Method getDocConditionCount
     */
    public int getDocConditionCount()
    {
        return _docConditionList.size();
    } //-- int getDocConditionCount() 

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
     * Method removeAllDocCondition
     */
    public void removeAllDocCondition()
    {
        _docConditionList.removeAllElements();
    } //-- void removeAllDocCondition() 

    /**
     * Method removeDocCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DocCondition removeDocCondition(int index)
    {
        java.lang.Object obj = _docConditionList.elementAt(index);
        _docConditionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DocCondition) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DocCondition removeDocCondition(int) 

    /**
     * Method setDocCondition
     * 
     * @param index
     * @param vDocCondition
     */
    public void setDocCondition(int index, com.ccssoft.rsas.common.xmlparser.DocCondition vDocCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _docConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _docConditionList.setElementAt(vDocCondition, index);
    } //-- void setDocCondition(int, com.regaltec.rsas.common.xmlparser.DocCondition) 

    /**
     * Method setDocCondition
     * 
     * @param docConditionArray
     */
    public void setDocCondition(com.ccssoft.rsas.common.xmlparser.DocCondition[] docConditionArray)
    {
        //-- copy array
        _docConditionList.removeAllElements();
        for (int i = 0; i < docConditionArray.length; i++) {
            _docConditionList.addElement(docConditionArray[i]);
        }
    } //-- void setDocCondition(com.regaltec.rsas.common.xmlparser.DocCondition) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DocConditions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DocConditions.class, reader);
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
