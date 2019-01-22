package com.slwh.emr.model;

public class Level {
    private Integer lId;

    private String lLevel;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getlLevel() {
        return lLevel;
    }

    public void setlLevel(String lLevel) {
        this.lLevel = lLevel == null ? null : lLevel.trim();
    }
}