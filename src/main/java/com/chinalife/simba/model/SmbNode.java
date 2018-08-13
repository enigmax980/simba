package com.chinalife.simba.model;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * @author 
 */

public class SmbNode implements Serializable {

    private Integer node_id;

    @NotEmpty
    private String srv_code;

    @NotEmpty
    private Integer mach_id;

    @NotEmpty
    private Integer srv_port;

    private Integer is_clstr;

    private Integer clstr_id;

    private String node_desc;

    private static final long serialVersionUID = 1L;

    public Integer getNode_id() {
        return node_id;
    }

    public void setNode_id(Integer node_id) {
        this.node_id = node_id;
    }

    public String getSrv_code() {
        return srv_code;
    }

    public void setSrv_code(String srv_code) {
        this.srv_code = srv_code;
    }

    public Integer getMach_id() {
        return mach_id;
    }

    public void setMach_id(Integer mach_id) {
        this.mach_id = mach_id;
    }

    public Integer getSrv_port() {
        return srv_port;
    }

    public void setSrv_port(Integer srv_port) {
        this.srv_port = srv_port;
    }

    public Integer getIs_clstr() {
        return is_clstr;
    }

    public void setIs_clstr(Integer is_clstr) {
        this.is_clstr = is_clstr;
    }

    public Integer getClstr_id() {
        return clstr_id;
    }

    public void setClstr_id(Integer clstr_id) {
        this.clstr_id = clstr_id;
    }

    public String getNode_desc() {
        return node_desc;
    }

    public void setNode_desc(String node_desc) {
        this.node_desc = node_desc;
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
        SmbNode other = (SmbNode) that;
        return (this.getNode_id() == null ? other.getNode_id() == null : this.getNode_id().equals(other.getNode_id()))
            && (this.getSrv_code() == null ? other.getSrv_code() == null : this.getSrv_code().equals(other.getSrv_code()))
            && (this.getMach_id() == null ? other.getMach_id() == null : this.getMach_id().equals(other.getMach_id()))
            && (this.getSrv_port() == null ? other.getSrv_port() == null : this.getSrv_port().equals(other.getSrv_port()))
            && (this.getIs_clstr() == null ? other.getIs_clstr() == null : this.getIs_clstr().equals(other.getIs_clstr()))
            && (this.getClstr_id() == null ? other.getClstr_id() == null : this.getClstr_id().equals(other.getClstr_id()))
            && (this.getNode_desc() == null ? other.getNode_desc() == null : this.getNode_desc().equals(other.getNode_desc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNode_id() == null) ? 0 : getNode_id().hashCode());
        result = prime * result + ((getSrv_code() == null) ? 0 : getSrv_code().hashCode());
        result = prime * result + ((getMach_id() == null) ? 0 : getMach_id().hashCode());
        result = prime * result + ((getSrv_port() == null) ? 0 : getSrv_port().hashCode());
        result = prime * result + ((getIs_clstr() == null) ? 0 : getIs_clstr().hashCode());
        result = prime * result + ((getClstr_id() == null) ? 0 : getClstr_id().hashCode());
        result = prime * result + ((getNode_desc() == null) ? 0 : getNode_desc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", node_id=").append(node_id);
        sb.append(", srv_code=").append(srv_code);
        sb.append(", mach_id=").append(mach_id);
        sb.append(", srv_port=").append(srv_port);
        sb.append(", is_clstr=").append(is_clstr);
        sb.append(", clstr_id=").append(clstr_id);
        sb.append(", node_desc=").append(node_desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}