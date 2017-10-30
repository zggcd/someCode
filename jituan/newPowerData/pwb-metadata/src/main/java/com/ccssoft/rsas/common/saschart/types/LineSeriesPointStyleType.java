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
 * Class LineSeriesPointStyleType.
 * 
 * @version $Revision$ $Date$
 */
public class LineSeriesPointStyleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The pntSquare type
     */
    public static final int PNTSQUARE_TYPE = 0;

    /**
     * The instance of the pntSquare type
     */
    public static final LineSeriesPointStyleType PNTSQUARE = new LineSeriesPointStyleType(PNTSQUARE_TYPE, "pntSquare");

    /**
     * The pntCircle type
     */
    public static final int PNTCIRCLE_TYPE = 1;

    /**
     * The instance of the pntCircle type
     */
    public static final LineSeriesPointStyleType PNTCIRCLE = new LineSeriesPointStyleType(PNTCIRCLE_TYPE, "pntCircle");

    /**
     * The pntTriangle type
     */
    public static final int PNTTRIANGLE_TYPE = 2;

    /**
     * The instance of the pntTriangle type
     */
    public static final LineSeriesPointStyleType PNTTRIANGLE = new LineSeriesPointStyleType(PNTTRIANGLE_TYPE, "pntTriangle");

    /**
     * The pntDownTriangle type
     */
    public static final int PNTDOWNTRIANGLE_TYPE = 3;

    /**
     * The instance of the pntDownTriangle type
     */
    public static final LineSeriesPointStyleType PNTDOWNTRIANGLE = new LineSeriesPointStyleType(PNTDOWNTRIANGLE_TYPE, "pntDownTriangle");

    /**
     * The pntCross type
     */
    public static final int PNTCROSS_TYPE = 4;

    /**
     * The instance of the pntCross type
     */
    public static final LineSeriesPointStyleType PNTCROSS = new LineSeriesPointStyleType(PNTCROSS_TYPE, "pntCross");

    /**
     * The pntDiagonalCross type
     */
    public static final int PNTDIAGONALCROSS_TYPE = 5;

    /**
     * The instance of the pntDiagonalCross type
     */
    public static final LineSeriesPointStyleType PNTDIAGONALCROSS = new LineSeriesPointStyleType(PNTDIAGONALCROSS_TYPE, "pntDiagonalCross");

    /**
     * The pntStar type
     */
    public static final int PNTSTAR_TYPE = 6;

    /**
     * The instance of the pntStar type
     */
    public static final LineSeriesPointStyleType PNTSTAR = new LineSeriesPointStyleType(PNTSTAR_TYPE, "pntStar");

    /**
     * The pntDiamond type
     */
    public static final int PNTDIAMOND_TYPE = 7;

    /**
     * The instance of the pntDiamond type
     */
    public static final LineSeriesPointStyleType PNTDIAMOND = new LineSeriesPointStyleType(PNTDIAMOND_TYPE, "pntDiamond");

    /**
     * The pntLeftTriangle type
     */
    public static final int PNTLEFTTRIANGLE_TYPE = 8;

    /**
     * The instance of the pntLeftTriangle type
     */
    public static final LineSeriesPointStyleType PNTLEFTTRIANGLE = new LineSeriesPointStyleType(PNTLEFTTRIANGLE_TYPE, "pntLeftTriangle");

    /**
     * The pntRightTriangle type
     */
    public static final int PNTRIGHTTRIANGLE_TYPE = 9;

    /**
     * The instance of the pntRightTriangle type
     */
    public static final LineSeriesPointStyleType PNTRIGHTTRIANGLE = new LineSeriesPointStyleType(PNTRIGHTTRIANGLE_TYPE, "pntRightTriangle");

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

    private LineSeriesPointStyleType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.regaltec.rsas.common.saschart.types.LineSeriesPointStyleType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of LineSeriesPointStyleType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * LineSeriesPointStyleType
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
        members.put("pntSquare", PNTSQUARE);
        members.put("pntCircle", PNTCIRCLE);
        members.put("pntTriangle", PNTTRIANGLE);
        members.put("pntDownTriangle", PNTDOWNTRIANGLE);
        members.put("pntCross", PNTCROSS);
        members.put("pntDiagonalCross", PNTDIAGONALCROSS);
        members.put("pntStar", PNTSTAR);
        members.put("pntDiamond", PNTDIAMOND);
        members.put("pntLeftTriangle", PNTLEFTTRIANGLE);
        members.put("pntRightTriangle", PNTRIGHTTRIANGLE);
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
     * LineSeriesPointStyleType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new LineSeriesPointStyleType based
     * on the given String value.
     * 
     * @param string
     */
    public static com.ccssoft.rsas.common.saschart.types.LineSeriesPointStyleType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid LineSeriesPointStyleType";
            throw new IllegalArgumentException(err);
        }
        return (LineSeriesPointStyleType) obj;
    } //-- com.regaltec.rsas.common.saschart.types.LineSeriesPointStyleType valueOf(java.lang.String) 

}
