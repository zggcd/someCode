/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.portal.model;

import com.ccssoft.mybatis.generater.plugin.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PdwPortalInstanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    /**
     * <p>PdwPortalInstanceExample由代码生成器创建。</p>
     */
    public PdwPortalInstanceExample() {
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
     * <p>通过面向对象化的设计，将PdwPortalInstanceMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIsNull() {
            addCriterion("IS_RELEASE is null");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIsNotNull() {
            addCriterion("IS_RELEASE is not null");
            return (Criteria) this;
        }

        public Criteria andIsReleaseEqualTo(String value) {
            addCriterion("IS_RELEASE =", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotEqualTo(String value) {
            addCriterion("IS_RELEASE <>", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseGreaterThan(String value) {
            addCriterion("IS_RELEASE >", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseGreaterThanOrEqualTo(String value) {
            addCriterion("IS_RELEASE >=", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseLessThan(String value) {
            addCriterion("IS_RELEASE <", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseLessThanOrEqualTo(String value) {
            addCriterion("IS_RELEASE <=", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseLike(String value) {
            addCriterion("IS_RELEASE like", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotLike(String value) {
            addCriterion("IS_RELEASE not like", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIn(List<String> values) {
            addCriterion("IS_RELEASE in", values, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotIn(List<String> values) {
            addCriterion("IS_RELEASE not in", values, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseBetween(String value1, String value2) {
            addCriterion("IS_RELEASE between", value1, value2, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotBetween(String value1, String value2) {
            addCriterion("IS_RELEASE not between", value1, value2, "isRelease");
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

        public Criteria andInstanceIdLikeInsensitive(String value) {
            addCriterion("upper(INSTANCE_ID) like", value.toUpperCase(), "instanceId");
            return this;
        }

        public Criteria andInstanceNameLikeInsensitive(String value) {
            addCriterion("upper(INSTANCE_NAME) like", value.toUpperCase(), "instanceName");
            return this;
        }

        public Criteria andLayoutIdLikeInsensitive(String value) {
            addCriterion("upper(LAYOUT_ID) like", value.toUpperCase(), "layoutId");
            return this;
        }

        public Criteria andLayoutNameLikeInsensitive(String value) {
            addCriterion("upper(LAYOUT_NAME) like", value.toUpperCase(), "layoutName");
            return this;
        }

        public Criteria andCreatorLikeInsensitive(String value) {
            addCriterion("upper(CREATOR) like", value.toUpperCase(), "creator");
            return this;
        }

        public Criteria andIsReleaseLikeInsensitive(String value) {
            addCriterion("upper(IS_RELEASE) like", value.toUpperCase(), "isRelease");
            return this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return this;
        }
    }

    /**
     * <p>通过面向对象化的设计，将PdwPortalInstanceMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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