package com.chinalife.simba.model;

import java.util.ArrayList;
import java.util.List;


public class SmbSvcInvokeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmbSvcInvokeExample() {
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

        public Criteria andSvc_invk_idIsNull() {
            addCriterion("svc_invk_id is null");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idIsNotNull() {
            addCriterion("svc_invk_id is not null");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idEqualTo(Integer value) {
            addCriterion("svc_invk_id =", value, "svc_invk_id");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idNotEqualTo(Integer value) {
            addCriterion("svc_invk_id <>", value, "svc_invk_id");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idGreaterThan(Integer value) {
            addCriterion("svc_invk_id >", value, "svc_invk_id");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("svc_invk_id >=", value, "svc_invk_id");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idLessThan(Integer value) {
            addCriterion("svc_invk_id <", value, "svc_invk_id");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idLessThanOrEqualTo(Integer value) {
            addCriterion("svc_invk_id <=", value, "svc_invk_id");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idIn(List<Integer> values) {
            addCriterion("svc_invk_id in", values, "svc_invk_id");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idNotIn(List<Integer> values) {
            addCriterion("svc_invk_id not in", values, "svc_invk_id");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idBetween(Integer value1, Integer value2) {
            addCriterion("svc_invk_id between", value1, value2, "svc_invk_id");
            return (Criteria) this;
        }

        public Criteria andSvc_invk_idNotBetween(Integer value1, Integer value2) {
            addCriterion("svc_invk_id not between", value1, value2, "svc_invk_id");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeIsNull() {
            addCriterion("src_sys_code is null");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeIsNotNull() {
            addCriterion("src_sys_code is not null");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeEqualTo(String value) {
            addCriterion("src_sys_code =", value, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeNotEqualTo(String value) {
            addCriterion("src_sys_code <>", value, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeGreaterThan(String value) {
            addCriterion("src_sys_code >", value, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeGreaterThanOrEqualTo(String value) {
            addCriterion("src_sys_code >=", value, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeLessThan(String value) {
            addCriterion("src_sys_code <", value, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeLessThanOrEqualTo(String value) {
            addCriterion("src_sys_code <=", value, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeLike(String value) {
            addCriterion("src_sys_code like", value, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeNotLike(String value) {
            addCriterion("src_sys_code not like", value, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeIn(List<String> values) {
            addCriterion("src_sys_code in", values, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeNotIn(List<String> values) {
            addCriterion("src_sys_code not in", values, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeBetween(String value1, String value2) {
            addCriterion("src_sys_code between", value1, value2, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_sys_codeNotBetween(String value1, String value2) {
            addCriterion("src_sys_code not between", value1, value2, "src_sys_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeIsNull() {
            addCriterion("src_svc_code is null");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeIsNotNull() {
            addCriterion("src_svc_code is not null");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeEqualTo(String value) {
            addCriterion("src_svc_code =", value, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeNotEqualTo(String value) {
            addCriterion("src_svc_code <>", value, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeGreaterThan(String value) {
            addCriterion("src_svc_code >", value, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeGreaterThanOrEqualTo(String value) {
            addCriterion("src_svc_code >=", value, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeLessThan(String value) {
            addCriterion("src_svc_code <", value, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeLessThanOrEqualTo(String value) {
            addCriterion("src_svc_code <=", value, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeLike(String value) {
            addCriterion("src_svc_code like", value, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeNotLike(String value) {
            addCriterion("src_svc_code not like", value, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeIn(List<String> values) {
            addCriterion("src_svc_code in", values, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeNotIn(List<String> values) {
            addCriterion("src_svc_code not in", values, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeBetween(String value1, String value2) {
            addCriterion("src_svc_code between", value1, value2, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_svc_codeNotBetween(String value1, String value2) {
            addCriterion("src_svc_code not between", value1, value2, "src_svc_code");
            return (Criteria) this;
        }

        public Criteria andSrc_posIsNull() {
            addCriterion("src_pos is null");
            return (Criteria) this;
        }

        public Criteria andSrc_posIsNotNull() {
            addCriterion("src_pos is not null");
            return (Criteria) this;
        }

        public Criteria andSrc_posEqualTo(String value) {
            addCriterion("src_pos =", value, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posNotEqualTo(String value) {
            addCriterion("src_pos <>", value, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posGreaterThan(String value) {
            addCriterion("src_pos >", value, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posGreaterThanOrEqualTo(String value) {
            addCriterion("src_pos >=", value, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posLessThan(String value) {
            addCriterion("src_pos <", value, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posLessThanOrEqualTo(String value) {
            addCriterion("src_pos <=", value, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posLike(String value) {
            addCriterion("src_pos like", value, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posNotLike(String value) {
            addCriterion("src_pos not like", value, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posIn(List<String> values) {
            addCriterion("src_pos in", values, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posNotIn(List<String> values) {
            addCriterion("src_pos not in", values, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posBetween(String value1, String value2) {
            addCriterion("src_pos between", value1, value2, "src_pos");
            return (Criteria) this;
        }

        public Criteria andSrc_posNotBetween(String value1, String value2) {
            addCriterion("src_pos not between", value1, value2, "src_pos");
            return (Criteria) this;
        }

        public Criteria andIs_fuseIsNull() {
            addCriterion("is_fuse is null");
            return (Criteria) this;
        }

        public Criteria andIs_fuseIsNotNull() {
            addCriterion("is_fuse is not null");
            return (Criteria) this;
        }

        public Criteria andIs_fuseEqualTo(Integer value) {
            addCriterion("is_fuse =", value, "is_fuse");
            return (Criteria) this;
        }

        public Criteria andIs_fuseNotEqualTo(Integer value) {
            addCriterion("is_fuse <>", value, "is_fuse");
            return (Criteria) this;
        }

        public Criteria andIs_fuseGreaterThan(Integer value) {
            addCriterion("is_fuse >", value, "is_fuse");
            return (Criteria) this;
        }

        public Criteria andIs_fuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_fuse >=", value, "is_fuse");
            return (Criteria) this;
        }

        public Criteria andIs_fuseLessThan(Integer value) {
            addCriterion("is_fuse <", value, "is_fuse");
            return (Criteria) this;
        }

        public Criteria andIs_fuseLessThanOrEqualTo(Integer value) {
            addCriterion("is_fuse <=", value, "is_fuse");
            return (Criteria) this;
        }

        public Criteria andIs_fuseIn(List<Integer> values) {
            addCriterion("is_fuse in", values, "is_fuse");
            return (Criteria) this;
        }

        public Criteria andIs_fuseNotIn(List<Integer> values) {
            addCriterion("is_fuse not in", values, "is_fuse");
            return (Criteria) this;
        }

        public Criteria andIs_fuseBetween(Integer value1, Integer value2) {
            addCriterion("is_fuse between", value1, value2, "is_fuse");
            return (Criteria) this;
        }

        public Criteria andIs_fuseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_fuse not between", value1, value2, "is_fuse");
            return (Criteria) this;
        }

        public Criteria andFuse_idIsNull() {
            addCriterion("fuse_id is null");
            return (Criteria) this;
        }

        public Criteria andFuse_idIsNotNull() {
            addCriterion("fuse_id is not null");
            return (Criteria) this;
        }

        public Criteria andFuse_idEqualTo(Integer value) {
            addCriterion("fuse_id =", value, "fuse_id");
            return (Criteria) this;
        }

        public Criteria andFuse_idNotEqualTo(Integer value) {
            addCriterion("fuse_id <>", value, "fuse_id");
            return (Criteria) this;
        }

        public Criteria andFuse_idGreaterThan(Integer value) {
            addCriterion("fuse_id >", value, "fuse_id");
            return (Criteria) this;
        }

        public Criteria andFuse_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuse_id >=", value, "fuse_id");
            return (Criteria) this;
        }

        public Criteria andFuse_idLessThan(Integer value) {
            addCriterion("fuse_id <", value, "fuse_id");
            return (Criteria) this;
        }

        public Criteria andFuse_idLessThanOrEqualTo(Integer value) {
            addCriterion("fuse_id <=", value, "fuse_id");
            return (Criteria) this;
        }

        public Criteria andFuse_idIn(List<Integer> values) {
            addCriterion("fuse_id in", values, "fuse_id");
            return (Criteria) this;
        }

        public Criteria andFuse_idNotIn(List<Integer> values) {
            addCriterion("fuse_id not in", values, "fuse_id");
            return (Criteria) this;
        }

        public Criteria andFuse_idBetween(Integer value1, Integer value2) {
            addCriterion("fuse_id between", value1, value2, "fuse_id");
            return (Criteria) this;
        }

        public Criteria andFuse_idNotBetween(Integer value1, Integer value2) {
            addCriterion("fuse_id not between", value1, value2, "fuse_id");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeIsNull() {
            addCriterion("des_sys_code is null");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeIsNotNull() {
            addCriterion("des_sys_code is not null");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeEqualTo(String value) {
            addCriterion("des_sys_code =", value, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeNotEqualTo(String value) {
            addCriterion("des_sys_code <>", value, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeGreaterThan(String value) {
            addCriterion("des_sys_code >", value, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeGreaterThanOrEqualTo(String value) {
            addCriterion("des_sys_code >=", value, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeLessThan(String value) {
            addCriterion("des_sys_code <", value, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeLessThanOrEqualTo(String value) {
            addCriterion("des_sys_code <=", value, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeLike(String value) {
            addCriterion("des_sys_code like", value, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeNotLike(String value) {
            addCriterion("des_sys_code not like", value, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeIn(List<String> values) {
            addCriterion("des_sys_code in", values, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeNotIn(List<String> values) {
            addCriterion("des_sys_code not in", values, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeBetween(String value1, String value2) {
            addCriterion("des_sys_code between", value1, value2, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_sys_codeNotBetween(String value1, String value2) {
            addCriterion("des_sys_code not between", value1, value2, "des_sys_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeIsNull() {
            addCriterion("des_svc_code is null");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeIsNotNull() {
            addCriterion("des_svc_code is not null");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeEqualTo(String value) {
            addCriterion("des_svc_code =", value, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeNotEqualTo(String value) {
            addCriterion("des_svc_code <>", value, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeGreaterThan(String value) {
            addCriterion("des_svc_code >", value, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeGreaterThanOrEqualTo(String value) {
            addCriterion("des_svc_code >=", value, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeLessThan(String value) {
            addCriterion("des_svc_code <", value, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeLessThanOrEqualTo(String value) {
            addCriterion("des_svc_code <=", value, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeLike(String value) {
            addCriterion("des_svc_code like", value, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeNotLike(String value) {
            addCriterion("des_svc_code not like", value, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeIn(List<String> values) {
            addCriterion("des_svc_code in", values, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeNotIn(List<String> values) {
            addCriterion("des_svc_code not in", values, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeBetween(String value1, String value2) {
            addCriterion("des_svc_code between", value1, value2, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andDes_svc_codeNotBetween(String value1, String value2) {
            addCriterion("des_svc_code not between", value1, value2, "des_svc_code");
            return (Criteria) this;
        }

        public Criteria andTime_outIsNull() {
            addCriterion("time_out is null");
            return (Criteria) this;
        }

        public Criteria andTime_outIsNotNull() {
            addCriterion("time_out is not null");
            return (Criteria) this;
        }

        public Criteria andTime_outEqualTo(Integer value) {
            addCriterion("time_out =", value, "time_out");
            return (Criteria) this;
        }

        public Criteria andTime_outNotEqualTo(Integer value) {
            addCriterion("time_out <>", value, "time_out");
            return (Criteria) this;
        }

        public Criteria andTime_outGreaterThan(Integer value) {
            addCriterion("time_out >", value, "time_out");
            return (Criteria) this;
        }

        public Criteria andTime_outGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_out >=", value, "time_out");
            return (Criteria) this;
        }

        public Criteria andTime_outLessThan(Integer value) {
            addCriterion("time_out <", value, "time_out");
            return (Criteria) this;
        }

        public Criteria andTime_outLessThanOrEqualTo(Integer value) {
            addCriterion("time_out <=", value, "time_out");
            return (Criteria) this;
        }

        public Criteria andTime_outIn(List<Integer> values) {
            addCriterion("time_out in", values, "time_out");
            return (Criteria) this;
        }

        public Criteria andTime_outNotIn(List<Integer> values) {
            addCriterion("time_out not in", values, "time_out");
            return (Criteria) this;
        }

        public Criteria andTime_outBetween(Integer value1, Integer value2) {
            addCriterion("time_out between", value1, value2, "time_out");
            return (Criteria) this;
        }

        public Criteria andTime_outNotBetween(Integer value1, Integer value2) {
            addCriterion("time_out not between", value1, value2, "time_out");
            return (Criteria) this;
        }

        public Criteria andCall_percentIsNull() {
            addCriterion("call_percent is null");
            return (Criteria) this;
        }

        public Criteria andCall_percentIsNotNull() {
            addCriterion("call_percent is not null");
            return (Criteria) this;
        }

        public Criteria andCall_percentEqualTo(Integer value) {
            addCriterion("call_percent =", value, "call_percent");
            return (Criteria) this;
        }

        public Criteria andCall_percentNotEqualTo(Integer value) {
            addCriterion("call_percent <>", value, "call_percent");
            return (Criteria) this;
        }

        public Criteria andCall_percentGreaterThan(Integer value) {
            addCriterion("call_percent >", value, "call_percent");
            return (Criteria) this;
        }

        public Criteria andCall_percentGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_percent >=", value, "call_percent");
            return (Criteria) this;
        }

        public Criteria andCall_percentLessThan(Integer value) {
            addCriterion("call_percent <", value, "call_percent");
            return (Criteria) this;
        }

        public Criteria andCall_percentLessThanOrEqualTo(Integer value) {
            addCriterion("call_percent <=", value, "call_percent");
            return (Criteria) this;
        }

        public Criteria andCall_percentIn(List<Integer> values) {
            addCriterion("call_percent in", values, "call_percent");
            return (Criteria) this;
        }

        public Criteria andCall_percentNotIn(List<Integer> values) {
            addCriterion("call_percent not in", values, "call_percent");
            return (Criteria) this;
        }

        public Criteria andCall_percentBetween(Integer value1, Integer value2) {
            addCriterion("call_percent between", value1, value2, "call_percent");
            return (Criteria) this;
        }

        public Criteria andCall_percentNotBetween(Integer value1, Integer value2) {
            addCriterion("call_percent not between", value1, value2, "call_percent");
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