/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.ccssoft.rsas.common.xmlparser;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class DataBand.
 * 
 * @version $Revision$ $Date$
 */
public class DataBand implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _gridLineColor
     */
    private int _gridLineColor;

    /**
     * keeps track of state for field: _gridLineColor
     */
    private boolean _has_gridLineColor;

    /**
     * Field _showGrid
     */
    private byte _showGrid;

    /**
     * keeps track of state for field: _showGrid
     */
    private boolean _has_showGrid;

    /**
     * �����б���
     */
    private com.ccssoft.rsas.common.xmlparser.ColumnHeader _columnHeader;

    /**
     * ���������������ݸ�ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.HeaderArea _headerArea;

    /**
     * �������ݵ���ʾ��ʽ
     */
    private com.ccssoft.rsas.common.xmlparser.DataCellArea _dataCellArea;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataBand() {
        super();
    } //-- com.regaltec.rsas.common.xmlparser.DataBand()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteGridLineColor
     */
    public void deleteGridLineColor()
    {
        this._has_gridLineColor= false;
    } //-- void deleteGridLineColor() 

    /**
     * Method deleteShowGrid
     */
    public void deleteShowGrid()
    {
        this._has_showGrid= false;
    } //-- void deleteShowGrid() 

    /**
     * Returns the value of field 'columnHeader'. The field
     * 'columnHeader' has the following description: �����б���
     * 
     * @return the value of field 'columnHeader'.
     */
    public com.ccssoft.rsas.common.xmlparser.ColumnHeader getColumnHeader()
    {
        return this._columnHeader;
    } //-- com.regaltec.rsas.common.xmlparser.ColumnHeader getColumnHeader() 

    /**
     * Returns the value of field 'dataCellArea'. The field
     * 'dataCellArea' has the following description: �������ݵ���ʾ��ʽ
     * 
     * @return the value of field 'dataCellArea'.
     */
    public com.ccssoft.rsas.common.xmlparser.DataCellArea getDataCellArea()
    {
        return this._dataCellArea;
    } //-- com.regaltec.rsas.common.xmlparser.DataCellArea getDataCellArea() 

    /**
     * Returns the value of field 'gridLineColor'.
     * 
     * @return the value of field 'gridLineColor'.
     */
    public int getGridLineColor()
    {
        return this._gridLineColor;
    } //-- int getGridLineColor() 

    /**
     * Returns the value of field 'headerArea'. The field
     * 'headerArea' has the following description: ���������������ݸ�ʽ
     * 
     * @return the value of field 'headerArea'.
     */
    public com.ccssoft.rsas.common.xmlparser.HeaderArea getHeaderArea()
    {
        return this._headerArea;
    } //-- com.regaltec.rsas.common.xmlparser.HeaderArea getHeaderArea() 

    /**
     * Returns the value of field 'showGrid'.
     * 
     * @return the value of field 'showGrid'.
     */
    public byte getShowGrid()
    {
        return this._showGrid;
    } //-- byte getShowGrid() 

    /**
     * Method hasGridLineColor
     */
    public boolean hasGridLineColor()
    {
        return this._has_gridLineColor;
    } //-- boolean hasGridLineColor() 

    /**
     * Method hasShowGrid
     */
    public boolean hasShowGrid()
    {
        return this._has_showGrid;
    } //-- boolean hasShowGrid() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'columnHeader'. The field
     * 'columnHeader' has the following description: �����б���
     * 
     * @param columnHeader the value of field 'columnHeader'.
     */
    public void setColumnHeader(com.ccssoft.rsas.common.xmlparser.ColumnHeader columnHeader)
    {
        this._columnHeader = columnHeader;
    } //-- void setColumnHeader(com.regaltec.rsas.common.xmlparser.ColumnHeader) 

    /**
     * Sets the value of field 'dataCellArea'. The field
     * 'dataCellArea' has the following description: �������ݵ���ʾ��ʽ
     * 
     * @param dataCellArea the value of field 'dataCellArea'.
     */
    public void setDataCellArea(com.ccssoft.rsas.common.xmlparser.DataCellArea dataCellArea)
    {
        this._dataCellArea = dataCellArea;
    } //-- void setDataCellArea(com.regaltec.rsas.common.xmlparser.DataCellArea) 

    /**
     * Sets the value of field 'gridLineColor'.
     * 
     * @param gridLineColor the value of field 'gridLineColor'.
     */
    public void setGridLineColor(int gridLineColor)
    {
        this._gridLineColor = gridLineColor;
        this._has_gridLineColor = true;
    } //-- void setGridLineColor(int) 

    /**
     * Sets the value of field 'headerArea'. The field 'headerArea'
     * has the following description: ���������������ݸ�ʽ
     * 
     * @param headerArea the value of field 'headerArea'.
     */
    public void setHeaderArea(com.ccssoft.rsas.common.xmlparser.HeaderArea headerArea)
    {
        this._headerArea = headerArea;
    } //-- void setHeaderArea(com.regaltec.rsas.common.xmlparser.HeaderArea) 

    /**
     * Sets the value of field 'showGrid'.
     * 
     * @param showGrid the value of field 'showGrid'.
     */
    public void setShowGrid(byte showGrid)
    {
        this._showGrid = showGrid;
        this._has_showGrid = true;
    } //-- void setShowGrid(byte) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.ccssoft.rsas.common.xmlparser.DataBand) Unmarshaller.unmarshal(com.ccssoft.rsas.common.xmlparser.DataBand.class, reader);
    } //-- java.lang.Object unmarshal(java.io.Reader) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
