package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.c;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class c0 implements c.a {
    private final /* synthetic */ f a;

    public c0(f fVar) {
        this.a = fVar;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        this.a.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i) {
        this.a.onConnectionSuspended(i);
    }
}
