package com.google.android.gms.measurement.internal;

public final class c1 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ a c;

    public c1(a aVar, String str, long j) {
        this.c = aVar;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        this.c.A(this.a, this.b);
    }
}
