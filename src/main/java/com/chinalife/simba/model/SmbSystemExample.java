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

        public Criteria andSysIdIsNull() {
            addCriterion("sys_id is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("sys_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(Integer value) {
            addCriterion("sys_id =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(Integer value) {
            addCriterion("sys_id <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(Integer value) {
            addCriterion("sys_id >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_id >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(Integer value) {
            addCriterion("sys_id <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_id <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<Integer> values) {
            addCriterion("sys_id in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<Integer> values) {
            addCriterion("sys_id not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_id between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_id not between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNull() {
            addCriterion("sys_code is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("sys_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("sys_code =", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("sys_code <>", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("sys_code >", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_code >=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("sys_code <", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_code <=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("sys_code like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("sys_code not like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("sys_code in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("sys_code not in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("sys_code between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("sys_code not between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNull() {
            addCriterion("sys_name is null");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNotNull() {
            addCriterion("sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysNameEqualTo(String value) {
            addCriterion("sys_name =", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotEqualTo(String value) {
            addCriterion("sys_name <>", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThan(String value) {
            addCriterion("sys_name >", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_name >=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThan(String value) {
            addCriterion("sys_name <", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThanOrEqualTo(String value) {
            addCriterion("sys_name <=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLike(String value) {
            addCriterion("sys_name like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotLike(String value) {
            addCriterion("sys_name not like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameIn(List<String> values) {
            addCriterion("sys_name in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotIn(List<String> values) {
            addCriterion("sys_name not in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameBetween(String value1, String value2) {
            addCriterion("sys_name between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotBetween(String value1, String value2) {
            addCriterion("sys_name not between", value1, value2, "sysName");
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

        public Criteria andBusiDeptIsNull() {
            addCriterion("busi_dept is null");
            return (Criteria) this;
        }

        public Criteria andBusiDeptIsNotNull() {
            addCriterion("busi_dept is not null");
            return (Criteria) this;
        }

        public Criteria andBusiDeptEqualTo(String value) {
            addCriterion("busi_dept =", value, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptNotEqualTo(String value) {
            addCriterion("busi_dept <>", value, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptGreaterThan(String value) {
            addCriterion("busi_dept >", value, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptGreaterThanOrEqualTo(String value) {
            addCriterion("busi_dept >=", value, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptLessThan(String value) {
            addCriterion("busi_dept <", value, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptLessThanOrEqualTo(String value) {
            addCriterion("busi_dept <=", value, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptLike(String value) {
            addCriterion("busi_dept like", value, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptNotLike(String value) {
            addCriterion("busi_dept not like", value, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptIn(List<String> values) {
            addCriterion("busi_dept in", values, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptNotIn(List<String> values) {
            addCriterion("busi_dept not in", values, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptBetween(String value1, String value2) {
            addCriterion("busi_dept between", value1, value2, "busiDept");
            return (Criteria) this;
        }

        public Criteria andBusiDeptNotBetween(String value1, String value2) {
            addCriterion("busi_dept not between", value1, value2, "busiDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptIsNull() {
            addCriterion("dev_dept is null");
            return (Criteria) this;
        }

        public Criteria andDevDeptIsNotNull() {
            addCriterion("dev_dept is not null");
            return (Criteria) this;
        }

        public Criteria andDevDeptEqualTo(String value) {
            addCriterion("dev_dept =", value, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptNotEqualTo(String value) {
            addCriterion("dev_dept <>", value, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptGreaterThan(String value) {
            addCriterion("dev_dept >", value, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dev_dept >=", value, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptLessThan(String value) {
            addCriterion("dev_dept <", value, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptLessThanOrEqualTo(String value) {
            addCriterion("dev_dept <=", value, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptLike(String value) {
            addCriterion("dev_dept like", value, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptNotLike(String value) {
            addCriterion("dev_dept not like", value, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptIn(List<String> values) {
            addCriterion("dev_dept in", values, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptNotIn(List<String> values) {
            addCriterion("dev_dept not in", values, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptBetween(String value1, String value2) {
            addCriterion("dev_dept between", value1, value2, "devDept");
            return (Criteria) this;
        }

        public Criteria andDevDeptNotBetween(String value1, String value2) {
            addCriterion("dev_dept not between", value1, value2, "devDept");
            return (Criteria) this;
        }

        public Criteria andSysDescIsNull() {
            addCriterion("sys_desc is null");
            return (Criteria) this;
        }

        public Criteria andSysDescIsNotNull() {
            addCriterion("sys_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSysDescEqualTo(String value) {
            addCriterion("sys_desc =", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotEqualTo(String value) {
            addCriterion("sys_desc <>", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescGreaterThan(String value) {
            addCriterion("sys_desc >", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescGreaterThanOrEqualTo(String value) {
            addCriterion("sys_desc >=", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescLessThan(String value) {
            addCriterion("sys_desc <", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescLessThanOrEqualTo(String value) {
            addCriterion("sys_desc <=", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescLike(String value) {
            addCriterion("sys_desc like", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotLike(String value) {
            addCriterion("sys_desc not like", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescIn(List<String> values) {
            addCriterion("sys_desc in", values, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotIn(List<String> values) {
            addCriterion("sys_desc not in", values, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescBetween(String value1, String value2) {
            addCriterion("sys_desc between", value1, value2, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotBetween(String value1, String value2) {
            addCriterion("sys_desc not between", value1, value2, "sysDesc");
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