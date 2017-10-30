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

public class PdwPortalLayoutPanelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    /**
     * <p>PdwPortalLayoutPanelExample由代码生成器创建。</p>
     */
    public PdwPortalLayoutPanelExample() {
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
     * <p>通过面向对象化的设计，将PdwPortalLayoutPanelMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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

        public Criteria andLayoutIdIsNull() {
            addCriterion("LAYOUT_ID is null");
            return (Criteria) this;
        }

        public Criteria andLayoutIdIsNotNull() {
            addCriterion("LAYOUT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutIdEqualTo(String value) {
            addCriterion("LAYOUT_ID =", value, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdNotEqualTo(String value) {
            addCriterion("LAYOUT_ID <>", value, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdGreaterThan(String value) {
            addCriterion("LAYOUT_ID >", value, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdGreaterThanOrEqualTo(String value) {
            addCriterion("LAYOUT_ID >=", value, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdLessThan(String value) {
            addCriterion("LAYOUT_ID <", value, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdLessThanOrEqualTo(String value) {
            addCriterion("LAYOUT_ID <=", value, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdLike(String value) {
            addCriterion("LAYOUT_ID like", value, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdNotLike(String value) {
            addCriterion("LAYOUT_ID not like", value, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdIn(List<String> values) {
            addCriterion("LAYOUT_ID in", values, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdNotIn(List<String> values) {
            addCriterion("LAYOUT_ID not in", values, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdBetween(String value1, String value2) {
            addCriterion("LAYOUT_ID between", value1, value2, "layoutId");
            return (Criteria) this;
        }

        public Criteria andLayoutIdNotBetween(String value1, String value2) {
            addCriterion("LAYOUT_ID not between", value1, value2, "layoutId");
            return (Criteria) this;
        }

        public Criteria andPanelNameIsNull() {
            addCriterion("PANEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPanelNameIsNotNull() {
            addCriterion("PANEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPanelNameEqualTo(String value) {
            addCriterion("PANEL_NAME =", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameNotEqualTo(String value) {
            addCriterion("PANEL_NAME <>", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameGreaterThan(String value) {
            addCriterion("PANEL_NAME >", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameGreaterThanOrEqualTo(String value) {
            addCriterion("PANEL_NAME >=", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameLessThan(String value) {
            addCriterion("PANEL_NAME <", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameLessThanOrEqualTo(String value) {
            addCriterion("PANEL_NAME <=", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameLike(String value) {
            addCriterion("PANEL_NAME like", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameNotLike(String value) {
            addCriterion("PANEL_NAME not like", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameIn(List<String> values) {
            addCriterion("PANEL_NAME in", values, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameNotIn(List<String> values) {
            addCriterion("PANEL_NAME not in", values, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameBetween(String value1, String value2) {
            addCriterion("PANEL_NAME between", value1, value2, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameNotBetween(String value1, String value2) {
            addCriterion("PANEL_NAME not between", value1, value2, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelRowIsNull() {
            addCriterion("PANEL_ROW is null");
            return (Criteria) this;
        }

        public Criteria andPanelRowIsNotNull() {
            addCriterion("PANEL_ROW is not null");
            return (Criteria) this;
        }

        public Criteria andPanelRowEqualTo(BigDecimal value) {
            addCriterion("PANEL_ROW =", value, "panelRow");
            return (Criteria) this;
        }

        public Criteria andPanelRowNotEqualTo(BigDecimal value) {
            addCriterion("PANEL_ROW <>", value, "panelRow");
            return (Criteria) this;
        }

        public Criteria andPanelRowGreaterThan(BigDecimal value) {
            addCriterion("PANEL_ROW >", value, "panelRow");
            return (Criteria) this;
        }

        public Criteria andPanelRowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PANEL_ROW >=", value, "panelRow");
            return (Criteria) this;
        }

        public Criteria andPanelRowLessThan(BigDecimal value) {
            addCriterion("PANEL_ROW <", value, "panelRow");
            return (Criteria) this;
        }

        public Criteria andPanelRowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PANEL_ROW <=", value, "panelRow");
            return (Criteria) this;
        }

        public Criteria andPanelRowIn(List<BigDecimal> values) {
            addCriterion("PANEL_ROW in", values, "panelRow");
            return (Criteria) this;
        }

        public Criteria andPanelRowNotIn(List<BigDecimal> values) {
            addCriterion("PANEL_ROW not in", values, "panelRow");
            return (Criteria) this;
        }

        public Criteria andPanelRowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PANEL_ROW between", value1, value2, "panelRow");
            return (Criteria) this;
        }

        public Criteria andPanelRowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PANEL_ROW not between", value1, value2, "panelRow");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsIsNull() {
            addCriterion("PANEL_COLSPNS is null");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsIsNotNull() {
            addCriterion("PANEL_COLSPNS is not null");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsEqualTo(BigDecimal value) {
            addCriterion("PANEL_COLSPNS =", value, "panelColspns");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsNotEqualTo(BigDecimal value) {
            addCriterion("PANEL_COLSPNS <>", value, "panelColspns");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsGreaterThan(BigDecimal value) {
            addCriterion("PANEL_COLSPNS >", value, "panelColspns");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PANEL_COLSPNS >=", value, "panelColspns");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsLessThan(BigDecimal value) {
            addCriterion("PANEL_COLSPNS <", value, "panelColspns");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PANEL_COLSPNS <=", value, "panelColspns");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsIn(List<BigDecimal> values) {
            addCriterion("PANEL_COLSPNS in", values, "panelColspns");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsNotIn(List<BigDecimal> values) {
            addCriterion("PANEL_COLSPNS not in", values, "panelColspns");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PANEL_COLSPNS between", value1, value2, "panelColspns");
            return (Criteria) this;
        }

        public Criteria andPanelColspnsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PANEL_COLSPNS not between", value1, value2, "panelColspns");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsIsNull() {
            addCriterion("PANEL_ROWSPNS is null");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsIsNotNull() {
            addCriterion("PANEL_ROWSPNS is not null");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsEqualTo(BigDecimal value) {
            addCriterion("PANEL_ROWSPNS =", value, "panelRowspns");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsNotEqualTo(BigDecimal value) {
            addCriterion("PANEL_ROWSPNS <>", value, "panelRowspns");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsGreaterThan(BigDecimal value) {
            addCriterion("PANEL_ROWSPNS >", value, "panelRowspns");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PANEL_ROWSPNS >=", value, "panelRowspns");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsLessThan(BigDecimal value) {
            addCriterion("PANEL_ROWSPNS <", value, "panelRowspns");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PANEL_ROWSPNS <=", value, "panelRowspns");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsIn(List<BigDecimal> values) {
            addCriterion("PANEL_ROWSPNS in", values, "panelRowspns");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsNotIn(List<BigDecimal> values) {
            addCriterion("PANEL_ROWSPNS not in", values, "panelRowspns");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PANEL_ROWSPNS between", value1, value2, "panelRowspns");
            return (Criteria) this;
        }

        public Criteria andPanelRowspnsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PANEL_ROWSPNS not between", value1, value2, "panelRowspns");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPanelIndexIsNull() {
            addCriterion("PANEL_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andPanelIndexIsNotNull() {
            addCriterion("PANEL_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andPanelIndexEqualTo(BigDecimal value) {
            addCriterion("PANEL_INDEX =", value, "panelIndex");
            return (Criteria) this;
        }

        public Criteria andPanelIndexNotEqualTo(BigDecimal value) {
            addCriterion("PANEL_INDEX <>", value, "panelIndex");
            return (Criteria) this;
        }

        public Criteria andPanelIndexGreaterThan(BigDecimal value) {
            addCriterion("PANEL_INDEX >", value, "panelIndex");
            return (Criteria) this;
        }

        public Criteria andPanelIndexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PANEL_INDEX >=", value, "panelIndex");
            return (Criteria) this;
        }

        public Criteria andPanelIndexLessThan(BigDecimal value) {
            addCriterion("PANEL_INDEX <", value, "panelIndex");
            return (Criteria) this;
        }

        public Criteria andPanelIndexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PANEL_INDEX <=", value, "panelIndex");
            return (Criteria) this;
        }

        public Criteria andPanelIndexIn(List<BigDecimal> values) {
            addCriterion("PANEL_INDEX in", values, "panelIndex");
            return (Criteria) this;
        }

        public Criteria andPanelIndexNotIn(List<BigDecimal> values) {
            addCriterion("PANEL_INDEX not in", values, "panelIndex");
            return (Criteria) this;
        }

        public Criteria andPanelIndexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PANEL_INDEX between", value1, value2, "panelIndex");
            return (Criteria) this;
        }

        public Criteria andPanelIndexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PANEL_INDEX not between", value1, value2, "panelIndex");
            return (Criteria) this;
        }

        public Criteria andPanelWidthIsNull() {
            addCriterion("PANEL_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andPanelWidthIsNotNull() {
            addCriterion("PANEL_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andPanelWidthEqualTo(String value) {
            addCriterion("PANEL_WIDTH =", value, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthNotEqualTo(String value) {
            addCriterion("PANEL_WIDTH <>", value, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthGreaterThan(String value) {
            addCriterion("PANEL_WIDTH >", value, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthGreaterThanOrEqualTo(String value) {
            addCriterion("PANEL_WIDTH >=", value, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthLessThan(String value) {
            addCriterion("PANEL_WIDTH <", value, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthLessThanOrEqualTo(String value) {
            addCriterion("PANEL_WIDTH <=", value, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthLike(String value) {
            addCriterion("PANEL_WIDTH like", value, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthNotLike(String value) {
            addCriterion("PANEL_WIDTH not like", value, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthIn(List<String> values) {
            addCriterion("PANEL_WIDTH in", values, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthNotIn(List<String> values) {
            addCriterion("PANEL_WIDTH not in", values, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthBetween(String value1, String value2) {
            addCriterion("PANEL_WIDTH between", value1, value2, "panelWidth");
            return (Criteria) this;
        }

        public Criteria andPanelWidthNotBetween(String value1, String value2) {
            addCriterion("PANEL_WIDTH not between", value1, value2, "panelWidth");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andPanelIdLikeInsensitive(String value) {
            addCriterion("upper(PANEL_ID) like", value.toUpperCase(), "panelId");
            return this;
        }

        public Criteria andLayoutIdLikeInsensitive(String value) {
            addCriterion("upper(LAYOUT_ID) like", value.toUpperCase(), "layoutId");
            return this;
        }

        public Criteria andPanelNameLikeInsensitive(String value) {
            addCriterion("upper(PANEL_NAME) like", value.toUpperCase(), "panelName");
            return this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return this;
        }

        public Criteria andPanelWidthLikeInsensitive(String value) {
            addCriterion("upper(PANEL_WIDTH) like", value.toUpperCase(), "panelWidth");
            return this;
        }
    }

    /**
     * <p>通过面向对象化的设计，将PdwPortalLayoutPanelMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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