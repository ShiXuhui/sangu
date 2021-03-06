package com.lingyun.framework.domain.content;

import java.util.List;
import java.io.Serializable;

public class Notice extends PageNum implements Serializable{
    //咳咳咳小失误

    private Integer id;

    private Short typeId;

    private String title;

    private String titColor;

    private Boolean titB;

    private Byte isDisplay;

    private String isUrl;

    private String seoKeywords;

    private String seoDescription;

    private Integer click;

    private Long addtime;

    private String addtimestr;

    private Short sort;

    private String content;

    private String categoryname;

    //1 三天内 2 一周内 3 一月内 4 半年内 5 一年内
    private Long cratetime;

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getTypeId() {
        return typeId;
    }

    public void setTypeId(Short typeId) {
        this.typeId = typeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTitColor() {
        return titColor;
    }

    public void setTitColor(String titColor) {
        this.titColor = titColor == null ? null : titColor.trim();
    }

    public Boolean getTitB() {
        return titB;
    }

    public void setTitB(Boolean titB) {
        this.titB = titB;
    }

    public Byte getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Byte isDisplay) {
        this.isDisplay = isDisplay;
    }

    public String getIsUrl() {
        return isUrl;
    }

    public void setIsUrl(String isUrl) {
        this.isUrl = isUrl == null ? null : isUrl.trim();
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription == null ? null : seoDescription.trim();
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Long getAddtime() {
        return addtime;
    }

    public void setAddtime(Long addtime) {
        this.addtime = addtime;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public void setAddtimestr(String addtimestr) {
        this.addtimestr = addtimestr;
    }

    public String getAddtimestr() {
        return addtimestr;
    }

    public Long getCratetime() {
        return cratetime;
    }

    public void setCratetime(Long cratetime) {
        this.cratetime = cratetime;
    }

}