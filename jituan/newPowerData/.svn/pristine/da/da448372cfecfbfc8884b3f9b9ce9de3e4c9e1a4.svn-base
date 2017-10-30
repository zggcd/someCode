/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.pwb.ditem.model;

import com.ccssoft.mybatis.generater.plugin.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BafSysDictionaryItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    /**
     * <p>BafSysDictionaryItemExample由代码生成器创建。</p>
     */
    public BafSysDictionaryItemExample() {
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
     * <p>通过面向对象化的设计，将BafSysDictionaryItemMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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

        public Criteria andItemidIsNull() {
            addCriterion("ITEMID is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("ITEMID is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(String value) {
            addCriterion("ITEMID =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(String value) {
            addCriterion("ITEMID <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(String value) {
            addCriterion("ITEMID >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMID >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(String value) {
            addCriterion("ITEMID <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(String value) {
            addCriterion("ITEMID <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLike(String value) {
            addCriterion("ITEMID like", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotLike(String value) {
            addCriterion("ITEMID not like", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<String> values) {
            addCriterion("ITEMID in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<String> values) {
            addCriterion("ITEMID not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(String value1, String value2) {
            addCriterion("ITEMID between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(String value1, String value2) {
            addCriterion("ITEMID not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemcodeIsNull() {
            addCriterion("ITEMCODE is null");
            return (Criteria) this;
        }

        public Criteria andItemcodeIsNotNull() {
            addCriterion("ITEMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andItemcodeEqualTo(String value) {
            addCriterion("ITEMCODE =", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotEqualTo(String value) {
            addCriterion("ITEMCODE <>", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeGreaterThan(String value) {
            addCriterion("ITEMCODE >", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMCODE >=", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLessThan(String value) {
            addCriterion("ITEMCODE <", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLessThanOrEqualTo(String value) {
            addCriterion("ITEMCODE <=", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLike(String value) {
            addCriterion("ITEMCODE like", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotLike(String value) {
            addCriterion("ITEMCODE not like", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeIn(List<String> values) {
            addCriterion("ITEMCODE in", values, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotIn(List<String> values) {
            addCriterion("ITEMCODE not in", values, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeBetween(String value1, String value2) {
            addCriterion("ITEMCODE between", value1, value2, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotBetween(String value1, String value2) {
            addCriterion("ITEMCODE not between", value1, value2, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNull() {
            addCriterion("ITEMNAME is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("ITEMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("ITEMNAME =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("ITEMNAME <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("ITEMNAME >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMNAME >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("ITEMNAME <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("ITEMNAME <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("ITEMNAME like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("ITEMNAME not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("ITEMNAME in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("ITEMNAME not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("ITEMNAME between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("ITEMNAME not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemvalueIsNull() {
            addCriterion("ITEMVALUE is null");
            return (Criteria) this;
        }

        public Criteria andItemvalueIsNotNull() {
            addCriterion("ITEMVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andItemvalueEqualTo(String value) {
            addCriterion("ITEMVALUE =", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotEqualTo(String value) {
            addCriterion("ITEMVALUE <>", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueGreaterThan(String value) {
            addCriterion("ITEMVALUE >", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMVALUE >=", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueLessThan(String value) {
            addCriterion("ITEMVALUE <", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueLessThanOrEqualTo(String value) {
            addCriterion("ITEMVALUE <=", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueLike(String value) {
            addCriterion("ITEMVALUE like", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotLike(String value) {
            addCriterion("ITEMVALUE not like", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueIn(List<String> values) {
            addCriterion("ITEMVALUE in", values, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotIn(List<String> values) {
            addCriterion("ITEMVALUE not in", values, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueBetween(String value1, String value2) {
            addCriterion("ITEMVALUE between", value1, value2, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotBetween(String value1, String value2) {
            addCriterion("ITEMVALUE not between", value1, value2, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemdescIsNull() {
            addCriterion("ITEMDESC is null");
            return (Criteria) this;
        }

        public Criteria andItemdescIsNotNull() {
            addCriterion("ITEMDESC is not null");
            return (Criteria) this;
        }

        public Criteria andItemdescEqualTo(String value) {
            addCriterion("ITEMDESC =", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotEqualTo(String value) {
            addCriterion("ITEMDESC <>", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescGreaterThan(String value) {
            addCriterion("ITEMDESC >", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMDESC >=", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLessThan(String value) {
            addCriterion("ITEMDESC <", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLessThanOrEqualTo(String value) {
            addCriterion("ITEMDESC <=", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLike(String value) {
            addCriterion("ITEMDESC like", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotLike(String value) {
            addCriterion("ITEMDESC not like", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescIn(List<String> values) {
            addCriterion("ITEMDESC in", values, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotIn(List<String> values) {
            addCriterion("ITEMDESC not in", values, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescBetween(String value1, String value2) {
            addCriterion("ITEMDESC between", value1, value2, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotBetween(String value1, String value2) {
            addCriterion("ITEMDESC not between", value1, value2, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andDictionaryidIsNull() {
            addCriterion("DICTIONARYID is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryidIsNotNull() {
            addCriterion("DICTIONARYID is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryidEqualTo(String value) {
            addCriterion("DICTIONARYID =", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotEqualTo(String value) {
            addCriterion("DICTIONARYID <>", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidGreaterThan(String value) {
            addCriterion("DICTIONARYID >", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidGreaterThanOrEqualTo(String value) {
            addCriterion("DICTIONARYID >=", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidLessThan(String value) {
            addCriterion("DICTIONARYID <", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidLessThanOrEqualTo(String value) {
            addCriterion("DICTIONARYID <=", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidLike(String value) {
            addCriterion("DICTIONARYID like", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotLike(String value) {
            addCriterion("DICTIONARYID not like", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidIn(List<String> values) {
            addCriterion("DICTIONARYID in", values, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotIn(List<String> values) {
            addCriterion("DICTIONARYID not in", values, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidBetween(String value1, String value2) {
            addCriterion("DICTIONARYID between", value1, value2, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotBetween(String value1, String value2) {
            addCriterion("DICTIONARYID not between", value1, value2, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNull() {
            addCriterion("REGIONID is null");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNotNull() {
            addCriterion("REGIONID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionidEqualTo(String value) {
            addCriterion("REGIONID =", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotEqualTo(String value) {
            addCriterion("REGIONID <>", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThan(String value) {
            addCriterion("REGIONID >", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThanOrEqualTo(String value) {
            addCriterion("REGIONID >=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThan(String value) {
            addCriterion("REGIONID <", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThanOrEqualTo(String value) {
            addCriterion("REGIONID <=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLike(String value) {
            addCriterion("REGIONID like", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotLike(String value) {
            addCriterion("REGIONID not like", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidIn(List<String> values) {
            addCriterion("REGIONID in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotIn(List<String> values) {
            addCriterion("REGIONID not in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidBetween(String value1, String value2) {
            addCriterion("REGIONID between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotBetween(String value1, String value2) {
            addCriterion("REGIONID not between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andSortorderIsNull() {
            addCriterion("SORTORDER is null");
            return (Criteria) this;
        }

        public Criteria andSortorderIsNotNull() {
            addCriterion("SORTORDER is not null");
            return (Criteria) this;
        }

        public Criteria andSortorderEqualTo(BigDecimal value) {
            addCriterion("SORTORDER =", value, "sortorder");
            return (Criteria) this;
        }

        public Criteria andSortorderNotEqualTo(BigDecimal value) {
            addCriterion("SORTORDER <>", value, "sortorder");
            return (Criteria) this;
        }

        public Criteria andSortorderGreaterThan(BigDecimal value) {
            addCriterion("SORTORDER >", value, "sortorder");
            return (Criteria) this;
        }

        public Criteria andSortorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SORTORDER >=", value, "sortorder");
            return (Criteria) this;
        }

        public Criteria andSortorderLessThan(BigDecimal value) {
            addCriterion("SORTORDER <", value, "sortorder");
            return (Criteria) this;
        }

        public Criteria andSortorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SORTORDER <=", value, "sortorder");
            return (Criteria) this;
        }

        public Criteria andSortorderIn(List<BigDecimal> values) {
            addCriterion("SORTORDER in", values, "sortorder");
            return (Criteria) this;
        }

        public Criteria andSortorderNotIn(List<BigDecimal> values) {
            addCriterion("SORTORDER not in", values, "sortorder");
            return (Criteria) this;
        }

        public Criteria andSortorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SORTORDER between", value1, value2, "sortorder");
            return (Criteria) this;
        }

        public Criteria andSortorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SORTORDER not between", value1, value2, "sortorder");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("ISVALID is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("ISVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(String value) {
            addCriterion("ISVALID =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(String value) {
            addCriterion("ISVALID <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(String value) {
            addCriterion("ISVALID >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(String value) {
            addCriterion("ISVALID >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(String value) {
            addCriterion("ISVALID <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(String value) {
            addCriterion("ISVALID <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLike(String value) {
            addCriterion("ISVALID like", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotLike(String value) {
            addCriterion("ISVALID not like", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<String> values) {
            addCriterion("ISVALID in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<String> values) {
            addCriterion("ISVALID not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(String value1, String value2) {
            addCriterion("ISVALID between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(String value1, String value2) {
            addCriterion("ISVALID not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andItemstyleIsNull() {
            addCriterion("ITEMSTYLE is null");
            return (Criteria) this;
        }

        public Criteria andItemstyleIsNotNull() {
            addCriterion("ITEMSTYLE is not null");
            return (Criteria) this;
        }

        public Criteria andItemstyleEqualTo(String value) {
            addCriterion("ITEMSTYLE =", value, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleNotEqualTo(String value) {
            addCriterion("ITEMSTYLE <>", value, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleGreaterThan(String value) {
            addCriterion("ITEMSTYLE >", value, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMSTYLE >=", value, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleLessThan(String value) {
            addCriterion("ITEMSTYLE <", value, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleLessThanOrEqualTo(String value) {
            addCriterion("ITEMSTYLE <=", value, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleLike(String value) {
            addCriterion("ITEMSTYLE like", value, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleNotLike(String value) {
            addCriterion("ITEMSTYLE not like", value, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleIn(List<String> values) {
            addCriterion("ITEMSTYLE in", values, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleNotIn(List<String> values) {
            addCriterion("ITEMSTYLE not in", values, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleBetween(String value1, String value2) {
            addCriterion("ITEMSTYLE between", value1, value2, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andItemstyleNotBetween(String value1, String value2) {
            addCriterion("ITEMSTYLE not between", value1, value2, "itemstyle");
            return (Criteria) this;
        }

        public Criteria andFullcodeIsNull() {
            addCriterion("FULLCODE is null");
            return (Criteria) this;
        }

        public Criteria andFullcodeIsNotNull() {
            addCriterion("FULLCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFullcodeEqualTo(String value) {
            addCriterion("FULLCODE =", value, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeNotEqualTo(String value) {
            addCriterion("FULLCODE <>", value, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeGreaterThan(String value) {
            addCriterion("FULLCODE >", value, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FULLCODE >=", value, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeLessThan(String value) {
            addCriterion("FULLCODE <", value, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeLessThanOrEqualTo(String value) {
            addCriterion("FULLCODE <=", value, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeLike(String value) {
            addCriterion("FULLCODE like", value, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeNotLike(String value) {
            addCriterion("FULLCODE not like", value, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeIn(List<String> values) {
            addCriterion("FULLCODE in", values, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeNotIn(List<String> values) {
            addCriterion("FULLCODE not in", values, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeBetween(String value1, String value2) {
            addCriterion("FULLCODE between", value1, value2, "fullcode");
            return (Criteria) this;
        }

        public Criteria andFullcodeNotBetween(String value1, String value2) {
            addCriterion("FULLCODE not between", value1, value2, "fullcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeIsNull() {
            addCriterion("SHORTCODE is null");
            return (Criteria) this;
        }

        public Criteria andShortcodeIsNotNull() {
            addCriterion("SHORTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andShortcodeEqualTo(String value) {
            addCriterion("SHORTCODE =", value, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeNotEqualTo(String value) {
            addCriterion("SHORTCODE <>", value, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeGreaterThan(String value) {
            addCriterion("SHORTCODE >", value, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTCODE >=", value, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeLessThan(String value) {
            addCriterion("SHORTCODE <", value, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeLessThanOrEqualTo(String value) {
            addCriterion("SHORTCODE <=", value, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeLike(String value) {
            addCriterion("SHORTCODE like", value, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeNotLike(String value) {
            addCriterion("SHORTCODE not like", value, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeIn(List<String> values) {
            addCriterion("SHORTCODE in", values, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeNotIn(List<String> values) {
            addCriterion("SHORTCODE not in", values, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeBetween(String value1, String value2) {
            addCriterion("SHORTCODE between", value1, value2, "shortcode");
            return (Criteria) this;
        }

        public Criteria andShortcodeNotBetween(String value1, String value2) {
            addCriterion("SHORTCODE not between", value1, value2, "shortcode");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("MODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("MODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("MODIFYTIME =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("MODIFYTIME <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("MODIFYTIME >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFYTIME >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("MODIFYTIME <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFYTIME <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("MODIFYTIME in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("MODIFYTIME not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("MODIFYTIME between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFYTIME not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andItemnameArIsNull() {
            addCriterion("ITEMNAME_AR is null");
            return (Criteria) this;
        }

        public Criteria andItemnameArIsNotNull() {
            addCriterion("ITEMNAME_AR is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameArEqualTo(String value) {
            addCriterion("ITEMNAME_AR =", value, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArNotEqualTo(String value) {
            addCriterion("ITEMNAME_AR <>", value, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArGreaterThan(String value) {
            addCriterion("ITEMNAME_AR >", value, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMNAME_AR >=", value, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArLessThan(String value) {
            addCriterion("ITEMNAME_AR <", value, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArLessThanOrEqualTo(String value) {
            addCriterion("ITEMNAME_AR <=", value, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArLike(String value) {
            addCriterion("ITEMNAME_AR like", value, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArNotLike(String value) {
            addCriterion("ITEMNAME_AR not like", value, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArIn(List<String> values) {
            addCriterion("ITEMNAME_AR in", values, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArNotIn(List<String> values) {
            addCriterion("ITEMNAME_AR not in", values, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArBetween(String value1, String value2) {
            addCriterion("ITEMNAME_AR between", value1, value2, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andItemnameArNotBetween(String value1, String value2) {
            addCriterion("ITEMNAME_AR not between", value1, value2, "itemnameAr");
            return (Criteria) this;
        }

        public Criteria andExtfield1IsNull() {
            addCriterion("EXTFIELD1 is null");
            return (Criteria) this;
        }

        public Criteria andExtfield1IsNotNull() {
            addCriterion("EXTFIELD1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfield1EqualTo(String value) {
            addCriterion("EXTFIELD1 =", value, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1NotEqualTo(String value) {
            addCriterion("EXTFIELD1 <>", value, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1GreaterThan(String value) {
            addCriterion("EXTFIELD1 >", value, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFIELD1 >=", value, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1LessThan(String value) {
            addCriterion("EXTFIELD1 <", value, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1LessThanOrEqualTo(String value) {
            addCriterion("EXTFIELD1 <=", value, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1Like(String value) {
            addCriterion("EXTFIELD1 like", value, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1NotLike(String value) {
            addCriterion("EXTFIELD1 not like", value, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1In(List<String> values) {
            addCriterion("EXTFIELD1 in", values, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1NotIn(List<String> values) {
            addCriterion("EXTFIELD1 not in", values, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1Between(String value1, String value2) {
            addCriterion("EXTFIELD1 between", value1, value2, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield1NotBetween(String value1, String value2) {
            addCriterion("EXTFIELD1 not between", value1, value2, "extfield1");
            return (Criteria) this;
        }

        public Criteria andExtfield2IsNull() {
            addCriterion("EXTFIELD2 is null");
            return (Criteria) this;
        }

        public Criteria andExtfield2IsNotNull() {
            addCriterion("EXTFIELD2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfield2EqualTo(String value) {
            addCriterion("EXTFIELD2 =", value, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2NotEqualTo(String value) {
            addCriterion("EXTFIELD2 <>", value, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2GreaterThan(String value) {
            addCriterion("EXTFIELD2 >", value, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFIELD2 >=", value, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2LessThan(String value) {
            addCriterion("EXTFIELD2 <", value, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2LessThanOrEqualTo(String value) {
            addCriterion("EXTFIELD2 <=", value, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2Like(String value) {
            addCriterion("EXTFIELD2 like", value, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2NotLike(String value) {
            addCriterion("EXTFIELD2 not like", value, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2In(List<String> values) {
            addCriterion("EXTFIELD2 in", values, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2NotIn(List<String> values) {
            addCriterion("EXTFIELD2 not in", values, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2Between(String value1, String value2) {
            addCriterion("EXTFIELD2 between", value1, value2, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield2NotBetween(String value1, String value2) {
            addCriterion("EXTFIELD2 not between", value1, value2, "extfield2");
            return (Criteria) this;
        }

        public Criteria andExtfield3IsNull() {
            addCriterion("EXTFIELD3 is null");
            return (Criteria) this;
        }

        public Criteria andExtfield3IsNotNull() {
            addCriterion("EXTFIELD3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfield3EqualTo(String value) {
            addCriterion("EXTFIELD3 =", value, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3NotEqualTo(String value) {
            addCriterion("EXTFIELD3 <>", value, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3GreaterThan(String value) {
            addCriterion("EXTFIELD3 >", value, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFIELD3 >=", value, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3LessThan(String value) {
            addCriterion("EXTFIELD3 <", value, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3LessThanOrEqualTo(String value) {
            addCriterion("EXTFIELD3 <=", value, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3Like(String value) {
            addCriterion("EXTFIELD3 like", value, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3NotLike(String value) {
            addCriterion("EXTFIELD3 not like", value, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3In(List<String> values) {
            addCriterion("EXTFIELD3 in", values, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3NotIn(List<String> values) {
            addCriterion("EXTFIELD3 not in", values, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3Between(String value1, String value2) {
            addCriterion("EXTFIELD3 between", value1, value2, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield3NotBetween(String value1, String value2) {
            addCriterion("EXTFIELD3 not between", value1, value2, "extfield3");
            return (Criteria) this;
        }

        public Criteria andExtfield4IsNull() {
            addCriterion("EXTFIELD4 is null");
            return (Criteria) this;
        }

        public Criteria andExtfield4IsNotNull() {
            addCriterion("EXTFIELD4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfield4EqualTo(String value) {
            addCriterion("EXTFIELD4 =", value, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4NotEqualTo(String value) {
            addCriterion("EXTFIELD4 <>", value, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4GreaterThan(String value) {
            addCriterion("EXTFIELD4 >", value, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFIELD4 >=", value, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4LessThan(String value) {
            addCriterion("EXTFIELD4 <", value, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4LessThanOrEqualTo(String value) {
            addCriterion("EXTFIELD4 <=", value, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4Like(String value) {
            addCriterion("EXTFIELD4 like", value, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4NotLike(String value) {
            addCriterion("EXTFIELD4 not like", value, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4In(List<String> values) {
            addCriterion("EXTFIELD4 in", values, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4NotIn(List<String> values) {
            addCriterion("EXTFIELD4 not in", values, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4Between(String value1, String value2) {
            addCriterion("EXTFIELD4 between", value1, value2, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield4NotBetween(String value1, String value2) {
            addCriterion("EXTFIELD4 not between", value1, value2, "extfield4");
            return (Criteria) this;
        }

        public Criteria andExtfield5IsNull() {
            addCriterion("EXTFIELD5 is null");
            return (Criteria) this;
        }

        public Criteria andExtfield5IsNotNull() {
            addCriterion("EXTFIELD5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfield5EqualTo(String value) {
            addCriterion("EXTFIELD5 =", value, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5NotEqualTo(String value) {
            addCriterion("EXTFIELD5 <>", value, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5GreaterThan(String value) {
            addCriterion("EXTFIELD5 >", value, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFIELD5 >=", value, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5LessThan(String value) {
            addCriterion("EXTFIELD5 <", value, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5LessThanOrEqualTo(String value) {
            addCriterion("EXTFIELD5 <=", value, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5Like(String value) {
            addCriterion("EXTFIELD5 like", value, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5NotLike(String value) {
            addCriterion("EXTFIELD5 not like", value, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5In(List<String> values) {
            addCriterion("EXTFIELD5 in", values, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5NotIn(List<String> values) {
            addCriterion("EXTFIELD5 not in", values, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5Between(String value1, String value2) {
            addCriterion("EXTFIELD5 between", value1, value2, "extfield5");
            return (Criteria) this;
        }

        public Criteria andExtfield5NotBetween(String value1, String value2) {
            addCriterion("EXTFIELD5 not between", value1, value2, "extfield5");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andItemidLikeInsensitive(String value) {
            addCriterion("upper(ITEMID) like", value.toUpperCase(), "itemid");
            return this;
        }

        public Criteria andItemcodeLikeInsensitive(String value) {
            addCriterion("upper(ITEMCODE) like", value.toUpperCase(), "itemcode");
            return this;
        }

        public Criteria andItemnameLikeInsensitive(String value) {
            addCriterion("upper(ITEMNAME) like", value.toUpperCase(), "itemname");
            return this;
        }

        public Criteria andItemvalueLikeInsensitive(String value) {
            addCriterion("upper(ITEMVALUE) like", value.toUpperCase(), "itemvalue");
            return this;
        }

        public Criteria andItemdescLikeInsensitive(String value) {
            addCriterion("upper(ITEMDESC) like", value.toUpperCase(), "itemdesc");
            return this;
        }

        public Criteria andDictionaryidLikeInsensitive(String value) {
            addCriterion("upper(DICTIONARYID) like", value.toUpperCase(), "dictionaryid");
            return this;
        }

        public Criteria andRegionidLikeInsensitive(String value) {
            addCriterion("upper(REGIONID) like", value.toUpperCase(), "regionid");
            return this;
        }

        public Criteria andIsvalidLikeInsensitive(String value) {
            addCriterion("upper(ISVALID) like", value.toUpperCase(), "isvalid");
            return this;
        }

        public Criteria andItemstyleLikeInsensitive(String value) {
            addCriterion("upper(ITEMSTYLE) like", value.toUpperCase(), "itemstyle");
            return this;
        }

        public Criteria andFullcodeLikeInsensitive(String value) {
            addCriterion("upper(FULLCODE) like", value.toUpperCase(), "fullcode");
            return this;
        }

        public Criteria andShortcodeLikeInsensitive(String value) {
            addCriterion("upper(SHORTCODE) like", value.toUpperCase(), "shortcode");
            return this;
        }

        public Criteria andItemnameArLikeInsensitive(String value) {
            addCriterion("upper(ITEMNAME_AR) like", value.toUpperCase(), "itemnameAr");
            return this;
        }

        public Criteria andExtfield1LikeInsensitive(String value) {
            addCriterion("upper(EXTFIELD1) like", value.toUpperCase(), "extfield1");
            return this;
        }

        public Criteria andExtfield2LikeInsensitive(String value) {
            addCriterion("upper(EXTFIELD2) like", value.toUpperCase(), "extfield2");
            return this;
        }

        public Criteria andExtfield3LikeInsensitive(String value) {
            addCriterion("upper(EXTFIELD3) like", value.toUpperCase(), "extfield3");
            return this;
        }

        public Criteria andExtfield4LikeInsensitive(String value) {
            addCriterion("upper(EXTFIELD4) like", value.toUpperCase(), "extfield4");
            return this;
        }

        public Criteria andExtfield5LikeInsensitive(String value) {
            addCriterion("upper(EXTFIELD5) like", value.toUpperCase(), "extfield5");
            return this;
        }
    }

    /**
     * <p>通过面向对象化的设计，将BafSysDictionaryItemMapper.xml的数据查询条件封装为一个查询条件对象。</p>
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