package com.slwh.emr.model;

public class Dengji {
    private Integer djId;

    private String djLevel;

    public Integer getDjId() {
        return djId;
    }

    public void setDjId(Integer djId) {
        this.djId = djId;
    }

    public String getDjLevel() {
        return djLevel;
    }

    public void setDjLevel(String djLevel) {
        this.djLevel = djLevel == null ? null : djLevel.trim();
    }
}