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

public class PdwPortalLayout implements Serializable {
    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_ID, JDBC Type: 12, Nullable: false, Length: 48, Scale: 0, Identity: false
     */
    private String layoutId;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_NAME, JDBC Type: 12, Nullable: true, Length: 128, Scale: 0, Identity: false
     */
    private String layoutName;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_ROWS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false
     */
    private BigDecimal layoutRows;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_COLUMNS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false
     */
    private BigDecimal layoutColumns;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: REMARK, JDBC Type: 12, Nullable: true, Length: 512, Scale: 0, Identity: false
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_ID, JDBC Type: 12, Nullable: false, Length: 48, Scale: 0, Identity: false��ֵ
     */
    public String getLayoutId() {
        return layoutId;
    }

    /**
     * @param layoutId org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_ID, JDBC Type: 12, Nullable: false, Length: 48, Scale: 0, Identity: false��ֵ
     */
    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_NAME, JDBC Type: 12, Nullable: true, Length: 128, Scale: 0, Identity: false��ֵ
     */
    public String getLayoutName() {
        return layoutName;
    }

    /**
     * @param layoutName org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_NAME, JDBC Type: 12, Nullable: true, Length: 128, Scale: 0, Identity: false��ֵ
     */
    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_ROWS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public BigDecimal getLayoutRows() {
        return layoutRows;
    }

    /**
     * @param layoutRows org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_ROWS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public void setLayoutRows(BigDecimal layoutRows) {
        this.layoutRows = layoutRows;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_COLUMNS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public BigDecimal getLayoutColumns() {
        return layoutColumns;
    }

    /**
     * @param layoutColumns org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: LAYOUT_COLUMNS, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public void setLayoutColumns(BigDecimal layoutColumns) {
        this.layoutColumns = layoutColumns;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: REMARK, JDBC Type: 12, Nullable: true, Length: 512, Scale: 0, Identity: false��ֵ
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@9bf10db.Actual Column Name: REMARK, JDBC Type: 12, Nullable: true, Length: 512, Scale: 0, Identity: false��ֵ
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}