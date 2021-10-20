package com.huawei.hms.support.api.client;

public class SubAppInfo {
    private String subAppID;

    public SubAppInfo(SubAppInfo subAppInfo) {
        if (subAppInfo != null) {
            this.subAppID = subAppInfo.getSubAppID();
        }
    }

    public String getSubAppID() {
        return this.subAppID;
    }

    public void setSubAppID(String str) {
        this.subAppID = str;
    }

    public SubAppInfo(String str) {
        this.subAppID = str;
    }
}
