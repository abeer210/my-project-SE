package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: di1  reason: default package */
public final class di1 extends ip0 {
    public static final Parcelable.Creator<di1> CREATOR = new ei1();
    public final mi1[] a;
    public final qp1 b;
    private final qp1 c;
    private final qp1 d;
    public final String e;
    private final float f;
    public final String g;
    private final int h;
    public final boolean i;
    public final int j;
    public final int k;

    public di1(mi1[] mi1Arr, qp1 qp1, qp1 qp12, qp1 qp13, String str, float f2, String str2, int i2, boolean z, int i3, int i4) {
        this.a = mi1Arr;
        this.b = qp1;
        this.c = qp12;
        this.d = qp13;
        this.e = str;
        this.f = f2;
        this.g = str2;
        this.h = i2;
        this.i = z;
        this.j = i3;
        this.k = i4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.x(parcel, 2, this.a, i2, false);
        kp0.s(parcel, 3, this.b, i2, false);
        kp0.s(parcel, 4, this.c, i2, false);
        kp0.s(parcel, 5, this.d, i2, false);
        kp0.u(parcel, 6, this.e, false);
        kp0.k(parcel, 7, this.f);
        kp0.u(parcel, 8, this.g, false);
        kp0.n(parcel, 9, this.h);
        kp0.c(parcel, 10, this.i);
        kp0.n(parcel, 11, this.j);
        kp0.n(parcel, 12, this.k);
        kp0.b(parcel, a2);
    }
}
