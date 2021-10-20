package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: zu1  reason: default package */
public final class zu1 extends yh1 implements yu1 {
    public zu1(IBinder iBinder) {
        super(iBinder, C0201.m82(25521));
    }

    @Override // defpackage.yu1
    public final qu1[] L3(yq0 yq0, np1 np1) throws RemoteException {
        Parcel U3 = U3();
        pi1.a(U3, yq0);
        pi1.b(U3, np1);
        Parcel V3 = V3(1, U3);
        qu1[] qu1Arr = (qu1[]) V3.createTypedArray(qu1.CREATOR);
        V3.recycle();
        return qu1Arr;
    }

    @Override // defpackage.yu1
    public final void x() throws RemoteException {
        W3(3, U3());
    }
}
