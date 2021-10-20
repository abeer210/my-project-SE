package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.s;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class z1 extends s<A, ResultT> {
    private final /* synthetic */ s.a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z1(s.a aVar, xo0[] xo0Arr, boolean z) {
        super(xo0Arr, z);
        this.c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void b(A a, at1<ResultT> at1) throws RemoteException {
        this.c.a.a(a, at1);
    }
}
