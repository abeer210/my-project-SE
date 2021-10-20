package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.internal.c;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class i1 implements c.e {
    public final /* synthetic */ g.a a;

    public i1(g.a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.gms.common.internal.c.e
    public final void a() {
        g.this.m.post(new h1(this));
    }
}
