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
 * Class Templates.
 * 
 * @version $Revision$ $Date$
 */
public class Templates implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ʹ�õı�����ʽ
     */
    private java.util.Vector _templateList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Templates() {
        super();
        _templateList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Templates()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTemplate
     * 
     * @param vTemplate
     */
    public void addTemplate(com.ccssoft.rsas.common.xmlparser.Template vTemplate)
        throws java.lang.IndexOutOfBoundsException
    {
        _templateList.addElement(vTemplate);
    } //-- void addTemplate(com.regaltec.rsas.common.xmlparser.Template) 

    /**
     * Method addTemplate
     * 
     * @param index
     * @param vTemplate
     */
    public void addTemplate(int index, com.ccssoft.rsas.common.xmlparser.Template vTemplate)
        throws java.lang.IndexOutOfBoundsException
    {
        _templateList.insertElementAt(vTemplate, index);
    } //-- void addTemplate(int, com.regaltec.rsas.common.xmlparser.Template) 

    /**
     * Method enumerateTemplate
     */
    public java.util.Enumeration enumerateTemplate()
    {
        return _templateList.elements();
    } //-- java.util.Enumeration enumerateTemplate() 

    /**
     * Method getTemplate
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Template getTemplate(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _templateList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Template) _templateList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Template getTemplate(int) 

    /**
     * Method getTemplate
     */
    public com.ccssoft.rsas.common.xmlparser.Template[] getTemplate()
    {
        int size = _templateList.size();
        com.ccssoft.rsas.common.xmlparser.Template[] mArray = new com.ccssoft.rsas.common.xmlparser.Template[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Template) _templateList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Template[] getTemplate() 

    /**
     * Method getTemplateCount
     */
    public int getTemplateCount()
    {
        return _templateList.size();
    } //-- int getTemplateCount() 

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
     * Method removeAllTemplate
     */
    public void removeAllTemplate()
    {
        _templateList.removeAllElements();
    } //-- void removeAllTemplate() 

    /**
     * Method removeTemplate
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Template removeTemplate(int index)
    {
        java.lang.Object obj = _templateList.elementAt(index);
        _templateList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Template) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Template removeTemplate(int) 

    /**
     * Method setTemplate
     * 
     * @param index
     * @param vTemplate
     */
    public void setTemplate(int index, com.ccssoft.rsas.common.xmlparser.Template vTemplate)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _templateList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _templateList.setElementAt(vTemplate, index);
    } //-- void setTemplate(int, com.regaltec.rsas.common.xmlparser.Template) 

    /**
     * Method setTemplate
     * 
     * @param templateArray
     */
    public void setTemplate(com.ccssoft.rsas.common.xmlparser.Template[] templateArray)
    {
        //-- copy array
        _templateList.removeAllElements();
        for (int i = 0; i < templateArray.length; i++) {
            _templateList.addElement(templateArray[i]);
        }
    } //-- void setTemplate(com.regaltec.rsas.common.xmlparser.Template) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Templates) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Templates.class, reader);
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
