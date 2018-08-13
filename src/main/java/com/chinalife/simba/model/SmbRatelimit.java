package com.chinalife.simba.model;

import java.io.Serializable;

/**
 * @author 
 */

public class SmbRatelimit implements Serializable {

    private Integer rtlmt_id;

    private String sys_code;

    private String svc_code;

    private String rate_lmt_algo;

    private String rate_lmt_thld;

    private String rate_lmt_desc;

    private static final long serialVersionUID = 1L;

    public Integer getRtlmt_id() {
        return rtlmt_id;
    }

    public void setRtlmt_id(Integer rtlmt_id) {
        this.rtlmt_id = rtlmt_id;
    }

    public String getSys_code() {
        return sys_code;
    }

    public void setSys_code(String sys_code) {
        this.sys_code = sys_code;
    }

    public String getSvc_code() {
        return svc_code;
    }

    public void setSvc_code(String svc_code) {
        this.svc_code = svc_code;
    }

    public String getRate_lmt_algo() {
        return rate_lmt_algo;
    }

    public void setRate_lmt_algo(String rate_lmt_algo) {
        this.rate_lmt_algo = rate_lmt_algo;
    }

    public String getRate_lmt_thld() {
        return rate_lmt_thld;
    }

    public void setRate_lmt_thld(String rate_lmt_thld) {
        this.rate_lmt_thld = rate_lmt_thld;
    }

    public String getRate_lmt_desc() {
        return rate_lmt_desc;
    }

    public void setRate_lmt_desc(String rate_lmt_desc) {
        this.rate_lmt_desc = rate_lmt_desc;
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
        SmbRatelimit other = (SmbRatelimit) that;
        return (this.getRtlmt_id() == null ? other.getRtlmt_id() == null : this.getRtlmt_id().equals(other.getRtlmt_id()))
            && (this.getSys_code() == null ? other.getSys_code() == null : this.getSys_code().equals(other.getSys_code()))
            && (this.getSvc_code() == null ? other.getSvc_code() == null : this.getSvc_code().equals(other.getSvc_code()))
            && (this.getRate_lmt_algo() == null ? other.getRate_lmt_algo() == null : this.getRate_lmt_algo().equals(other.getRate_lmt_algo()))
            && (this.getRate_lmt_thld() == null ? other.getRate_lmt_thld() == null : this.getRate_lmt_thld().equals(other.getRate_lmt_thld()))
            && (this.getRate_lmt_desc() == null ? other.getRate_lmt_desc() == null : this.getRate_lmt_desc().equals(other.getRate_lmt_desc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRtlmt_id() == null) ? 0 : getRtlmt_id().hashCode());
        result = prime * result + ((getSys_code() == null) ? 0 : getSys_code().hashCode());
        result = prime * result + ((getSvc_code() == null) ? 0 : getSvc_code().hashCode());
        result = prime * result + ((getRate_lmt_algo() == null) ? 0 : getRate_lmt_algo().hashCode());
        result = prime * result + ((getRate_lmt_thld() == null) ? 0 : getRate_lmt_thld().hashCode());
        result = prime * result + ((getRate_lmt_desc() == null) ? 0 : getRate_lmt_desc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rtlmt_id=").append(rtlmt_id);
        sb.append(", sys_code=").append(sys_code);
        sb.append(", svc_code=").append(svc_code);
        sb.append(", rate_lmt_algo=").append(rate_lmt_algo);
        sb.append(", rate_lmt_thld=").append(rate_lmt_thld);
        sb.append(", rate_lmt_desc=").append(rate_lmt_desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}