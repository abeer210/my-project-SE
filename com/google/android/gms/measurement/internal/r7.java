package com.google.android.gms.measurement.internal;

import vigqyno.C0201;

public final class r7 implements Runnable {
    private final /* synthetic */ b3 a;
    private final /* synthetic */ s7 b;

    public r7(s7 s7Var, b3 b3Var) {
        this.b = s7Var;
        this.a = b3Var;
    }

    public final void run() {
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.D()) {
                this.b.c.e().M().d(C0201.m82(1329));
                this.b.c.L(this.a);
            }
        }
    }
}
