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
 * Class DBFieldSQLDataTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DBFieldSQLDataTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The datARRAY type
     */
    public static final int DATARRAY_TYPE = 0;

    /**
     * The instance of the datARRAY type
     */
    public static final DBFieldSQLDataTypeType DATARRAY = new DBFieldSQLDataTypeType(DATARRAY_TYPE, "datARRAY");

    /**
     * The datBIGINT type
     */
    public static final int DATBIGINT_TYPE = 1;

    /**
     * The instance of the datBIGINT type
     */
    public static final DBFieldSQLDataTypeType DATBIGINT = new DBFieldSQLDataTypeType(DATBIGINT_TYPE, "datBIGINT");

    /**
     * The datBINARY type
     */
    public static final int DATBINARY_TYPE = 2;

    /**
     * The instance of the datBINARY type
     */
    public static final DBFieldSQLDataTypeType DATBINARY = new DBFieldSQLDataTypeType(DATBINARY_TYPE, "datBINARY");

    /**
     * The datBIT type
     */
    public static final int DATBIT_TYPE = 3;

    /**
     * The instance of the datBIT type
     */
    public static final DBFieldSQLDataTypeType DATBIT = new DBFieldSQLDataTypeType(DATBIT_TYPE, "datBIT");

    /**
     * The datBLOB type
     */
    public static final int DATBLOB_TYPE = 4;

    /**
     * The instance of the datBLOB type
     */
    public static final DBFieldSQLDataTypeType DATBLOB = new DBFieldSQLDataTypeType(DATBLOB_TYPE, "datBLOB");

    /**
     * The datBOOLEAN type
     */
    public static final int DATBOOLEAN_TYPE = 5;

    /**
     * The instance of the datBOOLEAN type
     */
    public static final DBFieldSQLDataTypeType DATBOOLEAN = new DBFieldSQLDataTypeType(DATBOOLEAN_TYPE, "datBOOLEAN");

    /**
     * The datCHAR type
     */
    public static final int DATCHAR_TYPE = 6;

    /**
     * The instance of the datCHAR type
     */
    public static final DBFieldSQLDataTypeType DATCHAR = new DBFieldSQLDataTypeType(DATCHAR_TYPE, "datCHAR");

    /**
     * The datCLOB type
     */
    public static final int DATCLOB_TYPE = 7;

    /**
     * The instance of the datCLOB type
     */
    public static final DBFieldSQLDataTypeType DATCLOB = new DBFieldSQLDataTypeType(DATCLOB_TYPE, "datCLOB");

    /**
     * The datDATALINK type
     */
    public static final int DATDATALINK_TYPE = 8;

    /**
     * The instance of the datDATALINK type
     */
    public static final DBFieldSQLDataTypeType DATDATALINK = new DBFieldSQLDataTypeType(DATDATALINK_TYPE, "datDATALINK");

    /**
     * The datDATE type
     */
    public static final int DATDATE_TYPE = 9;

    /**
     * The instance of the datDATE type
     */
    public static final DBFieldSQLDataTypeType DATDATE = new DBFieldSQLDataTypeType(DATDATE_TYPE, "datDATE");

    /**
     * The datDECIMAL type
     */
    public static final int DATDECIMAL_TYPE = 10;

    /**
     * The instance of the datDECIMAL type
     */
    public static final DBFieldSQLDataTypeType DATDECIMAL = new DBFieldSQLDataTypeType(DATDECIMAL_TYPE, "datDECIMAL");

    /**
     * The datDISTINCT type
     */
    public static final int DATDISTINCT_TYPE = 11;

    /**
     * The instance of the datDISTINCT type
     */
    public static final DBFieldSQLDataTypeType DATDISTINCT = new DBFieldSQLDataTypeType(DATDISTINCT_TYPE, "datDISTINCT");

    /**
     * The datDOUBLE type
     */
    public static final int DATDOUBLE_TYPE = 12;

    /**
     * The instance of the datDOUBLE type
     */
    public static final DBFieldSQLDataTypeType DATDOUBLE = new DBFieldSQLDataTypeType(DATDOUBLE_TYPE, "datDOUBLE");

    /**
     * The datFLOAT type
     */
    public static final int DATFLOAT_TYPE = 13;

    /**
     * The instance of the datFLOAT type
     */
    public static final DBFieldSQLDataTypeType DATFLOAT = new DBFieldSQLDataTypeType(DATFLOAT_TYPE, "datFLOAT");

    /**
     * The datINTEGER type
     */
    public static final int DATINTEGER_TYPE = 14;

    /**
     * The instance of the datINTEGER type
     */
    public static final DBFieldSQLDataTypeType DATINTEGER = new DBFieldSQLDataTypeType(DATINTEGER_TYPE, "datINTEGER");

    /**
     * The datJAVA_OBJECT type
     */
    public static final int DATJAVA_OBJECT_TYPE = 15;

    /**
     * The instance of the datJAVA_OBJECT type
     */
    public static final DBFieldSQLDataTypeType DATJAVA_OBJECT = new DBFieldSQLDataTypeType(DATJAVA_OBJECT_TYPE, "datJAVA_OBJECT");

    /**
     * The datLONGVARBINARY type
     */
    public static final int DATLONGVARBINARY_TYPE = 16;

    /**
     * The instance of the datLONGVARBINARY type
     */
    public static final DBFieldSQLDataTypeType DATLONGVARBINARY = new DBFieldSQLDataTypeType(DATLONGVARBINARY_TYPE, "datLONGVARBINARY");

    /**
     * The datLONGVARCHAR type
     */
    public static final int DATLONGVARCHAR_TYPE = 17;

    /**
     * The instance of the datLONGVARCHAR type
     */
    public static final DBFieldSQLDataTypeType DATLONGVARCHAR = new DBFieldSQLDataTypeType(DATLONGVARCHAR_TYPE, "datLONGVARCHAR");

    /**
     * The datNULL type
     */
    public static final int DATNULL_TYPE = 18;

    /**
     * The instance of the datNULL type
     */
    public static final DBFieldSQLDataTypeType DATNULL = new DBFieldSQLDataTypeType(DATNULL_TYPE, "datNULL");

    /**
     * The datNUMERIC type
     */
    public static final int DATNUMERIC_TYPE = 19;

    /**
     * The instance of the datNUMERIC type
     */
    public static final DBFieldSQLDataTypeType DATNUMERIC = new DBFieldSQLDataTypeType(DATNUMERIC_TYPE, "datNUMERIC");

    /**
     * The datOTHER type
     */
    public static final int DATOTHER_TYPE = 20;

    /**
     * The instance of the datOTHER type
     */
    public static final DBFieldSQLDataTypeType DATOTHER = new DBFieldSQLDataTypeType(DATOTHER_TYPE, "datOTHER");

    /**
     * The datREAL type
     */
    public static final int DATREAL_TYPE = 21;

    /**
     * The instance of the datREAL type
     */
    public static final DBFieldSQLDataTypeType DATREAL = new DBFieldSQLDataTypeType(DATREAL_TYPE, "datREAL");

    /**
     * The datREF type
     */
    public static final int DATREF_TYPE = 22;

    /**
     * The instance of the datREF type
     */
    public static final DBFieldSQLDataTypeType DATREF = new DBFieldSQLDataTypeType(DATREF_TYPE, "datREF");

    /**
     * The datSMALLINT type
     */
    public static final int DATSMALLINT_TYPE = 23;

    /**
     * The instance of the datSMALLINT type
     */
    public static final DBFieldSQLDataTypeType DATSMALLINT = new DBFieldSQLDataTypeType(DATSMALLINT_TYPE, "datSMALLINT");

    /**
     * The datSTRUCT type
     */
    public static final int DATSTRUCT_TYPE = 24;

    /**
     * The instance of the datSTRUCT type
     */
    public static final DBFieldSQLDataTypeType DATSTRUCT = new DBFieldSQLDataTypeType(DATSTRUCT_TYPE, "datSTRUCT");

    /**
     * The datTIME type
     */
    public static final int DATTIME_TYPE = 25;

    /**
     * The instance of the datTIME type
     */
    public static final DBFieldSQLDataTypeType DATTIME = new DBFieldSQLDataTypeType(DATTIME_TYPE, "datTIME");

    /**
     * The datTIMESTAMP type
     */
    public static final int DATTIMESTAMP_TYPE = 26;

    /**
     * The instance of the datTIMESTAMP type
     */
    public static final DBFieldSQLDataTypeType DATTIMESTAMP = new DBFieldSQLDataTypeType(DATTIMESTAMP_TYPE, "datTIMESTAMP");

    /**
     * The datTINYINT type
     */
    public static final int DATTINYINT_TYPE = 27;

    /**
     * The instance of the datTINYINT type
     */
    public static final DBFieldSQLDataTypeType DATTINYINT = new DBFieldSQLDataTypeType(DATTINYINT_TYPE, "datTINYINT");

    /**
     * The datVARBINARY type
     */
    public static final int DATVARBINARY_TYPE = 28;

    /**
     * The instance of the datVARBINARY type
     */
    public static final DBFieldSQLDataTypeType DATVARBINARY = new DBFieldSQLDataTypeType(DATVARBINARY_TYPE, "datVARBINARY");

    /**
     * The datVARCHAR type
     */
    public static final int DATVARCHAR_TYPE = 29;

    /**
     * The instance of the datVARCHAR type
     */
    public static final DBFieldSQLDataTypeType DATVARCHAR = new DBFieldSQLDataTypeType(DATVARCHAR_TYPE, "datVARCHAR");

    /**
     * The datCURSOR type
     */
    public static final int DATCURSOR_TYPE = 30;

    /**
     * The instance of the datCURSOR type
     */
    public static final DBFieldSQLDataTypeType DATCURSOR = new DBFieldSQLDataTypeType(DATCURSOR_TYPE, "datCURSOR");

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

    private DBFieldSQLDataTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DBFieldSQLDataTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DBFieldSQLDataTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this DBFieldSQLDataTypeType
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
        members.put("datARRAY", DATARRAY);
        members.put("datBIGINT", DATBIGINT);
        members.put("datBINARY", DATBINARY);
        members.put("datBIT", DATBIT);
        members.put("datBLOB", DATBLOB);
        members.put("datBOOLEAN", DATBOOLEAN);
        members.put("datCHAR", DATCHAR);
        members.put("datCLOB", DATCLOB);
        members.put("datDATALINK", DATDATALINK);
        members.put("datDATE", DATDATE);
        members.put("datDECIMAL", DATDECIMAL);
        members.put("datDISTINCT", DATDISTINCT);
        members.put("datDOUBLE", DATDOUBLE);
        members.put("datFLOAT", DATFLOAT);
        members.put("datINTEGER", DATINTEGER);
        members.put("datJAVA_OBJECT", DATJAVA_OBJECT);
        members.put("datLONGVARBINARY", DATLONGVARBINARY);
        members.put("datLONGVARCHAR", DATLONGVARCHAR);
        members.put("datNULL", DATNULL);
        members.put("datNUMERIC", DATNUMERIC);
        members.put("datOTHER", DATOTHER);
        members.put("datREAL", DATREAL);
        members.put("datREF", DATREF);
        members.put("datSMALLINT", DATSMALLINT);
        members.put("datSTRUCT", DATSTRUCT);
        members.put("datTIME", DATTIME);
        members.put("datTIMESTAMP", DATTIMESTAMP);
        members.put("datTINYINT", DATTINYINT);
        members.put("datVARBINARY", DATVARBINARY);
        members.put("datVARCHAR", DATVARCHAR);
        members.put("datCURSOR", DATCURSOR);
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
     * DBFieldSQLDataTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DBFieldSQLDataTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DBFieldSQLDataTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DBFieldSQLDataTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DBFieldSQLDataTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DBFieldSQLDataTypeType valueOf(java.lang.String) 

}
