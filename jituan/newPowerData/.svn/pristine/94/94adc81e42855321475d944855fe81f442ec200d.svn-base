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
 * Class MIDHomeItemItemTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class MIDHomeItemItemTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The itSingle type
     */
    public static final int ITSINGLE_TYPE = 0;

    /**
     * The instance of the itSingle type
     */
    public static final MIDHomeItemItemTypeType ITSINGLE = new MIDHomeItemItemTypeType(ITSINGLE_TYPE, "itSingle");

    /**
     * The itGroup type
     */
    public static final int ITGROUP_TYPE = 1;

    /**
     * The instance of the itGroup type
     */
    public static final MIDHomeItemItemTypeType ITGROUP = new MIDHomeItemItemTypeType(ITGROUP_TYPE, "itGroup");

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

    private MIDHomeItemItemTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.MIDHomeItemItemTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of MIDHomeItemItemTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this MIDHomeItemItemTypeTyp
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
        members.put("itSingle", ITSINGLE);
        members.put("itGroup", ITGROUP);
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
     * MIDHomeItemItemTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new MIDHomeItemItemTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.MIDHomeItemItemTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MIDHomeItemItemTypeType";
            throw new IllegalArgumentException(err);
        }
        return (MIDHomeItemItemTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.MIDHomeItemItemTypeType valueOf(java.lang.String) 

}
