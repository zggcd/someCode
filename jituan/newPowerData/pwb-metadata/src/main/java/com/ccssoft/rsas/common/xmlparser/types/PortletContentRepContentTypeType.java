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
 * Class PortletContentRepContentTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class PortletContentRepContentTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The rctwhole type
     */
    public static final int RCTWHOLE_TYPE = 0;

    /**
     * The instance of the rctwhole type
     */
    public static final PortletContentRepContentTypeType RCTWHOLE = new PortletContentRepContentTypeType(RCTWHOLE_TYPE, "rctwhole");

    /**
     * The rctGrid type
     */
    public static final int RCTGRID_TYPE = 1;

    /**
     * The instance of the rctGrid type
     */
    public static final PortletContentRepContentTypeType RCTGRID = new PortletContentRepContentTypeType(RCTGRID_TYPE, "rctGrid");

    /**
     * The rctChart type
     */
    public static final int RCTCHART_TYPE = 2;

    /**
     * The instance of the rctChart type
     */
    public static final PortletContentRepContentTypeType RCTCHART = new PortletContentRepContentTypeType(RCTCHART_TYPE, "rctChart");

    /**
     * The rctGridChart type
     */
    public static final int RCTGRIDCHART_TYPE = 3;

    /**
     * The instance of the rctGridChart type
     */
    public static final PortletContentRepContentTypeType RCTGRIDCHART = new PortletContentRepContentTypeType(RCTGRIDCHART_TYPE, "rctGridChart");

    /**
     * The rctAnalysis type
     */
    public static final int RCTANALYSIS_TYPE = 4;

    /**
     * The instance of the rctAnalysis type
     */
    public static final PortletContentRepContentTypeType RCTANALYSIS = new PortletContentRepContentTypeType(RCTANALYSIS_TYPE, "rctAnalysis");

    /**
     * The rctList type
     */
    public static final int RCTLIST_TYPE = 5;

    /**
     * The instance of the rctList type
     */
    public static final PortletContentRepContentTypeType RCTLIST = new PortletContentRepContentTypeType(RCTLIST_TYPE, "rctList");

    /**
     * The rctResult type
     */
    public static final int RCTRESULT_TYPE = 6;

    /**
     * The instance of the rctResult type
     */
    public static final PortletContentRepContentTypeType RCTRESULT = new PortletContentRepContentTypeType(RCTRESULT_TYPE, "rctResult");

    
    /**
     * The rctCondition type
     */
    public static final int RCTCONDITION_TYPE = 7;

    /**
     * The instance of the rctwhole type
     */
    public static final PortletContentRepContentTypeType RCTCONDITION = new PortletContentRepContentTypeType(RCTCONDITION_TYPE, "rctCondition");
    
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

    private PortletContentRepContentTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortletContentRepContentTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of PortletContentRepContentTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * PortletContentRepContentTypeType
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
        members.put("rctwhole", RCTWHOLE);
        members.put("rctGrid", RCTGRID);
        members.put("rctChart", RCTCHART);
        members.put("rctGridChart", RCTGRIDCHART);
        members.put("rctAnalysis", RCTANALYSIS);
        members.put("rctList", RCTLIST);
        members.put("rctResult", RCTRESULT);
        members.put("rctCondition", RCTCONDITION);
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
     * PortletContentRepContentTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new PortletContentRepContentTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.PortletContentRepContentTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PortletContentRepContentTypeType";
            throw new IllegalArgumentException(err);
        }
        return (PortletContentRepContentTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortletContentRepContentTypeType valueOf(java.lang.String) 

}
