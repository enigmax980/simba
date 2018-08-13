package com.chinalife.simba.model;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * @author 
 */

public class SmbSvcInvoke implements Serializable {

    private Integer svc_invk_id;

    @NotEmpty
    private String src_sys_code;

    @NotEmpty
    private String src_svc_code;

    @NotEmpty
    private String src_pos;

    private Integer is_fuse;

    private Integer fuse_id;

    @NotEmpty
    private String des_sys_code;

    @NotEmpty
    private String des_svc_code;

    private Integer time_out;

    private Integer call_percent;

    private static final long serialVersionUID = 1L;

    public Integer getSvc_invk_id() {
        return svc_invk_id;
    }

    public void setSvc_invk_id(Integer svc_invk_id) {
        this.svc_invk_id = svc_invk_id;
    }

    public String getSrc_sys_code() {
        return src_sys_code;
    }

    public void setSrc_sys_code(String src_sys_code) {
        this.src_sys_code = src_sys_code;
    }

    public String getSrc_svc_code() {
        return src_svc_code;
    }

    public void setSrc_svc_code(String src_svc_code) {
        this.src_svc_code = src_svc_code;
    }

    public String getSrc_pos() {
        return src_pos;
    }

    public void setSrc_pos(String src_pos) {
        this.src_pos = src_pos;
    }

    public Integer getIs_fuse() {
        return is_fuse;
    }

    public void setIs_fuse(Integer is_fuse) {
        this.is_fuse = is_fuse;
    }

    public Integer getFuse_id() {
        return fuse_id;
    }

    public void setFuse_id(Integer fuse_id) {
        this.fuse_id = fuse_id;
    }

    public String getDes_sys_code() {
        return des_sys_code;
    }

    public void setDes_sys_code(String des_sys_code) {
        this.des_sys_code = des_sys_code;
    }

    public String getDes_svc_code() {
        return des_svc_code;
    }

    public void setDes_svc_code(String des_svc_code) {
        this.des_svc_code = des_svc_code;
    }

    public Integer getTime_out() {
        return time_out;
    }

    public void setTime_out(Integer time_out) {
        this.time_out = time_out;
    }

    public Integer getCall_percent() {
        return call_percent;
    }

    public void setCall_percent(Integer call_percent) {
        this.call_percent = call_percent;
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
        SmbSvcInvoke other = (SmbSvcInvoke) that;
        return (this.getSvc_invk_id() == null ? other.getSvc_invk_id() == null : this.getSvc_invk_id().equals(other.getSvc_invk_id()))
            && (this.getSrc_sys_code() == null ? other.getSrc_sys_code() == null : this.getSrc_sys_code().equals(other.getSrc_sys_code()))
            && (this.getSrc_svc_code() == null ? other.getSrc_svc_code() == null : this.getSrc_svc_code().equals(other.getSrc_svc_code()))
            && (this.getSrc_pos() == null ? other.getSrc_pos() == null : this.getSrc_pos().equals(other.getSrc_pos()))
            && (this.getIs_fuse() == null ? other.getIs_fuse() == null : this.getIs_fuse().equals(other.getIs_fuse()))
            && (this.getFuse_id() == null ? other.getFuse_id() == null : this.getFuse_id().equals(other.getFuse_id()))
            && (this.getDes_sys_code() == null ? other.getDes_sys_code() == null : this.getDes_sys_code().equals(other.getDes_sys_code()))
            && (this.getDes_svc_code() == null ? other.getDes_svc_code() == null : this.getDes_svc_code().equals(other.getDes_svc_code()))
            && (this.getTime_out() == null ? other.getTime_out() == null : this.getTime_out().equals(other.getTime_out()))
            && (this.getCall_percent() == null ? other.getCall_percent() == null : this.getCall_percent().equals(other.getCall_percent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvc_invk_id() == null) ? 0 : getSvc_invk_id().hashCode());
        result = prime * result + ((getSrc_sys_code() == null) ? 0 : getSrc_sys_code().hashCode());
        result = prime * result + ((getSrc_svc_code() == null) ? 0 : getSrc_svc_code().hashCode());
        result = prime * result + ((getSrc_pos() == null) ? 0 : getSrc_pos().hashCode());
        result = prime * result + ((getIs_fuse() == null) ? 0 : getIs_fuse().hashCode());
        result = prime * result + ((getFuse_id() == null) ? 0 : getFuse_id().hashCode());
        result = prime * result + ((getDes_sys_code() == null) ? 0 : getDes_sys_code().hashCode());
        result = prime * result + ((getDes_svc_code() == null) ? 0 : getDes_svc_code().hashCode());
        result = prime * result + ((getTime_out() == null) ? 0 : getTime_out().hashCode());
        result = prime * result + ((getCall_percent() == null) ? 0 : getCall_percent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svc_invk_id=").append(svc_invk_id);
        sb.append(", src_sys_code=").append(src_sys_code);
        sb.append(", src_svc_code=").append(src_svc_code);
        sb.append(", src_pos=").append(src_pos);
        sb.append(", is_fuse=").append(is_fuse);
        sb.append(", fuse_id=").append(fuse_id);
        sb.append(", des_sys_code=").append(des_sys_code);
        sb.append(", des_svc_code=").append(des_svc_code);
        sb.append(", time_out=").append(time_out);
        sb.append(", call_percent=").append(call_percent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}