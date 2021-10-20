package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import vigqyno.C0201;

public final class b8 extends f5 {
    private Handler c;
    private long d;
    private long e;
    private final b f = new e8(this, this.a);
    private final b g = new d8(this, this.a);

    public b8(o4 o4Var) {
        super(o4Var);
        long b = b().b();
        this.d = b;
        this.e = b;
    }

    /* access modifiers changed from: private */
    public final void F(long j) {
        j();
        J();
        if (g().G(q().C(), l.d0)) {
            f().y.b(false);
        }
        e().M().a(C0201.m82(3291), Long.valueOf(j));
        this.d = j;
        this.e = j;
        if (this.a.d()) {
            if (g().W(q().C())) {
                B(b().a(), false);
                return;
            }
            this.f.a();
            this.g.a();
            if (f().L(b().a())) {
                f().r.b(true);
                f().w.b(0);
            }
            if (f().r.a()) {
                this.f.f(Math.max(0L, f().p.a() - f().w.a()));
            } else {
                this.g.f(Math.max(0L, 3600000 - f().w.a()));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void G(long j) {
        j();
        J();
        if (g().G(q().C(), l.d0)) {
            f().y.b(true);
        }
        this.f.a();
        this.g.a();
        e().M().a(C0201.m82(3292), Long.valueOf(j));
        if (this.d != 0) {
            f().w.b(f().w.a() + (j - this.d));
        }
    }

    private final void H(long j) {
        j();
        e().M().a(C0201.m82(3293), Long.valueOf(b().b()));
        Long valueOf = g().U(q().C()) ? Long.valueOf(j / 1000) : null;
        p().c0(C0201.m82(3294), C0201.m82(3295), valueOf, j);
        f().r.b(false);
        Bundle bundle = new Bundle();
        if (g().U(q().C())) {
            bundle.putLong(C0201.m82(3296), valueOf.longValue());
        }
        p().X(C0201.m82(3297), C0201.m82(3298), j, bundle);
        f().v.b(j);
    }

    private final void J() {
        synchronized (this) {
            if (this.c == null) {
                this.c = new ob1(Looper.getMainLooper());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void N() {
        j();
        E(false, false);
        o().E(b().b());
    }

    public final void B(long j, boolean z) {
        j();
        J();
        this.f.a();
        this.g.a();
        if (f().L(j)) {
            f().r.b(true);
            f().w.b(0);
        }
        if (z && g().X(q().C())) {
            f().v.b(j);
        }
        if (f().r.a()) {
            H(j);
        } else {
            this.g.f(Math.max(0L, 3600000 - f().w.a()));
        }
    }

    public final boolean E(boolean z, boolean z2) {
        j();
        x();
        long b = b().b();
        f().v.b(b().a());
        long j = b - this.d;
        if (z || j >= 1000) {
            f().w.b(j);
            e().M().a(C0201.m82(3300), Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong(C0201.m82(3301), j);
            v6.K(s().O(), bundle, true);
            if (g().Y(q().C())) {
                if (g().G(q().C(), l.i0)) {
                    if (!z2) {
                        M();
                    }
                } else if (z2) {
                    bundle.putLong(C0201.m82(3302), 1);
                } else {
                    M();
                }
            }
            if (!g().G(q().C(), l.i0) || !z2) {
                p().I(C0201.m82(3303), C0201.m82(3304), bundle);
            }
            this.d = b;
            this.g.a();
            this.g.f(Math.max(0L, 3600000 - f().w.a()));
            return true;
        }
        e().M().a(C0201.m82(3299), Long.valueOf(j));
        return false;
    }

    public final void K() {
        j();
        this.f.a();
        this.g.a();
        this.d = 0;
        this.e = 0;
    }

    public final void L() {
        j();
        H(b().a());
    }

    public final long M() {
        long b = b().b();
        long j = b - this.e;
        this.e = b;
        return j;
    }

    @Override // com.google.android.gms.measurement.internal.f5
    public final boolean z() {
        return false;
    }
}
