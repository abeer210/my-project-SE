package com.google.android.gms.measurement.internal;

public final class b5 implements Runnable {
    private final /* synthetic */ j a;
    private final /* synthetic */ String b;
    private final /* synthetic */ p4 c;

    public b5(p4 p4Var, j jVar, String str) {
        this.c = p4Var;
        this.a = jVar;
        this.b = str;
    }

    public final void run() {
        this.c.a.d0();
        this.c.a.D(this.a, this.b);
    }
}
