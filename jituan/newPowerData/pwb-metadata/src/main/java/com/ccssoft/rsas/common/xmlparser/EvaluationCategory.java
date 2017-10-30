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
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * ָ��Ŀ¼
 * 
 * @version $Revision$ $Date$
 */
public class EvaluationCategory implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _treeCode
     */
    private java.lang.String _treeCode;

    /**
     * Field _parentID
     */
    private java.lang.String _parentID;

    /**
     * Field _ID
     */
    private java.lang.String _ID;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _desc
     */
    private java.lang.String _desc;

    /**
     * Field _evaluationCategorys
     */
    private com.ccssoft.rsas.common.xmlparser.EvaluationCategorys _evaluationCategorys;

    /**
     * Field _evaluations
     */
    private com.ccssoft.rsas.common.xmlparser.Evaluations _evaluations;


      //----------------/
     //- Constructors -/
    //----------------/

    public EvaluationCategory() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationCategory()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'desc'.
     */
    public java.lang.String getDesc()
    {
        return this._desc;
    } //-- java.lang.String getDesc() 

    /**
     * Returns the value of field 'evaluationCategorys'.
     * 
     * @return the value of field 'evaluationCategorys'.
     */
    public com.ccssoft.rsas.common.xmlparser.EvaluationCategorys getEvaluationCategorys()
    {
        return this._evaluationCategorys;
    } //-- com.regaltec.rsas.common.xmlparser.EvaluationCategorys getEvaluationCategorys() 

    /**
     * Returns the value of field 'evaluations'.
     * 
     * @return the value of field 'evaluations'.
     */
    public com.ccssoft.rsas.common.xmlparser.Evaluations getEvaluations()
    {
        return this._evaluations;
    } //-- com.regaltec.rsas.common.xmlparser.Evaluations getEvaluations() 

    /**
     * Returns the value of field 'ID'.
     * 
     * @return the value of field 'ID'.
     */
    public java.lang.String getID()
    {
        return this._ID;
    } //-- java.lang.String getID() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'parentID'.
     * 
     * @return the value of field 'parentID'.
     */
    public java.lang.String getParentID()
    {
        return this._parentID;
    } //-- java.lang.String getParentID() 

    /**
     * Returns the value of field 'treeCode'.
     * 
     * @return the value of field 'treeCode'.
     */
    public java.lang.String getTreeCode()
    {
        return this._treeCode;
    } //-- java.lang.String getTreeCode() 

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
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(java.lang.String desc)
    {
        this._desc = desc;
    } //-- void setDesc(java.lang.String) 

    /**
     * Sets the value of field 'evaluationCategorys'.
     * 
     * @param evaluationCategorys the value of field
     * 'evaluationCategorys'.
     */
    public void setEvaluationCategorys(com.ccssoft.rsas.common.xmlparser.EvaluationCategorys evaluationCategorys)
    {
        this._evaluationCategorys = evaluationCategorys;
    } //-- void setEvaluationCategorys(com.regaltec.rsas.common.xmlparser.EvaluationCategorys) 

    /**
     * Sets the value of field 'evaluations'.
     * 
     * @param evaluations the value of field 'evaluations'.
     */
    public void setEvaluations(com.ccssoft.rsas.common.xmlparser.Evaluations evaluations)
    {
        this._evaluations = evaluations;
    } //-- void setEvaluations(com.regaltec.rsas.common.xmlparser.Evaluations) 

    /**
     * Sets the value of field 'ID'.
     * 
     * @param ID the value of field 'ID'.
     */
    public void setID(java.lang.String ID)
    {
        this._ID = ID;
    } //-- void setID(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'parentID'.
     * 
     * @param parentID the value of field 'parentID'.
     */
    public void setParentID(java.lang.String parentID)
    {
        this._parentID = parentID;
    } //-- void setParentID(java.lang.String) 

    /**
     * Sets the value of field 'treeCode'.
     * 
     * @param treeCode the value of field 'treeCode'.
     */
    public void setTreeCode(java.lang.String treeCode)
    {
        this._treeCode = treeCode;
    } //-- void setTreeCode(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.EvaluationCategory) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.EvaluationCategory.class, reader);
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
