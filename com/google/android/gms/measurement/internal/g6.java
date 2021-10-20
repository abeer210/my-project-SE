package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

public final class g6 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ v5 f;

    public g6(v5 v5Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f = v5Var;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final void run() {
        this.f.a.N().R(this.a, this.b, this.c, this.d, this.e);
    }
}
