package com.google.android.gms.measurement.internal;

import vigqyno.C0201;

public final class b7 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ t8 b;
    private final /* synthetic */ d9 c;
    private final /* synthetic */ a7 d;

    public b7(a7 a7Var, boolean z, t8 t8Var, d9 d9Var) {
        this.d = a7Var;
        this.a = z;
        this.b = t8Var;
        this.c = d9Var;
    }

    public final void run() {
        b3 W = a7.W(this.d);
        if (W == null) {
            this.d.e().E().d(C0201.m82(3378));
            return;
        }
        this.d.M(W, this.a ? null : this.b, this.c);
        a7.Z(this.d);
    }
}
