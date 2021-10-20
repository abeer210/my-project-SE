package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class k0 extends gs1 {
    private final WeakReference<f0> a;

    public k0(f0 f0Var) {
        this.a = new WeakReference<>(f0Var);
    }

    @Override // defpackage.fs1
    public final void t0(ns1 ns1) {
        f0 f0Var = this.a.get();
        if (f0Var != null) {
            f0Var.a.h(new n0(this, f0Var, f0Var, ns1));
        }
    }
}
