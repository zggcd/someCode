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
 * Class MetaInfo.
 * 
 * @version $Revision$ $Date$
 */
public class MetaInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dimHeaders
     */
    private com.ccssoft.rsas.common.xmlparser.DimHeaders _dimHeaders;

    /**
     * Field _measureHeaders
     */
    private com.ccssoft.rsas.common.xmlparser.MeasureHeaders _measureHeaders;


      //----------------/
     //- Constructors -/
    //----------------/

    public MetaInfo() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.MetaInfo()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dimHeaders'.
     * 
     * @return the value of field 'dimHeaders'.
     */
    public com.ccssoft.rsas.common.xmlparser.DimHeaders getDimHeaders()
    {
        return this._dimHeaders;
    } //-- com.regaltec.rsas.common.xmlparser.DimHeaders getDimHeaders() 

    /**
     * Returns the value of field 'measureHeaders'.
     * 
     * @return the value of field 'measureHeaders'.
     */
    public com.ccssoft.rsas.common.xmlparser.MeasureHeaders getMeasureHeaders()
    {
        return this._measureHeaders;
    } //-- com.regaltec.rsas.common.xmlparser.MeasureHeaders getMeasureHeaders() 

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
     * Sets the value of field 'dimHeaders'.
     * 
     * @param dimHeaders the value of field 'dimHeaders'.
     */
    public void setDimHeaders(com.ccssoft.rsas.common.xmlparser.DimHeaders dimHeaders)
    {
        this._dimHeaders = dimHeaders;
    } //-- void setDimHeaders(com.regaltec.rsas.common.xmlparser.DimHeaders) 

    /**
     * Sets the value of field 'measureHeaders'.
     * 
     * @param measureHeaders the value of field 'measureHeaders'.
     */
    public void setMeasureHeaders(com.ccssoft.rsas.common.xmlparser.MeasureHeaders measureHeaders)
    {
        this._measureHeaders = measureHeaders;
    } //-- void setMeasureHeaders(com.regaltec.rsas.common.xmlparser.MeasureHeaders) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MetaInfo) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MetaInfo.class, reader);
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