package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class u extends ip0 {
    public static final Parcelable.Creator<u> CREATOR = new v();
    private final String a;
    private final String b;
    private final String c;

    public u(String str, String str2, String str3) {
        this.c = str;
        this.a = str2;
        this.b = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 1, this.a, false);
        kp0.u(parcel, 2, this.b, false);
        kp0.u(parcel, 5, this.c, false);
        kp0.b(parcel, a2);
    }
}
