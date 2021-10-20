package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class y0 extends l1 {
    private WeakReference<r0> a;

    public y0(r0 r0Var) {
        this.a = new WeakReference<>(r0Var);
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void a() {
        r0 r0Var = this.a.get();
        if (r0Var != null) {
            r0Var.w();
        }
    }
}
