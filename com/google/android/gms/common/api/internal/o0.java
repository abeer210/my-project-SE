package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.m;
import java.util.Collections;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class o0 implements x0 {
    private final a1 a;

    public o0(a1 a1Var) {
        this.a = a1Var;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void a() {
        this.a.l();
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void d() {
        for (a.f fVar : this.a.f.values()) {
            fVar.disconnect();
        }
        this.a.n.q = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean disconnect() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void i(vo0 vo0, a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final <A extends a.b, T extends d<? extends m, A>> T j(T t) {
        throw new IllegalStateException(C0201.m82(26727));
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final <A extends a.b, R extends m, T extends d<R, A>> T k(T t) {
        this.a.n.i.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void onConnected(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void onConnectionSuspended(int i) {
    }
}
