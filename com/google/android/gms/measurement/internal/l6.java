package com.google.android.gms.measurement.internal;

import vigqyno.C0201;

public final class l6 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ v5 b;

    public l6(v5 v5Var, long j) {
        this.b = v5Var;
        this.a = j;
    }

    public final void run() {
        this.b.f().q.b(this.a);
        this.b.e().L().a(C0201.m82(29484), Long.valueOf(this.a));
    }
}
