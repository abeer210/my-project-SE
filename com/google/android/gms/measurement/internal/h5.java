package com.google.android.gms.measurement.internal;

public final class h5 implements Runnable {
    private final /* synthetic */ t8 a;
    private final /* synthetic */ d9 b;
    private final /* synthetic */ p4 c;

    public h5(p4 p4Var, t8 t8Var, d9 d9Var) {
        this.c = p4Var;
        this.a = t8Var;
        this.b = d9Var;
    }

    public final void run() {
        this.c.a.d0();
        this.c.a.u(this.a, this.b);
    }
}
