package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("wrapper.cc")
/* renamed from: qu1  reason: default package */
public class qu1 extends ip0 {
    public static final Parcelable.Creator<qu1> CREATOR = new vu1();
    private final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final ru1[] j;
    public final float k;
    public final float l;
    public final float m;
    public final su1[] n;

    public qu1(int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, float f8, ru1[] ru1Arr, float f9, float f10, float f11, su1[] su1Arr) {
        this.a = i2;
        this.b = i3;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = ru1Arr;
        this.k = f9;
        this.l = f10;
        this.m = f11;
        this.n = su1Arr;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.n(parcel, 2, this.b);
        kp0.k(parcel, 3, this.c);
        kp0.k(parcel, 4, this.d);
        kp0.k(parcel, 5, this.e);
        kp0.k(parcel, 6, this.f);
        kp0.k(parcel, 7, this.g);
        kp0.k(parcel, 8, this.h);
        kp0.x(parcel, 9, this.j, i2, false);
        kp0.k(parcel, 10, this.k);
        kp0.k(parcel, 11, this.l);
        kp0.k(parcel, 12, this.m);
        kp0.x(parcel, 13, this.n, i2, false);
        kp0.k(parcel, 14, this.i);
        kp0.b(parcel, a2);
    }
}
