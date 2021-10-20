package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class z extends ip0 {
    public static final Parcelable.Creator<z> CREATOR = new r0();
    public final int a;
    public final int b;
    public final byte[] c;

    public z(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 2, this.a);
        kp0.n(parcel, 3, this.b);
        kp0.g(parcel, 4, this.c, false);
        kp0.b(parcel, a2);
    }
}
