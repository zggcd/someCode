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
 * Class PortalConditions.
 * 
 * @version $Revision$ $Date$
 */
public class PortalConditions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _portalConditionList
     */
    private java.util.Vector _portalConditionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PortalConditions() {
        super();
        _portalConditionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.PortalConditions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPortalCondition
     * 
     * @param vPortalCondition
     */
    public void addPortalCondition(com.ccssoft.rsas.common.xmlparser.PortalCondition vPortalCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _portalConditionList.addElement(vPortalCondition);
    } //-- void addPortalCondition(com.regaltec.rsas.common.xmlparser.PortalCondition) 

    /**
     * Method addPortalCondition
     * 
     * @param index
     * @param vPortalCondition
     */
    public void addPortalCondition(int index, com.ccssoft.rsas.common.xmlparser.PortalCondition vPortalCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        _portalConditionList.insertElementAt(vPortalCondition, index);
    } //-- void addPortalCondition(int, com.regaltec.rsas.common.xmlparser.PortalCondition) 

    /**
     * Method enumeratePortalCondition
     */
    public java.util.Enumeration enumeratePortalCondition()
    {
        return _portalConditionList.elements();
    } //-- java.util.Enumeration enumeratePortalCondition() 

    /**
     * Method getPortalCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PortalCondition getPortalCondition(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _portalConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.PortalCondition) _portalConditionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.PortalCondition getPortalCondition(int) 

    /**
     * Method getPortalCondition
     */
    public com.ccssoft.rsas.common.xmlparser.PortalCondition[] getPortalCondition()
    {
        int size = _portalConditionList.size();
        com.ccssoft.rsas.common.xmlparser.PortalCondition[] mArray = new com.ccssoft.rsas.common.xmlparser.PortalCondition[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.PortalCondition) _portalConditionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.PortalCondition[] getPortalCondition() 

    /**
     * Method getPortalConditionCount
     */
    public int getPortalConditionCount()
    {
        return _portalConditionList.size();
    } //-- int getPortalConditionCount() 

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
     * Method removeAllPortalCondition
     */
    public void removeAllPortalCondition()
    {
        _portalConditionList.removeAllElements();
    } //-- void removeAllPortalCondition() 

    /**
     * Method removePortalCondition
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.PortalCondition removePortalCondition(int index)
    {
        java.lang.Object obj = _portalConditionList.elementAt(index);
        _portalConditionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.PortalCondition) obj;
    } //-- com.regaltec.rsas.common.xmlparser.PortalCondition removePortalCondition(int) 

    /**
     * Method setPortalCondition
     * 
     * @param index
     * @param vPortalCondition
     */
    public void setPortalCondition(int index, com.ccssoft.rsas.common.xmlparser.PortalCondition vPortalCondition)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _portalConditionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _portalConditionList.setElementAt(vPortalCondition, index);
    } //-- void setPortalCondition(int, com.regaltec.rsas.common.xmlparser.PortalCondition) 

    /**
     * Method setPortalCondition
     * 
     * @param portalConditionArray
     */
    public void setPortalCondition(com.ccssoft.rsas.common.xmlparser.PortalCondition[] portalConditionArray)
    {
        //-- copy array
        _portalConditionList.removeAllElements();
        for (int i = 0; i < portalConditionArray.length; i++) {
            _portalConditionList.addElement(portalConditionArray[i]);
        }
    } //-- void setPortalCondition(com.regaltec.rsas.common.xmlparser.PortalCondition) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PortalConditions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PortalConditions.class, reader);
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
