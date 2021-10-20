package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pj1  reason: default package */
public final class pj1 extends ip0 {
    public static final Parcelable.Creator<pj1> CREATOR = new lk1();
    public int a;

    public pj1() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 2, this.a);
        kp0.b(parcel, a2);
    }

    public pj1(int i) {
        this.a = i;
    }
}
