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
 * Class Organizations.
 * 
 * @version $Revision$ $Date$
 */
public class Organizations implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��֯����
     */
    private java.util.Vector _organizationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Organizations() {
        super();
        _organizationList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Organizations()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOrganization
     * 
     * @param vOrganization
     */
    public void addOrganization(com.ccssoft.rsas.common.xmlparser.Organization vOrganization)
        throws java.lang.IndexOutOfBoundsException
    {
        _organizationList.addElement(vOrganization);
    } //-- void addOrganization(com.regaltec.rsas.common.xmlparser.Organization) 

    /**
     * Method addOrganization
     * 
     * @param index
     * @param vOrganization
     */
    public void addOrganization(int index, com.ccssoft.rsas.common.xmlparser.Organization vOrganization)
        throws java.lang.IndexOutOfBoundsException
    {
        _organizationList.insertElementAt(vOrganization, index);
    } //-- void addOrganization(int, com.regaltec.rsas.common.xmlparser.Organization) 

    /**
     * Method enumerateOrganization
     */
    public java.util.Enumeration enumerateOrganization()
    {
        return _organizationList.elements();
    } //-- java.util.Enumeration enumerateOrganization() 

    /**
     * Method getOrganization
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Organization getOrganization(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _organizationList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Organization) _organizationList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Organization getOrganization(int) 

    /**
     * Method getOrganization
     */
    public com.ccssoft.rsas.common.xmlparser.Organization[] getOrganization()
    {
        int size = _organizationList.size();
        com.ccssoft.rsas.common.xmlparser.Organization[] mArray = new com.ccssoft.rsas.common.xmlparser.Organization[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Organization) _organizationList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Organization[] getOrganization() 

    /**
     * Method getOrganizationCount
     */
    public int getOrganizationCount()
    {
        return _organizationList.size();
    } //-- int getOrganizationCount() 

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
     * Method removeAllOrganization
     */
    public void removeAllOrganization()
    {
        _organizationList.removeAllElements();
    } //-- void removeAllOrganization() 

    /**
     * Method removeOrganization
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Organization removeOrganization(int index)
    {
        java.lang.Object obj = _organizationList.elementAt(index);
        _organizationList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Organization) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Organization removeOrganization(int) 

    /**
     * Method setOrganization
     * 
     * @param index
     * @param vOrganization
     */
    public void setOrganization(int index, com.ccssoft.rsas.common.xmlparser.Organization vOrganization)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _organizationList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _organizationList.setElementAt(vOrganization, index);
    } //-- void setOrganization(int, com.regaltec.rsas.common.xmlparser.Organization) 

    /**
     * Method setOrganization
     * 
     * @param organizationArray
     */
    public void setOrganization(com.ccssoft.rsas.common.xmlparser.Organization[] organizationArray)
    {
        //-- copy array
        _organizationList.removeAllElements();
        for (int i = 0; i < organizationArray.length; i++) {
            _organizationList.addElement(organizationArray[i]);
        }
    } //-- void setOrganization(com.regaltec.rsas.common.xmlparser.Organization) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Organizations) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Organizations.class, reader);
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
