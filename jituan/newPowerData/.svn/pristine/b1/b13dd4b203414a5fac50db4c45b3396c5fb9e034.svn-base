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
 * Class CommandOptionOptionTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class CommandOptionOptionTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The opSet type
     */
    public static final int OPSET_TYPE = 0;

    /**
     * The instance of the opSet type
     */
    public static final CommandOptionOptionTypeType OPSET = new CommandOptionOptionTypeType(OPSET_TYPE, "opSet");

    /**
     * The opCondition type
     */
    public static final int OPCONDITION_TYPE = 1;

    /**
     * The instance of the opCondition type
     */
    public static final CommandOptionOptionTypeType OPCONDITION = new CommandOptionOptionTypeType(OPCONDITION_TYPE, "opCondition");

    /**
     * The opNormal type
     */
    public static final int OPNORMAL_TYPE = 2;

    /**
     * The instance of the opNormal type
     */
    public static final CommandOptionOptionTypeType OPNORMAL = new CommandOptionOptionTypeType(OPNORMAL_TYPE, "opNormal");

    /**
     * The opDim type
     */
    public static final int OPDIM_TYPE = 3;

    /**
     * The instance of the opDim type
     */
    public static final CommandOptionOptionTypeType OPDIM = new CommandOptionOptionTypeType(OPDIM_TYPE, "opDim");

    /**
     * The opProcedure type
     */
    public static final int OPPROCEDURE_TYPE = 4;

    /**
     * The instance of the opProcedure type
     */
    public static final CommandOptionOptionTypeType OPPROCEDURE = new CommandOptionOptionTypeType(OPPROCEDURE_TYPE, "opProcedure");

    /**
     * The opLoad type
     */
    public static final int OPLOAD_TYPE = 5;

    /**
     * The instance of the opLoad type
     */
    public static final CommandOptionOptionTypeType OPLOAD = new CommandOptionOptionTypeType(OPLOAD_TYPE, "opLoad");

    /**
     * The opDrill type
     */
    public static final int OPDRILL_TYPE = 6;

    /**
     * The instance of the opDrill type
     */
    public static final CommandOptionOptionTypeType OPDRILL = new CommandOptionOptionTypeType(OPDRILL_TYPE, "opDrill");

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

    private CommandOptionOptionTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.CommandOptionOptionTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of CommandOptionOptionTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * CommandOptionOptionTypeType
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
        members.put("opSet", OPSET);
        members.put("opCondition", OPCONDITION);
        members.put("opNormal", OPNORMAL);
        members.put("opDim", OPDIM);
        members.put("opProcedure", OPPROCEDURE);
        members.put("opLoad", OPLOAD);
        members.put("opDrill", OPDRILL);
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
     * CommandOptionOptionTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new CommandOptionOptionTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.CommandOptionOptionTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid CommandOptionOptionTypeType";
            throw new IllegalArgumentException(err);
        }
        return (CommandOptionOptionTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.CommandOptionOptionTypeType valueOf(java.lang.String) 

}
