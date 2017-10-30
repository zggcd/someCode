/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class RefObjectRefObjectTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class RefObjectRefObjectTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The rotChar type
     */
    public static final int ROTCHAR_TYPE = 0;

    /**
     * The instance of the rotChar type
     */
    public static final RefObjectRefObjectTypeType ROTCHAR = new RefObjectRefObjectTypeType(ROTCHAR_TYPE, "rotChar");

    /**
     * The rotTable type
     */
    public static final int ROTTABLE_TYPE = 1;

    /**
     * The instance of the rotTable type
     */
    public static final RefObjectRefObjectTypeType ROTTABLE = new RefObjectRefObjectTypeType(ROTTABLE_TYPE, "rotTable");

    /**
     * The rotConclusion type
     */
    public static final int ROTCONCLUSION_TYPE = 2;

    /**
     * The instance of the rotConclusion type
     */
    public static final RefObjectRefObjectTypeType ROTCONCLUSION = new RefObjectRefObjectTypeType(ROTCONCLUSION_TYPE, "rotConclusion");

    /**
     * The rotReport type
     */
    public static final int ROTREPORT_TYPE = 3;

    /**
     * The instance of the rotReport type
     */
    public static final RefObjectRefObjectTypeType ROTREPORT = new RefObjectRefObjectTypeType(ROTREPORT_TYPE, "rotReport");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private RefObjectRefObjectTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.RefObjectRefObjectTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of RefObjectRefObjectTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * RefObjectRefObjectTypeType
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("rotChar", ROTCHAR);
        members.put("rotTable", ROTTABLE);
        members.put("rotConclusion", ROTCONCLUSION);
        members.put("rotReport", ROTREPORT);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method readResolve will be called during deserialization to
     * replace the deserialized object with the correct constant
     * instance. <br/>
     */
    private java.lang.Object readResolve()
    {
        return valueOf(this.stringValue);
    } //-- java.lang.Object readResolve() 

    /**
     * Method toStringReturns the String representation of this
     * RefObjectRefObjectTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new RefObjectRefObjectTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.RefObjectRefObjectTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid RefObjectRefObjectTypeType";
            throw new IllegalArgumentException(err);
        }
        return (RefObjectRefObjectTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.RefObjectRefObjectTypeType valueOf(java.lang.String) 

}
