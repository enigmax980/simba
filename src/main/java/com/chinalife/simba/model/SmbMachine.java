package com.chinalife.simba.model;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * @author 
 */

public class SmbMachine implements Serializable {

    private Integer mach_id;

    @NotEmpty
    private String mach_name;

    private String mach_desc;

    @NotEmpty
    private String mach_ip;

    private String mach_type;

    private String mach_model;

    private String net_pos;

    private String os;

    private String os_ver;

    private static final long serialVersionUID = 1L;

    public Integer getMach_id() {
        return mach_id;
    }

    public void setMach_id(Integer mach_id) {
        this.mach_id = mach_id;
    }

    public String getMach_name() {
        return mach_name;
    }

    public void setMach_name(String mach_name) {
        this.mach_name = mach_name;
    }

    public String getMach_desc() {
        return mach_desc;
    }

    public void setMach_desc(String mach_desc) {
        this.mach_desc = mach_desc;
    }

    public String getMach_ip() {
        return mach_ip;
    }

    public void setMach_ip(String mach_ip) {
        this.mach_ip = mach_ip;
    }

    public String getMach_type() {
        return mach_type;
    }

    public void setMach_type(String mach_type) {
        this.mach_type = mach_type;
    }

    public String getMach_model() {
        return mach_model;
    }

    public void setMach_model(String mach_model) {
        this.mach_model = mach_model;
    }

    public String getNet_pos() {
        return net_pos;
    }

    public void setNet_pos(String net_pos) {
        this.net_pos = net_pos;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs_ver() {
        return os_ver;
    }

    public void setOs_ver(String os_ver) {
        this.os_ver = os_ver;
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
        SmbMachine other = (SmbMachine) that;
        return (this.getMach_id() == null ? other.getMach_id() == null : this.getMach_id().equals(other.getMach_id()))
            && (this.getMach_name() == null ? other.getMach_name() == null : this.getMach_name().equals(other.getMach_name()))
            && (this.getMach_desc() == null ? other.getMach_desc() == null : this.getMach_desc().equals(other.getMach_desc()))
            && (this.getMach_ip() == null ? other.getMach_ip() == null : this.getMach_ip().equals(other.getMach_ip()))
            && (this.getMach_type() == null ? other.getMach_type() == null : this.getMach_type().equals(other.getMach_type()))
            && (this.getMach_model() == null ? other.getMach_model() == null : this.getMach_model().equals(other.getMach_model()))
            && (this.getNet_pos() == null ? other.getNet_pos() == null : this.getNet_pos().equals(other.getNet_pos()))
            && (this.getOs() == null ? other.getOs() == null : this.getOs().equals(other.getOs()))
            && (this.getOs_ver() == null ? other.getOs_ver() == null : this.getOs_ver().equals(other.getOs_ver()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMach_id() == null) ? 0 : getMach_id().hashCode());
        result = prime * result + ((getMach_name() == null) ? 0 : getMach_name().hashCode());
        result = prime * result + ((getMach_desc() == null) ? 0 : getMach_desc().hashCode());
        result = prime * result + ((getMach_ip() == null) ? 0 : getMach_ip().hashCode());
        result = prime * result + ((getMach_type() == null) ? 0 : getMach_type().hashCode());
        result = prime * result + ((getMach_model() == null) ? 0 : getMach_model().hashCode());
        result = prime * result + ((getNet_pos() == null) ? 0 : getNet_pos().hashCode());
        result = prime * result + ((getOs() == null) ? 0 : getOs().hashCode());
        result = prime * result + ((getOs_ver() == null) ? 0 : getOs_ver().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mach_id=").append(mach_id);
        sb.append(", mach_name=").append(mach_name);
        sb.append(", mach_desc=").append(mach_desc);
        sb.append(", mach_ip=").append(mach_ip);
        sb.append(", mach_type=").append(mach_type);
        sb.append(", mach_model=").append(mach_model);
        sb.append(", net_pos=").append(net_pos);
        sb.append(", os=").append(os);
        sb.append(", os_ver=").append(os_ver);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}