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

public class PdwPortletInstanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    /**
     * <p>PdwPortletInstanceExample由代码生成器创建。</p>
     */
    public PdwPortletInstanceExample() {
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
     * <p>通过面向对象化的设计，将PdwPortletInstanceMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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

        public Criteria andInstanceNameIsNull() {
            addCriterion("INSTANCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInstanceNameIsNotNull() {
            addCriterion("INSTANCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceNameEqualTo(String value) {
            addCriterion("INSTANCE_NAME =", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotEqualTo(String value) {
            addCriterion("INSTANCE_NAME <>", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameGreaterThan(String value) {
            addCriterion("INSTANCE_NAME >", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCE_NAME >=", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameLessThan(String value) {
            addCriterion("INSTANCE_NAME <", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameLessThanOrEqualTo(String value) {
            addCriterion("INSTANCE_NAME <=", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameLike(String value) {
            addCriterion("INSTANCE_NAME like", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotLike(String value) {
            addCriterion("INSTANCE_NAME not like", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameIn(List<String> values) {
            addCriterion("INSTANCE_NAME in", values, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotIn(List<String> values) {
            addCriterion("INSTANCE_NAME not in", values, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameBetween(String value1, String value2) {
            addCriterion("INSTANCE_NAME between", value1, value2, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotBetween(String value1, String value2) {
            addCriterion("INSTANCE_NAME not between", value1, value2, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeIsNull() {
            addCriterion("INSTANCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeIsNotNull() {
            addCriterion("INSTANCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeEqualTo(String value) {
            addCriterion("INSTANCE_TYPE =", value, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeNotEqualTo(String value) {
            addCriterion("INSTANCE_TYPE <>", value, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeGreaterThan(String value) {
            addCriterion("INSTANCE_TYPE >", value, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCE_TYPE >=", value, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeLessThan(String value) {
            addCriterion("INSTANCE_TYPE <", value, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeLessThanOrEqualTo(String value) {
            addCriterion("INSTANCE_TYPE <=", value, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeLike(String value) {
            addCriterion("INSTANCE_TYPE like", value, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeNotLike(String value) {
            addCriterion("INSTANCE_TYPE not like", value, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeIn(List<String> values) {
            addCriterion("INSTANCE_TYPE in", values, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeNotIn(List<String> values) {
            addCriterion("INSTANCE_TYPE not in", values, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeBetween(String value1, String value2) {
            addCriterion("INSTANCE_TYPE between", value1, value2, "instanceType");
            return (Criteria) this;
        }

        public Criteria andInstanceTypeNotBetween(String value1, String value2) {
            addCriterion("INSTANCE_TYPE not between", value1, value2, "instanceType");
            return (Criteria) this;
        }

        public Criteria andIframeUrlIsNull() {
            addCriterion("IFRAME_URL is null");
            return (Criteria) this;
        }

        public Criteria andIframeUrlIsNotNull() {
            addCriterion("IFRAME_URL is not null");
            return (Criteria) this;
        }

        public Criteria andIframeUrlEqualTo(String value) {
            addCriterion("IFRAME_URL =", value, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlNotEqualTo(String value) {
            addCriterion("IFRAME_URL <>", value, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlGreaterThan(String value) {
            addCriterion("IFRAME_URL >", value, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IFRAME_URL >=", value, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlLessThan(String value) {
            addCriterion("IFRAME_URL <", value, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlLessThanOrEqualTo(String value) {
            addCriterion("IFRAME_URL <=", value, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlLike(String value) {
            addCriterion("IFRAME_URL like", value, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlNotLike(String value) {
            addCriterion("IFRAME_URL not like", value, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlIn(List<String> values) {
            addCriterion("IFRAME_URL in", values, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlNotIn(List<String> values) {
            addCriterion("IFRAME_URL not in", values, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlBetween(String value1, String value2) {
            addCriterion("IFRAME_URL between", value1, value2, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andIframeUrlNotBetween(String value1, String value2) {
            addCriterion("IFRAME_URL not between", value1, value2, "iframeUrl");
            return (Criteria) this;
        }

        public Criteria andEchartTypeIsNull() {
            addCriterion("ECHART_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEchartTypeIsNotNull() {
            addCriterion("ECHART_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEchartTypeEqualTo(String value) {
            addCriterion("ECHART_TYPE =", value, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeNotEqualTo(String value) {
            addCriterion("ECHART_TYPE <>", value, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeGreaterThan(String value) {
            addCriterion("ECHART_TYPE >", value, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ECHART_TYPE >=", value, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeLessThan(String value) {
            addCriterion("ECHART_TYPE <", value, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeLessThanOrEqualTo(String value) {
            addCriterion("ECHART_TYPE <=", value, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeLike(String value) {
            addCriterion("ECHART_TYPE like", value, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeNotLike(String value) {
            addCriterion("ECHART_TYPE not like", value, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeIn(List<String> values) {
            addCriterion("ECHART_TYPE in", values, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeNotIn(List<String> values) {
            addCriterion("ECHART_TYPE not in", values, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeBetween(String value1, String value2) {
            addCriterion("ECHART_TYPE between", value1, value2, "echartType");
            return (Criteria) this;
        }

        public Criteria andEchartTypeNotBetween(String value1, String value2) {
            addCriterion("ECHART_TYPE not between", value1, value2, "echartType");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("HEIGHT =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("HEIGHT <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("HEIGHT >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHT >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("HEIGHT <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHT <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("HEIGHT in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("HEIGHT not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHT between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHT not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(BigDecimal value) {
            addCriterion("WIDTH =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(BigDecimal value) {
            addCriterion("WIDTH <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(BigDecimal value) {
            addCriterion("WIDTH >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDTH >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(BigDecimal value) {
            addCriterion("WIDTH <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDTH <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<BigDecimal> values) {
            addCriterion("WIDTH in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<BigDecimal> values) {
            addCriterion("WIDTH not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDTH between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDTH not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andBorderIsNull() {
            addCriterion("BORDER is null");
            return (Criteria) this;
        }

        public Criteria andBorderIsNotNull() {
            addCriterion("BORDER is not null");
            return (Criteria) this;
        }

        public Criteria andBorderEqualTo(BigDecimal value) {
            addCriterion("BORDER =", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderNotEqualTo(BigDecimal value) {
            addCriterion("BORDER <>", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderGreaterThan(BigDecimal value) {
            addCriterion("BORDER >", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BORDER >=", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderLessThan(BigDecimal value) {
            addCriterion("BORDER <", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BORDER <=", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderIn(List<BigDecimal> values) {
            addCriterion("BORDER in", values, "border");
            return (Criteria) this;
        }

        public Criteria andBorderNotIn(List<BigDecimal> values) {
            addCriterion("BORDER not in", values, "border");
            return (Criteria) this;
        }

        public Criteria andBorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BORDER between", value1, value2, "border");
            return (Criteria) this;
        }

        public Criteria andBorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BORDER not between", value1, value2, "border");
            return (Criteria) this;
        }

        public Criteria andChartIdIsNull() {
            addCriterion("CHART_ID is null");
            return (Criteria) this;
        }

        public Criteria andChartIdIsNotNull() {
            addCriterion("CHART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChartIdEqualTo(String value) {
            addCriterion("CHART_ID =", value, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdNotEqualTo(String value) {
            addCriterion("CHART_ID <>", value, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdGreaterThan(String value) {
            addCriterion("CHART_ID >", value, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHART_ID >=", value, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdLessThan(String value) {
            addCriterion("CHART_ID <", value, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdLessThanOrEqualTo(String value) {
            addCriterion("CHART_ID <=", value, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdLike(String value) {
            addCriterion("CHART_ID like", value, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdNotLike(String value) {
            addCriterion("CHART_ID not like", value, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdIn(List<String> values) {
            addCriterion("CHART_ID in", values, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdNotIn(List<String> values) {
            addCriterion("CHART_ID not in", values, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdBetween(String value1, String value2) {
            addCriterion("CHART_ID between", value1, value2, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartIdNotBetween(String value1, String value2) {
            addCriterion("CHART_ID not between", value1, value2, "chartId");
            return (Criteria) this;
        }

        public Criteria andChartNameIsNull() {
            addCriterion("CHART_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChartNameIsNotNull() {
            addCriterion("CHART_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChartNameEqualTo(String value) {
            addCriterion("CHART_NAME =", value, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameNotEqualTo(String value) {
            addCriterion("CHART_NAME <>", value, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameGreaterThan(String value) {
            addCriterion("CHART_NAME >", value, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHART_NAME >=", value, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameLessThan(String value) {
            addCriterion("CHART_NAME <", value, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameLessThanOrEqualTo(String value) {
            addCriterion("CHART_NAME <=", value, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameLike(String value) {
            addCriterion("CHART_NAME like", value, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameNotLike(String value) {
            addCriterion("CHART_NAME not like", value, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameIn(List<String> values) {
            addCriterion("CHART_NAME in", values, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameNotIn(List<String> values) {
            addCriterion("CHART_NAME not in", values, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameBetween(String value1, String value2) {
            addCriterion("CHART_NAME between", value1, value2, "chartName");
            return (Criteria) this;
        }

        public Criteria andChartNameNotBetween(String value1, String value2) {
            addCriterion("CHART_NAME not between", value1, value2, "chartName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andPortletInstanceIdLikeInsensitive(String value) {
            addCriterion("upper(PORTLET_INSTANCE_ID) like", value.toUpperCase(), "portletInstanceId");
            return this;
        }

        public Criteria andInstanceNameLikeInsensitive(String value) {
            addCriterion("upper(INSTANCE_NAME) like", value.toUpperCase(), "instanceName");
            return this;
        }

        public Criteria andInstanceTypeLikeInsensitive(String value) {
            addCriterion("upper(INSTANCE_TYPE) like", value.toUpperCase(), "instanceType");
            return this;
        }

        public Criteria andIframeUrlLikeInsensitive(String value) {
            addCriterion("upper(IFRAME_URL) like", value.toUpperCase(), "iframeUrl");
            return this;
        }

        public Criteria andEchartTypeLikeInsensitive(String value) {
            addCriterion("upper(ECHART_TYPE) like", value.toUpperCase(), "echartType");
            return this;
        }

        public Criteria andChartIdLikeInsensitive(String value) {
            addCriterion("upper(CHART_ID) like", value.toUpperCase(), "chartId");
            return this;
        }

        public Criteria andChartNameLikeInsensitive(String value) {
            addCriterion("upper(CHART_NAME) like", value.toUpperCase(), "chartName");
            return this;
        }
    }

    /**
     * <p>通过面向对象化的设计，将PdwPortletInstanceMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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