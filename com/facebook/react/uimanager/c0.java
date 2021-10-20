package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: ReactStylesDiffMap */
public class c0 {
    public final ReadableMap a;

    public c0(ReadableMap readableMap) {
        this.a = readableMap;
    }

    public ReadableArray a(String str) {
        return this.a.getArray(str);
    }

    public boolean b(String str, boolean z) {
        return this.a.isNull(str) ? z : this.a.getBoolean(str);
    }

    public float c(String str, float f) {
        return this.a.isNull(str) ? f : (float) this.a.getDouble(str);
    }

    public int d(String str, int i) {
        return this.a.isNull(str) ? i : this.a.getInt(str);
    }

    public ReadableMap e(String str) {
        return this.a.getMap(str);
    }

    public String f(String str) {
        return this.a.getString(str);
    }

    public boolean g(String str) {
        return this.a.hasKey(str);
    }

    public String toString() {
        return C0201.m82(10431) + c0.class.getSimpleName() + C0201.m82(10432) + this.a.toString() + C0201.m82(10433);
    }
}
