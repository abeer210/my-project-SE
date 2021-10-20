package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: ai1  reason: default package */
public final class ai1 extends yh1 implements zh1 {
    public ai1(IBinder iBinder) {
        super(iBinder, C0201.m82(24570));
    }

    @Override // defpackage.zh1
    public final void D() throws RemoteException {
        W3(2, U3());
    }

    @Override // defpackage.zh1
    public final di1[] E0(yq0 yq0, np1 np1, fi1 fi1) throws RemoteException {
        Parcel U3 = U3();
        pi1.a(U3, yq0);
        pi1.b(U3, np1);
        pi1.b(U3, fi1);
        Parcel V3 = V3(3, U3);
        di1[] di1Arr = (di1[]) V3.createTypedArray(di1.CREATOR);
        V3.recycle();
        return di1Arr;
    }
}
