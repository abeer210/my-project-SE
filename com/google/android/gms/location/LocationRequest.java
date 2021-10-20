package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import vigqyno.C0188;
import vigqyno.C0201;

public final class LocationRequest extends ip0 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new r();
    private int a;
    private long b;
    private long c;
    private boolean d;
    private long e;
    private int f;
    private float g;
    private long h;

    public LocationRequest() {
        this.a = 102;
        this.b = 3600000;
        this.c = 600000;
        this.d = false;
        this.e = Long.MAX_VALUE;
        this.f = C0188.f24;
        this.g = 0.0f;
        this.h = 0;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f2, long j4) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = i2;
        this.g = f2;
        this.h = j4;
    }

    public static LocationRequest o() {
        return new LocationRequest();
    }

    private static void y(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append(C0201.m82(28234));
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.a == locationRequest.a && this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && p() == locationRequest.p();
    }

    public final int hashCode() {
        return s.b(Integer.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.g), Long.valueOf(this.h));
    }

    public final long p() {
        long j = this.h;
        long j2 = this.b;
        return j < j2 ? j2 : j;
    }

    public final LocationRequest r(long j) {
        y(j);
        this.d = true;
        this.c = j;
        return this;
    }

    public final LocationRequest s(long j) {
        y(j);
        this.b = j;
        if (!this.d) {
            double d2 = (double) j;
            Double.isNaN(d2);
            this.c = (long) (d2 / 6.0d);
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(28235));
        int i = this.a;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? C0201.m82(28236) : C0201.m82(28237) : C0201.m82(28238) : C0201.m82(28239) : C0201.m82(28240));
        int i2 = this.a;
        String r2 = C0201.m82(28241);
        if (i2 != 105) {
            sb.append(C0201.m82(28242));
            sb.append(this.b);
            sb.append(r2);
        }
        sb.append(C0201.m82(28243));
        sb.append(this.c);
        sb.append(r2);
        if (this.h > this.b) {
            sb.append(C0201.m82(28244));
            sb.append(this.h);
            sb.append(r2);
        }
        if (this.g > 0.0f) {
            sb.append(C0201.m82(28245));
            sb.append(this.g);
            sb.append(C0201.m82(28246));
        }
        long j = this.e;
        if (j != Long.MAX_VALUE) {
            sb.append(C0201.m82(28247));
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append(r2);
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(C0201.m82(28248));
            sb.append(this.f);
        }
        sb.append(']');
        return sb.toString();
    }

    public final LocationRequest u(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.a = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append(C0201.m82(28249));
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final LocationRequest w(float f2) {
        if (f2 >= 0.0f) {
            this.g = f2;
            return this;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append(C0201.m82(28250));
        sb.append(f2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.q(parcel, 2, this.b);
        kp0.q(parcel, 3, this.c);
        kp0.c(parcel, 4, this.d);
        kp0.q(parcel, 5, this.e);
        kp0.n(parcel, 6, this.f);
        kp0.k(parcel, 7, this.g);
        kp0.q(parcel, 8, this.h);
        kp0.b(parcel, a2);
    }
}
