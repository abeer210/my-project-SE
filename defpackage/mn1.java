package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: mn1  reason: default package */
public final class mn1 extends yh1 implements nm1 {
    public mn1(IBinder iBinder) {
        super(iBinder, C0201.m82(28775));
    }

    @Override // defpackage.nm1
    public final wt1[] K2(yq0 yq0, np1 np1) throws RemoteException {
        Parcel U3 = U3();
        pi1.a(U3, yq0);
        pi1.b(U3, np1);
        Parcel V3 = V3(1, U3);
        wt1[] wt1Arr = (wt1[]) V3.createTypedArray(wt1.CREATOR);
        V3.recycle();
        return wt1Arr;
    }

    @Override // defpackage.nm1
    public final wt1[] i3(yq0 yq0, np1 np1) throws RemoteException {
        Parcel U3 = U3();
        pi1.a(U3, yq0);
        pi1.b(U3, np1);
        Parcel V3 = V3(2, U3);
        wt1[] wt1Arr = (wt1[]) V3.createTypedArray(wt1.CREATOR);
        V3.recycle();
        return wt1Arr;
    }

    @Override // defpackage.nm1
    public final void x() throws RemoteException {
        W3(3, U3());
    }
}
