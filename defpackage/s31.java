package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import vigqyno.C0201;

/* renamed from: s31  reason: default package */
public final class s31 extends z21 implements q31 {
    public s31(IBinder iBinder) {
        super(iBinder, C0201.m82(2129));
    }

    @Override // defpackage.q31
    public final void B0(LatLngBounds latLngBounds) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, latLngBounds);
        W3(9, U3);
    }

    @Override // defpackage.q31
    public final void J(yq0 yq0) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, yq0);
        W3(21, U3);
    }

    @Override // defpackage.q31
    public final void e(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(13, U3);
    }

    @Override // defpackage.q31
    public final void f(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(17, U3);
    }

    @Override // defpackage.q31
    public final LatLng getPosition() throws RemoteException {
        Parcel V3 = V3(4, U3());
        LatLng latLng = (LatLng) j31.b(V3, LatLng.CREATOR);
        V3.recycle();
        return latLng;
    }

    @Override // defpackage.q31
    public final boolean k2(q31 q31) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, q31);
        Parcel V3 = V3(19, U3);
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }

    @Override // defpackage.q31
    public final void l(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(22, U3);
    }

    @Override // defpackage.q31
    public final void remove() throws RemoteException {
        W3(1, U3());
    }

    @Override // defpackage.q31
    public final int s() throws RemoteException {
        Parcel V3 = V3(20, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // defpackage.q31
    public final void setVisible(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(15, U3);
    }
}
