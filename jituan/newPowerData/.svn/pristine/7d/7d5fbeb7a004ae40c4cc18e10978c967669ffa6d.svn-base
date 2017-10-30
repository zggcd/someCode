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
 * Class ParametersParameterTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ParametersParameterTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ptCondition type
     */
    public static final int PTCONDITION_TYPE = 0;

    /**
     * The instance of the ptCondition type
     */
    public static final ParametersParameterTypeType PTCONDITION = new ParametersParameterTypeType(PTCONDITION_TYPE, "ptCondition");

    /**
     * The ptColumn type
     */
    public static final int PTCOLUMN_TYPE = 1;

    /**
     * The instance of the ptColumn type
     */
    public static final ParametersParameterTypeType PTCOLUMN = new ParametersParameterTypeType(PTCOLUMN_TYPE, "ptColumn");

    /**
     * The ptConst type
     */
    public static final int PTCONST_TYPE = 2;

    /**
     * The instance of the ptConst type
     */
    public static final ParametersParameterTypeType PTCONST = new ParametersParameterTypeType(PTCONST_TYPE, "ptConst");

    /**
     * The ptCustomer type
     */
    public static final int PTCUSTOMER_TYPE = 3;

    /**
     * The instance of the ptCustomer type
     */
    public static final ParametersParameterTypeType PTCUSTOMER = new ParametersParameterTypeType(PTCUSTOMER_TYPE, "ptCustomer");

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

    private ParametersParameterTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ParametersParameterTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ParametersParameterTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ParametersParameterTypeType
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
        members.put("ptCondition", PTCONDITION);
        members.put("ptColumn", PTCOLUMN);
        members.put("ptConst", PTCONST);
        members.put("ptCustomer", PTCUSTOMER);
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
     * ParametersParameterTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ParametersParameterTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ParametersParameterTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ParametersParameterTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ParametersParameterTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ParametersParameterTypeType valueOf(java.lang.String) 

}
