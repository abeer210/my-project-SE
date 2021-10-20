package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

public final class i6 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ v5 b;

    public i6(v5 v5Var, AtomicReference atomicReference) {
        this.b = v5Var;
        this.a = atomicReference;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Integer.valueOf(this.b.g().r(this.b.q().C(), l.P)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
