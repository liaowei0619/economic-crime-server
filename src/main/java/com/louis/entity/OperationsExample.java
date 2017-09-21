package com.louis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperationsExample() {
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

        public Criteria andArgsIsNull() {
            addCriterion("args is null");
            return (Criteria) this;
        }

        public Criteria andArgsIsNotNull() {
            addCriterion("args is not null");
            return (Criteria) this;
        }

        public Criteria andArgsEqualTo(String value) {
            addCriterion("args =", value, "args");
            return (Criteria) this;
        }

        public Criteria andArgsNotEqualTo(String value) {
            addCriterion("args <>", value, "args");
            return (Criteria) this;
        }

        public Criteria andArgsGreaterThan(String value) {
            addCriterion("args >", value, "args");
            return (Criteria) this;
        }

        public Criteria andArgsGreaterThanOrEqualTo(String value) {
            addCriterion("args >=", value, "args");
            return (Criteria) this;
        }

        public Criteria andArgsLessThan(String value) {
            addCriterion("args <", value, "args");
            return (Criteria) this;
        }

        public Criteria andArgsLessThanOrEqualTo(String value) {
            addCriterion("args <=", value, "args");
            return (Criteria) this;
        }

        public Criteria andArgsLike(String value) {
            addCriterion("args like", value, "args");
            return (Criteria) this;
        }

        public Criteria andArgsNotLike(String value) {
            addCriterion("args not like", value, "args");
            return (Criteria) this;
        }

        public Criteria andArgsIn(List<String> values) {
            addCriterion("args in", values, "args");
            return (Criteria) this;
        }

        public Criteria andArgsNotIn(List<String> values) {
            addCriterion("args not in", values, "args");
            return (Criteria) this;
        }

        public Criteria andArgsBetween(String value1, String value2) {
            addCriterion("args between", value1, value2, "args");
            return (Criteria) this;
        }

        public Criteria andArgsNotBetween(String value1, String value2) {
            addCriterion("args not between", value1, value2, "args");
            return (Criteria) this;
        }

        public Criteria andClassmethodIsNull() {
            addCriterion("classMethod is null");
            return (Criteria) this;
        }

        public Criteria andClassmethodIsNotNull() {
            addCriterion("classMethod is not null");
            return (Criteria) this;
        }

        public Criteria andClassmethodEqualTo(String value) {
            addCriterion("classMethod =", value, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodNotEqualTo(String value) {
            addCriterion("classMethod <>", value, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodGreaterThan(String value) {
            addCriterion("classMethod >", value, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodGreaterThanOrEqualTo(String value) {
            addCriterion("classMethod >=", value, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodLessThan(String value) {
            addCriterion("classMethod <", value, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodLessThanOrEqualTo(String value) {
            addCriterion("classMethod <=", value, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodLike(String value) {
            addCriterion("classMethod like", value, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodNotLike(String value) {
            addCriterion("classMethod not like", value, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodIn(List<String> values) {
            addCriterion("classMethod in", values, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodNotIn(List<String> values) {
            addCriterion("classMethod not in", values, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodBetween(String value1, String value2) {
            addCriterion("classMethod between", value1, value2, "classmethod");
            return (Criteria) this;
        }

        public Criteria andClassmethodNotBetween(String value1, String value2) {
            addCriterion("classMethod not between", value1, value2, "classmethod");
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

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeIsNull() {
            addCriterion("reqDateTime is null");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeIsNotNull() {
            addCriterion("reqDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeEqualTo(Date value) {
            addCriterion("reqDateTime =", value, "reqdatetime");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeNotEqualTo(Date value) {
            addCriterion("reqDateTime <>", value, "reqdatetime");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeGreaterThan(Date value) {
            addCriterion("reqDateTime >", value, "reqdatetime");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reqDateTime >=", value, "reqdatetime");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeLessThan(Date value) {
            addCriterion("reqDateTime <", value, "reqdatetime");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("reqDateTime <=", value, "reqdatetime");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeIn(List<Date> values) {
            addCriterion("reqDateTime in", values, "reqdatetime");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeNotIn(List<Date> values) {
            addCriterion("reqDateTime not in", values, "reqdatetime");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeBetween(Date value1, Date value2) {
            addCriterion("reqDateTime between", value1, value2, "reqdatetime");
            return (Criteria) this;
        }

        public Criteria andReqdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("reqDateTime not between", value1, value2, "reqdatetime");
            return (Criteria) this;
        }

        public Criteria andReqresultIsNull() {
            addCriterion("reqResult is null");
            return (Criteria) this;
        }

        public Criteria andReqresultIsNotNull() {
            addCriterion("reqResult is not null");
            return (Criteria) this;
        }

        public Criteria andReqresultEqualTo(Byte value) {
            addCriterion("reqResult =", value, "reqresult");
            return (Criteria) this;
        }

        public Criteria andReqresultNotEqualTo(Byte value) {
            addCriterion("reqResult <>", value, "reqresult");
            return (Criteria) this;
        }

        public Criteria andReqresultGreaterThan(Byte value) {
            addCriterion("reqResult >", value, "reqresult");
            return (Criteria) this;
        }

        public Criteria andReqresultGreaterThanOrEqualTo(Byte value) {
            addCriterion("reqResult >=", value, "reqresult");
            return (Criteria) this;
        }

        public Criteria andReqresultLessThan(Byte value) {
            addCriterion("reqResult <", value, "reqresult");
            return (Criteria) this;
        }

        public Criteria andReqresultLessThanOrEqualTo(Byte value) {
            addCriterion("reqResult <=", value, "reqresult");
            return (Criteria) this;
        }

        public Criteria andReqresultIn(List<Byte> values) {
            addCriterion("reqResult in", values, "reqresult");
            return (Criteria) this;
        }

        public Criteria andReqresultNotIn(List<Byte> values) {
            addCriterion("reqResult not in", values, "reqresult");
            return (Criteria) this;
        }

        public Criteria andReqresultBetween(Byte value1, Byte value2) {
            addCriterion("reqResult between", value1, value2, "reqresult");
            return (Criteria) this;
        }

        public Criteria andReqresultNotBetween(Byte value1, Byte value2) {
            addCriterion("reqResult not between", value1, value2, "reqresult");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeIsNull() {
            addCriterion("saveDateTime is null");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeIsNotNull() {
            addCriterion("saveDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeEqualTo(Date value) {
            addCriterion("saveDateTime =", value, "savedatetime");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeNotEqualTo(Date value) {
            addCriterion("saveDateTime <>", value, "savedatetime");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeGreaterThan(Date value) {
            addCriterion("saveDateTime >", value, "savedatetime");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("saveDateTime >=", value, "savedatetime");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeLessThan(Date value) {
            addCriterion("saveDateTime <", value, "savedatetime");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeLessThanOrEqualTo(Date value) {
            addCriterion("saveDateTime <=", value, "savedatetime");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeIn(List<Date> values) {
            addCriterion("saveDateTime in", values, "savedatetime");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeNotIn(List<Date> values) {
            addCriterion("saveDateTime not in", values, "savedatetime");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeBetween(Date value1, Date value2) {
            addCriterion("saveDateTime between", value1, value2, "savedatetime");
            return (Criteria) this;
        }

        public Criteria andSavedatetimeNotBetween(Date value1, Date value2) {
            addCriterion("saveDateTime not between", value1, value2, "savedatetime");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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