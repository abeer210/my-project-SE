package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qp1  reason: default package */
public final class qp1 extends ip0 {
    public static final Parcelable.Creator<qp1> CREATOR = new rp1();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public qp1(int i, int i2, int i3, int i4, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 2, this.a);
        kp0.n(parcel, 3, this.b);
        kp0.n(parcel, 4, this.c);
        kp0.n(parcel, 5, this.d);
        kp0.k(parcel, 6, this.e);
        kp0.b(parcel, a2);
    }
}
