package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("wrapper.cc")
/* renamed from: ru1  reason: default package */
public final class ru1 extends ip0 {
    public static final Parcelable.Creator<ru1> CREATOR = new dv1();
    private final int a;
    public final float b;
    public final float c;
    public final int d;

    @UsedByNative("wrapper.cc")
    public ru1(int i, float f, float f2, int i2) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.k(parcel, 2, this.b);
        kp0.k(parcel, 3, this.c);
        kp0.n(parcel, 4, this.d);
        kp0.b(parcel, a2);
    }
}
