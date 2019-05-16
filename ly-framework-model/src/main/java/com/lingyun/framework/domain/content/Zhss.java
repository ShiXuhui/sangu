package com.lingyun.framework.domain.content;

import java.io.Serializable;
import java.util.Date;

public class Zhss implements Serializable{
    private Integer id;

    private String name;

    private String chuli;

    private String shenshu;

    private Integer shouji;

    private String youxiang;

    private Date shijian;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getChuli() {
        return chuli;
    }

    public void setChuli(String chuli) {
        this.chuli = chuli == null ? null : chuli.trim();
    }

    public String getShenshu() {
        return shenshu;
    }

    public void setShenshu(String shenshu) {
        this.shenshu = shenshu == null ? null : shenshu.trim();
    }

    public Integer getShouji() {
        return shouji;
    }

    public void setShouji(Integer shouji) {
        this.shouji = shouji;
    }

    public String getYouxiang() {
        return youxiang;
    }

    public void setYouxiang(String youxiang) {
        this.youxiang = youxiang == null ? null : youxiang.trim();
    }

    public Date getShijian() {
        return shijian;
    }

    public void setShijian(Date shijian) {
        this.shijian = shijian;
    }
}