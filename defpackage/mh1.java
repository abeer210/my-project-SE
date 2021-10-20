package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: mh1  reason: default package */
public final class mh1 extends a51 implements kh1 {
    public mh1(IBinder iBinder) {
        super(iBinder, C0201.m82(14374));
    }

    @Override // defpackage.kh1
    public final int a1() throws RemoteException {
        Parcel V3 = V3(2, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // defpackage.kh1
    public final void b(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeString(str2);
        m71.d(U3, bundle);
        U3.writeLong(j);
        W3(1, U3);
    }
}
