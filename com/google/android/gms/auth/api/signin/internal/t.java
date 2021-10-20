package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import vigqyno.C0201;

public final class t extends ls0 implements s {
    public t(IBinder iBinder) {
        super(iBinder, C0201.m82(37280));
    }

    @Override // com.google.android.gms.auth.api.signin.internal.s
    public final void C1(q qVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel U3 = U3();
        ns0.b(U3, qVar);
        ns0.c(U3, googleSignInOptions);
        V3(103, U3);
    }
}
