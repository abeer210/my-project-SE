package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.x;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class a0 implements x0 {
    private final a1 a;
    private boolean b = false;

    public a0(a1 a1Var) {
        this.a = a1Var;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void a() {
        if (this.b) {
            this.b = false;
            this.a.h(new c0(this, this));
        }
    }

    public final void c() {
        if (this.b) {
            this.b = false;
            this.a.n.y.a();
            disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void d() {
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean disconnect() {
        if (this.b) {
            return false;
        }
        if (this.a.n.E()) {
            this.b = true;
            for (a2 a2Var : this.a.n.x) {
                a2Var.d();
            }
            return false;
        }
        this.a.q(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void i(vo0 vo0, a<?> aVar, boolean z) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T extends com.google.android.gms.common.api.internal.d<? extends com.google.android.gms.common.api.m, A> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.x0
    public final <A extends a.b, T extends d<? extends m, A>> T j(T t) {
        try {
            this.a.n.y.c(t);
            r0 r0Var = this.a.n;
            a.f fVar = r0Var.p.get(t.w());
            u.l(fVar, C0201.m82(24575));
            if (fVar.isConnected() || !this.a.g.containsKey(t.w())) {
                boolean z = fVar instanceof x;
                a.b bVar = fVar;
                if (z) {
                    bVar = ((x) fVar).p0();
                }
                t.y(bVar == 1 ? 1 : 0);
                return t;
            }
            t.A(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            this.a.h(new d0(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final <A extends a.b, R extends m, T extends d<R, A>> T k(T t) {
        j(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void onConnected(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void onConnectionSuspended(int i) {
        this.a.q(null);
        this.a.o.c(i, this.b);
    }
}
