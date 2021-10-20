package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

/* compiled from: AsyncStorageErrorUtil */
public class b {
    public static WritableMap a(String str) {
        return b(str, C0201.m82(1486));
    }

    public static WritableMap b(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(1487), str2);
        if (str != null) {
            createMap.putString(C0201.m82(1488), str);
        }
        return createMap;
    }

    public static WritableMap c(String str) {
        return b(str, C0201.m82(1489));
    }

    public static WritableMap d(String str) {
        return b(str, C0201.m82(1490));
    }
}
