package com.lingyun.framework.domain;

import java.io.Serializable;
import java.util.List;

public class District implements Serializable {
    private Integer id;

    private Integer parentid;

    private String categoryname;

    private Short categoryOrder;

    private String statJobs;

    private String statResume;

    private String spell;
    private List<District> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public Short getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(Short categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public String getStatJobs() {
        return statJobs;
    }

    public void setStatJobs(String statJobs) {
        this.statJobs = statJobs;
    }

    public String getStatResume() {
        return statResume;
    }

    public void setStatResume(String statResume) {
        this.statResume = statResume;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public List<District> getChildren() {
        return children;
    }

    public void setChildren(List<District> children) {
        this.children = children;
    }


    public District(){}


    public District(Integer id, Integer parentid, String categoryname, Short categoryOrder, String statJobs, String statResume, String spell, List<District> children) {
        this.id = id;
        this.parentid = parentid;
        this.categoryname = categoryname;
        this.categoryOrder = categoryOrder;
        this.statJobs = statJobs;
        this.statResume = statResume;
        this.spell = spell;
        this.children = children;
    }
}