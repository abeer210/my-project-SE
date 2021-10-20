package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

public final class z5 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ v5 b;

    public z5(v5 v5Var, long j) {
        this.b = v5Var;
        this.a = j;
    }

    public final void run() {
        v5 v5Var = this.b;
        long j = this.a;
        v5Var.j();
        v5Var.h();
        v5Var.x();
        v5Var.e().L().d(C0201.m82(21888));
        v5Var.u().K();
        if (v5Var.g().Q(v5Var.q().C())) {
            v5Var.f().j.b(j);
        }
        boolean d = v5Var.a.d();
        if (!v5Var.g().v()) {
            v5Var.f().B(!d);
        }
        v5Var.r().F();
        v5Var.h = !d;
        this.b.r().P(new AtomicReference<>());
    }
}
