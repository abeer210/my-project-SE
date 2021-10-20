package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wu1  reason: default package */
public final class wu1 extends ip0 {
    public static final Parcelable.Creator<wu1> CREATOR = new xu1();
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    public wu1() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 2, this.a);
        kp0.n(parcel, 3, this.b);
        kp0.n(parcel, 4, this.c);
        kp0.c(parcel, 5, this.d);
        kp0.c(parcel, 6, this.e);
        kp0.k(parcel, 7, this.f);
        kp0.b(parcel, a2);
    }

    public wu1(int i, int i2, int i3, boolean z, boolean z2, float f2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = f2;
    }
}
