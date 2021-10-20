package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import vigqyno.C0201;

public final class e0 extends ip0 {
    public static final Parcelable.Creator<e0> CREATOR = new v0();
    public final LatLng a;
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLngBounds e;

    public e0(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.a = latLng;
        this.b = latLng2;
        this.c = latLng3;
        this.d = latLng4;
        this.e = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.a.equals(e0Var.a) && this.b.equals(e0Var.b) && this.c.equals(e0Var.c) && this.d.equals(e0Var.d) && this.e.equals(e0Var.e);
    }

    public final int hashCode() {
        return s.b(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        s.a c2 = s.c(this);
        c2.a(C0201.m82(35482), this.a);
        c2.a(C0201.m82(35483), this.b);
        c2.a(C0201.m82(35484), this.c);
        c2.a(C0201.m82(35485), this.d);
        c2.a(C0201.m82(35486), this.e);
        return c2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 2, this.a, i, false);
        kp0.s(parcel, 3, this.b, i, false);
        kp0.s(parcel, 4, this.c, i, false);
        kp0.s(parcel, 5, this.d, i, false);
        kp0.s(parcel, 6, this.e, i, false);
        kp0.b(parcel, a2);
    }
}
