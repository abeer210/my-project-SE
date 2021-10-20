package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

public final class d6 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ v5 e;

    public d6(v5 v5Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.e = v5Var;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final void run() {
        this.e.a.N().Q(this.a, this.b, this.c, this.d);
    }
}
