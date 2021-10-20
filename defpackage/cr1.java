package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: cr1  reason: default package */
public final class cr1 extends z21 implements xp1 {
    public cr1(IBinder iBinder) {
        super(iBinder, C0201.m82(26769));
    }

    @Override // defpackage.xp1
    public final void A2(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(4, U3);
    }

    @Override // defpackage.xp1
    public final void E1(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(7, U3);
    }

    @Override // defpackage.xp1
    public final void R3(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(16, U3);
    }

    @Override // defpackage.xp1
    public final void V(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(3, U3);
    }

    @Override // defpackage.xp1
    public final void W(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(2, U3);
    }

    @Override // defpackage.xp1
    public final void Z0(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(6, U3);
    }

    @Override // defpackage.xp1
    public final boolean d3() throws RemoteException {
        Parcel V3 = V3(12, U3());
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }

    @Override // defpackage.xp1
    public final void f1(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(5, U3);
    }

    @Override // defpackage.xp1
    public final void m2(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(18, U3);
    }

    @Override // defpackage.xp1
    public final void z1(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(1, U3);
    }
}
