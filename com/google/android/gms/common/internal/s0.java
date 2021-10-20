package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.yq0;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class s0 extends i01 implements r0 {
    public s0(IBinder iBinder) {
        super(iBinder, C0201.m82(25091));
    }

    @Override // com.google.android.gms.common.internal.r0
    public final yq0 k3() throws RemoteException {
        Parcel V3 = V3(1, U3());
        yq0 U3 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U3;
    }

    @Override // com.google.android.gms.common.internal.r0
    public final int u() throws RemoteException {
        Parcel V3 = V3(2, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }
}
