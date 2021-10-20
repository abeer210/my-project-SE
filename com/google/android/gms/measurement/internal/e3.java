package com.google.android.gms.measurement.internal;

public final class e3 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ a b;

    public e3(a aVar, long j) {
        this.b = aVar;
        this.a = j;
    }

    public final void run() {
        this.b.F(this.a);
    }
}
