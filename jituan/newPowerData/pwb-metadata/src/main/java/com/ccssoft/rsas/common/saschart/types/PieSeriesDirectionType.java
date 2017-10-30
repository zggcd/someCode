/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.saschart.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class PieSeriesDirectionType.
 * 
 * @version $Revision$ $Date$
 */
public class PieSeriesDirectionType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The dirTopBottom type
     */
    public static final int DIRTOPBOTTOM_TYPE = 0;

    /**
     * The instance of the dirTopBottom type
     */
    public static final PieSeriesDirectionType DIRTOPBOTTOM = new PieSeriesDirectionType(DIRTOPBOTTOM_TYPE, "dirTopBottom");

    /**
     * The dirBottomTop type
     */
    public static final int DIRBOTTOMTOP_TYPE = 1;

    /**
     * The instance of the dirBottomTop type
     */
    public static final PieSeriesDirectionType DIRBOTTOMTOP = new PieSeriesDirectionType(DIRBOTTOMTOP_TYPE, "dirBottomTop");

    /**
     * The dirLeftRight type
     */
    public static final int DIRLEFTRIGHT_TYPE = 2;

    /**
     * The instance of the dirLeftRight type
     */
    public static final PieSeriesDirectionType DIRLEFTRIGHT = new PieSeriesDirectionType(DIRLEFTRIGHT_TYPE, "dirLeftRight");

    /**
     * The dirRightLeft type
     */
    public static final int DIRRIGHTLEFT_TYPE = 3;

    /**
     * The instance of the dirRightLeft type
     */
    public static final PieSeriesDirectionType DIRRIGHTLEFT = new PieSeriesDirectionType(DIRRIGHTLEFT_TYPE, "dirRightLeft");

    /**
     * The dirCenter type
     */
    public static final int DIRCENTER_TYPE = 4;

    /**
     * The instance of the dirCenter type
     */
    public static final PieSeriesDirectionType DIRCENTER = new PieSeriesDirectionType(DIRCENTER_TYPE, "dirCenter");

    /**
     * The dirTopLeft type
     */
    public static final int DIRTOPLEFT_TYPE = 5;

    /**
     * The instance of the dirTopLeft type
     */
    public static final PieSeriesDirectionType DIRTOPLEFT = new PieSeriesDirectionType(DIRTOPLEFT_TYPE, "dirTopLeft");

    /**
     * The dirBottomLeft type
     */
    public static final int DIRBOTTOMLEFT_TYPE = 6;

    /**
     * The instance of the dirBottomLeft type
     */
    public static final PieSeriesDirectionType DIRBOTTOMLEFT = new PieSeriesDirectionType(DIRBOTTOMLEFT_TYPE, "dirBottomLeft");

    /**
     * The dirRadial type
     */
    public static final int DIRRADIAL_TYPE = 7;

    /**
     * The instance of the dirRadial type
     */
    public static final PieSeriesDirectionType DIRRADIAL = new PieSeriesDirectionType(DIRRADIAL_TYPE, "dirRadial");

    /**
     * The dirDiagonalUp type
     */
    public static final int DIRDIAGONALUP_TYPE = 8;

    /**
     * The instance of the dirDiagonalUp type
     */
    public static final PieSeriesDirectionType DIRDIAGONALUP = new PieSeriesDirectionType(DIRDIAGONALUP_TYPE, "dirDiagonalUp");

    /**
     * The dirDiagonalDown type
     */
    public static final int DIRDIAGONALDOWN_TYPE = 9;

    /**
     * The instance of the dirDiagonalDown type
     */
    public static final PieSeriesDirectionType DIRDIAGONALDOWN = new PieSeriesDirectionType(DIRDIAGONALDOWN_TYPE, "dirDiagonalDown");

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

    private PieSeriesDirectionType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.PieSeriesDirectionType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of PieSeriesDirectionType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this PieSeriesDirectionType
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
        members.put("dirTopBottom", DIRTOPBOTTOM);
        members.put("dirBottomTop", DIRBOTTOMTOP);
        members.put("dirLeftRight", DIRLEFTRIGHT);
        members.put("dirRightLeft", DIRRIGHTLEFT);
        members.put("dirCenter", DIRCENTER);
        members.put("dirTopLeft", DIRTOPLEFT);
        members.put("dirBottomLeft", DIRBOTTOMLEFT);
        members.put("dirRadial", DIRRADIAL);
        members.put("dirDiagonalUp", DIRDIAGONALUP);
        members.put("dirDiagonalDown", DIRDIAGONALDOWN);
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
     * PieSeriesDirectionType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new PieSeriesDirectionType based on
     * the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.PieSeriesDirectionType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PieSeriesDirectionType";
            throw new IllegalArgumentException(err);
        }
        return (PieSeriesDirectionType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.PieSeriesDirectionType valueOf(java.lang.String) 

}
