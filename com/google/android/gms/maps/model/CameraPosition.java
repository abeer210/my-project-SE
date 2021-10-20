package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class CameraPosition extends ip0 implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new f0();
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public static final class a {
        private LatLng a;
        private float b;
        private float c;
        private float d;

        public a() {
        }

        public final a a(float f) {
            this.d = f;
            return this;
        }

        public final CameraPosition b() {
            return new CameraPosition(this.a, this.b, this.c, this.d);
        }

        public final a c(LatLng latLng) {
            this.a = latLng;
            return this;
        }

        public final a d(float f) {
            this.c = f;
            return this;
        }

        public final a e(float f) {
            this.b = f;
            return this;
        }

        public a(CameraPosition cameraPosition) {
            this.a = cameraPosition.a;
            this.b = cameraPosition.b;
            this.c = cameraPosition.c;
            this.d = cameraPosition.d;
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        u.l(latLng, C0201.m82(10486));
        u.c(0.0f <= f2 && f2 <= 90.0f, C0201.m82(10487), Float.valueOf(f2));
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    public final int hashCode() {
        return s.b(this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d));
    }

    public final String toString() {
        s.a c2 = s.c(this);
        c2.a(C0201.m82(10488), this.a);
        c2.a(C0201.m82(10489), Float.valueOf(this.b));
        c2.a(C0201.m82(10490), Float.valueOf(this.c));
        c2.a(C0201.m82(10491), Float.valueOf(this.d));
        return c2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 2, this.a, i, false);
        kp0.k(parcel, 3, this.b);
        kp0.k(parcel, 4, this.c);
        kp0.k(parcel, 5, this.d);
        kp0.b(parcel, a2);
    }
}
