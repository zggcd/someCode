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
 * Class Publishs.
 * 
 * @version $Revision$ $Date$
 */
public class Publishs implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����������
     */
    private java.util.Vector _publishList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Publishs() {
        super();
        _publishList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Publishs()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPublish
     * 
     * @param vPublish
     */
    public void addPublish(com.ccssoft.rsas.common.xmlparser.Publish vPublish)
        throws java.lang.IndexOutOfBoundsException
    {
        _publishList.addElement(vPublish);
    } //-- void addPublish(com.regaltec.rsas.common.xmlparser.Publish) 

    /**
     * Method addPublish
     * 
     * @param index
     * @param vPublish
     */
    public void addPublish(int index, com.ccssoft.rsas.common.xmlparser.Publish vPublish)
        throws java.lang.IndexOutOfBoundsException
    {
        _publishList.insertElementAt(vPublish, index);
    } //-- void addPublish(int, com.regaltec.rsas.common.xmlparser.Publish) 

    /**
     * Method enumeratePublish
     */
    public java.util.Enumeration enumeratePublish()
    {
        return _publishList.elements();
    } //-- java.util.Enumeration enumeratePublish() 

    /**
     * Method getPublish
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Publish getPublish(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _publishList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Publish) _publishList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Publish getPublish(int) 

    /**
     * Method getPublish
     */
    public com.ccssoft.rsas.common.xmlparser.Publish[] getPublish()
    {
        int size = _publishList.size();
        com.ccssoft.rsas.common.xmlparser.Publish[] mArray = new com.ccssoft.rsas.common.xmlparser.Publish[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Publish) _publishList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Publish[] getPublish() 

    /**
     * Method getPublishCount
     */
    public int getPublishCount()
    {
        return _publishList.size();
    } //-- int getPublishCount() 

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
     * Method removeAllPublish
     */
    public void removeAllPublish()
    {
        _publishList.removeAllElements();
    } //-- void removeAllPublish() 

    /**
     * Method removePublish
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Publish removePublish(int index)
    {
        java.lang.Object obj = _publishList.elementAt(index);
        _publishList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Publish) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Publish removePublish(int) 

    /**
     * Method setPublish
     * 
     * @param index
     * @param vPublish
     */
    public void setPublish(int index, com.ccssoft.rsas.common.xmlparser.Publish vPublish)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _publishList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _publishList.setElementAt(vPublish, index);
    } //-- void setPublish(int, com.regaltec.rsas.common.xmlparser.Publish) 

    /**
     * Method setPublish
     * 
     * @param publishArray
     */
    public void setPublish(com.ccssoft.rsas.common.xmlparser.Publish[] publishArray)
    {
        //-- copy array
        _publishList.removeAllElements();
        for (int i = 0; i < publishArray.length; i++) {
            _publishList.addElement(publishArray[i]);
        }
    } //-- void setPublish(com.regaltec.rsas.common.xmlparser.Publish) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Publishs) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Publishs.class, reader);
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
