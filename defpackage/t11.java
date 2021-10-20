package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.b0;
import com.google.android.gms.location.f;
import com.google.android.gms.location.j;
import vigqyno.C0201;

/* renamed from: t11  reason: default package */
public final class t11 extends g11 implements s11 {
    public t11(IBinder iBinder) {
        super(iBinder, C0201.m82(33759));
    }

    @Override // defpackage.s11
    public final void B1(x21 x21) throws RemoteException {
        Parcel U3 = U3();
        s21.c(U3, x21);
        W3(75, U3);
    }

    @Override // defpackage.s11
    public final void B2(boolean z) throws RemoteException {
        Parcel U3 = U3();
        s21.d(U3, z);
        W3(12, U3);
    }

    @Override // defpackage.s11
    public final void F3(f fVar, PendingIntent pendingIntent, q11 q11) throws RemoteException {
        Parcel U3 = U3();
        s21.c(U3, fVar);
        s21.c(U3, pendingIntent);
        s21.b(U3, q11);
        W3(57, U3);
    }

    @Override // defpackage.s11
    public final void I3(j jVar, u11 u11, String str) throws RemoteException {
        Parcel U3 = U3();
        s21.c(U3, jVar);
        s21.b(U3, u11);
        U3.writeString(str);
        W3(63, U3);
    }

    @Override // defpackage.s11
    public final void O2(k21 k21) throws RemoteException {
        Parcel U3 = U3();
        s21.c(U3, k21);
        W3(59, U3);
    }

    @Override // defpackage.s11
    public final Location R2(String str) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        Parcel V3 = V3(21, U3);
        Location location = (Location) s21.a(V3, Location.CREATOR);
        V3.recycle();
        return location;
    }

    @Override // defpackage.s11
    public final void Y1(b0 b0Var, q11 q11) throws RemoteException {
        Parcel U3 = U3();
        s21.c(U3, b0Var);
        s21.b(U3, q11);
        W3(74, U3);
    }
}
