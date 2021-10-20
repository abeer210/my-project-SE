package com.google.android.gms.measurement.internal;

public final class p8 implements Runnable {
    private final /* synthetic */ s8 a;
    private final /* synthetic */ m8 b;

    public p8(m8 m8Var, s8 s8Var) {
        this.b = m8Var;
        this.a = s8Var;
    }

    public final void run() {
        this.b.o(this.a);
        this.b.d();
    }
}
