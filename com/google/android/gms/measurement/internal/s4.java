package com.google.android.gms.measurement.internal;

public final class s4 implements Runnable {
    private final /* synthetic */ d9 a;
    private final /* synthetic */ p4 b;

    public s4(p4 p4Var, d9 d9Var) {
        this.b = p4Var;
        this.a = d9Var;
    }

    public final void run() {
        this.b.a.d0();
        this.b.a.G(this.a);
    }
}
