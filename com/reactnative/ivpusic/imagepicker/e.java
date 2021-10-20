package com.reactnative.ivpusic.imagepicker;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* compiled from: ResultCollector */
public class e {
    private Promise a;
    private int b;
    private boolean c;
    private AtomicInteger d;
    private WritableArray e;
    private boolean f;

    private synchronized boolean a() {
        if (this.f) {
            Log.w(C0201.m82(4692), C0201.m82(4693));
            return false;
        } else if (this.a != null) {
            return true;
        } else {
            Log.w(C0201.m82(4694), C0201.m82(4695));
            return false;
        }
    }

    public synchronized void b(String str, String str2) {
        if (a()) {
            String r0 = C0201.m82(4696);
            Log.e(r0, C0201.m82(4697) + str2);
            this.a.reject(str, str2);
            this.f = true;
        }
    }

    public synchronized void c(String str, Throwable th) {
        if (a()) {
            String r0 = C0201.m82(4698);
            Log.e(r0, C0201.m82(4699) + th.getMessage());
            this.a.reject(str, th);
            this.f = true;
        }
    }

    public synchronized void d(WritableMap writableMap) {
        if (a()) {
            if (this.c) {
                this.e.pushMap(writableMap);
                if (this.d.addAndGet(1) == this.b) {
                    this.a.resolve(this.e);
                    this.f = true;
                }
            } else {
                this.a.resolve(writableMap);
                this.f = true;
            }
        }
    }

    public synchronized void e(int i) {
        this.b = i;
        this.d = new AtomicInteger(0);
    }

    public synchronized void f(Promise promise, boolean z) {
        this.a = promise;
        this.c = z;
        this.f = false;
        this.b = 0;
        this.d = new AtomicInteger(0);
        if (z) {
            this.e = new WritableNativeArray();
        }
    }
}
