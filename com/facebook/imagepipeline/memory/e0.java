package com.facebook.imagepipeline.memory;

import vigqyno.C0201;

/* compiled from: PoolConfig */
public class e0 {
    private final g0 a;
    private final h0 b;
    private final g0 c;
    private final m60 d;
    private final g0 e;
    private final h0 f;
    private final g0 g;
    private final h0 h;
    private final String i;
    private final int j;
    private final int k;
    private final boolean l;

    /* compiled from: PoolConfig */
    public static class b {
        private g0 a;
        private h0 b;
        private g0 c;
        private m60 d;
        private g0 e;
        private h0 f;
        private g0 g;
        private h0 h;
        private String i;
        private int j;
        private int k;
        private boolean l;

        public e0 m() {
            return new e0(this);
        }

        private b() {
        }
    }

    public static b m() {
        return new b();
    }

    public int a() {
        return this.k;
    }

    public int b() {
        return this.j;
    }

    public g0 c() {
        return this.a;
    }

    public h0 d() {
        return this.b;
    }

    public String e() {
        return this.i;
    }

    public g0 f() {
        return this.c;
    }

    public g0 g() {
        return this.e;
    }

    public h0 h() {
        return this.f;
    }

    public m60 i() {
        return this.d;
    }

    public g0 j() {
        return this.g;
    }

    public h0 k() {
        return this.h;
    }

    public boolean l() {
        return this.l;
    }

    private e0(b bVar) {
        g0 g0Var;
        h0 h0Var;
        g0 g0Var2;
        m60 m60;
        g0 g0Var3;
        h0 h0Var2;
        g0 g0Var4;
        h0 h0Var3;
        if (oh0.d()) {
            oh0.a(C0201.m82(22122));
        }
        if (bVar.a == null) {
            g0Var = k.a();
        } else {
            g0Var = bVar.a;
        }
        this.a = g0Var;
        if (bVar.b == null) {
            h0Var = b0.h();
        } else {
            h0Var = bVar.b;
        }
        this.b = h0Var;
        if (bVar.c == null) {
            g0Var2 = m.b();
        } else {
            g0Var2 = bVar.c;
        }
        this.c = g0Var2;
        if (bVar.d == null) {
            m60 = n60.b();
        } else {
            m60 = bVar.d;
        }
        this.d = m60;
        if (bVar.e == null) {
            g0Var3 = n.a();
        } else {
            g0Var3 = bVar.e;
        }
        this.e = g0Var3;
        if (bVar.f == null) {
            h0Var2 = b0.h();
        } else {
            h0Var2 = bVar.f;
        }
        this.f = h0Var2;
        if (bVar.g == null) {
            g0Var4 = l.a();
        } else {
            g0Var4 = bVar.g;
        }
        this.g = g0Var4;
        if (bVar.h == null) {
            h0Var3 = b0.h();
        } else {
            h0Var3 = bVar.h;
        }
        this.h = h0Var3;
        this.i = bVar.i == null ? C0201.m82(22123) : bVar.i;
        this.j = bVar.j;
        this.k = bVar.k > 0 ? bVar.k : 4194304;
        this.l = bVar.l;
        if (oh0.d()) {
            oh0.b();
        }
    }
}
