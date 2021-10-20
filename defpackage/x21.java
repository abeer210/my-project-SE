package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.k0;
import com.google.android.gms.location.l0;
import vigqyno.C0201;

/* renamed from: x21  reason: default package */
public final class x21 extends ip0 {
    public static final Parcelable.Creator<x21> CREATOR = new y21();
    private int a;
    private v21 b;
    private k0 c;
    private n11 d;

    public x21(int i, v21 v21, IBinder iBinder, IBinder iBinder2) {
        this.a = i;
        this.b = v21;
        n11 n11 = null;
        this.c = iBinder == null ? null : l0.U3(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface(C0201.m82(8053));
            n11 = queryLocalInterface instanceof n11 ? (n11) queryLocalInterface : new p11(iBinder2);
        }
        this.d = n11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.s(parcel, 2, this.b, i, false);
        k0 k0Var = this.c;
        IBinder iBinder = null;
        kp0.m(parcel, 3, k0Var == null ? null : k0Var.asBinder(), false);
        n11 n11 = this.d;
        if (n11 != null) {
            iBinder = n11.asBinder();
        }
        kp0.m(parcel, 4, iBinder, false);
        kp0.b(parcel, a2);
    }
}
