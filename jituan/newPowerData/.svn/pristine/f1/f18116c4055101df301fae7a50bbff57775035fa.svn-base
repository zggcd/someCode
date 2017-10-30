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
 * Class BarSeriesMultipleBarType.
 * 
 * @version $Revision$ $Date$
 */
public class BarSeriesMultipleBarType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The mbNone type
     */
    public static final int MBNONE_TYPE = 0;

    /**
     * The instance of the mbNone type
     */
    public static final BarSeriesMultipleBarType MBNONE = new BarSeriesMultipleBarType(MBNONE_TYPE, "mbNone");

    /**
     * The mbSide type
     */
    public static final int MBSIDE_TYPE = 1;

    /**
     * The instance of the mbSide type
     */
    public static final BarSeriesMultipleBarType MBSIDE = new BarSeriesMultipleBarType(MBSIDE_TYPE, "mbSide");

    /**
     * The mbStacked type
     */
    public static final int MBSTACKED_TYPE = 2;

    /**
     * The instance of the mbStacked type
     */
    public static final BarSeriesMultipleBarType MBSTACKED = new BarSeriesMultipleBarType(MBSTACKED_TYPE, "mbStacked");

    /**
     * The mbStacked100 type
     */
    public static final int MBSTACKED100_TYPE = 3;

    /**
     * The instance of the mbStacked100 type
     */
    public static final BarSeriesMultipleBarType MBSTACKED100 = new BarSeriesMultipleBarType(MBSTACKED100_TYPE, "mbStacked100");

    /**
     * The mbSideAll type
     */
    public static final int MBSIDEALL_TYPE = 4;

    /**
     * The instance of the mbSideAll type
     */
    public static final BarSeriesMultipleBarType MBSIDEALL = new BarSeriesMultipleBarType(MBSIDEALL_TYPE, "mbSideAll");

    /**
     * The mbSelfStack type
     */
    public static final int MBSELFSTACK_TYPE = 5;

    /**
     * The instance of the mbSelfStack type
     */
    public static final BarSeriesMultipleBarType MBSELFSTACK = new BarSeriesMultipleBarType(MBSELFSTACK_TYPE, "mbSelfStack");

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

    private BarSeriesMultipleBarType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.BarSeriesMultipleBarType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of BarSeriesMultipleBarType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * BarSeriesMultipleBarType
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
        members.put("mbNone", MBNONE);
        members.put("mbSide", MBSIDE);
        members.put("mbStacked", MBSTACKED);
        members.put("mbStacked100", MBSTACKED100);
        members.put("mbSideAll", MBSIDEALL);
        members.put("mbSelfStack", MBSELFSTACK);
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
     * BarSeriesMultipleBarType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new BarSeriesMultipleBarType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.BarSeriesMultipleBarType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid BarSeriesMultipleBarType";
            throw new IllegalArgumentException(err);
        }
        return (BarSeriesMultipleBarType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.BarSeriesMultipleBarType valueOf(java.lang.String) 

}
