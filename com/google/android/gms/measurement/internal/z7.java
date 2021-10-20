package com.google.android.gms.measurement.internal;

public final class z7 implements Runnable {
    private final /* synthetic */ m8 a;
    private final /* synthetic */ Runnable b;

    public z7(y7 y7Var, m8 m8Var, Runnable runnable) {
        this.a = m8Var;
        this.b = runnable;
    }

    public final void run() {
        this.a.d0();
        this.a.K(this.b);
        this.a.Y();
    }
}
