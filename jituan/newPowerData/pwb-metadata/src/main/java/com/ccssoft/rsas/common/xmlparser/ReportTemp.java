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
 * ����-����
 * 
 * @version $Revision$ $Date$
 */
public class ReportTemp implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Portal����
     */
    private java.util.Vector _portletContentList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportTemp() {
        super();
        _portletContentList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.ReportTemp()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPortletContent
     * 
     * @param vPortletContent
     */
    public void addPortletContent(com.ccssoft.rsas.common.xmlparser.PortletContent vPortletContent)
        throws java.lang.IndexOutOfBoundsException
    {
        _portletContentList.addElement(vPortletContent);
    } //-- void addPortletContent(com.regaltec.rsas.common.xmlparser.PortletContent) 

    /**
     * Method addPortletContent
     * 
     * @param index
     * @param vPortletContent
     */
    public void addPortletContent(int index, com.ccssoft.rsas.common.xmlparser.PortletContent vPortletContent)
        throws java.lang.IndexOutOfBoundsException
    {
        _portletContentList.insertElementAt(vPortletContent, index);
    } //-- void addPortletContent(int, com.regaltec.rsas.common.xmlparser.PortletContent) 

    /**
     * Method enumeratePortletContent
     */
    public java.util.Enumeration enumeratePortletContent()
    {
        return _portletContentList.elements();
    } //-- java.util.Enumeration enumeratePortletContent() 

    /**
     * Method getPortletContent
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PortletContent getPortletContent(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _portletContentList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.PortletContent) _portletContentList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.PortletContent getPortletContent(int) 

    /**
     * Method getPortletContent
     */
    public com.ccssoft.rsas.common.xmlparser.PortletContent[] getPortletContent()
    {
        int size = _portletContentList.size();
        com.ccssoft.rsas.common.xmlparser.PortletContent[] mArray = new com.ccssoft.rsas.common.xmlparser.PortletContent[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.PortletContent) _portletContentList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.PortletContent[] getPortletContent() 

    /**
     * Method getPortletContentCount
     */
    public int getPortletContentCount()
    {
        return _portletContentList.size();
    } //-- int getPortletContentCount() 

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
     * Method removeAllPortletContent
     */
    public void removeAllPortletContent()
    {
        _portletContentList.removeAllElements();
    } //-- void removeAllPortletContent() 

    /**
     * Method removePortletContent
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PortletContent removePortletContent(int index)
    {
        java.lang.Object obj = _portletContentList.elementAt(index);
        _portletContentList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.PortletContent) obj;
    } //-- com.regaltec.rsas.common.xmlparser.PortletContent removePortletContent(int) 

    /**
     * Method setPortletContent
     * 
     * @param index
     * @param vPortletContent
     */
    public void setPortletContent(int index, com.ccssoft.rsas.common.xmlparser.PortletContent vPortletContent)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _portletContentList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _portletContentList.setElementAt(vPortletContent, index);
    } //-- void setPortletContent(int, com.regaltec.rsas.common.xmlparser.PortletContent) 

    /**
     * Method setPortletContent
     * 
     * @param portletContentArray
     */
    public void setPortletContent(com.ccssoft.rsas.common.xmlparser.PortletContent[] portletContentArray)
    {
        //-- copy array
        _portletContentList.removeAllElements();
        for (int i = 0; i < portletContentArray.length; i++) {
            _portletContentList.addElement(portletContentArray[i]);
        }
    } //-- void setPortletContent(com.regaltec.rsas.common.xmlparser.PortletContent) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.ReportTemp) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.ReportTemp.class, reader);
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
