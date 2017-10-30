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
 * Class MenuItemElementRightControlTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class MenuItemElementRightControlTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The rctVisible type
     */
    public static final int RCTVISIBLE_TYPE = 0;

    /**
     * The instance of the rctVisible type
     */
    public static final MenuItemElementRightControlTypeType RCTVISIBLE = new MenuItemElementRightControlTypeType(RCTVISIBLE_TYPE, "rctVisible");

    /**
     * The rctEnable type
     */
    public static final int RCTENABLE_TYPE = 1;

    /**
     * The instance of the rctEnable type
     */
    public static final MenuItemElementRightControlTypeType RCTENABLE = new MenuItemElementRightControlTypeType(RCTENABLE_TYPE, "rctEnable");

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

    private MenuItemElementRightControlTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.xmlparser.types.MenuItemElementRightControlTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of MenuItemElementRightControlTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * MenuItemElementRightControlTypeType
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
        members.put("rctVisible", RCTVISIBLE);
        members.put("rctEnable", RCTENABLE);
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
     * MenuItemElementRightControlTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new
     * MenuItemElementRightControlTypeType based on the given
     * String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.xmlparser.types.MenuItemElementRightControlTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MenuItemElementRightControlTypeType";
            throw new IllegalArgumentException(err);
        }
        return (MenuItemElementRightControlTypeType) obj;
    } //-- com.regaltec.rsas.common.xmlparser.types.MenuItemElementRightControlTypeType valueOf(java.lang.String) 

}
