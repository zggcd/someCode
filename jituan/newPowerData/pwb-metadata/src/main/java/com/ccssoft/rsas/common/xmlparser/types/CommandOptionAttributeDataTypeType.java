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
 * Class CommandOptionAttributeDataTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class CommandOptionAttributeDataTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The dtChar type
     */
    public static final int DTCHAR_TYPE = 0;

    /**
     * The instance of the dtChar type
     */
    public static final CommandOptionAttributeDataTypeType DTCHAR = new CommandOptionAttributeDataTypeType(DTCHAR_TYPE, "dtChar");

    /**
     * The dtNum type
     */
    public static final int DTNUM_TYPE = 1;

    /**
     * The instance of the dtNum type
     */
    public static final CommandOptionAttributeDataTypeType DTNUM = new CommandOptionAttributeDataTypeType(DTNUM_TYPE, "dtNum");

    /**
     * The dtDate type
     */
    public static final int DTDATE_TYPE = 2;

    /**
     * The instance of the dtDate type
     */
    public static final CommandOptionAttributeDataTypeType DTDATE = new CommandOptionAttributeDataTypeType(DTDATE_TYPE, "dtDate");

    /**
     * The dtDateTime type
     */
    public static final int DTDATETIME_TYPE = 3;

    /**
     * The instance of the dtDateTime type
     */
    public static final CommandOptionAttributeDataTypeType DTDATETIME = new CommandOptionAttributeDataTypeType(DTDATETIME_TYPE, "dtDateTime");

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

    private CommandOptionAttributeDataTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.CommandOptionAttributeDataTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of CommandOptionAttributeDataTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * CommandOptionAttributeDataTypeType
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
        members.put("dtChar", DTCHAR);
        members.put("dtNum", DTNUM);
        members.put("dtDate", DTDATE);
        members.put("dtDateTime", DTDATETIME);
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
     * CommandOptionAttributeDataTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new
     * CommandOptionAttributeDataTypeType based on the given String
     * value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.CommandOptionAttributeDataTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid CommandOptionAttributeDataTypeType";
            throw new IllegalArgumentException(err);
        }
        return (CommandOptionAttributeDataTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.CommandOptionAttributeDataTypeType valueOf(java.lang.String) 

}
