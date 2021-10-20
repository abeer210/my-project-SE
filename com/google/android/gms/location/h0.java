package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.u;

public final class h0 extends u<d21, g> {
    private final /* synthetic */ a b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(a aVar, k.a aVar2) {
        super(aVar2);
        this.b = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b, at1] */
    @Override // com.google.android.gms.common.api.internal.u
    public final /* synthetic */ void b(d21 d21, at1 at1) throws RemoteException {
        try {
            d21.v0(a(), this.b.x(at1));
        } catch (RuntimeException e) {
            at1.d(e);
        }
    }
}
