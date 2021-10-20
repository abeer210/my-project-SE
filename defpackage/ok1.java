package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: ok1  reason: default package */
public final class ok1 implements hn1 {
    private final kk1 a;
    private int b;
    private int c;
    private int d = 0;

    private ok1(kk1 kk1) {
        nl1.e(kk1, C0201.m82(2264));
        kk1 kk12 = kk1;
        this.a = kk12;
        kk12.c = this;
    }

    public static ok1 Q(kk1 kk1) {
        ok1 ok1 = kk1.c;
        if (ok1 != null) {
            return ok1;
        }
        return new ok1(kk1);
    }

    private final Object R(ro1 ro1, Class<?> cls, wk1 wk1) throws IOException {
        switch (pk1.a[ro1.ordinal()]) {
            case 1:
                return Boolean.valueOf(B());
            case 2:
                return u();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(P());
            case 5:
                return Integer.valueOf(x());
            case 6:
                return Long.valueOf(F());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(C());
            case 9:
                return Long.valueOf(M());
            case 10:
                return w(cls, wk1);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(t());
            case 13:
                return Integer.valueOf(J());
            case 14:
                return Long.valueOf(N());
            case 15:
                return r();
            case 16:
                return Integer.valueOf(K());
            case 17:
                return Long.valueOf(I());
            default:
                throw new RuntimeException(C0201.m82(2265));
        }
    }

    private final void S(List<String> list, boolean z) throws IOException {
        int C;
        int C2;
        if ((this.b & 7) != 2) {
            throw sl1.f();
        } else if (!(list instanceof bm1) || z) {
            do {
                list.add(z ? r() : k());
                if (!this.a.m()) {
                    C = this.a.C();
                } else {
                    return;
                }
            } while (C == this.b);
            this.d = C;
        } else {
            bm1 bm1 = (bm1) list;
            do {
                bm1.d1(u());
                if (!this.a.m()) {
                    C2 = this.a.C();
                } else {
                    return;
                }
            } while (C2 == this.b);
            this.d = C2;
        }
    }

    private final void T(int i) throws IOException {
        if ((this.b & 7) != i) {
            throw sl1.f();
        }
    }

    private static void U(int i) throws IOException {
        if ((i & 7) != 0) {
            throw sl1.h();
        }
    }

    private static void V(int i) throws IOException {
        if ((i & 3) != 0) {
            throw sl1.h();
        }
    }

    private final void W(int i) throws IOException {
        if (this.a.D() != i) {
            throw sl1.a();
        }
    }

    private final <T> T X(in1<T> in1, wk1 wk1) throws IOException {
        int v = this.a.v();
        kk1 kk1 = this.a;
        if (kk1.a < kk1.b) {
            int i = kk1.i(v);
            T e = in1.e();
            this.a.a++;
            in1.f(e, this, wk1);
            in1.b(e);
            this.a.f(0);
            kk1 kk12 = this.a;
            kk12.a--;
            kk12.j(i);
            return e;
        }
        throw sl1.g();
    }

    private final <T> T Y(in1<T> in1, wk1 wk1) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T e = in1.e();
            in1.f(e, this, wk1);
            in1.b(e);
            if (this.b == this.c) {
                return e;
            }
            throw sl1.h();
        } finally {
            this.c = i;
        }
    }

    @Override // defpackage.hn1
    public final void A(List<Double> list) throws IOException {
        int C;
        int C2;
        if (list instanceof tk1) {
            tk1 tk1 = (tk1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    tk1.d(this.a.a());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int v = this.a.v();
                U(v);
                int D = this.a.D() + v;
                do {
                    tk1.d(this.a.a());
                } while (this.a.D() < D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.a.a()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int v2 = this.a.v();
                U(v2);
                int D2 = this.a.D() + v2;
                do {
                    list.add(Double.valueOf(this.a.a()));
                } while (this.a.D() < D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final boolean B() throws IOException {
        T(0);
        return this.a.s();
    }

    @Override // defpackage.hn1
    public final int C() throws IOException {
        T(0);
        return this.a.p();
    }

    @Override // defpackage.hn1
    public final void D(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    gm1.e(this.a.n());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int D = this.a.D() + this.a.v();
                do {
                    gm1.e(this.a.n());
                } while (this.a.D() < D);
                W(D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.n()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int D2 = this.a.D() + this.a.v();
                do {
                    list.add(Long.valueOf(this.a.n()));
                } while (this.a.D() < D2);
                W(D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final int E() throws IOException {
        T(5);
        return this.a.x();
    }

    @Override // defpackage.hn1
    public final long F() throws IOException {
        T(1);
        return this.a.q();
    }

    @Override // defpackage.hn1
    public final <T> T G(Class<T> cls, wk1 wk1) throws IOException {
        T(3);
        return (T) Y(fn1.b().a(cls), wk1);
    }

    @Override // defpackage.hn1
    public final void H(List<Float> list) throws IOException {
        int C;
        int C2;
        if (list instanceof hl1) {
            hl1 hl1 = (hl1) list;
            int i = this.b & 7;
            if (i == 2) {
                int v = this.a.v();
                V(v);
                int D = this.a.D() + v;
                do {
                    hl1.e(this.a.b());
                } while (this.a.D() < D);
            } else if (i == 5) {
                do {
                    hl1.e(this.a.b());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int v2 = this.a.v();
                V(v2);
                int D2 = this.a.D() + v2;
                do {
                    list.add(Float.valueOf(this.a.b()));
                } while (this.a.D() < D2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.a.b()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final long I() throws IOException {
        T(0);
        return this.a.n();
    }

    @Override // defpackage.hn1
    public final int J() throws IOException {
        T(0);
        return this.a.A();
    }

    @Override // defpackage.hn1
    public final int K() throws IOException {
        T(0);
        return this.a.v();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hn1
    public final <T> void L(List<T> list, in1<T> in1, wk1 wk1) throws IOException {
        int C;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(Y(in1, wk1));
                if (!this.a.m() && this.d == 0) {
                    C = this.a.C();
                } else {
                    return;
                }
            } while (C == i);
            this.d = C;
            return;
        }
        throw sl1.f();
    }

    @Override // defpackage.hn1
    public final long M() throws IOException {
        T(0);
        return this.a.o();
    }

    @Override // defpackage.hn1
    public final long N() throws IOException {
        T(0);
        return this.a.B();
    }

    @Override // defpackage.hn1
    public final void O(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    gm1.e(this.a.o());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int D = this.a.D() + this.a.v();
                do {
                    gm1.e(this.a.o());
                } while (this.a.D() < D);
                W(D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.o()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int D2 = this.a.D() + this.a.v();
                do {
                    list.add(Long.valueOf(this.a.o()));
                } while (this.a.D() < D2);
                W(D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final int P() throws IOException {
        T(0);
        return this.a.w();
    }

    @Override // defpackage.hn1
    public final int a() {
        return this.b;
    }

    @Override // defpackage.hn1
    public final void b(List<Boolean> list) throws IOException {
        int C;
        int C2;
        if (list instanceof zj1) {
            zj1 zj1 = (zj1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    zj1.b(this.a.s());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int D = this.a.D() + this.a.v();
                do {
                    zj1.b(this.a.s());
                } while (this.a.D() < D);
                W(D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.s()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int D2 = this.a.D() + this.a.v();
                do {
                    list.add(Boolean.valueOf(this.a.s()));
                } while (this.a.D() < D2);
                W(D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void c(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i = this.b & 7;
            if (i == 2) {
                int v = this.a.v();
                V(v);
                int D = this.a.D() + v;
                do {
                    ll1.e(this.a.r());
                } while (this.a.D() < D);
            } else if (i == 5) {
                do {
                    ll1.e(this.a.r());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int v2 = this.a.v();
                V(v2);
                int D2 = this.a.D() + v2;
                do {
                    list.add(Integer.valueOf(this.a.r()));
                } while (this.a.D() < D2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.r()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void d(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    gm1.e(this.a.B());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int D = this.a.D() + this.a.v();
                do {
                    gm1.e(this.a.B());
                } while (this.a.D() < D);
                W(D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.B()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int D2 = this.a.D() + this.a.v();
                do {
                    list.add(Long.valueOf(this.a.B()));
                } while (this.a.D() < D2);
                W(D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void e(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ll1.e(this.a.A());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int D = this.a.D() + this.a.v();
                do {
                    ll1.e(this.a.A());
                } while (this.a.D() < D);
                W(D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.A()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int D2 = this.a.D() + this.a.v();
                do {
                    list.add(Integer.valueOf(this.a.A()));
                } while (this.a.D() < D2);
                W(D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void f(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    gm1.e(this.a.q());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int v = this.a.v();
                U(v);
                int D = this.a.D() + v;
                do {
                    gm1.e(this.a.q());
                } while (this.a.D() < D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.q()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int v2 = this.a.v();
                U(v2);
                int D2 = this.a.D() + v2;
                do {
                    list.add(Long.valueOf(this.a.q()));
                } while (this.a.D() < D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void g(List<bk1> list) throws IOException {
        int C;
        if ((this.b & 7) == 2) {
            do {
                list.add(u());
                if (!this.a.m()) {
                    C = this.a.C();
                } else {
                    return;
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        throw sl1.f();
    }

    @Override // defpackage.hn1
    public final void h(List<String> list) throws IOException {
        S(list, true);
    }

    @Override // defpackage.hn1
    public final void i(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ll1.e(this.a.w());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int D = this.a.D() + this.a.v();
                do {
                    ll1.e(this.a.w());
                } while (this.a.D() < D);
                W(D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.w()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int D2 = this.a.D() + this.a.v();
                do {
                    list.add(Integer.valueOf(this.a.w()));
                } while (this.a.D() < D2);
                W(D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void j(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ll1.e(this.a.v());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int D = this.a.D() + this.a.v();
                do {
                    ll1.e(this.a.v());
                } while (this.a.D() < D);
                W(D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.v()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int D2 = this.a.D() + this.a.v();
                do {
                    list.add(Integer.valueOf(this.a.v()));
                } while (this.a.D() < D2);
                W(D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final String k() throws IOException {
        T(2);
        return this.a.c();
    }

    @Override // defpackage.hn1
    public final void l(List<String> list) throws IOException {
        S(list, false);
    }

    @Override // defpackage.hn1
    public final void m(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    gm1.e(this.a.z());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int v = this.a.v();
                U(v);
                int D = this.a.D() + v;
                do {
                    gm1.e(this.a.z());
                } while (this.a.D() < D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.z()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int v2 = this.a.v();
                U(v2);
                int D2 = this.a.D() + v2;
                do {
                    list.add(Long.valueOf(this.a.z()));
                } while (this.a.D() < D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void n(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ll1.e(this.a.p());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else if (i == 2) {
                int D = this.a.D() + this.a.v();
                do {
                    ll1.e(this.a.p());
                } while (this.a.D() < D);
                W(D);
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.p()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else if (i2 == 2) {
                int D2 = this.a.D() + this.a.v();
                do {
                    list.add(Integer.valueOf(this.a.p()));
                } while (this.a.D() < D2);
                W(D2);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void o(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i = this.b & 7;
            if (i == 2) {
                int v = this.a.v();
                V(v);
                int D = this.a.D() + v;
                do {
                    ll1.e(this.a.x());
                } while (this.a.D() < D);
            } else if (i == 5) {
                do {
                    ll1.e(this.a.x());
                    if (!this.a.m()) {
                        C2 = this.a.C();
                    } else {
                        return;
                    }
                } while (C2 == this.b);
                this.d = C2;
            } else {
                throw sl1.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int v2 = this.a.v();
                V(v2);
                int D2 = this.a.D() + v2;
                do {
                    list.add(Integer.valueOf(this.a.x()));
                } while (this.a.D() < D2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.x()));
                    if (!this.a.m()) {
                        C = this.a.C();
                    } else {
                        return;
                    }
                } while (C == this.b);
                this.d = C;
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final int p() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.C();
        }
        int i2 = this.b;
        return (i2 == 0 || i2 == this.c) ? C0188.f24 : i2 >>> 3;
    }

    @Override // defpackage.hn1
    public final <T> T q(in1<T> in1, wk1 wk1) throws IOException {
        T(2);
        return (T) X(in1, wk1);
    }

    @Override // defpackage.hn1
    public final String r() throws IOException {
        T(2);
        return this.a.t();
    }

    @Override // defpackage.hn1
    public final double readDouble() throws IOException {
        T(1);
        return this.a.a();
    }

    @Override // defpackage.hn1
    public final float readFloat() throws IOException {
        T(5);
        return this.a.b();
    }

    @Override // defpackage.hn1
    public final boolean s() throws IOException {
        int i;
        if (this.a.m() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.g(i);
    }

    @Override // defpackage.hn1
    public final long t() throws IOException {
        T(1);
        return this.a.z();
    }

    @Override // defpackage.hn1
    public final bk1 u() throws IOException {
        T(2);
        return this.a.u();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hn1
    public final <T> void v(List<T> list, in1<T> in1, wk1 wk1) throws IOException {
        int C;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(X(in1, wk1));
                if (!this.a.m() && this.d == 0) {
                    C = this.a.C();
                } else {
                    return;
                }
            } while (C == i);
            this.d = C;
            return;
        }
        throw sl1.f();
    }

    @Override // defpackage.hn1
    public final <T> T w(Class<T> cls, wk1 wk1) throws IOException {
        T(2);
        return (T) X(fn1.b().a(cls), wk1);
    }

    @Override // defpackage.hn1
    public final int x() throws IOException {
        T(5);
        return this.a.r();
    }

    @Override // defpackage.hn1
    public final <T> T y(in1<T> in1, wk1 wk1) throws IOException {
        T(3);
        return (T) Y(in1, wk1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hn1
    public final <K, V> void z(Map<K, V> map, lm1<K, V> lm1, wk1 wk1) throws IOException {
        T(2);
        int i = this.a.i(this.a.v());
        Object obj = lm1.b;
        Object obj2 = lm1.d;
        while (true) {
            try {
                int p = p();
                if (p == Integer.MAX_VALUE || this.a.m()) {
                    map.put(obj, obj2);
                } else {
                    String r6 = C0201.m82(2266);
                    if (p == 1) {
                        obj = R(lm1.a, null, null);
                    } else if (p != 2) {
                        try {
                            if (!s()) {
                                throw new sl1(r6);
                            }
                        } catch (tl1 unused) {
                            if (!s()) {
                                throw new sl1(r6);
                            }
                        }
                    } else {
                        obj2 = R(lm1.c, lm1.d.getClass(), wk1);
                    }
                }
            } finally {
                this.a.j(i);
            }
        }
        map.put(obj, obj2);
    }
}
