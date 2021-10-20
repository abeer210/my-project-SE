package com.google.android.gms.measurement.internal;

public final class c5 implements Runnable {
    private final /* synthetic */ j a;
    private final /* synthetic */ d9 b;
    private final /* synthetic */ p4 c;

    public c5(p4 p4Var, j jVar, d9 d9Var) {
        this.c = p4Var;
        this.a = jVar;
        this.b = d9Var;
    }

    public final void run() {
        j W3 = this.c.W3(this.a, this.b);
        this.c.a.d0();
        this.c.a.z(W3, this.b);
    }
}
