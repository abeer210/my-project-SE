package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.a;
import vigqyno.C0201;

public class ReactBridge {
    private static volatile boolean sDidInit;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    static {
        C0201.m83(ReactBridge.class, 463);
    }

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static boolean isInitialized() {
        return sDidInit;
    }

    public static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            if (!sDidInit) {
                sLoadStartTime = SystemClock.uptimeMillis();
                a.c(0, C0201.m82(19317));
                ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
                SoLoader.j(C0201.m82(19318));
                ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
                a.g(0);
                sLoadEndTime = SystemClock.uptimeMillis();
                sDidInit = true;
            }
        }
    }
}
