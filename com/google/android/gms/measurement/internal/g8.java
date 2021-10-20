package com.google.android.gms.measurement.internal;

public final class g8 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ b8 b;

    public g8(b8 b8Var, long j) {
        this.b = b8Var;
        this.a = j;
    }

    public final void run() {
        this.b.G(this.a);
    }
}
