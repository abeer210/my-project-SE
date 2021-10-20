package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class k0 extends ip0 {
    public static final Parcelable.Creator<k0> CREATOR = new l0();
    public Bundle a;
    public xo0[] b;
    private int c;

    public k0(Bundle bundle, xo0[] xo0Arr, int i) {
        this.a = bundle;
        this.b = xo0Arr;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.e(parcel, 1, this.a, false);
        kp0.x(parcel, 2, this.b, i, false);
        kp0.n(parcel, 3, this.c);
        kp0.b(parcel, a2);
    }

    public k0() {
    }
}
