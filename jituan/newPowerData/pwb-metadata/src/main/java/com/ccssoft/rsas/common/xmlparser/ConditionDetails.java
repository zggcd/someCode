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
 * ��������ÿ��ɸѡ�������Ƿ��ѡ����ѡ��Ĭ��ֵ����Ҫ�����������
 * 
 * @version $Revision$ $Date$
 */
public class ConditionDetails implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _conditionDetailList
     */
    private java.util.Vector _conditionDetailList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConditionDetails() {
        super();
        _conditionDetailList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ConditionDetails()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConditionDetail
     * 
     * @param vConditionDetail
     */
    public void addConditionDetail(com.ccssoft.rsas.common.xmlparser.ConditionDetail vConditionDetail)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionDetailList.addElement(vConditionDetail);
    } //-- void addConditionDetail(com.regaltec.rsas.common.xmlparser.ConditionDetail) 

    /**
     * Method addConditionDetail
     * 
     * @param index
     * @param vConditionDetail
     */
    public void addConditionDetail(int index, com.ccssoft.rsas.common.xmlparser.ConditionDetail vConditionDetail)
        throws java.lang.IndexOutOfBoundsException
    {
        _conditionDetailList.insertElementAt(vConditionDetail, index);
    } //-- void addConditionDetail(int, com.regaltec.rsas.common.xmlparser.ConditionDetail) 

    /**
     * Method enumerateConditionDetail
     */
    public java.util.Enumeration enumerateConditionDetail()
    {
        return _conditionDetailList.elements();
    } //-- java.util.Enumeration enumerateConditionDetail() 

    /**
     * Method getConditionDetail
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionDetail getConditionDetail(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionDetailList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.ConditionDetail) _conditionDetailList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.ConditionDetail getConditionDetail(int) 

    /**
     * Method getConditionDetail
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionDetail[] getConditionDetail()
    {
        int size = _conditionDetailList.size();
        com.ccssoft.rsas.common.xmlparser.ConditionDetail[] mArray = new com.ccssoft.rsas.common.xmlparser.ConditionDetail[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.ConditionDetail) _conditionDetailList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionDetail[] getConditionDetail() 

    /**
     * Method getConditionDetailCount
     */
    public int getConditionDetailCount()
    {
        return _conditionDetailList.size();
    } //-- int getConditionDetailCount() 

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
     * Method removeAllConditionDetail
     */
    public void removeAllConditionDetail()
    {
        _conditionDetailList.removeAllElements();
    } //-- void removeAllConditionDetail() 

    /**
     * Method removeConditionDetail
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.ConditionDetail removeConditionDetail(int index)
    {
        java.lang.Object obj = _conditionDetailList.elementAt(index);
        _conditionDetailList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.ConditionDetail) obj;
    } //-- com.regaltec.rsas.common.xmlparser.ConditionDetail removeConditionDetail(int) 

    /**
     * Method setConditionDetail
     * 
     * @param index
     * @param vConditionDetail
     */
    public void setConditionDetail(int index, com.ccssoft.rsas.common.xmlparser.ConditionDetail vConditionDetail)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conditionDetailList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _conditionDetailList.setElementAt(vConditionDetail, index);
    } //-- void setConditionDetail(int, com.regaltec.rsas.common.xmlparser.ConditionDetail) 

    /**
     * Method setConditionDetail
     * 
     * @param conditionDetailArray
     */
    public void setConditionDetail(com.ccssoft.rsas.common.xmlparser.ConditionDetail[] conditionDetailArray)
    {
        //-- copy array
        _conditionDetailList.removeAllElements();
        for (int i = 0; i < conditionDetailArray.length; i++) {
            _conditionDetailList.addElement(conditionDetailArray[i]);
        }
    } //-- void setConditionDetail(com.regaltec.rsas.common.xmlparser.ConditionDetail) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ConditionDetails) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ConditionDetails.class, reader);
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
