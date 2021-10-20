package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class u2 implements f.b, f.c {
    public final a<?> a;
    private final boolean b;
    private w2 c;

    public u2(a<?> aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    private final void b() {
        u.l(this.c, C0201.m82(11222));
    }

    public final void a(w2 w2Var) {
        this.c = w2Var;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnected(Bundle bundle) {
        b();
        this.c.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void onConnectionFailed(vo0 vo0) {
        b();
        this.c.i(vo0, this.a, this.b);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnectionSuspended(int i) {
        b();
        this.c.onConnectionSuspended(i);
    }
}
