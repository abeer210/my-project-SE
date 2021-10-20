package com.facebook.react.bridge;

import android.os.Handler;
import android.os.Looper;
import vigqyno.C0201;

public class UiThreadUtil {
    private static Handler sMainHandler;

    public static void assertNotOnUiThread() {
        SoftAssertions.assertCondition(!isOnUiThread(), C0201.m82(22559));
    }

    public static void assertOnUiThread() {
        SoftAssertions.assertCondition(isOnUiThread(), C0201.m82(22560));
    }

    public static boolean isOnUiThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(runnable, 0);
    }

    public static void runOnUiThread(Runnable runnable, long j) {
        synchronized (UiThreadUtil.class) {
            if (sMainHandler == null) {
                sMainHandler = new Handler(Looper.getMainLooper());
            }
        }
        sMainHandler.postDelayed(runnable, j);
    }
}
