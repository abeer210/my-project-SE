package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import vigqyno.C0201;

/* renamed from: b41  reason: default package */
public final class b41 extends z21 implements z31 {
    public b41(IBinder iBinder) {
        super(iBinder, C0201.m82(12954));
    }

    @Override // defpackage.z31
    public final void F() throws RemoteException {
        W3(11, U3());
    }

    @Override // defpackage.z31
    public final void I2(String str) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        W3(7, U3);
    }

    @Override // defpackage.z31
    public final void J0(String str) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        W3(5, U3);
    }

    @Override // defpackage.z31
    public final void O(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(9, U3);
    }

    @Override // defpackage.z31
    public final void P(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(20, U3);
    }

    @Override // defpackage.z31
    public final void S(float f, float f2) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        U3.writeFloat(f2);
        W3(24, U3);
    }

    @Override // defpackage.z31
    public final void T1(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(25, U3);
    }

    @Override // defpackage.z31
    public final void e(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(27, U3);
    }

    @Override // defpackage.z31
    public final void g1() throws RemoteException {
        W3(12, U3());
    }

    @Override // defpackage.z31
    public final LatLng getPosition() throws RemoteException {
        Parcel V3 = V3(4, U3());
        LatLng latLng = (LatLng) j31.b(V3, LatLng.CREATOR);
        V3.recycle();
        return latLng;
    }

    @Override // defpackage.z31
    public final String getTitle() throws RemoteException {
        Parcel V3 = V3(6, U3());
        String readString = V3.readString();
        V3.recycle();
        return readString;
    }

    @Override // defpackage.z31
    public final void h0(float f, float f2) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        U3.writeFloat(f2);
        W3(19, U3);
    }

    @Override // defpackage.z31
    public final void i0(LatLng latLng) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, latLng);
        W3(3, U3);
    }

    @Override // defpackage.z31
    public final boolean l2(z31 z31) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, z31);
        Parcel V3 = V3(16, U3);
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }

    @Override // defpackage.z31
    public final void p2(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(22, U3);
    }

    @Override // defpackage.z31
    public final void remove() throws RemoteException {
        W3(1, U3());
    }

    @Override // defpackage.z31
    public final int s() throws RemoteException {
        Parcel V3 = V3(17, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // defpackage.z31
    public final void s1(yq0 yq0) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, yq0);
        W3(18, U3);
    }

    @Override // defpackage.z31
    public final void setVisible(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(14, U3);
    }

    @Override // defpackage.z31
    public final String x3() throws RemoteException {
        Parcel V3 = V3(8, U3());
        String readString = V3.readString();
        V3.recycle();
        return readString;
    }
}
