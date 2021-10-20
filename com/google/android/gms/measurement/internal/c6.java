package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

public final class c6 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ v5 b;

    public c6(v5 v5Var, AtomicReference atomicReference) {
        this.b = v5Var;
        this.a = atomicReference;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(this.b.g().O(this.b.q().C()));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
