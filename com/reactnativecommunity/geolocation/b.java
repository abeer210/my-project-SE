package com.reactnativecommunity.geolocation;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

/* compiled from: PositionError */
public class b {
    public static int a;
    public static int b;
    public static int c;

    static {
        C0201.m83(b.class, 631);
    }

    public static WritableMap a(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(23016), i);
        if (str != null) {
            createMap.putString(C0201.m82(23017), str);
        }
        createMap.putInt(C0201.m82(23018), a);
        createMap.putInt(C0201.m82(23019), b);
        createMap.putInt(C0201.m82(23020), c);
        return createMap;
    }
}
