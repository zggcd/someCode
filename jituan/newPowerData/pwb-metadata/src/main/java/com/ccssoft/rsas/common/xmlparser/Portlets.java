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
 * Class Portlets.
 * 
 * @version $Revision$ $Date$
 */
public class Portlets implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _portletList
     */
    private java.util.Vector _portletList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Portlets() {
        super();
        _portletList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Portlets()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPortlet
     * 
     * @param vPortlet
     */
    public void addPortlet(com.ccssoft.rsas.common.xmlparser.Portlet vPortlet)
        throws java.lang.IndexOutOfBoundsException
    {
        _portletList.addElement(vPortlet);
    } //-- void addPortlet(com.regaltec.rsas.common.xmlparser.Portlet) 

    /**
     * Method addPortlet
     * 
     * @param index
     * @param vPortlet
     */
    public void addPortlet(int index, com.ccssoft.rsas.common.xmlparser.Portlet vPortlet)
        throws java.lang.IndexOutOfBoundsException
    {
        _portletList.insertElementAt(vPortlet, index);
    } //-- void addPortlet(int, com.regaltec.rsas.common.xmlparser.Portlet) 

    /**
     * Method enumeratePortlet
     */
    public java.util.Enumeration enumeratePortlet()
    {
        return _portletList.elements();
    } //-- java.util.Enumeration enumeratePortlet() 

    /**
     * Method getPortlet
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Portlet getPortlet(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _portletList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Portlet) _portletList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Portlet getPortlet(int) 

    /**
     * Method getPortlet
     */
    public com.ccssoft.rsas.common.xmlparser.Portlet[] getPortlet()
    {
        int size = _portletList.size();
        com.ccssoft.rsas.common.xmlparser.Portlet[] mArray = new com.ccssoft.rsas.common.xmlparser.Portlet[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Portlet) _portletList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Portlet[] getPortlet() 

    /**
     * Method getPortletCount
     */
    public int getPortletCount()
    {
        return _portletList.size();
    } //-- int getPortletCount() 

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
     * Method removeAllPortlet
     */
    public void removeAllPortlet()
    {
        _portletList.removeAllElements();
    } //-- void removeAllPortlet() 

    /**
     * Method removePortlet
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Portlet removePortlet(int index)
    {
        java.lang.Object obj = _portletList.elementAt(index);
        _portletList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Portlet) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Portlet removePortlet(int) 

    /**
     * Method setPortlet
     * 
     * @param index
     * @param vPortlet
     */
    public void setPortlet(int index, com.ccssoft.rsas.common.xmlparser.Portlet vPortlet)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _portletList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _portletList.setElementAt(vPortlet, index);
    } //-- void setPortlet(int, com.regaltec.rsas.common.xmlparser.Portlet) 

    /**
     * Method setPortlet
     * 
     * @param portletArray
     */
    public void setPortlet(com.ccssoft.rsas.common.xmlparser.Portlet[] portletArray)
    {
        //-- copy array
        _portletList.removeAllElements();
        for (int i = 0; i < portletArray.length; i++) {
            _portletList.addElement(portletArray[i]);
        }
    } //-- void setPortlet(com.regaltec.rsas.common.xmlparser.Portlet) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Portlets) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Portlets.class, reader);
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
