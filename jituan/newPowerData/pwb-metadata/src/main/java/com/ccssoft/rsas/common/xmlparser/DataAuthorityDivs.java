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
 * Class DataAuthorityDivs.
 * 
 * @version $Revision$ $Date$
 */
public class DataAuthorityDivs implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����Ȩ������
     */
    private java.util.Vector _dataAuthorityDivList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataAuthorityDivs() {
        super();
        _dataAuthorityDivList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.DataAuthorityDivs()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDataAuthorityDiv
     * 
     * @param vDataAuthorityDiv
     */
    public void addDataAuthorityDiv(com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv vDataAuthorityDiv)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataAuthorityDivList.addElement(vDataAuthorityDiv);
    } //-- void addDataAuthorityDiv(com.regaltec.rsas.common.xmlparser.DataAuthorityDiv) 

    /**
     * Method addDataAuthorityDiv
     * 
     * @param index
     * @param vDataAuthorityDiv
     */
    public void addDataAuthorityDiv(int index, com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv vDataAuthorityDiv)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataAuthorityDivList.insertElementAt(vDataAuthorityDiv, index);
    } //-- void addDataAuthorityDiv(int, com.regaltec.rsas.common.xmlparser.DataAuthorityDiv) 

    /**
     * Method enumerateDataAuthorityDiv
     */
    public java.util.Enumeration enumerateDataAuthorityDiv()
    {
        return _dataAuthorityDivList.elements();
    } //-- java.util.Enumeration enumerateDataAuthorityDiv() 

    /**
     * Method getDataAuthorityDiv
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv getDataAuthorityDiv(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataAuthorityDivList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv) _dataAuthorityDivList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.DataAuthorityDiv getDataAuthorityDiv(int) 

    /**
     * Method getDataAuthorityDiv
     */
    public com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv[] getDataAuthorityDiv()
    {
        int size = _dataAuthorityDivList.size();
        com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv[] mArray = new com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv) _dataAuthorityDivList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.DataAuthorityDiv[] getDataAuthorityDiv() 

    /**
     * Method getDataAuthorityDivCount
     */
    public int getDataAuthorityDivCount()
    {
        return _dataAuthorityDivList.size();
    } //-- int getDataAuthorityDivCount() 

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
     * Method removeAllDataAuthorityDiv
     */
    public void removeAllDataAuthorityDiv()
    {
        _dataAuthorityDivList.removeAllElements();
    } //-- void removeAllDataAuthorityDiv() 

    /**
     * Method removeDataAuthorityDiv
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv removeDataAuthorityDiv(int index)
    {
        java.lang.Object obj = _dataAuthorityDivList.elementAt(index);
        _dataAuthorityDivList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv) obj;
    } //-- com.regaltec.rsas.common.xmlparser.DataAuthorityDiv removeDataAuthorityDiv(int) 

    /**
     * Method setDataAuthorityDiv
     * 
     * @param index
     * @param vDataAuthorityDiv
     */
    public void setDataAuthorityDiv(int index, com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv vDataAuthorityDiv)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataAuthorityDivList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dataAuthorityDivList.setElementAt(vDataAuthorityDiv, index);
    } //-- void setDataAuthorityDiv(int, com.regaltec.rsas.common.xmlparser.DataAuthorityDiv) 

    /**
     * Method setDataAuthorityDiv
     * 
     * @param dataAuthorityDivArray
     */
    public void setDataAuthorityDiv(com.ccssoft.rsas.common.xmlparser.DataAuthorityDiv[] dataAuthorityDivArray)
    {
        //-- copy array
        _dataAuthorityDivList.removeAllElements();
        for (int i = 0; i < dataAuthorityDivArray.length; i++) {
            _dataAuthorityDivList.addElement(dataAuthorityDivArray[i]);
        }
    } //-- void setDataAuthorityDiv(com.regaltec.rsas.common.xmlparser.DataAuthorityDiv) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DataAuthorityDivs) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DataAuthorityDivs.class, reader);
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
