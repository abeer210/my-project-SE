package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.location.a;

public final class g0 extends n<d21, g> {
    private final /* synthetic */ i21 d;
    private final /* synthetic */ k e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(a aVar, k kVar, i21 i21, k kVar2) {
        super(kVar);
        this.d = i21;
        this.e = kVar2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b, at1] */
    @Override // com.google.android.gms.common.api.internal.n
    public final /* synthetic */ void d(d21 d21, at1 at1) throws RemoteException {
        d21.r0(this.d, this.e, new a.BinderC0061a(at1));
    }
}
