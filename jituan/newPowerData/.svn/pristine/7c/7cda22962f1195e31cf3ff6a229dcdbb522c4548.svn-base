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
 * Class SeriesSeriesTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class SeriesSeriesTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The stLine type
     */
    public static final int STLINE_TYPE = 0;

    /**
     * The instance of the stLine type
     */
    public static final SeriesSeriesTypeType STLINE = new SeriesSeriesTypeType(STLINE_TYPE, "stLine");

    /**
     * The stArea type
     */
    public static final int STAREA_TYPE = 1;

    /**
     * The instance of the stArea type
     */
    public static final SeriesSeriesTypeType STAREA = new SeriesSeriesTypeType(STAREA_TYPE, "stArea");

    /**
     * The stColumn type
     */
    public static final int STCOLUMN_TYPE = 2;

    /**
     * The instance of the stColumn type
     */
    public static final SeriesSeriesTypeType STCOLUMN = new SeriesSeriesTypeType(STCOLUMN_TYPE, "stColumn");

    /**
     * The stScatter type
     */
    public static final int STSCATTER_TYPE = 3;

    /**
     * The instance of the stScatter type
     */
    public static final SeriesSeriesTypeType STSCATTER = new SeriesSeriesTypeType(STSCATTER_TYPE, "stScatter");

    /**
     * The stStack type
     */
    public static final int STSTACK_TYPE = 4;

    /**
     * The instance of the stStack type
     */
    public static final SeriesSeriesTypeType STSTACK = new SeriesSeriesTypeType(STSTACK_TYPE, "stStack");

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
    } //-- com.regaltec.rsas.common.xmlparser.types.SeriesSeriesTypeType(int, java.lang.String)


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
        members.put("stLine", STLINE);
        members.put("stArea", STAREA);
        members.put("stColumn", STCOLUMN);
        members.put("stScatter", STSCATTER);
        members.put("stStack", STSTACK);
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
    public static com.ccssoft.rsas.common.xmlparser.types.SeriesSeriesTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SeriesSeriesTypeType";
            throw new IllegalArgumentException(err);
        }
        return (SeriesSeriesTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.SeriesSeriesTypeType valueOf(java.lang.String) 

}
