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
 * Class PortalConditionShowStyleType.
 * 
 * @version $Revision$ $Date$
 */
public class PortalConditionShowStyleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ssNormal type
     */
    public static final int SSNORMAL_TYPE = 0;

    /**
     * The instance of the ssNormal type
     */
    public static final PortalConditionShowStyleType SSNORMAL = new PortalConditionShowStyleType(SSNORMAL_TYPE, "ssNormal");

    /**
     * The ssDate type
     */
    public static final int SSDATE_TYPE = 1;

    /**
     * The instance of the ssDate type
     */
    public static final PortalConditionShowStyleType SSDATE = new PortalConditionShowStyleType(SSDATE_TYPE, "ssDate");

    /**
     * The ssTree type
     */
    public static final int SSTREE_TYPE = 2;

    /**
     * The instance of the ssTree type
     */
    public static final PortalConditionShowStyleType SSTREE = new PortalConditionShowStyleType(SSTREE_TYPE, "ssTree");

    /**
     * The ssMap type
     */
    public static final int SSMAP_TYPE = 3;

    /**
     * The instance of the ssMap type
     */
    public static final PortalConditionShowStyleType SSMAP = new PortalConditionShowStyleType(SSMAP_TYPE, "ssMap");

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

    private PortalConditionShowStyleType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortalConditionShowStyleType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of PortalConditionShowStyleType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * PortalConditionShowStyleType
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
        members.put("ssNormal", SSNORMAL);
        members.put("ssDate", SSDATE);
        members.put("ssTree", SSTREE);
        members.put("ssMap", SSMAP);
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
     * PortalConditionShowStyleType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new PortalConditionShowStyleType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.PortalConditionShowStyleType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PortalConditionShowStyleType";
            throw new IllegalArgumentException(err);
        }
        return (PortalConditionShowStyleType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortalConditionShowStyleType valueOf(java.lang.String) 

}
