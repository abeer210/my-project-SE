package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

public abstract class o0 extends e21 implements n0 {
    public o0() {
        super(C0201.m82(21734));
    }

    public static n0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(21735));
        return queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new p0(iBinder);
    }

    @Override // defpackage.e21
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            w2((LocationResult) s21.a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            K1((LocationAvailability) s21.a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
