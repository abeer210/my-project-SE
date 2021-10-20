package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: e41  reason: default package */
public final class e41 extends z21 implements c41 {
    public e41(IBinder iBinder) {
        super(iBinder, C0201.m82(26770));
    }

    @Override // defpackage.c41
    public final boolean E3(c41 c41) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, c41);
        Parcel V3 = V3(19, U3);
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }

    @Override // defpackage.c41
    public final void d(int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        W3(9, U3);
    }

    @Override // defpackage.c41
    public final void e(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(13, U3);
    }

    @Override // defpackage.c41
    public final void l(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(21, U3);
    }

    @Override // defpackage.c41
    public final void n(int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        W3(11, U3);
    }

    @Override // defpackage.c41
    public final void o(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(7, U3);
    }

    @Override // defpackage.c41
    public final void remove() throws RemoteException {
        W3(1, U3());
    }

    @Override // defpackage.c41
    public final int s() throws RemoteException {
        Parcel V3 = V3(20, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // defpackage.c41
    public final void s0(List list) throws RemoteException {
        Parcel U3 = U3();
        U3.writeList(list);
        W3(5, U3);
    }

    @Override // defpackage.c41
    public final void setVisible(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(15, U3);
    }

    @Override // defpackage.c41
    public final List<LatLng> v() throws RemoteException {
        Parcel V3 = V3(4, U3());
        ArrayList createTypedArrayList = V3.createTypedArrayList(LatLng.CREATOR);
        V3.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.c41
    public final void y(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(17, U3);
    }

    @Override // defpackage.c41
    public final void z(List<LatLng> list) throws RemoteException {
        Parcel U3 = U3();
        U3.writeTypedList(list);
        W3(3, U3);
    }
}
