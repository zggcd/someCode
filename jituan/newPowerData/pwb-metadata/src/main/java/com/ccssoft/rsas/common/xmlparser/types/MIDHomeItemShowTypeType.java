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
 * Class MIDHomeItemShowTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class MIDHomeItemShowTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The gstData type
     */
    public static final int GSTDATA_TYPE = 0;

    /**
     * The instance of the gstData type
     */
    public static final MIDHomeItemShowTypeType GSTDATA = new MIDHomeItemShowTypeType(GSTDATA_TYPE, "gstData");

    /**
     * The gstChart type
     */
    public static final int GSTCHART_TYPE = 1;

    /**
     * The instance of the gstChart type
     */
    public static final MIDHomeItemShowTypeType GSTCHART = new MIDHomeItemShowTypeType(GSTCHART_TYPE, "gstChart");

    /**
     * The gstBoth type
     */
    public static final int GSTBOTH_TYPE = 2;

    /**
     * The instance of the gstBoth type
     */
    public static final MIDHomeItemShowTypeType GSTBOTH = new MIDHomeItemShowTypeType(GSTBOTH_TYPE, "gstBoth");

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

    private MIDHomeItemShowTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.MIDHomeItemShowTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of MIDHomeItemShowTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this MIDHomeItemShowTypeTyp
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
        members.put("gstData", GSTDATA);
        members.put("gstChart", GSTCHART);
        members.put("gstBoth", GSTBOTH);
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
     * MIDHomeItemShowTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new MIDHomeItemShowTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.MIDHomeItemShowTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MIDHomeItemShowTypeType";
            throw new IllegalArgumentException(err);
        }
        return (MIDHomeItemShowTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.MIDHomeItemShowTypeType valueOf(java.lang.String) 

}
