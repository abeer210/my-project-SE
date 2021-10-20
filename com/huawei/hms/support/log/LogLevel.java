package com.huawei.hms.support.log;

import vigqyno.C0201;

public interface LogLevel {
    public static final int DEBUG = 0;
    public static final int ERROR = 0;
    public static final int INFO = 0;
    public static final int WARN = 0;

    static {
        C0201.m83(LogLevel.class, 541);
    }
}
