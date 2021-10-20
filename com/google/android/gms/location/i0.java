package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import vigqyno.C0201;

public final class i0 extends o11 {
    private final /* synthetic */ at1 a;

    public i0(a aVar, at1 at1) {
        this.a = at1;
    }

    @Override // defpackage.n11
    public final void d0(h11 h11) throws RemoteException {
        Status k = h11.k();
        if (k == null) {
            this.a.d(new b(new Status(8, C0201.m82(36049))));
        } else if (k.o() == 0) {
            this.a.c(Boolean.TRUE);
        } else {
            this.a.d(com.google.android.gms.common.internal.b.a(k));
        }
    }
}
