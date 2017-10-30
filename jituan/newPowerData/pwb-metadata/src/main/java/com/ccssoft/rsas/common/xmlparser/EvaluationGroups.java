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
 * Class EvaluationGroups.
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationGroups implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ������
     */
    private java.util.Vector _evaluationGroupList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EvaluationGroups() {
        super();
        _evaluationGroupList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationGroups()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addEvaluationGroup
     * 
     * @param vEvaluationGroup
     */
    public void addEvaluationGroup(com.ccssoft.rsas.common.xmlparser.EvaluationGroup vEvaluationGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationGroupList.addElement(vEvaluationGroup);
    } //-- void addEvaluationGroup(com.regaltec.rsas.common.xmlparser.EvaluationGroup) 

    /**
     * Method addEvaluationGroup
     * 
     * @param index
     * @param vEvaluationGroup
     */
    public void addEvaluationGroup(int index, com.ccssoft.rsas.common.xmlparser.EvaluationGroup vEvaluationGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        _evaluationGroupList.insertElementAt(vEvaluationGroup, index);
    } //-- void addEvaluationGroup(int, com.regaltec.rsas.common.xmlparser.EvaluationGroup) 

    /**
     * Method enumerateEvaluationGroup
     */
    public java.util.Enumeration enumerateEvaluationGroup()
    {
        return _evaluationGroupList.elements();
    } //-- java.util.Enumeration enumerateEvaluationGroup() 

    /**
     * Method getEvaluationGroup
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationGroup getEvaluationGroup(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationGroupList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.EvaluationGroup) _evaluationGroupList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationGroup getEvaluationGroup(int) 

    /**
     * Method getEvaluationGroup
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationGroup[] getEvaluationGroup()
    {
        int size = _evaluationGroupList.size();
        com.ccssoft.rsas.common.xmlparser.EvaluationGroup[] mArray = new com.ccssoft.rsas.common.xmlparser.EvaluationGroup[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.EvaluationGroup) _evaluationGroupList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationGroup[] getEvaluationGroup() 

    /**
     * Method getEvaluationGroupCount
     */
    public int getEvaluationGroupCount()
    {
        return _evaluationGroupList.size();
    } //-- int getEvaluationGroupCount() 

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
     * Method removeAllEvaluationGroup
     */
    public void removeAllEvaluationGroup()
    {
        _evaluationGroupList.removeAllElements();
    } //-- void removeAllEvaluationGroup() 

    /**
     * Method removeEvaluationGroup
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationGroup removeEvaluationGroup(int index)
    {
        java.lang.Object obj = _evaluationGroupList.elementAt(index);
        _evaluationGroupList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.EvaluationGroup) obj;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationGroup removeEvaluationGroup(int) 

    /**
     * Method setEvaluationGroup
     * 
     * @param index
     * @param vEvaluationGroup
     */
    public void setEvaluationGroup(int index, com.ccssoft.rsas.common.xmlparser.EvaluationGroup vEvaluationGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _evaluationGroupList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _evaluationGroupList.setElementAt(vEvaluationGroup, index);
    } //-- void setEvaluationGroup(int, com.regaltec.rsas.common.xmlparser.EvaluationGroup) 

    /**
     * Method setEvaluationGroup
     * 
     * @param evaluationGroupArray
     */
    public void setEvaluationGroup(com.ccssoft.rsas.common.xmlparser.EvaluationGroup[] evaluationGroupArray)
    {
        //-- copy array
        _evaluationGroupList.removeAllElements();
        for (int i = 0; i < evaluationGroupArray.length; i++) {
            _evaluationGroupList.addElement(evaluationGroupArray[i]);
        }
    } //-- void setEvaluationGroup(com.regaltec.rsas.common.xmlparser.EvaluationGroup) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.EvaluationGroups) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.EvaluationGroups.class, reader);
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
