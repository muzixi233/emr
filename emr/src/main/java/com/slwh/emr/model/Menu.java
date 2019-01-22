package com.slwh.emr.model;

public class Menu {
    private Integer mId;

    private String mName;

    private String mQuanxian;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmQuanxian() {
        return mQuanxian;
    }

    public void setmQuanxian(String mQuanxian) {
        this.mQuanxian = mQuanxian == null ? null : mQuanxian.trim();
    }
}