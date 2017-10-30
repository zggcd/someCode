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
 * Class ColumnHeaderAlignType.
 * 
 * @version $Revision$ $Date$
 */
public class ColumnHeaderAlignType implements java.io.Serializable {


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
    public static final ColumnHeaderAlignType LEFT = new ColumnHeaderAlignType(LEFT_TYPE, "LEFT");

    /**
     * The CENTER type
     */
    public static final int CENTER_TYPE = 1;

    /**
     * The instance of the CENTER type
     */
    public static final ColumnHeaderAlignType CENTER = new ColumnHeaderAlignType(CENTER_TYPE, "CENTER");

    /**
     * The RIGHT type
     */
    public static final int RIGHT_TYPE = 2;

    /**
     * The instance of the RIGHT type
     */
    public static final ColumnHeaderAlignType RIGHT = new ColumnHeaderAlignType(RIGHT_TYPE, "RIGHT");

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

    private ColumnHeaderAlignType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ColumnHeaderAlignType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ColumnHeaderAlignType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this ColumnHeaderAlignType
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
     * ColumnHeaderAlignType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ColumnHeaderAlignType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ColumnHeaderAlignType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ColumnHeaderAlignType";
            throw new IllegalArgumentException(err);
        }
        return (ColumnHeaderAlignType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ColumnHeaderAlignType valueOf(java.lang.String) 

}
