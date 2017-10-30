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
 * Class TaskerNotifyTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class TaskerNotifyTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ntSMS type
     */
    public static final int NTSMS_TYPE = 0;

    /**
     * The instance of the ntSMS type
     */
    public static final TaskerNotifyTypeType NTSMS = new TaskerNotifyTypeType(NTSMS_TYPE, "ntSMS");

    /**
     * The ntMAIL type
     */
    public static final int NTMAIL_TYPE = 1;

    /**
     * The instance of the ntMAIL type
     */
    public static final TaskerNotifyTypeType NTMAIL = new TaskerNotifyTypeType(NTMAIL_TYPE, "ntMAIL");

    /**
     * The ntFTP type
     */
    public static final int NTFTP_TYPE = 2;

    /**
     * The instance of the ntFTP type
     */
    public static final TaskerNotifyTypeType NTFTP = new TaskerNotifyTypeType(NTFTP_TYPE, "ntFTP");

    /**
     * The ntSMSMAIL type
     */
    public static final int NTSMSMAIL_TYPE = 3;

    /**
     * The instance of the ntSMSMAIL type
     */
    public static final TaskerNotifyTypeType NTSMSMAIL = new TaskerNotifyTypeType(NTSMSMAIL_TYPE, "ntSMSMAIL");

    /**
     * The ntSMSFTP type
     */
    public static final int NTSMSFTP_TYPE = 4;

    /**
     * The instance of the ntSMSFTP type
     */
    public static final TaskerNotifyTypeType NTSMSFTP = new TaskerNotifyTypeType(NTSMSFTP_TYPE, "ntSMSFTP");

    /**
     * The ntMAILFTP type
     */
    public static final int NTMAILFTP_TYPE = 5;

    /**
     * The instance of the ntMAILFTP type
     */
    public static final TaskerNotifyTypeType NTMAILFTP = new TaskerNotifyTypeType(NTMAILFTP_TYPE, "ntMAILFTP");

    /**
     * The ntALL type
     */
    public static final int NTALL_TYPE = 6;

    /**
     * The instance of the ntALL type
     */
    public static final TaskerNotifyTypeType NTALL = new TaskerNotifyTypeType(NTALL_TYPE, "ntALL");

    /**
     * The ntNO type
     */
    public static final int NTNO_TYPE = 7;

    /**
     * The instance of the ntNO type
     */
    public static final TaskerNotifyTypeType NTNO = new TaskerNotifyTypeType(NTNO_TYPE, "ntNO");

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

    private TaskerNotifyTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerNotifyTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of TaskerNotifyTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this TaskerNotifyTypeType
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
        members.put("ntSMS", NTSMS);
        members.put("ntMAIL", NTMAIL);
        members.put("ntFTP", NTFTP);
        members.put("ntSMSMAIL", NTSMSMAIL);
        members.put("ntSMSFTP", NTSMSFTP);
        members.put("ntMAILFTP", NTMAILFTP);
        members.put("ntALL", NTALL);
        members.put("ntNO", NTNO);
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
     * TaskerNotifyTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new TaskerNotifyTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.TaskerNotifyTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TaskerNotifyTypeType";
            throw new IllegalArgumentException(err);
        }
        return (TaskerNotifyTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerNotifyTypeType valueOf(java.lang.String) 

}
