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
 * Class SQLFunctionFuncCategoryType.
 * 
 * @version $Revision$ $Date$
 */
public class SQLFunctionFuncCategoryType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The funcChar type
     */
    public static final int FUNCCHAR_TYPE = 0;

    /**
     * The instance of the funcChar type
     */
    public static final SQLFunctionFuncCategoryType FUNCCHAR = new SQLFunctionFuncCategoryType(FUNCCHAR_TYPE, "funcChar");

    /**
     * The funcMath type
     */
    public static final int FUNCMATH_TYPE = 1;

    /**
     * The instance of the funcMath type
     */
    public static final SQLFunctionFuncCategoryType FUNCMATH = new SQLFunctionFuncCategoryType(FUNCMATH_TYPE, "funcMath");

    /**
     * The funcSum type
     */
    public static final int FUNCSUM_TYPE = 2;

    /**
     * The instance of the funcSum type
     */
    public static final SQLFunctionFuncCategoryType FUNCSUM = new SQLFunctionFuncCategoryType(FUNCSUM_TYPE, "funcSum");

    /**
     * The funcDate type
     */
    public static final int FUNCDATE_TYPE = 3;

    /**
     * The instance of the funcDate type
     */
    public static final SQLFunctionFuncCategoryType FUNCDATE = new SQLFunctionFuncCategoryType(FUNCDATE_TYPE, "funcDate");

    /**
     * The funcTran type
     */
    public static final int FUNCTRAN_TYPE = 4;

    /**
     * The instance of the funcTran type
     */
    public static final SQLFunctionFuncCategoryType FUNCTRAN = new SQLFunctionFuncCategoryType(FUNCTRAN_TYPE, "funcTran");

    /**
     * The funcAnaly type
     */
    public static final int FUNCANALY_TYPE = 5;

    /**
     * The instance of the funcAnaly type
     */
    public static final SQLFunctionFuncCategoryType FUNCANALY = new SQLFunctionFuncCategoryType(FUNCANALY_TYPE, "funcAnaly");

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

    private SQLFunctionFuncCategoryType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.SQLFunctionFuncCategoryType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of SQLFunctionFuncCategoryType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * SQLFunctionFuncCategoryType
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
        members.put("funcChar", FUNCCHAR);
        members.put("funcMath", FUNCMATH);
        members.put("funcSum", FUNCSUM);
        members.put("funcDate", FUNCDATE);
        members.put("funcTran", FUNCTRAN);
        members.put("funcAnaly", FUNCANALY);
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
     * SQLFunctionFuncCategoryType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new SQLFunctionFuncCategoryType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.SQLFunctionFuncCategoryType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SQLFunctionFuncCategoryType";
            throw new IllegalArgumentException(err);
        }
        return (SQLFunctionFuncCategoryType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.SQLFunctionFuncCategoryType valueOf(java.lang.String) 

}
