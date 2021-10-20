package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

public final class u0 {
    private static final gy1 j = new gy1(C0201.m82(36286));
    private final l1 a;
    private final r0 b;
    private final p2 c;
    private final z1 d;
    private final d2 e;
    private final i2 f;
    private final fz1<i3> g;
    private final o1 h;
    private final AtomicBoolean i = new AtomicBoolean(false);

    public u0(l1 l1Var, fz1<i3> fz1, r0 r0Var, p2 p2Var, z1 z1Var, d2 d2Var, i2 i2Var, o1 o1Var) {
        this.a = l1Var;
        this.g = fz1;
        this.b = r0Var;
        this.c = p2Var;
        this.d = z1Var;
        this.e = d2Var;
        this.f = i2Var;
        this.h = o1Var;
    }

    private final void b(int i2, Exception exc) {
        try {
            this.a.p(i2);
            this.a.c(i2);
        } catch (t0 unused) {
            j.e(C0201.m82(36287), exc.getMessage());
        }
    }

    public final void a() {
        j.c(C0201.m82(36288), new Object[0]);
        if (this.i.compareAndSet(false, true)) {
            while (true) {
                n1 n1Var = null;
                try {
                    n1Var = this.h.a();
                } catch (t0 e2) {
                    j.e(C0201.m82(36289), e2.getMessage());
                    if (e2.a >= 0) {
                        this.g.a().a(e2.a);
                        b(e2.a, e2);
                    }
                }
                if (n1Var != null) {
                    try {
                        if (n1Var instanceof q0) {
                            this.b.a((q0) n1Var);
                        } else if (n1Var instanceof o2) {
                            this.c.a((o2) n1Var);
                        } else if (n1Var instanceof y1) {
                            this.d.a((y1) n1Var);
                        } else if (n1Var instanceof b2) {
                            this.e.a((b2) n1Var);
                        } else if (n1Var instanceof h2) {
                            this.f.a((h2) n1Var);
                        } else {
                            j.e(C0201.m82(36290), n1Var.getClass().getName());
                        }
                    } catch (Exception e3) {
                        j.e(C0201.m82(36291), e3.getMessage());
                        this.g.a().a(n1Var.a);
                        b(n1Var.a, e3);
                    }
                } else {
                    this.i.set(false);
                    return;
                }
            }
        } else {
            j.g(C0201.m82(36292), new Object[0]);
        }
    }
}
