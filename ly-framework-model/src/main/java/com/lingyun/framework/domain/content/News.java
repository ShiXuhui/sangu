package com.lingyun.framework.domain.content;

import java.io.Serializable;

public class News implements Serializable{
    private Integer spmid;

    private Boolean spmsUsertype;

    private Boolean spmsType;

    private String message;

    private Integer dateline;

    public String getDatelineto() {
        return datelineto;
    }

    public void setDatelineto(String datelineto) {
        this.datelineto = datelineto;
    }

    private String datelineto;

    public Integer getSpmid() {
        return spmid;
    }

    public void setSpmid(Integer spmid) {
        this.spmid = spmid;
    }

    public Boolean getSpmsUsertype() {
        return spmsUsertype;
    }

    public void setSpmsUsertype(Boolean spmsUsertype) {
        this.spmsUsertype = spmsUsertype;
    }

    public Boolean getSpmsType() {
        return spmsType;
    }

    public void setSpmsType(Boolean spmsType) {
        this.spmsType = spmsType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }
}