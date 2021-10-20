package com.google.android.gms.measurement.internal;

public final class e implements Runnable {
    private final /* synthetic */ n5 a;
    private final /* synthetic */ b b;

    public e(b bVar, n5 n5Var) {
        this.b = bVar;
        this.a = n5Var;
    }

    public final void run() {
        this.a.a();
        if (h9.a()) {
            this.a.c().y(this);
            return;
        }
        boolean e = this.b.e();
        this.b.c = 0;
        if (e) {
            this.b.c();
        }
    }
}
