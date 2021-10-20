package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

public class AppInfo implements IMessageEntity {
    @Packed
    private String appID;
    @Packed
    private String packageName;

    public AppInfo() {
    }

    public String getAppID() {
        return this.appID;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public AppInfo(String str, String str2) {
        this.appID = str;
        this.packageName = str2;
    }
}
