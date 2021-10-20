package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

/* compiled from: AsyncStorageErrorUtil */
public class b {
    public static WritableMap a(String str) {
        return b(str, C0201.m82(7826));
    }

    public static WritableMap b(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(7827), str2);
        if (str != null) {
            createMap.putString(C0201.m82(7828), str);
        }
        return createMap;
    }

    public static WritableMap c(String str) {
        return b(str, C0201.m82(7829));
    }

    public static WritableMap d(String str) {
        return b(str, C0201.m82(7830));
    }
}
