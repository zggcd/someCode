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
 * Class EvaluationCategorys.
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationCategorys implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ָ��Ŀ¼
     */
    private java.util.Vector _evaluationCategoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EvaluationCategorys() {
        super();
        _evaluationCategoryList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationCategorys()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addEvaluationCategory
     * 
     * @param vEvaluationCategory
     */
    public void addEvaluationCategory(com.ccssoft.rsas.common.xmlparser.EvaluationCategory vEvaluationCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationCategoryList.addElement(vEvaluationCategory);
    } //-- void addEvaluationCategory(com.regaltec.rsas.common.xmlparser.EvaluationCategory) 

    /**
     * Method addEvaluationCategory
     * 
     * @param index
     * @param vEvaluationCategory
     */
    public void addEvaluationCategory(int index, com.ccssoft.rsas.common.xmlparser.EvaluationCategory vEvaluationCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationCategoryList.insertElementAt(vEvaluationCategory, index);
    } //-- void addEvaluationCategory(int, com.regaltec.rsas.common.xmlparser.EvaluationCategory) 

    /**
     * Method enumerateEvaluationCategory
     */
    public java.util.Enumeration enumerateEvaluationCategory()
    {
        return _evaluationCategoryList.elements();
    } //-- java.util.Enumeration enumerateEvaluationCategory() 

    /**
     * Method getEvaluationCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationCategory getEvaluationCategory(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationCategoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.EvaluationCategory) _evaluationCategoryList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationCategory getEvaluationCategory(int) 

    /**
     * Method getEvaluationCategory
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationCategory[] getEvaluationCategory()
    {
        int size = _evaluationCategoryList.size();
        com.ccssoft.rsas.common.xmlparser.EvaluationCategory[] mArray = new com.ccssoft.rsas.common.xmlparser.EvaluationCategory[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.EvaluationCategory) _evaluationCategoryList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationCategory[] getEvaluationCategory() 

    /**
     * Method getEvaluationCategoryCount
     */
    public int getEvaluationCategoryCount()
    {
        return _evaluationCategoryList.size();
    } //-- int getEvaluationCategoryCount() 

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
     * Method removeAllEvaluationCategory
     */
    public void removeAllEvaluationCategory()
    {
        _evaluationCategoryList.removeAllElements();
    } //-- void removeAllEvaluationCategory() 

    /**
     * Method removeEvaluationCategory
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationCategory removeEvaluationCategory(int index)
    {
        java.lang.Object obj = _evaluationCategoryList.elementAt(index);
        _evaluationCategoryList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.EvaluationCategory) obj;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationCategory removeEvaluationCategory(int) 

    /**
     * Method setEvaluationCategory
     * 
     * @param index
     * @param vEvaluationCategory
     */
    public void setEvaluationCategory(int index, com.ccssoft.rsas.common.xmlparser.EvaluationCategory vEvaluationCategory)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationCategoryList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _evaluationCategoryList.setElementAt(vEvaluationCategory, index);
    } //-- void setEvaluationCategory(int, com.regaltec.rsas.common.xmlparser.EvaluationCategory) 

    /**
     * Method setEvaluationCategory
     * 
     * @param evaluationCategoryArray
     */
    public void setEvaluationCategory(com.ccssoft.rsas.common.xmlparser.EvaluationCategory[] evaluationCategoryArray)
    {
        //-- copy array
        _evaluationCategoryList.removeAllElements();
        for (int i = 0; i < evaluationCategoryArray.length; i++) {
            _evaluationCategoryList.addElement(evaluationCategoryArray[i]);
        }
    } //-- void setEvaluationCategory(com.regaltec.rsas.common.xmlparser.EvaluationCategory) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.EvaluationCategorys) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.EvaluationCategorys.class, reader);
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
