package com.huawei.hms.adapter.internal;

import vigqyno.C0201;

public interface ConnectCode {
    public static final int CONNECT_RESULT_NULL = 0;
    public static final int OK = 0;
    public static final int PARAM_ERROR = 0;

    static {
        C0201.m83(ConnectCode.class, 429);
    }
}
