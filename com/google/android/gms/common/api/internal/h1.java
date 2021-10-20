package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class h1 implements Runnable {
    private final /* synthetic */ i1 a;

    public h1(i1 i1Var) {
        this.a = i1Var;
    }

    public final void run() {
        this.a.a.b.disconnect();
    }
}
