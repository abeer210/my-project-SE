package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mi1  reason: default package */
public final class mi1 extends ip0 {
    public static final Parcelable.Creator<mi1> CREATOR = new ni1();
    private final hi1[] a;
    public final qp1 b;
    private final qp1 c;
    public final String d;
    private final float e;
    public final String f;
    private final boolean g;

    public mi1(hi1[] hi1Arr, qp1 qp1, qp1 qp12, String str, float f2, String str2, boolean z) {
        this.a = hi1Arr;
        this.b = qp1;
        this.c = qp12;
        this.d = str;
        this.e = f2;
        this.f = str2;
        this.g = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.x(parcel, 2, this.a, i, false);
        kp0.s(parcel, 3, this.b, i, false);
        kp0.s(parcel, 4, this.c, i, false);
        kp0.u(parcel, 5, this.d, false);
        kp0.k(parcel, 6, this.e);
        kp0.u(parcel, 7, this.f, false);
        kp0.c(parcel, 8, this.g);
        kp0.b(parcel, a2);
    }
}
