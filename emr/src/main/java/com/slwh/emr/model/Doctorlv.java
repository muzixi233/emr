package com.slwh.emr.model;

public class Doctorlv {
    private Integer dlid;

    private String dlname;

    public Integer getDlid() {
        return dlid;
    }

    public void setDlid(Integer dlid) {
        this.dlid = dlid;
    }

    public String getDlname() {
        return dlname;
    }

    public void setDlname(String dlname) {
        this.dlname = dlname == null ? null : dlname.trim();
    }
}