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
 * Class CheckFieldDataTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class CheckFieldDataTypeType implements java.io.Serializable {


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
    public static final CheckFieldDataTypeType DTCHAR = new CheckFieldDataTypeType(DTCHAR_TYPE, "dtChar");

    /**
     * The dtNum type
     */
    public static final int DTNUM_TYPE = 1;

    /**
     * The instance of the dtNum type
     */
    public static final CheckFieldDataTypeType DTNUM = new CheckFieldDataTypeType(DTNUM_TYPE, "dtNum");

    /**
     * The dtDate type
     */
    public static final int DTDATE_TYPE = 2;

    /**
     * The instance of the dtDate type
     */
    public static final CheckFieldDataTypeType DTDATE = new CheckFieldDataTypeType(DTDATE_TYPE, "dtDate");

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

    private CheckFieldDataTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.CheckFieldDataTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of CheckFieldDataTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this CheckFieldDataTypeType
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
     * CheckFieldDataTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new CheckFieldDataTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.CheckFieldDataTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid CheckFieldDataTypeType";
            throw new IllegalArgumentException(err);
        }
        return (CheckFieldDataTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.CheckFieldDataTypeType valueOf(java.lang.String) 

}
