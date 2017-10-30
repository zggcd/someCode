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
 * Class FunParameterFunParameterTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class FunParameterFunParameterTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The srCondition type
     */
    public static final int SRCONDITION_TYPE = 0;

    /**
     * The instance of the srCondition type
     */
    public static final FunParameterFunParameterTypeType SRCONDITION = new FunParameterFunParameterTypeType(SRCONDITION_TYPE, "srCondition");

    /**
     * The srColumn type
     */
    public static final int SRCOLUMN_TYPE = 1;

    /**
     * The instance of the srColumn type
     */
    public static final FunParameterFunParameterTypeType SRCOLUMN = new FunParameterFunParameterTypeType(SRCOLUMN_TYPE, "srColumn");

    /**
     * The srConst type
     */
    public static final int SRCONST_TYPE = 2;

    /**
     * The instance of the srConst type
     */
    public static final FunParameterFunParameterTypeType SRCONST = new FunParameterFunParameterTypeType(SRCONST_TYPE, "srConst");

    /**
     * The srCustomer type
     */
    public static final int SRCUSTOMER_TYPE = 3;

    /**
     * The instance of the srCustomer type
     */
    public static final FunParameterFunParameterTypeType SRCUSTOMER = new FunParameterFunParameterTypeType(SRCUSTOMER_TYPE, "srCustomer");

    /**
     * The srFunction type
     */
    public static final int SRFUNCTION_TYPE = 4;

    /**
     * The instance of the srFunction type
     */
    public static final FunParameterFunParameterTypeType SRFUNCTION = new FunParameterFunParameterTypeType(SRFUNCTION_TYPE, "srFunction");

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

    private FunParameterFunParameterTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.FunParameterFunParameterTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of FunParameterFunParameterTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * FunParameterFunParameterTypeType
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
        members.put("srCondition", SRCONDITION);
        members.put("srColumn", SRCOLUMN);
        members.put("srConst", SRCONST);
        members.put("srCustomer", SRCUSTOMER);
        members.put("srFunction", SRFUNCTION);
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
     * FunParameterFunParameterTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new FunParameterFunParameterTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.FunParameterFunParameterTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid FunParameterFunParameterTypeType";
            throw new IllegalArgumentException(err);
        }
        return (FunParameterFunParameterTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.FunParameterFunParameterTypeType valueOf(java.lang.String) 

}
