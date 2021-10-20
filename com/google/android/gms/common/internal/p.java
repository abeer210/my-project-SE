package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public interface p extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static abstract class a extends h01 implements p {
        public a() {
            super(C0201.m82(5001));
        }

        @Override // defpackage.h01
        public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                J1(parcel.readInt(), parcel.readStrongBinder(), (Bundle) j01.b(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                r1(parcel.readInt(), (Bundle) j01.b(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                I1(parcel.readInt(), parcel.readStrongBinder(), (k0) j01.b(parcel, k0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void I1(int i, IBinder iBinder, k0 k0Var) throws RemoteException;

    void J1(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    void r1(int i, Bundle bundle) throws RemoteException;
}
