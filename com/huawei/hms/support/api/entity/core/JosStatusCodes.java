package com.huawei.hms.support.api.entity.core;

import vigqyno.C0201;

public class JosStatusCodes {
    public static final int RNT_CODE_NETWORK_ERROR = 0;
    public static final int RNT_CODE_NO_JOS_INFO = 0;
    public static final int RNT_CODE_SERVER_ERROR = 0;
    public static final int RTN_CODE_COMMON_ERROR = 0;
    public static final int RTN_CODE_NO_SUPPORT_JOS = 0;
    public static final int RTN_CODE_PARAMS_ERROR = 0;
    public static final int SUCCESS = 0;

    static {
        C0201.m83(JosStatusCodes.class, 495);
    }
}
