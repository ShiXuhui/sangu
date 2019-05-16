package com.lingyun.framework.domain.content;

import java.io.Serializable;

public class NoticeCategory implements Serializable{
    private Short id;

    private String categoryname;

    private Short sort;

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

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Byte getAdminSet() {
        return adminSet;
    }

    public void setAdminSet(Byte adminSet) {
        this.adminSet = adminSet;
    }
}