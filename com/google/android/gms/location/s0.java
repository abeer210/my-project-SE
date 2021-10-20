package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

public final class s0 extends g11 implements q0 {
    public s0(IBinder iBinder) {
        super(iBinder, C0201.m82(10813));
    }

    @Override // com.google.android.gms.location.q0
    public final void onLocationChanged(Location location) throws RemoteException {
        Parcel U3 = U3();
        s21.c(U3, location);
        X3(1, U3);
    }
}
