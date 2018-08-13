package com.chinalife.simba.model;

import java.io.Serializable;

/**
 * @author 
 */

public class SmbServer implements Serializable {

    private Integer srv_id;

    private String srv_code;

    private String srv_name;

    private String sys_code;

    private String srv_desc;

    private static final long serialVersionUID = 1L;

    public Integer getSrv_id() {
        return srv_id;
    }

    public void setSrv_id(Integer srv_id) {
        this.srv_id = srv_id;
    }

    public String getSrv_code() {
        return srv_code;
    }

    public void setSrv_code(String srv_code) {
        this.srv_code = srv_code;
    }

    public String getSrv_name() {
        return srv_name;
    }

    public void setSrv_name(String srv_name) {
        this.srv_name = srv_name;
    }

    public String getSys_code() {
        return sys_code;
    }

    public void setSys_code(String sys_code) {
        this.sys_code = sys_code;
    }

    public String getSrv_desc() {
        return srv_desc;
    }

    public void setSrv_desc(String srv_desc) {
        this.srv_desc = srv_desc;
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
        SmbServer other = (SmbServer) that;
        return (this.getSrv_id() == null ? other.getSrv_id() == null : this.getSrv_id().equals(other.getSrv_id()))
            && (this.getSrv_code() == null ? other.getSrv_code() == null : this.getSrv_code().equals(other.getSrv_code()))
            && (this.getSrv_name() == null ? other.getSrv_name() == null : this.getSrv_name().equals(other.getSrv_name()))
            && (this.getSys_code() == null ? other.getSys_code() == null : this.getSys_code().equals(other.getSys_code()))
            && (this.getSrv_desc() == null ? other.getSrv_desc() == null : this.getSrv_desc().equals(other.getSrv_desc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSrv_id() == null) ? 0 : getSrv_id().hashCode());
        result = prime * result + ((getSrv_code() == null) ? 0 : getSrv_code().hashCode());
        result = prime * result + ((getSrv_name() == null) ? 0 : getSrv_name().hashCode());
        result = prime * result + ((getSys_code() == null) ? 0 : getSys_code().hashCode());
        result = prime * result + ((getSrv_desc() == null) ? 0 : getSrv_desc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", srv_id=").append(srv_id);
        sb.append(", srv_code=").append(srv_code);
        sb.append(", srv_name=").append(srv_name);
        sb.append(", sys_code=").append(sys_code);
        sb.append(", srv_desc=").append(srv_desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}