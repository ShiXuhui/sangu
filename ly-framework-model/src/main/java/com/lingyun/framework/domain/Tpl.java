package com.lingyun.framework.domain;

import java.io.Serializable;

public class Tpl implements Serializable {
    private Integer tplId;

    private Boolean tplType;

    private String tplName;

    private Boolean tplDisplay;

    private String tplDir;

    private Integer tplVal;

    public Integer getTplId() {
        return tplId;
    }

    public void setTplId(Integer tplId) {
        this.tplId = tplId;
    }

    public Boolean getTplType() {
        return tplType;
    }

    public void setTplType(Boolean tplType) {
        this.tplType = tplType;
    }

    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName == null ? null : tplName.trim();
    }

    public Boolean getTplDisplay() {
        return tplDisplay;
    }

    public void setTplDisplay(Boolean tplDisplay) {
        this.tplDisplay = tplDisplay;
    }

    public String getTplDir() {
        return tplDir;
    }

    public void setTplDir(String tplDir) {
        this.tplDir = tplDir == null ? null : tplDir.trim();
    }

    public Integer getTplVal() {
        return tplVal;
    }

    public void setTplVal(Integer tplVal) {
        this.tplVal = tplVal;
    }
}