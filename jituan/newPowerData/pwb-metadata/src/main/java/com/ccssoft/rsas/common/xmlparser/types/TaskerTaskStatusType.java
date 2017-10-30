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
 * Class TaskerTaskStatusType.
 * 
 * @version $Revision$ $Date$
 */
public class TaskerTaskStatusType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The satComplete type
     */
    public static final int SATCOMPLETE_TYPE = 0;

    /**
     * The instance of the satComplete type
     */
    public static final TaskerTaskStatusType SATCOMPLETE = new TaskerTaskStatusType(SATCOMPLETE_TYPE, "satComplete");

    /**
     * The satRunning type
     */
    public static final int SATRUNNING_TYPE = 1;

    /**
     * The instance of the satRunning type
     */
    public static final TaskerTaskStatusType SATRUNNING = new TaskerTaskStatusType(SATRUNNING_TYPE, "satRunning");

    /**
     * The satPrepare type
     */
    public static final int SATPREPARE_TYPE = 2;

    /**
     * The instance of the satPrepare type
     */
    public static final TaskerTaskStatusType SATPREPARE = new TaskerTaskStatusType(SATPREPARE_TYPE, "satPrepare");

    /**
     * The satWaiting type
     */
    public static final int SATWAITING_TYPE = 3;

    /**
     * The instance of the satWaiting type
     */
    public static final TaskerTaskStatusType SATWAITING = new TaskerTaskStatusType(SATWAITING_TYPE, "satWaiting");

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

    private TaskerTaskStatusType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerTaskStatusType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of TaskerTaskStatusType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this TaskerTaskStatusType
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
        members.put("satComplete", SATCOMPLETE);
        members.put("satRunning", SATRUNNING);
        members.put("satPrepare", SATPREPARE);
        members.put("satWaiting", SATWAITING);
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
     * TaskerTaskStatusType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new TaskerTaskStatusType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.TaskerTaskStatusType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TaskerTaskStatusType";
            throw new IllegalArgumentException(err);
        }
        return (TaskerTaskStatusType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerTaskStatusType valueOf(java.lang.String) 

}
