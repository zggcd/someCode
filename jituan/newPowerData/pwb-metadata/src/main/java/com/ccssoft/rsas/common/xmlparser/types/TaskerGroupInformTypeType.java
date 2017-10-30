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
 * Class TaskerGroupInformTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class TaskerGroupInformTypeType implements java.io.Serializable {


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
    public static final TaskerGroupInformTypeType IFTNONE = new TaskerGroupInformTypeType(IFTNONE_TYPE, "iftNone");

    /**
     * The iftMessage type
     */
    public static final int IFTMESSAGE_TYPE = 1;

    /**
     * The instance of the iftMessage type
     */
    public static final TaskerGroupInformTypeType IFTMESSAGE = new TaskerGroupInformTypeType(IFTMESSAGE_TYPE, "iftMessage");

    /**
     * The iftEmail type
     */
    public static final int IFTEMAIL_TYPE = 2;

    /**
     * The instance of the iftEmail type
     */
    public static final TaskerGroupInformTypeType IFTEMAIL = new TaskerGroupInformTypeType(IFTEMAIL_TYPE, "iftEmail");

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

    private TaskerGroupInformTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerGroupInformTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of TaskerGroupInformTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * TaskerGroupInformTypeType
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
     * TaskerGroupInformTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new TaskerGroupInformTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.TaskerGroupInformTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TaskerGroupInformTypeType";
            throw new IllegalArgumentException(err);
        }
        return (TaskerGroupInformTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerGroupInformTypeType valueOf(java.lang.String) 

}
