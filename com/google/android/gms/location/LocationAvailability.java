package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import java.util.Arrays;
import vigqyno.C0201;

public final class LocationAvailability extends ip0 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new q();
    @Deprecated
    private int a;
    @Deprecated
    private int b;
    private long c;
    private int d;
    private z[] e;

    public LocationAvailability(int i, int i2, int i3, long j, z[] zVarArr) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = zVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e);
        }
    }

    public final int hashCode() {
        return s.b(Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.e);
    }

    public final boolean o() {
        return this.d < 1000;
    }

    public final String toString() {
        boolean o = o();
        StringBuilder sb = new StringBuilder(48);
        sb.append(C0201.m82(21626));
        sb.append(o);
        sb.append(C0201.m82(21627));
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.n(parcel, 2, this.b);
        kp0.q(parcel, 3, this.c);
        kp0.n(parcel, 4, this.d);
        kp0.x(parcel, 5, this.e, i, false);
        kp0.b(parcel, a2);
    }
}
