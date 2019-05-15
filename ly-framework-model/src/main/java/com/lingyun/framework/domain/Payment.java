package com.lingyun.framework.domain;

public class Payment {
    private Integer id;

    private Integer listorder;

    private String typename;

    private String byname;

    private String pIntroduction;

    private String partnerid;

    private String ytauthkey;

    private String fee;

    private String parameter1;

    private String parameter2;

    private String parameter3;

    private Byte pInstall;

    private String notes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getListorder() {
        return listorder;
    }

    public void setListorder(Integer listorder) {
        this.listorder = listorder;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getByname() {
        return byname;
    }

    public void setByname(String byname) {
        this.byname = byname == null ? null : byname.trim();
    }

    public String getpIntroduction() {
        return pIntroduction;
    }

    public void setpIntroduction(String pIntroduction) {
        this.pIntroduction = pIntroduction == null ? null : pIntroduction.trim();
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid == null ? null : partnerid.trim();
    }

    public String getYtauthkey() {
        return ytauthkey;
    }

    public void setYtauthkey(String ytauthkey) {
        this.ytauthkey = ytauthkey == null ? null : ytauthkey.trim();
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1 == null ? null : parameter1.trim();
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2 == null ? null : parameter2.trim();
    }

    public String getParameter3() {
        return parameter3;
    }

    public void setParameter3(String parameter3) {
        this.parameter3 = parameter3 == null ? null : parameter3.trim();
    }

    public Byte getpInstall() {
        return pInstall;
    }

    public void setpInstall(Byte pInstall) {
        this.pInstall = pInstall;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}