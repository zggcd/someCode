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
 * Class IndicatorItemtypeType.
 * 
 * @version $Revision$ $Date$
 */
public class IndicatorItemtypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The itMeasure type
     */
    public static final int ITMEASURE_TYPE = 0;

    /**
     * The instance of the itMeasure type
     */
    public static final IndicatorItemtypeType ITMEASURE = new IndicatorItemtypeType(ITMEASURE_TYPE, "itMeasure");

    /**
     * The itCal type
     */
    public static final int ITCAL_TYPE = 1;

    /**
     * The instance of the itCal type
     */
    public static final IndicatorItemtypeType ITCAL = new IndicatorItemtypeType(ITCAL_TYPE, "itCal");

    /**
     * The itMeasureItem type
     */
    public static final int ITMEASUREITEM_TYPE = 2;

    /**
     * The instance of the itMeasureItem type
     */
    public static final IndicatorItemtypeType ITMEASUREITEM = new IndicatorItemtypeType(ITMEASUREITEM_TYPE, "itMeasureItem");

    /**
     * The itField type
     */
    public static final int ITFIELD_TYPE = 3;

    /**
     * The instance of the itField type
     */
    public static final IndicatorItemtypeType ITFIELD = new IndicatorItemtypeType(ITFIELD_TYPE, "itField");

    /**
     * The itParam type
     */
    public static final int ITPARAM_TYPE = 4;

    /**
     * The instance of the itParam type
     */
    public static final IndicatorItemtypeType ITPARAM = new IndicatorItemtypeType(ITPARAM_TYPE, "itParam");

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

    private IndicatorItemtypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.IndicatorItemtypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of IndicatorItemtypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this IndicatorItemtypeType
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
        members.put("itMeasure", ITMEASURE);
        members.put("itCal", ITCAL);
        members.put("itMeasureItem", ITMEASUREITEM);
        members.put("itField", ITFIELD);
        members.put("itParam", ITPARAM);
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
     * IndicatorItemtypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new IndicatorItemtypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.IndicatorItemtypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid IndicatorItemtypeType";
            throw new IllegalArgumentException(err);
        }
        return (IndicatorItemtypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.IndicatorItemtypeType valueOf(java.lang.String) 

}
