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
 * Class Conclusions.
 * 
 * @version $Revision$ $Date$
 */
public class Conclusions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����
     */
    private java.util.Vector _conclusionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Conclusions() {
        super();
        _conclusionList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Conclusions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConclusion
     * 
     * @param vConclusion
     */
    public void addConclusion(com.ccssoft.rsas.common.xmlparser.Conclusion vConclusion)
        throws java.lang.IndexOutOfBoundsException
    {
        _conclusionList.addElement(vConclusion);
    } //-- void addConclusion(com.regaltec.rsas.common.xmlparser.Conclusion) 

    /**
     * Method addConclusion
     * 
     * @param index
     * @param vConclusion
     */
    public void addConclusion(int index, com.ccssoft.rsas.common.xmlparser.Conclusion vConclusion)
        throws java.lang.IndexOutOfBoundsException
    {
        _conclusionList.insertElementAt(vConclusion, index);
    } //-- void addConclusion(int, com.regaltec.rsas.common.xmlparser.Conclusion) 

    /**
     * Method enumerateConclusion
     */
    public java.util.Enumeration enumerateConclusion()
    {
        return _conclusionList.elements();
    } //-- java.util.Enumeration enumerateConclusion() 

    /**
     * Method getConclusion
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Conclusion getConclusion(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conclusionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Conclusion) _conclusionList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Conclusion getConclusion(int) 

    /**
     * Method getConclusion
     */
    public com.ccssoft.rsas.common.xmlparser.Conclusion[] getConclusion()
    {
        int size = _conclusionList.size();
        com.ccssoft.rsas.common.xmlparser.Conclusion[] mArray = new com.ccssoft.rsas.common.xmlparser.Conclusion[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Conclusion) _conclusionList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Conclusion[] getConclusion() 

    /**
     * Method getConclusionCount
     */
    public int getConclusionCount()
    {
        return _conclusionList.size();
    } //-- int getConclusionCount() 

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
     * Method removeAllConclusion
     */
    public void removeAllConclusion()
    {
        _conclusionList.removeAllElements();
    } //-- void removeAllConclusion() 

    /**
     * Method removeConclusion
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Conclusion removeConclusion(int index)
    {
        java.lang.Object obj = _conclusionList.elementAt(index);
        _conclusionList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Conclusion) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Conclusion removeConclusion(int) 

    /**
     * Method setConclusion
     * 
     * @param index
     * @param vConclusion
     */
    public void setConclusion(int index, com.ccssoft.rsas.common.xmlparser.Conclusion vConclusion)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _conclusionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _conclusionList.setElementAt(vConclusion, index);
    } //-- void setConclusion(int, com.regaltec.rsas.common.xmlparser.Conclusion) 

    /**
     * Method setConclusion
     * 
     * @param conclusionArray
     */
    public void setConclusion(com.ccssoft.rsas.common.xmlparser.Conclusion[] conclusionArray)
    {
        //-- copy array
        _conclusionList.removeAllElements();
        for (int i = 0; i < conclusionArray.length; i++) {
            _conclusionList.addElement(conclusionArray[i]);
        }
    } //-- void setConclusion(com.regaltec.rsas.common.xmlparser.Conclusion) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Conclusions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Conclusions.class, reader);
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
