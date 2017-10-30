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
 * Class PortletPortletTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class PortletPortletTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The pltContent type
     */
    public static final int PLTCONTENT_TYPE = 0;

    /**
     * The instance of the pltContent type
     */
    public static final PortletPortletTypeType PLTCONTENT = new PortletPortletTypeType(PLTCONTENT_TYPE, "pltContent");

    /**
     * The pltFrame type
     */
    public static final int PLTFRAME_TYPE = 1;

    /**
     * The instance of the pltFrame type
     */
    public static final PortletPortletTypeType PLTFRAME = new PortletPortletTypeType(PLTFRAME_TYPE, "pltFrame");

    /**
     * The pltConditon type
     */
    public static final int PLTCONDITON_TYPE = 2;

    /**
     * The instance of the pltConditon type
     */
    public static final PortletPortletTypeType PLTCONDITON = new PortletPortletTypeType(PLTCONDITON_TYPE, "pltConditon");

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

    private PortletPortletTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortletPortletTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of PortletPortletTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this PortletPortletTypeType
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
        members.put("pltContent", PLTCONTENT);
        members.put("pltFrame", PLTFRAME);
        members.put("pltConditon", PLTCONDITON);
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
     * PortletPortletTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new PortletPortletTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.PortletPortletTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PortletPortletTypeType";
            throw new IllegalArgumentException(err);
        }
        return (PortletPortletTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.PortletPortletTypeType valueOf(java.lang.String) 

}
