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
 * Class DataCellAreaFontCharsetType.
 * 
 * @version $Revision$ $Date$
 */
public class DataCellAreaFontCharsetType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The 0 type
     */
    public static final int VALUE_0_TYPE = 0;

    /**
     * The instance of the 0 type
     */
    public static final DataCellAreaFontCharsetType VALUE_0 = new DataCellAreaFontCharsetType(VALUE_0_TYPE, "0");

    /**
     * The 1 type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the 1 type
     */
    public static final DataCellAreaFontCharsetType VALUE_1 = new DataCellAreaFontCharsetType(VALUE_1_TYPE, "1");

    /**
     * The 2 type
     */
    public static final int VALUE_2_TYPE = 2;

    /**
     * The instance of the 2 type
     */
    public static final DataCellAreaFontCharsetType VALUE_2 = new DataCellAreaFontCharsetType(VALUE_2_TYPE, "2");

    /**
     * The 77 type
     */
    public static final int VALUE_77_TYPE = 3;

    /**
     * The instance of the 77 type
     */
    public static final DataCellAreaFontCharsetType VALUE_77 = new DataCellAreaFontCharsetType(VALUE_77_TYPE, "77");

    /**
     * The 128 type
     */
    public static final int VALUE_128_TYPE = 4;

    /**
     * The instance of the 128 type
     */
    public static final DataCellAreaFontCharsetType VALUE_128 = new DataCellAreaFontCharsetType(VALUE_128_TYPE, "128");

    /**
     * The 129 type
     */
    public static final int VALUE_129_TYPE = 5;

    /**
     * The instance of the 129 type
     */
    public static final DataCellAreaFontCharsetType VALUE_129 = new DataCellAreaFontCharsetType(VALUE_129_TYPE, "129");

    /**
     * The 130 type
     */
    public static final int VALUE_130_TYPE = 6;

    /**
     * The instance of the 130 type
     */
    public static final DataCellAreaFontCharsetType VALUE_130 = new DataCellAreaFontCharsetType(VALUE_130_TYPE, "130");

    /**
     * The 134 type
     */
    public static final int VALUE_134_TYPE = 7;

    /**
     * The instance of the 134 type
     */
    public static final DataCellAreaFontCharsetType VALUE_134 = new DataCellAreaFontCharsetType(VALUE_134_TYPE, "134");

    /**
     * The 136 type
     */
    public static final int VALUE_136_TYPE = 8;

    /**
     * The instance of the 136 type
     */
    public static final DataCellAreaFontCharsetType VALUE_136 = new DataCellAreaFontCharsetType(VALUE_136_TYPE, "136");

    /**
     * The 161 type
     */
    public static final int VALUE_161_TYPE = 9;

    /**
     * The instance of the 161 type
     */
    public static final DataCellAreaFontCharsetType VALUE_161 = new DataCellAreaFontCharsetType(VALUE_161_TYPE, "161");

    /**
     * The 162 type
     */
    public static final int VALUE_162_TYPE = 10;

    /**
     * The instance of the 162 type
     */
    public static final DataCellAreaFontCharsetType VALUE_162 = new DataCellAreaFontCharsetType(VALUE_162_TYPE, "162");

    /**
     * The 163 type
     */
    public static final int VALUE_163_TYPE = 11;

    /**
     * The instance of the 163 type
     */
    public static final DataCellAreaFontCharsetType VALUE_163 = new DataCellAreaFontCharsetType(VALUE_163_TYPE, "163");

    /**
     * The 178 type
     */
    public static final int VALUE_178_TYPE = 12;

    /**
     * The instance of the 178 type
     */
    public static final DataCellAreaFontCharsetType VALUE_178 = new DataCellAreaFontCharsetType(VALUE_178_TYPE, "178");

    /**
     * The 186 type
     */
    public static final int VALUE_186_TYPE = 13;

    /**
     * The instance of the 186 type
     */
    public static final DataCellAreaFontCharsetType VALUE_186 = new DataCellAreaFontCharsetType(VALUE_186_TYPE, "186");

    /**
     * The 204 type
     */
    public static final int VALUE_204_TYPE = 14;

    /**
     * The instance of the 204 type
     */
    public static final DataCellAreaFontCharsetType VALUE_204 = new DataCellAreaFontCharsetType(VALUE_204_TYPE, "204");

    /**
     * The 222 type
     */
    public static final int VALUE_222_TYPE = 15;

    /**
     * The instance of the 222 type
     */
    public static final DataCellAreaFontCharsetType VALUE_222 = new DataCellAreaFontCharsetType(VALUE_222_TYPE, "222");

    /**
     * The 238 type
     */
    public static final int VALUE_238_TYPE = 16;

    /**
     * The instance of the 238 type
     */
    public static final DataCellAreaFontCharsetType VALUE_238 = new DataCellAreaFontCharsetType(VALUE_238_TYPE, "238");

    /**
     * The 255 type
     */
    public static final int VALUE_255_TYPE = 17;

    /**
     * The instance of the 255 type
     */
    public static final DataCellAreaFontCharsetType VALUE_255 = new DataCellAreaFontCharsetType(VALUE_255_TYPE, "255");

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

    private DataCellAreaFontCharsetType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataCellAreaFontCharsetType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DataCellAreaFontCharsetType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * DataCellAreaFontCharsetType
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
        members.put("0", VALUE_0);
        members.put("1", VALUE_1);
        members.put("2", VALUE_2);
        members.put("77", VALUE_77);
        members.put("128", VALUE_128);
        members.put("129", VALUE_129);
        members.put("130", VALUE_130);
        members.put("134", VALUE_134);
        members.put("136", VALUE_136);
        members.put("161", VALUE_161);
        members.put("162", VALUE_162);
        members.put("163", VALUE_163);
        members.put("178", VALUE_178);
        members.put("186", VALUE_186);
        members.put("204", VALUE_204);
        members.put("222", VALUE_222);
        members.put("238", VALUE_238);
        members.put("255", VALUE_255);
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
     * DataCellAreaFontCharsetType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DataCellAreaFontCharsetType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.DataCellAreaFontCharsetType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DataCellAreaFontCharsetType";
            throw new IllegalArgumentException(err);
        }
        return (DataCellAreaFontCharsetType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.DataCellAreaFontCharsetType valueOf(java.lang.String) 

}
