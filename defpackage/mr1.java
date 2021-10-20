package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.yq0;
import vigqyno.C0201;

/* renamed from: mr1  reason: default package */
public final class mr1 extends z21 implements vp1 {
    public mr1(IBinder iBinder) {
        super(iBinder, C0201.m82(36814));
    }

    @Override // defpackage.vp1
    public final yq0 L2() throws RemoteException {
        Parcel V3 = V3(8, U3());
        yq0 U3 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U3;
    }

    @Override // defpackage.vp1
    public final void Z2(kq1 kq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, kq1);
        W3(9, U3);
    }

    @Override // defpackage.vp1
    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, bundle);
        W3(2, U3);
    }

    @Override // defpackage.vp1
    public final void onDestroy() throws RemoteException {
        W3(5, U3());
    }

    @Override // defpackage.vp1
    public final void onPause() throws RemoteException {
        W3(4, U3());
    }

    @Override // defpackage.vp1
    public final void onResume() throws RemoteException {
        W3(3, U3());
    }
}
