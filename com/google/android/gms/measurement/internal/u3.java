package com.google.android.gms.measurement.internal;

public final class u3 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ r3 b;

    public u3(r3 r3Var, boolean z) {
        this.b = r3Var;
        this.a = z;
    }

    public final void run() {
        this.b.a.R(this.a);
    }
}
