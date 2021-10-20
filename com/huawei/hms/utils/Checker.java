package com.huawei.hms.utils;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import vigqyno.C0201;

public final class Checker {
    private Checker() {
    }

    public static void assertHandlerThread(Handler handler) {
        assertHandlerThread(handler, C0201.m82(13527));
    }

    public static void assertNonEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException(C0201.m82(13528));
        }
    }

    public static <T> T assertNonNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C0201.m82(13529));
    }

    public static void assertNotUiThread(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void assertUiThread(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static String checkNonEmpty(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(C0201.m82(13530));
    }

    public static <T> T checkNonNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C0201.m82(13531));
    }

    public static int checkNonZero(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(C0201.m82(13532));
    }

    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(C0201.m82(13533));
    }

    public static void assertHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T assertNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static <T> T checkNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static int checkNonZero(int i, String str) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static long checkNotZero(long j, String str) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void assertNonEmpty(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException(String.valueOf(str2));
        }
    }

    public static String checkNonEmpty(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2));
    }
}
