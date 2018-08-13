package com.chinalife.simba.model;

import java.util.ArrayList;
import java.util.List;

public class SmbServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmbServiceExample() {
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

        public Criteria andSvc_idIsNull() {
            addCriterion("svc_id is null");
            return (Criteria) this;
        }

        public Criteria andSvc_idIsNotNull() {
            addCriterion("svc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSvc_idEqualTo(Integer value) {
            addCriterion("svc_id =", value, "svc_id");
            return (Criteria) this;
        }

        public Criteria andSvc_idNotEqualTo(Integer value) {
            addCriterion("svc_id <>", value, "svc_id");
            return (Criteria) this;
        }

        public Criteria andSvc_idGreaterThan(Integer value) {
            addCriterion("svc_id >", value, "svc_id");
            return (Criteria) this;
        }

        public Criteria andSvc_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("svc_id >=", value, "svc_id");
            return (Criteria) this;
        }

        public Criteria andSvc_idLessThan(Integer value) {
            addCriterion("svc_id <", value, "svc_id");
            return (Criteria) this;
        }

        public Criteria andSvc_idLessThanOrEqualTo(Integer value) {
            addCriterion("svc_id <=", value, "svc_id");
            return (Criteria) this;
        }

        public Criteria andSvc_idIn(List<Integer> values) {
            addCriterion("svc_id in", values, "svc_id");
            return (Criteria) this;
        }

        public Criteria andSvc_idNotIn(List<Integer> values) {
            addCriterion("svc_id not in", values, "svc_id");
            return (Criteria) this;
        }

        public Criteria andSvc_idBetween(Integer value1, Integer value2) {
            addCriterion("svc_id between", value1, value2, "svc_id");
            return (Criteria) this;
        }

        public Criteria andSvc_idNotBetween(Integer value1, Integer value2) {
            addCriterion("svc_id not between", value1, value2, "svc_id");
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

        public Criteria andSvc_nameIsNull() {
            addCriterion("svc_name is null");
            return (Criteria) this;
        }

        public Criteria andSvc_nameIsNotNull() {
            addCriterion("svc_name is not null");
            return (Criteria) this;
        }

        public Criteria andSvc_nameEqualTo(String value) {
            addCriterion("svc_name =", value, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameNotEqualTo(String value) {
            addCriterion("svc_name <>", value, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameGreaterThan(String value) {
            addCriterion("svc_name >", value, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameGreaterThanOrEqualTo(String value) {
            addCriterion("svc_name >=", value, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameLessThan(String value) {
            addCriterion("svc_name <", value, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameLessThanOrEqualTo(String value) {
            addCriterion("svc_name <=", value, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameLike(String value) {
            addCriterion("svc_name like", value, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameNotLike(String value) {
            addCriterion("svc_name not like", value, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameIn(List<String> values) {
            addCriterion("svc_name in", values, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameNotIn(List<String> values) {
            addCriterion("svc_name not in", values, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameBetween(String value1, String value2) {
            addCriterion("svc_name between", value1, value2, "svc_name");
            return (Criteria) this;
        }

        public Criteria andSvc_nameNotBetween(String value1, String value2) {
            addCriterion("svc_name not between", value1, value2, "svc_name");
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

        public Criteria andPlan_tpsIsNull() {
            addCriterion("plan_tps is null");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsIsNotNull() {
            addCriterion("plan_tps is not null");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsEqualTo(Integer value) {
            addCriterion("plan_tps =", value, "plan_tps");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsNotEqualTo(Integer value) {
            addCriterion("plan_tps <>", value, "plan_tps");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsGreaterThan(Integer value) {
            addCriterion("plan_tps >", value, "plan_tps");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_tps >=", value, "plan_tps");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsLessThan(Integer value) {
            addCriterion("plan_tps <", value, "plan_tps");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsLessThanOrEqualTo(Integer value) {
            addCriterion("plan_tps <=", value, "plan_tps");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsIn(List<Integer> values) {
            addCriterion("plan_tps in", values, "plan_tps");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsNotIn(List<Integer> values) {
            addCriterion("plan_tps not in", values, "plan_tps");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsBetween(Integer value1, Integer value2) {
            addCriterion("plan_tps between", value1, value2, "plan_tps");
            return (Criteria) this;
        }

        public Criteria andPlan_tpsNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_tps not between", value1, value2, "plan_tps");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeIsNull() {
            addCriterion("plan_resp_time is null");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeIsNotNull() {
            addCriterion("plan_resp_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeEqualTo(Integer value) {
            addCriterion("plan_resp_time =", value, "plan_resp_time");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeNotEqualTo(Integer value) {
            addCriterion("plan_resp_time <>", value, "plan_resp_time");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeGreaterThan(Integer value) {
            addCriterion("plan_resp_time >", value, "plan_resp_time");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_resp_time >=", value, "plan_resp_time");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeLessThan(Integer value) {
            addCriterion("plan_resp_time <", value, "plan_resp_time");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeLessThanOrEqualTo(Integer value) {
            addCriterion("plan_resp_time <=", value, "plan_resp_time");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeIn(List<Integer> values) {
            addCriterion("plan_resp_time in", values, "plan_resp_time");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeNotIn(List<Integer> values) {
            addCriterion("plan_resp_time not in", values, "plan_resp_time");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeBetween(Integer value1, Integer value2) {
            addCriterion("plan_resp_time between", value1, value2, "plan_resp_time");
            return (Criteria) this;
        }

        public Criteria andPlan_resp_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_resp_time not between", value1, value2, "plan_resp_time");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeIsNull() {
            addCriterion("stat_resp_time is null");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeIsNotNull() {
            addCriterion("stat_resp_time is not null");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeEqualTo(Integer value) {
            addCriterion("stat_resp_time =", value, "stat_resp_time");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeNotEqualTo(Integer value) {
            addCriterion("stat_resp_time <>", value, "stat_resp_time");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeGreaterThan(Integer value) {
            addCriterion("stat_resp_time >", value, "stat_resp_time");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat_resp_time >=", value, "stat_resp_time");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeLessThan(Integer value) {
            addCriterion("stat_resp_time <", value, "stat_resp_time");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeLessThanOrEqualTo(Integer value) {
            addCriterion("stat_resp_time <=", value, "stat_resp_time");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeIn(List<Integer> values) {
            addCriterion("stat_resp_time in", values, "stat_resp_time");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeNotIn(List<Integer> values) {
            addCriterion("stat_resp_time not in", values, "stat_resp_time");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeBetween(Integer value1, Integer value2) {
            addCriterion("stat_resp_time between", value1, value2, "stat_resp_time");
            return (Criteria) this;
        }

        public Criteria andStat_resp_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("stat_resp_time not between", value1, value2, "stat_resp_time");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtIsNull() {
            addCriterion("is_ratelmt is null");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtIsNotNull() {
            addCriterion("is_ratelmt is not null");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtEqualTo(Integer value) {
            addCriterion("is_ratelmt =", value, "is_ratelmt");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtNotEqualTo(Integer value) {
            addCriterion("is_ratelmt <>", value, "is_ratelmt");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtGreaterThan(Integer value) {
            addCriterion("is_ratelmt >", value, "is_ratelmt");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_ratelmt >=", value, "is_ratelmt");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtLessThan(Integer value) {
            addCriterion("is_ratelmt <", value, "is_ratelmt");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtLessThanOrEqualTo(Integer value) {
            addCriterion("is_ratelmt <=", value, "is_ratelmt");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtIn(List<Integer> values) {
            addCriterion("is_ratelmt in", values, "is_ratelmt");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtNotIn(List<Integer> values) {
            addCriterion("is_ratelmt not in", values, "is_ratelmt");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtBetween(Integer value1, Integer value2) {
            addCriterion("is_ratelmt between", value1, value2, "is_ratelmt");
            return (Criteria) this;
        }

        public Criteria andIs_ratelmtNotBetween(Integer value1, Integer value2) {
            addCriterion("is_ratelmt not between", value1, value2, "is_ratelmt");
            return (Criteria) this;
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