package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import vigqyno.C0201;

public final class z extends ip0 {
    public static final Parcelable.Creator<z> CREATOR = new a0();
    private final int a;
    private final int b;
    private final long c;
    private final long d;

    public z(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            return this.a == zVar.a && this.b == zVar.b && this.c == zVar.c && this.d == zVar.d;
        }
    }

    public final int hashCode() {
        return s.b(Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c));
    }

    public final String toString() {
        return C0201.m82(34567) + C0201.m82(34568) + this.a + C0201.m82(34569) + this.b + C0201.m82(34570) + this.d + C0201.m82(34571) + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.n(parcel, 2, this.b);
        kp0.q(parcel, 3, this.c);
        kp0.q(parcel, 4, this.d);
        kp0.b(parcel, a2);
    }
}
