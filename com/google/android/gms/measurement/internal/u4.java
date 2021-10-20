package com.google.android.gms.measurement.internal;

public final class u4 implements Runnable {
    private final /* synthetic */ g9 a;
    private final /* synthetic */ d9 b;
    private final /* synthetic */ p4 c;

    public u4(p4 p4Var, g9 g9Var, d9 d9Var) {
        this.c = p4Var;
        this.a = g9Var;
        this.b = d9Var;
    }

    public final void run() {
        this.c.a.d0();
        this.c.a.v(this.a, this.b);
    }
}
