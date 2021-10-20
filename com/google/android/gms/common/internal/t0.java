package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class t0 extends h01 implements r0 {
    public t0() {
        super(C0201.m82(22269));
    }

    public static r0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(22270));
        if (queryLocalInterface instanceof r0) {
            return (r0) queryLocalInterface;
        }
        return new s0(iBinder);
    }

    @Override // defpackage.h01
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            yq0 k3 = k3();
            parcel2.writeNoException();
            j01.c(parcel2, k3);
        } else if (i != 2) {
            return false;
        } else {
            int u = u();
            parcel2.writeNoException();
            parcel2.writeInt(u);
        }
        return true;
    }
}
