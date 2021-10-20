package com.google.android.gms.measurement.internal;

import vigqyno.C0201;

public final class d4 implements Runnable {
    private final /* synthetic */ o4 a;
    private final /* synthetic */ k3 b;

    public d4(e4 e4Var, o4 o4Var, k3 k3Var) {
        this.a = o4Var;
        this.b = k3Var;
    }

    public final void run() {
        if (this.a.w() == null) {
            this.b.E().d(C0201.m82(7885));
            return;
        }
        z3 w = this.a.w();
        w.a.J();
        w.b(w.a.getContext().getPackageName());
    }
}
