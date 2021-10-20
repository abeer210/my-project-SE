package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.g;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class k2<ResultT> extends v0 {
    private final s<a.b, ResultT> a;
    private final at1<ResultT> b;
    private final q c;

    public k2(int i, s<a.b, ResultT> sVar, at1<ResultT> at1, q qVar) {
        super(i);
        this.b = at1;
        this.a = sVar;
        this.c = qVar;
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final void b(Status status) {
        this.b.d(this.c.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final void c(e3 e3Var, boolean z) {
        e3Var.c(this.b, z);
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final void d(RuntimeException runtimeException) {
        this.b.d(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final void f(g.a<?> aVar) throws DeadObjectException {
        try {
            this.a.b(aVar.m(), this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            b(s1.e(e2));
        } catch (RuntimeException e3) {
            d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final xo0[] g(g.a<?> aVar) {
        return this.a.d();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final boolean h(g.a<?> aVar) {
        return this.a.c();
    }
}
