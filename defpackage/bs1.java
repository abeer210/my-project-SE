package defpackage;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.s;

/* renamed from: bs1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class bs1 implements a.d.c, a.d {
    public static final bs1 j = new bs1(false, false, null, false, null, null, false, null, null);
    private final boolean a = false;
    private final boolean b = false;
    private final String c = null;
    private final boolean d = false;
    private final String e = null;
    private final String f = null;
    private final boolean g = false;
    private final Long h = null;
    private final Long i = null;

    private bs1(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
    }

    public final Long a() {
        return this.h;
    }

    public final String b() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final Long e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bs1)) {
            return false;
        }
        bs1 bs1 = (bs1) obj;
        return this.a == bs1.a && this.b == bs1.b && s.a(this.c, bs1.c) && this.d == bs1.d && this.g == bs1.g && s.a(this.e, bs1.e) && s.a(this.f, bs1.f) && s.a(this.h, bs1.h) && s.a(this.i, bs1.i);
    }

    public final String f() {
        return this.c;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.b;
    }

    public final int hashCode() {
        return s.b(Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.g), this.e, this.f, this.h, this.i);
    }

    public final boolean i() {
        return this.a;
    }

    public final boolean j() {
        return this.g;
    }
}
