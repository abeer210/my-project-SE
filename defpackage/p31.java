package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import vigqyno.C0201;

/* renamed from: p31  reason: default package */
public final class p31 extends z21 implements n31 {
    public p31(IBinder iBinder) {
        super(iBinder, C0201.m82(28342));
    }

    @Override // defpackage.n31
    public final void d(int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        W3(9, U3);
    }

    @Override // defpackage.n31
    public final void e(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(13, U3);
    }

    @Override // defpackage.n31
    public final void n(int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        W3(11, U3);
    }

    @Override // defpackage.n31
    public final void n3(double d) throws RemoteException {
        Parcel U3 = U3();
        U3.writeDouble(d);
        W3(5, U3);
    }

    @Override // defpackage.n31
    public final void o(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(7, U3);
    }

    @Override // defpackage.n31
    public final void remove() throws RemoteException {
        W3(1, U3());
    }

    @Override // defpackage.n31
    public final int s() throws RemoteException {
        Parcel V3 = V3(18, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // defpackage.n31
    public final void v3(LatLng latLng) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, latLng);
        W3(3, U3);
    }

    @Override // defpackage.n31
    public final boolean w0(n31 n31) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, n31);
        Parcel V3 = V3(17, U3);
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }
}
