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
 * Class ReportDefineResultComboTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ReportDefineResultComboTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The rstAddRow type
     */
    public static final int RSTADDROW_TYPE = 0;

    /**
     * The instance of the rstAddRow type
     */
    public static final ReportDefineResultComboTypeType RSTADDROW = new ReportDefineResultComboTypeType(RSTADDROW_TYPE, "rstAddRow");

    /**
     * The rstAddCol type
     */
    public static final int RSTADDCOL_TYPE = 1;

    /**
     * The instance of the rstAddCol type
     */
    public static final ReportDefineResultComboTypeType RSTADDCOL = new ReportDefineResultComboTypeType(RSTADDCOL_TYPE, "rstAddCol");

    /**
     * The rstOverWrite type
     */
    public static final int RSTOVERWRITE_TYPE = 2;

    /**
     * The instance of the rstOverWrite type
     */
    public static final ReportDefineResultComboTypeType RSTOVERWRITE = new ReportDefineResultComboTypeType(RSTOVERWRITE_TYPE, "rstOverWrite");

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

    private ReportDefineResultComboTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportDefineResultComboTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ReportDefineResultComboTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ReportDefineResultComboTypeType
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
        members.put("rstAddRow", RSTADDROW);
        members.put("rstAddCol", RSTADDCOL);
        members.put("rstOverWrite", RSTOVERWRITE);
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
     * ReportDefineResultComboTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ReportDefineResultComboTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.ReportDefineResultComboTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ReportDefineResultComboTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ReportDefineResultComboTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.ReportDefineResultComboTypeType valueOf(java.lang.String) 

}
