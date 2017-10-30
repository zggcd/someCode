/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.model;

import com.ccssoft.mybatis.generater.plugin.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PdwPortalPortletRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    /**
     * <p>PdwPortalPortletRelationExample由代码生成器创建。</p>
     */
    public PdwPortalPortletRelationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * <p>setOrderByClause由代码生成器创建。</p>
     * @param orderByClause orderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * <p>getOrderByClause由代码生成器创建。</p>
     * @return String
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * <p>setDistinct由代码生成器创建。</p>
     * @param distinct distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * <p>isDistinct由代码生成器创建。</p>
     * @return boolean
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * <p>getOredCriteria由代码生成器创建。</p>
     * @return List<Criteria>
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * <p>or由代码生成器创建。</p>
     * @param criteria criteria
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * <p>or由代码生成器创建。</p>
     * @return Criteria
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * <p>createCriteria由代码生成器创建。</p>
     * @return Criteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * <p>createCriteriaInternal由代码生成器创建。</p>
     * @return Criteria
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * <p>clear由代码生成器创建。</p>
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * <p>setPage由代码生成器创建。</p>
     * @param page page
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * <p>getPage由代码生成器创建。</p>
     * @return Page
     */
    public Page getPage() {
        return page;
    }

    /**
     * <p>通过面向对象化的设计，将PdwPortalPortletRelationMapper.xml的数据查询条件封装为一个查询条件对象。</p>
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andInstanceIdIsNull() {
            addCriterion("INSTANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIsNotNull() {
            addCriterion("INSTANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceIdEqualTo(String value) {
            addCriterion("INSTANCE_ID =", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotEqualTo(String value) {
            addCriterion("INSTANCE_ID <>", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThan(String value) {
            addCriterion("INSTANCE_ID >", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCE_ID >=", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThan(String value) {
            addCriterion("INSTANCE_ID <", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("INSTANCE_ID <=", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLike(String value) {
            addCriterion("INSTANCE_ID like", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotLike(String value) {
            addCriterion("INSTANCE_ID not like", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIn(List<String> values) {
            addCriterion("INSTANCE_ID in", values, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotIn(List<String> values) {
            addCriterion("INSTANCE_ID not in", values, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdBetween(String value1, String value2) {
            addCriterion("INSTANCE_ID between", value1, value2, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotBetween(String value1, String value2) {
            addCriterion("INSTANCE_ID not between", value1, value2, "instanceId");
            return (Criteria) this;
        }

        public Criteria andPanelIdIsNull() {
            addCriterion("PANEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPanelIdIsNotNull() {
            addCriterion("PANEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPanelIdEqualTo(String value) {
            addCriterion("PANEL_ID =", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotEqualTo(String value) {
            addCriterion("PANEL_ID <>", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdGreaterThan(String value) {
            addCriterion("PANEL_ID >", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdGreaterThanOrEqualTo(String value) {
            addCriterion("PANEL_ID >=", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLessThan(String value) {
            addCriterion("PANEL_ID <", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLessThanOrEqualTo(String value) {
            addCriterion("PANEL_ID <=", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLike(String value) {
            addCriterion("PANEL_ID like", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotLike(String value) {
            addCriterion("PANEL_ID not like", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdIn(List<String> values) {
            addCriterion("PANEL_ID in", values, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotIn(List<String> values) {
            addCriterion("PANEL_ID not in", values, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdBetween(String value1, String value2) {
            addCriterion("PANEL_ID between", value1, value2, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotBetween(String value1, String value2) {
            addCriterion("PANEL_ID not between", value1, value2, "panelId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdIsNull() {
            addCriterion("PORTLET_INSTANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdIsNotNull() {
            addCriterion("PORTLET_INSTANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdEqualTo(String value) {
            addCriterion("PORTLET_INSTANCE_ID =", value, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdNotEqualTo(String value) {
            addCriterion("PORTLET_INSTANCE_ID <>", value, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdGreaterThan(String value) {
            addCriterion("PORTLET_INSTANCE_ID >", value, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("PORTLET_INSTANCE_ID >=", value, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdLessThan(String value) {
            addCriterion("PORTLET_INSTANCE_ID <", value, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("PORTLET_INSTANCE_ID <=", value, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdLike(String value) {
            addCriterion("PORTLET_INSTANCE_ID like", value, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdNotLike(String value) {
            addCriterion("PORTLET_INSTANCE_ID not like", value, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdIn(List<String> values) {
            addCriterion("PORTLET_INSTANCE_ID in", values, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdNotIn(List<String> values) {
            addCriterion("PORTLET_INSTANCE_ID not in", values, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdBetween(String value1, String value2) {
            addCriterion("PORTLET_INSTANCE_ID between", value1, value2, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortletInstanceIdNotBetween(String value1, String value2) {
            addCriterion("PORTLET_INSTANCE_ID not between", value1, value2, "portletInstanceId");
            return (Criteria) this;
        }

        public Criteria andPortalOrderIsNull() {
            addCriterion("PORTAL_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andPortalOrderIsNotNull() {
            addCriterion("PORTAL_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andPortalOrderEqualTo(BigDecimal value) {
            addCriterion("PORTAL_ORDER =", value, "portalOrder");
            return (Criteria) this;
        }

        public Criteria andPortalOrderNotEqualTo(BigDecimal value) {
            addCriterion("PORTAL_ORDER <>", value, "portalOrder");
            return (Criteria) this;
        }

        public Criteria andPortalOrderGreaterThan(BigDecimal value) {
            addCriterion("PORTAL_ORDER >", value, "portalOrder");
            return (Criteria) this;
        }

        public Criteria andPortalOrderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PORTAL_ORDER >=", value, "portalOrder");
            return (Criteria) this;
        }

        public Criteria andPortalOrderLessThan(BigDecimal value) {
            addCriterion("PORTAL_ORDER <", value, "portalOrder");
            return (Criteria) this;
        }

        public Criteria andPortalOrderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PORTAL_ORDER <=", value, "portalOrder");
            return (Criteria) this;
        }

        public Criteria andPortalOrderIn(List<BigDecimal> values) {
            addCriterion("PORTAL_ORDER in", values, "portalOrder");
            return (Criteria) this;
        }

        public Criteria andPortalOrderNotIn(List<BigDecimal> values) {
            addCriterion("PORTAL_ORDER not in", values, "portalOrder");
            return (Criteria) this;
        }

        public Criteria andPortalOrderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORTAL_ORDER between", value1, value2, "portalOrder");
            return (Criteria) this;
        }

        public Criteria andPortalOrderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORTAL_ORDER not between", value1, value2, "portalOrder");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andInstanceIdLikeInsensitive(String value) {
            addCriterion("upper(INSTANCE_ID) like", value.toUpperCase(), "instanceId");
            return this;
        }

        public Criteria andPanelIdLikeInsensitive(String value) {
            addCriterion("upper(PANEL_ID) like", value.toUpperCase(), "panelId");
            return this;
        }

        public Criteria andPortletInstanceIdLikeInsensitive(String value) {
            addCriterion("upper(PORTLET_INSTANCE_ID) like", value.toUpperCase(), "portletInstanceId");
            return this;
        }
    }

    /**
     * <p>通过面向对象化的设计，将PdwPortalPortletRelationMapper.xml的数据查询条件封装为一个查询条件对象。</p>
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}