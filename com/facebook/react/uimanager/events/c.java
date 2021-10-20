package com.facebook.react.uimanager.events;

import com.facebook.react.common.h;
import com.facebook.react.uimanager.events.c;

/* compiled from: Event */
public abstract class c<T extends c> {
    private static int e;
    private boolean a;
    private int b;
    private long c;
    private int d;

    public c() {
        int i = e;
        e = i + 1;
        this.d = i;
    }

    public boolean a() {
        return true;
    }

    public T b(T t) {
        return g() >= t.g() ? this : t;
    }

    public abstract void c(RCTEventEmitter rCTEventEmitter);

    public final void d() {
        this.a = false;
        l();
    }

    public short e() {
        return 0;
    }

    public abstract String f();

    public final long g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public final int i() {
        return this.b;
    }

    public void j(int i) {
        this.b = i;
        this.c = h.c();
        this.a = true;
    }

    public boolean k() {
        return this.a;
    }

    public void l() {
    }

    public c(int i) {
        int i2 = e;
        e = i2 + 1;
        this.d = i2;
        j(i);
    }
}
