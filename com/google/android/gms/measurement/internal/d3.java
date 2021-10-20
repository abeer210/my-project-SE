package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public final class d3 extends a51 implements b3 {
    public d3(IBinder iBinder) {
        super(iBinder, C0201.m82(7956));
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final String G0(d9 d9Var) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, d9Var);
        Parcel V3 = V3(11, U3);
        String readString = V3.readString();
        V3.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void I(g9 g9Var) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, g9Var);
        W3(13, U3);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void K(j jVar, String str, String str2) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, jVar);
        U3.writeString(str);
        U3.writeString(str2);
        W3(5, U3);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final List<t8> O1(String str, String str2, boolean z, d9 d9Var) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        m71.a(U3, z);
        m71.d(U3, d9Var);
        Parcel V3 = V3(14, U3);
        ArrayList createTypedArrayList = V3.createTypedArrayList(t8.CREATOR);
        V3.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final List<t8> P1(d9 d9Var, boolean z) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, d9Var);
        m71.a(U3, z);
        Parcel V3 = V3(7, U3);
        ArrayList createTypedArrayList = V3.createTypedArrayList(t8.CREATOR);
        V3.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void R1(d9 d9Var) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, d9Var);
        W3(4, U3);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void g2(t8 t8Var, d9 d9Var) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, t8Var);
        m71.d(U3, d9Var);
        W3(2, U3);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void j1(long j, String str, String str2, String str3) throws RemoteException {
        Parcel U3 = U3();
        U3.writeLong(j);
        U3.writeString(str);
        U3.writeString(str2);
        U3.writeString(str3);
        W3(10, U3);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final List<t8> k0(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        U3.writeString(str3);
        m71.a(U3, z);
        Parcel V3 = V3(15, U3);
        ArrayList createTypedArrayList = V3.createTypedArrayList(t8.CREATOR);
        V3.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void n1(d9 d9Var) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, d9Var);
        W3(18, U3);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void p3(j jVar, d9 d9Var) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, jVar);
        m71.d(U3, d9Var);
        W3(1, U3);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void q0(g9 g9Var, d9 d9Var) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, g9Var);
        m71.d(U3, d9Var);
        W3(12, U3);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final List<g9> q1(String str, String str2, d9 d9Var) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        m71.d(U3, d9Var);
        Parcel V3 = V3(16, U3);
        ArrayList createTypedArrayList = V3.createTypedArrayList(g9.CREATOR);
        V3.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final byte[] r3(j jVar, String str) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, jVar);
        U3.writeString(str);
        Parcel V3 = V3(9, U3);
        byte[] createByteArray = V3.createByteArray();
        V3.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void t2(d9 d9Var) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, d9Var);
        W3(6, U3);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final List<g9> u2(String str, String str2, String str3) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        U3.writeString(str3);
        Parcel V3 = V3(17, U3);
        ArrayList createTypedArrayList = V3.createTypedArrayList(g9.CREATOR);
        V3.recycle();
        return createTypedArrayList;
    }
}
