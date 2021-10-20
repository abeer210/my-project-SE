package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: e31  reason: default package */
public final class e31 extends z21 implements c31 {
    public e31(IBinder iBinder) {
        super(iBinder, C0201.m82(28535));
    }

    @Override // defpackage.c31
    public final void R() throws RemoteException {
        W3(2, U3());
    }

    @Override // defpackage.c31
    public final void e(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(4, U3);
    }

    @Override // defpackage.c31
    public final void f(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(12, U3);
    }

    @Override // defpackage.c31
    public final boolean l0(c31 c31) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, c31);
        Parcel V3 = V3(8, U3);
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }

    @Override // defpackage.c31
    public final void remove() throws RemoteException {
        W3(1, U3());
    }

    @Override // defpackage.c31
    public final int s() throws RemoteException {
        Parcel V3 = V3(9, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }
}
