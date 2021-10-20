package com.reactnativenavigation.react;

import com.facebook.react.common.LifecycleState;
import vigqyno.C0179;

/* compiled from: NavigationReactNativeHost */
public abstract class y extends vi0 implements p {
    private final ej0 c = new a(this);

    /* compiled from: NavigationReactNativeHost */
    class a extends q {
        static {
            C0179.m19();
        }

        public a(y yVar) {
        }
    }

    static {
        C0179.m19();
    }

    public y(nd2 nd2) {
        super(nd2);
    }

    @Override // com.reactnativenavigation.react.p
    public void a(v vVar) {
    }

    @Override // defpackage.vi0
    public si0 b() {
        ti0 n = si0.n();
        n.d(c());
        n.k(g());
        n.o(m());
        n.m(k());
        n.l(h());
        n.n(l());
        n.g(LifecycleState.BEFORE_CREATE);
        n.j(f());
        n.f(o());
        for (wi0 wi0 : i()) {
            n.a(wi0);
        }
        String e = e();
        if (e != null) {
            n.h(e);
        } else {
            String d = d();
            yh0.c(d);
            n.e(d);
        }
        return n.b();
    }

    public ej0 o() {
        return this.c;
    }
}
