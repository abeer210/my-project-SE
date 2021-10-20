package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: wz1  reason: default package */
public final class wz1 extends kz1 implements dy1 {
    public wz1(IBinder iBinder) {
        super(iBinder, C0201.m82(24684));
    }

    @Override // defpackage.dy1
    public final void p(String str, Bundle bundle, fy1 fy1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        mz1.c(U3, bundle);
        mz1.b(U3, fy1);
        V3(2, U3);
    }
}
