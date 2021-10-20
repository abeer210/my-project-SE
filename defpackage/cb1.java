package defpackage;

import defpackage.l91;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: cb1  reason: default package */
public final class cb1<T> implements lb1<T> {
    private final wa1 a;
    private final ec1<?, ?> b;
    private final boolean c;
    private final a91<?> d;

    private cb1(ec1<?, ?> ec1, a91<?> a91, wa1 wa1) {
        this.b = ec1;
        this.c = a91.g(wa1);
        this.d = a91;
        this.a = wa1;
    }

    public static <T> cb1<T> k(ec1<?, ?> ec1, a91<?> a91, wa1 wa1) {
        return new cb1<>(ec1, a91, wa1);
    }

    @Override // defpackage.lb1
    public final void a(T t, T t2) {
        nb1.h(this.b, t, t2);
        if (this.c) {
            nb1.f(this.d, t, t2);
        }
    }

    @Override // defpackage.lb1
    public final boolean b(T t) {
        return this.d.h(t).c();
    }

    @Override // defpackage.lb1
    public final void c(T t) {
        this.b.m(t);
        this.d.j(t);
    }

    @Override // defpackage.lb1
    public final boolean d(T t, T t2) {
        if (!this.b.q(t).equals(this.b.q(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.h(t).equals(this.d.h(t2));
        }
        return true;
    }

    @Override // defpackage.lb1
    public final T e() {
        return (T) this.a.d().u0();
    }

    @Override // defpackage.lb1
    public final void f(T t, cd1 cd1) throws IOException {
        Iterator<Map.Entry<?, Object>> d2 = this.d.h(t).d();
        while (d2.hasNext()) {
            Map.Entry<?, Object> next = d2.next();
            d91 d91 = (d91) next.getKey();
            if (d91.R() != zc1.MESSAGE || d91.w() || d91.g1()) {
                throw new IllegalStateException(C0201.m82(33067));
            } else if (next instanceof y91) {
                cd1.h(d91.c(), ((y91) next).a().c());
            } else {
                cd1.h(d91.c(), next.getValue());
            }
        }
        ec1<?, ?> ec1 = this.b;
        ec1.i(ec1.q(t), cd1);
    }

    @Override // defpackage.lb1
    public final int g(T t) {
        int hashCode = this.b.q(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.h(t).hashCode() : hashCode;
    }

    @Override // defpackage.lb1
    public final void h(T t, mb1 mb1, y81 y81) throws IOException {
        boolean z;
        ec1<?, ?> ec1 = this.b;
        a91<?> a91 = this.d;
        Object r = ec1.r(t);
        b91<?> i = a91.i(t);
        do {
            try {
                if (mb1.H() == Integer.MAX_VALUE) {
                    ec1.k(t, r);
                    return;
                }
                int a2 = mb1.a();
                if (a2 == 11) {
                    int i2 = 0;
                    Object obj = null;
                    c81 c81 = null;
                    while (mb1.H() != Integer.MAX_VALUE) {
                        int a3 = mb1.a();
                        if (a3 == 16) {
                            i2 = mb1.G();
                            obj = a91.b(y81, this.a, i2);
                        } else if (a3 == 26) {
                            if (obj == null) {
                                c81 = mb1.L();
                            } else {
                                a91.e(mb1, obj, y81, i);
                                throw null;
                            }
                        } else if (!mb1.E()) {
                            break;
                        }
                    }
                    if (mb1.a() == 12) {
                        if (c81 != null) {
                            if (obj == null) {
                                ec1.b(r, i2, c81);
                            } else {
                                a91.d(c81, obj, y81, i);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw v91.f();
                    }
                } else if ((a2 & 7) == 2) {
                    Object b2 = a91.b(y81, this.a, a2 >>> 3);
                    if (b2 == null) {
                        z = ec1.f(r, mb1);
                        continue;
                    } else {
                        a91.e(mb1, b2, y81, i);
                        throw null;
                    }
                } else {
                    z = mb1.E();
                    continue;
                }
            } finally {
                ec1.k(t, r);
            }
        } while (z);
    }

    @Override // defpackage.lb1
    public final int i(T t) {
        ec1<?, ?> ec1 = this.b;
        int s = ec1.s(ec1.q(t)) + 0;
        return this.c ? s + this.d.h(t).s() : s;
    }

    @Override // defpackage.lb1
    public final void j(T t, byte[] bArr, int i, int i2, x71 x71) throws IOException {
        T t2 = t;
        hc1 hc1 = t2.zzahz;
        if (hc1 == hc1.i()) {
            hc1 = hc1.j();
            t2.zzahz = hc1;
        }
        t.C();
        l91.e eVar = null;
        while (i < i2) {
            int i3 = y71.i(bArr, i, x71);
            int i4 = x71.a;
            if (i4 == 11) {
                int i5 = 0;
                c81 c81 = null;
                while (i3 < i2) {
                    i3 = y71.i(bArr, i3, x71);
                    int i6 = x71.a;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (eVar != null) {
                                hb1.b();
                                throw new NoSuchMethodError();
                            } else if (i8 == 2) {
                                i3 = y71.q(bArr, i3, x71);
                                c81 = (c81) x71.c;
                            }
                        }
                    } else if (i8 == 0) {
                        i3 = y71.i(bArr, i3, x71);
                        i5 = x71.a;
                        eVar = (l91.e) this.d.b(x71.d, this.a, i5);
                    }
                    if (i6 == 12) {
                        break;
                    }
                    i3 = y71.a(i6, bArr, i3, i2, x71);
                }
                if (c81 != null) {
                    hc1.c((i5 << 3) | 2, c81);
                }
                i = i3;
            } else if ((i4 & 7) == 2) {
                eVar = (l91.e) this.d.b(x71.d, this.a, i4 >>> 3);
                if (eVar == null) {
                    i = y71.c(i4, bArr, i3, i2, hc1, x71);
                } else {
                    hb1.b();
                    throw new NoSuchMethodError();
                }
            } else {
                i = y71.a(i4, bArr, i3, i2, x71);
            }
        }
        if (i != i2) {
            throw v91.i();
        }
    }
}
