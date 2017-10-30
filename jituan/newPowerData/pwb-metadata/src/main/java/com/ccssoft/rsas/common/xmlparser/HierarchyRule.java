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

import com.ccssoft.rsas.common.xmlparser.types.HierarchyRuleHierarchyRuleTypeType;

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
 * Class HierarchyRule.
 * 
 * @version $Revision$ $Date$
 */
public class HierarchyRule implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��������
     */
    private com.ccssoft.rsas.common.xmlparser.types.HierarchyRuleHierarchyRuleTypeType _hierarchyRuleType;

    /**
     * ������ʽ
     */
    private java.lang.String _ruleExpression;

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
     * ����
     */
    private com.ccssoft.rsas.common.xmlparser.Conclusion _conclusion;

    /**
     * ����������
     */
    private com.ccssoft.rsas.common.xmlparser.Relation _relation;


      //----------------/
     //- Constructors -/
    //----------------/

    public HierarchyRule() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.HierarchyRule()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'conclusion'. The field
     * 'conclusion' has the following description: ����
     * 
     * @return the value of field 'conclusion'.
     */
    public com.ccssoft.rsas.common.xmlparser.Conclusion getConclusion()
    {
        return this._conclusion;
    } //-- com.regaltec.rsas.common.xmlparser.Conclusion getConclusion() 

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
     * Returns the value of field 'hierarchyRuleType'. The field
     * 'hierarchyRuleType' has the following description: ��������
     * 
     * @return the value of field 'hierarchyRuleType'.
     */
    public com.ccssoft.rsas.common.xmlparser.types.HierarchyRuleHierarchyRuleTypeType getHierarchyRuleType()
    {
        return this._hierarchyRuleType;
    } //-- com.regaltec.rsas.common.xmlparser.types.HierarchyRuleHierarchyRuleTypeType getHierarchyRuleType() 

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
     * Returns the value of field 'relation'. The field 'relation'
     * has the following description: ����������
     * 
     * @return the value of field 'relation'.
     */
    public com.ccssoft.rsas.common.xmlparser.Relation getRelation()
    {
        return this._relation;
    } //-- com.regaltec.rsas.common.xmlparser.Relation getRelation() 

    /**
     * Returns the value of field 'ruleExpression'. The field
     * 'ruleExpression' has the following description: ������ʽ
     * 
     * @return the value of field 'ruleExpression'.
     */
    public java.lang.String getRuleExpression()
    {
        return this._ruleExpression;
    } //-- java.lang.String getRuleExpression() 

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
     * Sets the value of field 'conclusion'. The field 'conclusion'
     * has the following description: ����
     * 
     * @param conclusion the value of field 'conclusion'.
     */
    public void setConclusion(com.ccssoft.rsas.common.xmlparser.Conclusion conclusion)
    {
        this._conclusion = conclusion;
    } //-- void setConclusion(com.regaltec.rsas.common.xmlparser.Conclusion) 

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
     * Sets the value of field 'hierarchyRuleType'. The field
     * 'hierarchyRuleType' has the following description: ��������
     * 
     * @param hierarchyRuleType the value of field
     * 'hierarchyRuleType'.
     */
    public void setHierarchyRuleType(com.ccssoft.rsas.common.xmlparser.types.HierarchyRuleHierarchyRuleTypeType hierarchyRuleType)
    {
        this._hierarchyRuleType = hierarchyRuleType;
    } //-- void setHierarchyRuleType(com.regaltec.rsas.common.xmlparser.types.HierarchyRuleHierarchyRuleTypeType) 

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
     * Sets the value of field 'relation'. The field 'relation' has
     * the following description: ����������
     * 
     * @param relation the value of field 'relation'.
     */
    public void setRelation(com.ccssoft.rsas.common.xmlparser.Relation relation)
    {
        this._relation = relation;
    } //-- void setRelation(com.regaltec.rsas.common.xmlparser.Relation) 

    /**
     * Sets the value of field 'ruleExpression'. The field
     * 'ruleExpression' has the following description: ������ʽ
     * 
     * @param ruleExpression the value of field 'ruleExpression'.
     */
    public void setRuleExpression(java.lang.String ruleExpression)
    {
        this._ruleExpression = ruleExpression;
    } //-- void setRuleExpression(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.HierarchyRule) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.HierarchyRule.class, reader);
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
