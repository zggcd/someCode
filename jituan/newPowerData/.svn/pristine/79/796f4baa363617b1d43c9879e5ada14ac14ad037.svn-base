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
 * Class TaskerGroupPriorityType.
 * 
 * @version $Revision$ $Date$
 */
public class TaskerGroupPriorityType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The priNor type
     */
    public static final int PRINOR_TYPE = 0;

    /**
     * The instance of the priNor type
     */
    public static final TaskerGroupPriorityType PRINOR = new TaskerGroupPriorityType(PRINOR_TYPE, "priNor");

    /**
     * The priAdv type
     */
    public static final int PRIADV_TYPE = 1;

    /**
     * The instance of the priAdv type
     */
    public static final TaskerGroupPriorityType PRIADV = new TaskerGroupPriorityType(PRIADV_TYPE, "priAdv");

    /**
     * The priLow type
     */
    public static final int PRILOW_TYPE = 2;

    /**
     * The instance of the priLow type
     */
    public static final TaskerGroupPriorityType PRILOW = new TaskerGroupPriorityType(PRILOW_TYPE, "priLow");

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

    private TaskerGroupPriorityType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerGroupPriorityType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of TaskerGroupPriorityType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this TaskerGroupPriorityTyp
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
        members.put("priNor", PRINOR);
        members.put("priAdv", PRIADV);
        members.put("priLow", PRILOW);
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
     * TaskerGroupPriorityType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new TaskerGroupPriorityType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.TaskerGroupPriorityType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TaskerGroupPriorityType";
            throw new IllegalArgumentException(err);
        }
        return (TaskerGroupPriorityType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.TaskerGroupPriorityType valueOf(java.lang.String) 

}
