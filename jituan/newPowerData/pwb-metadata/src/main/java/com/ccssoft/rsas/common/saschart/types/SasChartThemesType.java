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
 * Class SasChartThemesType.
 * 
 * @version $Revision$ $Date$
 */
public class SasChartThemesType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The thmTeeDefault type
     */
    public static final int THMTEEDEFAULT_TYPE = 0;

    /**
     * The instance of the thmTeeDefault type
     */
    public static final SasChartThemesType THMTEEDEFAULT = new SasChartThemesType(THMTEEDEFAULT_TYPE, "thmTeeDefault");

    /**
     * The thmExcel type
     */
    public static final int THMEXCEL_TYPE = 1;

    /**
     * The instance of the thmExcel type
     */
    public static final SasChartThemesType THMEXCEL = new SasChartThemesType(THMEXCEL_TYPE, "thmExcel");

    /**
     * The thmClassic type
     */
    public static final int THMCLASSIC_TYPE = 2;

    /**
     * The instance of the thmClassic type
     */
    public static final SasChartThemesType THMCLASSIC = new SasChartThemesType(THMCLASSIC_TYPE, "thmClassic");

    /**
     * The thmBusiness type
     */
    public static final int THMBUSINESS_TYPE = 3;

    /**
     * The instance of the thmBusiness type
     */
    public static final SasChartThemesType THMBUSINESS = new SasChartThemesType(THMBUSINESS_TYPE, "thmBusiness");

    /**
     * The thmWeb type
     */
    public static final int THMWEB_TYPE = 4;

    /**
     * The instance of the thmWeb type
     */
    public static final SasChartThemesType THMWEB = new SasChartThemesType(THMWEB_TYPE, "thmWeb");

    /**
     * The thmWinXP type
     */
    public static final int THMWINXP_TYPE = 5;

    /**
     * The instance of the thmWinXP type
     */
    public static final SasChartThemesType THMWINXP = new SasChartThemesType(THMWINXP_TYPE, "thmWinXP");

    /**
     * The thmBlues type
     */
    public static final int THMBLUES_TYPE = 6;

    /**
     * The instance of the thmBlues type
     */
    public static final SasChartThemesType THMBLUES = new SasChartThemesType(THMBLUES_TYPE, "thmBlues");

    /**
     * The thmFacts type
     */
    public static final int THMFACTS_TYPE = 7;

    /**
     * The instance of the thmFacts type
     */
    public static final SasChartThemesType THMFACTS = new SasChartThemesType(THMFACTS_TYPE, "thmFacts");

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

    private SasChartThemesType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.SasChartThemesType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of SasChartThemesType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this SasChartThemesType
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
        members.put("thmTeeDefault", THMTEEDEFAULT);
        members.put("thmExcel", THMEXCEL);
        members.put("thmClassic", THMCLASSIC);
        members.put("thmBusiness", THMBUSINESS);
        members.put("thmWeb", THMWEB);
        members.put("thmWinXP", THMWINXP);
        members.put("thmBlues", THMBLUES);
        members.put("thmFacts", THMFACTS);
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
     * SasChartThemesType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new SasChartThemesType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.SasChartThemesType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SasChartThemesType";
            throw new IllegalArgumentException(err);
        }
        return (SasChartThemesType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.SasChartThemesType valueOf(java.lang.String) 

}
