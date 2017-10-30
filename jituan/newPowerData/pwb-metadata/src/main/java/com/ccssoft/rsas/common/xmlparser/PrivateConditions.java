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
 * ˽������
 * 
 * @version $Revision$ $Date$
 */
public class PrivateConditions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ��ǰָ�����ɵ�����
     */
    private com.ccssoft.rsas.common.xmlparser.Conditions _conditions;


      //----------------/
     //- Constructors -/
    //----------------/

    public PrivateConditions() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.PrivateConditions()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'conditions'. The field
     * 'conditions' has the following description: ��ǰָ�����ɵ�����
     * 
     * @return the value of field 'conditions'.
     */
    public com.ccssoft.rsas.common.xmlparser.Conditions getConditions()
    {
        return this._conditions;
    } //-- com.regaltec.rsas.common.xmlparser.Conditions getConditions() 

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
     * Sets the value of field 'conditions'. The field 'conditions'
     * has the following description: ��ǰָ�����ɵ�����
     * 
     * @param conditions the value of field 'conditions'.
     */
    public void setConditions(com.ccssoft.rsas.common.xmlparser.Conditions conditions)
    {
        this._conditions = conditions;
    } //-- void setConditions(com.regaltec.rsas.common.xmlparser.Conditions) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.PrivateConditions) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.PrivateConditions.class, reader);
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
