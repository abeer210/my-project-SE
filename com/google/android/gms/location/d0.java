package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.s;
import vigqyno.C0188;
import vigqyno.C0201;

public final class d0 extends ip0 {
    public static final Parcelable.Creator<d0> CREATOR = new e0();
    private boolean a;
    private long b;
    private float c;
    private long d;
    private int e;

    public d0() {
        this(true, 50, 0.0f, Long.MAX_VALUE, C0188.f24);
    }

    public d0(boolean z, long j, float f, long j2, int i) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.a == d0Var.a && this.b == d0Var.b && Float.compare(this.c, d0Var.c) == 0 && this.d == d0Var.d && this.e == d0Var.e;
    }

    public final int hashCode() {
        return s.b(Boolean.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(4930));
        sb.append(this.a);
        sb.append(C0201.m82(4931));
        sb.append(this.b);
        sb.append(C0201.m82(4932));
        sb.append(this.c);
        long j = this.d;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = j - SystemClock.elapsedRealtime();
            sb.append(C0201.m82(4933));
            sb.append(elapsedRealtime);
            sb.append(C0201.m82(4934));
        }
        if (this.e != Integer.MAX_VALUE) {
            sb.append(C0201.m82(4935));
            sb.append(this.e);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.c(parcel, 1, this.a);
        kp0.q(parcel, 2, this.b);
        kp0.k(parcel, 3, this.c);
        kp0.q(parcel, 4, this.d);
        kp0.n(parcel, 5, this.e);
        kp0.b(parcel, a2);
    }
}
