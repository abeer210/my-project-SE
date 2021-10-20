package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ym1  reason: default package */
public final class ym1<T> implements in1<T> {
    private final tm1 a;
    private final bo1<?, ?> b;
    private final boolean c;
    private final xk1<?> d;

    private ym1(bo1<?, ?> bo1, xk1<?> xk1, tm1 tm1) {
        this.b = bo1;
        this.c = xk1.j(tm1);
        this.d = xk1;
        this.a = tm1;
    }

    public static <T> ym1<T> j(bo1<?, ?> bo1, xk1<?> xk1, tm1 tm1) {
        return new ym1<>(bo1, xk1, tm1);
    }

    @Override // defpackage.in1
    public final void a(T t, T t2) {
        kn1.i(this.b, t, t2);
        if (this.c) {
            kn1.g(this.d, t, t2);
        }
    }

    @Override // defpackage.in1
    public final void b(T t) {
        this.b.j(t);
        this.d.i(t);
    }

    @Override // defpackage.in1
    public final boolean c(T t) {
        return this.d.g(t).d();
    }

    @Override // defpackage.in1
    public final boolean d(T t, T t2) {
        if (!this.b.q(t).equals(this.b.q(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.g(t).equals(this.d.g(t2));
        }
        return true;
    }

    @Override // defpackage.in1
    public final T e() {
        return (T) this.a.g().p();
    }

    @Override // defpackage.in1
    public final void f(T t, hn1 hn1, wk1 wk1) throws IOException {
        boolean z;
        bo1<?, ?> bo1 = this.b;
        xk1<?> xk1 = this.d;
        Object r = bo1.r(t);
        bl1<?> h = xk1.h(t);
        do {
            try {
                if (hn1.p() == Integer.MAX_VALUE) {
                    bo1.l(t, r);
                    return;
                }
                int a2 = hn1.a();
                if (a2 == 11) {
                    int i = 0;
                    Object obj = null;
                    bk1 bk1 = null;
                    while (hn1.p() != Integer.MAX_VALUE) {
                        int a3 = hn1.a();
                        if (a3 == 16) {
                            i = hn1.K();
                            obj = xk1.b(wk1, this.a, i);
                        } else if (a3 == 26) {
                            if (obj != null) {
                                xk1.e(hn1, obj, wk1, h);
                            } else {
                                bk1 = hn1.u();
                            }
                        } else if (!hn1.s()) {
                            break;
                        }
                    }
                    if (hn1.a() != 12) {
                        throw sl1.e();
                    } else if (bk1 != null) {
                        if (obj != null) {
                            xk1.d(bk1, obj, wk1, h);
                        } else {
                            bo1.b(r, i, bk1);
                        }
                    }
                } else if ((a2 & 7) == 2) {
                    Object b2 = xk1.b(wk1, this.a, a2 >>> 3);
                    if (b2 != null) {
                        xk1.e(hn1, b2, wk1, h);
                    } else {
                        z = bo1.f(r, hn1);
                        continue;
                    }
                } else {
                    z = hn1.s();
                    continue;
                }
                z = true;
                continue;
            } finally {
                bo1.l(t, r);
            }
        } while (z);
    }

    @Override // defpackage.in1
    public final int g(T t) {
        int hashCode = this.b.q(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.g(t).hashCode() : hashCode;
    }

    @Override // defpackage.in1
    public final int h(T t) {
        bo1<?, ?> bo1 = this.b;
        int s = bo1.s(bo1.q(t)) + 0;
        return this.c ? s + this.d.g(t).u() : s;
    }

    @Override // defpackage.in1
    public final void i(T t, xo1 xo1) throws IOException {
        Iterator<Map.Entry<?, Object>> e = this.d.g(t).e();
        while (e.hasNext()) {
            Map.Entry<?, Object> next = e.next();
            dl1 dl1 = (dl1) next.getKey();
            if (dl1.o() != wo1.MESSAGE || dl1.F() || dl1.V0()) {
                throw new IllegalStateException(C0201.m82(19759));
            } else if (next instanceof xl1) {
                xo1.h(dl1.a(), ((xl1) next).a().a());
            } else {
                xo1.h(dl1.a(), next.getValue());
            }
        }
        bo1<?, ?> bo1 = this.b;
        bo1.i(bo1.q(t), xo1);
    }
}
