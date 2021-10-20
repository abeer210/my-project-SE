package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: lh1  reason: default package */
public final class lh1 extends a51 implements jh1 {
    public lh1(IBinder iBinder) {
        super(iBinder, C0201.m82(16883));
    }

    @Override // defpackage.jh1
    public final void q2(Bundle bundle) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, bundle);
        W3(1, U3);
    }
}
