package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.e0;
import defpackage.yq0;
import vigqyno.C0201;

/* renamed from: zq1  reason: default package */
public final class zq1 extends z21 implements wp1 {
    public zq1(IBinder iBinder) {
        super(iBinder, C0201.m82(15821));
    }

    @Override // defpackage.wp1
    public final yq0 D0(LatLng latLng) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, latLng);
        Parcel V3 = V3(2, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.wp1
    public final LatLng X2(yq0 yq0) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, yq0);
        Parcel V3 = V3(1, U3);
        LatLng latLng = (LatLng) j31.b(V3, LatLng.CREATOR);
        V3.recycle();
        return latLng;
    }

    @Override // defpackage.wp1
    public final e0 c1() throws RemoteException {
        Parcel V3 = V3(3, U3());
        e0 e0Var = (e0) j31.b(V3, e0.CREATOR);
        V3.recycle();
        return e0Var;
    }
}
