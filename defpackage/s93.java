package defpackage;

import vigqyno.C0201;

/* renamed from: s93  reason: default package */
/* compiled from: XMSSParameters */
public final class s93 {
    private final h93 a;
    private final int b;
    private final int c;

    public s93(int i, m63 m63) {
        if (i < 2) {
            throw new IllegalArgumentException(C0201.m82(15694));
        } else if (m63 != null) {
            this.a = new h93(new j93(m63));
            this.b = i;
            this.c = a();
            c93.b(b().d(), c(), g(), this.a.d().c(), i);
        } else {
            throw new NullPointerException(C0201.m82(15693));
        }
    }

    private int a() {
        int i = 2;
        while (true) {
            int i2 = this.b;
            if (i > i2) {
                throw new IllegalStateException(C0201.m82(15695));
            } else if ((i2 - i) % 2 == 0) {
                return i;
            } else {
                i++;
            }
        }
    }

    public m63 b() {
        return this.a.d().a();
    }

    public int c() {
        return this.a.d().b();
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public h93 f() {
        return this.a;
    }

    public int g() {
        return this.a.d().d();
    }
}
