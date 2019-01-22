package com.slwh.emr.model;

import java.util.List;

public class Dept {
    private Integer deId;

    private String deNum;

    private String deName;

    private String deHospital;

    private List<Doctor> doctors;

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Integer getDeId() {
        return deId;
    }

    public void setDeId(Integer deId) {
        this.deId = deId;
    }

    public String getDeNum() {
        return deNum;
    }

    public void setDeNum(String deNum) {
        this.deNum = deNum == null ? null : deNum.trim();
    }

    public String getDeName() {
        return deName;
    }

    public void setDeName(String deName) {
        this.deName = deName == null ? null : deName.trim();
    }

    public String getDeHospital() {
        return deHospital;
    }

    public void setDeHospital(String deHospital) {
        this.deHospital = deHospital == null ? null : deHospital.trim();
    }
}