package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: p11  reason: default package */
public final class p11 extends g11 implements n11 {
    public p11(IBinder iBinder) {
        super(iBinder, C0201.m82(23935));
    }

    @Override // defpackage.n11
    public final void d0(h11 h11) throws RemoteException {
        Parcel U3 = U3();
        s21.c(U3, h11);
        X3(1, U3);
    }
}
