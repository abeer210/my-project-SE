package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;

public final class f {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public f(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l, Long l2, Long l3, Boolean bool) {
        u.g(str);
        u.g(str2);
        boolean z = true;
        u.a(j2 >= 0);
        u.a(j3 >= 0);
        u.a(j4 >= 0);
        u.a(j6 < 0 ? false : z);
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final f a(long j2, long j3) {
        return new f(this.a, this.b, this.c, this.d, this.e, this.f, j2, Long.valueOf(j3), this.i, this.j, this.k);
    }

    public final f b(Long l, Long l2, Boolean bool) {
        return new f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final f c(long j2) {
        return new f(this.a, this.b, this.c, this.d, this.e, j2, this.g, this.h, this.i, this.j, this.k);
    }

    public f(String str, String str2, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, j2, j3, 0, j4, 0, null, null, null, null);
    }
}
