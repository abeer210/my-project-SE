package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class d extends ip0 {
    public static final Parcelable.Creator<d> CREATOR = new z();
    private final int a;
    private final String b;

    public d(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            return dVar.a == this.a && s.a(dVar.b, this.b);
        }
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(C0201.m82(8123));
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.u(parcel, 2, this.b, false);
        kp0.b(parcel, a2);
    }
}
