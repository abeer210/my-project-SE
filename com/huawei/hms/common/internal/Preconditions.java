package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.Looper;
import vigqyno.C0201;

public final class Preconditions {
    private Preconditions() {
        throw new AssertionError(C0201.m82(19813));
    }

    private static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void checkHandlerThread(Handler handler) {
        checkHandlerThread(handler, C0201.m82(19814));
    }

    public static void checkMainThread(String str) {
        if (!a()) {
            throw new IllegalStateException(str);
        }
    }

    public static void checkNotMainThread() {
        if (a()) {
            throw new IllegalStateException(C0201.m82(19815));
        }
    }

    public static <O> O checkNotNull(O o) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(C0201.m82(19816));
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static <O> O checkNotNull(O o, Object obj) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
