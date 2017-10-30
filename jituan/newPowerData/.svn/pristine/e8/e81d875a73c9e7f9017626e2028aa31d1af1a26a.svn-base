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
 * HTML ��Ϣ����
 * 
 * @version $Revision$ $Date$
 */
public class MIDMessages implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * HTML ��Ϣ
     */
    private java.util.Vector _MIDMessageList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MIDMessages() {
        super();
        _MIDMessageList = new Vector();
    } //-- com.regaltec.rsas.common.xmlparser.MIDMessages()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMIDMessage
     * 
     * @param vMIDMessage
     */
    public void addMIDMessage(com.ccssoft.rsas.common.xmlparser.MIDMessage vMIDMessage)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDMessageList.addElement(vMIDMessage);
    } //-- void addMIDMessage(com.regaltec.rsas.common.xmlparser.MIDMessage) 

    /**
     * Method addMIDMessage
     * 
     * @param index
     * @param vMIDMessage
     */
    public void addMIDMessage(int index, com.ccssoft.rsas.common.xmlparser.MIDMessage vMIDMessage)
        throws java.lang.IndexOutOfBoundsException
    {
        _MIDMessageList.insertElementAt(vMIDMessage, index);
    } //-- void addMIDMessage(int, com.regaltec.rsas.common.xmlparser.MIDMessage) 

    /**
     * Method enumerateMIDMessage
     */
    public java.util.Enumeration enumerateMIDMessage()
    {
        return _MIDMessageList.elements();
    } //-- java.util.Enumeration enumerateMIDMessage() 

    /**
     * Method getMIDMessage
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDMessage getMIDMessage(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDMessageList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.ccssoft.rsas.common.xmlparser.MIDMessage) _MIDMessageList.elementAt(index);
    } //-- com.regaltec.rsas.common.xmlparser.MIDMessage getMIDMessage(int) 

    /**
     * Method getMIDMessage
     */
    public com.ccssoft.rsas.common.xmlparser.MIDMessage[] getMIDMessage()
    {
        int size = _MIDMessageList.size();
        com.ccssoft.rsas.common.xmlparser.MIDMessage[] mArray = new com.ccssoft.rsas.common.xmlparser.MIDMessage[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.ccssoft.rsas.common.xmlparser.MIDMessage) _MIDMessageList.elementAt(index);
        }
        return mArray;
    } //-- com.regaltec.rsas.common.xmlparser.MIDMessage[] getMIDMessage() 

    /**
     * Method getMIDMessageCount
     */
    public int getMIDMessageCount()
    {
        return _MIDMessageList.size();
    } //-- int getMIDMessageCount() 

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
     * Method removeAllMIDMessage
     */
    public void removeAllMIDMessage()
    {
        _MIDMessageList.removeAllElements();
    } //-- void removeAllMIDMessage() 

    /**
     * Method removeMIDMessage
     * 
     * @param index
     */
    public com.ccssoft.rsas.common.xmlparser.MIDMessage removeMIDMessage(int index)
    {
        java.lang.Object obj = _MIDMessageList.elementAt(index);
        _MIDMessageList.removeElementAt(index);
        return (com.ccssoft.rsas.common.xmlparser.MIDMessage) obj;
    } //-- com.regaltec.rsas.common.xmlparser.MIDMessage removeMIDMessage(int) 

    /**
     * Method setMIDMessage
     * 
     * @param index
     * @param vMIDMessage
     */
    public void setMIDMessage(int index, com.ccssoft.rsas.common.xmlparser.MIDMessage vMIDMessage)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _MIDMessageList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _MIDMessageList.setElementAt(vMIDMessage, index);
    } //-- void setMIDMessage(int, com.regaltec.rsas.common.xmlparser.MIDMessage) 

    /**
     * Method setMIDMessage
     * 
     * @param MIDMessageArray
     */
    public void setMIDMessage(com.ccssoft.rsas.common.xmlparser.MIDMessage[] MIDMessageArray)
    {
        //-- copy array
        _MIDMessageList.removeAllElements();
        for (int i = 0; i < MIDMessageArray.length; i++) {
            _MIDMessageList.addElement(MIDMessageArray[i]);
        }
    } //-- void setMIDMessage(com.regaltec.rsas.common.xmlparser.MIDMessage) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.MIDMessages) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.MIDMessages.class, reader);
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
