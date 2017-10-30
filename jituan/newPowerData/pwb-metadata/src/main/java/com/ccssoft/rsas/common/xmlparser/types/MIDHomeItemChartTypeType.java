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
 * Class MIDHomeItemChartTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class MIDHomeItemChartTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ctPie type
     */
    public static final int CTPIE_TYPE = 0;

    /**
     * The instance of the ctPie type
     */
    public static final MIDHomeItemChartTypeType CTPIE = new MIDHomeItemChartTypeType(CTPIE_TYPE, "ctPie");

    /**
     * The ctLine type
     */
    public static final int CTLINE_TYPE = 1;

    /**
     * The instance of the ctLine type
     */
    public static final MIDHomeItemChartTypeType CTLINE = new MIDHomeItemChartTypeType(CTLINE_TYPE, "ctLine");

    /**
     * The ctArea type
     */
    public static final int CTAREA_TYPE = 2;

    /**
     * The instance of the ctArea type
     */
    public static final MIDHomeItemChartTypeType CTAREA = new MIDHomeItemChartTypeType(CTAREA_TYPE, "ctArea");

    /**
     * The ctColumn type
     */
    public static final int CTCOLUMN_TYPE = 3;

    /**
     * The instance of the ctColumn type
     */
    public static final MIDHomeItemChartTypeType CTCOLUMN = new MIDHomeItemChartTypeType(CTCOLUMN_TYPE, "ctColumn");

    /**
     * The ctBar type
     */
    public static final int CTBAR_TYPE = 4;

    /**
     * The instance of the ctBar type
     */
    public static final MIDHomeItemChartTypeType CTBAR = new MIDHomeItemChartTypeType(CTBAR_TYPE, "ctBar");

    /**
     * The ctStack type
     */
    public static final int CTSTACK_TYPE = 5;

    /**
     * The instance of the ctStack type
     */
    public static final MIDHomeItemChartTypeType CTSTACK = new MIDHomeItemChartTypeType(CTSTACK_TYPE, "ctStack");

    /**
     * The ctScatter type
     */
    public static final int CTSCATTER_TYPE = 6;

    /**
     * The instance of the ctScatter type
     */
    public static final MIDHomeItemChartTypeType CTSCATTER = new MIDHomeItemChartTypeType(CTSCATTER_TYPE, "ctScatter");

    /**
     * The ctCombi type
     */
    public static final int CTCOMBI_TYPE = 7;

    /**
     * The instance of the ctCombi type
     */
    public static final MIDHomeItemChartTypeType CTCOMBI = new MIDHomeItemChartTypeType(CTCOMBI_TYPE, "ctCombi");

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

    private MIDHomeItemChartTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.MIDHomeItemChartTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of MIDHomeItemChartTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * MIDHomeItemChartTypeType
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
        members.put("ctPie", CTPIE);
        members.put("ctLine", CTLINE);
        members.put("ctArea", CTAREA);
        members.put("ctColumn", CTCOLUMN);
        members.put("ctBar", CTBAR);
        members.put("ctStack", CTSTACK);
        members.put("ctScatter", CTSCATTER);
        members.put("ctCombi", CTCOMBI);
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
     * MIDHomeItemChartTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new MIDHomeItemChartTypeType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.MIDHomeItemChartTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MIDHomeItemChartTypeType";
            throw new IllegalArgumentException(err);
        }
        return (MIDHomeItemChartTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.MIDHomeItemChartTypeType valueOf(java.lang.String) 

}
