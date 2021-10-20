package com.google.android.gms.measurement.internal;

public final class h8 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ b8 b;

    public h8(b8 b8Var, long j) {
        this.b = b8Var;
        this.a = j;
    }

    public final void run() {
        this.b.F(this.a);
    }
}
