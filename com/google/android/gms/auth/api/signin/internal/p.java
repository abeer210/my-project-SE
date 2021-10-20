package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

public abstract class p extends ms0 implements o {
    public p() {
        super(C0201.m82(36991));
    }

    @Override // defpackage.ms0
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            s();
        } else if (i != 2) {
            return false;
        } else {
            E();
        }
        return true;
    }
}
