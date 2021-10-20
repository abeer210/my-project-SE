package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b;
import java.util.concurrent.CancellationException;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class p1 extends p2 {
    private at1<Void> f = new at1<>();

    private p1(j jVar) {
        super(jVar);
        this.a.e(C0201.m82(28615), this);
    }

    public static p1 r(Activity activity) {
        j c = LifecycleCallback.c(activity);
        p1 p1Var = (p1) c.g(C0201.m82(28616), p1.class);
        if (p1Var == null) {
            return new p1(c);
        }
        if (p1Var.f.a().o()) {
            p1Var.f = new at1<>();
        }
        return p1Var;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void g() {
        super.g();
        this.f.d(new CancellationException(C0201.m82(28617)));
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void m(vo0 vo0, int i) {
        this.f.b(b.a(new Status(vo0.o(), vo0.p(), vo0.r())));
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void o() {
        Activity h = this.a.h();
        if (h == null) {
            this.f.d(new com.google.android.gms.common.api.b(new Status(8)));
            return;
        }
        int i = this.e.i(h);
        if (i == 0) {
            this.f.e(null);
        } else if (!this.f.a().o()) {
            n(new vo0(i, null), 0);
        }
    }

    public final zs1<Void> q() {
        return this.f.a();
    }
}
