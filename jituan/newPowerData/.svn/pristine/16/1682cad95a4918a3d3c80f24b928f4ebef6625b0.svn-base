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
 * Class WarningLevelColorAreaType.
 * 
 * @version $Revision$ $Date$
 */
public class WarningLevelColorAreaType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The crCurFont type
     */
    public static final int CRCURFONT_TYPE = 0;

    /**
     * The instance of the crCurFont type
     */
    public static final WarningLevelColorAreaType CRCURFONT = new WarningLevelColorAreaType(CRCURFONT_TYPE, "crCurFont");

    /**
     * The crCurback type
     */
    public static final int CRCURBACK_TYPE = 1;

    /**
     * The instance of the crCurback type
     */
    public static final WarningLevelColorAreaType CRCURBACK = new WarningLevelColorAreaType(CRCURBACK_TYPE, "crCurback");

    /**
     * The crRowFont type
     */
    public static final int CRROWFONT_TYPE = 2;

    /**
     * The instance of the crRowFont type
     */
    public static final WarningLevelColorAreaType CRROWFONT = new WarningLevelColorAreaType(CRROWFONT_TYPE, "crRowFont");

    /**
     * The crRowback type
     */
    public static final int CRROWBACK_TYPE = 3;

    /**
     * The instance of the crRowback type
     */
    public static final WarningLevelColorAreaType CRROWBACK = new WarningLevelColorAreaType(CRROWBACK_TYPE, "crRowback");

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

    private WarningLevelColorAreaType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.WarningLevelColorAreaType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of WarningLevelColorAreaType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * WarningLevelColorAreaType
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
        members.put("crCurFont", CRCURFONT);
        members.put("crCurback", CRCURBACK);
        members.put("crRowFont", CRROWFONT);
        members.put("crRowback", CRROWBACK);
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
     * WarningLevelColorAreaType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new WarningLevelColorAreaType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.WarningLevelColorAreaType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid WarningLevelColorAreaType";
            throw new IllegalArgumentException(err);
        }
        return (WarningLevelColorAreaType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.WarningLevelColorAreaType valueOf(java.lang.String) 

}
