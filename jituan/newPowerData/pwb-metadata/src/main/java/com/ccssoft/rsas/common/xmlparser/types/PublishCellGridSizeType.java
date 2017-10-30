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
 * Class PublishCellGridSizeType.
 * 
 * @version $Revision$ $Date$
 */
public class PublishCellGridSizeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The cllDelicate type
     */
    public static final int CLLDELICATE_TYPE = 0;

    /**
     * The instance of the cllDelicate type
     */
    public static final PublishCellGridSizeType CLLDELICATE = new PublishCellGridSizeType(CLLDELICATE_TYPE, "cllDelicate");

    /**
     * The cllStandard type
     */
    public static final int CLLSTANDARD_TYPE = 1;

    /**
     * The instance of the cllStandard type
     */
    public static final PublishCellGridSizeType CLLSTANDARD = new PublishCellGridSizeType(CLLSTANDARD_TYPE, "cllStandard");

    /**
     * The cllRough type
     */
    public static final int CLLROUGH_TYPE = 2;

    /**
     * The instance of the cllRough type
     */
    public static final PublishCellGridSizeType CLLROUGH = new PublishCellGridSizeType(CLLROUGH_TYPE, "cllRough");

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

    private PublishCellGridSizeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.PublishCellGridSizeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of PublishCellGridSizeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this PublishCellGridSizeTyp
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
        members.put("cllDelicate", CLLDELICATE);
        members.put("cllStandard", CLLSTANDARD);
        members.put("cllRough", CLLROUGH);
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
     * PublishCellGridSizeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new PublishCellGridSizeType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.PublishCellGridSizeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PublishCellGridSizeType";
            throw new IllegalArgumentException(err);
        }
        return (PublishCellGridSizeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.PublishCellGridSizeType valueOf(java.lang.String) 

}
