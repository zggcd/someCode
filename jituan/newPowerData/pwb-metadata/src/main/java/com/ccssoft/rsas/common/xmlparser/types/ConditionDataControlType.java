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
 * Class ConditionDataControlType.
 * 
 * @version $Revision$ $Date$
 */
public class ConditionDataControlType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ctlText type
     */
    public static final int CTLTEXT_TYPE = 0;

    /**
     * The instance of the ctlText type
     */
    public static final ConditionDataControlType CTLTEXT = new ConditionDataControlType(CTLTEXT_TYPE, "ctlText");

    /**
     * The ctlDate type
     */
    public static final int CTLDATE_TYPE = 1;

    /**
     * The instance of the ctlDate type
     */
    public static final ConditionDataControlType CTLDATE = new ConditionDataControlType(CTLDATE_TYPE, "ctlDate");

    /**
     * The ctlCombox type
     */
    public static final int CTLCOMBOX_TYPE = 2;

    /**
     * The instance of the ctlCombox type
     */
    public static final ConditionDataControlType CTLCOMBOX = new ConditionDataControlType(CTLCOMBOX_TYPE, "ctlCombox");

    /**
     * The ctlTree type
     */
    public static final int CTLTREE_TYPE = 3;

    /**
     * The instance of the ctlTree type
     */
    public static final ConditionDataControlType CTLTREE = new ConditionDataControlType(CTLTREE_TYPE, "ctlTree");

    /**
     * The ctlPopTree type
     */
    public static final int CTLPOPTREE_TYPE = 4;

    /**
     * The instance of the ctlPopTree type
     */
    public static final ConditionDataControlType CTLPOPTREE = new ConditionDataControlType(CTLPOPTREE_TYPE, "ctlPopTree");

    /**
     * The ctlGrid type
     */
    public static final int CTLGRID_TYPE = 5;

    /**
     * The instance of the ctlGrid type
     */
    public static final ConditionDataControlType CTLGRID = new ConditionDataControlType(CTLGRID_TYPE, "ctlGrid");

    /**
     * The ctlPopGrid type
     */
    public static final int CTLPOPGRID_TYPE = 6;

    /**
     * The instance of the ctlPopGrid type
     */
    public static final ConditionDataControlType CTLPOPGRID = new ConditionDataControlType(CTLPOPGRID_TYPE, "ctlPopGrid");

    /**
     * The ctlCheck type
     */
    public static final int CTLCHECK_TYPE = 7;

    /**
     * The instance of the ctlCheck type
     */
    public static final ConditionDataControlType CTLCHECK = new ConditionDataControlType(CTLCHECK_TYPE, "ctlCheck");

    /**
     * The ctlRadio type
     */
    public static final int CTLRADIO_TYPE = 8;

    /**
     * The instance of the ctlRadio type
     */
    public static final ConditionDataControlType CTLRADIO = new ConditionDataControlType(CTLRADIO_TYPE, "ctlRadio");

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

    private ConditionDataControlType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionDataControlType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ConditionDataControlType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ConditionDataControlType
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
        members.put("ctlText", CTLTEXT);
        members.put("ctlDate", CTLDATE);
        members.put("ctlCombox", CTLCOMBOX);
        members.put("ctlTree", CTLTREE);
        members.put("ctlPopTree", CTLPOPTREE);
        members.put("ctlGrid", CTLGRID);
        members.put("ctlPopGrid", CTLPOPGRID);
        members.put("ctlCheck", CTLCHECK);
        members.put("ctlRadio", CTLRADIO);
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
     * ConditionDataControlType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ConditionDataControlType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ConditionDataControlType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConditionDataControlType";
            throw new IllegalArgumentException(err);
        }
        return (ConditionDataControlType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ConditionDataControlType valueOf(java.lang.String) 

}
