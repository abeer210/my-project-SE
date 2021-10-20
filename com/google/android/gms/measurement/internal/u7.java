package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

public final class u7 implements Runnable {
    private final /* synthetic */ ComponentName a;
    private final /* synthetic */ s7 b;

    public u7(s7 s7Var, ComponentName componentName) {
        this.b = s7Var;
        this.a = componentName;
    }

    public final void run() {
        this.b.c.E(this.a);
    }
}
