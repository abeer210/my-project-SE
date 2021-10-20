package com.google.android.gms.measurement.internal;

public final class x6 implements Runnable {
    private final /* synthetic */ w6 a;
    private final /* synthetic */ v6 b;

    public x6(v6 v6Var, w6 w6Var) {
        this.b = v6Var;
        this.a = w6Var;
    }

    public final void run() {
        this.b.L(this.a, false);
        v6 v6Var = this.b;
        v6Var.c = null;
        v6Var.r().N(null);
    }
}
