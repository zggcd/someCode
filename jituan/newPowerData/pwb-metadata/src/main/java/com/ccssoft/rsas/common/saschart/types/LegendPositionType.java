/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.saschart.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class LegendPositionType.
 * 
 * @version $Revision$ $Date$
 */
public class LegendPositionType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The lgdLeft type
     */
    public static final int LGDLEFT_TYPE = 0;

    /**
     * The instance of the lgdLeft type
     */
    public static final LegendPositionType LGDLEFT = new LegendPositionType(LGDLEFT_TYPE, "lgdLeft");

    /**
     * The lgdRight type
     */
    public static final int LGDRIGHT_TYPE = 1;

    /**
     * The instance of the lgdRight type
     */
    public static final LegendPositionType LGDRIGHT = new LegendPositionType(LGDRIGHT_TYPE, "lgdRight");

    /**
     * The lgdTop type
     */
    public static final int LGDTOP_TYPE = 2;

    /**
     * The instance of the lgdTop type
     */
    public static final LegendPositionType LGDTOP = new LegendPositionType(LGDTOP_TYPE, "lgdTop");

    /**
     * The lgdBottom type
     */
    public static final int LGDBOTTOM_TYPE = 3;

    /**
     * The instance of the lgdBottom type
     */
    public static final LegendPositionType LGDBOTTOM = new LegendPositionType(LGDBOTTOM_TYPE, "lgdBottom");

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

    private LegendPositionType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.LegendPositionType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of LegendPositionType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this LegendPositionType
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
        members.put("lgdLeft", LGDLEFT);
        members.put("lgdRight", LGDRIGHT);
        members.put("lgdTop", LGDTOP);
        members.put("lgdBottom", LGDBOTTOM);
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
     * LegendPositionType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new LegendPositionType based on the
     * given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.LegendPositionType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid LegendPositionType";
            throw new IllegalArgumentException(err);
        }
        return (LegendPositionType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.LegendPositionType valueOf(java.lang.String) 

}
