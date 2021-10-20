package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class y2 implements Runnable {
    private final /* synthetic */ v2 a;

    public y2(v2 v2Var) {
        this.a = v2Var;
    }

    public final void run() {
        this.a.m.lock();
        try {
            this.a.A();
        } finally {
            this.a.m.unlock();
        }
    }
}
