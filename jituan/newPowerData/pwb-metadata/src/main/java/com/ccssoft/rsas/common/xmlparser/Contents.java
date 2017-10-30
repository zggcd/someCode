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
 * Class Contents.
 * 
 * @version $Revision$ $Date$
 */
public class Contents implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * �������ݶ���
     */
    private java.util.Vector _contentList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Contents() {
        super();
        _contentList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Contents()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addContent
     * 
     * @param vContent
     */
    public void addContent(com.ccssoft.rsas.common.xmlparser.Content vContent)
        throws java.lang.IndexOutOfBoundsException
    {
        _contentList.addElement(vContent);
    } //-- void addContent(com.regaltec.rsas.common.xmlparser.Content) 

    /**
     * Method addContent
     * 
     * @param index
     * @param vContent
     */
    public void addContent(int index, com.ccssoft.rsas.common.xmlparser.Content vContent)
        throws java.lang.IndexOutOfBoundsException
    {
        _contentList.insertElementAt(vContent, index);
    } //-- void addContent(int, com.regaltec.rsas.common.xmlparser.Content) 

    /**
     * Method enumerateContent
     */
    public java.util.Enumeration enumerateContent()
    {
        return _contentList.elements();
    } //-- java.util.Enumeration enumerateContent() 

    /**
     * Method getContent
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Content getContent(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _contentList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Content) _contentList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Content getContent(int) 

    /**
     * Method getContent
     */
    public com.ccssoft.rsas.common.xmlparser.Content[] getContent()
    {
        int size = _contentList.size();
        com.ccssoft.rsas.common.xmlparser.Content[] mArray = new com.ccssoft.rsas.common.xmlparser.Content[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Content) _contentList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Content[] getContent() 

    /**
     * Method getContentCount
     */
    public int getContentCount()
    {
        return _contentList.size();
    } //-- int getContentCount() 

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
     * Method removeAllContent
     */
    public void removeAllContent()
    {
        _contentList.removeAllElements();
    } //-- void removeAllContent() 

    /**
     * Method removeContent
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Content removeContent(int index)
    {
        java.lang.Object obj = _contentList.elementAt(index);
        _contentList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Content) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Content removeContent(int) 

    /**
     * Method setContent
     * 
     * @param index
     * @param vContent
     */
    public void setContent(int index, com.ccssoft.rsas.common.xmlparser.Content vContent)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _contentList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _contentList.setElementAt(vContent, index);
    } //-- void setContent(int, com.regaltec.rsas.common.xmlparser.Content) 

    /**
     * Method setContent
     * 
     * @param contentArray
     */
    public void setContent(com.ccssoft.rsas.common.xmlparser.Content[] contentArray)
    {
        //-- copy array
        _contentList.removeAllElements();
        for (int i = 0; i < contentArray.length; i++) {
            _contentList.addElement(contentArray[i]);
        }
    } //-- void setContent(com.regaltec.rsas.common.xmlparser.Content) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Contents) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Contents.class, reader);
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
