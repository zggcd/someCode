/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.nsg.model;

import com.ccssoft.mybatis.generater.plugin.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NsgServiceCallRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    /**
     * <p>NsgServiceCallRecordExample由代码生成器创建。</p>
     */
    public NsgServiceCallRecordExample() {
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
     * <p>通过面向对象化的设计，将NsgServiceCallRecordMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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

        public Criteria andRecordIdIsNull() {
            addCriterion("RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("RECORD_ID =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("RECORD_ID <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("RECORD_ID >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_ID >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("RECORD_ID <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("RECORD_ID <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("RECORD_ID like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("RECORD_ID not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("RECORD_ID in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("RECORD_ID not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("RECORD_ID between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("RECORD_ID not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNull() {
            addCriterion("SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(String value) {
            addCriterion("SERIAL_NO =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(String value) {
            addCriterion("SERIAL_NO <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(String value) {
            addCriterion("SERIAL_NO >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_NO >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(String value) {
            addCriterion("SERIAL_NO <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_NO <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLike(String value) {
            addCriterion("SERIAL_NO like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotLike(String value) {
            addCriterion("SERIAL_NO not like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<String> values) {
            addCriterion("SERIAL_NO in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<String> values) {
            addCriterion("SERIAL_NO not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(String value1, String value2) {
            addCriterion("SERIAL_NO between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(String value1, String value2) {
            addCriterion("SERIAL_NO not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andExecMethodIsNull() {
            addCriterion("EXEC_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andExecMethodIsNotNull() {
            addCriterion("EXEC_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andExecMethodEqualTo(String value) {
            addCriterion("EXEC_METHOD =", value, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodNotEqualTo(String value) {
            addCriterion("EXEC_METHOD <>", value, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodGreaterThan(String value) {
            addCriterion("EXEC_METHOD >", value, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_METHOD >=", value, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodLessThan(String value) {
            addCriterion("EXEC_METHOD <", value, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodLessThanOrEqualTo(String value) {
            addCriterion("EXEC_METHOD <=", value, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodLike(String value) {
            addCriterion("EXEC_METHOD like", value, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodNotLike(String value) {
            addCriterion("EXEC_METHOD not like", value, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodIn(List<String> values) {
            addCriterion("EXEC_METHOD in", values, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodNotIn(List<String> values) {
            addCriterion("EXEC_METHOD not in", values, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodBetween(String value1, String value2) {
            addCriterion("EXEC_METHOD between", value1, value2, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodNotBetween(String value1, String value2) {
            addCriterion("EXEC_METHOD not between", value1, value2, "execMethod");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameIsNull() {
            addCriterion("EXEC_METHOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameIsNotNull() {
            addCriterion("EXEC_METHOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameEqualTo(String value) {
            addCriterion("EXEC_METHOD_NAME =", value, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameNotEqualTo(String value) {
            addCriterion("EXEC_METHOD_NAME <>", value, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameGreaterThan(String value) {
            addCriterion("EXEC_METHOD_NAME >", value, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_METHOD_NAME >=", value, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameLessThan(String value) {
            addCriterion("EXEC_METHOD_NAME <", value, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameLessThanOrEqualTo(String value) {
            addCriterion("EXEC_METHOD_NAME <=", value, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameLike(String value) {
            addCriterion("EXEC_METHOD_NAME like", value, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameNotLike(String value) {
            addCriterion("EXEC_METHOD_NAME not like", value, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameIn(List<String> values) {
            addCriterion("EXEC_METHOD_NAME in", values, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameNotIn(List<String> values) {
            addCriterion("EXEC_METHOD_NAME not in", values, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameBetween(String value1, String value2) {
            addCriterion("EXEC_METHOD_NAME between", value1, value2, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecMethodNameNotBetween(String value1, String value2) {
            addCriterion("EXEC_METHOD_NAME not between", value1, value2, "execMethodName");
            return (Criteria) this;
        }

        public Criteria andExecParamIsNull() {
            addCriterion("EXEC_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andExecParamIsNotNull() {
            addCriterion("EXEC_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andExecParamEqualTo(String value) {
            addCriterion("EXEC_PARAM =", value, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamNotEqualTo(String value) {
            addCriterion("EXEC_PARAM <>", value, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamGreaterThan(String value) {
            addCriterion("EXEC_PARAM >", value, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_PARAM >=", value, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamLessThan(String value) {
            addCriterion("EXEC_PARAM <", value, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamLessThanOrEqualTo(String value) {
            addCriterion("EXEC_PARAM <=", value, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamLike(String value) {
            addCriterion("EXEC_PARAM like", value, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamNotLike(String value) {
            addCriterion("EXEC_PARAM not like", value, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamIn(List<String> values) {
            addCriterion("EXEC_PARAM in", values, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamNotIn(List<String> values) {
            addCriterion("EXEC_PARAM not in", values, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamBetween(String value1, String value2) {
            addCriterion("EXEC_PARAM between", value1, value2, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecParamNotBetween(String value1, String value2) {
            addCriterion("EXEC_PARAM not between", value1, value2, "execParam");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeIsNull() {
            addCriterion("EXEC_ERRCODE is null");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeIsNotNull() {
            addCriterion("EXEC_ERRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeEqualTo(String value) {
            addCriterion("EXEC_ERRCODE =", value, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeNotEqualTo(String value) {
            addCriterion("EXEC_ERRCODE <>", value, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeGreaterThan(String value) {
            addCriterion("EXEC_ERRCODE >", value, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_ERRCODE >=", value, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeLessThan(String value) {
            addCriterion("EXEC_ERRCODE <", value, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeLessThanOrEqualTo(String value) {
            addCriterion("EXEC_ERRCODE <=", value, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeLike(String value) {
            addCriterion("EXEC_ERRCODE like", value, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeNotLike(String value) {
            addCriterion("EXEC_ERRCODE not like", value, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeIn(List<String> values) {
            addCriterion("EXEC_ERRCODE in", values, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeNotIn(List<String> values) {
            addCriterion("EXEC_ERRCODE not in", values, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeBetween(String value1, String value2) {
            addCriterion("EXEC_ERRCODE between", value1, value2, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeNotBetween(String value1, String value2) {
            addCriterion("EXEC_ERRCODE not between", value1, value2, "execErrcode");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescIsNull() {
            addCriterion("EXEC_ERRCODE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescIsNotNull() {
            addCriterion("EXEC_ERRCODE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescEqualTo(String value) {
            addCriterion("EXEC_ERRCODE_DESC =", value, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescNotEqualTo(String value) {
            addCriterion("EXEC_ERRCODE_DESC <>", value, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescGreaterThan(String value) {
            addCriterion("EXEC_ERRCODE_DESC >", value, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_ERRCODE_DESC >=", value, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescLessThan(String value) {
            addCriterion("EXEC_ERRCODE_DESC <", value, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescLessThanOrEqualTo(String value) {
            addCriterion("EXEC_ERRCODE_DESC <=", value, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescLike(String value) {
            addCriterion("EXEC_ERRCODE_DESC like", value, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescNotLike(String value) {
            addCriterion("EXEC_ERRCODE_DESC not like", value, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescIn(List<String> values) {
            addCriterion("EXEC_ERRCODE_DESC in", values, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescNotIn(List<String> values) {
            addCriterion("EXEC_ERRCODE_DESC not in", values, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescBetween(String value1, String value2) {
            addCriterion("EXEC_ERRCODE_DESC between", value1, value2, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecErrcodeDescNotBetween(String value1, String value2) {
            addCriterion("EXEC_ERRCODE_DESC not between", value1, value2, "execErrcodeDesc");
            return (Criteria) this;
        }

        public Criteria andExecResultIsNull() {
            addCriterion("EXEC_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andExecResultIsNotNull() {
            addCriterion("EXEC_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andExecResultEqualTo(String value) {
            addCriterion("EXEC_RESULT =", value, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultNotEqualTo(String value) {
            addCriterion("EXEC_RESULT <>", value, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultGreaterThan(String value) {
            addCriterion("EXEC_RESULT >", value, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_RESULT >=", value, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultLessThan(String value) {
            addCriterion("EXEC_RESULT <", value, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultLessThanOrEqualTo(String value) {
            addCriterion("EXEC_RESULT <=", value, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultLike(String value) {
            addCriterion("EXEC_RESULT like", value, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultNotLike(String value) {
            addCriterion("EXEC_RESULT not like", value, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultIn(List<String> values) {
            addCriterion("EXEC_RESULT in", values, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultNotIn(List<String> values) {
            addCriterion("EXEC_RESULT not in", values, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultBetween(String value1, String value2) {
            addCriterion("EXEC_RESULT between", value1, value2, "execResult");
            return (Criteria) this;
        }

        public Criteria andExecResultNotBetween(String value1, String value2) {
            addCriterion("EXEC_RESULT not between", value1, value2, "execResult");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNull() {
            addCriterion("CLIENT_IP is null");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNotNull() {
            addCriterion("CLIENT_IP is not null");
            return (Criteria) this;
        }

        public Criteria andClientIpEqualTo(String value) {
            addCriterion("CLIENT_IP =", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotEqualTo(String value) {
            addCriterion("CLIENT_IP <>", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThan(String value) {
            addCriterion("CLIENT_IP >", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_IP >=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThan(String value) {
            addCriterion("CLIENT_IP <", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_IP <=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLike(String value) {
            addCriterion("CLIENT_IP like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotLike(String value) {
            addCriterion("CLIENT_IP not like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpIn(List<String> values) {
            addCriterion("CLIENT_IP in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotIn(List<String> values) {
            addCriterion("CLIENT_IP not in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpBetween(String value1, String value2) {
            addCriterion("CLIENT_IP between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotBetween(String value1, String value2) {
            addCriterion("CLIENT_IP not between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNull() {
            addCriterion("SERVER_IP is null");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNotNull() {
            addCriterion("SERVER_IP is not null");
            return (Criteria) this;
        }

        public Criteria andServerIpEqualTo(String value) {
            addCriterion("SERVER_IP =", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotEqualTo(String value) {
            addCriterion("SERVER_IP <>", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThan(String value) {
            addCriterion("SERVER_IP >", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_IP >=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThan(String value) {
            addCriterion("SERVER_IP <", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThanOrEqualTo(String value) {
            addCriterion("SERVER_IP <=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLike(String value) {
            addCriterion("SERVER_IP like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotLike(String value) {
            addCriterion("SERVER_IP not like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpIn(List<String> values) {
            addCriterion("SERVER_IP in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotIn(List<String> values) {
            addCriterion("SERVER_IP not in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpBetween(String value1, String value2) {
            addCriterion("SERVER_IP between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotBetween(String value1, String value2) {
            addCriterion("SERVER_IP not between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andClientPortIsNull() {
            addCriterion("CLIENT_PORT is null");
            return (Criteria) this;
        }

        public Criteria andClientPortIsNotNull() {
            addCriterion("CLIENT_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andClientPortEqualTo(String value) {
            addCriterion("CLIENT_PORT =", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotEqualTo(String value) {
            addCriterion("CLIENT_PORT <>", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortGreaterThan(String value) {
            addCriterion("CLIENT_PORT >", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_PORT >=", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortLessThan(String value) {
            addCriterion("CLIENT_PORT <", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_PORT <=", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortLike(String value) {
            addCriterion("CLIENT_PORT like", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotLike(String value) {
            addCriterion("CLIENT_PORT not like", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortIn(List<String> values) {
            addCriterion("CLIENT_PORT in", values, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotIn(List<String> values) {
            addCriterion("CLIENT_PORT not in", values, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortBetween(String value1, String value2) {
            addCriterion("CLIENT_PORT between", value1, value2, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotBetween(String value1, String value2) {
            addCriterion("CLIENT_PORT not between", value1, value2, "clientPort");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNull() {
            addCriterion("SERVER_PORT is null");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNotNull() {
            addCriterion("SERVER_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andServerPortEqualTo(String value) {
            addCriterion("SERVER_PORT =", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotEqualTo(String value) {
            addCriterion("SERVER_PORT <>", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThan(String value) {
            addCriterion("SERVER_PORT >", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_PORT >=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThan(String value) {
            addCriterion("SERVER_PORT <", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThanOrEqualTo(String value) {
            addCriterion("SERVER_PORT <=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLike(String value) {
            addCriterion("SERVER_PORT like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotLike(String value) {
            addCriterion("SERVER_PORT not like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortIn(List<String> values) {
            addCriterion("SERVER_PORT in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotIn(List<String> values) {
            addCriterion("SERVER_PORT not in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortBetween(String value1, String value2) {
            addCriterion("SERVER_PORT between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotBetween(String value1, String value2) {
            addCriterion("SERVER_PORT not between", value1, value2, "serverPort");
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

        public Criteria andReserve1IsNull() {
            addCriterion("RESERVE1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("RESERVE1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(String value) {
            addCriterion("RESERVE1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(String value) {
            addCriterion("RESERVE1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(String value) {
            addCriterion("RESERVE1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(String value) {
            addCriterion("RESERVE1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(String value) {
            addCriterion("RESERVE1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Like(String value) {
            addCriterion("RESERVE1 like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotLike(String value) {
            addCriterion("RESERVE1 not like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<String> values) {
            addCriterion("RESERVE1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<String> values) {
            addCriterion("RESERVE1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(String value1, String value2) {
            addCriterion("RESERVE1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(String value1, String value2) {
            addCriterion("RESERVE1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("RESERVE2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("RESERVE2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(String value) {
            addCriterion("RESERVE2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(String value) {
            addCriterion("RESERVE2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(String value) {
            addCriterion("RESERVE2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(String value) {
            addCriterion("RESERVE2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(String value) {
            addCriterion("RESERVE2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Like(String value) {
            addCriterion("RESERVE2 like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotLike(String value) {
            addCriterion("RESERVE2 not like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<String> values) {
            addCriterion("RESERVE2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<String> values) {
            addCriterion("RESERVE2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(String value1, String value2) {
            addCriterion("RESERVE2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(String value1, String value2) {
            addCriterion("RESERVE2 not between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNull() {
            addCriterion("RESERVE3 is null");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNotNull() {
            addCriterion("RESERVE3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve3EqualTo(String value) {
            addCriterion("RESERVE3 =", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotEqualTo(String value) {
            addCriterion("RESERVE3 <>", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThan(String value) {
            addCriterion("RESERVE3 >", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE3 >=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThan(String value) {
            addCriterion("RESERVE3 <", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThanOrEqualTo(String value) {
            addCriterion("RESERVE3 <=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Like(String value) {
            addCriterion("RESERVE3 like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotLike(String value) {
            addCriterion("RESERVE3 not like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3In(List<String> values) {
            addCriterion("RESERVE3 in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotIn(List<String> values) {
            addCriterion("RESERVE3 not in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Between(String value1, String value2) {
            addCriterion("RESERVE3 between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotBetween(String value1, String value2) {
            addCriterion("RESERVE3 not between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNull() {
            addCriterion("RESERVE4 is null");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNotNull() {
            addCriterion("RESERVE4 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve4EqualTo(String value) {
            addCriterion("RESERVE4 =", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotEqualTo(String value) {
            addCriterion("RESERVE4 <>", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThan(String value) {
            addCriterion("RESERVE4 >", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE4 >=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThan(String value) {
            addCriterion("RESERVE4 <", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThanOrEqualTo(String value) {
            addCriterion("RESERVE4 <=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4Like(String value) {
            addCriterion("RESERVE4 like", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotLike(String value) {
            addCriterion("RESERVE4 not like", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4In(List<String> values) {
            addCriterion("RESERVE4 in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotIn(List<String> values) {
            addCriterion("RESERVE4 not in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4Between(String value1, String value2) {
            addCriterion("RESERVE4 between", value1, value2, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotBetween(String value1, String value2) {
            addCriterion("RESERVE4 not between", value1, value2, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve5IsNull() {
            addCriterion("RESERVE5 is null");
            return (Criteria) this;
        }

        public Criteria andReserve5IsNotNull() {
            addCriterion("RESERVE5 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve5EqualTo(String value) {
            addCriterion("RESERVE5 =", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotEqualTo(String value) {
            addCriterion("RESERVE5 <>", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5GreaterThan(String value) {
            addCriterion("RESERVE5 >", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE5 >=", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5LessThan(String value) {
            addCriterion("RESERVE5 <", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5LessThanOrEqualTo(String value) {
            addCriterion("RESERVE5 <=", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5Like(String value) {
            addCriterion("RESERVE5 like", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotLike(String value) {
            addCriterion("RESERVE5 not like", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5In(List<String> values) {
            addCriterion("RESERVE5 in", values, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotIn(List<String> values) {
            addCriterion("RESERVE5 not in", values, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5Between(String value1, String value2) {
            addCriterion("RESERVE5 between", value1, value2, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotBetween(String value1, String value2) {
            addCriterion("RESERVE5 not between", value1, value2, "reserve5");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andRecordIdLikeInsensitive(String value) {
            addCriterion("upper(RECORD_ID) like", value.toUpperCase(), "recordId");
            return this;
        }

        public Criteria andSerialNoLikeInsensitive(String value) {
            addCriterion("upper(SERIAL_NO) like", value.toUpperCase(), "serialNo");
            return this;
        }

        public Criteria andExecMethodLikeInsensitive(String value) {
            addCriterion("upper(EXEC_METHOD) like", value.toUpperCase(), "execMethod");
            return this;
        }

        public Criteria andExecMethodNameLikeInsensitive(String value) {
            addCriterion("upper(EXEC_METHOD_NAME) like", value.toUpperCase(), "execMethodName");
            return this;
        }

        public Criteria andExecParamLikeInsensitive(String value) {
            addCriterion("upper(EXEC_PARAM) like", value.toUpperCase(), "execParam");
            return this;
        }

        public Criteria andExecErrcodeLikeInsensitive(String value) {
            addCriterion("upper(EXEC_ERRCODE) like", value.toUpperCase(), "execErrcode");
            return this;
        }

        public Criteria andExecErrcodeDescLikeInsensitive(String value) {
            addCriterion("upper(EXEC_ERRCODE_DESC) like", value.toUpperCase(), "execErrcodeDesc");
            return this;
        }

        public Criteria andExecResultLikeInsensitive(String value) {
            addCriterion("upper(EXEC_RESULT) like", value.toUpperCase(), "execResult");
            return this;
        }

        public Criteria andClientIpLikeInsensitive(String value) {
            addCriterion("upper(CLIENT_IP) like", value.toUpperCase(), "clientIp");
            return this;
        }

        public Criteria andServerIpLikeInsensitive(String value) {
            addCriterion("upper(SERVER_IP) like", value.toUpperCase(), "serverIp");
            return this;
        }

        public Criteria andClientPortLikeInsensitive(String value) {
            addCriterion("upper(CLIENT_PORT) like", value.toUpperCase(), "clientPort");
            return this;
        }

        public Criteria andServerPortLikeInsensitive(String value) {
            addCriterion("upper(SERVER_PORT) like", value.toUpperCase(), "serverPort");
            return this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return this;
        }

        public Criteria andReserve1LikeInsensitive(String value) {
            addCriterion("upper(RESERVE1) like", value.toUpperCase(), "reserve1");
            return this;
        }

        public Criteria andReserve2LikeInsensitive(String value) {
            addCriterion("upper(RESERVE2) like", value.toUpperCase(), "reserve2");
            return this;
        }

        public Criteria andReserve3LikeInsensitive(String value) {
            addCriterion("upper(RESERVE3) like", value.toUpperCase(), "reserve3");
            return this;
        }

        public Criteria andReserve4LikeInsensitive(String value) {
            addCriterion("upper(RESERVE4) like", value.toUpperCase(), "reserve4");
            return this;
        }

        public Criteria andReserve5LikeInsensitive(String value) {
            addCriterion("upper(RESERVE5) like", value.toUpperCase(), "reserve5");
            return this;
        }
    }

    /**
     * <p>通过面向对象化的设计，将NsgServiceCallRecordMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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