package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import java.util.List;

public final class d9 extends ip0 {
    public static final Parcelable.Creator<d9> CREATOR = new c9();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String u;
    public final Boolean v;
    public final long w;
    public final List<String> x;

    public d9(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list) {
        u.g(str);
        this.a = str;
        this.b = TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j2;
        this.d = str4;
        this.e = j3;
        this.f = j4;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j5;
        this.m = j6;
        this.n = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.u = str7;
        this.v = bool;
        this.w = j7;
        this.x = list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 2, this.a, false);
        kp0.u(parcel, 3, this.b, false);
        kp0.u(parcel, 4, this.c, false);
        kp0.u(parcel, 5, this.d, false);
        kp0.q(parcel, 6, this.e);
        kp0.q(parcel, 7, this.f);
        kp0.u(parcel, 8, this.g, false);
        kp0.c(parcel, 9, this.h);
        kp0.c(parcel, 10, this.i);
        kp0.q(parcel, 11, this.j);
        kp0.u(parcel, 12, this.k, false);
        kp0.q(parcel, 13, this.l);
        kp0.q(parcel, 14, this.m);
        kp0.n(parcel, 15, this.n);
        kp0.c(parcel, 16, this.o);
        kp0.c(parcel, 17, this.p);
        kp0.c(parcel, 18, this.q);
        kp0.u(parcel, 19, this.u, false);
        kp0.d(parcel, 21, this.v, false);
        kp0.q(parcel, 22, this.w);
        kp0.w(parcel, 23, this.x, false);
        kp0.b(parcel, a2);
    }

    public d9(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j4;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j5;
        this.m = j6;
        this.n = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.u = str7;
        this.v = bool;
        this.w = j7;
        this.x = list;
    }
}
