package com.lingyun.framework.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

public class PhoneUser implements Serializable {
    private Integer id;

    @NotBlank(message = "手机号码不能为空")
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
    private String phoneMumber;

    private Date addtime;

    private Date lastLoginTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneMumber() {
        return phoneMumber;
    }

    public void setPhoneMumber(String phoneMumber) {
        this.phoneMumber = phoneMumber == null ? null : phoneMumber.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}