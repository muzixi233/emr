package com.slwh.emr.model;

public class Hospital {
    private Integer hId;

    private String hName;

    private String hJieshao;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName == null ? null : hName.trim();
    }

    public String gethJieshao() {
        return hJieshao;
    }

    public void sethJieshao(String hJieshao) {
        this.hJieshao = hJieshao == null ? null : hJieshao.trim();
    }
}