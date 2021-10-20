package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.n0;
import com.google.android.gms.location.o0;
import com.google.android.gms.location.q0;
import com.google.android.gms.location.r0;
import vigqyno.C0201;

/* renamed from: k21  reason: default package */
public final class k21 extends ip0 {
    public static final Parcelable.Creator<k21> CREATOR = new l21();
    private int a;
    private i21 b;
    private q0 c;
    private PendingIntent d;
    private n0 e;
    private n11 f;

    public k21(int i, i21 i21, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.a = i;
        this.b = i21;
        n11 n11 = null;
        this.c = iBinder == null ? null : r0.U3(iBinder);
        this.d = pendingIntent;
        this.e = iBinder2 == null ? null : o0.U3(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface(C0201.m82(17432));
            n11 = queryLocalInterface instanceof n11 ? (n11) queryLocalInterface : new p11(iBinder3);
        }
        this.f = n11;
    }

    public static k21 o(n0 n0Var, n11 n11) {
        return new k21(2, null, null, null, n0Var.asBinder(), n11 != null ? n11.asBinder() : null);
    }

    public static k21 p(q0 q0Var, n11 n11) {
        return new k21(2, null, q0Var.asBinder(), null, null, n11 != null ? n11.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.s(parcel, 2, this.b, i, false);
        q0 q0Var = this.c;
        IBinder iBinder = null;
        kp0.m(parcel, 3, q0Var == null ? null : q0Var.asBinder(), false);
        kp0.s(parcel, 4, this.d, i, false);
        n0 n0Var = this.e;
        kp0.m(parcel, 5, n0Var == null ? null : n0Var.asBinder(), false);
        n11 n11 = this.f;
        if (n11 != null) {
            iBinder = n11.asBinder();
        }
        kp0.m(parcel, 6, iBinder, false);
        kp0.b(parcel, a2);
    }
}
