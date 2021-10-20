package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class m extends ip0 {
    public static final Parcelable.Creator<m> CREATOR = new y();
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public m(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean o() {
        return this.f;
    }

    public final boolean p() {
        return this.c;
    }

    public final boolean r() {
        return this.d;
    }

    public final boolean s() {
        return this.a;
    }

    public final boolean u() {
        return this.e;
    }

    public final boolean w() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.c(parcel, 1, s());
        kp0.c(parcel, 2, w());
        kp0.c(parcel, 3, p());
        kp0.c(parcel, 4, r());
        kp0.c(parcel, 5, u());
        kp0.c(parcel, 6, o());
        kp0.b(parcel, a2);
    }
}
