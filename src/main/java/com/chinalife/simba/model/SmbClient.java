package com.chinalife.simba.model;

import java.io.Serializable;


/**
 * @author 
 */

public class SmbClient implements Serializable {

    private Integer clnt_id;

    private String clnt_code;

    private String clnt_name;

    private String sys_code;

    private String srv_code;

    private static final long serialVersionUID = 1L;

    public Integer getClnt_id() {
        return clnt_id;
    }

    public void setClnt_id(Integer clnt_id) {
        this.clnt_id = clnt_id;
    }

    public String getClnt_code() {
        return clnt_code;
    }

    public void setClnt_code(String clnt_code) {
        this.clnt_code = clnt_code;
    }

    public String getClnt_name() {
        return clnt_name;
    }

    public void setClnt_name(String clnt_name) {
        this.clnt_name = clnt_name;
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
        SmbClient other = (SmbClient) that;
        return (this.getClnt_id() == null ? other.getClnt_id() == null : this.getClnt_id().equals(other.getClnt_id()))
            && (this.getClnt_code() == null ? other.getClnt_code() == null : this.getClnt_code().equals(other.getClnt_code()))
            && (this.getClnt_name() == null ? other.getClnt_name() == null : this.getClnt_name().equals(other.getClnt_name()))
            && (this.getSys_code() == null ? other.getSys_code() == null : this.getSys_code().equals(other.getSys_code()))
            && (this.getSrv_code() == null ? other.getSrv_code() == null : this.getSrv_code().equals(other.getSrv_code()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClnt_id() == null) ? 0 : getClnt_id().hashCode());
        result = prime * result + ((getClnt_code() == null) ? 0 : getClnt_code().hashCode());
        result = prime * result + ((getClnt_name() == null) ? 0 : getClnt_name().hashCode());
        result = prime * result + ((getSys_code() == null) ? 0 : getSys_code().hashCode());
        result = prime * result + ((getSrv_code() == null) ? 0 : getSrv_code().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clnt_id=").append(clnt_id);
        sb.append(", clnt_code=").append(clnt_code);
        sb.append(", clnt_name=").append(clnt_name);
        sb.append(", sys_code=").append(sys_code);
        sb.append(", srv_code=").append(srv_code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}