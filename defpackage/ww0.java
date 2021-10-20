package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ww0  reason: default package */
public final class ww0<T> implements ix0<T> {
    private final qw0 a;
    private final ay0<?, ?> b;
    private final boolean c;
    private final xu0<?> d;

    private ww0(ay0<?, ?> ay0, xu0<?> xu0, qw0 qw0) {
        this.b = ay0;
        this.c = xu0.f(qw0);
        this.d = xu0;
        this.a = qw0;
    }

    public static <T> ww0<T> c(ay0<?, ?> ay0, xu0<?> xu0, qw0 qw0) {
        return new ww0<>(ay0, xu0, qw0);
    }

    @Override // defpackage.ix0
    public final void a(T t, T t2) {
        kx0.i(this.b, t, t2);
        if (this.c) {
            kx0.g(this.d, t, t2);
        }
    }

    @Override // defpackage.ix0
    public final int b(T t) {
        ay0<?, ?> ay0 = this.b;
        int l = ay0.l(ay0.k(t)) + 0;
        return this.c ? l + this.d.b(t).n() : l;
    }

    @Override // defpackage.ix0
    public final boolean d(T t, T t2) {
        if (!this.b.k(t).equals(this.b.k(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.b(t).equals(this.d.b(t2));
        }
        return true;
    }

    @Override // defpackage.ix0
    public final T e() {
        return (T) this.a.e().s0();
    }

    @Override // defpackage.ix0
    public final boolean f(T t) {
        return this.d.b(t).d();
    }

    @Override // defpackage.ix0
    public final int g(T t) {
        int hashCode = this.b.k(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.b(t).hashCode() : hashCode;
    }

    @Override // defpackage.ix0
    public final void h(T t, vy0 vy0) throws IOException {
        Iterator<Map.Entry<?, Object>> e = this.d.b(t).e();
        while (e.hasNext()) {
            Map.Entry<?, Object> next = e.next();
            ev0 ev0 = (ev0) next.getKey();
            if (ev0.e0() != uy0.MESSAGE || ev0.r0() || ev0.y()) {
                throw new IllegalStateException(C0201.m82(12086));
            }
            vy0.h(ev0.u(), next instanceof vv0 ? ((vv0) next).a().d() : next.getValue());
        }
        ay0<?, ?> ay0 = this.b;
        ay0.e(ay0.k(t), vy0);
    }

    @Override // defpackage.ix0
    public final void i(T t) {
        this.b.d(t);
        this.d.e(t);
    }

    @Override // defpackage.ix0
    public final void j(T t, byte[] bArr, int i, int i2, bu0 bu0) throws IOException {
        T t2 = t;
        by0 by0 = t2.zzjp;
        if (by0 == by0.h()) {
            by0 = by0.i();
            t2.zzjp = by0;
        }
        while (i < i2) {
            int e = au0.e(bArr, i, bu0);
            int i3 = bu0.a;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? au0.c(i3, bArr, e, i2, by0, bu0) : au0.a(i3, bArr, e, i2, bu0);
            } else {
                int i4 = 0;
                fu0 fu0 = null;
                while (e < i2) {
                    e = au0.e(bArr, e, bu0);
                    int i5 = bu0.a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3 && i7 == 2) {
                            e = au0.m(bArr, e, bu0);
                            fu0 = (fu0) bu0.c;
                        }
                    } else if (i7 == 0) {
                        e = au0.e(bArr, e, bu0);
                        i4 = bu0.a;
                    }
                    if (i5 == 12) {
                        break;
                    }
                    e = au0.a(i5, bArr, e, i2, bu0);
                }
                if (fu0 != null) {
                    by0.e((i4 << 3) | 2, fu0);
                }
                i = e;
            }
        }
        if (i != i2) {
            throw qv0.d();
        }
    }
}
