package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class LatLngBounds extends ip0 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new j0();
    public final LatLng a;
    public final LatLng b;

    public static final class a {
        private double a = Double.POSITIVE_INFINITY;
        private double b = Double.NEGATIVE_INFINITY;
        private double c = Double.NaN;
        private double d = Double.NaN;

        public final LatLngBounds a() {
            u.o(!Double.isNaN(this.c), C0201.m82(3086));
            return new LatLngBounds(new LatLng(this.a, this.c), new LatLng(this.b, this.d));
        }

        public final a b(LatLng latLng) {
            this.a = Math.min(this.a, latLng.a);
            this.b = Math.max(this.b, latLng.a);
            double d2 = latLng.b;
            if (Double.isNaN(this.c)) {
                this.c = d2;
            } else {
                double d3 = this.c;
                double d4 = this.d;
                boolean z = false;
                if (d3 > d4 ? d3 <= d2 || d2 <= d4 : d3 <= d2 && d2 <= d4) {
                    z = true;
                }
                if (!z) {
                    if (LatLngBounds.p(this.c, d2) < LatLngBounds.r(this.d, d2)) {
                        this.c = d2;
                    }
                }
                return this;
            }
            this.d = d2;
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        u.l(latLng, C0201.m82(35477));
        u.l(latLng2, C0201.m82(35478));
        u.c(latLng2.a >= latLng.a, C0201.m82(35479), Double.valueOf(latLng.a), Double.valueOf(latLng2.a));
        this.a = latLng;
        this.b = latLng2;
    }

    /* access modifiers changed from: private */
    public static double p(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    /* access modifiers changed from: private */
    public static double r(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public final int hashCode() {
        return s.b(this.a, this.b);
    }

    public final LatLng o() {
        LatLng latLng = this.a;
        double d = latLng.a;
        LatLng latLng2 = this.b;
        double d2 = (d + latLng2.a) / 2.0d;
        double d3 = latLng2.b;
        double d4 = latLng.b;
        if (d4 > d3) {
            d3 += 360.0d;
        }
        return new LatLng(d2, (d3 + d4) / 2.0d);
    }

    public final String toString() {
        s.a c = s.c(this);
        c.a(C0201.m82(35480), this.a);
        c.a(C0201.m82(35481), this.b);
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 2, this.a, i, false);
        kp0.s(parcel, 3, this.b, i, false);
        kp0.b(parcel, a2);
    }
}
