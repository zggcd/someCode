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
 * Class ProcedureParamParamTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ProcedureParamParamTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The pmInput type
     */
    public static final int PMINPUT_TYPE = 0;

    /**
     * The instance of the pmInput type
     */
    public static final ProcedureParamParamTypeType PMINPUT = new ProcedureParamParamTypeType(PMINPUT_TYPE, "pmInput");

    /**
     * The pmOutput type
     */
    public static final int PMOUTPUT_TYPE = 1;

    /**
     * The instance of the pmOutput type
     */
    public static final ProcedureParamParamTypeType PMOUTPUT = new ProcedureParamParamTypeType(PMOUTPUT_TYPE, "pmOutput");

    /**
     * The pmInOut type
     */
    public static final int PMINOUT_TYPE = 2;

    /**
     * The instance of the pmInOut type
     */
    public static final ProcedureParamParamTypeType PMINOUT = new ProcedureParamParamTypeType(PMINOUT_TYPE, "pmInOut");

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

    private ProcedureParamParamTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ProcedureParamParamTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ProcedureParamParamTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ProcedureParamParamTypeType
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
        members.put("pmInput", PMINPUT);
        members.put("pmOutput", PMOUTPUT);
        members.put("pmInOut", PMINOUT);
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
     * ProcedureParamParamTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ProcedureParamParamTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ProcedureParamParamTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ProcedureParamParamTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ProcedureParamParamTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ProcedureParamParamTypeType valueOf(java.lang.String) 

}
