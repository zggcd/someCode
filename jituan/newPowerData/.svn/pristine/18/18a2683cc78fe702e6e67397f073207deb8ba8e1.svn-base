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
 * Class TaskerSendBacklogMsgTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class TaskerSendBacklogMsgTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The sbtIgnore type
     */
    public static final int SBTIGNORE_TYPE = 0;

    /**
     * The instance of the sbtIgnore type
     */
    public static final TaskerSendBacklogMsgTypeType SBTIGNORE = new TaskerSendBacklogMsgTypeType(SBTIGNORE_TYPE, "sbtIgnore");

    /**
     * The sbtAfterWithoutNoticeTime type
     */
    public static final int SBTAFTERWITHOUTNOTICETIME_TYPE = 1;

    /**
     * The instance of the sbtAfterWithoutNoticeTime type
     */
    public static final TaskerSendBacklogMsgTypeType SBTAFTERWITHOUTNOTICETIME = new TaskerSendBacklogMsgTypeType(SBTAFTERWITHOUTNOTICETIME_TYPE, "sbtAfterWithoutNoticeTime");

    /**
     * The sbtSpecifiedTime type
     */
    public static final int SBTSPECIFIEDTIME_TYPE = 2;

    /**
     * The instance of the sbtSpecifiedTime type
     */
    public static final TaskerSendBacklogMsgTypeType SBTSPECIFIEDTIME = new TaskerSendBacklogMsgTypeType(SBTSPECIFIEDTIME_TYPE, "sbtSpecifiedTime");

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

    private TaskerSendBacklogMsgTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerSendBacklogMsgTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of TaskerSendBacklogMsgTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * TaskerSendBacklogMsgTypeType
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
        members.put("sbtIgnore", SBTIGNORE);
        members.put("sbtAfterWithoutNoticeTime", SBTAFTERWITHOUTNOTICETIME);
        members.put("sbtSpecifiedTime", SBTSPECIFIEDTIME);
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
     * TaskerSendBacklogMsgTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new TaskerSendBacklogMsgTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.TaskerSendBacklogMsgTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TaskerSendBacklogMsgTypeType";
            throw new IllegalArgumentException(err);
        }
        return (TaskerSendBacklogMsgTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerSendBacklogMsgTypeType valueOf(java.lang.String) 

}
