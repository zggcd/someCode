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
 * Class Evaluations.
 * 
 * @version $Revision$ $Date$
 */
public class Evaluations implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��������
     */
    private java.util.Vector _evaluationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Evaluations() {
        super();
        _evaluationList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Evaluations()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addEvaluation
     * 
     * @param vEvaluation
     */
    public void addEvaluation(com.ccssoft.rsas.common.xmlparser.Evaluation vEvaluation)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationList.addElement(vEvaluation);
    } //-- void addEvaluation(com.regaltec.rsas.common.xmlparser.Evaluation) 

    /**
     * Method addEvaluation
     * 
     * @param index
     * @param vEvaluation
     */
    public void addEvaluation(int index, com.ccssoft.rsas.common.xmlparser.Evaluation vEvaluation)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationList.insertElementAt(vEvaluation, index);
    } //-- void addEvaluation(int, com.regaltec.rsas.common.xmlparser.Evaluation) 

    /**
     * Method enumerateEvaluation
     */
    public java.util.Enumeration enumerateEvaluation()
    {
        return _evaluationList.elements();
    } //-- java.util.Enumeration enumerateEvaluation() 

    /**
     * Method getEvaluation
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Evaluation getEvaluation(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Evaluation) _evaluationList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Evaluation getEvaluation(int) 

    /**
     * Method getEvaluation
     */
    public com.ccssoft.rsas.common.xmlparser.Evaluation[] getEvaluation()
    {
        int size = _evaluationList.size();
        com.ccssoft.rsas.common.xmlparser.Evaluation[] mArray = new com.ccssoft.rsas.common.xmlparser.Evaluation[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Evaluation) _evaluationList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Evaluation[] getEvaluation() 

    /**
     * Method getEvaluationCount
     */
    public int getEvaluationCount()
    {
        return _evaluationList.size();
    } //-- int getEvaluationCount() 

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
     * Method removeAllEvaluation
     */
    public void removeAllEvaluation()
    {
        _evaluationList.removeAllElements();
    } //-- void removeAllEvaluation() 

    /**
     * Method removeEvaluation
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Evaluation removeEvaluation(int index)
    {
        java.lang.Object obj = _evaluationList.elementAt(index);
        _evaluationList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Evaluation) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Evaluation removeEvaluation(int) 

    /**
     * Method setEvaluation
     * 
     * @param index
     * @param vEvaluation
     */
    public void setEvaluation(int index, com.ccssoft.rsas.common.xmlparser.Evaluation vEvaluation)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _evaluationList.setElementAt(vEvaluation, index);
    } //-- void setEvaluation(int, com.regaltec.rsas.common.xmlparser.Evaluation) 

    /**
     * Method setEvaluation
     * 
     * @param evaluationArray
     */
    public void setEvaluation(com.ccssoft.rsas.common.xmlparser.Evaluation[] evaluationArray)
    {
        //-- copy array
        _evaluationList.removeAllElements();
        for (int i = 0; i < evaluationArray.length; i++) {
            _evaluationList.addElement(evaluationArray[i]);
        }
    } //-- void setEvaluation(com.regaltec.rsas.common.xmlparser.Evaluation) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Evaluations) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Evaluations.class, reader);
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
