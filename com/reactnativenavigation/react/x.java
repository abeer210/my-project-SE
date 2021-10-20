package com.reactnativenavigation.react;

import com.facebook.react.bridge.ReactContext;
import defpackage.si0;

/* compiled from: NavigationReactInitializer */
public class x implements si0.k {
    private final si0 a;
    private final r b;
    private boolean c = true;
    private boolean d = false;

    public x(si0 si0, boolean z) {
        this.a = si0;
        this.b = new r(z);
    }

    private void b(ReactContext reactContext) {
        if (this.d) {
            this.c = false;
            new oi2(reactContext).a();
        }
    }

    private void g() {
        if (h()) {
            this.a.r();
        } else if (this.c && this.a.v() != null) {
            b(this.a.v());
        }
    }

    private boolean h() {
        return !this.a.z();
    }

    @Override // defpackage.si0.k
    public void a(ReactContext reactContext) {
        b(reactContext);
    }

    public void c() {
        this.a.k(this);
        this.c = true;
    }

    public void d(md2 md2) {
        this.a.W(this);
        if (this.a.z()) {
            this.a.J(md2);
        }
    }

    public void e(md2 md2) {
        this.d = false;
        if (this.a.z()) {
            this.a.L(md2);
        }
    }

    public void f(md2 md2) {
        if (this.b.b(md2)) {
            this.b.a(md2);
            return;
        }
        this.a.N(md2, md2);
        this.d = true;
        g();
    }
}
