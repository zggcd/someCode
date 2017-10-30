/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.config.configparser.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class CommandMapServerTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class CommandMapServerTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The META type
     */
    public static final int META_TYPE = 0;

    /**
     * The instance of the META type
     */
    public static final CommandMapServerTypeType META = new CommandMapServerTypeType(META_TYPE, "META");

    /**
     * The APP type
     */
    public static final int APP_TYPE = 1;

    /**
     * The instance of the APP type
     */
    public static final CommandMapServerTypeType APP = new CommandMapServerTypeType(APP_TYPE, "APP");

    /**
     * The AGENT type
     */
    public static final int AGENT_TYPE = 2;

    /**
     * The instance of the AGENT type
     */
    public static final CommandMapServerTypeType AGENT = new CommandMapServerTypeType(AGENT_TYPE, "AGENT");

    /**
     * The DATAREPORT type
     */
    public static final int DATAREPORT_TYPE = 3;

    /**
     * The instance of the DATAREPORT type
     */
    public static final CommandMapServerTypeType DATAREPORT = new CommandMapServerTypeType(DATAREPORT_TYPE, "DATAREPORT");

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

    private CommandMapServerTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.config.configparser.types.CommandMapServerTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of CommandMapServerTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * CommandMapServerTypeType
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
        members.put("META", META);
        members.put("APP", APP);
        members.put("AGENT", AGENT);
        members.put("DATAREPORT", DATAREPORT);
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
     * CommandMapServerTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new CommandMapServerTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.config.configparser.types.CommandMapServerTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid CommandMapServerTypeType";
            throw new IllegalArgumentException(err);
        }
        return (CommandMapServerTypeType) obj;
    } //-- com.regaltec.rsas.common.config.configparser.types.CommandMapServerTypeType valueOf(java.lang.String) 

}
