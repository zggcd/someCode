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
 * Class DimMemberAlignType.
 * 
 * @version $Revision$ $Date$
 */
public class DimMemberAlignType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The LEFT type
     */
    public static final int LEFT_TYPE = 0;

    /**
     * The instance of the LEFT type
     */
    public static final DimMemberAlignType LEFT = new DimMemberAlignType(LEFT_TYPE, "LEFT");

    /**
     * The CENTER type
     */
    public static final int CENTER_TYPE = 1;

    /**
     * The instance of the CENTER type
     */
    public static final DimMemberAlignType CENTER = new DimMemberAlignType(CENTER_TYPE, "CENTER");

    /**
     * The RIGHT type
     */
    public static final int RIGHT_TYPE = 2;

    /**
     * The instance of the RIGHT type
     */
    public static final DimMemberAlignType RIGHT = new DimMemberAlignType(RIGHT_TYPE, "RIGHT");

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

    private DimMemberAlignType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimMemberAlignType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DimMemberAlignType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this DimMemberAlignType
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
        members.put("LEFT", LEFT);
        members.put("CENTER", CENTER);
        members.put("RIGHT", RIGHT);
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
     * DimMemberAlignType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DimMemberAlignType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DimMemberAlignType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DimMemberAlignType";
            throw new IllegalArgumentException(err);
        }
        return (DimMemberAlignType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DimMemberAlignType valueOf(java.lang.String) 

}
