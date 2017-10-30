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
 * Class Filters.
 * 
 * @version $Revision$ $Date$
 */
public class Filters implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * ����������
     */
    private java.util.Vector _filterList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Filters() {
        super();
        _filterList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.Filters()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addFilter
     * 
     * @param vFilter
     */
    public void addFilter(com.ccssoft.rsas.common.xmlparser.Filter vFilter)
        throws java.lang.IndexOutOfBoundsException
    {
        _filterList.addElement(vFilter);
    } //-- void addFilter(com.regaltec.rsas.common.xmlparser.Filter) 

    /**
     * Method addFilter
     * 
     * @param index
     * @param vFilter
     */
    public void addFilter(int index, com.ccssoft.rsas.common.xmlparser.Filter vFilter)
        throws java.lang.IndexOutOfBoundsException
    {
        _filterList.insertElementAt(vFilter, index);
    } //-- void addFilter(int, com.regaltec.rsas.common.xmlparser.Filter) 

    /**
     * Method enumerateFilter
     */
    public java.util.Enumeration enumerateFilter()
    {
        return _filterList.elements();
    } //-- java.util.Enumeration enumerateFilter() 

    /**
     * Method getFilter
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Filter getFilter(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _filterList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.Filter) _filterList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.Filter getFilter(int) 

    /**
     * Method getFilter
     */
    public com.ccssoft.rsas.common.xmlparser.Filter[] getFilter()
    {
        int size = _filterList.size();
        com.ccssoft.rsas.common.xmlparser.Filter[] mArray = new com.ccssoft.rsas.common.xmlparser.Filter[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.Filter) _filterList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.Filter[] getFilter() 

    /**
     * Method getFilterCount
     */
    public int getFilterCount()
    {
        return _filterList.size();
    } //-- int getFilterCount() 

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
     * Method removeAllFilter
     */
    public void removeAllFilter()
    {
        _filterList.removeAllElements();
    } //-- void removeAllFilter() 

    /**
     * Method removeFilter
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.Filter removeFilter(int index)
    {
        java.lang.Object obj = _filterList.elementAt(index);
        _filterList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.Filter) obj;
    } //-- com.regaltec.rsas.common.xmlparser.Filter removeFilter(int) 

    /**
     * Method setFilter
     * 
     * @param index
     * @param vFilter
     */
    public void setFilter(int index, com.ccssoft.rsas.common.xmlparser.Filter vFilter)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _filterList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _filterList.setElementAt(vFilter, index);
    } //-- void setFilter(int, com.regaltec.rsas.common.xmlparser.Filter) 

    /**
     * Method setFilter
     * 
     * @param filterArray
     */
    public void setFilter(com.ccssoft.rsas.common.xmlparser.Filter[] filterArray)
    {
        //-- copy array
        _filterList.removeAllElements();
        for (int i = 0; i < filterArray.length; i++) {
            _filterList.addElement(filterArray[i]);
        }
    } //-- void setFilter(com.regaltec.rsas.common.xmlparser.Filter) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.Filters) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.Filters.class, reader);
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
