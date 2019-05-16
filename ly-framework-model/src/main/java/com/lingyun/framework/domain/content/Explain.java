package com.lingyun.framework.domain.content;

import java.io.Serializable;

public class Explain implements Serializable{
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

    private Integer addtime;

    private Short showOrder;

    private String content;

    private String categoryname;

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

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Short getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Short showOrder) {
        this.showOrder = showOrder;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}