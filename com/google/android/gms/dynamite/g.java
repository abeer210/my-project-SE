package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.yq0;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class g extends i01 implements h {
    public g(IBinder iBinder) {
        super(iBinder, C0201.m82(1124));
    }

    @Override // com.google.android.gms.dynamite.h
    public final int M1(yq0 yq0, String str, boolean z) throws RemoteException {
        Parcel U3 = U3();
        j01.c(U3, yq0);
        U3.writeString(str);
        j01.a(U3, z);
        Parcel V3 = V3(5, U3);
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.h
    public final yq0 N0(yq0 yq0, String str, int i) throws RemoteException {
        Parcel U3 = U3();
        j01.c(U3, yq0);
        U3.writeString(str);
        U3.writeInt(i);
        Parcel V3 = V3(2, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // com.google.android.gms.dynamite.h
    public final int o2(yq0 yq0, String str, boolean z) throws RemoteException {
        Parcel U3 = U3();
        j01.c(U3, yq0);
        U3.writeString(str);
        j01.a(U3, z);
        Parcel V3 = V3(3, U3);
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.h
    public final int u3() throws RemoteException {
        Parcel V3 = V3(6, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.h
    public final yq0 y2(yq0 yq0, String str, int i) throws RemoteException {
        Parcel U3 = U3();
        j01.c(U3, yq0);
        U3.writeString(str);
        U3.writeInt(i);
        Parcel V3 = V3(4, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }
}
