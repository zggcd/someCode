/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.saschart.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class BarSeriesStyleType.
 * 
 * @version $Revision$ $Date$
 */
public class BarSeriesStyleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The brdSolid type
     */
    public static final int BRDSOLID_TYPE = 0;

    /**
     * The instance of the brdSolid type
     */
    public static final BarSeriesStyleType BRDSOLID = new BarSeriesStyleType(BRDSOLID_TYPE, "brdSolid");

    /**
     * The brdDash type
     */
    public static final int BRDDASH_TYPE = 1;

    /**
     * The instance of the brdDash type
     */
    public static final BarSeriesStyleType BRDDASH = new BarSeriesStyleType(BRDDASH_TYPE, "brdDash");

    /**
     * The brdDot type
     */
    public static final int BRDDOT_TYPE = 2;

    /**
     * The instance of the brdDot type
     */
    public static final BarSeriesStyleType BRDDOT = new BarSeriesStyleType(BRDDOT_TYPE, "brdDot");

    /**
     * The brdDashDot type
     */
    public static final int BRDDASHDOT_TYPE = 3;

    /**
     * The instance of the brdDashDot type
     */
    public static final BarSeriesStyleType BRDDASHDOT = new BarSeriesStyleType(BRDDASHDOT_TYPE, "brdDashDot");

    /**
     * The brdDashDotDot type
     */
    public static final int BRDDASHDOTDOT_TYPE = 4;

    /**
     * The instance of the brdDashDotDot type
     */
    public static final BarSeriesStyleType BRDDASHDOTDOT = new BarSeriesStyleType(BRDDASHDOTDOT_TYPE, "brdDashDotDot");

    /**
     * The brdSmallDots type
     */
    public static final int BRDSMALLDOTS_TYPE = 5;

    /**
     * The instance of the brdSmallDots type
     */
    public static final BarSeriesStyleType BRDSMALLDOTS = new BarSeriesStyleType(BRDSMALLDOTS_TYPE, "brdSmallDots");

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

    private BarSeriesStyleType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.BarSeriesStyleType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of BarSeriesStyleType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this BarSeriesStyleType
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
        members.put("brdSolid", BRDSOLID);
        members.put("brdDash", BRDDASH);
        members.put("brdDot", BRDDOT);
        members.put("brdDashDot", BRDDASHDOT);
        members.put("brdDashDotDot", BRDDASHDOTDOT);
        members.put("brdSmallDots", BRDSMALLDOTS);
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
     * BarSeriesStyleType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new BarSeriesStyleType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.BarSeriesStyleType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid BarSeriesStyleType";
            throw new IllegalArgumentException(err);
        }
        return (BarSeriesStyleType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.BarSeriesStyleType valueOf(java.lang.String) 

}
