package defpackage;

import defpackage.kv0;
import java.io.IOException;
import java.security.cert.X509CRLSelector;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
import vigqyno.C0201;

/* renamed from: uw0  reason: default package */
public final class uw0<T> implements ix0<T> {
    private static final Unsafe r = hy0.z();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final int e;
    private final qw0 f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int[] k;
    private final int[] l;
    private final yw0 m;
    private final aw0 n;
    private final ay0<?, ?> o;
    private final xu0<?> p;
    private final lw0 q;

    private uw0(int[] iArr, Object[] objArr, int i2, int i3, int i4, qw0 qw0, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, yw0 yw0, aw0 aw0, ay0<?, ?> ay0, xu0<?> xu0, lw0 lw0) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        boolean z3 = qw0 instanceof kv0;
        this.h = z;
        this.g = xu0 != null && xu0.f(qw0);
        this.i = false;
        this.j = iArr2;
        this.k = iArr3;
        this.l = iArr4;
        this.m = yw0;
        this.n = aw0;
        this.o = ay0;
        this.p = xu0;
        this.f = qw0;
        this.q = lw0;
    }

    private final boolean A(T t, int i2, int i3) {
        return hy0.H(t, (long) (H(i3) & 1048575)) == i2;
    }

    private final boolean B(T t, int i2, int i3, int i4) {
        return this.h ? z(t, i2) : (i3 & i4) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ix0 */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean C(Object obj, int i2, ix0 ix0) {
        return ix0.f(hy0.M(obj, (long) (i2 & 1048575)));
    }

    private final ix0 D(int i2) {
        int i3 = (i2 / 4) << 1;
        ix0 ix0 = (ix0) this.b[i3];
        if (ix0 != null) {
            return ix0;
        }
        ix0<T> b2 = dx0.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b2;
        return b2;
    }

    private final Object E(int i2) {
        return this.b[(i2 / 4) << 1];
    }

    private final ov0<?> F(int i2) {
        return (ov0) this.b[((i2 / 4) << 1) + 1];
    }

    private final int G(int i2) {
        return this.a[i2 + 1];
    }

    private final int H(int i2) {
        return this.a[i2 + 2];
    }

    private final int I(int i2) {
        int i3 = this.c;
        if (i2 >= i3) {
            int i4 = this.e;
            if (i2 < i4) {
                int i5 = (i2 - i3) << 2;
                if (this.a[i5] == i2) {
                    return i5;
                }
                return -1;
            } else if (i2 <= this.d) {
                int i6 = i4 - i3;
                int length = (this.a.length / 4) - 1;
                while (i6 <= length) {
                    int i7 = (length + i6) >>> 1;
                    int i8 = i7 << 2;
                    int i9 = this.a[i8];
                    if (i2 == i9) {
                        return i8;
                    }
                    if (i2 < i9) {
                        length = i7 - 1;
                    } else {
                        i6 = i7 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void J(T t, int i2) {
        if (!this.h) {
            int H = H(i2);
            long j2 = (long) (H & 1048575);
            hy0.g(t, j2, hy0.H(t, j2) | (1 << (H >>> 20)));
        }
    }

    private final void K(T t, int i2, int i3) {
        hy0.g(t, (long) (H(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    private final void L(T t, vy0 vy0) throws IOException {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i2;
        int i3;
        int i4;
        if (this.g) {
            bv0<?> b2 = this.p.b(t);
            if (!b2.b()) {
                it = b2.e();
                entry = it.next();
                int i5 = -1;
                length = this.a.length;
                Unsafe unsafe = r;
                int i6 = 0;
                for (i2 = 0; i2 < length; i2 = i3 + 4) {
                    int G = G(i2);
                    int[] iArr = this.a;
                    int i7 = iArr[i2];
                    int i8 = (267386880 & G) >>> 20;
                    if (this.h || i8 > 17) {
                        i3 = i2;
                        i4 = 0;
                    } else {
                        int i9 = iArr[i2 + 2];
                        int i10 = i9 & 1048575;
                        i3 = i2;
                        if (i10 != i5) {
                            i6 = unsafe.getInt(t, (long) i10);
                            i5 = i10;
                        }
                        i4 = 1 << (i9 >>> 20);
                    }
                    while (entry != null && this.p.a(entry) <= i7) {
                        this.p.c(vy0, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    long j2 = (long) (G & 1048575);
                    switch (i8) {
                        case 0:
                            if ((i4 & i6) != 0) {
                                vy0.p(i7, hy0.L(t, j2));
                                continue;
                            }
                        case 1:
                            if ((i4 & i6) != 0) {
                                vy0.q(i7, hy0.K(t, j2));
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i4 & i6) != 0) {
                                vy0.l(i7, unsafe.getLong(t, j2));
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i4 & i6) != 0) {
                                vy0.o(i7, unsafe.getLong(t, j2));
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i4 & i6) != 0) {
                                vy0.B(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i4 & i6) != 0) {
                                vy0.g(i7, unsafe.getLong(t, j2));
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i4 & i6) != 0) {
                                vy0.s(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i4 & i6) != 0) {
                                vy0.f(i7, hy0.J(t, j2));
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i4 & i6) != 0) {
                                v(i7, unsafe.getObject(t, j2), vy0);
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i4 & i6) != 0) {
                                vy0.K(i7, unsafe.getObject(t, j2), D(i3));
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i4 & i6) != 0) {
                                vy0.J(i7, (fu0) unsafe.getObject(t, j2));
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i4 & i6) != 0) {
                                vy0.E(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i4 & i6) != 0) {
                                vy0.D(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i4 & i6) != 0) {
                                vy0.F(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i4 & i6) != 0) {
                                vy0.a(i7, unsafe.getLong(t, j2));
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i4 & i6) != 0) {
                                vy0.z(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i4 & i6) != 0) {
                                vy0.c(i7, unsafe.getLong(t, j2));
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i4 & i6) != 0) {
                                vy0.M(i7, unsafe.getObject(t, j2), D(i3));
                            } else {
                                continue;
                            }
                        case 18:
                            kx0.f(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 19:
                            kx0.m(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 20:
                            kx0.r(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 21:
                            kx0.x(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 22:
                            kx0.M(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 23:
                            kx0.H(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 24:
                            kx0.R(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 25:
                            kx0.U(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 26:
                            kx0.d(this.a[i3], (List) unsafe.getObject(t, j2), vy0);
                            break;
                        case 27:
                            kx0.e(this.a[i3], (List) unsafe.getObject(t, j2), vy0, D(i3));
                            break;
                        case 28:
                            kx0.k(this.a[i3], (List) unsafe.getObject(t, j2), vy0);
                            break;
                        case 29:
                            kx0.O(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 30:
                            kx0.T(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 31:
                            kx0.S(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 32:
                            kx0.K(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 33:
                            kx0.Q(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 34:
                            kx0.F(this.a[i3], (List) unsafe.getObject(t, j2), vy0, false);
                            continue;
                        case 35:
                            kx0.f(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 36:
                            kx0.m(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 37:
                            kx0.r(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 38:
                            kx0.x(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 39:
                            kx0.M(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 40:
                            kx0.H(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 41:
                            kx0.R(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 42:
                            kx0.U(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 43:
                            kx0.O(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 44:
                            kx0.T(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 45:
                            kx0.S(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 46:
                            kx0.K(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 47:
                            kx0.Q(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 48:
                            kx0.F(this.a[i3], (List) unsafe.getObject(t, j2), vy0, true);
                            break;
                        case 49:
                            kx0.l(this.a[i3], (List) unsafe.getObject(t, j2), vy0, D(i3));
                            break;
                        case 50:
                            x(vy0, i7, unsafe.getObject(t, j2), i3);
                            break;
                        case 51:
                            if (A(t, i7, i3)) {
                                vy0.p(i7, P(t, j2));
                                break;
                            }
                            break;
                        case 52:
                            if (A(t, i7, i3)) {
                                vy0.q(i7, Q(t, j2));
                                break;
                            }
                            break;
                        case 53:
                            if (A(t, i7, i3)) {
                                vy0.l(i7, S(t, j2));
                                break;
                            }
                            break;
                        case 54:
                            if (A(t, i7, i3)) {
                                vy0.o(i7, S(t, j2));
                                break;
                            }
                            break;
                        case 55:
                            if (A(t, i7, i3)) {
                                vy0.B(i7, R(t, j2));
                                break;
                            }
                            break;
                        case 56:
                            if (A(t, i7, i3)) {
                                vy0.g(i7, S(t, j2));
                                break;
                            }
                            break;
                        case 57:
                            if (A(t, i7, i3)) {
                                vy0.s(i7, R(t, j2));
                                break;
                            }
                            break;
                        case 58:
                            if (A(t, i7, i3)) {
                                vy0.f(i7, T(t, j2));
                                break;
                            }
                            break;
                        case 59:
                            if (A(t, i7, i3)) {
                                v(i7, unsafe.getObject(t, j2), vy0);
                                break;
                            }
                            break;
                        case 60:
                            if (A(t, i7, i3)) {
                                vy0.K(i7, unsafe.getObject(t, j2), D(i3));
                                break;
                            }
                            break;
                        case 61:
                            if (A(t, i7, i3)) {
                                vy0.J(i7, (fu0) unsafe.getObject(t, j2));
                                break;
                            }
                            break;
                        case 62:
                            if (A(t, i7, i3)) {
                                vy0.E(i7, R(t, j2));
                                break;
                            }
                            break;
                        case 63:
                            if (A(t, i7, i3)) {
                                vy0.D(i7, R(t, j2));
                                break;
                            }
                            break;
                        case 64:
                            if (A(t, i7, i3)) {
                                vy0.F(i7, R(t, j2));
                                break;
                            }
                            break;
                        case 65:
                            if (A(t, i7, i3)) {
                                vy0.a(i7, S(t, j2));
                                break;
                            }
                            break;
                        case 66:
                            if (A(t, i7, i3)) {
                                vy0.z(i7, R(t, j2));
                                break;
                            }
                            break;
                        case 67:
                            if (A(t, i7, i3)) {
                                vy0.c(i7, S(t, j2));
                                break;
                            }
                            break;
                        case 68:
                            if (A(t, i7, i3)) {
                                vy0.M(i7, unsafe.getObject(t, j2), D(i3));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.p.c(vy0, entry);
                    entry = it.hasNext() ? it.next() : null;
                }
                w(this.o, t, vy0);
            }
        }
        it = null;
        entry = null;
        int i52 = -1;
        length = this.a.length;
        Unsafe unsafe2 = r;
        int i62 = 0;
        while (i2 < length) {
        }
        while (entry != null) {
        }
        w(this.o, t, vy0);
    }

    private final void M(T t, T t2, int i2) {
        int G = G(i2);
        int i3 = this.a[i2];
        long j2 = (long) (G & 1048575);
        if (A(t2, i3, i2)) {
            Object M = hy0.M(t, j2);
            Object M2 = hy0.M(t2, j2);
            if (M != null && M2 != null) {
                hy0.i(t, j2, mv0.d(M, M2));
                K(t, i3, i2);
            } else if (M2 != null) {
                hy0.i(t, j2, M2);
                K(t, i3, i2);
            }
        }
    }

    private final boolean N(T t, T t2, int i2) {
        return z(t, i2) == z(t2, i2);
    }

    private static <E> List<E> O(Object obj, long j2) {
        return (List) hy0.M(obj, j2);
    }

    private static <T> double P(T t, long j2) {
        return ((Double) hy0.M(t, j2)).doubleValue();
    }

    private static <T> float Q(T t, long j2) {
        return ((Float) hy0.M(t, j2)).floatValue();
    }

    private static <T> int R(T t, long j2) {
        return ((Integer) hy0.M(t, j2)).intValue();
    }

    private static <T> long S(T t, long j2) {
        return ((Long) hy0.M(t, j2)).longValue();
    }

    private static <T> boolean T(T t, long j2) {
        return ((Boolean) hy0.M(t, j2)).booleanValue();
    }

    private static by0 U(Object obj) {
        kv0 kv0 = (kv0) obj;
        by0 by0 = kv0.zzjp;
        if (by0 != by0.h()) {
            return by0;
        }
        by0 i2 = by0.i();
        kv0.zzjp = i2;
        return i2;
    }

    private static int c(int i2, byte[] bArr, int i3, int i4, Object obj, bu0 bu0) throws IOException {
        return au0.c(i2, bArr, i3, i4, U(obj), bu0);
    }

    private static int k(ix0<?> ix0, int i2, byte[] bArr, int i3, int i4, pv0<?> pv0, bu0 bu0) throws IOException {
        int m2 = m(ix0, bArr, i3, i4, bu0);
        while (true) {
            pv0.add(bu0.c);
            if (m2 >= i4) {
                break;
            }
            int e2 = au0.e(bArr, m2, bu0);
            if (i2 != bu0.a) {
                break;
            }
            m2 = m(ix0, bArr, e2, i4, bu0);
        }
        return m2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: uw0 */
    /* JADX WARN: Multi-variable type inference failed */
    private static int l(ix0 ix0, byte[] bArr, int i2, int i3, int i4, bu0 bu0) throws IOException {
        uw0 uw0 = (uw0) ix0;
        Object e2 = uw0.e();
        int r2 = uw0.r(e2, bArr, i2, i3, i4, bu0);
        uw0.i(e2);
        bu0.c = e2;
        return r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: ix0 */
    /* JADX WARN: Multi-variable type inference failed */
    private static int m(ix0 ix0, byte[] bArr, int i2, int i3, bu0 bu0) throws IOException {
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        byte b3 = b2;
        if (b2 < 0) {
            i4 = au0.d(b2, bArr, i4, bu0);
            b3 = bu0.a;
        }
        if (b3 < 0 || b3 > i3 - i4) {
            throw qv0.a();
        }
        Object e2 = ix0.e();
        int i5 = (b3 == 1 ? 1 : 0) + i4;
        ix0.j(e2, bArr, i4, i5, bu0);
        ix0.i(e2);
        bu0.c = e2;
        return i5;
    }

    private static <UT, UB> int n(ay0<UT, UB> ay0, T t) {
        return ay0.j(ay0.k(t));
    }

    private final int o(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, bu0 bu0) throws IOException {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        long j3;
        int i11;
        int i12;
        Unsafe unsafe = r;
        long j4 = (long) (this.a[i9 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    obj = Double.valueOf(au0.l(bArr, i2));
                    unsafe.putObject(t, j2, obj);
                    i10 = i2 + 8;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    obj2 = Float.valueOf(au0.n(bArr, i2));
                    unsafe.putObject(t, j2, obj2);
                    i10 = i2 + 4;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    i10 = au0.g(bArr, i2, bu0);
                    j3 = bu0.b;
                    obj3 = Long.valueOf(j3);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    i10 = au0.e(bArr, i2, bu0);
                    i11 = bu0.a;
                    obj3 = Integer.valueOf(i11);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    obj = Long.valueOf(au0.k(bArr, i2));
                    unsafe.putObject(t, j2, obj);
                    i10 = i2 + 8;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    obj2 = Integer.valueOf(au0.h(bArr, i2));
                    unsafe.putObject(t, j2, obj2);
                    i10 = i2 + 4;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    i10 = au0.g(bArr, i2, bu0);
                    obj3 = Boolean.valueOf(bu0.b != 0);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    i10 = au0.e(bArr, i2, bu0);
                    i12 = bu0.a;
                    if (i12 == 0) {
                        obj3 = C0201.m82(27000);
                        unsafe.putObject(t, j2, obj3);
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    } else if ((i7 & 536870912) == 0 || jy0.i(bArr, i10, i10 + i12)) {
                        unsafe.putObject(t, j2, new String(bArr, i10, i12, mv0.a));
                        i10 += i12;
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    } else {
                        throw qv0.e();
                    }
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    i10 = m(D(i9), bArr, i2, i3, bu0);
                    Object object = unsafe.getInt(t, j4) == i5 ? unsafe.getObject(t, j2) : null;
                    obj3 = bu0.c;
                    if (object != null) {
                        obj3 = mv0.d(object, obj3);
                    }
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    i10 = au0.e(bArr, i2, bu0);
                    i12 = bu0.a;
                    if (i12 == 0) {
                        obj3 = fu0.b;
                        unsafe.putObject(t, j2, obj3);
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    }
                    unsafe.putObject(t, j2, fu0.i(bArr, i10, i12));
                    i10 += i12;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int e2 = au0.e(bArr, i2, bu0);
                    int i13 = bu0.a;
                    ov0<?> F = F(i9);
                    if (F == null || F.a(i13) != null) {
                        unsafe.putObject(t, j2, Integer.valueOf(i13));
                        i10 = e2;
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    }
                    U(t).e(i4, Long.valueOf((long) i13));
                    return e2;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    i10 = au0.e(bArr, i2, bu0);
                    i11 = ou0.c(bu0.a);
                    obj3 = Integer.valueOf(i11);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    i10 = au0.g(bArr, i2, bu0);
                    j3 = ou0.a(bu0.b);
                    obj3 = Long.valueOf(j3);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    i10 = l(D(i9), bArr, i2, i3, (i4 & -8) | 4, bu0);
                    Object object2 = unsafe.getInt(t, j4) == i5 ? unsafe.getObject(t, j2) : null;
                    obj3 = bu0.c;
                    if (object2 != null) {
                        obj3 = mv0.d(object2, obj3);
                    }
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0237, code lost:
        if (r30.b != 0) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0239, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023b, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x023c, code lost:
        r11.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023f, code lost:
        if (r4 >= r20) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0241, code lost:
        r6 = defpackage.au0.e(r18, r4, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0247, code lost:
        if (r21 != r30.a) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0249, code lost:
        r4 = defpackage.au0.g(r18, r6, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0251, code lost:
        if (r30.b == 0) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        if (r4 == 0) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        r11.add(defpackage.fu0.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        r11.add(defpackage.fu0.i(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014a, code lost:
        if (r1 >= r20) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r4 = defpackage.au0.e(r18, r1, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0152, code lost:
        if (r21 != r30.a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        r1 = defpackage.au0.e(r18, r4, r30);
        r4 = r30.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        if (r4 != 0) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d8  */
    private final int p(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, bu0 bu0) throws IOException {
        int g2;
        int e2;
        int e3;
        int g3;
        int i9 = i2;
        pv0 pv0 = (pv0) r.getObject(t, j3);
        if (!pv0.E0()) {
            int size = pv0.size();
            pv0 = pv0.B0(size == 0 ? 10 : size << 1);
            r.putObject(t, j3, pv0);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    uu0 uu0 = (uu0) pv0;
                    int e4 = au0.e(bArr, i9, bu0);
                    int i10 = bu0.a + e4;
                    while (e4 < i10) {
                        uu0.b(au0.l(bArr, e4));
                        e4 += 8;
                    }
                    if (e4 == i10) {
                        return e4;
                    }
                    throw qv0.a();
                }
                if (i6 == 1) {
                    uu0 uu02 = (uu0) pv0;
                    uu02.b(au0.l(bArr, i2));
                    while (true) {
                        int i11 = i9 + 8;
                        if (i11 >= i3) {
                            return i11;
                        }
                        i9 = au0.e(bArr, i11, bu0);
                        if (i4 != bu0.a) {
                            return i11;
                        }
                        uu02.b(au0.l(bArr, i9));
                    }
                }
                return i9;
            case 19:
            case 36:
                if (i6 == 2) {
                    iv0 iv0 = (iv0) pv0;
                    int e5 = au0.e(bArr, i9, bu0);
                    int i12 = bu0.a + e5;
                    while (e5 < i12) {
                        iv0.b(au0.n(bArr, e5));
                        e5 += 4;
                    }
                    if (e5 == i12) {
                        return e5;
                    }
                    throw qv0.a();
                }
                if (i6 == 5) {
                    iv0 iv02 = (iv0) pv0;
                    iv02.b(au0.n(bArr, i2));
                    while (true) {
                        int i13 = i9 + 4;
                        if (i13 >= i3) {
                            return i13;
                        }
                        i9 = au0.e(bArr, i13, bu0);
                        if (i4 != bu0.a) {
                            return i13;
                        }
                        iv02.b(au0.n(bArr, i9));
                    }
                }
                return i9;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    ew0 ew0 = (ew0) pv0;
                    int e6 = au0.e(bArr, i9, bu0);
                    int i14 = bu0.a + e6;
                    while (e6 < i14) {
                        e6 = au0.g(bArr, e6, bu0);
                        ew0.e(bu0.b);
                    }
                    if (e6 == i14) {
                        return e6;
                    }
                    throw qv0.a();
                }
                if (i6 == 0) {
                    ew0 ew02 = (ew0) pv0;
                    do {
                        g2 = au0.g(bArr, i9, bu0);
                        ew02.e(bu0.b);
                        if (g2 >= i3) {
                            return g2;
                        }
                        i9 = au0.e(bArr, g2, bu0);
                    } while (i4 == bu0.a);
                    return g2;
                }
                return i9;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return au0.f(bArr, i9, pv0, bu0);
                }
                if (i6 == 0) {
                    return au0.b(i4, bArr, i2, i3, pv0, bu0);
                }
                return i9;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    ew0 ew03 = (ew0) pv0;
                    int e7 = au0.e(bArr, i9, bu0);
                    int i15 = bu0.a + e7;
                    while (e7 < i15) {
                        ew03.e(au0.k(bArr, e7));
                        e7 += 8;
                    }
                    if (e7 == i15) {
                        return e7;
                    }
                    throw qv0.a();
                }
                if (i6 == 1) {
                    ew0 ew04 = (ew0) pv0;
                    ew04.e(au0.k(bArr, i2));
                    while (true) {
                        int i16 = i9 + 8;
                        if (i16 >= i3) {
                            return i16;
                        }
                        i9 = au0.e(bArr, i16, bu0);
                        if (i4 != bu0.a) {
                            return i16;
                        }
                        ew04.e(au0.k(bArr, i9));
                    }
                }
                return i9;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    lv0 lv0 = (lv0) pv0;
                    int e8 = au0.e(bArr, i9, bu0);
                    int i17 = bu0.a + e8;
                    while (e8 < i17) {
                        lv0.c(au0.h(bArr, e8));
                        e8 += 4;
                    }
                    if (e8 == i17) {
                        return e8;
                    }
                    throw qv0.a();
                }
                if (i6 == 5) {
                    lv0 lv02 = (lv0) pv0;
                    lv02.c(au0.h(bArr, i2));
                    while (true) {
                        int i18 = i9 + 4;
                        if (i18 >= i3) {
                            return i18;
                        }
                        i9 = au0.e(bArr, i18, bu0);
                        if (i4 != bu0.a) {
                            return i18;
                        }
                        lv02.c(au0.h(bArr, i9));
                    }
                }
                return i9;
            case 25:
            case 42:
                if (i6 == 2) {
                    cu0 cu0 = (cu0) pv0;
                    e2 = au0.e(bArr, i9, bu0);
                    int i19 = bu0.a + e2;
                    while (e2 < i19) {
                        e2 = au0.g(bArr, e2, bu0);
                        cu0.b(bu0.b != 0);
                    }
                    if (e2 != i19) {
                        throw qv0.a();
                    }
                    return e2;
                }
                if (i6 == 0) {
                    cu0 cu02 = (cu0) pv0;
                    i9 = au0.g(bArr, i9, bu0);
                    break;
                }
                return i9;
            case 26:
                if (i6 == 2) {
                    String r1 = C0201.m82(27001);
                    int i20 = ((j2 & 536870912) > 0 ? 1 : ((j2 & 536870912) == 0 ? 0 : -1));
                    i9 = au0.e(bArr, i9, bu0);
                    if (i20 == 0) {
                        int i21 = bu0.a;
                        if (i21 != 0) {
                            String str = new String(bArr, i9, i21, mv0.a);
                            pv0.add(str);
                            i9 += i21;
                            if (i9 < i3) {
                                int e9 = au0.e(bArr, i9, bu0);
                                if (i4 == bu0.a) {
                                    i9 = au0.e(bArr, e9, bu0);
                                    i21 = bu0.a;
                                    if (i21 != 0) {
                                        str = new String(bArr, i9, i21, mv0.a);
                                        pv0.add(str);
                                        i9 += i21;
                                        if (i9 < i3) {
                                        }
                                    }
                                }
                            }
                        }
                        pv0.add(r1);
                        if (i9 < i3) {
                        }
                    } else {
                        int i22 = bu0.a;
                        if (i22 != 0) {
                            int i23 = i9 + i22;
                            if (jy0.i(bArr, i9, i23)) {
                                String str2 = new String(bArr, i9, i22, mv0.a);
                                pv0.add(str2);
                                i9 = i23;
                                if (i9 < i3) {
                                    int e10 = au0.e(bArr, i9, bu0);
                                    if (i4 == bu0.a) {
                                        i9 = au0.e(bArr, e10, bu0);
                                        int i24 = bu0.a;
                                        if (i24 != 0) {
                                            i23 = i9 + i24;
                                            if (jy0.i(bArr, i9, i23)) {
                                                str2 = new String(bArr, i9, i24, mv0.a);
                                                pv0.add(str2);
                                                i9 = i23;
                                                if (i9 < i3) {
                                                }
                                            }
                                            throw qv0.e();
                                        }
                                    }
                                }
                            } else {
                                throw qv0.e();
                            }
                        }
                        pv0.add(r1);
                        if (i9 < i3) {
                        }
                    }
                }
                return i9;
            case 27:
                if (i6 == 2) {
                    return k(D(i7), i4, bArr, i2, i3, pv0, bu0);
                }
                return i9;
            case 28:
                if (i6 == 2) {
                    int e11 = au0.e(bArr, i9, bu0);
                    int i25 = bu0.a;
                    break;
                }
                return i9;
            case 30:
            case 44:
                if (i6 == 2) {
                    e2 = au0.f(bArr, i9, pv0, bu0);
                } else {
                    if (i6 == 0) {
                        e2 = au0.b(i4, bArr, i2, i3, pv0, bu0);
                    }
                    return i9;
                }
                T t2 = t;
                by0 by0 = t2.zzjp;
                if (by0 == by0.h()) {
                    by0 = null;
                }
                by0 by02 = (by0) kx0.c(i5, pv0, F(i7), by0, this.o);
                if (by02 != null) {
                    t2.zzjp = by02;
                }
                return e2;
            case 33:
            case 47:
                if (i6 == 2) {
                    lv0 lv03 = (lv0) pv0;
                    int e12 = au0.e(bArr, i9, bu0);
                    int i26 = bu0.a + e12;
                    while (e12 < i26) {
                        e12 = au0.e(bArr, e12, bu0);
                        lv03.c(ou0.c(bu0.a));
                    }
                    if (e12 == i26) {
                        return e12;
                    }
                    throw qv0.a();
                }
                if (i6 == 0) {
                    lv0 lv04 = (lv0) pv0;
                    do {
                        e3 = au0.e(bArr, i9, bu0);
                        lv04.c(ou0.c(bu0.a));
                        if (e3 >= i3) {
                            return e3;
                        }
                        i9 = au0.e(bArr, e3, bu0);
                    } while (i4 == bu0.a);
                    return e3;
                }
                return i9;
            case 34:
            case 48:
                if (i6 == 2) {
                    ew0 ew05 = (ew0) pv0;
                    int e13 = au0.e(bArr, i9, bu0);
                    int i27 = bu0.a + e13;
                    while (e13 < i27) {
                        e13 = au0.g(bArr, e13, bu0);
                        ew05.e(ou0.a(bu0.b));
                    }
                    if (e13 == i27) {
                        return e13;
                    }
                    throw qv0.a();
                }
                if (i6 == 0) {
                    ew0 ew06 = (ew0) pv0;
                    do {
                        g3 = au0.g(bArr, i9, bu0);
                        ew06.e(ou0.a(bu0.b));
                        if (g3 >= i3) {
                            return g3;
                        }
                        i9 = au0.e(bArr, g3, bu0);
                    } while (i4 == bu0.a);
                    return g3;
                }
                return i9;
            case 49:
                if (i6 == 3) {
                    ix0 D = D(i7);
                    int i28 = (i4 & -8) | 4;
                    i9 = l(D, bArr, i2, i3, i28, bu0);
                    while (true) {
                        pv0.add(bu0.c);
                        if (i9 < i3) {
                            int e14 = au0.e(bArr, i9, bu0);
                            if (i4 == bu0.a) {
                                i9 = l(D, bArr, e14, i3, i28, bu0);
                            }
                        }
                    }
                }
                return i9;
            default:
                return i9;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x003e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x003e */
    private final <K, V> int q(T t, byte[] bArr, int i2, int i3, int i4, int i5, long j2, bu0 bu0) throws IOException {
        Unsafe unsafe = r;
        Object E = E(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.q.i(object)) {
            Object h2 = this.q.h(E);
            this.q.e(h2, object);
            unsafe.putObject(t, j2, h2);
            object = h2;
        }
        jw0<?, ?> g2 = this.q.g(E);
        Map<?, ?> k2 = this.q.k(object);
        int e2 = au0.e(bArr, i2, bu0);
        int i6 = bu0.a;
        if (i6 < 0 || i6 > i3 - e2) {
            throw qv0.a();
        }
        int i7 = i6 + e2;
        X509CRLSelector x509CRLSelector = (K) g2.b;
        X509CRLSelector x509CRLSelector2 = (V) g2.d;
        while (e2 < i7) {
            int i8 = e2 + 1;
            byte b2 = bArr[e2];
            int i9 = b2;
            if (b2 < 0) {
                i8 = au0.d(b2, bArr, i8, bu0);
                i9 = bu0.a;
            }
            int i10 = (i9 == 1 ? 1 : 0) >>> 3;
            int i11 = (i9 == 1 ? 1 : 0) & 7;
            if (i10 != 1) {
                if (i10 == 2 && i11 == g2.c.d()) {
                    e2 = s(bArr, i8, i3, g2.c, g2.d.getClass(), bu0);
                    x509CRLSelector2 = (V) bu0.c;
                }
            } else if (i11 == g2.a.d()) {
                e2 = s(bArr, i8, i3, g2.a, null, bu0);
                x509CRLSelector = (K) bu0.c;
            }
            e2 = au0.a(i9, bArr, i8, i3, bu0);
        }
        if (e2 == i7) {
            k2.put(x509CRLSelector, x509CRLSelector2);
            return i7;
        }
        throw qv0.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f0, code lost:
        if (r0 == r4) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0338, code lost:
        if (r0 == r15) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0354, code lost:
        if (r0 == r15) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0356, code lost:
        r9 = r29;
        r8 = r31;
        r2 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0370 A[ADDED_TO_REGION] */
    private final int r(T t, byte[] bArr, int i2, int i3, int i4, bu0 bu0) throws IOException {
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        T t2;
        ov0<?> F;
        byte b2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        bu0 bu02;
        int i18;
        long j2;
        Object obj;
        bu0 bu03;
        int i19;
        uw0<T> uw0 = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i20 = i3;
        int i21 = i4;
        bu0 bu04 = bu0;
        Unsafe unsafe2 = r;
        int i22 = -1;
        int i23 = i2;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        while (true) {
            if (i23 < i20) {
                int i27 = i23 + 1;
                byte b3 = bArr2[i23];
                if (b3 < 0) {
                    i10 = au0.d(b3, bArr2, i27, bu04);
                    b2 = bu04.a;
                } else {
                    b2 = b3;
                    i10 = i27;
                }
                int i28 = b2 >>> 3;
                int i29 = b2 & 7;
                int I = uw0.I(i28);
                if (I != i22) {
                    int[] iArr = uw0.a;
                    int i30 = iArr[I + 1];
                    int i31 = (i30 & 267386880) >>> 20;
                    long j3 = (long) (i30 & 1048575);
                    if (i31 <= 17) {
                        int i32 = iArr[I + 2];
                        int i33 = 1 << (i32 >>> 20);
                        int i34 = i32 & 1048575;
                        if (i34 != i26) {
                            if (i26 != -1) {
                                unsafe2.putInt(t3, (long) i26, i25);
                            }
                            i25 = unsafe2.getInt(t3, (long) i34);
                            i26 = i34;
                        }
                        switch (i31) {
                            case 0:
                                i7 = b2;
                                bu02 = bu0;
                                i17 = i10;
                                i16 = i26;
                                bArr2 = bArr;
                                if (i29 == 1) {
                                    hy0.e(t3, j3, au0.l(bArr2, i17));
                                    i23 = i17 + 8;
                                    i25 |= i33;
                                    i26 = i16;
                                    i20 = i3;
                                    i24 = i7;
                                    bu04 = bu02;
                                    i22 = -1;
                                    i21 = i4;
                                    break;
                                }
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5 && i5 != 0) {
                                    i8 = i26;
                                    i9 = -1;
                                    i6 = i11;
                                    break;
                                } else {
                                    i23 = c(i7, bArr, i11, i3, t, bu0);
                                    uw0 = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i20 = i3;
                                    i21 = i5;
                                    i24 = i7;
                                    unsafe2 = unsafe;
                                    i22 = -1;
                                    bu04 = bu0;
                                    break;
                                }
                            case 1:
                                i7 = b2;
                                bu02 = bu0;
                                i17 = i10;
                                i16 = i26;
                                bArr2 = bArr;
                                if (i29 == 5) {
                                    hy0.f(t3, j3, au0.n(bArr2, i17));
                                    i23 = i17 + 4;
                                    i25 |= i33;
                                    i26 = i16;
                                    i20 = i3;
                                    i24 = i7;
                                    bu04 = bu02;
                                    i22 = -1;
                                    i21 = i4;
                                    break;
                                }
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 2:
                            case 3:
                                i7 = b2;
                                i17 = i10;
                                i16 = i26;
                                bArr2 = bArr;
                                if (i29 == 0) {
                                    int g2 = au0.g(bArr2, i17, bu0);
                                    unsafe2.putLong(t, j3, bu0.b);
                                    i25 |= i33;
                                    i26 = i16;
                                    i20 = i3;
                                    i24 = i7;
                                    bu04 = bu0;
                                    i23 = g2;
                                    i22 = -1;
                                    i21 = i4;
                                    break;
                                }
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 4:
                            case 11:
                                i7 = b2;
                                bu02 = bu0;
                                i17 = i10;
                                i16 = i26;
                                bArr2 = bArr;
                                if (i29 == 0) {
                                    i23 = au0.e(bArr2, i17, bu02);
                                    unsafe2.putInt(t3, j3, bu02.a);
                                    i25 |= i33;
                                    i26 = i16;
                                    i20 = i3;
                                    i24 = i7;
                                    bu04 = bu02;
                                    i22 = -1;
                                    i21 = i4;
                                    break;
                                }
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 5:
                            case 14:
                                i7 = b2;
                                bu02 = bu0;
                                i16 = i26;
                                bArr2 = bArr;
                                if (i29 == 1) {
                                    unsafe2.putLong(t, j3, au0.k(bArr2, i10));
                                    i23 = i10 + 8;
                                    i25 |= i33;
                                    i26 = i16;
                                    i20 = i3;
                                    i24 = i7;
                                    bu04 = bu02;
                                    i22 = -1;
                                    i21 = i4;
                                    break;
                                }
                                i17 = i10;
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 6:
                            case 13:
                                i7 = b2;
                                i18 = i3;
                                bu02 = bu0;
                                i16 = i26;
                                bArr2 = bArr;
                                if (i29 == 5) {
                                    unsafe2.putInt(t3, j3, au0.h(bArr2, i10));
                                    i23 = i10 + 4;
                                    i25 |= i33;
                                    i26 = i16;
                                    i20 = i18;
                                    i24 = i7;
                                    bu04 = bu02;
                                    i22 = -1;
                                    i21 = i4;
                                    break;
                                }
                                i17 = i10;
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 7:
                                i7 = b2;
                                i18 = i3;
                                bu02 = bu0;
                                i16 = i26;
                                bArr2 = bArr;
                                if (i29 == 0) {
                                    i23 = au0.g(bArr2, i10, bu02);
                                    hy0.j(t3, j3, bu02.b != 0);
                                    i25 |= i33;
                                    i26 = i16;
                                    i20 = i18;
                                    i24 = i7;
                                    bu04 = bu02;
                                    i22 = -1;
                                    i21 = i4;
                                    break;
                                }
                                i17 = i10;
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 8:
                                i7 = b2;
                                i18 = i3;
                                bu02 = bu0;
                                i16 = i26;
                                j2 = j3;
                                bArr2 = bArr;
                                if (i29 == 2) {
                                    i23 = (i30 & 536870912) == 0 ? au0.i(bArr2, i10, bu02) : au0.j(bArr2, i10, bu02);
                                    obj = bu02.c;
                                    unsafe2.putObject(t3, j2, obj);
                                    i25 |= i33;
                                    i26 = i16;
                                    i20 = i18;
                                    i24 = i7;
                                    bu04 = bu02;
                                    i22 = -1;
                                    i21 = i4;
                                    break;
                                }
                                i17 = i10;
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 9:
                                i7 = b2;
                                bu02 = bu0;
                                i16 = i26;
                                j2 = j3;
                                bArr2 = bArr;
                                if (i29 == 2) {
                                    i18 = i3;
                                    i23 = m(uw0.D(I), bArr2, i10, i18, bu02);
                                    obj = (i25 & i33) == 0 ? bu02.c : mv0.d(unsafe2.getObject(t3, j2), bu02.c);
                                    unsafe2.putObject(t3, j2, obj);
                                    i25 |= i33;
                                    i26 = i16;
                                    i20 = i18;
                                    i24 = i7;
                                    bu04 = bu02;
                                    i22 = -1;
                                    i21 = i4;
                                    break;
                                } else {
                                    i17 = i10;
                                    i26 = i16;
                                    i5 = i4;
                                    i11 = i17;
                                    unsafe = unsafe2;
                                    if (i7 != i5) {
                                    }
                                    i23 = c(i7, bArr, i11, i3, t, bu0);
                                    uw0 = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i20 = i3;
                                    i21 = i5;
                                    i24 = i7;
                                    unsafe2 = unsafe;
                                    i22 = -1;
                                    bu04 = bu0;
                                    break;
                                }
                                break;
                            case 10:
                                i7 = b2;
                                bu03 = bu0;
                                i22 = -1;
                                bArr2 = bArr;
                                if (i29 == 2) {
                                    i19 = au0.m(bArr2, i10, bu03);
                                    unsafe2.putObject(t3, j3, bu03.c);
                                    i25 |= i33;
                                    i20 = i3;
                                    i23 = i19;
                                    i24 = i7;
                                    bu04 = bu03;
                                    i21 = i4;
                                    break;
                                }
                                i17 = i10;
                                i16 = i26;
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 12:
                                i7 = b2;
                                bu03 = bu0;
                                i22 = -1;
                                bArr2 = bArr;
                                if (i29 == 0) {
                                    i23 = au0.e(bArr2, i10, bu03);
                                    int i35 = bu03.a;
                                    ov0<?> F2 = uw0.F(I);
                                    if (F2 == null || F2.a(i35) != null) {
                                        unsafe2.putInt(t3, j3, i35);
                                        i25 |= i33;
                                    } else {
                                        U(t).e(i7, Long.valueOf((long) i35));
                                    }
                                    i20 = i3;
                                    i24 = i7;
                                    bu04 = bu03;
                                    i21 = i4;
                                    break;
                                }
                                i17 = i10;
                                i16 = i26;
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 15:
                                i7 = b2;
                                bu03 = bu0;
                                i22 = -1;
                                bArr2 = bArr;
                                if (i29 == 0) {
                                    i19 = au0.e(bArr2, i10, bu03);
                                    unsafe2.putInt(t3, j3, ou0.c(bu03.a));
                                    i25 |= i33;
                                    i20 = i3;
                                    i23 = i19;
                                    i24 = i7;
                                    bu04 = bu03;
                                    i21 = i4;
                                    break;
                                }
                                i17 = i10;
                                i16 = i26;
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 16:
                                i7 = b2;
                                i22 = -1;
                                if (i29 == 0) {
                                    bArr2 = bArr;
                                    int g3 = au0.g(bArr2, i10, bu0);
                                    unsafe2.putLong(t, j3, ou0.a(bu0.b));
                                    i25 |= i33;
                                    i24 = i7;
                                    bu04 = bu0;
                                    i23 = g3;
                                    i20 = i3;
                                    i21 = i4;
                                    break;
                                }
                                i17 = i10;
                                i16 = i26;
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                            case 17:
                                if (i29 == 3) {
                                    i7 = b2;
                                    i22 = -1;
                                    i23 = l(uw0.D(I), bArr, i10, i3, (i28 << 3) | 4, bu0);
                                    bu03 = bu0;
                                    unsafe2.putObject(t3, j3, (i25 & i33) == 0 ? bu03.c : mv0.d(unsafe2.getObject(t3, j3), bu03.c));
                                    i25 |= i33;
                                    bArr2 = bArr;
                                    i20 = i3;
                                    i24 = i7;
                                    bu04 = bu03;
                                    i21 = i4;
                                    break;
                                } else {
                                    i7 = b2;
                                    i17 = i10;
                                    i16 = i26;
                                    i26 = i16;
                                    i5 = i4;
                                    i11 = i17;
                                    unsafe = unsafe2;
                                    if (i7 != i5) {
                                    }
                                    i23 = c(i7, bArr, i11, i3, t, bu0);
                                    uw0 = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i20 = i3;
                                    i21 = i5;
                                    i24 = i7;
                                    unsafe2 = unsafe;
                                    i22 = -1;
                                    bu04 = bu0;
                                    break;
                                }
                                break;
                            default:
                                i7 = b2;
                                i17 = i10;
                                i16 = i26;
                                i26 = i16;
                                i5 = i4;
                                i11 = i17;
                                unsafe = unsafe2;
                                if (i7 != i5) {
                                }
                                i23 = c(i7, bArr, i11, i3, t, bu0);
                                uw0 = this;
                                t3 = t;
                                bArr2 = bArr;
                                i20 = i3;
                                i21 = i5;
                                i24 = i7;
                                unsafe2 = unsafe;
                                i22 = -1;
                                bu04 = bu0;
                                break;
                        }
                    } else {
                        i13 = i26;
                        bArr2 = bArr;
                        if (i31 != 27) {
                            i12 = i25;
                            if (i31 <= 49) {
                                i14 = b2;
                                unsafe = unsafe2;
                                i23 = p(t, bArr, i10, i3, b2, i28, i29, I, (long) i30, i31, j3, bu0);
                            } else {
                                i15 = i10;
                                i14 = b2;
                                unsafe = unsafe2;
                                if (i31 == 50) {
                                    if (i29 == 2) {
                                        i23 = q(t, bArr, i15, i3, I, i28, j3, bu0);
                                    }
                                    i7 = i14;
                                    i5 = i4;
                                    i11 = i15;
                                    i26 = i13;
                                    i25 = i12;
                                    if (i7 != i5) {
                                    }
                                    i23 = c(i7, bArr, i11, i3, t, bu0);
                                    uw0 = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i20 = i3;
                                    i21 = i5;
                                    i24 = i7;
                                    unsafe2 = unsafe;
                                    i22 = -1;
                                    bu04 = bu0;
                                } else {
                                    i23 = o(t, bArr, i15, i3, i14, i28, i29, i30, i31, j3, I, bu0);
                                }
                            }
                            uw0 = this;
                            t3 = t;
                            bArr2 = bArr;
                            i24 = i14;
                            i20 = i3;
                            i21 = i4;
                            bu04 = bu0;
                            i26 = i13;
                            i25 = i12;
                            unsafe2 = unsafe;
                            i22 = -1;
                        } else if (i29 == 2) {
                            pv0 pv0 = (pv0) unsafe2.getObject(t3, j3);
                            if (!pv0.E0()) {
                                int size = pv0.size();
                                pv0 = pv0.B0(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t3, j3, pv0);
                            }
                            ix0 D = uw0.D(I);
                            i24 = b2;
                            i23 = k(D, i24, bArr, i10, i3, pv0, bu0);
                            i20 = i3;
                            i21 = i4;
                            i26 = i13;
                            i25 = i25;
                            i22 = -1;
                            bu04 = bu0;
                        } else {
                            i12 = i25;
                            i15 = i10;
                            i14 = b2;
                        }
                    }
                } else {
                    i15 = i10;
                    i14 = b2;
                    i12 = i25;
                    i13 = i26;
                }
                unsafe = unsafe2;
                i7 = i14;
                i5 = i4;
                i11 = i15;
                i26 = i13;
                i25 = i12;
                if (i7 != i5) {
                }
                i23 = c(i7, bArr, i11, i3, t, bu0);
                uw0 = this;
                t3 = t;
                bArr2 = bArr;
                i20 = i3;
                i21 = i5;
                i24 = i7;
                unsafe2 = unsafe;
                i22 = -1;
                bu04 = bu0;
            } else {
                unsafe = unsafe2;
                i5 = i21;
                i6 = i23;
                i7 = i24;
                i8 = i26;
                i9 = -1;
            }
        }
        if (i8 != i9) {
            t2 = t;
            unsafe.putInt(t2, (long) i8, i25);
        } else {
            t2 = t;
        }
        int[] iArr2 = this.k;
        if (iArr2 != null) {
            Object obj2 = null;
            for (int i36 : iArr2) {
                ay0<UT, UB> ay0 = (ay0<UT, UB>) this.o;
                int i37 = this.a[i36];
                Object M = hy0.M(t2, (long) (G(i36) & 1048575));
                if (!(M == null || (F = F(i36)) == null)) {
                    obj2 = u(i36, i37, (Map<K, V>) this.q.k(M), F, obj2, ay0);
                }
                obj2 = (by0) obj2;
            }
            if (obj2 != null) {
                this.o.h(t2, obj2);
            }
        }
        if (i5 == 0) {
            if (i6 != i3) {
                throw qv0.d();
            }
        } else if (i6 > i3 || i7 != i5) {
            throw qv0.d();
        }
        return i6;
    }

    private static int s(byte[] bArr, int i2, int i3, py0 py0, Class<?> cls, bu0 bu0) throws IOException {
        int g2;
        Object valueOf;
        Object obj;
        Object obj2;
        int i4;
        long j2;
        switch (vw0.a[py0.ordinal()]) {
            case 1:
                g2 = au0.g(bArr, i2, bu0);
                valueOf = Boolean.valueOf(bu0.b != 0);
                bu0.c = valueOf;
                return g2;
            case 2:
                return au0.m(bArr, i2, bu0);
            case 3:
                obj = Double.valueOf(au0.l(bArr, i2));
                bu0.c = obj;
                return i2 + 8;
            case 4:
            case 5:
                obj2 = Integer.valueOf(au0.h(bArr, i2));
                bu0.c = obj2;
                return i2 + 4;
            case 6:
            case 7:
                obj = Long.valueOf(au0.k(bArr, i2));
                bu0.c = obj;
                return i2 + 8;
            case 8:
                obj2 = Float.valueOf(au0.n(bArr, i2));
                bu0.c = obj2;
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                g2 = au0.e(bArr, i2, bu0);
                i4 = bu0.a;
                valueOf = Integer.valueOf(i4);
                bu0.c = valueOf;
                return g2;
            case 12:
            case 13:
                g2 = au0.g(bArr, i2, bu0);
                j2 = bu0.b;
                valueOf = Long.valueOf(j2);
                bu0.c = valueOf;
                return g2;
            case 14:
                return m(dx0.a().b(cls), bArr, i2, i3, bu0);
            case 15:
                g2 = au0.e(bArr, i2, bu0);
                i4 = ou0.c(bu0.a);
                valueOf = Integer.valueOf(i4);
                bu0.c = valueOf;
                return g2;
            case 16:
                g2 = au0.g(bArr, i2, bu0);
                j2 = ou0.a(bu0.b);
                valueOf = Long.valueOf(j2);
                bu0.c = valueOf;
                return g2;
            case 17:
                return au0.j(bArr, i2, bu0);
            default:
                throw new RuntimeException(C0201.m82(27002));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016b A[EDGE_INSN: B:74:0x016b->B:70:0x016b ?: BREAK  , SYNTHETIC] */
    public static <T> uw0<T> t(Class<T> cls, ow0 ow0, yw0 yw0, aw0 aw0, ay0<?, ?> ay0, xu0<?> xu0, lw0 lw0) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int h2;
        int[] iArr = null;
        if (ow0 instanceof fx0) {
            fx0 fx0 = (fx0) ow0;
            boolean z = fx0.o() == kv0.e.j;
            if (fx0.a() == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 0;
            } else {
                int c2 = fx0.c();
                int d2 = fx0.d();
                i4 = fx0.h();
                i3 = c2;
                i2 = d2;
            }
            int[] iArr2 = new int[(i4 << 2)];
            Object[] objArr = new Object[(i4 << 1)];
            int[] iArr3 = fx0.e() > 0 ? new int[fx0.e()] : null;
            if (fx0.f() > 0) {
                iArr = new int[fx0.f()];
            }
            gx0 b2 = fx0.b();
            if (b2.a()) {
                int g2 = b2.g();
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (g2 >= fx0.i() || i8 >= ((g2 - i3) << 2)) {
                        if (b2.k()) {
                            i7 = (int) hy0.b(b2.l());
                            i6 = (int) hy0.b(b2.m());
                        } else {
                            i7 = (int) hy0.b(b2.n());
                            if (b2.o()) {
                                i6 = (int) hy0.b(b2.p());
                                i5 = b2.q();
                                iArr2[i8] = b2.g();
                                int i11 = i8 + 1;
                                iArr2[i11] = (!b2.s() ? 536870912 : 0) | (!b2.r() ? 268435456 : 0) | (b2.h() << 20) | i7;
                                iArr2[i8 + 2] = i6 | (i5 << 20);
                                if (b2.v() == null) {
                                    int i12 = (i8 / 4) << 1;
                                    objArr[i12] = b2.v();
                                    if (b2.t() != null) {
                                        objArr[i12 + 1] = b2.t();
                                    } else if (b2.u() != null) {
                                        objArr[i12 + 1] = b2.u();
                                    }
                                } else if (b2.t() != null) {
                                    objArr[((i8 / 4) << 1) + 1] = b2.t();
                                } else if (b2.u() != null) {
                                    objArr[((i8 / 4) << 1) + 1] = b2.u();
                                }
                                h2 = b2.h();
                                if (h2 != fv0.MAP.ordinal()) {
                                    iArr3[i9] = i8;
                                    i9++;
                                } else if (h2 >= 18 && h2 <= 49) {
                                    iArr[i10] = iArr2[i11] & 1048575;
                                    i10++;
                                }
                                if (b2.a()) {
                                    break;
                                }
                                g2 = b2.g();
                            } else {
                                i6 = 0;
                            }
                        }
                        i5 = 0;
                        iArr2[i8] = b2.g();
                        int i112 = i8 + 1;
                        iArr2[i112] = (!b2.s() ? 536870912 : 0) | (!b2.r() ? 268435456 : 0) | (b2.h() << 20) | i7;
                        iArr2[i8 + 2] = i6 | (i5 << 20);
                        if (b2.v() == null) {
                        }
                        h2 = b2.h();
                        if (h2 != fv0.MAP.ordinal()) {
                        }
                        if (b2.a()) {
                        }
                    } else {
                        for (int i13 = 0; i13 < 4; i13++) {
                            iArr2[i8 + i13] = -1;
                        }
                    }
                    i8 += 4;
                }
            }
            return new uw0<>(iArr2, objArr, i3, i2, fx0.i(), fx0.n(), z, false, fx0.g(), iArr3, iArr, yw0, aw0, ay0, xu0, lw0);
        }
        ((vx0) ow0).o();
        throw null;
    }

    private final <K, V, UT, UB> UB u(int i2, int i3, Map<K, V> map, ov0<?> ov0, UB ub, ay0<UT, UB> ay0) {
        jw0<?, ?> g2 = this.q.g(E(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (ov0.a(next.getValue().intValue()) == null) {
                if (ub == null) {
                    ub = ay0.f();
                }
                ku0 l2 = fu0.l(iw0.a(g2, next.getKey(), next.getValue()));
                try {
                    iw0.b(l2.b(), g2, next.getKey(), next.getValue());
                    ay0.b(ub, i3, l2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private static void v(int i2, Object obj, vy0 vy0) throws IOException {
        if (obj instanceof String) {
            vy0.C(i2, (String) obj);
        } else {
            vy0.J(i2, (fu0) obj);
        }
    }

    private static <UT, UB> void w(ay0<UT, UB> ay0, T t, vy0 vy0) throws IOException {
        ay0.c(ay0.k(t), vy0);
    }

    private final <K, V> void x(vy0 vy0, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            vy0.O(i2, this.q.g(E(i3)), this.q.j(obj));
        }
    }

    private final void y(T t, T t2, int i2) {
        long G = (long) (G(i2) & 1048575);
        if (z(t2, i2)) {
            Object M = hy0.M(t, G);
            Object M2 = hy0.M(t2, G);
            if (M != null && M2 != null) {
                hy0.i(t, G, mv0.d(M, M2));
                J(t, i2);
            } else if (M2 != null) {
                hy0.i(t, G, M2);
                J(t, i2);
            }
        }
    }

    private final boolean z(T t, int i2) {
        if (this.h) {
            int G = G(i2);
            long j2 = (long) (G & 1048575);
            switch ((G & 267386880) >>> 20) {
                case 0:
                    return hy0.L(t, j2) != 0.0d;
                case 1:
                    return hy0.K(t, j2) != 0.0f;
                case 2:
                    return hy0.I(t, j2) != 0;
                case 3:
                    return hy0.I(t, j2) != 0;
                case 4:
                    return hy0.H(t, j2) != 0;
                case 5:
                    return hy0.I(t, j2) != 0;
                case 6:
                    return hy0.H(t, j2) != 0;
                case 7:
                    return hy0.J(t, j2);
                case 8:
                    Object M = hy0.M(t, j2);
                    if (M instanceof String) {
                        return !((String) M).isEmpty();
                    }
                    if (M instanceof fu0) {
                        return !fu0.b.equals(M);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return hy0.M(t, j2) != null;
                case 10:
                    return !fu0.b.equals(hy0.M(t, j2));
                case 11:
                    return hy0.H(t, j2) != 0;
                case 12:
                    return hy0.H(t, j2) != 0;
                case 13:
                    return hy0.H(t, j2) != 0;
                case 14:
                    return hy0.I(t, j2) != 0;
                case 15:
                    return hy0.H(t, j2) != 0;
                case 16:
                    return hy0.I(t, j2) != 0;
                case 17:
                    return hy0.M(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int H = H(i2);
            return (hy0.H(t, (long) (H & 1048575)) & (1 << (H >>> 20))) != 0;
        }
    }

    @Override // defpackage.ix0
    public final void a(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.a.length; i2 += 4) {
                int G = G(i2);
                long j2 = (long) (1048575 & G);
                int i3 = this.a[i2];
                switch ((G & 267386880) >>> 20) {
                    case 0:
                        if (z(t2, i2)) {
                            hy0.e(t, j2, hy0.L(t2, j2));
                            J(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (z(t2, i2)) {
                            hy0.f(t, j2, hy0.K(t2, j2));
                            J(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.h(t, j2, hy0.I(t2, j2));
                        J(t, i2);
                        break;
                    case 3:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.h(t, j2, hy0.I(t2, j2));
                        J(t, i2);
                        break;
                    case 4:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.g(t, j2, hy0.H(t2, j2));
                        J(t, i2);
                        break;
                    case 5:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.h(t, j2, hy0.I(t2, j2));
                        J(t, i2);
                        break;
                    case 6:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.g(t, j2, hy0.H(t2, j2));
                        J(t, i2);
                        break;
                    case 7:
                        if (z(t2, i2)) {
                            hy0.j(t, j2, hy0.J(t2, j2));
                            J(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.i(t, j2, hy0.M(t2, j2));
                        J(t, i2);
                        break;
                    case 9:
                    case 17:
                        y(t, t2, i2);
                        break;
                    case 10:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.i(t, j2, hy0.M(t2, j2));
                        J(t, i2);
                        break;
                    case 11:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.g(t, j2, hy0.H(t2, j2));
                        J(t, i2);
                        break;
                    case 12:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.g(t, j2, hy0.H(t2, j2));
                        J(t, i2);
                        break;
                    case 13:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.g(t, j2, hy0.H(t2, j2));
                        J(t, i2);
                        break;
                    case 14:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.h(t, j2, hy0.I(t2, j2));
                        J(t, i2);
                        break;
                    case 15:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.g(t, j2, hy0.H(t2, j2));
                        J(t, i2);
                        break;
                    case 16:
                        if (!z(t2, i2)) {
                            break;
                        }
                        hy0.h(t, j2, hy0.I(t2, j2));
                        J(t, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.n.b(t, t2, j2);
                        break;
                    case 50:
                        kx0.h(this.q, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!A(t2, i3, i2)) {
                            break;
                        }
                        hy0.i(t, j2, hy0.M(t2, j2));
                        K(t, i3, i2);
                        break;
                    case 60:
                    case 68:
                        M(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!A(t2, i3, i2)) {
                            break;
                        }
                        hy0.i(t, j2, hy0.M(t2, j2));
                        K(t, i3, i2);
                        break;
                }
            }
            if (!this.h) {
                kx0.i(this.o, t, t2);
                if (this.g) {
                    kx0.g(this.p, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r20, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (defpackage.ru0.B0(r3) + defpackage.ru0.D0(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof defpackage.fu0) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = defpackage.ru0.B(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0414, code lost:
        if (A(r20, r15, r5) != false) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0434, code lost:
        if (A(r20, r15, r5) != false) goto L_0x06e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x043c, code lost:
        if (A(r20, r15, r5) != false) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x045c, code lost:
        if (A(r20, r15, r5) != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0464, code lost:
        if (A(r20, r15, r5) != false) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0474, code lost:
        if ((r4 instanceof defpackage.fu0) != false) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x047c, code lost:
        if (A(r20, r15, r5) != false) goto L_0x0749;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0514, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0526, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0538, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x054a, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x055c, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x056e, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0580, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0592, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05a3, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05b4, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05c5, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05d6, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05e7, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05f8, code lost:
        if (r19.i != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05fa, code lost:
        r2.putInt(r20, (long) r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05fe, code lost:
        r9 = (defpackage.ru0.B0(r15) + defpackage.ru0.D0(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06b4, code lost:
        if ((r12 & r18) != 0) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06b6, code lost:
        r4 = defpackage.ru0.O(r15, (defpackage.qw0) r2.getObject(r20, r10), D(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06e1, code lost:
        if ((r12 & r18) != 0) goto L_0x06e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06e3, code lost:
        r4 = defpackage.ru0.o0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06ec, code lost:
        if ((r12 & r18) != 0) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06ee, code lost:
        r9 = defpackage.ru0.v0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0711, code lost:
        if ((r12 & r18) != 0) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0713, code lost:
        r4 = r2.getObject(r20, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0717, code lost:
        r4 = defpackage.ru0.M(r15, (defpackage.fu0) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0720, code lost:
        if ((r12 & r18) != 0) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0722, code lost:
        r4 = defpackage.kx0.n(r15, r2.getObject(r20, r10), D(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x073a, code lost:
        if ((r4 instanceof defpackage.fu0) != false) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof defpackage.fu0) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x073d, code lost:
        r4 = defpackage.ru0.B(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0747, code lost:
        if ((r12 & r18) != 0) goto L_0x0749;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0749, code lost:
        r4 = defpackage.ru0.P(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    @Override // defpackage.ix0
    public final int b(T t) {
        int i2;
        int i3;
        long j2;
        int i4;
        int P;
        Object obj;
        int i5;
        int i6;
        int i7;
        int i8;
        long j3;
        int i9;
        int x;
        long j4;
        long j5;
        int i10;
        Object obj2;
        int i11;
        int i12;
        int i13;
        long j6;
        int i14;
        int i15 = 267386880;
        if (this.h) {
            Unsafe unsafe = r;
            int i16 = 0;
            int i17 = 0;
            while (i16 < this.a.length) {
                int G = G(i16);
                int i18 = (G & i15) >>> 20;
                int i19 = this.a[i16];
                long j7 = (long) (G & 1048575);
                int i20 = (i18 < fv0.DOUBLE_LIST_PACKED.b() || i18 > fv0.SINT64_LIST_PACKED.b()) ? 0 : this.a[i16 + 2] & 1048575;
                switch (i18) {
                    case 0:
                        if (!z(t, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.x(i19, 0.0d);
                        break;
                    case 1:
                        if (!z(t, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.y(i19, 0.0f);
                        break;
                    case 2:
                        if (z(t, i16)) {
                            j4 = hy0.I(t, j7);
                            x = ru0.V(i19, j4);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 3:
                        if (z(t, i16)) {
                            j5 = hy0.I(t, j7);
                            x = ru0.d0(i19, j5);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 4:
                        if (z(t, i16)) {
                            i10 = hy0.H(t, j7);
                            x = ru0.j0(i19, i10);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 5:
                        if (!z(t, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.k0(i19, 0);
                        break;
                    case 6:
                        if (!z(t, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.t0(i19, 0);
                        break;
                    case 7:
                        if (!z(t, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.P(i19, true);
                        break;
                    case 8:
                        if (z(t, i16)) {
                            obj2 = hy0.M(t, j7);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 9:
                        if (!z(t, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = kx0.n(i19, hy0.M(t, j7), D(i16));
                        break;
                    case 10:
                        if (!z(t, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        obj2 = hy0.M(t, j7);
                        x = ru0.M(i19, (fu0) obj2);
                        break;
                    case 11:
                        if (z(t, i16)) {
                            i11 = hy0.H(t, j7);
                            x = ru0.n0(i19, i11);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 12:
                        if (z(t, i16)) {
                            i12 = hy0.H(t, j7);
                            x = ru0.w0(i19, i12);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 13:
                        if (!z(t, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.v0(i19, 0);
                        break;
                    case 14:
                        if (!z(t, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.o0(i19, 0);
                        break;
                    case 15:
                        if (z(t, i16)) {
                            i13 = hy0.H(t, j7);
                            x = ru0.r0(i19, i13);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 16:
                        if (z(t, i16)) {
                            j6 = hy0.I(t, j7);
                            x = ru0.g0(i19, j6);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 17:
                        if (!z(t, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.O(i19, (qw0) hy0.M(t, j7), D(i16));
                        break;
                    case 18:
                    case 23:
                    case 32:
                        x = kx0.d0(i19, O(t, j7), false);
                        break;
                    case 19:
                    case 24:
                    case 31:
                        x = kx0.c0(i19, O(t, j7), false);
                        break;
                    case 20:
                        x = kx0.V(i19, O(t, j7), false);
                        break;
                    case 21:
                        x = kx0.W(i19, O(t, j7), false);
                        break;
                    case 22:
                        x = kx0.Z(i19, O(t, j7), false);
                        break;
                    case 25:
                        x = kx0.e0(i19, O(t, j7), false);
                        break;
                    case 26:
                        x = kx0.o(i19, O(t, j7));
                        break;
                    case 27:
                        x = kx0.p(i19, O(t, j7), D(i16));
                        break;
                    case 28:
                        x = kx0.t(i19, O(t, j7));
                        break;
                    case 29:
                        x = kx0.a0(i19, O(t, j7), false);
                        break;
                    case 30:
                        x = kx0.Y(i19, O(t, j7), false);
                        break;
                    case 33:
                        x = kx0.b0(i19, O(t, j7), false);
                        break;
                    case 34:
                        x = kx0.X(i19, O(t, j7), false);
                        break;
                    case 35:
                        i14 = kx0.N((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 36:
                        i14 = kx0.L((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 37:
                        i14 = kx0.a((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 38:
                        i14 = kx0.j((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 39:
                        i14 = kx0.E((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 40:
                        i14 = kx0.N((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 41:
                        i14 = kx0.L((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 42:
                        i14 = kx0.P((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 43:
                        i14 = kx0.G((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 44:
                        i14 = kx0.v((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 45:
                        i14 = kx0.L((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 46:
                        i14 = kx0.N((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 47:
                        i14 = kx0.J((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 48:
                        i14 = kx0.q((List) unsafe.getObject(t, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 49:
                        x = kx0.u(i19, O(t, j7), D(i16));
                        break;
                    case 50:
                        x = this.q.d(i19, hy0.M(t, j7), E(i16));
                        break;
                    case 51:
                        if (!A(t, i19, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.x(i19, 0.0d);
                        break;
                    case 52:
                        if (!A(t, i19, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.y(i19, 0.0f);
                        break;
                    case 53:
                        if (A(t, i19, i16)) {
                            j4 = S(t, j7);
                            x = ru0.V(i19, j4);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 54:
                        if (A(t, i19, i16)) {
                            j5 = S(t, j7);
                            x = ru0.d0(i19, j5);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 55:
                        if (A(t, i19, i16)) {
                            i10 = R(t, j7);
                            x = ru0.j0(i19, i10);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 56:
                        if (!A(t, i19, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.k0(i19, 0);
                        break;
                    case 57:
                        if (!A(t, i19, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.t0(i19, 0);
                        break;
                    case 58:
                        if (!A(t, i19, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.P(i19, true);
                        break;
                    case 59:
                        if (A(t, i19, i16)) {
                            obj2 = hy0.M(t, j7);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 60:
                        if (!A(t, i19, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = kx0.n(i19, hy0.M(t, j7), D(i16));
                        break;
                    case 61:
                        if (!A(t, i19, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        obj2 = hy0.M(t, j7);
                        x = ru0.M(i19, (fu0) obj2);
                        break;
                    case 62:
                        if (A(t, i19, i16)) {
                            i11 = R(t, j7);
                            x = ru0.n0(i19, i11);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 63:
                        if (A(t, i19, i16)) {
                            i12 = R(t, j7);
                            x = ru0.w0(i19, i12);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 64:
                        if (!A(t, i19, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.v0(i19, 0);
                        break;
                    case 65:
                        if (!A(t, i19, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.o0(i19, 0);
                        break;
                    case 66:
                        if (A(t, i19, i16)) {
                            i13 = R(t, j7);
                            x = ru0.r0(i19, i13);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 67:
                        if (A(t, i19, i16)) {
                            j6 = S(t, j7);
                            x = ru0.g0(i19, j6);
                            break;
                        } else {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                    case 68:
                        if (!A(t, i19, i16)) {
                            continue;
                            i16 += 4;
                            i15 = 267386880;
                        }
                        x = ru0.O(i19, (qw0) hy0.M(t, j7), D(i16));
                        break;
                    default:
                        i16 += 4;
                        i15 = 267386880;
                }
                i17 += x;
                i16 += 4;
                i15 = 267386880;
            }
            return i17 + n(this.o, t);
        }
        Unsafe unsafe2 = r;
        int i21 = -1;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < this.a.length) {
            int G2 = G(i22);
            int[] iArr = this.a;
            int i25 = iArr[i22];
            int i26 = (G2 & 267386880) >>> 20;
            if (i26 <= 17) {
                int i27 = iArr[i22 + 2];
                int i28 = i27 & 1048575;
                i2 = 1 << (i27 >>> 20);
                if (i28 != i21) {
                    i24 = unsafe2.getInt(t, (long) i28);
                    i21 = i28;
                }
                i3 = i27;
            } else {
                i3 = (!this.i || i26 < fv0.DOUBLE_LIST_PACKED.b() || i26 > fv0.SINT64_LIST_PACKED.b()) ? 0 : this.a[i22 + 2] & 1048575;
                i2 = 0;
            }
            long j8 = (long) (G2 & 1048575);
            switch (i26) {
                case 0:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i23 += ru0.x(i25, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i23 += ru0.y(i25, 0.0f);
                        break;
                    }
                case 2:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = ru0.V(i25, unsafe2.getLong(t, j8));
                        i23 += i4;
                    }
                    break;
                case 3:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = ru0.d0(i25, unsafe2.getLong(t, j8));
                        i23 += i4;
                    }
                    break;
                case 4:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = ru0.j0(i25, unsafe2.getInt(t, j8));
                        i23 += i4;
                    }
                    break;
                case 5:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = ru0.k0(i25, 0);
                        i23 += i4;
                    }
                    break;
                case 6:
                    if ((i24 & i2) != 0) {
                        i23 += ru0.t0(i25, 0);
                        j2 = 0;
                        break;
                    }
                    j2 = 0;
                case 7:
                    break;
                case 8:
                    if ((i24 & i2) != 0) {
                        obj = unsafe2.getObject(t, j8);
                        break;
                    }
                    j2 = 0;
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    if ((i24 & i2) != 0) {
                        i5 = unsafe2.getInt(t, j8);
                        P = ru0.n0(i25, i5);
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 12:
                    if ((i24 & i2) != 0) {
                        i6 = unsafe2.getInt(t, j8);
                        P = ru0.w0(i25, i6);
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if ((i24 & i2) != 0) {
                        i8 = unsafe2.getInt(t, j8);
                        P = ru0.r0(i25, i8);
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 16:
                    if ((i24 & i2) != 0) {
                        j3 = unsafe2.getLong(t, j8);
                        P = ru0.g0(i25, j3);
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 17:
                    break;
                case 18:
                case 23:
                case 32:
                    P = kx0.d0(i25, (List) unsafe2.getObject(t, j8), false);
                    i23 += P;
                    j2 = 0;
                    break;
                case 19:
                case 24:
                case 31:
                    P = kx0.c0(i25, (List) unsafe2.getObject(t, j8), false);
                    i23 += P;
                    j2 = 0;
                    break;
                case 20:
                    P = kx0.V(i25, (List) unsafe2.getObject(t, j8), false);
                    i23 += P;
                    j2 = 0;
                    break;
                case 21:
                    P = kx0.W(i25, (List) unsafe2.getObject(t, j8), false);
                    i23 += P;
                    j2 = 0;
                    break;
                case 22:
                    P = kx0.Z(i25, (List) unsafe2.getObject(t, j8), false);
                    i23 += P;
                    j2 = 0;
                    break;
                case 25:
                    P = kx0.e0(i25, (List) unsafe2.getObject(t, j8), false);
                    i23 += P;
                    j2 = 0;
                    break;
                case 26:
                    P = kx0.o(i25, (List) unsafe2.getObject(t, j8));
                    i23 += P;
                    j2 = 0;
                    break;
                case 27:
                    P = kx0.p(i25, (List) unsafe2.getObject(t, j8), D(i22));
                    i23 += P;
                    j2 = 0;
                    break;
                case 28:
                    P = kx0.t(i25, (List) unsafe2.getObject(t, j8));
                    i23 += P;
                    j2 = 0;
                    break;
                case 29:
                    P = kx0.a0(i25, (List) unsafe2.getObject(t, j8), false);
                    i23 += P;
                    j2 = 0;
                    break;
                case 30:
                    P = kx0.Y(i25, (List) unsafe2.getObject(t, j8), false);
                    i23 += P;
                    j2 = 0;
                    break;
                case 33:
                    P = kx0.b0(i25, (List) unsafe2.getObject(t, j8), false);
                    i23 += P;
                    j2 = 0;
                    break;
                case 34:
                    P = kx0.X(i25, (List) unsafe2.getObject(t, j8), false);
                    i23 += P;
                    j2 = 0;
                    break;
                case 35:
                    i9 = kx0.N((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 36:
                    i9 = kx0.L((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 37:
                    i9 = kx0.a((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 38:
                    i9 = kx0.j((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 39:
                    i9 = kx0.E((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 40:
                    i9 = kx0.N((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 41:
                    i9 = kx0.L((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 42:
                    i9 = kx0.P((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 43:
                    i9 = kx0.G((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 44:
                    i9 = kx0.v((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 45:
                    i9 = kx0.L((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 46:
                    i9 = kx0.N((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 47:
                    i9 = kx0.J((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 48:
                    i9 = kx0.q((List) unsafe2.getObject(t, j8));
                    if (i9 > 0) {
                        break;
                    }
                    j2 = 0;
                    break;
                case 49:
                    P = kx0.u(i25, (List) unsafe2.getObject(t, j8), D(i22));
                    i23 += P;
                    j2 = 0;
                    break;
                case 50:
                    P = this.q.d(i25, unsafe2.getObject(t, j8), E(i22));
                    i23 += P;
                    j2 = 0;
                    break;
                case 51:
                    if (A(t, i25, i22)) {
                        P = ru0.x(i25, 0.0d);
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 52:
                    if (A(t, i25, i22)) {
                        i7 = ru0.y(i25, 0.0f);
                        i23 += i7;
                    }
                    j2 = 0;
                    break;
                case 53:
                    if (A(t, i25, i22)) {
                        P = ru0.V(i25, S(t, j8));
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 54:
                    if (A(t, i25, i22)) {
                        P = ru0.d0(i25, S(t, j8));
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 55:
                    if (A(t, i25, i22)) {
                        P = ru0.j0(i25, R(t, j8));
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 56:
                    if (A(t, i25, i22)) {
                        P = ru0.k0(i25, 0);
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 57:
                    if (A(t, i25, i22)) {
                        i7 = ru0.t0(i25, 0);
                        i23 += i7;
                    }
                    j2 = 0;
                    break;
                case 58:
                    break;
                case 59:
                    if (A(t, i25, i22)) {
                        obj = unsafe2.getObject(t, j8);
                        break;
                    }
                    j2 = 0;
                    break;
                case 60:
                    break;
                case 61:
                    break;
                case 62:
                    if (A(t, i25, i22)) {
                        i5 = R(t, j8);
                        P = ru0.n0(i25, i5);
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 63:
                    if (A(t, i25, i22)) {
                        i6 = R(t, j8);
                        P = ru0.w0(i25, i6);
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 64:
                    break;
                case 65:
                    break;
                case 66:
                    if (A(t, i25, i22)) {
                        i8 = R(t, j8);
                        P = ru0.r0(i25, i8);
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 67:
                    if (A(t, i25, i22)) {
                        j3 = S(t, j8);
                        P = ru0.g0(i25, j3);
                        i23 += P;
                    }
                    j2 = 0;
                    break;
                case 68:
                    break;
                default:
                    j2 = 0;
                    break;
            }
            i22 += 4;
        }
        int n2 = i23 + n(this.o, t);
        return this.g ? n2 + this.p.b(t).m() : n2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (defpackage.kx0.y(defpackage.hy0.M(r10, r6), defpackage.hy0.M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (defpackage.hy0.I(r10, r6) == defpackage.hy0.I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (defpackage.hy0.H(r10, r6) == defpackage.hy0.H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (defpackage.hy0.I(r10, r6) == defpackage.hy0.I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (defpackage.hy0.H(r10, r6) == defpackage.hy0.H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (defpackage.hy0.H(r10, r6) == defpackage.hy0.H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (defpackage.hy0.H(r10, r6) == defpackage.hy0.H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (defpackage.kx0.y(defpackage.hy0.M(r10, r6), defpackage.hy0.M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (defpackage.kx0.y(defpackage.hy0.M(r10, r6), defpackage.hy0.M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (defpackage.kx0.y(defpackage.hy0.M(r10, r6), defpackage.hy0.M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (defpackage.hy0.J(r10, r6) == defpackage.hy0.J(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (defpackage.hy0.H(r10, r6) == defpackage.hy0.H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (defpackage.hy0.I(r10, r6) == defpackage.hy0.I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (defpackage.hy0.H(r10, r6) == defpackage.hy0.H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (defpackage.hy0.I(r10, r6) == defpackage.hy0.I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (defpackage.hy0.I(r10, r6) == defpackage.hy0.I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (defpackage.hy0.H(r10, r6) == defpackage.hy0.H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a0, code lost:
        if (defpackage.hy0.I(r10, r6) == defpackage.hy0.I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (defpackage.kx0.y(defpackage.hy0.M(r10, r6), defpackage.hy0.M(r11, r6)) != false) goto L_0x01a3;
     */
    @Override // defpackage.ix0
    public final boolean d(T t, T t2) {
        int length = this.a.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < length) {
                int G = G(i2);
                long j2 = (long) (G & 1048575);
                switch ((G & 267386880) >>> 20) {
                    case 0:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (N(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                        z = kx0.y(hy0.M(t, j2), hy0.M(t2, j2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long H = (long) (H(i2) & 1048575);
                        if (hy0.H(t, H) == hy0.H(t2, H)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i2 += 4;
            } else if (!this.o.k(t).equals(this.o.k(t2))) {
                return false;
            } else {
                if (this.g) {
                    return this.p.b(t).equals(this.p.b(t2));
                }
                return true;
            }
        }
    }

    @Override // defpackage.ix0
    public final T e() {
        return (T) this.m.a(this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [ix0] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27, types: [ix0] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0109 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.ix0
    public final boolean f(T t) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int[] iArr = this.j;
        if (!(iArr == null || iArr.length == 0)) {
            int i4 = -1;
            int length = iArr.length;
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6 = i2 + 1) {
                int i7 = iArr[i6];
                int I = I(i7);
                int G = G(I);
                if (!this.h) {
                    int i8 = this.a[I + 2];
                    int i9 = i8 & 1048575;
                    i3 = 1 << (i8 >>> 20);
                    if (i9 != i4) {
                        i2 = i6;
                        i5 = r.getInt(t, (long) i9);
                        i4 = i9;
                    } else {
                        i2 = i6;
                    }
                } else {
                    i2 = i6;
                    i3 = 0;
                }
                if (((268435456 & G) != 0) && !B(t, I, i5, i3)) {
                    return false;
                }
                int i10 = (267386880 & G) >>> 20;
                if (i10 != 9 && i10 != 17) {
                    if (i10 != 27) {
                        if (i10 == 60 || i10 == 68) {
                            if (A(t, i7, I) && !C(t, G, D(I))) {
                                return false;
                            }
                        } else if (i10 != 49) {
                            if (i10 != 50) {
                                continue;
                            } else {
                                Map<?, ?> j2 = this.q.j(hy0.M(t, (long) (G & 1048575)));
                                if (!j2.isEmpty()) {
                                    if (this.q.g(E(I)).c.b() == uy0.MESSAGE) {
                                        ix0<T> ix0 = 0;
                                        Iterator<?> it = j2.values().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (ix0 == null) {
                                                ix0 = dx0.a().b(next.getClass());
                                            }
                                            boolean f2 = ix0.f(next);
                                            ix0 = ix0;
                                            if (!f2) {
                                                z2 = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                                if (!z2) {
                                    return false;
                                }
                            }
                        }
                    }
                    List list = (List) hy0.M(t, (long) (G & 1048575));
                    if (!list.isEmpty()) {
                        ?? D = D(I);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= list.size()) {
                                break;
                            } else if (!D.f(list.get(i11))) {
                                z = false;
                                break;
                            } else {
                                i11++;
                            }
                        }
                        if (z) {
                            return false;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                } else if (B(t, I, i5, i3) && !C(t, G, D(I))) {
                    return false;
                }
            }
            return !this.g || this.p.b(t).d();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // defpackage.ix0
    public final int g(T t) {
        int i2;
        int i3;
        long j2;
        double d2;
        float f2;
        boolean z;
        Object obj;
        Object obj2;
        int length = this.a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 4) {
            int G = G(i5);
            int i6 = this.a[i5];
            long j3 = (long) (1048575 & G);
            int i7 = 37;
            switch ((G & 267386880) >>> 20) {
                case 0:
                    i3 = i4 * 53;
                    d2 = hy0.L(t, j3);
                    j2 = Double.doubleToLongBits(d2);
                    i2 = mv0.j(j2);
                    i4 = i3 + i2;
                    break;
                case 1:
                    i3 = i4 * 53;
                    f2 = hy0.K(t, j3);
                    i2 = Float.floatToIntBits(f2);
                    i4 = i3 + i2;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i3 = i4 * 53;
                    j2 = hy0.I(t, j3);
                    i2 = mv0.j(j2);
                    i4 = i3 + i2;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i3 = i4 * 53;
                    i2 = hy0.H(t, j3);
                    i4 = i3 + i2;
                    break;
                case 7:
                    i3 = i4 * 53;
                    z = hy0.J(t, j3);
                    i2 = mv0.f(z);
                    i4 = i3 + i2;
                    break;
                case 8:
                    i3 = i4 * 53;
                    i2 = ((String) hy0.M(t, j3)).hashCode();
                    i4 = i3 + i2;
                    break;
                case 9:
                    obj = hy0.M(t, j3);
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i3 = i4 * 53;
                    obj2 = hy0.M(t, j3);
                    i2 = obj2.hashCode();
                    i4 = i3 + i2;
                    break;
                case 17:
                    obj = hy0.M(t, j3);
                    break;
                case 51:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        d2 = P(t, j3);
                        j2 = Double.doubleToLongBits(d2);
                        i2 = mv0.j(j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        f2 = Q(t, j3);
                        i2 = Float.floatToIntBits(f2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    j2 = S(t, j3);
                    i2 = mv0.j(j2);
                    i4 = i3 + i2;
                    break;
                case 54:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    j2 = S(t, j3);
                    i2 = mv0.j(j2);
                    i4 = i3 + i2;
                    break;
                case 55:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = R(t, j3);
                    i4 = i3 + i2;
                    break;
                case 56:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    j2 = S(t, j3);
                    i2 = mv0.j(j2);
                    i4 = i3 + i2;
                    break;
                case 57:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = R(t, j3);
                    i4 = i3 + i2;
                    break;
                case 58:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        z = T(t, j3);
                        i2 = mv0.f(z);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = ((String) hy0.M(t, j3)).hashCode();
                    i4 = i3 + i2;
                    break;
                case 60:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    obj2 = hy0.M(t, j3);
                    i3 = i4 * 53;
                    i2 = obj2.hashCode();
                    i4 = i3 + i2;
                    break;
                case 61:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    obj2 = hy0.M(t, j3);
                    i2 = obj2.hashCode();
                    i4 = i3 + i2;
                    break;
                case 62:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = R(t, j3);
                    i4 = i3 + i2;
                    break;
                case 63:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = R(t, j3);
                    i4 = i3 + i2;
                    break;
                case 64:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = R(t, j3);
                    i4 = i3 + i2;
                    break;
                case 65:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    j2 = S(t, j3);
                    i2 = mv0.j(j2);
                    i4 = i3 + i2;
                    break;
                case 66:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = R(t, j3);
                    i4 = i3 + i2;
                    break;
                case 67:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    j2 = S(t, j3);
                    i2 = mv0.j(j2);
                    i4 = i3 + i2;
                    break;
                case 68:
                    if (!A(t, i6, i5)) {
                        break;
                    }
                    obj2 = hy0.M(t, j3);
                    i3 = i4 * 53;
                    i2 = obj2.hashCode();
                    i4 = i3 + i2;
                    break;
            }
        }
        int hashCode = (i4 * 53) + this.o.k(t).hashCode();
        return this.g ? (hashCode * 53) + this.p.b(t).hashCode() : hashCode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0976  */
    @Override // defpackage.ix0
    public final void h(T t, vy0 vy0) throws IOException {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i2;
        double d2;
        float f2;
        long j2;
        long j3;
        int i3;
        long j4;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        long j5;
        int i8;
        long j6;
        Map.Entry<?, Object> entry2;
        Iterator<Map.Entry<?, Object>> it2;
        int length2;
        double d3;
        float f3;
        long j7;
        long j8;
        int i9;
        long j9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        long j10;
        int i14;
        long j11;
        if (vy0.N() == kv0.e.l) {
            w(this.o, t, vy0);
            if (this.g) {
                bv0<?> b2 = this.p.b(t);
                if (!b2.b()) {
                    it2 = b2.a();
                    entry2 = it2.next();
                    for (length2 = this.a.length - 4; length2 >= 0; length2 -= 4) {
                        int G = G(length2);
                        int i15 = this.a[length2];
                        while (entry2 != null && this.p.a(entry2) > i15) {
                            this.p.c(vy0, entry2);
                            entry2 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((G & 267386880) >>> 20) {
                            case 0:
                                if (z(t, length2)) {
                                    d3 = hy0.L(t, (long) (G & 1048575));
                                    vy0.p(i15, d3);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (z(t, length2)) {
                                    f3 = hy0.K(t, (long) (G & 1048575));
                                    vy0.q(i15, f3);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (z(t, length2)) {
                                    j7 = hy0.I(t, (long) (G & 1048575));
                                    vy0.l(i15, j7);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (z(t, length2)) {
                                    j8 = hy0.I(t, (long) (G & 1048575));
                                    vy0.o(i15, j8);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (z(t, length2)) {
                                    i9 = hy0.H(t, (long) (G & 1048575));
                                    vy0.B(i15, i9);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (z(t, length2)) {
                                    j9 = hy0.I(t, (long) (G & 1048575));
                                    vy0.g(i15, j9);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (z(t, length2)) {
                                    i10 = hy0.H(t, (long) (G & 1048575));
                                    vy0.s(i15, i10);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (z(t, length2)) {
                                    z2 = hy0.J(t, (long) (G & 1048575));
                                    vy0.f(i15, z2);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (!z(t, length2)) {
                                    break;
                                }
                                v(i15, hy0.M(t, (long) (G & 1048575)), vy0);
                                break;
                            case 9:
                                if (!z(t, length2)) {
                                    break;
                                }
                                vy0.K(i15, hy0.M(t, (long) (G & 1048575)), D(length2));
                                break;
                            case 10:
                                if (!z(t, length2)) {
                                    break;
                                }
                                vy0.J(i15, (fu0) hy0.M(t, (long) (G & 1048575)));
                                break;
                            case 11:
                                if (z(t, length2)) {
                                    i11 = hy0.H(t, (long) (G & 1048575));
                                    vy0.E(i15, i11);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (z(t, length2)) {
                                    i12 = hy0.H(t, (long) (G & 1048575));
                                    vy0.D(i15, i12);
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (z(t, length2)) {
                                    i13 = hy0.H(t, (long) (G & 1048575));
                                    vy0.F(i15, i13);
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (z(t, length2)) {
                                    j10 = hy0.I(t, (long) (G & 1048575));
                                    vy0.a(i15, j10);
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (z(t, length2)) {
                                    i14 = hy0.H(t, (long) (G & 1048575));
                                    vy0.z(i15, i14);
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (z(t, length2)) {
                                    j11 = hy0.I(t, (long) (G & 1048575));
                                    vy0.c(i15, j11);
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (!z(t, length2)) {
                                    break;
                                }
                                vy0.M(i15, hy0.M(t, (long) (G & 1048575)), D(length2));
                                break;
                            case 18:
                                kx0.f(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 19:
                                kx0.m(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 20:
                                kx0.r(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 21:
                                kx0.x(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 22:
                                kx0.M(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 23:
                                kx0.H(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 24:
                                kx0.R(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 25:
                                kx0.U(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 26:
                                kx0.d(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0);
                                break;
                            case 27:
                                kx0.e(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, D(length2));
                                break;
                            case 28:
                                kx0.k(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0);
                                break;
                            case 29:
                                kx0.O(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 30:
                                kx0.T(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 31:
                                kx0.S(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 32:
                                kx0.K(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 33:
                                kx0.Q(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 34:
                                kx0.F(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, false);
                                break;
                            case 35:
                                kx0.f(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 36:
                                kx0.m(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 37:
                                kx0.r(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 38:
                                kx0.x(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 39:
                                kx0.M(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 40:
                                kx0.H(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 41:
                                kx0.R(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 42:
                                kx0.U(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 43:
                                kx0.O(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 44:
                                kx0.T(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 45:
                                kx0.S(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 46:
                                kx0.K(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 47:
                                kx0.Q(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 48:
                                kx0.F(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, true);
                                break;
                            case 49:
                                kx0.l(this.a[length2], (List) hy0.M(t, (long) (G & 1048575)), vy0, D(length2));
                                break;
                            case 50:
                                x(vy0, i15, hy0.M(t, (long) (G & 1048575)), length2);
                                break;
                            case 51:
                                if (A(t, i15, length2)) {
                                    d3 = P(t, (long) (G & 1048575));
                                    vy0.p(i15, d3);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (A(t, i15, length2)) {
                                    f3 = Q(t, (long) (G & 1048575));
                                    vy0.q(i15, f3);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (A(t, i15, length2)) {
                                    j7 = S(t, (long) (G & 1048575));
                                    vy0.l(i15, j7);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (A(t, i15, length2)) {
                                    j8 = S(t, (long) (G & 1048575));
                                    vy0.o(i15, j8);
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (A(t, i15, length2)) {
                                    i9 = R(t, (long) (G & 1048575));
                                    vy0.B(i15, i9);
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (A(t, i15, length2)) {
                                    j9 = S(t, (long) (G & 1048575));
                                    vy0.g(i15, j9);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (A(t, i15, length2)) {
                                    i10 = R(t, (long) (G & 1048575));
                                    vy0.s(i15, i10);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (A(t, i15, length2)) {
                                    z2 = T(t, (long) (G & 1048575));
                                    vy0.f(i15, z2);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (!A(t, i15, length2)) {
                                    break;
                                }
                                v(i15, hy0.M(t, (long) (G & 1048575)), vy0);
                                break;
                            case 60:
                                if (!A(t, i15, length2)) {
                                    break;
                                }
                                vy0.K(i15, hy0.M(t, (long) (G & 1048575)), D(length2));
                                break;
                            case 61:
                                if (!A(t, i15, length2)) {
                                    break;
                                }
                                vy0.J(i15, (fu0) hy0.M(t, (long) (G & 1048575)));
                                break;
                            case 62:
                                if (A(t, i15, length2)) {
                                    i11 = R(t, (long) (G & 1048575));
                                    vy0.E(i15, i11);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (A(t, i15, length2)) {
                                    i12 = R(t, (long) (G & 1048575));
                                    vy0.D(i15, i12);
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (A(t, i15, length2)) {
                                    i13 = R(t, (long) (G & 1048575));
                                    vy0.F(i15, i13);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (A(t, i15, length2)) {
                                    j10 = S(t, (long) (G & 1048575));
                                    vy0.a(i15, j10);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (A(t, i15, length2)) {
                                    i14 = R(t, (long) (G & 1048575));
                                    vy0.z(i15, i14);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (A(t, i15, length2)) {
                                    j11 = S(t, (long) (G & 1048575));
                                    vy0.c(i15, j11);
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (!A(t, i15, length2)) {
                                    break;
                                }
                                vy0.M(i15, hy0.M(t, (long) (G & 1048575)), D(length2));
                                break;
                        }
                    }
                    while (entry2 != null) {
                        this.p.c(vy0, entry2);
                        entry2 = it2.hasNext() ? it2.next() : null;
                    }
                }
            }
            it2 = null;
            entry2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
        } else if (this.h) {
            if (this.g) {
                bv0<?> b3 = this.p.b(t);
                if (!b3.b()) {
                    it = b3.e();
                    entry = it.next();
                    length = this.a.length;
                    for (i2 = 0; i2 < length; i2 += 4) {
                        int G2 = G(i2);
                        int i16 = this.a[i2];
                        while (entry != null && this.p.a(entry) <= i16) {
                            this.p.c(vy0, entry);
                            entry = it.hasNext() ? it.next() : null;
                        }
                        switch ((G2 & 267386880) >>> 20) {
                            case 0:
                                if (z(t, i2)) {
                                    d2 = hy0.L(t, (long) (G2 & 1048575));
                                    vy0.p(i16, d2);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (z(t, i2)) {
                                    f2 = hy0.K(t, (long) (G2 & 1048575));
                                    vy0.q(i16, f2);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (z(t, i2)) {
                                    j2 = hy0.I(t, (long) (G2 & 1048575));
                                    vy0.l(i16, j2);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (z(t, i2)) {
                                    j3 = hy0.I(t, (long) (G2 & 1048575));
                                    vy0.o(i16, j3);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (z(t, i2)) {
                                    i3 = hy0.H(t, (long) (G2 & 1048575));
                                    vy0.B(i16, i3);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (z(t, i2)) {
                                    j4 = hy0.I(t, (long) (G2 & 1048575));
                                    vy0.g(i16, j4);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (z(t, i2)) {
                                    i4 = hy0.H(t, (long) (G2 & 1048575));
                                    vy0.s(i16, i4);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (z(t, i2)) {
                                    z = hy0.J(t, (long) (G2 & 1048575));
                                    vy0.f(i16, z);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (!z(t, i2)) {
                                    break;
                                }
                                v(i16, hy0.M(t, (long) (G2 & 1048575)), vy0);
                                break;
                            case 9:
                                if (!z(t, i2)) {
                                    break;
                                }
                                vy0.K(i16, hy0.M(t, (long) (G2 & 1048575)), D(i2));
                                break;
                            case 10:
                                if (!z(t, i2)) {
                                    break;
                                }
                                vy0.J(i16, (fu0) hy0.M(t, (long) (G2 & 1048575)));
                                break;
                            case 11:
                                if (z(t, i2)) {
                                    i5 = hy0.H(t, (long) (G2 & 1048575));
                                    vy0.E(i16, i5);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (z(t, i2)) {
                                    i6 = hy0.H(t, (long) (G2 & 1048575));
                                    vy0.D(i16, i6);
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (z(t, i2)) {
                                    i7 = hy0.H(t, (long) (G2 & 1048575));
                                    vy0.F(i16, i7);
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (z(t, i2)) {
                                    j5 = hy0.I(t, (long) (G2 & 1048575));
                                    vy0.a(i16, j5);
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (z(t, i2)) {
                                    i8 = hy0.H(t, (long) (G2 & 1048575));
                                    vy0.z(i16, i8);
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (z(t, i2)) {
                                    j6 = hy0.I(t, (long) (G2 & 1048575));
                                    vy0.c(i16, j6);
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (!z(t, i2)) {
                                    break;
                                }
                                vy0.M(i16, hy0.M(t, (long) (G2 & 1048575)), D(i2));
                                break;
                            case 18:
                                kx0.f(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 19:
                                kx0.m(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 20:
                                kx0.r(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 21:
                                kx0.x(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 22:
                                kx0.M(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 23:
                                kx0.H(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 24:
                                kx0.R(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 25:
                                kx0.U(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 26:
                                kx0.d(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0);
                                break;
                            case 27:
                                kx0.e(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, D(i2));
                                break;
                            case 28:
                                kx0.k(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0);
                                break;
                            case 29:
                                kx0.O(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 30:
                                kx0.T(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 31:
                                kx0.S(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 32:
                                kx0.K(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 33:
                                kx0.Q(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 34:
                                kx0.F(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, false);
                                break;
                            case 35:
                                kx0.f(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 36:
                                kx0.m(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 37:
                                kx0.r(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 38:
                                kx0.x(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 39:
                                kx0.M(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 40:
                                kx0.H(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 41:
                                kx0.R(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 42:
                                kx0.U(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 43:
                                kx0.O(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 44:
                                kx0.T(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 45:
                                kx0.S(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 46:
                                kx0.K(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 47:
                                kx0.Q(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 48:
                                kx0.F(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, true);
                                break;
                            case 49:
                                kx0.l(this.a[i2], (List) hy0.M(t, (long) (G2 & 1048575)), vy0, D(i2));
                                break;
                            case 50:
                                x(vy0, i16, hy0.M(t, (long) (G2 & 1048575)), i2);
                                break;
                            case 51:
                                if (A(t, i16, i2)) {
                                    d2 = P(t, (long) (G2 & 1048575));
                                    vy0.p(i16, d2);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (A(t, i16, i2)) {
                                    f2 = Q(t, (long) (G2 & 1048575));
                                    vy0.q(i16, f2);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (A(t, i16, i2)) {
                                    j2 = S(t, (long) (G2 & 1048575));
                                    vy0.l(i16, j2);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (A(t, i16, i2)) {
                                    j3 = S(t, (long) (G2 & 1048575));
                                    vy0.o(i16, j3);
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (A(t, i16, i2)) {
                                    i3 = R(t, (long) (G2 & 1048575));
                                    vy0.B(i16, i3);
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (A(t, i16, i2)) {
                                    j4 = S(t, (long) (G2 & 1048575));
                                    vy0.g(i16, j4);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (A(t, i16, i2)) {
                                    i4 = R(t, (long) (G2 & 1048575));
                                    vy0.s(i16, i4);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (A(t, i16, i2)) {
                                    z = T(t, (long) (G2 & 1048575));
                                    vy0.f(i16, z);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (!A(t, i16, i2)) {
                                    break;
                                }
                                v(i16, hy0.M(t, (long) (G2 & 1048575)), vy0);
                                break;
                            case 60:
                                if (!A(t, i16, i2)) {
                                    break;
                                }
                                vy0.K(i16, hy0.M(t, (long) (G2 & 1048575)), D(i2));
                                break;
                            case 61:
                                if (!A(t, i16, i2)) {
                                    break;
                                }
                                vy0.J(i16, (fu0) hy0.M(t, (long) (G2 & 1048575)));
                                break;
                            case 62:
                                if (A(t, i16, i2)) {
                                    i5 = R(t, (long) (G2 & 1048575));
                                    vy0.E(i16, i5);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (A(t, i16, i2)) {
                                    i6 = R(t, (long) (G2 & 1048575));
                                    vy0.D(i16, i6);
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (A(t, i16, i2)) {
                                    i7 = R(t, (long) (G2 & 1048575));
                                    vy0.F(i16, i7);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (A(t, i16, i2)) {
                                    j5 = S(t, (long) (G2 & 1048575));
                                    vy0.a(i16, j5);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (A(t, i16, i2)) {
                                    i8 = R(t, (long) (G2 & 1048575));
                                    vy0.z(i16, i8);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (A(t, i16, i2)) {
                                    j6 = S(t, (long) (G2 & 1048575));
                                    vy0.c(i16, j6);
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (!A(t, i16, i2)) {
                                    break;
                                }
                                vy0.M(i16, hy0.M(t, (long) (G2 & 1048575)), D(i2));
                                break;
                        }
                    }
                    while (entry != null) {
                        this.p.c(vy0, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    w(this.o, t, vy0);
                }
            }
            it = null;
            entry = null;
            length = this.a.length;
            while (i2 < length) {
            }
            while (entry != null) {
            }
            w(this.o, t, vy0);
        } else {
            L(t, vy0);
        }
    }

    @Override // defpackage.ix0
    public final void i(T t) {
        int[] iArr = this.k;
        if (iArr != null) {
            for (int i2 : iArr) {
                long G = (long) (G(i2) & 1048575);
                Object M = hy0.M(t, G);
                if (M != null) {
                    hy0.i(t, G, this.q.c(M));
                }
            }
        }
        int[] iArr2 = this.l;
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                this.n.a(t, (long) i3);
            }
        }
        this.o.d(t);
        if (this.g) {
            this.p.e(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = defpackage.au0.e(r12, r10, r11);
        r1 = r11.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (r0 == r10) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0188, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a1, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.ix0
    public final void j(T t, byte[] bArr, int i2, int i3, bu0 bu0) throws IOException {
        byte b2;
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        long j2;
        Object d2;
        uw0<T> uw0 = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i8 = i3;
        bu0 bu02 = bu0;
        if (uw0.h) {
            Unsafe unsafe2 = r;
            int i9 = i2;
            while (i9 < i8) {
                int i10 = i9 + 1;
                byte b3 = bArr2[i9];
                if (b3 < 0) {
                    i4 = au0.d(b3, bArr2, i10, bu02);
                    b2 = bu02.a;
                } else {
                    b2 = b3;
                    i4 = i10;
                }
                int i11 = b2 >>> 3;
                int i12 = b2 & 7;
                int I = uw0.I(i11);
                if (I >= 0) {
                    int i13 = uw0.a[I + 1];
                    int i14 = (267386880 & i13) >>> 20;
                    long j3 = (long) (1048575 & i13);
                    if (i14 <= 17) {
                        boolean z = true;
                        switch (i14) {
                            case 0:
                                if (i12 == 1) {
                                    hy0.e(t2, j3, au0.l(bArr2, i4));
                                    i9 = i4 + 8;
                                    break;
                                }
                                break;
                            case 1:
                                if (i12 == 5) {
                                    hy0.f(t2, j3, au0.n(bArr2, i4));
                                    i9 = i4 + 4;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                if (i12 == 0) {
                                    i7 = au0.g(bArr2, i4, bu02);
                                    j2 = bu02.b;
                                    unsafe2.putLong(t, j3, j2);
                                    i9 = i7;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                if (i12 == 1) {
                                    unsafe2.putLong(t, j3, au0.k(bArr2, i4));
                                    i9 = i4 + 8;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                if (i12 == 5) {
                                    unsafe2.putInt(t2, j3, au0.h(bArr2, i4));
                                    i9 = i4 + 4;
                                    break;
                                }
                                break;
                            case 7:
                                if (i12 == 0) {
                                    i9 = au0.g(bArr2, i4, bu02);
                                    if (bu02.b == 0) {
                                        z = false;
                                    }
                                    hy0.j(t2, j3, z);
                                    break;
                                }
                                break;
                            case 8:
                                if (i12 == 2) {
                                    i9 = (536870912 & i13) == 0 ? au0.i(bArr2, i4, bu02) : au0.j(bArr2, i4, bu02);
                                    d2 = bu02.c;
                                    unsafe2.putObject(t2, j3, d2);
                                    break;
                                }
                                break;
                            case 9:
                                if (i12 == 2) {
                                    i9 = m(uw0.D(I), bArr2, i4, i8, bu02);
                                    Object object = unsafe2.getObject(t2, j3);
                                    if (object != null) {
                                        d2 = mv0.d(object, bu02.c);
                                        unsafe2.putObject(t2, j3, d2);
                                        break;
                                    }
                                    d2 = bu02.c;
                                    unsafe2.putObject(t2, j3, d2);
                                }
                                break;
                            case 10:
                                if (i12 == 2) {
                                    i9 = au0.m(bArr2, i4, bu02);
                                    d2 = bu02.c;
                                    unsafe2.putObject(t2, j3, d2);
                                    break;
                                }
                                break;
                            case 15:
                                if (i12 == 0) {
                                    i9 = au0.e(bArr2, i4, bu02);
                                    int i15 = ou0.c(bu02.a);
                                    unsafe2.putInt(t2, j3, i15);
                                    break;
                                }
                                break;
                            case 16:
                                if (i12 == 0) {
                                    i7 = au0.g(bArr2, i4, bu02);
                                    j2 = ou0.a(bu02.b);
                                    unsafe2.putLong(t, j3, j2);
                                    i9 = i7;
                                    break;
                                }
                                break;
                        }
                    } else if (i14 != 27) {
                        if (i14 <= 49) {
                            unsafe = unsafe2;
                            i9 = p(t, bArr, i4, i3, b2, i11, i12, I, (long) i13, i14, j3, bu0);
                        } else {
                            unsafe = unsafe2;
                            i6 = i4;
                            if (i14 == 50) {
                                if (i12 == 2) {
                                    i9 = q(t, bArr, i6, i3, I, i11, j3, bu0);
                                }
                                i5 = i6;
                                i9 = c(b2, bArr, i5, i3, t, bu0);
                                uw0 = this;
                                t2 = t;
                                bArr2 = bArr;
                                i8 = i3;
                                bu02 = bu0;
                                unsafe2 = unsafe;
                            } else {
                                i9 = o(t, bArr, i6, i3, b2, i11, i12, i13, i14, j3, I, bu0);
                            }
                        }
                        i5 = i9;
                        i9 = c(b2, bArr, i5, i3, t, bu0);
                        uw0 = this;
                        t2 = t;
                        bArr2 = bArr;
                        i8 = i3;
                        bu02 = bu0;
                        unsafe2 = unsafe;
                    } else if (i12 == 2) {
                        pv0 pv0 = (pv0) unsafe2.getObject(t2, j3);
                        if (!pv0.E0()) {
                            int size = pv0.size();
                            pv0 = pv0.B0(size == 0 ? 10 : size << 1);
                            unsafe2.putObject(t2, j3, pv0);
                        }
                        i9 = k(uw0.D(I), b2, bArr, i4, i3, pv0, bu0);
                    }
                }
                unsafe = unsafe2;
                i6 = i4;
                i5 = i6;
                i9 = c(b2, bArr, i5, i3, t, bu0);
                uw0 = this;
                t2 = t;
                bArr2 = bArr;
                i8 = i3;
                bu02 = bu0;
                unsafe2 = unsafe;
            }
            if (i9 != i8) {
                throw qv0.d();
            }
            return;
        }
        r(t, bArr, i2, i3, 0, bu0);
    }
}
