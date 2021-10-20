package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.a;
import vigqyno.C0201;

/* compiled from: FabricSoLoader */
public class b {
    private static volatile boolean a;

    static {
        C0201.m83(b.class, 369);
    }

    public static void a() {
        if (!a) {
            a.c(0, C0201.m82(17312));
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
            SoLoader.j(C0201.m82(17313));
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
            a.g(0);
            a = true;
        }
    }
}
