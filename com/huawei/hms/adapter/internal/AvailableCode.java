package com.huawei.hms.adapter.internal;

import vigqyno.C0201;

public interface AvailableCode {
    public static final int CANCELED = 0;
    public static final int ERROR_NO_ACTIVITY = 0;
    public static final int ERROR_ON_ACTIVITY_RESULT = 0;
    public static final int SERVICE_DISABLED = 0;
    public static final int SERVICE_MISSING = 0;
    public static final int SERVICE_UNSUPPORTED = 0;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 0;
    public static final int SUCCESS = 0;
    public static final int USER_IGNORE_PREVIOUS_POPUP = 0;

    static {
        C0201.m83(AvailableCode.class, 360);
    }
}
