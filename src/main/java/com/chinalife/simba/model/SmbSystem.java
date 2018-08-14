package com.chinalife.simba.model;

import java.io.Serializable;

/**
 * @author 
 */
public class SmbSystem implements Serializable {
    private Integer sysId;

    private String sysCode;

    private String sysName;

    private String principal;

    private String architect;

    private String director;

    private String busiDept;

    private String devDept;

    private String sysDesc;

    private static final long serialVersionUID = 1L;

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
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

    public String getBusiDept() {
        return busiDept;
    }

    public void setBusiDept(String busiDept) {
        this.busiDept = busiDept;
    }

    public String getDevDept() {
        return devDept;
    }

    public void setDevDept(String devDept) {
        this.devDept = devDept;
    }

    public String getSysDesc() {
        return sysDesc;
    }

    public void setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc;
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
        return (this.getSysId() == null ? other.getSysId() == null : this.getSysId().equals(other.getSysId()))
            && (this.getSysCode() == null ? other.getSysCode() == null : this.getSysCode().equals(other.getSysCode()))
            && (this.getSysName() == null ? other.getSysName() == null : this.getSysName().equals(other.getSysName()))
            && (this.getPrincipal() == null ? other.getPrincipal() == null : this.getPrincipal().equals(other.getPrincipal()))
            && (this.getArchitect() == null ? other.getArchitect() == null : this.getArchitect().equals(other.getArchitect()))
            && (this.getDirector() == null ? other.getDirector() == null : this.getDirector().equals(other.getDirector()))
            && (this.getBusiDept() == null ? other.getBusiDept() == null : this.getBusiDept().equals(other.getBusiDept()))
            && (this.getDevDept() == null ? other.getDevDept() == null : this.getDevDept().equals(other.getDevDept()))
            && (this.getSysDesc() == null ? other.getSysDesc() == null : this.getSysDesc().equals(other.getSysDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSysId() == null) ? 0 : getSysId().hashCode());
        result = prime * result + ((getSysCode() == null) ? 0 : getSysCode().hashCode());
        result = prime * result + ((getSysName() == null) ? 0 : getSysName().hashCode());
        result = prime * result + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        result = prime * result + ((getArchitect() == null) ? 0 : getArchitect().hashCode());
        result = prime * result + ((getDirector() == null) ? 0 : getDirector().hashCode());
        result = prime * result + ((getBusiDept() == null) ? 0 : getBusiDept().hashCode());
        result = prime * result + ((getDevDept() == null) ? 0 : getDevDept().hashCode());
        result = prime * result + ((getSysDesc() == null) ? 0 : getSysDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysId=").append(sysId);
        sb.append(", sysCode=").append(sysCode);
        sb.append(", sysName=").append(sysName);
        sb.append(", principal=").append(principal);
        sb.append(", architect=").append(architect);
        sb.append(", director=").append(director);
        sb.append(", busiDept=").append(busiDept);
        sb.append(", devDept=").append(devDept);
        sb.append(", sysDesc=").append(sysDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}