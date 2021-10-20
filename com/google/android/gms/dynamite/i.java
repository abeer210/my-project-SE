package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.yq0;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class i extends i01 implements j {
    public i(IBinder iBinder) {
        super(iBinder, C0201.m82(1478));
    }

    @Override // com.google.android.gms.dynamite.j
    public final yq0 X(yq0 yq0, String str, int i, yq0 yq02) throws RemoteException {
        Parcel U3 = U3();
        j01.c(U3, yq0);
        U3.writeString(str);
        U3.writeInt(i);
        j01.c(U3, yq02);
        Parcel V3 = V3(2, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // com.google.android.gms.dynamite.j
    public final yq0 b0(yq0 yq0, String str, int i, yq0 yq02) throws RemoteException {
        Parcel U3 = U3();
        j01.c(U3, yq0);
        U3.writeString(str);
        U3.writeInt(i);
        j01.c(U3, yq02);
        Parcel V3 = V3(3, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }
}
