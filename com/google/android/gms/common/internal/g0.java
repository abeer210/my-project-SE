package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.t;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class g0 implements h.a {
    private final /* synthetic */ h a;
    private final /* synthetic */ at1 b;
    private final /* synthetic */ t.a c;
    private final /* synthetic */ t.b d;

    public g0(h hVar, at1 at1, t.a aVar, t.b bVar) {
        this.a = hVar;
        this.b = at1;
        this.c = aVar;
        this.d = bVar;
    }

    @Override // com.google.android.gms.common.api.h.a
    public final void a(Status status) {
        if (status.s()) {
            this.b.c(this.c.a(this.a.c(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.b(this.d.a(status));
    }
}
