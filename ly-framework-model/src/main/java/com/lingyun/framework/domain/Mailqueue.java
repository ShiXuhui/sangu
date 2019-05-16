package com.lingyun.framework.domain;

import java.io.Serializable;

public class Mailqueue implements Serializable{
    private Integer mId;

    private Byte mType;

    private Integer mAddtime;

    private Integer mSendtime;

    private Integer mUid;

    private String mMail;

    private String mSubject;

    private String mBody;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Byte getmType() {
        return mType;
    }

    public void setmType(Byte mType) {
        this.mType = mType;
    }

    public Integer getmAddtime() {
        return mAddtime;
    }

    public void setmAddtime(Integer mAddtime) {
        this.mAddtime = mAddtime;
    }

    public Integer getmSendtime() {
        return mSendtime;
    }

    public void setmSendtime(Integer mSendtime) {
        this.mSendtime = mSendtime;
    }

    public Integer getmUid() {
        return mUid;
    }

    public void setmUid(Integer mUid) {
        this.mUid = mUid;
    }

    public String getmMail() {
        return mMail;
    }

    public void setmMail(String mMail) {
        this.mMail = mMail == null ? null : mMail.trim();
    }

    public String getmSubject() {
        return mSubject;
    }

    public void setmSubject(String mSubject) {
        this.mSubject = mSubject == null ? null : mSubject.trim();
    }

    public String getmBody() {
        return mBody;
    }

    public void setmBody(String mBody) {
        this.mBody = mBody == null ? null : mBody.trim();
    }
}