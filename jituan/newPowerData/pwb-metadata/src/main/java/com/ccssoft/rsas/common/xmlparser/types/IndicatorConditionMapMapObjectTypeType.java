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
 * Class IndicatorConditionMapMapObjectTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class IndicatorConditionMapMapObjectTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The moCon type
     */
    public static final int MOCON_TYPE = 0;

    /**
     * The instance of the moCon type
     */
    public static final IndicatorConditionMapMapObjectTypeType MOCON = new IndicatorConditionMapMapObjectTypeType(MOCON_TYPE, "moCon");

    /**
     * The moParam type
     */
    public static final int MOPARAM_TYPE = 1;

    /**
     * The instance of the moParam type
     */
    public static final IndicatorConditionMapMapObjectTypeType MOPARAM = new IndicatorConditionMapMapObjectTypeType(MOPARAM_TYPE, "moParam");

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

    private IndicatorConditionMapMapObjectTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.IndicatorConditionMapMapObjectTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of IndicatorConditionMapMapObjectTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * IndicatorConditionMapMapObjectTypeType
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
        members.put("moCon", MOCON);
        members.put("moParam", MOPARAM);
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
     * IndicatorConditionMapMapObjectTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new
     * IndicatorConditionMapMapObjectTypeType based on the given
     * String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.IndicatorConditionMapMapObjectTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid IndicatorConditionMapMapObjectTypeType";
            throw new IllegalArgumentException(err);
        }
        return (IndicatorConditionMapMapObjectTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.IndicatorConditionMapMapObjectTypeType valueOf(java.lang.String) 

}
