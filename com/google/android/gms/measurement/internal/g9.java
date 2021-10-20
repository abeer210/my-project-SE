package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;

public final class g9 extends ip0 {
    public static final Parcelable.Creator<g9> CREATOR = new j9();
    public String a;
    public String b;
    public t8 c;
    public long d;
    public boolean e;
    public String f;
    public j g;
    public long h;
    public j i;
    public long j;
    public j k;

    public g9(g9 g9Var) {
        u.k(g9Var);
        this.a = g9Var.a;
        this.b = g9Var.b;
        this.c = g9Var.c;
        this.d = g9Var.d;
        this.e = g9Var.e;
        this.f = g9Var.f;
        this.g = g9Var.g;
        this.h = g9Var.h;
        this.i = g9Var.i;
        this.j = g9Var.j;
        this.k = g9Var.k;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 2, this.a, false);
        kp0.u(parcel, 3, this.b, false);
        kp0.s(parcel, 4, this.c, i2, false);
        kp0.q(parcel, 5, this.d);
        kp0.c(parcel, 6, this.e);
        kp0.u(parcel, 7, this.f, false);
        kp0.s(parcel, 8, this.g, i2, false);
        kp0.q(parcel, 9, this.h);
        kp0.s(parcel, 10, this.i, i2, false);
        kp0.q(parcel, 11, this.j);
        kp0.s(parcel, 12, this.k, i2, false);
        kp0.b(parcel, a2);
    }

    public g9(String str, String str2, t8 t8Var, long j2, boolean z, String str3, j jVar, long j3, j jVar2, long j4, j jVar3) {
        this.a = str;
        this.b = str2;
        this.c = t8Var;
        this.d = j2;
        this.e = z;
        this.f = str3;
        this.g = jVar;
        this.h = j3;
        this.i = jVar2;
        this.j = j4;
        this.k = jVar3;
    }
}
