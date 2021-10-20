package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.x;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class d<R extends m, A extends a.b> extends BasePendingResult<R> implements e<R> {
    private final a.c<A> q;
    private final a<?> r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(a<?> aVar, f fVar) {
        super(fVar);
        u.l(fVar, C0201.m82(35129));
        u.l(aVar, C0201.m82(35130));
        this.q = (a.c<A>) aVar.a();
        this.r = aVar;
    }

    private void z(RemoteException remoteException) {
        A(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    public final void A(Status status) {
        u.b(!status.s(), C0201.m82(35131));
        R f = f(status);
        j(f);
        x(f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.common.api.internal.d<R extends com.google.android.gms.common.api.m, A extends com.google.android.gms.common.api.a$b> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.e
    public /* bridge */ /* synthetic */ void a(Object obj) {
        super.j((m) obj);
    }

    public abstract void u(A a) throws RemoteException;

    public final a<?> v() {
        return this.r;
    }

    public final a.c<A> w() {
        return this.q;
    }

    public void x(R r2) {
    }

    public final void y(A a) throws DeadObjectException {
        if (a instanceof x) {
            a = ((x) a).p0();
        }
        try {
            u(a);
        } catch (DeadObjectException e) {
            z(e);
            throw e;
        } catch (RemoteException e2) {
            z(e2);
        }
    }
}
