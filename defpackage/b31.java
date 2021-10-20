package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.d;
import com.google.android.gms.maps.model.q;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: b31  reason: default package */
public final class b31 extends z21 implements f41 {
    public b31(IBinder iBinder) {
        super(iBinder, C0201.m82(4953));
    }

    @Override // defpackage.f41
    public final void C0(d dVar) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, dVar);
        W3(21, U3);
    }

    @Override // defpackage.f41
    public final void U(List<q> list) throws RemoteException {
        Parcel U3 = U3();
        U3.writeTypedList(list);
        W3(25, U3);
    }

    @Override // defpackage.f41
    public final boolean W0(f41 f41) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, f41);
        Parcel V3 = V3(15, U3);
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }

    @Override // defpackage.f41
    public final void e(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(9, U3);
    }

    @Override // defpackage.f41
    public final void i1(int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        W3(7, U3);
    }

    @Override // defpackage.f41
    public final void j3(d dVar) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, dVar);
        W3(19, U3);
    }

    @Override // defpackage.f41
    public final void l(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(17, U3);
    }

    @Override // defpackage.f41
    public final void remove() throws RemoteException {
        W3(1, U3());
    }

    @Override // defpackage.f41
    public final int s() throws RemoteException {
        Parcel V3 = V3(16, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // defpackage.f41
    public final void setVisible(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(11, U3);
    }

    @Override // defpackage.f41
    public final List<LatLng> v() throws RemoteException {
        Parcel V3 = V3(4, U3());
        ArrayList createTypedArrayList = V3.createTypedArrayList(LatLng.CREATOR);
        V3.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.f41
    public final void v2(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(5, U3);
    }

    @Override // defpackage.f41
    public final void y(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(13, U3);
    }

    @Override // defpackage.f41
    public final void z(List<LatLng> list) throws RemoteException {
        Parcel U3 = U3();
        U3.writeTypedList(list);
        W3(3, U3);
    }
}
