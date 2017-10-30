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
 * Class SQLFunctionFuncTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class SQLFunctionFuncTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The funcSYS type
     */
    public static final int FUNCSYS_TYPE = 0;

    /**
     * The instance of the funcSYS type
     */
    public static final SQLFunctionFuncTypeType FUNCSYS = new SQLFunctionFuncTypeType(FUNCSYS_TYPE, "funcSYS");

    /**
     * The funcUSER type
     */
    public static final int FUNCUSER_TYPE = 1;

    /**
     * The instance of the funcUSER type
     */
    public static final SQLFunctionFuncTypeType FUNCUSER = new SQLFunctionFuncTypeType(FUNCUSER_TYPE, "funcUSER");

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

    private SQLFunctionFuncTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.SQLFunctionFuncTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of SQLFunctionFuncTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this SQLFunctionFuncTypeTyp
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
        members.put("funcSYS", FUNCSYS);
        members.put("funcUSER", FUNCUSER);
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
     * SQLFunctionFuncTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new SQLFunctionFuncTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.SQLFunctionFuncTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SQLFunctionFuncTypeType";
            throw new IllegalArgumentException(err);
        }
        return (SQLFunctionFuncTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.SQLFunctionFuncTypeType valueOf(java.lang.String) 

}
