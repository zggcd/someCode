/*
 * <p>����: �й������������ϵͳ��2��</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2016</p>
 * <p>��˾: ��ͨ������Ƽ����޹�˾</p>
 * <p>��ַ:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PdwPortalLayoutPanel implements Serializable {
    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_ID, JDBC Type: 12, Nullable: false, Length: 48, Scale: 0, Identity: false
     */
    private String panelId;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: LAYOUT_ID, JDBC Type: 12, Nullable: true, Length: 48, Scale: 0, Identity: false
     */
    private String layoutId;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_NAME, JDBC Type: 12, Nullable: true, Length: 128, Scale: 0, Identity: false
     */
    private String panelName;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_ROW, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false
     */
    private BigDecimal panelRow;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_COLSPNS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false
     */
    private BigDecimal panelColspns;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_ROWSPNS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false
     */
    private BigDecimal panelRowspns;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: REMARK, JDBC Type: 12, Nullable: true, Length: 512, Scale: 0, Identity: false
     */
    private String remark;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_INDEX, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false
     */
    private BigDecimal panelIndex;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_WIDTH, JDBC Type: 12, Nullable: true, Length: 10, Scale: 0, Identity: false
     */
    private String panelWidth;

    private static final long serialVersionUID = 1L;

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_ID, JDBC Type: 12, Nullable: false, Length: 48, Scale: 0, Identity: false��ֵ
     */
    public String getPanelId() {
        return panelId;
    }

    /**
     * @param panelId org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_ID, JDBC Type: 12, Nullable: false, Length: 48, Scale: 0, Identity: false��ֵ
     */
    public void setPanelId(String panelId) {
        this.panelId = panelId;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: LAYOUT_ID, JDBC Type: 12, Nullable: true, Length: 48, Scale: 0, Identity: false��ֵ
     */
    public String getLayoutId() {
        return layoutId;
    }

    /**
     * @param layoutId org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: LAYOUT_ID, JDBC Type: 12, Nullable: true, Length: 48, Scale: 0, Identity: false��ֵ
     */
    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_NAME, JDBC Type: 12, Nullable: true, Length: 128, Scale: 0, Identity: false��ֵ
     */
    public String getPanelName() {
        return panelName;
    }

    /**
     * @param panelName org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_NAME, JDBC Type: 12, Nullable: true, Length: 128, Scale: 0, Identity: false��ֵ
     */
    public void setPanelName(String panelName) {
        this.panelName = panelName;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_ROW, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public BigDecimal getPanelRow() {
        return panelRow;
    }

    /**
     * @param panelRow org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_ROW, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public void setPanelRow(BigDecimal panelRow) {
        this.panelRow = panelRow;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_COLSPNS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public BigDecimal getPanelColspns() {
        return panelColspns;
    }

    /**
     * @param panelColspns org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_COLSPNS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public void setPanelColspns(BigDecimal panelColspns) {
        this.panelColspns = panelColspns;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_ROWSPNS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public BigDecimal getPanelRowspns() {
        return panelRowspns;
    }

    /**
     * @param panelRowspns org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_ROWSPNS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public void setPanelRowspns(BigDecimal panelRowspns) {
        this.panelRowspns = panelRowspns;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: REMARK, JDBC Type: 12, Nullable: true, Length: 512, Scale: 0, Identity: false��ֵ
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: REMARK, JDBC Type: 12, Nullable: true, Length: 512, Scale: 0, Identity: false��ֵ
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_INDEX, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public BigDecimal getPanelIndex() {
        return panelIndex;
    }

    /**
     * @param panelIndex org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_INDEX, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public void setPanelIndex(BigDecimal panelIndex) {
        this.panelIndex = panelIndex;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_WIDTH, JDBC Type: 12, Nullable: true, Length: 10, Scale: 0, Identity: false��ֵ
     */
    public String getPanelWidth() {
        return panelWidth;
    }

    /**
     * @param panelWidth org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@38e32483.Actual Column Name: PANEL_WIDTH, JDBC Type: 12, Nullable: true, Length: 10, Scale: 0, Identity: false��ֵ
     */
    public void setPanelWidth(String panelWidth) {
        this.panelWidth = panelWidth;
    }
}