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

public class PdwPortalPortletRelation extends PdwPortalPortletRelationKey implements Serializable {
    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@751dfb70.Actual Column Name: PORTAL_ORDER, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false
     */
    private BigDecimal portalOrder;

    private static final long serialVersionUID = 1L;

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@751dfb70.Actual Column Name: PORTAL_ORDER, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public BigDecimal getPortalOrder() {
        return portalOrder;
    }

    /**
     * @param portalOrder org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@751dfb70.Actual Column Name: PORTAL_ORDER, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false��ֵ
     */
    public void setPortalOrder(BigDecimal portalOrder) {
        this.portalOrder = portalOrder;
    }
}