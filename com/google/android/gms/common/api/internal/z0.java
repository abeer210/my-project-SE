package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class z0 {
    private final x0 a;

    public z0(x0 x0Var) {
        this.a = x0Var;
    }

    public final void a(a1 a1Var) {
        a1Var.a.lock();
        try {
            if (a1Var.k == this.a) {
                b();
                a1Var.a.unlock();
            }
        } finally {
            a1Var.a.unlock();
        }
    }

    public abstract void b();
}
