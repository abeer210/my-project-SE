package com.reactnativenavigation.react;

import android.app.Activity;
import android.content.Intent;

/* compiled from: ReactGateway */
public class a0 {
    private final vi0 a;
    private final x b;
    private final s c;

    public a0(vi0 vi0) {
        this.a = vi0;
        this.b = new x(vi0.j(), vi0.m());
        s sVar = new s(vi0.j().w());
        this.c = sVar;
        if (vi0 instanceof p) {
            ((p) vi0).a(sVar);
        }
    }

    public void a(md2 md2) {
        this.b.c();
        this.c.i(md2);
    }

    public void b(md2 md2) {
        this.c.h(md2);
        this.b.d(md2);
    }

    public void c(md2 md2) {
        this.b.e(md2);
        this.c.d(md2);
    }

    public void d(Activity activity, int i, int i2, Intent intent) {
        this.a.j().G(activity, i, i2, intent);
    }

    public void e(md2 md2) {
        this.b.f(md2);
        this.c.e(md2);
    }

    public void f() {
        this.a.j().H();
    }

    public boolean g(int i) {
        return this.c.f(i);
    }

    public boolean h(Intent intent) {
        if (!this.a.n()) {
            return false;
        }
        this.a.j().O(intent);
        return true;
    }
}
