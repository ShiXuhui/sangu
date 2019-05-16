package com.lingyun.framework.domain.content;

import java.io.Serializable;

public class Hrtools implements Serializable{
    private Integer hId;

    private Short hTypeid;

    private String hFilename;

    private String hFileurl;

    private Integer hOrder;

    private String hColor;

    private Boolean hStrong;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public Short gethTypeid() {
        return hTypeid;
    }

    public void sethTypeid(Short hTypeid) {
        this.hTypeid = hTypeid;
    }

    public String gethFilename() {
        return hFilename;
    }

    public void sethFilename(String hFilename) {
        this.hFilename = hFilename == null ? null : hFilename.trim();
    }

    public String gethFileurl() {
        return hFileurl;
    }

    public void sethFileurl(String hFileurl) {
        this.hFileurl = hFileurl == null ? null : hFileurl.trim();
    }

    public Integer gethOrder() {
        return hOrder;
    }

    public void sethOrder(Integer hOrder) {
        this.hOrder = hOrder;
    }

    public String gethColor() {
        return hColor;
    }

    public void sethColor(String hColor) {
        this.hColor = hColor == null ? null : hColor.trim();
    }

    public Boolean gethStrong() {
        return hStrong;
    }

    public void sethStrong(Boolean hStrong) {
        this.hStrong = hStrong;
    }
}