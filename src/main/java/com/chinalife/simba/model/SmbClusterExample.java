package com.chinalife.simba.model;

import java.util.ArrayList;
import java.util.List;


public class SmbClusterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmbClusterExample() {
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

        public Criteria andClstr_nameIsNull() {
            addCriterion("clstr_name is null");
            return (Criteria) this;
        }

        public Criteria andClstr_nameIsNotNull() {
            addCriterion("clstr_name is not null");
            return (Criteria) this;
        }

        public Criteria andClstr_nameEqualTo(String value) {
            addCriterion("clstr_name =", value, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameNotEqualTo(String value) {
            addCriterion("clstr_name <>", value, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameGreaterThan(String value) {
            addCriterion("clstr_name >", value, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameGreaterThanOrEqualTo(String value) {
            addCriterion("clstr_name >=", value, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameLessThan(String value) {
            addCriterion("clstr_name <", value, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameLessThanOrEqualTo(String value) {
            addCriterion("clstr_name <=", value, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameLike(String value) {
            addCriterion("clstr_name like", value, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameNotLike(String value) {
            addCriterion("clstr_name not like", value, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameIn(List<String> values) {
            addCriterion("clstr_name in", values, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameNotIn(List<String> values) {
            addCriterion("clstr_name not in", values, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameBetween(String value1, String value2) {
            addCriterion("clstr_name between", value1, value2, "clstr_name");
            return (Criteria) this;
        }

        public Criteria andClstr_nameNotBetween(String value1, String value2) {
            addCriterion("clstr_name not between", value1, value2, "clstr_name");
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

        public Criteria andLb_typeIsNull() {
            addCriterion("lb_type is null");
            return (Criteria) this;
        }

        public Criteria andLb_typeIsNotNull() {
            addCriterion("lb_type is not null");
            return (Criteria) this;
        }

        public Criteria andLb_typeEqualTo(String value) {
            addCriterion("lb_type =", value, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeNotEqualTo(String value) {
            addCriterion("lb_type <>", value, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeGreaterThan(String value) {
            addCriterion("lb_type >", value, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeGreaterThanOrEqualTo(String value) {
            addCriterion("lb_type >=", value, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeLessThan(String value) {
            addCriterion("lb_type <", value, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeLessThanOrEqualTo(String value) {
            addCriterion("lb_type <=", value, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeLike(String value) {
            addCriterion("lb_type like", value, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeNotLike(String value) {
            addCriterion("lb_type not like", value, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeIn(List<String> values) {
            addCriterion("lb_type in", values, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeNotIn(List<String> values) {
            addCriterion("lb_type not in", values, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeBetween(String value1, String value2) {
            addCriterion("lb_type between", value1, value2, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_typeNotBetween(String value1, String value2) {
            addCriterion("lb_type not between", value1, value2, "lb_type");
            return (Criteria) this;
        }

        public Criteria andLb_eqpIsNull() {
            addCriterion("lb_eqp is null");
            return (Criteria) this;
        }

        public Criteria andLb_eqpIsNotNull() {
            addCriterion("lb_eqp is not null");
            return (Criteria) this;
        }

        public Criteria andLb_eqpEqualTo(String value) {
            addCriterion("lb_eqp =", value, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpNotEqualTo(String value) {
            addCriterion("lb_eqp <>", value, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpGreaterThan(String value) {
            addCriterion("lb_eqp >", value, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpGreaterThanOrEqualTo(String value) {
            addCriterion("lb_eqp >=", value, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpLessThan(String value) {
            addCriterion("lb_eqp <", value, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpLessThanOrEqualTo(String value) {
            addCriterion("lb_eqp <=", value, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpLike(String value) {
            addCriterion("lb_eqp like", value, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpNotLike(String value) {
            addCriterion("lb_eqp not like", value, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpIn(List<String> values) {
            addCriterion("lb_eqp in", values, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpNotIn(List<String> values) {
            addCriterion("lb_eqp not in", values, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpBetween(String value1, String value2) {
            addCriterion("lb_eqp between", value1, value2, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andLb_eqpNotBetween(String value1, String value2) {
            addCriterion("lb_eqp not between", value1, value2, "lb_eqp");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayIsNull() {
            addCriterion("hp_check_way is null");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayIsNotNull() {
            addCriterion("hp_check_way is not null");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayEqualTo(String value) {
            addCriterion("hp_check_way =", value, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayNotEqualTo(String value) {
            addCriterion("hp_check_way <>", value, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayGreaterThan(String value) {
            addCriterion("hp_check_way >", value, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayGreaterThanOrEqualTo(String value) {
            addCriterion("hp_check_way >=", value, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayLessThan(String value) {
            addCriterion("hp_check_way <", value, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayLessThanOrEqualTo(String value) {
            addCriterion("hp_check_way <=", value, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayLike(String value) {
            addCriterion("hp_check_way like", value, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayNotLike(String value) {
            addCriterion("hp_check_way not like", value, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayIn(List<String> values) {
            addCriterion("hp_check_way in", values, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayNotIn(List<String> values) {
            addCriterion("hp_check_way not in", values, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayBetween(String value1, String value2) {
            addCriterion("hp_check_way between", value1, value2, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andHp_check_wayNotBetween(String value1, String value2) {
            addCriterion("hp_check_way not between", value1, value2, "hp_check_way");
            return (Criteria) this;
        }

        public Criteria andLb_descIsNull() {
            addCriterion("lb_desc is null");
            return (Criteria) this;
        }

        public Criteria andLb_descIsNotNull() {
            addCriterion("lb_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLb_descEqualTo(String value) {
            addCriterion("lb_desc =", value, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descNotEqualTo(String value) {
            addCriterion("lb_desc <>", value, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descGreaterThan(String value) {
            addCriterion("lb_desc >", value, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descGreaterThanOrEqualTo(String value) {
            addCriterion("lb_desc >=", value, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descLessThan(String value) {
            addCriterion("lb_desc <", value, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descLessThanOrEqualTo(String value) {
            addCriterion("lb_desc <=", value, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descLike(String value) {
            addCriterion("lb_desc like", value, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descNotLike(String value) {
            addCriterion("lb_desc not like", value, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descIn(List<String> values) {
            addCriterion("lb_desc in", values, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descNotIn(List<String> values) {
            addCriterion("lb_desc not in", values, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descBetween(String value1, String value2) {
            addCriterion("lb_desc between", value1, value2, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andLb_descNotBetween(String value1, String value2) {
            addCriterion("lb_desc not between", value1, value2, "lb_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descIsNull() {
            addCriterion("clstr_desc is null");
            return (Criteria) this;
        }

        public Criteria andClstr_descIsNotNull() {
            addCriterion("clstr_desc is not null");
            return (Criteria) this;
        }

        public Criteria andClstr_descEqualTo(String value) {
            addCriterion("clstr_desc =", value, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descNotEqualTo(String value) {
            addCriterion("clstr_desc <>", value, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descGreaterThan(String value) {
            addCriterion("clstr_desc >", value, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descGreaterThanOrEqualTo(String value) {
            addCriterion("clstr_desc >=", value, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descLessThan(String value) {
            addCriterion("clstr_desc <", value, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descLessThanOrEqualTo(String value) {
            addCriterion("clstr_desc <=", value, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descLike(String value) {
            addCriterion("clstr_desc like", value, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descNotLike(String value) {
            addCriterion("clstr_desc not like", value, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descIn(List<String> values) {
            addCriterion("clstr_desc in", values, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descNotIn(List<String> values) {
            addCriterion("clstr_desc not in", values, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descBetween(String value1, String value2) {
            addCriterion("clstr_desc between", value1, value2, "clstr_desc");
            return (Criteria) this;
        }

        public Criteria andClstr_descNotBetween(String value1, String value2) {
            addCriterion("clstr_desc not between", value1, value2, "clstr_desc");
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