package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: a01  reason: default package */
public final class a01 extends ft0 implements zz0 {
    public a01(IBinder iBinder) {
        super(iBinder, C0201.m82(5579));
    }

    @Override // defpackage.zz0
    public final void y0(xz0 xz0, so0 so0) throws RemoteException {
        Parcel U3 = U3();
        dv0.b(U3, xz0);
        dv0.c(U3, so0);
        V3(1, U3);
    }
}
