package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public class q extends ip0 {
    public static final Parcelable.Creator<q> CREATOR = new n0();
    private final int a;
    private final Float b;

    public q(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append(C0201.m82(22230));
        sb.append(i);
        sb.append(C0201.m82(22231));
        sb.append(valueOf);
        u.b(z, sb.toString());
        this.a = i;
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && s.a(this.b, qVar.b);
    }

    public int hashCode() {
        return s.b(Integer.valueOf(this.a), this.b);
    }

    public String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append(C0201.m82(22232));
        sb.append(i);
        sb.append(C0201.m82(22233));
        sb.append(valueOf);
        sb.append(C0201.m82(22234));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 2, this.a);
        kp0.l(parcel, 3, this.b, false);
        kp0.b(parcel, a2);
    }
}
