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
 * Class SubscriptionInformTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class SubscriptionInformTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The iftNone type
     */
    public static final int IFTNONE_TYPE = 0;

    /**
     * The instance of the iftNone type
     */
    public static final SubscriptionInformTypeType IFTNONE = new SubscriptionInformTypeType(IFTNONE_TYPE, "iftNone");

    /**
     * The iftMessage type
     */
    public static final int IFTMESSAGE_TYPE = 1;

    /**
     * The instance of the iftMessage type
     */
    public static final SubscriptionInformTypeType IFTMESSAGE = new SubscriptionInformTypeType(IFTMESSAGE_TYPE, "iftMessage");

    /**
     * The iftEmail type
     */
    public static final int IFTEMAIL_TYPE = 2;

    /**
     * The instance of the iftEmail type
     */
    public static final SubscriptionInformTypeType IFTEMAIL = new SubscriptionInformTypeType(IFTEMAIL_TYPE, "iftEmail");

    /**
     * The itfFTP type
     */
    public static final int ITFFTP_TYPE = 3;

    /**
     * The instance of the itfFTP type
     */
    public static final SubscriptionInformTypeType ITFFTP = new SubscriptionInformTypeType(ITFFTP_TYPE, "itfFTP");

    /**
     * The itfMsgEmail type
     */
    public static final int ITFMSGEMAIL_TYPE = 4;

    /**
     * The instance of the itfMsgEmail type
     */
    public static final SubscriptionInformTypeType ITFMSGEMAIL = new SubscriptionInformTypeType(ITFMSGEMAIL_TYPE, "itfMsgEmail");

    /**
     * The itfMsgFTP type
     */
    public static final int ITFMSGFTP_TYPE = 5;

    /**
     * The instance of the itfMsgFTP type
     */
    public static final SubscriptionInformTypeType ITFMSGFTP = new SubscriptionInformTypeType(ITFMSGFTP_TYPE, "itfMsgFTP");

    /**
     * The itfEmailFTP type
     */
    public static final int ITFEMAILFTP_TYPE = 6;

    /**
     * The instance of the itfEmailFTP type
     */
    public static final SubscriptionInformTypeType ITFEMAILFTP = new SubscriptionInformTypeType(ITFEMAILFTP_TYPE, "itfEmailFTP");

    /**
     * The itfAll type
     */
    public static final int ITFALL_TYPE = 7;

    /**
     * The instance of the itfAll type
     */
    public static final SubscriptionInformTypeType ITFALL = new SubscriptionInformTypeType(ITFALL_TYPE, "itfAll");

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

    private SubscriptionInformTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.SubscriptionInformTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of SubscriptionInformTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * SubscriptionInformTypeType
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
        members.put("iftNone", IFTNONE);
        members.put("iftMessage", IFTMESSAGE);
        members.put("iftEmail", IFTEMAIL);
        members.put("itfFTP", ITFFTP);
        members.put("itfMsgEmail", ITFMSGEMAIL);
        members.put("itfMsgFTP", ITFMSGFTP);
        members.put("itfEmailFTP", ITFEMAILFTP);
        members.put("itfAll", ITFALL);
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
     * SubscriptionInformTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new SubscriptionInformTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.SubscriptionInformTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SubscriptionInformTypeType";
            throw new IllegalArgumentException(err);
        }
        return (SubscriptionInformTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.SubscriptionInformTypeType valueOf(java.lang.String) 

}
