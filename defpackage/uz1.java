package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: uz1  reason: default package */
public final class uz1 extends kz1 implements vz1 {
    public uz1(IBinder iBinder) {
        super(iBinder, C0201.m82(37260));
    }

    @Override // defpackage.vz1
    public final void a(Bundle bundle) throws RemoteException {
        Parcel U3 = U3();
        mz1.c(U3, bundle);
        V3(3, U3);
    }

    @Override // defpackage.vz1
    public final void a(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel U3 = U3();
        mz1.c(U3, bundle);
        mz1.c(U3, bundle2);
        V3(2, U3);
    }

    @Override // defpackage.vz1
    public final void b(Bundle bundle) throws RemoteException {
        Parcel U3 = U3();
        mz1.c(U3, bundle);
        V3(4, U3);
    }
}
