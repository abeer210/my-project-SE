package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.f;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class t0 implements f.b {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ r b;
    private final /* synthetic */ r0 c;

    public t0(r0 r0Var, AtomicReference atomicReference, r rVar) {
        this.c = r0Var;
        this.a = atomicReference;
        this.b = rVar;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnected(Bundle bundle) {
        this.c.y((f) this.a.get(), this.b, true);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnectionSuspended(int i) {
    }
}
