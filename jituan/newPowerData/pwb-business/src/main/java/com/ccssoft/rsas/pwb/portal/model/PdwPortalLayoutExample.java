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

public class PdwPortalLayoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    /**
     * <p>PdwPortalLayoutExample由代码生成器创建。</p>
     */
    public PdwPortalLayoutExample() {
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
     * <p>通过面向对象化的设计，将PdwPortalLayoutMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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

        public Criteria andLayoutNameIsNull() {
            addCriterion("LAYOUT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLayoutNameIsNotNull() {
            addCriterion("LAYOUT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutNameEqualTo(String value) {
            addCriterion("LAYOUT_NAME =", value, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameNotEqualTo(String value) {
            addCriterion("LAYOUT_NAME <>", value, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameGreaterThan(String value) {
            addCriterion("LAYOUT_NAME >", value, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAYOUT_NAME >=", value, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameLessThan(String value) {
            addCriterion("LAYOUT_NAME <", value, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameLessThanOrEqualTo(String value) {
            addCriterion("LAYOUT_NAME <=", value, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameLike(String value) {
            addCriterion("LAYOUT_NAME like", value, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameNotLike(String value) {
            addCriterion("LAYOUT_NAME not like", value, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameIn(List<String> values) {
            addCriterion("LAYOUT_NAME in", values, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameNotIn(List<String> values) {
            addCriterion("LAYOUT_NAME not in", values, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameBetween(String value1, String value2) {
            addCriterion("LAYOUT_NAME between", value1, value2, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutNameNotBetween(String value1, String value2) {
            addCriterion("LAYOUT_NAME not between", value1, value2, "layoutName");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsIsNull() {
            addCriterion("LAYOUT_ROWS is null");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsIsNotNull() {
            addCriterion("LAYOUT_ROWS is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsEqualTo(BigDecimal value) {
            addCriterion("LAYOUT_ROWS =", value, "layoutRows");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsNotEqualTo(BigDecimal value) {
            addCriterion("LAYOUT_ROWS <>", value, "layoutRows");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsGreaterThan(BigDecimal value) {
            addCriterion("LAYOUT_ROWS >", value, "layoutRows");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAYOUT_ROWS >=", value, "layoutRows");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsLessThan(BigDecimal value) {
            addCriterion("LAYOUT_ROWS <", value, "layoutRows");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAYOUT_ROWS <=", value, "layoutRows");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsIn(List<BigDecimal> values) {
            addCriterion("LAYOUT_ROWS in", values, "layoutRows");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsNotIn(List<BigDecimal> values) {
            addCriterion("LAYOUT_ROWS not in", values, "layoutRows");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAYOUT_ROWS between", value1, value2, "layoutRows");
            return (Criteria) this;
        }

        public Criteria andLayoutRowsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAYOUT_ROWS not between", value1, value2, "layoutRows");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsIsNull() {
            addCriterion("LAYOUT_COLUMNS is null");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsIsNotNull() {
            addCriterion("LAYOUT_COLUMNS is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsEqualTo(BigDecimal value) {
            addCriterion("LAYOUT_COLUMNS =", value, "layoutColumns");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsNotEqualTo(BigDecimal value) {
            addCriterion("LAYOUT_COLUMNS <>", value, "layoutColumns");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsGreaterThan(BigDecimal value) {
            addCriterion("LAYOUT_COLUMNS >", value, "layoutColumns");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAYOUT_COLUMNS >=", value, "layoutColumns");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsLessThan(BigDecimal value) {
            addCriterion("LAYOUT_COLUMNS <", value, "layoutColumns");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAYOUT_COLUMNS <=", value, "layoutColumns");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsIn(List<BigDecimal> values) {
            addCriterion("LAYOUT_COLUMNS in", values, "layoutColumns");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsNotIn(List<BigDecimal> values) {
            addCriterion("LAYOUT_COLUMNS not in", values, "layoutColumns");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAYOUT_COLUMNS between", value1, value2, "layoutColumns");
            return (Criteria) this;
        }

        public Criteria andLayoutColumnsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAYOUT_COLUMNS not between", value1, value2, "layoutColumns");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andLayoutIdLikeInsensitive(String value) {
            addCriterion("upper(LAYOUT_ID) like", value.toUpperCase(), "layoutId");
            return this;
        }

        public Criteria andLayoutNameLikeInsensitive(String value) {
            addCriterion("upper(LAYOUT_NAME) like", value.toUpperCase(), "layoutName");
            return this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return this;
        }
    }

    /**
     * <p>通过面向对象化的设计，将PdwPortalLayoutMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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