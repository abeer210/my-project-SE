package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class s0 implements f.c {
    private final /* synthetic */ r a;

    public s0(r0 r0Var, r rVar) {
        this.a = rVar;
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void onConnectionFailed(vo0 vo0) {
        this.a.j(new Status(8));
    }
}
