package defpackage;

import vigqyno.C0201;

/* renamed from: h62  reason: default package */
/* compiled from: BinaryBitmap */
public final class h62 {
    private final g62 a;
    private c72 b;

    public h62(g62 g62) {
        if (g62 != null) {
            this.a = g62;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(13583));
    }

    public c72 a() throws o62 {
        if (this.b == null) {
            this.b = this.a.b();
        }
        return this.b;
    }

    public b72 b(int i, b72 b72) throws o62 {
        return this.a.c(i, b72);
    }

    public int c() {
        return this.a.d();
    }

    public int d() {
        return this.a.f();
    }

    public boolean e() {
        return this.a.e().f();
    }

    public h62 f() {
        return new h62(this.a.a(this.a.e().g()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (o62 unused) {
            return C0201.m82(13584);
        }
    }
}
