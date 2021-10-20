package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.c;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class d0 implements c.b {
    private final /* synthetic */ m a;

    public d0(m mVar) {
        this.a = mVar;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(vo0 vo0) {
        this.a.onConnectionFailed(vo0);
    }
}
