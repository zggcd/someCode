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
 * Class Pictures.
 * 
 * @version $Revision$ $Date$
 */
public class Pictures implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _pictureList
     */
    private java.util.Vector _pictureList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Pictures() {
        super();
        _pictureList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Pictures()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPicture
     * 
     * @param vPicture
     */
    public void addPicture(com.ccssoft.rsas.common.xmlparser.Picture vPicture)
        throws java.lang.IndexOutOfBoundsException
    {
        _pictureList.addElement(vPicture);
    } //-- void addPicture(com.regaltec.rsas.common.xmlparser.Picture) 

    /**
     * Method addPicture
     * 
     * @param index
     * @param vPicture
     */
    public void addPicture(int index, com.ccssoft.rsas.common.xmlparser.Picture vPicture)
        throws java.lang.IndexOutOfBoundsException
    {
        _pictureList.insertElementAt(vPicture, index);
    } //-- void addPicture(int, com.regaltec.rsas.common.xmlparser.Picture) 

    /**
     * Method enumeratePicture
     */
    public java.util.Enumeration enumeratePicture()
    {
        return _pictureList.elements();
    } //-- java.util.Enumeration enumeratePicture() 

    /**
     * Method getPicture
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Picture getPicture(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _pictureList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Picture) _pictureList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Picture getPicture(int) 

    /**
     * Method getPicture
     */
    public com.ccssoft.rsas.common.xmlparser.Picture[] getPicture()
    {
        int size = _pictureList.size();
        com.ccssoft.rsas.common.xmlparser.Picture[] mArray = new com.ccssoft.rsas.common.xmlparser.Picture[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Picture) _pictureList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Picture[] getPicture() 

    /**
     * Method getPictureCount
     */
    public int getPictureCount()
    {
        return _pictureList.size();
    } //-- int getPictureCount() 

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
     * Method removeAllPicture
     */
    public void removeAllPicture()
    {
        _pictureList.removeAllElements();
    } //-- void removeAllPicture() 

    /**
     * Method removePicture
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Picture removePicture(int index)
    {
        java.lang.Object obj = _pictureList.elementAt(index);
        _pictureList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Picture) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Picture removePicture(int) 

    /**
     * Method setPicture
     * 
     * @param index
     * @param vPicture
     */
    public void setPicture(int index, com.ccssoft.rsas.common.xmlparser.Picture vPicture)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _pictureList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _pictureList.setElementAt(vPicture, index);
    } //-- void setPicture(int, com.regaltec.rsas.common.xmlparser.Picture) 

    /**
     * Method setPicture
     * 
     * @param pictureArray
     */
    public void setPicture(com.ccssoft.rsas.common.xmlparser.Picture[] pictureArray)
    {
        //-- copy array
        _pictureList.removeAllElements();
        for (int i = 0; i < pictureArray.length; i++) {
            _pictureList.addElement(pictureArray[i]);
        }
    } //-- void setPicture(com.regaltec.rsas.common.xmlparser.Picture) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Pictures) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Pictures.class, reader);
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
