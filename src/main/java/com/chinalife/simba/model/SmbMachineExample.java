package com.chinalife.simba.model;

import java.util.ArrayList;
import java.util.List;


public class SmbMachineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmbMachineExample() {
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

        public Criteria andMach_nameIsNull() {
            addCriterion("mach_name is null");
            return (Criteria) this;
        }

        public Criteria andMach_nameIsNotNull() {
            addCriterion("mach_name is not null");
            return (Criteria) this;
        }

        public Criteria andMach_nameEqualTo(String value) {
            addCriterion("mach_name =", value, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameNotEqualTo(String value) {
            addCriterion("mach_name <>", value, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameGreaterThan(String value) {
            addCriterion("mach_name >", value, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameGreaterThanOrEqualTo(String value) {
            addCriterion("mach_name >=", value, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameLessThan(String value) {
            addCriterion("mach_name <", value, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameLessThanOrEqualTo(String value) {
            addCriterion("mach_name <=", value, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameLike(String value) {
            addCriterion("mach_name like", value, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameNotLike(String value) {
            addCriterion("mach_name not like", value, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameIn(List<String> values) {
            addCriterion("mach_name in", values, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameNotIn(List<String> values) {
            addCriterion("mach_name not in", values, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameBetween(String value1, String value2) {
            addCriterion("mach_name between", value1, value2, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_nameNotBetween(String value1, String value2) {
            addCriterion("mach_name not between", value1, value2, "mach_name");
            return (Criteria) this;
        }

        public Criteria andMach_descIsNull() {
            addCriterion("mach_desc is null");
            return (Criteria) this;
        }

        public Criteria andMach_descIsNotNull() {
            addCriterion("mach_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMach_descEqualTo(String value) {
            addCriterion("mach_desc =", value, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descNotEqualTo(String value) {
            addCriterion("mach_desc <>", value, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descGreaterThan(String value) {
            addCriterion("mach_desc >", value, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descGreaterThanOrEqualTo(String value) {
            addCriterion("mach_desc >=", value, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descLessThan(String value) {
            addCriterion("mach_desc <", value, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descLessThanOrEqualTo(String value) {
            addCriterion("mach_desc <=", value, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descLike(String value) {
            addCriterion("mach_desc like", value, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descNotLike(String value) {
            addCriterion("mach_desc not like", value, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descIn(List<String> values) {
            addCriterion("mach_desc in", values, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descNotIn(List<String> values) {
            addCriterion("mach_desc not in", values, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descBetween(String value1, String value2) {
            addCriterion("mach_desc between", value1, value2, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_descNotBetween(String value1, String value2) {
            addCriterion("mach_desc not between", value1, value2, "mach_desc");
            return (Criteria) this;
        }

        public Criteria andMach_ipIsNull() {
            addCriterion("mach_ip is null");
            return (Criteria) this;
        }

        public Criteria andMach_ipIsNotNull() {
            addCriterion("mach_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMach_ipEqualTo(String value) {
            addCriterion("mach_ip =", value, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipNotEqualTo(String value) {
            addCriterion("mach_ip <>", value, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipGreaterThan(String value) {
            addCriterion("mach_ip >", value, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipGreaterThanOrEqualTo(String value) {
            addCriterion("mach_ip >=", value, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipLessThan(String value) {
            addCriterion("mach_ip <", value, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipLessThanOrEqualTo(String value) {
            addCriterion("mach_ip <=", value, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipLike(String value) {
            addCriterion("mach_ip like", value, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipNotLike(String value) {
            addCriterion("mach_ip not like", value, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipIn(List<String> values) {
            addCriterion("mach_ip in", values, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipNotIn(List<String> values) {
            addCriterion("mach_ip not in", values, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipBetween(String value1, String value2) {
            addCriterion("mach_ip between", value1, value2, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_ipNotBetween(String value1, String value2) {
            addCriterion("mach_ip not between", value1, value2, "mach_ip");
            return (Criteria) this;
        }

        public Criteria andMach_typeIsNull() {
            addCriterion("mach_type is null");
            return (Criteria) this;
        }

        public Criteria andMach_typeIsNotNull() {
            addCriterion("mach_type is not null");
            return (Criteria) this;
        }

        public Criteria andMach_typeEqualTo(String value) {
            addCriterion("mach_type =", value, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeNotEqualTo(String value) {
            addCriterion("mach_type <>", value, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeGreaterThan(String value) {
            addCriterion("mach_type >", value, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeGreaterThanOrEqualTo(String value) {
            addCriterion("mach_type >=", value, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeLessThan(String value) {
            addCriterion("mach_type <", value, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeLessThanOrEqualTo(String value) {
            addCriterion("mach_type <=", value, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeLike(String value) {
            addCriterion("mach_type like", value, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeNotLike(String value) {
            addCriterion("mach_type not like", value, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeIn(List<String> values) {
            addCriterion("mach_type in", values, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeNotIn(List<String> values) {
            addCriterion("mach_type not in", values, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeBetween(String value1, String value2) {
            addCriterion("mach_type between", value1, value2, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_typeNotBetween(String value1, String value2) {
            addCriterion("mach_type not between", value1, value2, "mach_type");
            return (Criteria) this;
        }

        public Criteria andMach_modelIsNull() {
            addCriterion("mach_model is null");
            return (Criteria) this;
        }

        public Criteria andMach_modelIsNotNull() {
            addCriterion("mach_model is not null");
            return (Criteria) this;
        }

        public Criteria andMach_modelEqualTo(String value) {
            addCriterion("mach_model =", value, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelNotEqualTo(String value) {
            addCriterion("mach_model <>", value, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelGreaterThan(String value) {
            addCriterion("mach_model >", value, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelGreaterThanOrEqualTo(String value) {
            addCriterion("mach_model >=", value, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelLessThan(String value) {
            addCriterion("mach_model <", value, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelLessThanOrEqualTo(String value) {
            addCriterion("mach_model <=", value, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelLike(String value) {
            addCriterion("mach_model like", value, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelNotLike(String value) {
            addCriterion("mach_model not like", value, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelIn(List<String> values) {
            addCriterion("mach_model in", values, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelNotIn(List<String> values) {
            addCriterion("mach_model not in", values, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelBetween(String value1, String value2) {
            addCriterion("mach_model between", value1, value2, "mach_model");
            return (Criteria) this;
        }

        public Criteria andMach_modelNotBetween(String value1, String value2) {
            addCriterion("mach_model not between", value1, value2, "mach_model");
            return (Criteria) this;
        }

        public Criteria andNet_posIsNull() {
            addCriterion("net_pos is null");
            return (Criteria) this;
        }

        public Criteria andNet_posIsNotNull() {
            addCriterion("net_pos is not null");
            return (Criteria) this;
        }

        public Criteria andNet_posEqualTo(String value) {
            addCriterion("net_pos =", value, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posNotEqualTo(String value) {
            addCriterion("net_pos <>", value, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posGreaterThan(String value) {
            addCriterion("net_pos >", value, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posGreaterThanOrEqualTo(String value) {
            addCriterion("net_pos >=", value, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posLessThan(String value) {
            addCriterion("net_pos <", value, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posLessThanOrEqualTo(String value) {
            addCriterion("net_pos <=", value, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posLike(String value) {
            addCriterion("net_pos like", value, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posNotLike(String value) {
            addCriterion("net_pos not like", value, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posIn(List<String> values) {
            addCriterion("net_pos in", values, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posNotIn(List<String> values) {
            addCriterion("net_pos not in", values, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posBetween(String value1, String value2) {
            addCriterion("net_pos between", value1, value2, "net_pos");
            return (Criteria) this;
        }

        public Criteria andNet_posNotBetween(String value1, String value2) {
            addCriterion("net_pos not between", value1, value2, "net_pos");
            return (Criteria) this;
        }

        public Criteria andOsIsNull() {
            addCriterion("os is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("os is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(String value) {
            addCriterion("os =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(String value) {
            addCriterion("os <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(String value) {
            addCriterion("os >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(String value) {
            addCriterion("os >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(String value) {
            addCriterion("os <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(String value) {
            addCriterion("os <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLike(String value) {
            addCriterion("os like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotLike(String value) {
            addCriterion("os not like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<String> values) {
            addCriterion("os in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<String> values) {
            addCriterion("os not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(String value1, String value2) {
            addCriterion("os between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(String value1, String value2) {
            addCriterion("os not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOs_verIsNull() {
            addCriterion("os_ver is null");
            return (Criteria) this;
        }

        public Criteria andOs_verIsNotNull() {
            addCriterion("os_ver is not null");
            return (Criteria) this;
        }

        public Criteria andOs_verEqualTo(String value) {
            addCriterion("os_ver =", value, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verNotEqualTo(String value) {
            addCriterion("os_ver <>", value, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verGreaterThan(String value) {
            addCriterion("os_ver >", value, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verGreaterThanOrEqualTo(String value) {
            addCriterion("os_ver >=", value, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verLessThan(String value) {
            addCriterion("os_ver <", value, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verLessThanOrEqualTo(String value) {
            addCriterion("os_ver <=", value, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verLike(String value) {
            addCriterion("os_ver like", value, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verNotLike(String value) {
            addCriterion("os_ver not like", value, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verIn(List<String> values) {
            addCriterion("os_ver in", values, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verNotIn(List<String> values) {
            addCriterion("os_ver not in", values, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verBetween(String value1, String value2) {
            addCriterion("os_ver between", value1, value2, "os_ver");
            return (Criteria) this;
        }

        public Criteria andOs_verNotBetween(String value1, String value2) {
            addCriterion("os_ver not between", value1, value2, "os_ver");
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