package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class d1 implements c.a {
    private final /* synthetic */ g a;

    public d1(g gVar) {
        this.a = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z) {
        this.a.m.sendMessage(this.a.m.obtainMessage(1, Boolean.valueOf(z)));
    }
}
