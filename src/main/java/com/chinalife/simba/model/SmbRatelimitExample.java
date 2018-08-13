package com.chinalife.simba.model;

import java.util.ArrayList;
import java.util.List;


public class SmbRatelimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmbRatelimitExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andRtlmt_idIsNull() {
            addCriterion("rtlmt_id is null");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idIsNotNull() {
            addCriterion("rtlmt_id is not null");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idEqualTo(Integer value) {
            addCriterion("rtlmt_id =", value, "rtlmt_id");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idNotEqualTo(Integer value) {
            addCriterion("rtlmt_id <>", value, "rtlmt_id");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idGreaterThan(Integer value) {
            addCriterion("rtlmt_id >", value, "rtlmt_id");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtlmt_id >=", value, "rtlmt_id");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idLessThan(Integer value) {
            addCriterion("rtlmt_id <", value, "rtlmt_id");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idLessThanOrEqualTo(Integer value) {
            addCriterion("rtlmt_id <=", value, "rtlmt_id");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idIn(List<Integer> values) {
            addCriterion("rtlmt_id in", values, "rtlmt_id");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idNotIn(List<Integer> values) {
            addCriterion("rtlmt_id not in", values, "rtlmt_id");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idBetween(Integer value1, Integer value2) {
            addCriterion("rtlmt_id between", value1, value2, "rtlmt_id");
            return (Criteria) this;
        }

        public Criteria andRtlmt_idNotBetween(Integer value1, Integer value2) {
            addCriterion("rtlmt_id not between", value1, value2, "rtlmt_id");
            return (Criteria) this;
        }

        public Criteria andSys_codeIsNull() {
            addCriterion("sys_code is null");
            return (Criteria) this;
        }

        public Criteria andSys_codeIsNotNull() {
            addCriterion("sys_code is not null");
            return (Criteria) this;
        }

        public Criteria andSys_codeEqualTo(String value) {
            addCriterion("sys_code =", value, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeNotEqualTo(String value) {
            addCriterion("sys_code <>", value, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeGreaterThan(String value) {
            addCriterion("sys_code >", value, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_code >=", value, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeLessThan(String value) {
            addCriterion("sys_code <", value, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeLessThanOrEqualTo(String value) {
            addCriterion("sys_code <=", value, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeLike(String value) {
            addCriterion("sys_code like", value, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeNotLike(String value) {
            addCriterion("sys_code not like", value, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeIn(List<String> values) {
            addCriterion("sys_code in", values, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeNotIn(List<String> values) {
            addCriterion("sys_code not in", values, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeBetween(String value1, String value2) {
            addCriterion("sys_code between", value1, value2, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSys_codeNotBetween(String value1, String value2) {
            addCriterion("sys_code not between", value1, value2, "sys_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeIsNull() {
            addCriterion("svc_code is null");
            return (Criteria) this;
        }

        public Criteria andSvc_codeIsNotNull() {
            addCriterion("svc_code is not null");
            return (Criteria) this;
        }

        public Criteria andSvc_codeEqualTo(String value) {
            addCriterion("svc_code =", value, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeNotEqualTo(String value) {
            addCriterion("svc_code <>", value, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeGreaterThan(String value) {
            addCriterion("svc_code >", value, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeGreaterThanOrEqualTo(String value) {
            addCriterion("svc_code >=", value, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeLessThan(String value) {
            addCriterion("svc_code <", value, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeLessThanOrEqualTo(String value) {
            addCriterion("svc_code <=", value, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeLike(String value) {
            addCriterion("svc_code like", value, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeNotLike(String value) {
            addCriterion("svc_code not like", value, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeIn(List<String> values) {
            addCriterion("svc_code in", values, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeNotIn(List<String> values) {
            addCriterion("svc_code not in", values, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeBetween(String value1, String value2) {
            addCriterion("svc_code between", value1, value2, "svc_code");
            return (Criteria) this;
        }

        public Criteria andSvc_codeNotBetween(String value1, String value2) {
            addCriterion("svc_code not between", value1, value2, "svc_code");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoIsNull() {
            addCriterion("rate_lmt_algo is null");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoIsNotNull() {
            addCriterion("rate_lmt_algo is not null");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoEqualTo(String value) {
            addCriterion("rate_lmt_algo =", value, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoNotEqualTo(String value) {
            addCriterion("rate_lmt_algo <>", value, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoGreaterThan(String value) {
            addCriterion("rate_lmt_algo >", value, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoGreaterThanOrEqualTo(String value) {
            addCriterion("rate_lmt_algo >=", value, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoLessThan(String value) {
            addCriterion("rate_lmt_algo <", value, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoLessThanOrEqualTo(String value) {
            addCriterion("rate_lmt_algo <=", value, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoLike(String value) {
            addCriterion("rate_lmt_algo like", value, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoNotLike(String value) {
            addCriterion("rate_lmt_algo not like", value, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoIn(List<String> values) {
            addCriterion("rate_lmt_algo in", values, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoNotIn(List<String> values) {
            addCriterion("rate_lmt_algo not in", values, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoBetween(String value1, String value2) {
            addCriterion("rate_lmt_algo between", value1, value2, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_algoNotBetween(String value1, String value2) {
            addCriterion("rate_lmt_algo not between", value1, value2, "rate_lmt_algo");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldIsNull() {
            addCriterion("rate_lmt_thld is null");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldIsNotNull() {
            addCriterion("rate_lmt_thld is not null");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldEqualTo(String value) {
            addCriterion("rate_lmt_thld =", value, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldNotEqualTo(String value) {
            addCriterion("rate_lmt_thld <>", value, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldGreaterThan(String value) {
            addCriterion("rate_lmt_thld >", value, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldGreaterThanOrEqualTo(String value) {
            addCriterion("rate_lmt_thld >=", value, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldLessThan(String value) {
            addCriterion("rate_lmt_thld <", value, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldLessThanOrEqualTo(String value) {
            addCriterion("rate_lmt_thld <=", value, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldLike(String value) {
            addCriterion("rate_lmt_thld like", value, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldNotLike(String value) {
            addCriterion("rate_lmt_thld not like", value, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldIn(List<String> values) {
            addCriterion("rate_lmt_thld in", values, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldNotIn(List<String> values) {
            addCriterion("rate_lmt_thld not in", values, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldBetween(String value1, String value2) {
            addCriterion("rate_lmt_thld between", value1, value2, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_thldNotBetween(String value1, String value2) {
            addCriterion("rate_lmt_thld not between", value1, value2, "rate_lmt_thld");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descIsNull() {
            addCriterion("rate_lmt_desc is null");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descIsNotNull() {
            addCriterion("rate_lmt_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descEqualTo(String value) {
            addCriterion("rate_lmt_desc =", value, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descNotEqualTo(String value) {
            addCriterion("rate_lmt_desc <>", value, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descGreaterThan(String value) {
            addCriterion("rate_lmt_desc >", value, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descGreaterThanOrEqualTo(String value) {
            addCriterion("rate_lmt_desc >=", value, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descLessThan(String value) {
            addCriterion("rate_lmt_desc <", value, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descLessThanOrEqualTo(String value) {
            addCriterion("rate_lmt_desc <=", value, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descLike(String value) {
            addCriterion("rate_lmt_desc like", value, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descNotLike(String value) {
            addCriterion("rate_lmt_desc not like", value, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descIn(List<String> values) {
            addCriterion("rate_lmt_desc in", values, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descNotIn(List<String> values) {
            addCriterion("rate_lmt_desc not in", values, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descBetween(String value1, String value2) {
            addCriterion("rate_lmt_desc between", value1, value2, "rate_lmt_desc");
            return (Criteria) this;
        }

        public Criteria andRate_lmt_descNotBetween(String value1, String value2) {
            addCriterion("rate_lmt_desc not between", value1, value2, "rate_lmt_desc");
            return (Criteria) this;
        }
    }

    /**
     */
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