package com.chinalife.simba.model;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * @author 
 */

public class SmbService implements Serializable {

    private Integer svc_id;

    @NotEmpty
    private String svc_code;

    @NotEmpty
    private String svc_name;

    @NotEmpty
    private String sys_code;

    @NotEmpty
    private String srv_code;

    private Integer plan_tps;

    private Integer plan_resp_time;

    private Integer stat_resp_time;

    @NotEmpty
    private Integer is_ratelmt;

    private Integer rtlmt_id;

    private static final long serialVersionUID = 1L;

    public Integer getSvc_id() {
        return svc_id;
    }

    public void setSvc_id(Integer svc_id) {
        this.svc_id = svc_id;
    }

    public String getSvc_code() {
        return svc_code;
    }

    public void setSvc_code(String svc_code) {
        this.svc_code = svc_code;
    }

    public String getSvc_name() {
        return svc_name;
    }

    public void setSvc_name(String svc_name) {
        this.svc_name = svc_name;
    }

    public String getSys_code() {
        return sys_code;
    }

    public void setSys_code(String sys_code) {
        this.sys_code = sys_code;
    }

    public String getSrv_code() {
        return srv_code;
    }

    public void setSrv_code(String srv_code) {
        this.srv_code = srv_code;
    }

    public Integer getPlan_tps() {
        return plan_tps;
    }

    public void setPlan_tps(Integer plan_tps) {
        this.plan_tps = plan_tps;
    }

    public Integer getPlan_resp_time() {
        return plan_resp_time;
    }

    public void setPlan_resp_time(Integer plan_resp_time) {
        this.plan_resp_time = plan_resp_time;
    }

    public Integer getStat_resp_time() {
        return stat_resp_time;
    }

    public void setStat_resp_time(Integer stat_resp_time) {
        this.stat_resp_time = stat_resp_time;
    }

    public Integer getIs_ratelmt() {
        return is_ratelmt;
    }

    public void setIs_ratelmt(Integer is_ratelmt) {
        this.is_ratelmt = is_ratelmt;
    }

    public Integer getRtlmt_id() {
        return rtlmt_id;
    }

    public void setRtlmt_id(Integer rtlmt_id) {
        this.rtlmt_id = rtlmt_id;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SmbService other = (SmbService) that;
        return (this.getSvc_id() == null ? other.getSvc_id() == null : this.getSvc_id().equals(other.getSvc_id()))
            && (this.getSvc_code() == null ? other.getSvc_code() == null : this.getSvc_code().equals(other.getSvc_code()))
            && (this.getSvc_name() == null ? other.getSvc_name() == null : this.getSvc_name().equals(other.getSvc_name()))
            && (this.getSys_code() == null ? other.getSys_code() == null : this.getSys_code().equals(other.getSys_code()))
            && (this.getSrv_code() == null ? other.getSrv_code() == null : this.getSrv_code().equals(other.getSrv_code()))
            && (this.getPlan_tps() == null ? other.getPlan_tps() == null : this.getPlan_tps().equals(other.getPlan_tps()))
            && (this.getPlan_resp_time() == null ? other.getPlan_resp_time() == null : this.getPlan_resp_time().equals(other.getPlan_resp_time()))
            && (this.getStat_resp_time() == null ? other.getStat_resp_time() == null : this.getStat_resp_time().equals(other.getStat_resp_time()))
            && (this.getIs_ratelmt() == null ? other.getIs_ratelmt() == null : this.getIs_ratelmt().equals(other.getIs_ratelmt()))
            && (this.getRtlmt_id() == null ? other.getRtlmt_id() == null : this.getRtlmt_id().equals(other.getRtlmt_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvc_id() == null) ? 0 : getSvc_id().hashCode());
        result = prime * result + ((getSvc_code() == null) ? 0 : getSvc_code().hashCode());
        result = prime * result + ((getSvc_name() == null) ? 0 : getSvc_name().hashCode());
        result = prime * result + ((getSys_code() == null) ? 0 : getSys_code().hashCode());
        result = prime * result + ((getSrv_code() == null) ? 0 : getSrv_code().hashCode());
        result = prime * result + ((getPlan_tps() == null) ? 0 : getPlan_tps().hashCode());
        result = prime * result + ((getPlan_resp_time() == null) ? 0 : getPlan_resp_time().hashCode());
        result = prime * result + ((getStat_resp_time() == null) ? 0 : getStat_resp_time().hashCode());
        result = prime * result + ((getIs_ratelmt() == null) ? 0 : getIs_ratelmt().hashCode());
        result = prime * result + ((getRtlmt_id() == null) ? 0 : getRtlmt_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svc_id=").append(svc_id);
        sb.append(", svc_code=").append(svc_code);
        sb.append(", svc_name=").append(svc_name);
        sb.append(", sys_code=").append(sys_code);
        sb.append(", srv_code=").append(srv_code);
        sb.append(", plan_tps=").append(plan_tps);
        sb.append(", plan_resp_time=").append(plan_resp_time);
        sb.append(", stat_resp_time=").append(stat_resp_time);
        sb.append(", is_ratelmt=").append(is_ratelmt);
        sb.append(", rtlmt_id=").append(rtlmt_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}