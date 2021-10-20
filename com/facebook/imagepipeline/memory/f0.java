package com.facebook.imagepipeline.memory;

import vigqyno.C0201;

/* compiled from: PoolFactory */
public class f0 {
    private final e0 a;
    private d b;
    private j c;
    private q d;
    private a0 e;
    private r60 f;
    private u60 g;
    private k60 h;

    public f0(e0 e0Var) {
        z50.g(e0Var);
        this.a = e0Var;
    }

    private v e(int i) {
        if (i == 0) {
            return f();
        }
        if (i == 1) {
            return b();
        }
        throw new IllegalArgumentException(C0201.m82(24761));
    }

    public d a() {
        if (this.b == null) {
            String e2 = this.a.e();
            char c2 = 65535;
            switch (e2.hashCode()) {
                case -1868884870:
                    if (e2.equals(C0201.m82(24766))) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1106578487:
                    if (e2.equals(C0201.m82(24765))) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (e2.equals(C0201.m82(24764))) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (e2.equals(C0201.m82(24763))) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (e2.equals(C0201.m82(24762))) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                this.b = new o();
            } else if (c2 == 1) {
                this.b = new p();
            } else if (c2 == 2) {
                this.b = new s(this.a.b(), this.a.a(), b0.h(), this.a.l() ? this.a.i() : null);
            } else if (c2 != 3) {
                this.b = new h(this.a.i(), this.a.c(), this.a.d());
            } else {
                this.b = new h(this.a.i(), k.a(), this.a.d());
            }
        }
        return this.b;
    }

    public j b() {
        if (this.c == null) {
            this.c = new j(this.a.i(), this.a.g(), this.a.h());
        }
        return this.c;
    }

    public q c() {
        if (this.d == null) {
            this.d = new q(this.a.i(), this.a.f());
        }
        return this.d;
    }

    public int d() {
        return this.a.f().e;
    }

    public a0 f() {
        if (this.e == null) {
            this.e = new a0(this.a.i(), this.a.g(), this.a.h());
        }
        return this.e;
    }

    public r60 g() {
        return h(0);
    }

    public r60 h(int i) {
        if (this.f == null) {
            this.f = new y(e(i), i());
        }
        return this.f;
    }

    public u60 i() {
        if (this.g == null) {
            this.g = new u60(j());
        }
        return this.g;
    }

    public k60 j() {
        if (this.h == null) {
            this.h = new r(this.a.i(), this.a.j(), this.a.k());
        }
        return this.h;
    }
}
