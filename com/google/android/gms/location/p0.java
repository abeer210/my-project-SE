package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

public final class p0 extends g11 implements n0 {
    public p0(IBinder iBinder) {
        super(iBinder, C0201.m82(23740));
    }

    @Override // com.google.android.gms.location.n0
    public final void K1(LocationAvailability locationAvailability) throws RemoteException {
        Parcel U3 = U3();
        s21.c(U3, locationAvailability);
        X3(2, U3);
    }

    @Override // com.google.android.gms.location.n0
    public final void w2(LocationResult locationResult) throws RemoteException {
        Parcel U3 = U3();
        s21.c(U3, locationResult);
        X3(1, U3);
    }
}
