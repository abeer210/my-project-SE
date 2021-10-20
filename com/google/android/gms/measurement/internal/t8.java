package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class t8 extends ip0 {
    public static final Parcelable.Creator<t8> CREATOR = new w8();
    private final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Double g;

    public t8(v8 v8Var) {
        this(v8Var.c, v8Var.d, v8Var.e, v8Var.b);
    }

    public final Object o() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d2 = this.g;
        if (d2 != null) {
            return d2;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.u(parcel, 2, this.b, false);
        kp0.q(parcel, 3, this.c);
        kp0.r(parcel, 4, this.d, false);
        kp0.l(parcel, 5, null, false);
        kp0.u(parcel, 6, this.e, false);
        kp0.u(parcel, 7, this.f, false);
        kp0.j(parcel, 8, this.g, false);
        kp0.b(parcel, a2);
    }

    public t8(String str, long j, Object obj, String str2) {
        u.g(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.g = null;
            this.e = null;
        } else if (obj instanceof Long) {
            this.d = (Long) obj;
            this.g = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.g = null;
            this.e = (String) obj;
        } else if (obj instanceof Double) {
            this.d = null;
            this.g = (Double) obj;
            this.e = null;
        } else {
            throw new IllegalArgumentException(C0201.m82(5992));
        }
    }

    public t8(String str, long j, String str2) {
        u.g(str);
        this.a = 2;
        this.b = str;
        this.c = 0;
        this.d = null;
        this.g = null;
        this.e = null;
        this.f = null;
    }

    public t8(int i, String str, long j, Long l, Float f2, String str2, String str3, Double d2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        if (i == 1) {
            this.g = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.g = d2;
        }
        this.e = str2;
        this.f = str3;
    }
}
