package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

public abstract class r0 extends e21 implements q0 {
    public static q0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(18417));
        return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new s0(iBinder);
    }

    @Override // defpackage.e21
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onLocationChanged((Location) s21.a(parcel, Location.CREATOR));
        return true;
    }
}
