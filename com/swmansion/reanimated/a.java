package com.swmansion.reanimated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: MapUtils */
public class a {
    public static int a(ReadableMap readableMap, String str, String str2) {
        try {
            return readableMap.getInt(str);
        } catch (NoSuchKeyException unused) {
            throw new JSApplicationCausedNativeException(str2);
        }
    }

    public static String b(ReadableMap readableMap, String str, String str2) {
        try {
            return readableMap.getString(str);
        } catch (NoSuchKeyException unused) {
            throw new JSApplicationCausedNativeException(str2);
        }
    }
}
