package defpackage;

import vigqyno.C0201;

/* renamed from: sd0  reason: default package */
/* compiled from: RotationOptions */
public class sd0 {
    private static final sd0 c = new sd0(-1, false);
    private static final sd0 d = new sd0(-2, false);
    private static final sd0 e = new sd0(-1, true);
    private final int a;
    private final boolean b;

    private sd0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static sd0 a() {
        return c;
    }

    public static sd0 b() {
        return e;
    }

    public static sd0 d() {
        return d;
    }

    public boolean c() {
        return this.b;
    }

    public int e() {
        if (!g()) {
            return this.a;
        }
        throw new IllegalStateException(C0201.m82(35473));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sd0)) {
            return false;
        }
        sd0 sd0 = (sd0) obj;
        if (this.a == sd0.a && this.b == sd0.b) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.a != -2;
    }

    public boolean g() {
        return this.a == -1;
    }

    public int hashCode() {
        return d70.c(Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public String toString() {
        return String.format(null, C0201.m82(35474), Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
