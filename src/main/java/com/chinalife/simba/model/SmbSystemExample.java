package com.chinalife.simba.model;

import java.util.ArrayList;
import java.util.List;


public class SmbSystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmbSystemExample() {
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

        public Criteria andSys_idIsNull() {
            addCriterion("sys_id is null");
            return (Criteria) this;
        }

        public Criteria andSys_idIsNotNull() {
            addCriterion("sys_id is not null");
            return (Criteria) this;
        }

        public Criteria andSys_idEqualTo(Integer value) {
            addCriterion("sys_id =", value, "sys_id");
            return (Criteria) this;
        }

        public Criteria andSys_idNotEqualTo(Integer value) {
            addCriterion("sys_id <>", value, "sys_id");
            return (Criteria) this;
        }

        public Criteria andSys_idGreaterThan(Integer value) {
            addCriterion("sys_id >", value, "sys_id");
            return (Criteria) this;
        }

        public Criteria andSys_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_id >=", value, "sys_id");
            return (Criteria) this;
        }

        public Criteria andSys_idLessThan(Integer value) {
            addCriterion("sys_id <", value, "sys_id");
            return (Criteria) this;
        }

        public Criteria andSys_idLessThanOrEqualTo(Integer value) {
            addCriterion("sys_id <=", value, "sys_id");
            return (Criteria) this;
        }

        public Criteria andSys_idIn(List<Integer> values) {
            addCriterion("sys_id in", values, "sys_id");
            return (Criteria) this;
        }

        public Criteria andSys_idNotIn(List<Integer> values) {
            addCriterion("sys_id not in", values, "sys_id");
            return (Criteria) this;
        }

        public Criteria andSys_idBetween(Integer value1, Integer value2) {
            addCriterion("sys_id between", value1, value2, "sys_id");
            return (Criteria) this;
        }

        public Criteria andSys_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_id not between", value1, value2, "sys_id");
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

        public Criteria andSys_nameIsNull() {
            addCriterion("sys_name is null");
            return (Criteria) this;
        }

        public Criteria andSys_nameIsNotNull() {
            addCriterion("sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andSys_nameEqualTo(String value) {
            addCriterion("sys_name =", value, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameNotEqualTo(String value) {
            addCriterion("sys_name <>", value, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameGreaterThan(String value) {
            addCriterion("sys_name >", value, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_name >=", value, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameLessThan(String value) {
            addCriterion("sys_name <", value, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameLessThanOrEqualTo(String value) {
            addCriterion("sys_name <=", value, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameLike(String value) {
            addCriterion("sys_name like", value, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameNotLike(String value) {
            addCriterion("sys_name not like", value, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameIn(List<String> values) {
            addCriterion("sys_name in", values, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameNotIn(List<String> values) {
            addCriterion("sys_name not in", values, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameBetween(String value1, String value2) {
            addCriterion("sys_name between", value1, value2, "sys_name");
            return (Criteria) this;
        }

        public Criteria andSys_nameNotBetween(String value1, String value2) {
            addCriterion("sys_name not between", value1, value2, "sys_name");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andArchitectIsNull() {
            addCriterion("architect is null");
            return (Criteria) this;
        }

        public Criteria andArchitectIsNotNull() {
            addCriterion("architect is not null");
            return (Criteria) this;
        }

        public Criteria andArchitectEqualTo(String value) {
            addCriterion("architect =", value, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectNotEqualTo(String value) {
            addCriterion("architect <>", value, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectGreaterThan(String value) {
            addCriterion("architect >", value, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectGreaterThanOrEqualTo(String value) {
            addCriterion("architect >=", value, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectLessThan(String value) {
            addCriterion("architect <", value, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectLessThanOrEqualTo(String value) {
            addCriterion("architect <=", value, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectLike(String value) {
            addCriterion("architect like", value, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectNotLike(String value) {
            addCriterion("architect not like", value, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectIn(List<String> values) {
            addCriterion("architect in", values, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectNotIn(List<String> values) {
            addCriterion("architect not in", values, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectBetween(String value1, String value2) {
            addCriterion("architect between", value1, value2, "architect");
            return (Criteria) this;
        }

        public Criteria andArchitectNotBetween(String value1, String value2) {
            addCriterion("architect not between", value1, value2, "architect");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andSys_descIsNull() {
            addCriterion("sys_desc is null");
            return (Criteria) this;
        }

        public Criteria andSys_descIsNotNull() {
            addCriterion("sys_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSys_descEqualTo(String value) {
            addCriterion("sys_desc =", value, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descNotEqualTo(String value) {
            addCriterion("sys_desc <>", value, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descGreaterThan(String value) {
            addCriterion("sys_desc >", value, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descGreaterThanOrEqualTo(String value) {
            addCriterion("sys_desc >=", value, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descLessThan(String value) {
            addCriterion("sys_desc <", value, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descLessThanOrEqualTo(String value) {
            addCriterion("sys_desc <=", value, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descLike(String value) {
            addCriterion("sys_desc like", value, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descNotLike(String value) {
            addCriterion("sys_desc not like", value, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descIn(List<String> values) {
            addCriterion("sys_desc in", values, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descNotIn(List<String> values) {
            addCriterion("sys_desc not in", values, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descBetween(String value1, String value2) {
            addCriterion("sys_desc between", value1, value2, "sys_desc");
            return (Criteria) this;
        }

        public Criteria andSys_descNotBetween(String value1, String value2) {
            addCriterion("sys_desc not between", value1, value2, "sys_desc");
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