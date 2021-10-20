package com.google.android.gms.measurement.internal;

import android.content.Intent;

public final /* synthetic */ class x7 implements Runnable {
    private final y7 a;
    private final int b;
    private final k3 c;
    private final Intent d;

    public x7(y7 y7Var, int i, k3 k3Var, Intent intent) {
        this.a = y7Var;
        this.b = i;
        this.c = k3Var;
        this.d = intent;
    }

    public final void run() {
        this.a.h(this.b, this.c, this.d);
    }
}
