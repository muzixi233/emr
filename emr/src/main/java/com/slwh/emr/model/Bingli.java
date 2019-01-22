package com.slwh.emr.model;

public class Bingli {
    private Integer blId;

    private String blNum;

    private String blStyle;

    private String blMsg;

    private Integer blState;

    private String blHistory;

    private Integer blUser;

    private String blDoctor;

    private String blDrug;

    public Integer getBlId() {
        return blId;
    }

    public void setBlId(Integer blId) {
        this.blId = blId;
    }

    public String getBlNum() {
        return blNum;
    }

    public void setBlNum(String blNum) {
        this.blNum = blNum == null ? null : blNum.trim();
    }

    public String getBlStyle() {
        return blStyle;
    }

    public void setBlStyle(String blStyle) {
        this.blStyle = blStyle == null ? null : blStyle.trim();
    }

    public String getBlMsg() {
        return blMsg;
    }

    public void setBlMsg(String blMsg) {
        this.blMsg = blMsg == null ? null : blMsg.trim();
    }

    public Integer getBlState() {
        return blState;
    }

    public void setBlState(Integer blState) {
        this.blState = blState;
    }

    public String getBlHistory() {
        return blHistory;
    }

    public void setBlHistory(String blHistory) {
        this.blHistory = blHistory == null ? null : blHistory.trim();
    }

    public Integer getBlUser() {
        return blUser;
    }

    public void setBlUser(Integer blUser) {
        this.blUser = blUser;
    }

    public String getBlDoctor() {
        return blDoctor;
    }

    public void setBlDoctor(String blDoctor) {
        this.blDoctor = blDoctor == null ? null : blDoctor.trim();
    }

    public String getBlDrug() {
        return blDrug;
    }

    public void setBlDrug(String blDrug) {
        this.blDrug = blDrug == null ? null : blDrug.trim();
    }
}