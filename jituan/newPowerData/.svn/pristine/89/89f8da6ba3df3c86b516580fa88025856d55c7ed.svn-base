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
 * Class SysMenuItemWebAppMatchTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class SysMenuItemWebAppMatchTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The mtNone type
     */
    public static final int MTNONE_TYPE = 0;

    /**
     * The instance of the mtNone type
     */
    public static final SysMenuItemWebAppMatchTypeType MTNONE = new SysMenuItemWebAppMatchTypeType(MTNONE_TYPE, "mtNone");

    /**
     * The mtFirstSec type
     */
    public static final int MTFIRSTSEC_TYPE = 1;

    /**
     * The instance of the mtFirstSec type
     */
    public static final SysMenuItemWebAppMatchTypeType MTFIRSTSEC = new SysMenuItemWebAppMatchTypeType(MTFIRSTSEC_TYPE, "mtFirstSec");

    /**
     * The mtSencondSec type
     */
    public static final int MTSENCONDSEC_TYPE = 2;

    /**
     * The instance of the mtSencondSec type
     */
    public static final SysMenuItemWebAppMatchTypeType MTSENCONDSEC = new SysMenuItemWebAppMatchTypeType(MTSENCONDSEC_TYPE, "mtSencondSec");

    /**
     * The mtThirdSec type
     */
    public static final int MTTHIRDSEC_TYPE = 3;

    /**
     * The instance of the mtThirdSec type
     */
    public static final SysMenuItemWebAppMatchTypeType MTTHIRDSEC = new SysMenuItemWebAppMatchTypeType(MTTHIRDSEC_TYPE, "mtThirdSec");

    /**
     * The mtAll type
     */
    public static final int MTALL_TYPE = 4;

    /**
     * The instance of the mtAll type
     */
    public static final SysMenuItemWebAppMatchTypeType MTALL = new SysMenuItemWebAppMatchTypeType(MTALL_TYPE, "mtAll");

    /**
     * The mtMost type
     */
    public static final int MTMOST_TYPE = 5;

    /**
     * The instance of the mtMost type
     */
    public static final SysMenuItemWebAppMatchTypeType MTMOST = new SysMenuItemWebAppMatchTypeType(MTMOST_TYPE, "mtMost");

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

    private SysMenuItemWebAppMatchTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.SysMenuItemWebAppMatchTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of SysMenuItemWebAppMatchTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * SysMenuItemWebAppMatchTypeType
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
        members.put("mtNone", MTNONE);
        members.put("mtFirstSec", MTFIRSTSEC);
        members.put("mtSencondSec", MTSENCONDSEC);
        members.put("mtThirdSec", MTTHIRDSEC);
        members.put("mtAll", MTALL);
        members.put("mtMost", MTMOST);
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
     * SysMenuItemWebAppMatchTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new SysMenuItemWebAppMatchTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.SysMenuItemWebAppMatchTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SysMenuItemWebAppMatchTypeType";
            throw new IllegalArgumentException(err);
        }
        return (SysMenuItemWebAppMatchTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.SysMenuItemWebAppMatchTypeType valueOf(java.lang.String) 

}
