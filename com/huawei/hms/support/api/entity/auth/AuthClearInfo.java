package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import vigqyno.C0201;

public class AuthClearInfo implements IMessageEntity {
    public static final int TYPE_CLEAR_ALL = 0;
    public static final int TYPE_CLEAR_APP = 0;
    @Packed
    private String appID;
    @Packed
    private int type = 0;

    static {
        C0201.m83(AuthClearInfo.class, 623);
    }

    public String getAppID() {
        return this.appID;
    }

    public int getType() {
        return this.type;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
