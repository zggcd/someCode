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
 * Class IndicatorIndicatorTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class IndicatorIndicatorTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The idNormal type
     */
    public static final int IDNORMAL_TYPE = 0;

    /**
     * The instance of the idNormal type
     */
    public static final IndicatorIndicatorTypeType IDNORMAL = new IndicatorIndicatorTypeType(IDNORMAL_TYPE, "idNormal");

    /**
     * The idDetail type
     */
    public static final int IDDETAIL_TYPE = 1;

    /**
     * The instance of the idDetail type
     */
    public static final IndicatorIndicatorTypeType IDDETAIL = new IndicatorIndicatorTypeType(IDDETAIL_TYPE, "idDetail");

    /**
     * The idMonitor type
     */
    public static final int IDMONITOR_TYPE = 2;

    /**
     * The instance of the idMonitor type
     */
    public static final IndicatorIndicatorTypeType IDMONITOR = new IndicatorIndicatorTypeType(IDMONITOR_TYPE, "idMonitor");

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

    private IndicatorIndicatorTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.IndicatorIndicatorTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of IndicatorIndicatorTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * IndicatorIndicatorTypeType
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
        members.put("idNormal", IDNORMAL);
        members.put("idDetail", IDDETAIL);
        members.put("idMonitor", IDMONITOR);
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
     * IndicatorIndicatorTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new IndicatorIndicatorTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.IndicatorIndicatorTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid IndicatorIndicatorTypeType";
            throw new IllegalArgumentException(err);
        }
        return (IndicatorIndicatorTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.IndicatorIndicatorTypeType valueOf(java.lang.String) 

}
