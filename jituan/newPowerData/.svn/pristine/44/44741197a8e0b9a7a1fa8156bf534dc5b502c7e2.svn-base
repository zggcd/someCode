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
 * Class IndicatorSourceObjectType.
 * 
 * @version $Revision$ $Date$
 */
public class IndicatorSourceObjectType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The soCub type
     */
    public static final int SOCUB_TYPE = 0;

    /**
     * The instance of the soCub type
     */
    public static final IndicatorSourceObjectType SOCUB = new IndicatorSourceObjectType(SOCUB_TYPE, "soCub");

    /**
     * The soReport type
     */
    public static final int SOREPORT_TYPE = 1;

    /**
     * The instance of the soReport type
     */
    public static final IndicatorSourceObjectType SOREPORT = new IndicatorSourceObjectType(SOREPORT_TYPE, "soReport");

    /**
     * The soProcedure type
     */
    public static final int SOPROCEDURE_TYPE = 2;

    /**
     * The instance of the soProcedure type
     */
    public static final IndicatorSourceObjectType SOPROCEDURE = new IndicatorSourceObjectType(SOPROCEDURE_TYPE, "soProcedure");

    /**
     * The soDetail type
     */
    public static final int SODETAIL_TYPE = 3;

    /**
     * The instance of the soDetail type
     */
    public static final IndicatorSourceObjectType SODETAIL = new IndicatorSourceObjectType(SODETAIL_TYPE, "soDetail");

    /**
     * The soCal type
     */
    public static final int SOCAL_TYPE = 4;

    /**
     * The instance of the soCal type
     */
    public static final IndicatorSourceObjectType SOCAL = new IndicatorSourceObjectType(SOCAL_TYPE, "soCal");

    /**
     * The soConst type
     */
    public static final int SOCONST_TYPE = 5;

    /**
     * The instance of the soConst type
     */
    public static final IndicatorSourceObjectType SOCONST = new IndicatorSourceObjectType(SOCONST_TYPE, "soConst");

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

    private IndicatorSourceObjectType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.IndicatorSourceObjectType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of IndicatorSourceObjectType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * IndicatorSourceObjectType
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
        members.put("soCub", SOCUB);
        members.put("soReport", SOREPORT);
        members.put("soProcedure", SOPROCEDURE);
        members.put("soDetail", SODETAIL);
        members.put("soCal", SOCAL);
        members.put("soConst", SOCONST);
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
     * IndicatorSourceObjectType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new IndicatorSourceObjectType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.IndicatorSourceObjectType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid IndicatorSourceObjectType";
            throw new IllegalArgumentException(err);
        }
        return (IndicatorSourceObjectType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.IndicatorSourceObjectType valueOf(java.lang.String) 

}
