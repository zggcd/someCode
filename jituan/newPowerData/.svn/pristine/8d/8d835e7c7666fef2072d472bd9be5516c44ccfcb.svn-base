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
 * Class MeasureItemMeasImageAlignType.
 * 
 * @version $Revision$ $Date$
 */
public class MeasureItemMeasImageAlignType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The miaCenter type
     */
    public static final int MIACENTER_TYPE = 0;

    /**
     * The instance of the miaCenter type
     */
    public static final MeasureItemMeasImageAlignType MIACENTER = new MeasureItemMeasImageAlignType(MIACENTER_TYPE, "miaCenter");

    /**
     * The miaLeft type
     */
    public static final int MIALEFT_TYPE = 1;

    /**
     * The instance of the miaLeft type
     */
    public static final MeasureItemMeasImageAlignType MIALEFT = new MeasureItemMeasImageAlignType(MIALEFT_TYPE, "miaLeft");

    /**
     * The miaRight type
     */
    public static final int MIARIGHT_TYPE = 2;

    /**
     * The instance of the miaRight type
     */
    public static final MeasureItemMeasImageAlignType MIARIGHT = new MeasureItemMeasImageAlignType(MIARIGHT_TYPE, "miaRight");

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

    private MeasureItemMeasImageAlignType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.MeasureItemMeasImageAlignType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of MeasureItemMeasImageAlignType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * MeasureItemMeasImageAlignType
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
        members.put("miaCenter", MIACENTER);
        members.put("miaLeft", MIALEFT);
        members.put("miaRight", MIARIGHT);
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
     * MeasureItemMeasImageAlignType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new MeasureItemMeasImageAlignType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.MeasureItemMeasImageAlignType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MeasureItemMeasImageAlignType";
            throw new IllegalArgumentException(err);
        }
        return (MeasureItemMeasImageAlignType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.MeasureItemMeasImageAlignType valueOf(java.lang.String) 

}
