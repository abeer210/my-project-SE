package com.google.android.gms.measurement.internal;

public final class w5 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ long d;
    private final /* synthetic */ v5 e;

    public w5(v5 v5Var, String str, String str2, Object obj, long j) {
        this.e = v5Var;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
    }

    public final void run() {
        this.e.c0(this.a, this.b, this.c, this.d);
    }
}
