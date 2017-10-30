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
 * Class NotifyUserNotifyObjectTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class NotifyUserNotifyObjectTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The notUser type
     */
    public static final int NOTUSER_TYPE = 0;

    /**
     * The instance of the notUser type
     */
    public static final NotifyUserNotifyObjectTypeType NOTUSER = new NotifyUserNotifyObjectTypeType(NOTUSER_TYPE, "notUser");

    /**
     * The notGroup type
     */
    public static final int NOTGROUP_TYPE = 1;

    /**
     * The instance of the notGroup type
     */
    public static final NotifyUserNotifyObjectTypeType NOTGROUP = new NotifyUserNotifyObjectTypeType(NOTGROUP_TYPE, "notGroup");

    /**
     * The notOrg type
     */
    public static final int NOTORG_TYPE = 2;

    /**
     * The instance of the notOrg type
     */
    public static final NotifyUserNotifyObjectTypeType NOTORG = new NotifyUserNotifyObjectTypeType(NOTORG_TYPE, "notOrg");

    /**
     * The notOther type
     */
    public static final int NOTOTHER_TYPE = 3;

    /**
     * The instance of the notOther type
     */
    public static final NotifyUserNotifyObjectTypeType NOTOTHER = new NotifyUserNotifyObjectTypeType(NOTOTHER_TYPE, "notOther");

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

    private NotifyUserNotifyObjectTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.NotifyUserNotifyObjectTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of NotifyUserNotifyObjectTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * NotifyUserNotifyObjectTypeType
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
        members.put("notUser", NOTUSER);
        members.put("notGroup", NOTGROUP);
        members.put("notOrg", NOTORG);
        members.put("notOther", NOTOTHER);
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
     * NotifyUserNotifyObjectTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new NotifyUserNotifyObjectTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.NotifyUserNotifyObjectTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid NotifyUserNotifyObjectTypeType";
            throw new IllegalArgumentException(err);
        }
        return (NotifyUserNotifyObjectTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.NotifyUserNotifyObjectTypeType valueOf(java.lang.String) 

}
