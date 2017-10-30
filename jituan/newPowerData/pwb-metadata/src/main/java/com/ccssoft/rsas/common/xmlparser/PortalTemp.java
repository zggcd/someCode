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
 * ����ģ��
 * 
 * @version $Revision$ $Date$
 */
public class PortalTemp implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _portalList
     */
    private java.util.Vector _portalList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PortalTemp() {
        super();
        _portalList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.PortalTemp()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPortal
     * 
     * @param vPortal
     */
    public void addPortal(com.ccssoft.rsas.common.xmlparser.Portal vPortal)
        throws java.lang.IndexOutOfBoundsException
    {
        _portalList.addElement(vPortal);
    } //-- void addPortal(com.regaltec.rsas.common.xmlparser.Portal) 

    /**
     * Method addPortal
     * 
     * @param index
     * @param vPortal
     */
    public void addPortal(int index, com.ccssoft.rsas.common.xmlparser.Portal vPortal)
        throws java.lang.IndexOutOfBoundsException
    {
        _portalList.insertElementAt(vPortal, index);
    } //-- void addPortal(int, com.regaltec.rsas.common.xmlparser.Portal) 

    /**
     * Method enumeratePortal
     */
    public java.util.Enumeration enumeratePortal()
    {
        return _portalList.elements();
    } //-- java.util.Enumeration enumeratePortal() 

    /**
     * Method getPortal
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Portal getPortal(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _portalList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Portal) _portalList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Portal getPortal(int) 

    /**
     * Method getPortal
     */
    public com.ccssoft.rsas.common.xmlparser.Portal[] getPortal()
    {
        int size = _portalList.size();
        com.ccssoft.rsas.common.xmlparser.Portal[] mArray = new com.ccssoft.rsas.common.xmlparser.Portal[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Portal) _portalList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Portal[] getPortal() 

    /**
     * Method getPortalCount
     */
    public int getPortalCount()
    {
        return _portalList.size();
    } //-- int getPortalCount() 

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
     * Method removeAllPortal
     */
    public void removeAllPortal()
    {
        _portalList.removeAllElements();
    } //-- void removeAllPortal() 

    /**
     * Method removePortal
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Portal removePortal(int index)
    {
        java.lang.Object obj = _portalList.elementAt(index);
        _portalList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Portal) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Portal removePortal(int) 

    /**
     * Method setPortal
     * 
     * @param index
     * @param vPortal
     */
    public void setPortal(int index, com.ccssoft.rsas.common.xmlparser.Portal vPortal)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _portalList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _portalList.setElementAt(vPortal, index);
    } //-- void setPortal(int, com.regaltec.rsas.common.xmlparser.Portal) 

    /**
     * Method setPortal
     * 
     * @param portalArray
     */
    public void setPortal(com.ccssoft.rsas.common.xmlparser.Portal[] portalArray)
    {
        //-- copy array
        _portalList.removeAllElements();
        for (int i = 0; i < portalArray.length; i++) {
            _portalList.addElement(portalArray[i]);
        }
    } //-- void setPortal(com.regaltec.rsas.common.xmlparser.Portal) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PortalTemp) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PortalTemp.class, reader);
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
