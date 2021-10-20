package com.google.android.gms.measurement.internal;

import vigqyno.C0201;

public final class j6 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ v5 b;

    public j6(v5 v5Var, boolean z) {
        this.b = v5Var;
        this.a = z;
    }

    public final void run() {
        boolean d = this.b.a.d();
        boolean E = this.b.a.E();
        this.b.a.p(this.a);
        if (E == this.a) {
            this.b.a.e().M().a(C0201.m82(24686), Boolean.valueOf(this.a));
        }
        if (this.b.a.d() == d || this.b.a.d() != this.b.a.E()) {
            this.b.a.e().J().b(C0201.m82(24687), Boolean.valueOf(this.a), Boolean.valueOf(d));
        }
        this.b.z0();
    }
}
