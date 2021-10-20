package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public abstract class b {
    private static volatile Handler d;
    private final n5 a;
    private final Runnable b;
    private volatile long c;

    public b(n5 n5Var) {
        u.k(n5Var);
        this.a = n5Var;
        this.b = new e(this, n5Var);
    }

    private final Handler b() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (b.class) {
            if (d == null) {
                d = new ob1(this.a.getContext().getMainLooper());
            }
            handler = d;
        }
        return handler;
    }

    public final void a() {
        this.c = 0;
        b().removeCallbacks(this.b);
    }

    public abstract void c();

    public final boolean e() {
        return this.c != 0;
    }

    public final void f(long j) {
        a();
        if (j >= 0) {
            this.c = this.a.b().a();
            if (!b().postDelayed(this.b, j)) {
                this.a.e().E().a(C0201.m82(33070), Long.valueOf(j));
            }
        }
    }
}
