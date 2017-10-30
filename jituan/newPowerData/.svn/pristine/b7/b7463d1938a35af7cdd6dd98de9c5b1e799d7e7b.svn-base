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
 * Class PublishPageLayoutType.
 * 
 * @version $Revision$ $Date$
 */
public class PublishPageLayoutType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The alEmbed type
     */
    public static final int ALEMBED_TYPE = 0;

    /**
     * The instance of the alEmbed type
     */
    public static final PublishPageLayoutType ALEMBED = new PublishPageLayoutType(ALEMBED_TYPE, "alEmbed");

    /**
     * The alTopBottom type
     */
    public static final int ALTOPBOTTOM_TYPE = 1;

    /**
     * The instance of the alTopBottom type
     */
    public static final PublishPageLayoutType ALTOPBOTTOM = new PublishPageLayoutType(ALTOPBOTTOM_TYPE, "alTopBottom");

    /**
     * The alLeftRight type
     */
    public static final int ALLEFTRIGHT_TYPE = 2;

    /**
     * The instance of the alLeftRight type
     */
    public static final PublishPageLayoutType ALLEFTRIGHT = new PublishPageLayoutType(ALLEFTRIGHT_TYPE, "alLeftRight");

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

    private PublishPageLayoutType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.PublishPageLayoutType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of PublishPageLayoutType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this PublishPageLayoutType
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
        members.put("alEmbed", ALEMBED);
        members.put("alTopBottom", ALTOPBOTTOM);
        members.put("alLeftRight", ALLEFTRIGHT);
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
     * PublishPageLayoutType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new PublishPageLayoutType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.PublishPageLayoutType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PublishPageLayoutType";
            throw new IllegalArgumentException(err);
        }
        return (PublishPageLayoutType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.PublishPageLayoutType valueOf(java.lang.String) 

}
