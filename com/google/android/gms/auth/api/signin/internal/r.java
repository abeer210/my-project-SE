package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import vigqyno.C0201;

public abstract class r extends ms0 implements q {
    public r() {
        super(C0201.m82(36865));
    }

    @Override // defpackage.ms0
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                R0((GoogleSignInAccount) ns0.a(parcel, GoogleSignInAccount.CREATOR), (Status) ns0.a(parcel, Status.CREATOR));
                throw null;
            case 102:
                M((Status) ns0.a(parcel, Status.CREATOR));
                throw null;
            case 103:
                n0((Status) ns0.a(parcel, Status.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
