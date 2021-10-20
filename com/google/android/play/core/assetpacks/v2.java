package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;
import vigqyno.C0201;

public final class v2 {
    private static final gy1 e = new gy1(C0201.m82(25034));
    private final b0 a;
    private final fz1<i3> b;
    private final v c;
    private final fz1<Executor> d;

    public v2(b0 b0Var, fz1<i3> fz1, v vVar, m02 m02, l1 l1Var, x0 x0Var, l0 l0Var, fz1<Executor> fz12) {
        new Handler(Looper.getMainLooper());
        this.a = b0Var;
        this.b = fz1;
        this.c = vVar;
        this.d = fz12;
    }

    private final void d() {
        this.d.a().execute(new s2(this));
    }

    public final void b(boolean z) {
        boolean d2 = this.c.d();
        this.c.c(z);
        if (z && !d2) {
            d();
        }
    }

    public final /* synthetic */ void c() {
        s02<List<String>> b2 = this.b.a().b(this.a.l());
        b0 b0Var = this.a;
        b0Var.getClass();
        b2.c(this.d.a(), t2.a(b0Var));
        b2.b(this.d.a(), u2.a);
    }
}
