package com.slwh.emr.model;

public class Drug {
    private Integer drId;

    private String drNum;

    private String drName;

    private Integer drLevel;

    public Integer getDrId() {
        return drId;
    }

    public void setDrId(Integer drId) {
        this.drId = drId;
    }

    public String getDrNum() {
        return drNum;
    }

    public void setDrNum(String drNum) {
        this.drNum = drNum == null ? null : drNum.trim();
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName == null ? null : drName.trim();
    }

    public Integer getDrLevel() {
        return drLevel;
    }

    public void setDrLevel(Integer drLevel) {
        this.drLevel = drLevel;
    }
}