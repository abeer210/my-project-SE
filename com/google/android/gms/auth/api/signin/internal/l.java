package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class l extends e {
    private final /* synthetic */ k a;

    public l(k kVar) {
        this.a = kVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.q
    public final void n0(Status status) throws RemoteException {
        this.a.j(status);
    }
}
