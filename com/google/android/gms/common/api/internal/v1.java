package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import java.util.Set;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class v1 extends gs1 implements f.b, f.c {
    private static a.AbstractC0054a<? extends qs1, bs1> h = ps1.c;
    private final Context a;
    private final Handler b;
    private final a.AbstractC0054a<? extends qs1, bs1> c;
    private Set<Scope> d;
    private e e;
    private qs1 f;
    private w1 g;

    public v1(Context context, Handler handler, e eVar) {
        this(context, handler, eVar, h);
    }

    /* access modifiers changed from: private */
    public final void a4(ns1 ns1) {
        vo0 o = ns1.o();
        if (o.u()) {
            w p = ns1.p();
            vo0 p2 = p.p();
            if (!p2.u()) {
                String valueOf = String.valueOf(p2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append(C0201.m82(15041));
                sb.append(valueOf);
                Log.wtf(C0201.m82(15042), sb.toString(), new Exception());
                this.g.c(p2);
                this.f.disconnect();
                return;
            }
            this.g.b(p.o(), this.d);
        } else {
            this.g.c(o);
        }
        this.f.disconnect();
    }

    public final void X3(w1 w1Var) {
        qs1 qs1 = this.f;
        if (qs1 != null) {
            qs1.disconnect();
        }
        this.e.m(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0054a<? extends qs1, bs1> aVar = this.c;
        Context context = this.a;
        Looper looper = this.b.getLooper();
        e eVar = this.e;
        this.f = (qs1) aVar.c(context, looper, eVar, eVar.k(), this, this);
        this.g = w1Var;
        Set<Scope> set = this.d;
        if (set == null || set.isEmpty()) {
            this.b.post(new u1(this));
        } else {
            this.f.a();
        }
    }

    public final qs1 Y3() {
        return this.f;
    }

    public final void Z3() {
        qs1 qs1 = this.f;
        if (qs1 != null) {
            qs1.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnected(Bundle bundle) {
        this.f.g(this);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void onConnectionFailed(vo0 vo0) {
        this.g.c(vo0);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnectionSuspended(int i) {
        this.f.disconnect();
    }

    @Override // defpackage.fs1
    public final void t0(ns1 ns1) {
        this.b.post(new x1(this, ns1));
    }

    public v1(Context context, Handler handler, e eVar, a.AbstractC0054a<? extends qs1, bs1> aVar) {
        this.a = context;
        this.b = handler;
        u.l(eVar, C0201.m82(15040));
        this.e = eVar;
        this.d = eVar.j();
        this.c = aVar;
    }
}
