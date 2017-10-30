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
 * Class SeriesSeriesTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class SeriesSeriesTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The chtBar type
     */
    public static final int CHTBAR_TYPE = 0;

    /**
     * The instance of the chtBar type
     */
    public static final SeriesSeriesTypeType CHTBAR = new SeriesSeriesTypeType(CHTBAR_TYPE, "chtBar");

    /**
     * The chtLine type
     */
    public static final int CHTLINE_TYPE = 1;

    /**
     * The instance of the chtLine type
     */
    public static final SeriesSeriesTypeType CHTLINE = new SeriesSeriesTypeType(CHTLINE_TYPE, "chtLine");

    /**
     * The chtPie type
     */
    public static final int CHTPIE_TYPE = 2;

    /**
     * The instance of the chtPie type
     */
    public static final SeriesSeriesTypeType CHTPIE = new SeriesSeriesTypeType(CHTPIE_TYPE, "chtPie");

    /**
     * The chtArea type
     */
    public static final int CHTAREA_TYPE = 3;

    /**
     * The instance of the chtArea type
     */
    public static final SeriesSeriesTypeType CHTAREA = new SeriesSeriesTypeType(CHTAREA_TYPE, "chtArea");

    /**
     * The chtPoint type
     */
    public static final int CHTPOINT_TYPE = 4;

    /**
     * The instance of the chtPoint type
     */
    public static final SeriesSeriesTypeType CHTPOINT = new SeriesSeriesTypeType(CHTPOINT_TYPE, "chtPoint");

    /**
     * The chtFastLine type
     */
    public static final int CHTFASTLINE_TYPE = 5;

    /**
     * The instance of the chtFastLine type
     */
    public static final SeriesSeriesTypeType CHTFASTLINE = new SeriesSeriesTypeType(CHTFASTLINE_TYPE, "chtFastLine");

    /**
     * The chtHorizontalBar type
     */
    public static final int CHTHORIZONTALBAR_TYPE = 6;

    /**
     * The instance of the chtHorizontalBar type
     */
    public static final SeriesSeriesTypeType CHTHORIZONTALBAR = new SeriesSeriesTypeType(CHTHORIZONTALBAR_TYPE, "chtHorizontalBar");

    /**
     * The chtDonut type
     */
    public static final int CHTDONUT_TYPE = 7;

    /**
     * The instance of the chtDonut type
     */
    public static final SeriesSeriesTypeType CHTDONUT = new SeriesSeriesTypeType(CHTDONUT_TYPE, "chtDonut");

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

    private SeriesSeriesTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.SeriesSeriesTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of SeriesSeriesTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this SeriesSeriesTypeType
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
        members.put("chtBar", CHTBAR);
        members.put("chtLine", CHTLINE);
        members.put("chtPie", CHTPIE);
        members.put("chtArea", CHTAREA);
        members.put("chtPoint", CHTPOINT);
        members.put("chtFastLine", CHTFASTLINE);
        members.put("chtHorizontalBar", CHTHORIZONTALBAR);
        members.put("chtDonut", CHTDONUT);
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
     * SeriesSeriesTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new SeriesSeriesTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.SeriesSeriesTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SeriesSeriesTypeType";
            throw new IllegalArgumentException(err);
        }
        return (SeriesSeriesTypeType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.SeriesSeriesTypeType valueOf(java.lang.String) 

}
