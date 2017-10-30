/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
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
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@751dfb70.Actual Column Name: PORTAL_ORDER, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false的值
     */
    public BigDecimal getPortalOrder() {
        return portalOrder;
    }

    /**
     * @param portalOrder org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@751dfb70.Actual Column Name: PORTAL_ORDER, JDBC Type: 3, Nullable: true, Length: 0, Scale: -127, Identity: false的值
     */
    public void setPortalOrder(BigDecimal portalOrder) {
        this.portalOrder = portalOrder;
    }
}