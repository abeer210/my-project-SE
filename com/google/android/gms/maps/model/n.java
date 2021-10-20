package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class n extends ip0 {
    public static final Parcelable.Creator<n> CREATOR = new l0();
    private String a;

    public n(String str) {
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 2, this.a, false);
        kp0.b(parcel, a2);
    }
}
