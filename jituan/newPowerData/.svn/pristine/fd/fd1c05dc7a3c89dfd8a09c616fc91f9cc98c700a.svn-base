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
 * Class PublishLabelLayoutType.
 * 
 * @version $Revision$ $Date$
 */
public class PublishLabelLayoutType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The alHorizontal type
     */
    public static final int ALHORIZONTAL_TYPE = 0;

    /**
     * The instance of the alHorizontal type
     */
    public static final PublishLabelLayoutType ALHORIZONTAL = new PublishLabelLayoutType(ALHORIZONTAL_TYPE, "alHorizontal");

    /**
     * The alVertical type
     */
    public static final int ALVERTICAL_TYPE = 1;

    /**
     * The instance of the alVertical type
     */
    public static final PublishLabelLayoutType ALVERTICAL = new PublishLabelLayoutType(ALVERTICAL_TYPE, "alVertical");

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

    private PublishLabelLayoutType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.PublishLabelLayoutType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of PublishLabelLayoutType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this PublishLabelLayoutType
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
        members.put("alHorizontal", ALHORIZONTAL);
        members.put("alVertical", ALVERTICAL);
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
     * PublishLabelLayoutType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new PublishLabelLayoutType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.PublishLabelLayoutType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PublishLabelLayoutType";
            throw new IllegalArgumentException(err);
        }
        return (PublishLabelLayoutType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.PublishLabelLayoutType valueOf(java.lang.String) 

}
