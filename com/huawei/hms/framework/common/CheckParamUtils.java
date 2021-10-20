package com.huawei.hms.framework.common;

import vigqyno.C0201;

public class CheckParamUtils {
    private static final String TAG = null;

    static {
        C0201.m83(CheckParamUtils.class, 431);
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int checkNumParam(int i, int i2, int i3, int i4, String str) {
        if (i > i3 || i < i2) {
            return i4;
        }
        Logger.d(C0201.m82(15480), str);
        return i;
    }

    public static long checkNumParam(long j, long j2, long j3, long j4, String str) {
        if (j > j3 || j < j2) {
            return j4;
        }
        Logger.d(C0201.m82(15481), str);
        return j;
    }

    public static void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
