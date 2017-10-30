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
 * Class IndicatorConditionConSoureTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class IndicatorConditionConSoureTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The cstGlo type
     */
    public static final int CSTGLO_TYPE = 0;

    /**
     * The instance of the cstGlo type
     */
    public static final IndicatorConditionConSoureTypeType CSTGLO = new IndicatorConditionConSoureTypeType(CSTGLO_TYPE, "cstGlo");

    /**
     * The cstPub type
     */
    public static final int CSTPUB_TYPE = 1;

    /**
     * The instance of the cstPub type
     */
    public static final IndicatorConditionConSoureTypeType CSTPUB = new IndicatorConditionConSoureTypeType(CSTPUB_TYPE, "cstPub");

    /**
     * The cstPri type
     */
    public static final int CSTPRI_TYPE = 2;

    /**
     * The instance of the cstPri type
     */
    public static final IndicatorConditionConSoureTypeType CSTPRI = new IndicatorConditionConSoureTypeType(CSTPRI_TYPE, "cstPri");

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

    private IndicatorConditionConSoureTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.IndicatorConditionConSoureTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of IndicatorConditionConSoureTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * IndicatorConditionConSoureTypeType
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
        members.put("cstGlo", CSTGLO);
        members.put("cstPub", CSTPUB);
        members.put("cstPri", CSTPRI);
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
     * IndicatorConditionConSoureTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new
     * IndicatorConditionConSoureTypeType based on the given String
     * value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.IndicatorConditionConSoureTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid IndicatorConditionConSoureTypeType";
            throw new IllegalArgumentException(err);
        }
        return (IndicatorConditionConSoureTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.IndicatorConditionConSoureTypeType valueOf(java.lang.String) 

}
