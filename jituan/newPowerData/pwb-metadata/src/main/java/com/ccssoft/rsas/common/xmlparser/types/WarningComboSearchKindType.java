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
 * Class WarningComboSearchKindType.
 * 
 * @version $Revision$ $Date$
 */
public class WarningComboSearchKindType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The schE type
     */
    public static final int SCHE_TYPE = 0;

    /**
     * The instance of the schE type
     */
    public static final WarningComboSearchKindType SCHE = new WarningComboSearchKindType(SCHE_TYPE, "schE");

    /**
     * The schB type
     */
    public static final int SCHB_TYPE = 1;

    /**
     * The instance of the schB type
     */
    public static final WarningComboSearchKindType SCHB = new WarningComboSearchKindType(SCHB_TYPE, "schB");

    /**
     * The schLB type
     */
    public static final int SCHLB_TYPE = 2;

    /**
     * The instance of the schLB type
     */
    public static final WarningComboSearchKindType SCHLB = new WarningComboSearchKindType(SCHLB_TYPE, "schLB");

    /**
     * The schRB type
     */
    public static final int SCHRB_TYPE = 3;

    /**
     * The instance of the schRB type
     */
    public static final WarningComboSearchKindType SCHRB = new WarningComboSearchKindType(SCHRB_TYPE, "schRB");

    /**
     * The schIN type
     */
    public static final int SCHIN_TYPE = 4;

    /**
     * The instance of the schIN type
     */
    public static final WarningComboSearchKindType SCHIN = new WarningComboSearchKindType(SCHIN_TYPE, "schIN");

    /**
     * The schEE type
     */
    public static final int SCHEE_TYPE = 5;

    /**
     * The instance of the schEE type
     */
    public static final WarningComboSearchKindType SCHEE = new WarningComboSearchKindType(SCHEE_TYPE, "schEE");

    /**
     * The schBB type
     */
    public static final int SCHBB_TYPE = 6;

    /**
     * The instance of the schBB type
     */
    public static final WarningComboSearchKindType SCHBB = new WarningComboSearchKindType(SCHBB_TYPE, "schBB");

    /**
     * The schBE type
     */
    public static final int SCHBE_TYPE = 7;

    /**
     * The instance of the schBE type
     */
    public static final WarningComboSearchKindType SCHBE = new WarningComboSearchKindType(SCHBE_TYPE, "schBE");

    /**
     * The schEB type
     */
    public static final int SCHEB_TYPE = 8;

    /**
     * The instance of the schEB type
     */
    public static final WarningComboSearchKindType SCHEB = new WarningComboSearchKindType(SCHEB_TYPE, "schEB");

    /**
     * The schM type
     */
    public static final int SCHM_TYPE = 9;

    /**
     * The instance of the schM type
     */
    public static final WarningComboSearchKindType SCHM = new WarningComboSearchKindType(SCHM_TYPE, "schM");

    /**
     * The schL type
     */
    public static final int SCHL_TYPE = 10;

    /**
     * The instance of the schL type
     */
    public static final WarningComboSearchKindType SCHL = new WarningComboSearchKindType(SCHL_TYPE, "schL");

    /**
     * The schME type
     */
    public static final int SCHME_TYPE = 11;

    /**
     * The instance of the schME type
     */
    public static final WarningComboSearchKindType SCHME = new WarningComboSearchKindType(SCHME_TYPE, "schME");

    /**
     * The schLE type
     */
    public static final int SCHLE_TYPE = 12;

    /**
     * The instance of the schLE type
     */
    public static final WarningComboSearchKindType SCHLE = new WarningComboSearchKindType(SCHLE_TYPE, "schLE");

    /**
     * The schRE type
     */
    public static final int SCHRE_TYPE = 13;

    /**
     * The instance of the schRE type
     */
    public static final WarningComboSearchKindType SCHRE = new WarningComboSearchKindType(SCHRE_TYPE, "schRE");

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

    private WarningComboSearchKindType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.WarningComboSearchKindType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of WarningComboSearchKindType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * WarningComboSearchKindType
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
        members.put("schE", SCHE);
        members.put("schB", SCHB);
        members.put("schLB", SCHLB);
        members.put("schRB", SCHRB);
        members.put("schIN", SCHIN);
        members.put("schEE", SCHEE);
        members.put("schBB", SCHBB);
        members.put("schBE", SCHBE);
        members.put("schEB", SCHEB);
        members.put("schM", SCHM);
        members.put("schL", SCHL);
        members.put("schME", SCHME);
        members.put("schLE", SCHLE);
        members.put("schRE", SCHRE);
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
     * WarningComboSearchKindType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new WarningComboSearchKindType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.WarningComboSearchKindType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid WarningComboSearchKindType";
            throw new IllegalArgumentException(err);
        }
        return (WarningComboSearchKindType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.WarningComboSearchKindType valueOf(java.lang.String) 

}