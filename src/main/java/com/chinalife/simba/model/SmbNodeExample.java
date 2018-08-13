package com.chinalife.simba.model;

import java.util.ArrayList;
import java.util.List;


public class SmbNodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmbNodeExample() {
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

        public Criteria andNode_idIsNull() {
            addCriterion("node_id is null");
            return (Criteria) this;
        }

        public Criteria andNode_idIsNotNull() {
            addCriterion("node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNode_idEqualTo(Integer value) {
            addCriterion("node_id =", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idNotEqualTo(Integer value) {
            addCriterion("node_id <>", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idGreaterThan(Integer value) {
            addCriterion("node_id >", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_id >=", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idLessThan(Integer value) {
            addCriterion("node_id <", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idLessThanOrEqualTo(Integer value) {
            addCriterion("node_id <=", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idIn(List<Integer> values) {
            addCriterion("node_id in", values, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idNotIn(List<Integer> values) {
            addCriterion("node_id not in", values, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idBetween(Integer value1, Integer value2) {
            addCriterion("node_id between", value1, value2, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idNotBetween(Integer value1, Integer value2) {
            addCriterion("node_id not between", value1, value2, "node_id");
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

        public Criteria andMach_idIsNull() {
            addCriterion("mach_id is null");
            return (Criteria) this;
        }

        public Criteria andMach_idIsNotNull() {
            addCriterion("mach_id is not null");
            return (Criteria) this;
        }

        public Criteria andMach_idEqualTo(Integer value) {
            addCriterion("mach_id =", value, "mach_id");
            return (Criteria) this;
        }

        public Criteria andMach_idNotEqualTo(Integer value) {
            addCriterion("mach_id <>", value, "mach_id");
            return (Criteria) this;
        }

        public Criteria andMach_idGreaterThan(Integer value) {
            addCriterion("mach_id >", value, "mach_id");
            return (Criteria) this;
        }

        public Criteria andMach_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("mach_id >=", value, "mach_id");
            return (Criteria) this;
        }

        public Criteria andMach_idLessThan(Integer value) {
            addCriterion("mach_id <", value, "mach_id");
            return (Criteria) this;
        }

        public Criteria andMach_idLessThanOrEqualTo(Integer value) {
            addCriterion("mach_id <=", value, "mach_id");
            return (Criteria) this;
        }

        public Criteria andMach_idIn(List<Integer> values) {
            addCriterion("mach_id in", values, "mach_id");
            return (Criteria) this;
        }

        public Criteria andMach_idNotIn(List<Integer> values) {
            addCriterion("mach_id not in", values, "mach_id");
            return (Criteria) this;
        }

        public Criteria andMach_idBetween(Integer value1, Integer value2) {
            addCriterion("mach_id between", value1, value2, "mach_id");
            return (Criteria) this;
        }

        public Criteria andMach_idNotBetween(Integer value1, Integer value2) {
            addCriterion("mach_id not between", value1, value2, "mach_id");
            return (Criteria) this;
        }

        public Criteria andSrv_portIsNull() {
            addCriterion("srv_port is null");
            return (Criteria) this;
        }

        public Criteria andSrv_portIsNotNull() {
            addCriterion("srv_port is not null");
            return (Criteria) this;
        }

        public Criteria andSrv_portEqualTo(Integer value) {
            addCriterion("srv_port =", value, "srv_port");
            return (Criteria) this;
        }

        public Criteria andSrv_portNotEqualTo(Integer value) {
            addCriterion("srv_port <>", value, "srv_port");
            return (Criteria) this;
        }

        public Criteria andSrv_portGreaterThan(Integer value) {
            addCriterion("srv_port >", value, "srv_port");
            return (Criteria) this;
        }

        public Criteria andSrv_portGreaterThanOrEqualTo(Integer value) {
            addCriterion("srv_port >=", value, "srv_port");
            return (Criteria) this;
        }

        public Criteria andSrv_portLessThan(Integer value) {
            addCriterion("srv_port <", value, "srv_port");
            return (Criteria) this;
        }

        public Criteria andSrv_portLessThanOrEqualTo(Integer value) {
            addCriterion("srv_port <=", value, "srv_port");
            return (Criteria) this;
        }

        public Criteria andSrv_portIn(List<Integer> values) {
            addCriterion("srv_port in", values, "srv_port");
            return (Criteria) this;
        }

        public Criteria andSrv_portNotIn(List<Integer> values) {
            addCriterion("srv_port not in", values, "srv_port");
            return (Criteria) this;
        }

        public Criteria andSrv_portBetween(Integer value1, Integer value2) {
            addCriterion("srv_port between", value1, value2, "srv_port");
            return (Criteria) this;
        }

        public Criteria andSrv_portNotBetween(Integer value1, Integer value2) {
            addCriterion("srv_port not between", value1, value2, "srv_port");
            return (Criteria) this;
        }

        public Criteria andIs_clstrIsNull() {
            addCriterion("is_clstr is null");
            return (Criteria) this;
        }

        public Criteria andIs_clstrIsNotNull() {
            addCriterion("is_clstr is not null");
            return (Criteria) this;
        }

        public Criteria andIs_clstrEqualTo(Integer value) {
            addCriterion("is_clstr =", value, "is_clstr");
            return (Criteria) this;
        }

        public Criteria andIs_clstrNotEqualTo(Integer value) {
            addCriterion("is_clstr <>", value, "is_clstr");
            return (Criteria) this;
        }

        public Criteria andIs_clstrGreaterThan(Integer value) {
            addCriterion("is_clstr >", value, "is_clstr");
            return (Criteria) this;
        }

        public Criteria andIs_clstrGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_clstr >=", value, "is_clstr");
            return (Criteria) this;
        }

        public Criteria andIs_clstrLessThan(Integer value) {
            addCriterion("is_clstr <", value, "is_clstr");
            return (Criteria) this;
        }

        public Criteria andIs_clstrLessThanOrEqualTo(Integer value) {
            addCriterion("is_clstr <=", value, "is_clstr");
            return (Criteria) this;
        }

        public Criteria andIs_clstrIn(List<Integer> values) {
            addCriterion("is_clstr in", values, "is_clstr");
            return (Criteria) this;
        }

        public Criteria andIs_clstrNotIn(List<Integer> values) {
            addCriterion("is_clstr not in", values, "is_clstr");
            return (Criteria) this;
        }

        public Criteria andIs_clstrBetween(Integer value1, Integer value2) {
            addCriterion("is_clstr between", value1, value2, "is_clstr");
            return (Criteria) this;
        }

        public Criteria andIs_clstrNotBetween(Integer value1, Integer value2) {
            addCriterion("is_clstr not between", value1, value2, "is_clstr");
            return (Criteria) this;
        }

        public Criteria andClstr_idIsNull() {
            addCriterion("clstr_id is null");
            return (Criteria) this;
        }

        public Criteria andClstr_idIsNotNull() {
            addCriterion("clstr_id is not null");
            return (Criteria) this;
        }

        public Criteria andClstr_idEqualTo(Integer value) {
            addCriterion("clstr_id =", value, "clstr_id");
            return (Criteria) this;
        }

        public Criteria andClstr_idNotEqualTo(Integer value) {
            addCriterion("clstr_id <>", value, "clstr_id");
            return (Criteria) this;
        }

        public Criteria andClstr_idGreaterThan(Integer value) {
            addCriterion("clstr_id >", value, "clstr_id");
            return (Criteria) this;
        }

        public Criteria andClstr_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("clstr_id >=", value, "clstr_id");
            return (Criteria) this;
        }

        public Criteria andClstr_idLessThan(Integer value) {
            addCriterion("clstr_id <", value, "clstr_id");
            return (Criteria) this;
        }

        public Criteria andClstr_idLessThanOrEqualTo(Integer value) {
            addCriterion("clstr_id <=", value, "clstr_id");
            return (Criteria) this;
        }

        public Criteria andClstr_idIn(List<Integer> values) {
            addCriterion("clstr_id in", values, "clstr_id");
            return (Criteria) this;
        }

        public Criteria andClstr_idNotIn(List<Integer> values) {
            addCriterion("clstr_id not in", values, "clstr_id");
            return (Criteria) this;
        }

        public Criteria andClstr_idBetween(Integer value1, Integer value2) {
            addCriterion("clstr_id between", value1, value2, "clstr_id");
            return (Criteria) this;
        }

        public Criteria andClstr_idNotBetween(Integer value1, Integer value2) {
            addCriterion("clstr_id not between", value1, value2, "clstr_id");
            return (Criteria) this;
        }

        public Criteria andNode_descIsNull() {
            addCriterion("node_desc is null");
            return (Criteria) this;
        }

        public Criteria andNode_descIsNotNull() {
            addCriterion("node_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNode_descEqualTo(String value) {
            addCriterion("node_desc =", value, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descNotEqualTo(String value) {
            addCriterion("node_desc <>", value, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descGreaterThan(String value) {
            addCriterion("node_desc >", value, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descGreaterThanOrEqualTo(String value) {
            addCriterion("node_desc >=", value, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descLessThan(String value) {
            addCriterion("node_desc <", value, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descLessThanOrEqualTo(String value) {
            addCriterion("node_desc <=", value, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descLike(String value) {
            addCriterion("node_desc like", value, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descNotLike(String value) {
            addCriterion("node_desc not like", value, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descIn(List<String> values) {
            addCriterion("node_desc in", values, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descNotIn(List<String> values) {
            addCriterion("node_desc not in", values, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descBetween(String value1, String value2) {
            addCriterion("node_desc between", value1, value2, "node_desc");
            return (Criteria) this;
        }

        public Criteria andNode_descNotBetween(String value1, String value2) {
            addCriterion("node_desc not between", value1, value2, "node_desc");
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