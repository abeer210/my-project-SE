package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import vigqyno.C0201;

/* renamed from: nz1  reason: default package */
public final class nz1 extends kz1 implements pz1 {
    public nz1(IBinder iBinder) {
        super(iBinder, C0201.m82(9698));
    }

    @Override // defpackage.pz1
    public final void G2(String str, Bundle bundle, Bundle bundle2, rz1 rz1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        mz1.c(U3, bundle);
        mz1.c(U3, bundle2);
        mz1.b(U3, rz1);
        V3(11, U3);
    }

    @Override // defpackage.pz1
    public final void Q0(String str, Bundle bundle, rz1 rz1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        mz1.c(U3, bundle);
        mz1.b(U3, rz1);
        V3(10, U3);
    }

    @Override // defpackage.pz1
    public final void V2(String str, List<Bundle> list, Bundle bundle, rz1 rz1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        U3.writeTypedList(list);
        mz1.c(U3, bundle);
        mz1.b(U3, rz1);
        V3(14, U3);
    }

    @Override // defpackage.pz1
    public final void b1(String str, Bundle bundle, Bundle bundle2, rz1 rz1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        mz1.c(U3, bundle);
        mz1.c(U3, bundle2);
        mz1.b(U3, rz1);
        V3(6, U3);
    }

    @Override // defpackage.pz1
    public final void d2(String str, Bundle bundle, Bundle bundle2, rz1 rz1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        mz1.c(U3, bundle);
        mz1.c(U3, bundle2);
        mz1.b(U3, rz1);
        V3(9, U3);
    }

    @Override // defpackage.pz1
    public final void v1(String str, Bundle bundle, rz1 rz1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        mz1.c(U3, bundle);
        mz1.b(U3, rz1);
        V3(5, U3);
    }

    @Override // defpackage.pz1
    public final void y1(String str, Bundle bundle, Bundle bundle2, rz1 rz1) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        mz1.c(U3, bundle);
        mz1.c(U3, bundle2);
        mz1.b(U3, rz1);
        V3(7, U3);
    }
}
