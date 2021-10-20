package defpackage;

import vigqyno.C0201;

/* renamed from: m93  reason: default package */
/* compiled from: XMSSMTParameters */
public final class m93 {
    private final s93 a;
    private final int b;
    private final int c;

    public m93(int i, int i2, m63 m63) {
        this.b = i;
        this.c = i2;
        this.a = new s93(h(i, i2), m63);
        b93.b(a().d(), b(), f(), e(), c(), i2);
    }

    private static int h(int i, int i2) throws IllegalArgumentException {
        if (i < 2) {
            throw new IllegalArgumentException(C0201.m82(24794));
        } else if (i % i2 == 0) {
            int i3 = i / i2;
            if (i3 != 1) {
                return i3;
            }
            throw new IllegalArgumentException(C0201.m82(24792));
        } else {
            throw new IllegalArgumentException(C0201.m82(24793));
        }
    }

    public m63 a() {
        return this.a.b();
    }

    public int b() {
        return this.a.c();
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.a.f().d().c();
    }

    public int f() {
        return this.a.g();
    }

    public s93 g() {
        return this.a;
    }
}
