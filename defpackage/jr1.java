package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.b0;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.model.k;
import com.google.android.gms.maps.model.n;
import com.google.android.gms.maps.model.p;
import com.google.android.gms.maps.model.t;
import com.google.android.gms.maps.model.v;
import vigqyno.C0201;

/* renamed from: jr1  reason: default package */
public final class jr1 extends z21 implements tp1 {
    public jr1(IBinder iBinder) {
        super(iBinder, C0201.m82(20188));
    }

    @Override // defpackage.tp1
    public final void A1(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(18, U3);
    }

    @Override // defpackage.tp1
    public final c31 A3(b0 b0Var) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, b0Var);
        Parcel V3 = V3(13, U3);
        c31 U32 = d31.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.tp1
    public final t31 B3() throws RemoteException {
        Parcel V3 = V3(44, U3());
        t31 U3 = u31.U3(V3.readStrongBinder());
        V3.recycle();
        return U3;
    }

    @Override // defpackage.tp1
    public final void D1(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(92, U3);
    }

    @Override // defpackage.tp1
    public final void D2(pr1 pr1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, pr1);
        W3(97, U3);
    }

    @Override // defpackage.tp1
    public final wp1 F2() throws RemoteException {
        wp1 wp1;
        Parcel V3 = V3(26, U3());
        IBinder readStrongBinder = V3.readStrongBinder();
        if (readStrongBinder == null) {
            wp1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(20189));
            if (queryLocalInterface instanceof wp1) {
                wp1 = (wp1) queryLocalInterface;
            } else {
                wp1 = new zq1(readStrongBinder);
            }
        }
        V3.recycle();
        return wp1;
    }

    @Override // defpackage.tp1
    public final void H0(yq0 yq0) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, yq0);
        W3(4, U3);
    }

    @Override // defpackage.tp1
    public final z31 H3(p pVar) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, pVar);
        Parcel V3 = V3(11, U3);
        z31 U32 = a41.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.tp1
    public final CameraPosition I0() throws RemoteException {
        Parcel V3 = V3(1, U3());
        CameraPosition cameraPosition = (CameraPosition) j31.b(V3, CameraPosition.CREATOR);
        V3.recycle();
        return cameraPosition;
    }

    @Override // defpackage.tp1
    public final void L1(int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        W3(16, U3);
    }

    @Override // defpackage.tp1
    public final boolean M0(n nVar) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, nVar);
        Parcel V3 = V3(91, U3);
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }

    @Override // defpackage.tp1
    public final void M2(vr1 vr1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, vr1);
        W3(45, U3);
    }

    @Override // defpackage.tp1
    public final void M3(oq1 oq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, oq1);
        W3(31, U3);
    }

    @Override // defpackage.tp1
    public final void N(rr1 rr1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, rr1);
        W3(96, U3);
    }

    @Override // defpackage.tp1
    public final void O3(vq1 vq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, vq1);
        W3(85, U3);
    }

    @Override // defpackage.tp1
    public final void P2(tq1 tq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, tq1);
        W3(80, U3);
    }

    @Override // defpackage.tp1
    public final void P3(qq1 qq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, qq1);
        W3(36, U3);
    }

    @Override // defpackage.tp1
    public final boolean T(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        Parcel V3 = V3(20, U3);
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }

    @Override // defpackage.tp1
    public final void U2(yq0 yq0) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, yq0);
        W3(5, U3);
    }

    @Override // defpackage.tp1
    public final c41 V1(t tVar) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, tVar);
        Parcel V3 = V3(10, U3);
        c41 U32 = d41.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.tp1
    public final void W1(nr1 nr1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, nr1);
        W3(99, U3);
    }

    @Override // defpackage.tp1
    public final void Y(eq1 eq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, eq1);
        W3(28, U3);
    }

    @Override // defpackage.tp1
    public final void Z(LatLngBounds latLngBounds) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, latLngBounds);
        W3(95, U3);
    }

    @Override // defpackage.tp1
    public final void d1(ar1 ar1, yq0 yq0) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, ar1);
        j31.c(U3, yq0);
        W3(38, U3);
    }

    @Override // defpackage.tp1
    public final void e1(aq1 aq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, aq1);
        W3(32, U3);
    }

    @Override // defpackage.tp1
    public final n31 g0(f fVar) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, fVar);
        Parcel V3 = V3(35, U3);
        n31 U32 = o31.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.tp1
    public final f41 g3(v vVar) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, vVar);
        Parcel V3 = V3(9, U3);
        f41 U32 = a31.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.tp1
    public final void h1(tr1 tr1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, tr1);
        W3(83, U3);
    }

    @Override // defpackage.tp1
    public final xp1 i2() throws RemoteException {
        xp1 xp1;
        Parcel V3 = V3(25, U3());
        IBinder readStrongBinder = V3.readStrongBinder();
        if (readStrongBinder == null) {
            xp1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(20190));
            if (queryLocalInterface instanceof xp1) {
                xp1 = (xp1) queryLocalInterface;
            } else {
                xp1 = new cr1(readStrongBinder);
            }
        }
        V3.recycle();
        return xp1;
    }

    @Override // defpackage.tp1
    public final void j0(xq1 xq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, xq1);
        W3(87, U3);
    }

    @Override // defpackage.tp1
    public final void l3(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(22, U3);
    }

    @Override // defpackage.tp1
    public final q31 m1(k kVar) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, kVar);
        Parcel V3 = V3(12, U3);
        q31 U32 = r31.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.tp1
    public final void m3(kr1 kr1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, kr1);
        W3(33, U3);
    }

    @Override // defpackage.tp1
    public final void o0(gq1 gq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, gq1);
        W3(42, U3);
    }

    @Override // defpackage.tp1
    public final void q(boolean z) throws RemoteException {
        Parcel U3 = U3();
        j31.a(U3, z);
        W3(41, U3);
    }

    @Override // defpackage.tp1
    public final void t1(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        W3(93, U3);
    }

    @Override // defpackage.tp1
    public final void t3(mq1 mq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, mq1);
        W3(30, U3);
    }

    @Override // defpackage.tp1
    public final void u1(yq0 yq0, int i, fr1 fr1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, yq0);
        U3.writeInt(i);
        j31.c(U3, fr1);
        W3(7, U3);
    }

    @Override // defpackage.tp1
    public final void v0(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        U3.writeInt(i2);
        U3.writeInt(i3);
        U3.writeInt(i4);
        W3(39, U3);
    }

    @Override // defpackage.tp1
    public final void w3(iq1 iq1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, iq1);
        W3(29, U3);
    }

    @Override // defpackage.tp1
    public final void z0(up1 up1) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, up1);
        W3(24, U3);
    }
}
