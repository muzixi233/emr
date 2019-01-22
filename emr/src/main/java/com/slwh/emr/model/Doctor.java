package com.slwh.emr.model;

public class Doctor {
    private Integer dId;

    private String dName;

    private String dPassword;

    private Integer dAge;

    private String dSex;

    private Integer dTel;

    private String dEmail;

    private Integer dLevel;

    private String dDept;

    private String dNum;

    private Dept dept;

    private Doctorlv doctorlv;

    public Doctorlv getDoctorlv() {
        return doctorlv;
    }

    public void setDoctorlv(Doctorlv doctorlv) {
        this.doctorlv = doctorlv;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdPassword() {
        return dPassword;
    }

    public void setdPassword(String dPassword) {
        this.dPassword = dPassword == null ? null : dPassword.trim();
    }

    public Integer getdAge() {
        return dAge;
    }

    public void setdAge(Integer dAge) {
        this.dAge = dAge;
    }

    public String getdSex() {
        return dSex;
    }

    public void setdSex(String dSex) {
        this.dSex = dSex == null ? null : dSex.trim();
    }

    public Integer getdTel() {
        return dTel;
    }

    public void setdTel(Integer dTel) {
        this.dTel = dTel;
    }

    public String getdEmail() {
        return dEmail;
    }

    public void setdEmail(String dEmail) {
        this.dEmail = dEmail == null ? null : dEmail.trim();
    }

    public Integer getdLevel() {
        return dLevel;
    }

    public void setdLevel(Integer dLevel) {
        this.dLevel = dLevel;
    }

    public String getdDept() {
        return dDept;
    }

    public void setdDept(String dDept) {
        this.dDept = dDept == null ? null : dDept.trim();
    }

    public String getdNum() {
        return dNum;
    }

    public void setdNum(String dNum) {
        this.dNum = dNum == null ? null : dNum.trim();
    }
}