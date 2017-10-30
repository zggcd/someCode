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
 * Class AreaSeriesMultipleAreaType.
 * 
 * @version $Revision$ $Date$
 */
public class AreaSeriesMultipleAreaType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The areaNone type
     */
    public static final int AREANONE_TYPE = 0;

    /**
     * The instance of the areaNone type
     */
    public static final AreaSeriesMultipleAreaType AREANONE = new AreaSeriesMultipleAreaType(AREANONE_TYPE, "areaNone");

    /**
     * The areaStacked type
     */
    public static final int AREASTACKED_TYPE = 1;

    /**
     * The instance of the areaStacked type
     */
    public static final AreaSeriesMultipleAreaType AREASTACKED = new AreaSeriesMultipleAreaType(AREASTACKED_TYPE, "areaStacked");

    /**
     * The areaStacked100 type
     */
    public static final int AREASTACKED100_TYPE = 2;

    /**
     * The instance of the areaStacked100 type
     */
    public static final AreaSeriesMultipleAreaType AREASTACKED100 = new AreaSeriesMultipleAreaType(AREASTACKED100_TYPE, "areaStacked100");

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

    private AreaSeriesMultipleAreaType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.AreaSeriesMultipleAreaType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of AreaSeriesMultipleAreaType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * AreaSeriesMultipleAreaType
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
        members.put("areaNone", AREANONE);
        members.put("areaStacked", AREASTACKED);
        members.put("areaStacked100", AREASTACKED100);
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
     * AreaSeriesMultipleAreaType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new AreaSeriesMultipleAreaType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.AreaSeriesMultipleAreaType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid AreaSeriesMultipleAreaType";
            throw new IllegalArgumentException(err);
        }
        return (AreaSeriesMultipleAreaType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.AreaSeriesMultipleAreaType valueOf(java.lang.String) 

}
