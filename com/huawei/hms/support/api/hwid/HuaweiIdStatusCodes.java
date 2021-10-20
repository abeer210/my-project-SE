package com.huawei.hms.support.api.hwid;

import vigqyno.C0201;

public interface HuaweiIdStatusCodes {
    public static final int SIGN_IN_AUTH = 0;
    public static final int SIGN_IN_CHECK_PASSWORD = 0;
    public static final int SIGN_IN_NETWORK_ERROR = 0;
    public static final int SIGN_IN_SUCCESS = 0;
    public static final int SIGN_IN_UNLOGIN = 0;

    static {
        C0201.m83(HuaweiIdStatusCodes.class, 507);
    }
}
