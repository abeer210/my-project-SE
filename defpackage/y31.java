package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: y31  reason: default package */
public final class y31 extends z21 implements w31 {
    public y31(IBinder iBinder) {
        super(iBinder, C0201.m82(2776));
    }

    @Override // defpackage.w31
    public final boolean F0(w31 w31) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, w31);
        Parcel V3 = V3(4, U3);
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }

    @Override // defpackage.w31
    public final String L() throws RemoteException {
        Parcel V3 = V3(2, U3());
        String readString = V3.readString();
        V3.recycle();
        return readString;
    }

    @Override // defpackage.w31
    public final String getName() throws RemoteException {
        Parcel V3 = V3(1, U3());
        String readString = V3.readString();
        V3.recycle();
        return readString;
    }

    @Override // defpackage.w31
    public final void h2() throws RemoteException {
        W3(3, U3());
    }

    @Override // defpackage.w31
    public final int s() throws RemoteException {
        Parcel V3 = V3(5, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }
}
