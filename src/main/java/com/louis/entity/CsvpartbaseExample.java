package com.louis.entity;

import java.util.ArrayList;
import java.util.List;

public class CsvpartbaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsvpartbaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andUpipIsNull() {
            addCriterion("upIp is null");
            return (Criteria) this;
        }

        public Criteria andUpipIsNotNull() {
            addCriterion("upIp is not null");
            return (Criteria) this;
        }

        public Criteria andUpipEqualTo(String value) {
            addCriterion("upIp =", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipNotEqualTo(String value) {
            addCriterion("upIp <>", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipGreaterThan(String value) {
            addCriterion("upIp >", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipGreaterThanOrEqualTo(String value) {
            addCriterion("upIp >=", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipLessThan(String value) {
            addCriterion("upIp <", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipLessThanOrEqualTo(String value) {
            addCriterion("upIp <=", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipLike(String value) {
            addCriterion("upIp like", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipNotLike(String value) {
            addCriterion("upIp not like", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipIn(List<String> values) {
            addCriterion("upIp in", values, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipNotIn(List<String> values) {
            addCriterion("upIp not in", values, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipBetween(String value1, String value2) {
            addCriterion("upIp between", value1, value2, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipNotBetween(String value1, String value2) {
            addCriterion("upIp not between", value1, value2, "upip");
            return (Criteria) this;
        }

        public Criteria andUpnameIsNull() {
            addCriterion("upName is null");
            return (Criteria) this;
        }

        public Criteria andUpnameIsNotNull() {
            addCriterion("upName is not null");
            return (Criteria) this;
        }

        public Criteria andUpnameEqualTo(String value) {
            addCriterion("upName =", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameNotEqualTo(String value) {
            addCriterion("upName <>", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameGreaterThan(String value) {
            addCriterion("upName >", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameGreaterThanOrEqualTo(String value) {
            addCriterion("upName >=", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameLessThan(String value) {
            addCriterion("upName <", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameLessThanOrEqualTo(String value) {
            addCriterion("upName <=", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameLike(String value) {
            addCriterion("upName like", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameNotLike(String value) {
            addCriterion("upName not like", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameIn(List<String> values) {
            addCriterion("upName in", values, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameNotIn(List<String> values) {
            addCriterion("upName not in", values, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameBetween(String value1, String value2) {
            addCriterion("upName between", value1, value2, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameNotBetween(String value1, String value2) {
            addCriterion("upName not between", value1, value2, "upname");
            return (Criteria) this;
        }

        public Criteria andUpindexIsNull() {
            addCriterion("upIndex is null");
            return (Criteria) this;
        }

        public Criteria andUpindexIsNotNull() {
            addCriterion("upIndex is not null");
            return (Criteria) this;
        }

        public Criteria andUpindexEqualTo(String value) {
            addCriterion("upIndex =", value, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexNotEqualTo(String value) {
            addCriterion("upIndex <>", value, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexGreaterThan(String value) {
            addCriterion("upIndex >", value, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexGreaterThanOrEqualTo(String value) {
            addCriterion("upIndex >=", value, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexLessThan(String value) {
            addCriterion("upIndex <", value, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexLessThanOrEqualTo(String value) {
            addCriterion("upIndex <=", value, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexLike(String value) {
            addCriterion("upIndex like", value, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexNotLike(String value) {
            addCriterion("upIndex not like", value, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexIn(List<String> values) {
            addCriterion("upIndex in", values, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexNotIn(List<String> values) {
            addCriterion("upIndex not in", values, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexBetween(String value1, String value2) {
            addCriterion("upIndex between", value1, value2, "upindex");
            return (Criteria) this;
        }

        public Criteria andUpindexNotBetween(String value1, String value2) {
            addCriterion("upIndex not between", value1, value2, "upindex");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(String value) {
            addCriterion("modifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(String value) {
            addCriterion("modifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(String value) {
            addCriterion("modifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("modifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(String value) {
            addCriterion("modifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(String value) {
            addCriterion("modifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLike(String value) {
            addCriterion("modifyTime like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotLike(String value) {
            addCriterion("modifyTime not like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<String> values) {
            addCriterion("modifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<String> values) {
            addCriterion("modifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(String value1, String value2) {
            addCriterion("modifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(String value1, String value2) {
            addCriterion("modifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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