package com.chinalife.simba.model;

import java.util.ArrayList;
import java.util.List;


public class SmbServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmbServerExample() {
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

        public Criteria andSrv_idIsNull() {
            addCriterion("srv_id is null");
            return (Criteria) this;
        }

        public Criteria andSrv_idIsNotNull() {
            addCriterion("srv_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrv_idEqualTo(Integer value) {
            addCriterion("srv_id =", value, "srv_id");
            return (Criteria) this;
        }

        public Criteria andSrv_idNotEqualTo(Integer value) {
            addCriterion("srv_id <>", value, "srv_id");
            return (Criteria) this;
        }

        public Criteria andSrv_idGreaterThan(Integer value) {
            addCriterion("srv_id >", value, "srv_id");
            return (Criteria) this;
        }

        public Criteria andSrv_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("srv_id >=", value, "srv_id");
            return (Criteria) this;
        }

        public Criteria andSrv_idLessThan(Integer value) {
            addCriterion("srv_id <", value, "srv_id");
            return (Criteria) this;
        }

        public Criteria andSrv_idLessThanOrEqualTo(Integer value) {
            addCriterion("srv_id <=", value, "srv_id");
            return (Criteria) this;
        }

        public Criteria andSrv_idIn(List<Integer> values) {
            addCriterion("srv_id in", values, "srv_id");
            return (Criteria) this;
        }

        public Criteria andSrv_idNotIn(List<Integer> values) {
            addCriterion("srv_id not in", values, "srv_id");
            return (Criteria) this;
        }

        public Criteria andSrv_idBetween(Integer value1, Integer value2) {
            addCriterion("srv_id between", value1, value2, "srv_id");
            return (Criteria) this;
        }

        public Criteria andSrv_idNotBetween(Integer value1, Integer value2) {
            addCriterion("srv_id not between", value1, value2, "srv_id");
            return (Criteria) this;
        }

        public Criteria andSrv_codeIsNull() {
            addCriterion("srv_code is null");
            return (Criteria) this;
        }

        public Criteria andSrv_codeIsNotNull() {
            addCriterion("srv_code is not null");
            return (Criteria) this;
        }

        public Criteria andSrv_codeEqualTo(String value) {
            addCriterion("srv_code =", value, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeNotEqualTo(String value) {
            addCriterion("srv_code <>", value, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeGreaterThan(String value) {
            addCriterion("srv_code >", value, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeGreaterThanOrEqualTo(String value) {
            addCriterion("srv_code >=", value, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeLessThan(String value) {
            addCriterion("srv_code <", value, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeLessThanOrEqualTo(String value) {
            addCriterion("srv_code <=", value, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeLike(String value) {
            addCriterion("srv_code like", value, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeNotLike(String value) {
            addCriterion("srv_code not like", value, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeIn(List<String> values) {
            addCriterion("srv_code in", values, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeNotIn(List<String> values) {
            addCriterion("srv_code not in", values, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeBetween(String value1, String value2) {
            addCriterion("srv_code between", value1, value2, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_codeNotBetween(String value1, String value2) {
            addCriterion("srv_code not between", value1, value2, "srv_code");
            return (Criteria) this;
        }

        public Criteria andSrv_nameIsNull() {
            addCriterion("srv_name is null");
            return (Criteria) this;
        }

        public Criteria andSrv_nameIsNotNull() {
            addCriterion("srv_name is not null");
            return (Criteria) this;
        }

        public Criteria andSrv_nameEqualTo(String value) {
            addCriterion("srv_name =", value, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameNotEqualTo(String value) {
            addCriterion("srv_name <>", value, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameGreaterThan(String value) {
            addCriterion("srv_name >", value, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameGreaterThanOrEqualTo(String value) {
            addCriterion("srv_name >=", value, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameLessThan(String value) {
            addCriterion("srv_name <", value, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameLessThanOrEqualTo(String value) {
            addCriterion("srv_name <=", value, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameLike(String value) {
            addCriterion("srv_name like", value, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameNotLike(String value) {
            addCriterion("srv_name not like", value, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameIn(List<String> values) {
            addCriterion("srv_name in", values, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameNotIn(List<String> values) {
            addCriterion("srv_name not in", values, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameBetween(String value1, String value2) {
            addCriterion("srv_name between", value1, value2, "srv_name");
            return (Criteria) this;
        }

        public Criteria andSrv_nameNotBetween(String value1, String value2) {
            addCriterion("srv_name not between", value1, value2, "srv_name");
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

        public Criteria andSrv_descIsNull() {
            addCriterion("srv_desc is null");
            return (Criteria) this;
        }

        public Criteria andSrv_descIsNotNull() {
            addCriterion("srv_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSrv_descEqualTo(String value) {
            addCriterion("srv_desc =", value, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descNotEqualTo(String value) {
            addCriterion("srv_desc <>", value, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descGreaterThan(String value) {
            addCriterion("srv_desc >", value, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descGreaterThanOrEqualTo(String value) {
            addCriterion("srv_desc >=", value, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descLessThan(String value) {
            addCriterion("srv_desc <", value, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descLessThanOrEqualTo(String value) {
            addCriterion("srv_desc <=", value, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descLike(String value) {
            addCriterion("srv_desc like", value, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descNotLike(String value) {
            addCriterion("srv_desc not like", value, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descIn(List<String> values) {
            addCriterion("srv_desc in", values, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descNotIn(List<String> values) {
            addCriterion("srv_desc not in", values, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descBetween(String value1, String value2) {
            addCriterion("srv_desc between", value1, value2, "srv_desc");
            return (Criteria) this;
        }

        public Criteria andSrv_descNotBetween(String value1, String value2) {
            addCriterion("srv_desc not between", value1, value2, "srv_desc");
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