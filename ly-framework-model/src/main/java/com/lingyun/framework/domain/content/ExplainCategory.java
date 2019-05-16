package com.lingyun.framework.domain.content;

import java.io.Serializable;

public class ExplainCategory implements Serializable{
    private Short id;

    private String categoryname;

    private Short categoryOrder;

    private Byte adminSet;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public Short getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(Short categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public Byte getAdminSet() {
        return adminSet;
    }

    public void setAdminSet(Byte adminSet) {
        this.adminSet = adminSet;
    }
}