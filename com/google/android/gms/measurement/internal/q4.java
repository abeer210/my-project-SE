package com.google.android.gms.measurement.internal;

public final class q4 implements Runnable {
    private final /* synthetic */ s5 a;
    private final /* synthetic */ o4 b;

    public q4(o4 o4Var, s5 s5Var) {
        this.b = o4Var;
        this.a = s5Var;
    }

    public final void run() {
        this.b.o(this.a);
        this.b.f();
    }
}
