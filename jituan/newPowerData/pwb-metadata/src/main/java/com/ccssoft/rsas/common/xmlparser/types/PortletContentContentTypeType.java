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
 * Class PortletContentContentTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class PortletContentContentTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ctReport type
     */
    public static final int CTREPORT_TYPE = 0;

    /**
     * The instance of the ctReport type
     */
    public static final PortletContentContentTypeType CTREPORT = new PortletContentContentTypeType(CTREPORT_TYPE, "ctReport");

    /**
     * The ctInside type
     */
    public static final int CTINSIDE_TYPE = 1;

    /**
     * The instance of the ctInside type
     */
    public static final PortletContentContentTypeType CTINSIDE = new PortletContentContentTypeType(CTINSIDE_TYPE, "ctInside");

    /**
     * The ctURL type
     */
    public static final int CTURL_TYPE = 2;

    /**
     * The instance of the ctURL type
     */
    public static final PortletContentContentTypeType CTURL = new PortletContentContentTypeType(CTURL_TYPE, "ctURL");

    /**
     * The ctIndicator type
     */
    public static final int CTINDICATOR_TYPE = 3;

    /**
     * The instance of the ctIndicator type
     */
    public static final PortletContentContentTypeType CTINDICATOR = new PortletContentContentTypeType(CTINDICATOR_TYPE, "ctIndicator");

    /**
     * The ctSPM type
     */
    public static final int CTSPM_TYPE = 4;

    /**
     * The instance of the ctSPM type
     */
    public static final PortletContentContentTypeType CTSPM = new PortletContentContentTypeType(CTSPM_TYPE, "ctSPM");
    
    
    /**
     * The ctCond type
     */
    public static final int CTCOND_TYPE = 5;
    /**
     * The instance of the ctCond type
     */
    public static final PortletContentContentTypeType CTCOND = new PortletContentContentTypeType(CTCOND_TYPE, "ctCond");

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

    private PortletContentContentTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortletContentContentTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of PortletContentContentTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * PortletContentContentTypeType
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
        members.put("ctReport", CTREPORT);
        members.put("ctInside", CTINSIDE);
        members.put("ctURL", CTURL);
        members.put("ctIndicator", CTINDICATOR);
        members.put("ctSPM", CTSPM);
        members.put("ctCond", CTCOND);
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
     * PortletContentContentTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new PortletContentContentTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.PortletContentContentTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PortletContentContentTypeType";
            throw new IllegalArgumentException(err);
        }
        return (PortletContentContentTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortletContentContentTypeType valueOf(java.lang.String) 

}
