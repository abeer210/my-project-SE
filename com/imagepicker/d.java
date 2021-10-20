package com.imagepicker;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

/* compiled from: ResponseHelper */
public class d {
    private WritableMap a = Arguments.createMap();

    public void a() {
        this.a = Arguments.createMap();
    }

    public void b(Callback callback) {
        a();
        this.a.putBoolean(C0201.m82(2873), true);
        e(callback);
    }

    public void c(Callback callback, String str) {
        a();
        this.a.putString(C0201.m82(2874), str);
        e(callback);
    }

    public void d(Callback callback, String str) {
        a();
        this.a.putString(C0201.m82(2875), str);
        e(callback);
    }

    public void e(Callback callback) {
        if (callback != null) {
            callback.invoke(this.a);
        }
    }

    public void f(String str, boolean z) {
        this.a.putBoolean(str, z);
    }

    public void g(String str, double d) {
        this.a.putDouble(str, d);
    }

    public void h(String str, int i) {
        this.a.putInt(str, i);
    }

    public void i(String str, String str2) {
        this.a.putString(str, str2);
    }
}
