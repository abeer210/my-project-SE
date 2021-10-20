package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.k;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class m2 extends j2<Boolean> {
    private final k.a<?> b;

    public m2(k.a<?> aVar, at1<Boolean> at1) {
        super(4, at1);
        this.b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final /* bridge */ /* synthetic */ void c(e3 e3Var, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final xo0[] g(g.a<?> aVar) {
        r1 r1Var = aVar.v().get(this.b);
        if (r1Var == null) {
            return null;
        }
        return r1Var.a.c();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final boolean h(g.a<?> aVar) {
        r1 r1Var = aVar.v().get(this.b);
        return r1Var != null && r1Var.a.e();
    }

    @Override // com.google.android.gms.common.api.internal.j2
    public final void i(g.a<?> aVar) throws RemoteException {
        r1 remove = aVar.v().remove(this.b);
        if (remove != null) {
            remove.b.b(aVar.m(), this.a);
            remove.a.a();
            return;
        }
        this.a.e((T) Boolean.FALSE);
    }
}
