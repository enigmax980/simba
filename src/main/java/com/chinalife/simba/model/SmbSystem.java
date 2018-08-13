package com.chinalife.simba.model;

import java.io.Serializable;


/**
 * @author 
 */

public class SmbSystem implements Serializable {

    private Integer sys_id;

    private String sys_code;

    private String sys_name;

    private String principal;

    private String architect;

    private String director;

    private String department;

    private String sys_desc;

    private static final long serialVersionUID = 1L;

    public Integer getSys_id() {
        return sys_id;
    }

    public void setSys_id(Integer sys_id) {
        this.sys_id = sys_id;
    }

    public String getSys_code() {
        return sys_code;
    }

    public void setSys_code(String sys_code) {
        this.sys_code = sys_code;
    }

    public String getSys_name() {
        return sys_name;
    }

    public void setSys_name(String sys_name) {
        this.sys_name = sys_name;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getArchitect() {
        return architect;
    }

    public void setArchitect(String architect) {
        this.architect = architect;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSys_desc() {
        return sys_desc;
    }

    public void setSys_desc(String sys_desc) {
        this.sys_desc = sys_desc;
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
        SmbSystem other = (SmbSystem) that;
        return (this.getSys_id() == null ? other.getSys_id() == null : this.getSys_id().equals(other.getSys_id()))
            && (this.getSys_code() == null ? other.getSys_code() == null : this.getSys_code().equals(other.getSys_code()))
            && (this.getSys_name() == null ? other.getSys_name() == null : this.getSys_name().equals(other.getSys_name()))
            && (this.getPrincipal() == null ? other.getPrincipal() == null : this.getPrincipal().equals(other.getPrincipal()))
            && (this.getArchitect() == null ? other.getArchitect() == null : this.getArchitect().equals(other.getArchitect()))
            && (this.getDirector() == null ? other.getDirector() == null : this.getDirector().equals(other.getDirector()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getSys_desc() == null ? other.getSys_desc() == null : this.getSys_desc().equals(other.getSys_desc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSys_id() == null) ? 0 : getSys_id().hashCode());
        result = prime * result + ((getSys_code() == null) ? 0 : getSys_code().hashCode());
        result = prime * result + ((getSys_name() == null) ? 0 : getSys_name().hashCode());
        result = prime * result + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        result = prime * result + ((getArchitect() == null) ? 0 : getArchitect().hashCode());
        result = prime * result + ((getDirector() == null) ? 0 : getDirector().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getSys_desc() == null) ? 0 : getSys_desc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sys_id=").append(sys_id);
        sb.append(", sys_code=").append(sys_code);
        sb.append(", sys_name=").append(sys_name);
        sb.append(", principal=").append(principal);
        sb.append(", architect=").append(architect);
        sb.append(", director=").append(director);
        sb.append(", department=").append(department);
        sb.append(", sys_desc=").append(sys_desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}