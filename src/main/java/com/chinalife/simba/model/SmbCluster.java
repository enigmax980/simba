package com.chinalife.simba.model;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * @author 
 */
public class SmbCluster implements Serializable {

    private Integer clstr_id;

    @NotEmpty
    private String clstr_name;

    @NotEmpty
    private String sys_code;

    @NotEmpty
    private String srv_code;

    private Integer srv_port;

    @NotEmpty
    private String lb_type;

    @NotEmpty
    private String lb_eqp;

    @NotEmpty
    private String hp_check_way;

    private String lb_desc;

    private String clstr_desc;

    private static final long serialVersionUID = 1L;

    public Integer getClstr_id() {
        return clstr_id;
    }

    public void setClstr_id(Integer clstr_id) {
        this.clstr_id = clstr_id;
    }

    public String getClstr_name() {
        return clstr_name;
    }

    public void setClstr_name(String clstr_name) {
        this.clstr_name = clstr_name;
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

    public Integer getSrv_port() {
        return srv_port;
    }

    public void setSrv_port(Integer srv_port) {
        this.srv_port = srv_port;
    }

    public String getLb_type() {
        return lb_type;
    }

    public void setLb_type(String lb_type) {
        this.lb_type = lb_type;
    }

    public String getLb_eqp() {
        return lb_eqp;
    }

    public void setLb_eqp(String lb_eqp) {
        this.lb_eqp = lb_eqp;
    }

    public String getHp_check_way() {
        return hp_check_way;
    }

    public void setHp_check_way(String hp_check_way) {
        this.hp_check_way = hp_check_way;
    }

    public String getLb_desc() {
        return lb_desc;
    }

    public void setLb_desc(String lb_desc) {
        this.lb_desc = lb_desc;
    }

    public String getClstr_desc() {
        return clstr_desc;
    }

    public void setClstr_desc(String clstr_desc) {
        this.clstr_desc = clstr_desc;
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
        SmbCluster other = (SmbCluster) that;
        return (this.getClstr_id() == null ? other.getClstr_id() == null : this.getClstr_id().equals(other.getClstr_id()))
            && (this.getClstr_name() == null ? other.getClstr_name() == null : this.getClstr_name().equals(other.getClstr_name()))
            && (this.getSys_code() == null ? other.getSys_code() == null : this.getSys_code().equals(other.getSys_code()))
            && (this.getSrv_code() == null ? other.getSrv_code() == null : this.getSrv_code().equals(other.getSrv_code()))
            && (this.getSrv_port() == null ? other.getSrv_port() == null : this.getSrv_port().equals(other.getSrv_port()))
            && (this.getLb_type() == null ? other.getLb_type() == null : this.getLb_type().equals(other.getLb_type()))
            && (this.getLb_eqp() == null ? other.getLb_eqp() == null : this.getLb_eqp().equals(other.getLb_eqp()))
            && (this.getHp_check_way() == null ? other.getHp_check_way() == null : this.getHp_check_way().equals(other.getHp_check_way()))
            && (this.getLb_desc() == null ? other.getLb_desc() == null : this.getLb_desc().equals(other.getLb_desc()))
            && (this.getClstr_desc() == null ? other.getClstr_desc() == null : this.getClstr_desc().equals(other.getClstr_desc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClstr_id() == null) ? 0 : getClstr_id().hashCode());
        result = prime * result + ((getClstr_name() == null) ? 0 : getClstr_name().hashCode());
        result = prime * result + ((getSys_code() == null) ? 0 : getSys_code().hashCode());
        result = prime * result + ((getSrv_code() == null) ? 0 : getSrv_code().hashCode());
        result = prime * result + ((getSrv_port() == null) ? 0 : getSrv_port().hashCode());
        result = prime * result + ((getLb_type() == null) ? 0 : getLb_type().hashCode());
        result = prime * result + ((getLb_eqp() == null) ? 0 : getLb_eqp().hashCode());
        result = prime * result + ((getHp_check_way() == null) ? 0 : getHp_check_way().hashCode());
        result = prime * result + ((getLb_desc() == null) ? 0 : getLb_desc().hashCode());
        result = prime * result + ((getClstr_desc() == null) ? 0 : getClstr_desc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clstr_id=").append(clstr_id);
        sb.append(", clstr_name=").append(clstr_name);
        sb.append(", sys_code=").append(sys_code);
        sb.append(", srv_code=").append(srv_code);
        sb.append(", srv_port=").append(srv_port);
        sb.append(", lb_type=").append(lb_type);
        sb.append(", lb_eqp=").append(lb_eqp);
        sb.append(", hp_check_way=").append(hp_check_way);
        sb.append(", lb_desc=").append(lb_desc);
        sb.append(", clstr_desc=").append(clstr_desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}