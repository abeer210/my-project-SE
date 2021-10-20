package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.g;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class l2 extends j2<Void> {
    private final n<a.b, ?> b;
    private final u<a.b, ?> c;

    public l2(r1 r1Var, at1<Void> at1) {
        super(3, at1);
        this.b = r1Var.a;
        this.c = r1Var.b;
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final /* bridge */ /* synthetic */ void c(e3 e3Var, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final xo0[] g(g.a<?> aVar) {
        return this.b.c();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final boolean h(g.a<?> aVar) {
        return this.b.e();
    }

    @Override // com.google.android.gms.common.api.internal.j2
    public final void i(g.a<?> aVar) throws RemoteException {
        this.b.d(aVar.m(), this.a);
        if (this.b.b() != null) {
            aVar.v().put(this.b.b(), new r1(this.b, this.c));
        }
    }
}
