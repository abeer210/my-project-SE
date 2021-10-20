package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.yq0;
import vigqyno.C0201;

/* renamed from: sq1  reason: default package */
public final class sq1 extends z21 implements sp1 {
    public sq1(IBinder iBinder) {
        super(iBinder, C0201.m82(27502));
    }

    @Override // defpackage.sp1
    public final yq0 A0(LatLng latLng) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, latLng);
        Parcel V3 = V3(8, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.sp1
    public final yq0 c2(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, latLngBounds);
        U3.writeInt(i);
        U3.writeInt(i2);
        U3.writeInt(i3);
        Parcel V3 = V3(11, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.sp1
    public final yq0 n2(CameraPosition cameraPosition) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, cameraPosition);
        Parcel V3 = V3(7, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.sp1
    public final yq0 q3(LatLng latLng, float f) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, latLng);
        U3.writeFloat(f);
        Parcel V3 = V3(9, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.sp1
    public final yq0 r(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, latLngBounds);
        U3.writeInt(i);
        Parcel V3 = V3(10, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }
}
