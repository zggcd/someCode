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
 * Class Links.
 * 
 * @version $Revision$ $Date$
 */
public class Links implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����Դ����
     */
    private java.util.Vector _linkList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Links() {
        super();
        _linkList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Links()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addLink
     * 
     * @param vLink
     */
    public void addLink(com.ccssoft.rsas.common.xmlparser.Link vLink)
        throws java.lang.IndexOutOfBoundsException
    {
        _linkList.addElement(vLink);
    } //-- void addLink(com.regaltec.rsas.common.xmlparser.Link) 

    /**
     * Method addLink
     * 
     * @param index
     * @param vLink
     */
    public void addLink(int index, com.ccssoft.rsas.common.xmlparser.Link vLink)
        throws java.lang.IndexOutOfBoundsException
    {
        _linkList.insertElementAt(vLink, index);
    } //-- void addLink(int, com.regaltec.rsas.common.xmlparser.Link) 

    /**
     * Method enumerateLink
     */
    public java.util.Enumeration enumerateLink()
    {
        return _linkList.elements();
    } //-- java.util.Enumeration enumerateLink() 

    /**
     * Method getLink
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Link getLink(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _linkList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Link) _linkList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Link getLink(int) 

    /**
     * Method getLink
     */
    public com.ccssoft.rsas.common.xmlparser.Link[] getLink()
    {
        int size = _linkList.size();
        com.ccssoft.rsas.common.xmlparser.Link[] mArray = new com.ccssoft.rsas.common.xmlparser.Link[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Link) _linkList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Link[] getLink() 

    /**
     * Method getLinkCount
     */
    public int getLinkCount()
    {
        return _linkList.size();
    } //-- int getLinkCount() 

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
     * Method removeAllLink
     */
    public void removeAllLink()
    {
        _linkList.removeAllElements();
    } //-- void removeAllLink() 

    /**
     * Method removeLink
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Link removeLink(int index)
    {
        java.lang.Object obj = _linkList.elementAt(index);
        _linkList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Link) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Link removeLink(int) 

    /**
     * Method setLink
     * 
     * @param index
     * @param vLink
     */
    public void setLink(int index, com.ccssoft.rsas.common.xmlparser.Link vLink)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _linkList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _linkList.setElementAt(vLink, index);
    } //-- void setLink(int, com.regaltec.rsas.common.xmlparser.Link) 

    /**
     * Method setLink
     * 
     * @param linkArray
     */
    public void setLink(com.ccssoft.rsas.common.xmlparser.Link[] linkArray)
    {
        //-- copy array
        _linkList.removeAllElements();
        for (int i = 0; i < linkArray.length; i++) {
            _linkList.addElement(linkArray[i]);
        }
    } //-- void setLink(com.regaltec.rsas.common.xmlparser.Link) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Links) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Links.class, reader);
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
