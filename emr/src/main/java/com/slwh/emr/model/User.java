package com.slwh.emr.model;

public class User {
    private Integer uId;

    private String uName;

    private String uSex;

    private Integer uAge;

    private Integer uTel;

    private Integer levelId;

    private Integer huliId;

    private String mrNum;

    private String doctorNum;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    public Integer getuTel() {
        return uTel;
    }

    public void setuTel(Integer uTel) {
        this.uTel = uTel;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getHuliId() {
        return huliId;
    }

    public void setHuliId(Integer huliId) {
        this.huliId = huliId;
    }

    public String getMrNum() {
        return mrNum;
    }

    public void setMrNum(String mrNum) {
        this.mrNum = mrNum == null ? null : mrNum.trim();
    }

    public String getDoctorNum() {
        return doctorNum;
    }

    public void setDoctorNum(String doctorNum) {
        this.doctorNum = doctorNum == null ? null : doctorNum.trim();
    }
}