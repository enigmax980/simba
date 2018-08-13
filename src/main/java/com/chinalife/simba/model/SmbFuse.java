package com.chinalife.simba.model;

import java.io.Serializable;

/**
 * @author 
 */

public class SmbFuse implements Serializable {

    private Integer fs_id;

    private String fuse_desc;

    private static final long serialVersionUID = 1L;

    public Integer getFs_id() {
        return fs_id;
    }

    public void setFs_id(Integer fs_id) {
        this.fs_id = fs_id;
    }

    public String getFuse_desc() {
        return fuse_desc;
    }

    public void setFuse_desc(String fuse_desc) {
        this.fuse_desc = fuse_desc;
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
        SmbFuse other = (SmbFuse) that;
        return (this.getFs_id() == null ? other.getFs_id() == null : this.getFs_id().equals(other.getFs_id()))
            && (this.getFuse_desc() == null ? other.getFuse_desc() == null : this.getFuse_desc().equals(other.getFuse_desc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFs_id() == null) ? 0 : getFs_id().hashCode());
        result = prime * result + ((getFuse_desc() == null) ? 0 : getFuse_desc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fs_id=").append(fs_id);
        sb.append(", fuse_desc=").append(fuse_desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}