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
 * Class TaskerGroupTaskerGroupTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class TaskerGroupTaskerGroupTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The tgtSys type
     */
    public static final int TGTSYS_TYPE = 0;

    /**
     * The instance of the tgtSys type
     */
    public static final TaskerGroupTaskerGroupTypeType TGTSYS = new TaskerGroupTaskerGroupTypeType(TGTSYS_TYPE, "tgtSys");

    /**
     * The tgtUser type
     */
    public static final int TGTUSER_TYPE = 1;

    /**
     * The instance of the tgtUser type
     */
    public static final TaskerGroupTaskerGroupTypeType TGTUSER = new TaskerGroupTaskerGroupTypeType(TGTUSER_TYPE, "tgtUser");

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

    private TaskerGroupTaskerGroupTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerGroupTaskerGroupTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of TaskerGroupTaskerGroupTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * TaskerGroupTaskerGroupTypeType
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
        members.put("tgtSys", TGTSYS);
        members.put("tgtUser", TGTUSER);
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
     * TaskerGroupTaskerGroupTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new TaskerGroupTaskerGroupTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.TaskerGroupTaskerGroupTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TaskerGroupTaskerGroupTypeType";
            throw new IllegalArgumentException(err);
        }
        return (TaskerGroupTaskerGroupTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerGroupTaskerGroupTypeType valueOf(java.lang.String) 

}
