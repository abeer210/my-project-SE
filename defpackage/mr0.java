package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: mr0  reason: default package */
public final class mr0 extends c11 implements kr0 {
    public mr0(IBinder iBinder) {
        super(iBinder, C0201.m82(36835));
    }

    @Override // defpackage.kr0
    public final boolean getBooleanFlagValue(String str, boolean z, int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        e11.a(U3, z);
        U3.writeInt(i);
        Parcel V3 = V3(2, U3);
        boolean c = e11.c(V3);
        V3.recycle();
        return c;
    }

    @Override // defpackage.kr0
    public final int getIntFlagValue(String str, int i, int i2) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeInt(i);
        U3.writeInt(i2);
        Parcel V3 = V3(3, U3);
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // defpackage.kr0
    public final long getLongFlagValue(String str, long j, int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeLong(j);
        U3.writeInt(i);
        Parcel V3 = V3(4, U3);
        long readLong = V3.readLong();
        V3.recycle();
        return readLong;
    }

    @Override // defpackage.kr0
    public final String getStringFlagValue(String str, String str2, int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        U3.writeInt(i);
        Parcel V3 = V3(5, U3);
        String readString = V3.readString();
        V3.recycle();
        return readString;
    }

    @Override // defpackage.kr0
    public final void init(yq0 yq0) throws RemoteException {
        Parcel U3 = U3();
        e11.b(U3, yq0);
        W3(1, U3);
    }
}
