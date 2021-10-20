package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class r extends ip0 {
    public static final Parcelable.Creator<r> CREATOR = new o0();
    public final LatLng a;
    public final String b;
    public final String c;

    public r(LatLng latLng, String str, String str2) {
        this.a = latLng;
        this.b = str;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 2, this.a, i, false);
        kp0.u(parcel, 3, this.b, false);
        kp0.u(parcel, 4, this.c, false);
        kp0.b(parcel, a2);
    }
}
