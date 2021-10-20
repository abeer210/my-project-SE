package defpackage;

import defpackage.l91;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.cert.X509CRLSelector;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
import vigqyno.C0201;

/* renamed from: ab1  reason: default package */
public final class ab1<T> implements lb1<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = kc1.N();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final wa1 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final eb1 m;
    private final fa1 n;
    private final ec1<?, ?> o;
    private final a91<?> p;
    private final pa1 q;

    private ab1(int[] iArr, Object[] objArr, int i2, int i3, wa1 wa1, boolean z, boolean z2, int[] iArr2, int i4, int i5, eb1 eb1, fa1 fa1, ec1<?, ?> ec1, a91<?> a91, pa1 pa1) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.g = wa1 instanceof l91;
        this.h = z;
        this.f = a91 != null && a91.g(wa1);
        this.i = false;
        this.j = iArr2;
        this.k = i4;
        this.l = i5;
        this.m = eb1;
        this.n = fa1;
        this.o = ec1;
        this.p = a91;
        this.e = wa1;
        this.q = pa1;
    }

    private final boolean A(T t, int i2, int i3) {
        return kc1.x(t, (long) (M(i3) & 1048575)) == i2;
    }

    private final boolean B(T t, int i2, int i3, int i4) {
        if (this.h) {
            return z(t, i2);
        }
        return (i3 & i4) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: lb1 */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean C(Object obj, int i2, lb1 lb1) {
        return lb1.b(kc1.D(obj, (long) (i2 & 1048575)));
    }

    private final void D(T t, int i2) {
        if (!this.h) {
            int M = M(i2);
            long j2 = (long) (M & 1048575);
            kc1.n(t, j2, kc1.x(t, j2) | (1 << (M >>> 20)));
        }
    }

    private final void E(T t, int i2, int i3) {
        kc1.n(t, (long) (M(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    private final void F(T t, cd1 cd1) throws IOException {
        Map.Entry<?, Object> entry;
        int length;
        int i2;
        int i3;
        int i4;
        if (this.f) {
            b91<?> h2 = this.p.h(t);
            if (!h2.a.isEmpty()) {
                entry = h2.d().next();
                int i5 = -1;
                length = this.a.length;
                Unsafe unsafe = s;
                i2 = 0;
                int i6 = 0;
                while (i2 < length) {
                    int L = L(i2);
                    int[] iArr = this.a;
                    int i7 = iArr[i2];
                    int i8 = (267386880 & L) >>> 20;
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
                    if (entry == null) {
                        long j2 = (long) (L & 1048575);
                        switch (i8) {
                            case 0:
                                if ((i6 & i4) != 0) {
                                    cd1.p(i7, kc1.C(t, j2));
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 1:
                                if ((i6 & i4) != 0) {
                                    cd1.q(i7, kc1.B(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 2:
                                if ((i6 & i4) != 0) {
                                    cd1.l(i7, unsafe.getLong(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 3:
                                if ((i6 & i4) != 0) {
                                    cd1.o(i7, unsafe.getLong(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 4:
                                if ((i6 & i4) != 0) {
                                    cd1.B(i7, unsafe.getInt(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 5:
                                if ((i6 & i4) != 0) {
                                    cd1.g(i7, unsafe.getLong(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 6:
                                if ((i6 & i4) != 0) {
                                    cd1.s(i7, unsafe.getInt(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 7:
                                if ((i6 & i4) != 0) {
                                    cd1.f(i7, kc1.A(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 8:
                                if ((i6 & i4) != 0) {
                                    u(i7, unsafe.getObject(t, j2), cd1);
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 9:
                                if ((i6 & i4) != 0) {
                                    cd1.C(i7, unsafe.getObject(t, j2), H(i3));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 10:
                                if ((i6 & i4) != 0) {
                                    cd1.L(i7, (c81) unsafe.getObject(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 11:
                                if ((i6 & i4) != 0) {
                                    cd1.E(i7, unsafe.getInt(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 12:
                                if ((i6 & i4) != 0) {
                                    cd1.D(i7, unsafe.getInt(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 13:
                                if ((i6 & i4) != 0) {
                                    cd1.F(i7, unsafe.getInt(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 14:
                                if ((i6 & i4) != 0) {
                                    cd1.a(i7, unsafe.getLong(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 15:
                                if ((i6 & i4) != 0) {
                                    cd1.z(i7, unsafe.getInt(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 16:
                                if ((i6 & i4) != 0) {
                                    cd1.c(i7, unsafe.getLong(t, j2));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 17:
                                if ((i6 & i4) != 0) {
                                    cd1.H(i7, unsafe.getObject(t, j2), H(i3));
                                } else {
                                    continue;
                                }
                                i2 = i3 + 3;
                            case 18:
                                nb1.e(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                continue;
                                i2 = i3 + 3;
                            case 19:
                                nb1.o(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                continue;
                                i2 = i3 + 3;
                            case 20:
                                nb1.s(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                continue;
                                i2 = i3 + 3;
                            case 21:
                                nb1.v(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                continue;
                                i2 = i3 + 3;
                            case 22:
                                nb1.B(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                continue;
                                i2 = i3 + 3;
                            case 23:
                                nb1.y(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                continue;
                                i2 = i3 + 3;
                            case 24:
                                nb1.E(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                continue;
                                i2 = i3 + 3;
                            case 25:
                                nb1.H(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                continue;
                                i2 = i3 + 3;
                            case 26:
                                nb1.c(this.a[i3], (List) unsafe.getObject(t, j2), cd1);
                                break;
                            case 27:
                                nb1.d(this.a[i3], (List) unsafe.getObject(t, j2), cd1, H(i3));
                                break;
                            case 28:
                                nb1.m(this.a[i3], (List) unsafe.getObject(t, j2), cd1);
                                break;
                            case 29:
                                nb1.C(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                break;
                            case 30:
                                nb1.G(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                break;
                            case 31:
                                nb1.F(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                break;
                            case 32:
                                nb1.z(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                break;
                            case 33:
                                nb1.D(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                break;
                            case 34:
                                nb1.x(this.a[i3], (List) unsafe.getObject(t, j2), cd1, false);
                                break;
                            case 35:
                                nb1.e(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 36:
                                nb1.o(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 37:
                                nb1.s(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 38:
                                nb1.v(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 39:
                                nb1.B(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 40:
                                nb1.y(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 41:
                                nb1.E(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 42:
                                nb1.H(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 43:
                                nb1.C(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 44:
                                nb1.G(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 45:
                                nb1.F(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 46:
                                nb1.z(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 47:
                                nb1.D(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 48:
                                nb1.x(this.a[i3], (List) unsafe.getObject(t, j2), cd1, true);
                                break;
                            case 49:
                                nb1.n(this.a[i3], (List) unsafe.getObject(t, j2), cd1, H(i3));
                                break;
                            case 50:
                                w(cd1, i7, unsafe.getObject(t, j2), i3);
                                break;
                            case 51:
                                if (A(t, i7, i3)) {
                                    cd1.p(i7, Q(t, j2));
                                    break;
                                }
                                break;
                            case 52:
                                if (A(t, i7, i3)) {
                                    cd1.q(i7, R(t, j2));
                                    break;
                                }
                                break;
                            case 53:
                                if (A(t, i7, i3)) {
                                    cd1.l(i7, T(t, j2));
                                    break;
                                }
                                break;
                            case 54:
                                if (A(t, i7, i3)) {
                                    cd1.o(i7, T(t, j2));
                                    break;
                                }
                                break;
                            case 55:
                                if (A(t, i7, i3)) {
                                    cd1.B(i7, S(t, j2));
                                    break;
                                }
                                break;
                            case 56:
                                if (A(t, i7, i3)) {
                                    cd1.g(i7, T(t, j2));
                                    break;
                                }
                                break;
                            case 57:
                                if (A(t, i7, i3)) {
                                    cd1.s(i7, S(t, j2));
                                    break;
                                }
                                break;
                            case 58:
                                if (A(t, i7, i3)) {
                                    cd1.f(i7, U(t, j2));
                                    break;
                                }
                                break;
                            case 59:
                                if (A(t, i7, i3)) {
                                    u(i7, unsafe.getObject(t, j2), cd1);
                                    break;
                                }
                                break;
                            case 60:
                                if (A(t, i7, i3)) {
                                    cd1.C(i7, unsafe.getObject(t, j2), H(i3));
                                    break;
                                }
                                break;
                            case 61:
                                if (A(t, i7, i3)) {
                                    cd1.L(i7, (c81) unsafe.getObject(t, j2));
                                    break;
                                }
                                break;
                            case 62:
                                if (A(t, i7, i3)) {
                                    cd1.E(i7, S(t, j2));
                                    break;
                                }
                                break;
                            case 63:
                                if (A(t, i7, i3)) {
                                    cd1.D(i7, S(t, j2));
                                    break;
                                }
                                break;
                            case 64:
                                if (A(t, i7, i3)) {
                                    cd1.F(i7, S(t, j2));
                                    break;
                                }
                                break;
                            case 65:
                                if (A(t, i7, i3)) {
                                    cd1.a(i7, T(t, j2));
                                    break;
                                }
                                break;
                            case 66:
                                if (A(t, i7, i3)) {
                                    cd1.z(i7, S(t, j2));
                                    break;
                                }
                                break;
                            case 67:
                                if (A(t, i7, i3)) {
                                    cd1.c(i7, T(t, j2));
                                    break;
                                }
                                break;
                            case 68:
                                if (A(t, i7, i3)) {
                                    cd1.H(i7, unsafe.getObject(t, j2), H(i3));
                                    break;
                                }
                                break;
                        }
                        i2 = i3 + 3;
                    } else {
                        this.p.a(entry);
                        throw null;
                    }
                }
                if (entry != null) {
                    v(this.o, t, cd1);
                    return;
                } else {
                    this.p.f(cd1, entry);
                    throw null;
                }
            }
        }
        entry = null;
        int i52 = -1;
        length = this.a.length;
        Unsafe unsafe2 = s;
        i2 = 0;
        int i62 = 0;
        while (i2 < length) {
        }
        if (entry != null) {
        }
    }

    private final void G(T t, T t2, int i2) {
        int L = L(i2);
        int i3 = this.a[i2];
        long j2 = (long) (L & 1048575);
        if (A(t2, i3, i2)) {
            Object D = kc1.D(t, j2);
            Object D2 = kc1.D(t2, j2);
            if (D != null && D2 != null) {
                kc1.g(t, j2, m91.d(D, D2));
                E(t, i3, i2);
            } else if (D2 != null) {
                kc1.g(t, j2, D2);
                E(t, i3, i2);
            }
        }
    }

    private final lb1 H(int i2) {
        int i3 = (i2 / 3) << 1;
        lb1 lb1 = (lb1) this.b[i3];
        if (lb1 != null) {
            return lb1;
        }
        lb1<T> a2 = hb1.b().a((Class) this.b[i3 + 1]);
        this.b[i3] = a2;
        return a2;
    }

    private final Object I(int i2) {
        return this.b[(i2 / 3) << 1];
    }

    private final r91 J(int i2) {
        return (r91) this.b[((i2 / 3) << 1) + 1];
    }

    private final boolean K(T t, T t2, int i2) {
        return z(t, i2) == z(t2, i2);
    }

    private final int L(int i2) {
        return this.a[i2 + 1];
    }

    private final int M(int i2) {
        return this.a[i2 + 2];
    }

    private static boolean N(int i2) {
        return (i2 & 536870912) != 0;
    }

    private final int O(int i2) {
        if (i2 < this.c || i2 > this.d) {
            return -1;
        }
        return W(i2, 0);
    }

    private static List<?> P(Object obj, long j2) {
        return (List) kc1.D(obj, j2);
    }

    private static <T> double Q(T t, long j2) {
        return ((Double) kc1.D(t, j2)).doubleValue();
    }

    private static <T> float R(T t, long j2) {
        return ((Float) kc1.D(t, j2)).floatValue();
    }

    private static <T> int S(T t, long j2) {
        return ((Integer) kc1.D(t, j2)).intValue();
    }

    private static <T> long T(T t, long j2) {
        return ((Long) kc1.D(t, j2)).longValue();
    }

    private static <T> boolean U(T t, long j2) {
        return ((Boolean) kc1.D(t, j2)).booleanValue();
    }

    private final int V(int i2, int i3) {
        if (i2 < this.c || i2 > this.d) {
            return -1;
        }
        return W(i2, i3);
    }

    private final int W(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static hc1 X(Object obj) {
        l91 l91 = (l91) obj;
        hc1 hc1 = l91.zzahz;
        if (hc1 != hc1.i()) {
            return hc1;
        }
        hc1 j2 = hc1.j();
        l91.zzahz = j2;
        return j2;
    }

    private static <UT, UB> int k(ec1<UT, UB> ec1, T t) {
        return ec1.o(ec1.q(t));
    }

    private final int l(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, x71 x71) throws IOException {
        int i10;
        Unsafe unsafe = s;
        long j3 = (long) (this.a[i9 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(y71.m(bArr, i2)));
                    i10 = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(y71.o(bArr, i2)));
                    i10 = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    i10 = y71.k(bArr, i2, x71);
                    unsafe.putObject(t, j2, Long.valueOf(x71.b));
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    i10 = y71.i(bArr, i2, x71);
                    unsafe.putObject(t, j2, Integer.valueOf(x71.a));
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(y71.l(bArr, i2)));
                    i10 = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(y71.h(bArr, i2)));
                    i10 = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    i10 = y71.k(bArr, i2, x71);
                    unsafe.putObject(t, j2, Boolean.valueOf(x71.b != 0));
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    int i11 = y71.i(bArr, i2, x71);
                    int i12 = x71.a;
                    if (i12 == 0) {
                        unsafe.putObject(t, j2, C0201.m82(7791));
                    } else if ((i7 & 536870912) == 0 || nc1.h(bArr, i11, i11 + i12)) {
                        unsafe.putObject(t, j2, new String(bArr, i11, i12, m91.a));
                        i11 += i12;
                    } else {
                        throw v91.j();
                    }
                    unsafe.putInt(t, j3, i5);
                    return i11;
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    int g2 = y71.g(H(i9), bArr, i2, i3, x71);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, x71.c);
                    } else {
                        unsafe.putObject(t, j2, m91.d(object, x71.c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return g2;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    i10 = y71.q(bArr, i2, x71);
                    unsafe.putObject(t, j2, x71.c);
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int i13 = y71.i(bArr, i2, x71);
                    int i14 = x71.a;
                    r91 J = J(i9);
                    if (J == null || J.a(i14)) {
                        unsafe.putObject(t, j2, Integer.valueOf(i14));
                        i10 = i13;
                        unsafe.putInt(t, j3, i5);
                        return i10;
                    }
                    X(t).c(i4, Long.valueOf((long) i14));
                    return i13;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    i10 = y71.i(bArr, i2, x71);
                    unsafe.putObject(t, j2, Integer.valueOf(o81.l(x71.a)));
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    i10 = y71.k(bArr, i2, x71);
                    unsafe.putObject(t, j2, Long.valueOf(o81.m(x71.b)));
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    i10 = y71.f(H(i9), bArr, i2, i3, (i4 & -8) | 4, x71);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, x71.c);
                    } else {
                        unsafe.putObject(t, j2, m91.d(object2, x71.c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            default:
                return i2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0427 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0427 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f0  */
    private final int m(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, defpackage.x71 r30) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1134
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab1.m(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, x71):int");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x003e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x003e */
    private final <K, V> int n(T t, byte[] bArr, int i2, int i3, int i4, long j2, x71 x71) throws IOException {
        Unsafe unsafe = s;
        Object I = I(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.q.f(object)) {
            Object i5 = this.q.i(I);
            this.q.e(i5, object);
            unsafe.putObject(t, j2, i5);
            object = i5;
        }
        ma1<?, ?> c2 = this.q.c(I);
        Map<?, ?> b2 = this.q.b(object);
        int i6 = y71.i(bArr, i2, x71);
        int i7 = x71.a;
        if (i7 < 0 || i7 > i3 - i6) {
            throw v91.b();
        }
        int i8 = i7 + i6;
        X509CRLSelector x509CRLSelector = (K) c2.b;
        X509CRLSelector x509CRLSelector2 = (V) c2.d;
        while (i6 < i8) {
            int i9 = i6 + 1;
            byte b3 = bArr[i6];
            int i10 = b3;
            if (b3 < 0) {
                i9 = y71.d(b3, bArr, i9, x71);
                i10 = x71.a;
            }
            int i11 = (i10 == 1 ? 1 : 0) >>> 3;
            int i12 = (i10 == 1 ? 1 : 0) & 7;
            if (i11 != 1) {
                if (i11 == 2 && i12 == c2.c.d()) {
                    i6 = p(bArr, i9, i3, c2.c, c2.d.getClass(), x71);
                    x509CRLSelector2 = (V) x71.c;
                }
            } else if (i12 == c2.a.d()) {
                i6 = p(bArr, i9, i3, c2.a, null, x71);
                x509CRLSelector = (K) x71.c;
            }
            i6 = y71.a(i10, bArr, i9, i3, x71);
        }
        if (i6 == i8) {
            b2.put(x509CRLSelector, x509CRLSelector2);
            return i8;
        }
        throw v91.i();
    }

    private static int p(byte[] bArr, int i2, int i3, wc1 wc1, Class<?> cls, x71 x71) throws IOException {
        switch (za1.a[wc1.ordinal()]) {
            case 1:
                int k2 = y71.k(bArr, i2, x71);
                x71.c = Boolean.valueOf(x71.b != 0);
                return k2;
            case 2:
                return y71.q(bArr, i2, x71);
            case 3:
                x71.c = Double.valueOf(y71.m(bArr, i2));
                return i2 + 8;
            case 4:
            case 5:
                x71.c = Integer.valueOf(y71.h(bArr, i2));
                return i2 + 4;
            case 6:
            case 7:
                x71.c = Long.valueOf(y71.l(bArr, i2));
                return i2 + 8;
            case 8:
                x71.c = Float.valueOf(y71.o(bArr, i2));
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                int i4 = y71.i(bArr, i2, x71);
                x71.c = Integer.valueOf(x71.a);
                return i4;
            case 12:
            case 13:
                int k3 = y71.k(bArr, i2, x71);
                x71.c = Long.valueOf(x71.b);
                return k3;
            case 14:
                return y71.g(hb1.b().a(cls), bArr, i2, i3, x71);
            case 15:
                int i5 = y71.i(bArr, i2, x71);
                x71.c = Integer.valueOf(o81.l(x71.a));
                return i5;
            case 16:
                int k4 = y71.k(bArr, i2, x71);
                x71.c = Long.valueOf(o81.m(x71.b));
                return k4;
            case 17:
                return y71.p(bArr, i2, x71);
            default:
                throw new RuntimeException(C0201.m82(7793));
        }
    }

    public static <T> ab1<T> q(Class<T> cls, ua1 ua1, eb1 eb1, fa1 fa1, ec1<?, ?> ec1, a91<?> a91, pa1 pa1) {
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        jb1 jb1;
        int i12;
        Class<?> cls2;
        int i13;
        String str;
        int i14;
        int i15;
        int i16;
        int i17;
        Field field;
        int i18;
        char charAt;
        int i19;
        Field field2;
        Field field3;
        int i20;
        char charAt2;
        int i21;
        char charAt3;
        int i22;
        char charAt4;
        int i23;
        int i24;
        char charAt5;
        int i25;
        char charAt6;
        int i26;
        char charAt7;
        int i27;
        char charAt8;
        int i28;
        char charAt9;
        int i29;
        char charAt10;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        char charAt14;
        if (ua1 instanceof jb1) {
            jb1 jb12 = (jb1) ua1;
            int i33 = 0;
            boolean z2 = jb12.c() == l91.d.j;
            String d2 = jb12.d();
            int length = d2.length();
            int charAt15 = d2.charAt(0);
            if (charAt15 >= 55296) {
                int i34 = charAt15 & 8191;
                int i35 = 1;
                int i36 = 13;
                while (true) {
                    i2 = i35 + 1;
                    charAt14 = d2.charAt(i35);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i34 |= (charAt14 & 8191) << i36;
                    i36 += 13;
                    i35 = i2;
                }
                charAt15 = i34 | (charAt14 << i36);
            } else {
                i2 = 1;
            }
            int i37 = i2 + 1;
            int charAt16 = d2.charAt(i2);
            if (charAt16 >= 55296) {
                int i38 = charAt16 & 8191;
                int i39 = 13;
                while (true) {
                    i32 = i37 + 1;
                    charAt13 = d2.charAt(i37);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i38 |= (charAt13 & 8191) << i39;
                    i39 += 13;
                    i37 = i32;
                }
                charAt16 = i38 | (charAt13 << i39);
                i37 = i32;
            }
            if (charAt16 == 0) {
                iArr = r;
                i8 = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                int i40 = i37 + 1;
                int charAt17 = d2.charAt(i37);
                if (charAt17 >= 55296) {
                    int i41 = charAt17 & 8191;
                    int i42 = 13;
                    while (true) {
                        i31 = i40 + 1;
                        charAt12 = d2.charAt(i40);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i41 |= (charAt12 & 8191) << i42;
                        i42 += 13;
                        i40 = i31;
                    }
                    charAt17 = i41 | (charAt12 << i42);
                    i40 = i31;
                }
                int i43 = i40 + 1;
                int charAt18 = d2.charAt(i40);
                if (charAt18 >= 55296) {
                    int i44 = charAt18 & 8191;
                    int i45 = 13;
                    while (true) {
                        i30 = i43 + 1;
                        charAt11 = d2.charAt(i43);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i44 |= (charAt11 & 8191) << i45;
                        i45 += 13;
                        i43 = i30;
                    }
                    charAt18 = i44 | (charAt11 << i45);
                    i43 = i30;
                }
                int i46 = i43 + 1;
                i6 = d2.charAt(i43);
                if (i6 >= 55296) {
                    int i47 = i6 & 8191;
                    int i48 = 13;
                    while (true) {
                        i29 = i46 + 1;
                        charAt10 = d2.charAt(i46);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i47 |= (charAt10 & 8191) << i48;
                        i48 += 13;
                        i46 = i29;
                    }
                    i6 = i47 | (charAt10 << i48);
                    i46 = i29;
                }
                int i49 = i46 + 1;
                int charAt19 = d2.charAt(i46);
                if (charAt19 >= 55296) {
                    int i50 = charAt19 & 8191;
                    int i51 = 13;
                    while (true) {
                        i28 = i49 + 1;
                        charAt9 = d2.charAt(i49);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i50 |= (charAt9 & 8191) << i51;
                        i51 += 13;
                        i49 = i28;
                    }
                    charAt19 = i50 | (charAt9 << i51);
                    i49 = i28;
                }
                int i52 = i49 + 1;
                i4 = d2.charAt(i49);
                if (i4 >= 55296) {
                    int i53 = i4 & 8191;
                    int i54 = 13;
                    while (true) {
                        i27 = i52 + 1;
                        charAt8 = d2.charAt(i52);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i53 |= (charAt8 & 8191) << i54;
                        i54 += 13;
                        i52 = i27;
                    }
                    i4 = i53 | (charAt8 << i54);
                    i52 = i27;
                }
                int i55 = i52 + 1;
                int charAt20 = d2.charAt(i52);
                if (charAt20 >= 55296) {
                    int i56 = charAt20 & 8191;
                    int i57 = 13;
                    while (true) {
                        i26 = i55 + 1;
                        charAt7 = d2.charAt(i55);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i56 |= (charAt7 & 8191) << i57;
                        i57 += 13;
                        i55 = i26;
                    }
                    charAt20 = i56 | (charAt7 << i57);
                    i55 = i26;
                }
                int i58 = i55 + 1;
                int charAt21 = d2.charAt(i55);
                if (charAt21 >= 55296) {
                    int i59 = charAt21 & 8191;
                    int i60 = i58;
                    int i61 = 13;
                    while (true) {
                        i25 = i60 + 1;
                        charAt6 = d2.charAt(i60);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i59 |= (charAt6 & 8191) << i61;
                        i61 += 13;
                        i60 = i25;
                    }
                    charAt21 = i59 | (charAt6 << i61);
                    i23 = i25;
                } else {
                    i23 = i58;
                }
                int i62 = i23 + 1;
                int charAt22 = d2.charAt(i23);
                if (charAt22 >= 55296) {
                    int i63 = charAt22 & 8191;
                    int i64 = i62;
                    int i65 = 13;
                    while (true) {
                        i24 = i64 + 1;
                        charAt5 = d2.charAt(i64);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i63 |= (charAt5 & 8191) << i65;
                        i65 += 13;
                        i64 = i24;
                    }
                    charAt22 = i63 | (charAt5 << i65);
                    i62 = i24;
                }
                int i66 = (charAt17 << 1) + charAt18;
                i7 = charAt19;
                i5 = i66;
                i3 = charAt22;
                i33 = charAt17;
                i37 = i62;
                iArr = new int[(charAt22 + charAt20 + charAt21)];
                i8 = charAt20;
            }
            Unsafe unsafe = s;
            Object[] e2 = jb12.e();
            Class<?> cls3 = jb12.a().getClass();
            int[] iArr2 = new int[(i4 * 3)];
            Object[] objArr = new Object[(i4 << 1)];
            int i67 = i3 + i8;
            int i68 = i3;
            int i69 = i37;
            int i70 = i67;
            int i71 = 0;
            int i72 = 0;
            while (i69 < length) {
                int i73 = i69 + 1;
                int charAt23 = d2.charAt(i69);
                if (charAt23 >= 55296) {
                    int i74 = charAt23 & 8191;
                    int i75 = i73;
                    int i76 = 13;
                    while (true) {
                        i22 = i75 + 1;
                        charAt4 = d2.charAt(i75);
                        i9 = i3;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i74 |= (charAt4 & 8191) << i76;
                        i76 += 13;
                        i75 = i22;
                        i3 = i9;
                    }
                    charAt23 = i74 | (charAt4 << i76);
                    i10 = i22;
                } else {
                    i9 = i3;
                    i10 = i73;
                }
                int i77 = i10 + 1;
                int charAt24 = d2.charAt(i10);
                if (charAt24 >= 55296) {
                    int i78 = charAt24 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i21 = i79 + 1;
                        charAt3 = d2.charAt(i79);
                        z = z2;
                        if (charAt3 < 55296) {
                            break;
                        }
                        i78 |= (charAt3 & 8191) << i80;
                        i80 += 13;
                        i79 = i21;
                        z2 = z;
                    }
                    charAt24 = i78 | (charAt3 << i80);
                    i11 = i21;
                } else {
                    z = z2;
                    i11 = i77;
                }
                int i81 = charAt24 & 255;
                if ((charAt24 & 1024) != 0) {
                    iArr[i71] = i72;
                    i71++;
                }
                if (i81 >= 51) {
                    int i82 = i11 + 1;
                    int charAt25 = d2.charAt(i11);
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i83 = charAt25 & 8191;
                        int i84 = 13;
                        while (true) {
                            i20 = i82 + 1;
                            charAt2 = d2.charAt(i82);
                            if (charAt2 < c2) {
                                break;
                            }
                            i83 |= (charAt2 & 8191) << i84;
                            i84 += 13;
                            i82 = i20;
                            c2 = 55296;
                        }
                        charAt25 = i83 | (charAt2 << i84);
                        i82 = i20;
                    }
                    int i85 = i81 - 51;
                    if (i85 == 9 || i85 == 17) {
                        objArr[((i72 / 3) << 1) + 1] = e2[i5];
                        i5++;
                    } else if (i85 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i72 / 3) << 1) + 1] = e2[i5];
                        i5++;
                    }
                    int i86 = charAt25 << 1;
                    Object obj = e2[i86];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = t(cls3, (String) obj);
                        e2[i86] = field2;
                    }
                    jb1 = jb12;
                    i15 = (int) unsafe.objectFieldOffset(field2);
                    int i87 = i86 + 1;
                    Object obj2 = e2[i87];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = t(cls3, (String) obj2);
                        e2[i87] = field3;
                    }
                    cls2 = cls3;
                    i12 = i5;
                    i11 = i82;
                    str = d2;
                    i13 = 0;
                    i14 = (int) unsafe.objectFieldOffset(field3);
                    i16 = i33;
                } else {
                    jb1 = jb12;
                    int i88 = i5 + 1;
                    Field t = t(cls3, (String) e2[i5]);
                    if (i81 == 9 || i81 == 17) {
                        i17 = 1;
                        objArr[((i72 / 3) << 1) + 1] = t.getType();
                    } else {
                        if (i81 == 27 || i81 == 49) {
                            i17 = 1;
                            i19 = i88 + 1;
                            objArr[((i72 / 3) << 1) + 1] = e2[i88];
                        } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                            i17 = 1;
                            if ((charAt15 & 1) == 1) {
                                i19 = i88 + 1;
                                objArr[((i72 / 3) << 1) + 1] = e2[i88];
                            }
                        } else {
                            if (i81 == 50) {
                                int i89 = i68 + 1;
                                iArr[i68] = i72;
                                int i90 = (i72 / 3) << 1;
                                int i91 = i88 + 1;
                                objArr[i90] = e2[i88];
                                if ((charAt24 & 2048) != 0) {
                                    i88 = i91 + 1;
                                    objArr[i90 + 1] = e2[i91];
                                    i68 = i89;
                                } else {
                                    i88 = i91;
                                    i17 = 1;
                                    i68 = i89;
                                }
                            }
                            i17 = 1;
                        }
                        i88 = i19;
                    }
                    i15 = (int) unsafe.objectFieldOffset(t);
                    if ((charAt15 & 1) != i17 || i81 > 17) {
                        i12 = i88;
                        i16 = i33;
                        cls2 = cls3;
                        str = d2;
                        i14 = 0;
                        i13 = 0;
                    } else {
                        int i92 = i11 + 1;
                        str = d2;
                        int charAt26 = str.charAt(i11);
                        if (charAt26 >= 55296) {
                            int i93 = charAt26 & 8191;
                            int i94 = 13;
                            while (true) {
                                i18 = i92 + 1;
                                charAt = str.charAt(i92);
                                if (charAt < 55296) {
                                    break;
                                }
                                i93 |= (charAt & 8191) << i94;
                                i94 += 13;
                                i92 = i18;
                            }
                            charAt26 = i93 | (charAt << i94);
                            i92 = i18;
                        }
                        int i95 = (i33 << 1) + (charAt26 / 32);
                        Object obj3 = e2[i95];
                        i12 = i88;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = t(cls3, (String) obj3);
                            e2[i95] = field;
                        }
                        i16 = i33;
                        cls2 = cls3;
                        i14 = (int) unsafe.objectFieldOffset(field);
                        i13 = charAt26 % 32;
                        i11 = i92;
                    }
                    if (i81 >= 18 && i81 <= 49) {
                        iArr[i70] = i15;
                        i70++;
                    }
                }
                int i96 = i72 + 1;
                iArr2[i72] = charAt23;
                int i97 = i96 + 1;
                iArr2[i96] = i15 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i81 << 20);
                i72 = i97 + 1;
                iArr2[i97] = (i13 << 20) | i14;
                i33 = i16;
                d2 = str;
                i69 = i11;
                cls3 = cls2;
                i7 = i7;
                length = length;
                i3 = i9;
                z2 = z;
                i6 = i6;
                i5 = i12;
                jb12 = jb1;
            }
            return new ab1<>(iArr2, objArr, i6, i7, jb12.a(), z2, false, iArr, i3, i67, eb1, fa1, ec1, a91, pa1);
        }
        ((bc1) ua1).c();
        throw null;
    }

    private final <K, V, UT, UB> UB r(int i2, int i3, Map<K, V> map, r91 r91, UB ub, ec1<UT, UB> ec1) {
        ma1<?, ?> c2 = this.q.c(I(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!r91.a(next.getValue().intValue())) {
                if (ub == null) {
                    ub = ec1.p();
                }
                j81 g2 = c81.g(oa1.a(c2, next.getKey(), next.getValue()));
                try {
                    oa1.b(g2.b(), c2, next.getKey(), next.getValue());
                    ec1.b(ub, i3, g2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB s(Object obj, int i2, UB ub, ec1<UT, UB> ec1) {
        r91 J;
        int i3 = this.a[i2];
        Object D = kc1.D(obj, (long) (L(i2) & 1048575));
        return (D == null || (J = J(i2)) == null) ? ub : (UB) r(i2, i3, (Map<K, V>) this.q.b(D), J, ub, ec1);
    }

    private static Field t(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append(C0201.m82(7794));
            sb.append(str);
            sb.append(C0201.m82(7795));
            sb.append(name);
            sb.append(C0201.m82(7796));
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static void u(int i2, Object obj, cd1 cd1) throws IOException {
        if (obj instanceof String) {
            cd1.I(i2, (String) obj);
        } else {
            cd1.L(i2, (c81) obj);
        }
    }

    private static <UT, UB> void v(ec1<UT, UB> ec1, T t, cd1 cd1) throws IOException {
        ec1.d(ec1.q(t), cd1);
    }

    private final <K, V> void w(cd1 cd1, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            cd1.O(i2, this.q.c(I(i3)), this.q.a(obj));
        }
    }

    private final void x(Object obj, int i2, mb1 mb1) throws IOException {
        if (N(i2)) {
            kc1.g(obj, (long) (i2 & 1048575), mb1.M());
        } else if (this.g) {
            kc1.g(obj, (long) (i2 & 1048575), mb1.k());
        } else {
            kc1.g(obj, (long) (i2 & 1048575), mb1.L());
        }
    }

    private final void y(T t, T t2, int i2) {
        long L = (long) (L(i2) & 1048575);
        if (z(t2, i2)) {
            Object D = kc1.D(t, L);
            Object D2 = kc1.D(t2, L);
            if (D != null && D2 != null) {
                kc1.g(t, L, m91.d(D, D2));
                D(t, i2);
            } else if (D2 != null) {
                kc1.g(t, L, D2);
                D(t, i2);
            }
        }
    }

    private final boolean z(T t, int i2) {
        if (this.h) {
            int L = L(i2);
            long j2 = (long) (L & 1048575);
            switch ((L & 267386880) >>> 20) {
                case 0:
                    return kc1.C(t, j2) != 0.0d;
                case 1:
                    return kc1.B(t, j2) != 0.0f;
                case 2:
                    return kc1.z(t, j2) != 0;
                case 3:
                    return kc1.z(t, j2) != 0;
                case 4:
                    return kc1.x(t, j2) != 0;
                case 5:
                    return kc1.z(t, j2) != 0;
                case 6:
                    return kc1.x(t, j2) != 0;
                case 7:
                    return kc1.A(t, j2);
                case 8:
                    Object D = kc1.D(t, j2);
                    if (D instanceof String) {
                        return !((String) D).isEmpty();
                    }
                    if (D instanceof c81) {
                        return !c81.b.equals(D);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return kc1.D(t, j2) != null;
                case 10:
                    return !c81.b.equals(kc1.D(t, j2));
                case 11:
                    return kc1.x(t, j2) != 0;
                case 12:
                    return kc1.x(t, j2) != 0;
                case 13:
                    return kc1.x(t, j2) != 0;
                case 14:
                    return kc1.z(t, j2) != 0;
                case 15:
                    return kc1.x(t, j2) != 0;
                case 16:
                    return kc1.z(t, j2) != 0;
                case 17:
                    return kc1.D(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int M = M(i2);
            return (kc1.x(t, (long) (M & 1048575)) & (1 << (M >>> 20))) != 0;
        }
    }

    @Override // defpackage.lb1
    public final void a(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.a.length; i2 += 3) {
                int L = L(i2);
                long j2 = (long) (1048575 & L);
                int i3 = this.a[i2];
                switch ((L & 267386880) >>> 20) {
                    case 0:
                        if (z(t2, i2)) {
                            kc1.d(t, j2, kc1.C(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (z(t2, i2)) {
                            kc1.e(t, j2, kc1.B(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (z(t2, i2)) {
                            kc1.f(t, j2, kc1.z(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (z(t2, i2)) {
                            kc1.f(t, j2, kc1.z(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (z(t2, i2)) {
                            kc1.n(t, j2, kc1.x(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (z(t2, i2)) {
                            kc1.f(t, j2, kc1.z(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (z(t2, i2)) {
                            kc1.n(t, j2, kc1.x(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (z(t2, i2)) {
                            kc1.h(t, j2, kc1.A(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (z(t2, i2)) {
                            kc1.g(t, j2, kc1.D(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        y(t, t2, i2);
                        break;
                    case 10:
                        if (z(t2, i2)) {
                            kc1.g(t, j2, kc1.D(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (z(t2, i2)) {
                            kc1.n(t, j2, kc1.x(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (z(t2, i2)) {
                            kc1.n(t, j2, kc1.x(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (z(t2, i2)) {
                            kc1.n(t, j2, kc1.x(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (z(t2, i2)) {
                            kc1.f(t, j2, kc1.z(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (z(t2, i2)) {
                            kc1.n(t, j2, kc1.x(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (z(t2, i2)) {
                            kc1.f(t, j2, kc1.z(t2, j2));
                            D(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        y(t, t2, i2);
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
                        nb1.g(this.q, t, t2, j2);
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
                        if (A(t2, i3, i2)) {
                            kc1.g(t, j2, kc1.D(t2, j2));
                            E(t, i3, i2);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        G(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (A(t2, i3, i2)) {
                            kc1.g(t, j2, kc1.D(t2, j2));
                            E(t, i3, i2);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        G(t, t2, i2);
                        break;
                }
            }
            if (!this.h) {
                nb1.h(this.o, t, t2);
                if (this.f) {
                    nb1.f(this.p, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [lb1] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [lb1] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.lb1
    public final boolean b(T t) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.k) {
                return !this.f || this.p.h(t).c();
            }
            int i6 = this.j[i4];
            int i7 = this.a[i6];
            int L = L(i6);
            if (!this.h) {
                int i8 = this.a[i6 + 2];
                int i9 = i8 & 1048575;
                i2 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = s.getInt(t, (long) i9);
                    i3 = i9;
                }
            } else {
                i2 = 0;
            }
            if (((268435456 & L) != 0) && !B(t, i6, i5, i2)) {
                return false;
            }
            int i10 = (267386880 & L) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (A(t, i7, i6) && !C(t, L, H(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 != 50) {
                            continue;
                        } else {
                            Map<?, ?> a2 = this.q.a(kc1.D(t, (long) (L & 1048575)));
                            if (!a2.isEmpty()) {
                                if (this.q.c(I(i6)).c.b() == zc1.MESSAGE) {
                                    lb1<T> lb1 = 0;
                                    Iterator<?> it = a2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (lb1 == null) {
                                            lb1 = hb1.b().a(next.getClass());
                                        }
                                        boolean b2 = lb1.b(next);
                                        lb1 = lb1;
                                        if (!b2) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) kc1.D(t, (long) (L & 1048575));
                if (!list.isEmpty()) {
                    ?? H = H(i6);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        } else if (!H.b(list.get(i11))) {
                            z = false;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (B(t, i6, i5, i2) && !C(t, L, H(i6))) {
                return false;
            }
            i4++;
        }
    }

    @Override // defpackage.lb1
    public final void c(T t) {
        int i2;
        int i3 = this.k;
        while (true) {
            i2 = this.l;
            if (i3 >= i2) {
                break;
            }
            long L = (long) (L(this.j[i3]) & 1048575);
            Object D = kc1.D(t, L);
            if (D != null) {
                kc1.g(t, L, this.q.h(D));
            }
            i3++;
        }
        int length = this.j.length;
        while (i2 < length) {
            this.n.c(t, (long) this.j[i2]);
            i2++;
        }
        this.o.m(t);
        if (this.f) {
            this.p.j(t);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (defpackage.nb1.w(defpackage.kc1.D(r10, r6), defpackage.kc1.D(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (defpackage.kc1.z(r10, r6) == defpackage.kc1.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (defpackage.kc1.x(r10, r6) == defpackage.kc1.x(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (defpackage.kc1.z(r10, r6) == defpackage.kc1.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (defpackage.kc1.x(r10, r6) == defpackage.kc1.x(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (defpackage.kc1.x(r10, r6) == defpackage.kc1.x(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (defpackage.kc1.x(r10, r6) == defpackage.kc1.x(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (defpackage.nb1.w(defpackage.kc1.D(r10, r6), defpackage.kc1.D(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (defpackage.nb1.w(defpackage.kc1.D(r10, r6), defpackage.kc1.D(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (defpackage.nb1.w(defpackage.kc1.D(r10, r6), defpackage.kc1.D(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (defpackage.kc1.A(r10, r6) == defpackage.kc1.A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (defpackage.kc1.x(r10, r6) == defpackage.kc1.x(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (defpackage.kc1.z(r10, r6) == defpackage.kc1.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (defpackage.kc1.x(r10, r6) == defpackage.kc1.x(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (defpackage.kc1.z(r10, r6) == defpackage.kc1.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (defpackage.kc1.z(r10, r6) == defpackage.kc1.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(defpackage.kc1.B(r10, r6)) == java.lang.Float.floatToIntBits(defpackage.kc1.B(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(defpackage.kc1.C(r10, r6)) == java.lang.Double.doubleToLongBits(defpackage.kc1.C(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (defpackage.nb1.w(defpackage.kc1.D(r10, r6), defpackage.kc1.D(r11, r6)) != false) goto L_0x01c2;
     */
    @Override // defpackage.lb1
    public final boolean d(T t, T t2) {
        int length = this.a.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < length) {
                int L = L(i2);
                long j2 = (long) (L & 1048575);
                switch ((L & 267386880) >>> 20) {
                    case 0:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (K(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (K(t, t2, i2)) {
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
                        z = nb1.w(kc1.D(t, j2), kc1.D(t2, j2));
                        break;
                    case 50:
                        z = nb1.w(kc1.D(t, j2), kc1.D(t2, j2));
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
                        long M = (long) (M(i2) & 1048575);
                        if (kc1.x(t, M) == kc1.x(t2, M)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i2 += 3;
            } else if (!this.o.q(t).equals(this.o.q(t2))) {
                return false;
            } else {
                if (this.f) {
                    return this.p.h(t).equals(this.p.h(t2));
                }
                return true;
            }
        }
    }

    @Override // defpackage.lb1
    public final T e() {
        return (T) this.m.a(this.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x096d  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0973  */
    @Override // defpackage.lb1
    public final void f(T t, cd1 cd1) throws IOException {
        Map.Entry<?, Object> entry;
        int length;
        int i2;
        Map.Entry<?, Object> entry2;
        int length2;
        if (cd1.K() == l91.d.l) {
            v(this.o, t, cd1);
            if (this.f) {
                b91<?> h2 = this.p.h(t);
                if (!h2.a.isEmpty()) {
                    entry2 = h2.a().next();
                    for (length2 = this.a.length - 3; length2 >= 0; length2 -= 3) {
                        int L = L(length2);
                        int[] iArr = this.a;
                        int i3 = iArr[length2];
                        if (entry2 == null) {
                            switch ((L & 267386880) >>> 20) {
                                case 0:
                                    if (z(t, length2)) {
                                        cd1.p(i3, kc1.C(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    if (z(t, length2)) {
                                        cd1.q(i3, kc1.B(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 2:
                                    if (z(t, length2)) {
                                        cd1.l(i3, kc1.z(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 3:
                                    if (z(t, length2)) {
                                        cd1.o(i3, kc1.z(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 4:
                                    if (z(t, length2)) {
                                        cd1.B(i3, kc1.x(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    if (z(t, length2)) {
                                        cd1.g(i3, kc1.z(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 6:
                                    if (z(t, length2)) {
                                        cd1.s(i3, kc1.x(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 7:
                                    if (z(t, length2)) {
                                        cd1.f(i3, kc1.A(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 8:
                                    if (z(t, length2)) {
                                        u(i3, kc1.D(t, (long) (L & 1048575)), cd1);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 9:
                                    if (z(t, length2)) {
                                        cd1.C(i3, kc1.D(t, (long) (L & 1048575)), H(length2));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
                                    if (z(t, length2)) {
                                        cd1.L(i3, (c81) kc1.D(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 11:
                                    if (z(t, length2)) {
                                        cd1.E(i3, kc1.x(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 12:
                                    if (z(t, length2)) {
                                        cd1.D(i3, kc1.x(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 13:
                                    if (z(t, length2)) {
                                        cd1.F(i3, kc1.x(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 14:
                                    if (z(t, length2)) {
                                        cd1.a(i3, kc1.z(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 15:
                                    if (z(t, length2)) {
                                        cd1.z(i3, kc1.x(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 16:
                                    if (z(t, length2)) {
                                        cd1.c(i3, kc1.z(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 17:
                                    if (z(t, length2)) {
                                        cd1.H(i3, kc1.D(t, (long) (L & 1048575)), H(length2));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 18:
                                    nb1.e(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 19:
                                    nb1.o(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 20:
                                    nb1.s(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 21:
                                    nb1.v(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 22:
                                    nb1.B(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 23:
                                    nb1.y(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 24:
                                    nb1.E(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 25:
                                    nb1.H(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 26:
                                    nb1.c(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1);
                                    break;
                                case 27:
                                    nb1.d(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, H(length2));
                                    break;
                                case 28:
                                    nb1.m(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1);
                                    break;
                                case 29:
                                    nb1.C(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 30:
                                    nb1.G(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 31:
                                    nb1.F(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 32:
                                    nb1.z(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 33:
                                    nb1.D(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 34:
                                    nb1.x(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, false);
                                    break;
                                case 35:
                                    nb1.e(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 36:
                                    nb1.o(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 37:
                                    nb1.s(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 38:
                                    nb1.v(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 39:
                                    nb1.B(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 40:
                                    nb1.y(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 41:
                                    nb1.E(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 42:
                                    nb1.H(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 43:
                                    nb1.C(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 44:
                                    nb1.G(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 45:
                                    nb1.F(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 46:
                                    nb1.z(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 47:
                                    nb1.D(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 48:
                                    nb1.x(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, true);
                                    break;
                                case 49:
                                    nb1.n(iArr[length2], (List) kc1.D(t, (long) (L & 1048575)), cd1, H(length2));
                                    break;
                                case 50:
                                    w(cd1, i3, kc1.D(t, (long) (L & 1048575)), length2);
                                    break;
                                case 51:
                                    if (A(t, i3, length2)) {
                                        cd1.p(i3, Q(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 52:
                                    if (A(t, i3, length2)) {
                                        cd1.q(i3, R(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 53:
                                    if (A(t, i3, length2)) {
                                        cd1.l(i3, T(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 54:
                                    if (A(t, i3, length2)) {
                                        cd1.o(i3, T(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 55:
                                    if (A(t, i3, length2)) {
                                        cd1.B(i3, S(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 56:
                                    if (A(t, i3, length2)) {
                                        cd1.g(i3, T(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 57:
                                    if (A(t, i3, length2)) {
                                        cd1.s(i3, S(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 58:
                                    if (A(t, i3, length2)) {
                                        cd1.f(i3, U(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 59:
                                    if (A(t, i3, length2)) {
                                        u(i3, kc1.D(t, (long) (L & 1048575)), cd1);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 60:
                                    if (A(t, i3, length2)) {
                                        cd1.C(i3, kc1.D(t, (long) (L & 1048575)), H(length2));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 61:
                                    if (A(t, i3, length2)) {
                                        cd1.L(i3, (c81) kc1.D(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 62:
                                    if (A(t, i3, length2)) {
                                        cd1.E(i3, S(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 63:
                                    if (A(t, i3, length2)) {
                                        cd1.D(i3, S(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 64:
                                    if (A(t, i3, length2)) {
                                        cd1.F(i3, S(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 65:
                                    if (A(t, i3, length2)) {
                                        cd1.a(i3, T(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 66:
                                    if (A(t, i3, length2)) {
                                        cd1.z(i3, S(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 67:
                                    if (A(t, i3, length2)) {
                                        cd1.c(i3, T(t, (long) (L & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 68:
                                    if (A(t, i3, length2)) {
                                        cd1.H(i3, kc1.D(t, (long) (L & 1048575)), H(length2));
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            this.p.a(entry2);
                            throw null;
                        }
                    }
                    if (entry2 == null) {
                        this.p.f(cd1, entry2);
                        throw null;
                    }
                    return;
                }
            }
            entry2 = null;
            while (length2 >= 0) {
            }
            if (entry2 == null) {
            }
        } else if (this.h) {
            if (this.f) {
                b91<?> h3 = this.p.h(t);
                if (!h3.a.isEmpty()) {
                    entry = h3.d().next();
                    length = this.a.length;
                    for (i2 = 0; i2 < length; i2 += 3) {
                        int L2 = L(i2);
                        int[] iArr2 = this.a;
                        int i4 = iArr2[i2];
                        if (entry == null) {
                            switch ((L2 & 267386880) >>> 20) {
                                case 0:
                                    if (z(t, i2)) {
                                        cd1.p(i4, kc1.C(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    if (z(t, i2)) {
                                        cd1.q(i4, kc1.B(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 2:
                                    if (z(t, i2)) {
                                        cd1.l(i4, kc1.z(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 3:
                                    if (z(t, i2)) {
                                        cd1.o(i4, kc1.z(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 4:
                                    if (z(t, i2)) {
                                        cd1.B(i4, kc1.x(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    if (z(t, i2)) {
                                        cd1.g(i4, kc1.z(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 6:
                                    if (z(t, i2)) {
                                        cd1.s(i4, kc1.x(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 7:
                                    if (z(t, i2)) {
                                        cd1.f(i4, kc1.A(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 8:
                                    if (z(t, i2)) {
                                        u(i4, kc1.D(t, (long) (L2 & 1048575)), cd1);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 9:
                                    if (z(t, i2)) {
                                        cd1.C(i4, kc1.D(t, (long) (L2 & 1048575)), H(i2));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
                                    if (z(t, i2)) {
                                        cd1.L(i4, (c81) kc1.D(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 11:
                                    if (z(t, i2)) {
                                        cd1.E(i4, kc1.x(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 12:
                                    if (z(t, i2)) {
                                        cd1.D(i4, kc1.x(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 13:
                                    if (z(t, i2)) {
                                        cd1.F(i4, kc1.x(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 14:
                                    if (z(t, i2)) {
                                        cd1.a(i4, kc1.z(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 15:
                                    if (z(t, i2)) {
                                        cd1.z(i4, kc1.x(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 16:
                                    if (z(t, i2)) {
                                        cd1.c(i4, kc1.z(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 17:
                                    if (z(t, i2)) {
                                        cd1.H(i4, kc1.D(t, (long) (L2 & 1048575)), H(i2));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 18:
                                    nb1.e(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 19:
                                    nb1.o(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 20:
                                    nb1.s(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 21:
                                    nb1.v(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 22:
                                    nb1.B(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 23:
                                    nb1.y(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 24:
                                    nb1.E(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 25:
                                    nb1.H(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 26:
                                    nb1.c(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1);
                                    break;
                                case 27:
                                    nb1.d(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, H(i2));
                                    break;
                                case 28:
                                    nb1.m(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1);
                                    break;
                                case 29:
                                    nb1.C(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 30:
                                    nb1.G(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 31:
                                    nb1.F(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 32:
                                    nb1.z(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 33:
                                    nb1.D(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 34:
                                    nb1.x(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, false);
                                    break;
                                case 35:
                                    nb1.e(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 36:
                                    nb1.o(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 37:
                                    nb1.s(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 38:
                                    nb1.v(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 39:
                                    nb1.B(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 40:
                                    nb1.y(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 41:
                                    nb1.E(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 42:
                                    nb1.H(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 43:
                                    nb1.C(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 44:
                                    nb1.G(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 45:
                                    nb1.F(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 46:
                                    nb1.z(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 47:
                                    nb1.D(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 48:
                                    nb1.x(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, true);
                                    break;
                                case 49:
                                    nb1.n(iArr2[i2], (List) kc1.D(t, (long) (L2 & 1048575)), cd1, H(i2));
                                    break;
                                case 50:
                                    w(cd1, i4, kc1.D(t, (long) (L2 & 1048575)), i2);
                                    break;
                                case 51:
                                    if (A(t, i4, i2)) {
                                        cd1.p(i4, Q(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 52:
                                    if (A(t, i4, i2)) {
                                        cd1.q(i4, R(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 53:
                                    if (A(t, i4, i2)) {
                                        cd1.l(i4, T(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 54:
                                    if (A(t, i4, i2)) {
                                        cd1.o(i4, T(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 55:
                                    if (A(t, i4, i2)) {
                                        cd1.B(i4, S(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 56:
                                    if (A(t, i4, i2)) {
                                        cd1.g(i4, T(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 57:
                                    if (A(t, i4, i2)) {
                                        cd1.s(i4, S(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 58:
                                    if (A(t, i4, i2)) {
                                        cd1.f(i4, U(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 59:
                                    if (A(t, i4, i2)) {
                                        u(i4, kc1.D(t, (long) (L2 & 1048575)), cd1);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 60:
                                    if (A(t, i4, i2)) {
                                        cd1.C(i4, kc1.D(t, (long) (L2 & 1048575)), H(i2));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 61:
                                    if (A(t, i4, i2)) {
                                        cd1.L(i4, (c81) kc1.D(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 62:
                                    if (A(t, i4, i2)) {
                                        cd1.E(i4, S(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 63:
                                    if (A(t, i4, i2)) {
                                        cd1.D(i4, S(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 64:
                                    if (A(t, i4, i2)) {
                                        cd1.F(i4, S(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 65:
                                    if (A(t, i4, i2)) {
                                        cd1.a(i4, T(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 66:
                                    if (A(t, i4, i2)) {
                                        cd1.z(i4, S(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 67:
                                    if (A(t, i4, i2)) {
                                        cd1.c(i4, T(t, (long) (L2 & 1048575)));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 68:
                                    if (A(t, i4, i2)) {
                                        cd1.H(i4, kc1.D(t, (long) (L2 & 1048575)), H(i2));
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            this.p.a(entry);
                            throw null;
                        }
                    }
                    if (entry != null) {
                        v(this.o, t, cd1);
                        return;
                    } else {
                        this.p.f(cd1, entry);
                        throw null;
                    }
                }
            }
            entry = null;
            length = this.a.length;
            while (i2 < length) {
            }
            if (entry != null) {
            }
        } else {
            F(t, cd1);
        }
    }

    @Override // defpackage.lb1
    public final int g(T t) {
        int i2;
        int i3;
        int length = this.a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int L = L(i5);
            int i6 = this.a[i5];
            long j2 = (long) (1048575 & L);
            int i7 = 37;
            switch ((L & 267386880) >>> 20) {
                case 0:
                    i3 = i4 * 53;
                    i2 = m91.f(Double.doubleToLongBits(kc1.C(t, j2)));
                    i4 = i3 + i2;
                    break;
                case 1:
                    i3 = i4 * 53;
                    i2 = Float.floatToIntBits(kc1.B(t, j2));
                    i4 = i3 + i2;
                    break;
                case 2:
                    i3 = i4 * 53;
                    i2 = m91.f(kc1.z(t, j2));
                    i4 = i3 + i2;
                    break;
                case 3:
                    i3 = i4 * 53;
                    i2 = m91.f(kc1.z(t, j2));
                    i4 = i3 + i2;
                    break;
                case 4:
                    i3 = i4 * 53;
                    i2 = kc1.x(t, j2);
                    i4 = i3 + i2;
                    break;
                case 5:
                    i3 = i4 * 53;
                    i2 = m91.f(kc1.z(t, j2));
                    i4 = i3 + i2;
                    break;
                case 6:
                    i3 = i4 * 53;
                    i2 = kc1.x(t, j2);
                    i4 = i3 + i2;
                    break;
                case 7:
                    i3 = i4 * 53;
                    i2 = m91.j(kc1.A(t, j2));
                    i4 = i3 + i2;
                    break;
                case 8:
                    i3 = i4 * 53;
                    i2 = ((String) kc1.D(t, j2)).hashCode();
                    i4 = i3 + i2;
                    break;
                case 9:
                    Object D = kc1.D(t, j2);
                    if (D != null) {
                        i7 = D.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i3 = i4 * 53;
                    i2 = kc1.D(t, j2).hashCode();
                    i4 = i3 + i2;
                    break;
                case 11:
                    i3 = i4 * 53;
                    i2 = kc1.x(t, j2);
                    i4 = i3 + i2;
                    break;
                case 12:
                    i3 = i4 * 53;
                    i2 = kc1.x(t, j2);
                    i4 = i3 + i2;
                    break;
                case 13:
                    i3 = i4 * 53;
                    i2 = kc1.x(t, j2);
                    i4 = i3 + i2;
                    break;
                case 14:
                    i3 = i4 * 53;
                    i2 = m91.f(kc1.z(t, j2));
                    i4 = i3 + i2;
                    break;
                case 15:
                    i3 = i4 * 53;
                    i2 = kc1.x(t, j2);
                    i4 = i3 + i2;
                    break;
                case 16:
                    i3 = i4 * 53;
                    i2 = m91.f(kc1.z(t, j2));
                    i4 = i3 + i2;
                    break;
                case 17:
                    Object D2 = kc1.D(t, j2);
                    if (D2 != null) {
                        i7 = D2.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
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
                    i3 = i4 * 53;
                    i2 = kc1.D(t, j2).hashCode();
                    i4 = i3 + i2;
                    break;
                case 50:
                    i3 = i4 * 53;
                    i2 = kc1.D(t, j2).hashCode();
                    i4 = i3 + i2;
                    break;
                case 51:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = m91.f(Double.doubleToLongBits(Q(t, j2)));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = Float.floatToIntBits(R(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = m91.f(T(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = m91.f(T(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = S(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = m91.f(T(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = S(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = m91.j(U(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = ((String) kc1.D(t, j2)).hashCode();
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = kc1.D(t, j2).hashCode();
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = kc1.D(t, j2).hashCode();
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = S(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = S(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = S(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = m91.f(T(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = S(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = m91.f(T(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (A(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = kc1.D(t, j2).hashCode();
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.o.q(t).hashCode();
        return this.f ? (hashCode * 53) + this.p.h(t).hashCode() : hashCode;
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // defpackage.lb1
    public final void h(T r11, defpackage.mb1 r12, defpackage.y81 r13) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1638
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab1.h(java.lang.Object, mb1, y81):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.lb1
    public final int i(T t) {
        int i2;
        int i3;
        long j2;
        int i4;
        int c0;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int q2;
        int i10;
        int i11;
        int i12;
        int i13 = 267386880;
        int i14 = 1;
        if (this.h) {
            Unsafe unsafe = s;
            int i15 = 0;
            int i16 = 0;
            while (i15 < this.a.length) {
                int L = L(i15);
                int i17 = (L & i13) >>> 20;
                int i18 = this.a[i15];
                long j3 = (long) (L & 1048575);
                int i19 = (i17 < g91.DOUBLE_LIST_PACKED.b() || i17 > g91.SINT64_LIST_PACKED.b()) ? 0 : this.a[i15 + 2] & 1048575;
                switch (i17) {
                    case 0:
                        if (z(t, i15)) {
                            q2 = r81.q(i18, 0.0d);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 1:
                        if (z(t, i15)) {
                            q2 = r81.r(i18, 0.0f);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 2:
                        if (z(t, i15)) {
                            q2 = r81.i0(i18, kc1.z(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 3:
                        if (z(t, i15)) {
                            q2 = r81.r0(i18, kc1.z(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 4:
                        if (z(t, i15)) {
                            q2 = r81.x0(i18, kc1.x(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 5:
                        if (z(t, i15)) {
                            q2 = r81.y0(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 6:
                        if (z(t, i15)) {
                            q2 = r81.D0(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 7:
                        if (z(t, i15)) {
                            q2 = r81.d0(i18, true);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 8:
                        if (z(t, i15)) {
                            Object D = kc1.D(t, j3);
                            if (D instanceof c81) {
                                q2 = r81.Z(i18, (c81) D);
                                break;
                            } else {
                                q2 = r81.c0(i18, (String) D);
                                break;
                            }
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 9:
                        if (z(t, i15)) {
                            q2 = nb1.p(i18, kc1.D(t, j3), H(i15));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 10:
                        if (z(t, i15)) {
                            q2 = r81.Z(i18, (c81) kc1.D(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 11:
                        if (z(t, i15)) {
                            q2 = r81.A0(i18, kc1.x(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 12:
                        if (z(t, i15)) {
                            q2 = r81.F0(i18, kc1.x(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 13:
                        if (z(t, i15)) {
                            q2 = r81.E0(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 14:
                        if (z(t, i15)) {
                            q2 = r81.B0(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 15:
                        if (z(t, i15)) {
                            q2 = r81.C0(i18, kc1.x(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 16:
                        if (z(t, i15)) {
                            q2 = r81.u0(i18, kc1.z(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 17:
                        if (z(t, i15)) {
                            q2 = r81.b0(i18, (wa1) kc1.D(t, j3), H(i15));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 18:
                        q2 = nb1.T(i18, P(t, j3), false);
                        break;
                    case 19:
                        q2 = nb1.R(i18, P(t, j3), false);
                        break;
                    case 20:
                        q2 = nb1.I(i18, P(t, j3), false);
                        break;
                    case 21:
                        q2 = nb1.J(i18, P(t, j3), false);
                        break;
                    case 22:
                        q2 = nb1.M(i18, P(t, j3), false);
                        break;
                    case 23:
                        q2 = nb1.T(i18, P(t, j3), false);
                        break;
                    case 24:
                        q2 = nb1.R(i18, P(t, j3), false);
                        break;
                    case 25:
                        q2 = nb1.a0(i18, P(t, j3), false);
                        break;
                    case 26:
                        q2 = nb1.q(i18, P(t, j3));
                        break;
                    case 27:
                        q2 = nb1.r(i18, P(t, j3), H(i15));
                        break;
                    case 28:
                        q2 = nb1.t(i18, P(t, j3));
                        break;
                    case 29:
                        q2 = nb1.N(i18, P(t, j3), false);
                        break;
                    case 30:
                        q2 = nb1.L(i18, P(t, j3), false);
                        break;
                    case 31:
                        q2 = nb1.R(i18, P(t, j3), false);
                        break;
                    case 32:
                        q2 = nb1.T(i18, P(t, j3), false);
                        break;
                    case 33:
                        q2 = nb1.P(i18, P(t, j3), false);
                        break;
                    case 34:
                        q2 = nb1.K(i18, P(t, j3), false);
                        break;
                    case 35:
                        i11 = nb1.k((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 36:
                        i11 = nb1.j((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 37:
                        i11 = nb1.Q((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 38:
                        i11 = nb1.S((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 39:
                        i11 = nb1.c0((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 40:
                        i11 = nb1.k((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 41:
                        i11 = nb1.j((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 42:
                        i11 = nb1.l((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 43:
                        i11 = nb1.d0((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 44:
                        i11 = nb1.b0((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 45:
                        i11 = nb1.j((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 46:
                        i11 = nb1.k((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 47:
                        i11 = nb1.i((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 48:
                        i11 = nb1.U((List) unsafe.getObject(t, j3));
                        if (i11 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i19, i11);
                            }
                            i12 = r81.H(i18);
                            i10 = r81.J(i11);
                            q2 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 49:
                        q2 = nb1.u(i18, P(t, j3), H(i15));
                        break;
                    case 50:
                        q2 = this.q.d(i18, kc1.D(t, j3), I(i15));
                        break;
                    case 51:
                        if (A(t, i18, i15)) {
                            q2 = r81.q(i18, 0.0d);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 52:
                        if (A(t, i18, i15)) {
                            q2 = r81.r(i18, 0.0f);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 53:
                        if (A(t, i18, i15)) {
                            q2 = r81.i0(i18, T(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 54:
                        if (A(t, i18, i15)) {
                            q2 = r81.r0(i18, T(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 55:
                        if (A(t, i18, i15)) {
                            q2 = r81.x0(i18, S(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 56:
                        if (A(t, i18, i15)) {
                            q2 = r81.y0(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 57:
                        if (A(t, i18, i15)) {
                            q2 = r81.D0(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 58:
                        if (A(t, i18, i15)) {
                            q2 = r81.d0(i18, true);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 59:
                        if (A(t, i18, i15)) {
                            Object D2 = kc1.D(t, j3);
                            if (D2 instanceof c81) {
                                q2 = r81.Z(i18, (c81) D2);
                                break;
                            } else {
                                q2 = r81.c0(i18, (String) D2);
                                break;
                            }
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 60:
                        if (A(t, i18, i15)) {
                            q2 = nb1.p(i18, kc1.D(t, j3), H(i15));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 61:
                        if (A(t, i18, i15)) {
                            q2 = r81.Z(i18, (c81) kc1.D(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 62:
                        if (A(t, i18, i15)) {
                            q2 = r81.A0(i18, S(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 63:
                        if (A(t, i18, i15)) {
                            q2 = r81.F0(i18, S(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 64:
                        if (A(t, i18, i15)) {
                            q2 = r81.E0(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 65:
                        if (A(t, i18, i15)) {
                            q2 = r81.B0(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 66:
                        if (A(t, i18, i15)) {
                            q2 = r81.C0(i18, S(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 67:
                        if (A(t, i18, i15)) {
                            q2 = r81.u0(i18, T(t, j3));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 68:
                        if (A(t, i18, i15)) {
                            q2 = r81.b0(i18, (wa1) kc1.D(t, j3), H(i15));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    default:
                        i15 += 3;
                        i13 = 267386880;
                }
                i16 += q2;
                i15 += 3;
                i13 = 267386880;
            }
            return i16 + k(this.o, t);
        }
        Unsafe unsafe2 = s;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < this.a.length) {
            int L2 = L(i21);
            int[] iArr = this.a;
            int i24 = iArr[i21];
            int i25 = (L2 & 267386880) >>> 20;
            if (i25 <= 17) {
                int i26 = iArr[i21 + 2];
                int i27 = i26 & 1048575;
                i2 = i14 << (i26 >>> 20);
                if (i27 != i20) {
                    i23 = unsafe2.getInt(t, (long) i27);
                    i20 = i27;
                }
                i3 = i26;
            } else {
                i3 = (!this.i || i25 < g91.DOUBLE_LIST_PACKED.b() || i25 > g91.SINT64_LIST_PACKED.b()) ? 0 : this.a[i21 + 2] & 1048575;
                i2 = 0;
            }
            long j4 = (long) (L2 & 1048575);
            switch (i25) {
                case 0:
                    j2 = 0;
                    if ((i23 & i2) != 0) {
                        i22 += r81.q(i24, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j2 = 0;
                    if ((i23 & i2) != 0) {
                        i22 += r81.r(i24, 0.0f);
                        break;
                    }
                case 2:
                    j2 = 0;
                    if ((i23 & i2) != 0) {
                        i4 = r81.i0(i24, unsafe2.getLong(t, j4));
                        i22 += i4;
                    }
                    break;
                case 3:
                    j2 = 0;
                    if ((i23 & i2) != 0) {
                        i4 = r81.r0(i24, unsafe2.getLong(t, j4));
                        i22 += i4;
                    }
                    break;
                case 4:
                    j2 = 0;
                    if ((i23 & i2) != 0) {
                        i4 = r81.x0(i24, unsafe2.getInt(t, j4));
                        i22 += i4;
                    }
                    break;
                case 5:
                    j2 = 0;
                    if ((i23 & i2) != 0) {
                        i4 = r81.y0(i24, 0);
                        i22 += i4;
                    }
                    break;
                case 6:
                    if ((i23 & i2) != 0) {
                        i22 += r81.D0(i24, 0);
                        j2 = 0;
                        break;
                    }
                    j2 = 0;
                case 7:
                    if ((i23 & i2) != 0) {
                        i22 += r81.d0(i24, true);
                        j2 = 0;
                        break;
                    }
                    j2 = 0;
                case 8:
                    if ((i23 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j4);
                        if (object instanceof c81) {
                            c0 = r81.Z(i24, (c81) object);
                        } else {
                            c0 = r81.c0(i24, (String) object);
                        }
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 9:
                    if ((i23 & i2) != 0) {
                        c0 = nb1.p(i24, unsafe2.getObject(t, j4), H(i21));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 10:
                    if ((i23 & i2) != 0) {
                        c0 = r81.Z(i24, (c81) unsafe2.getObject(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 11:
                    if ((i23 & i2) != 0) {
                        c0 = r81.A0(i24, unsafe2.getInt(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 12:
                    if ((i23 & i2) != 0) {
                        c0 = r81.F0(i24, unsafe2.getInt(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 13:
                    if ((i23 & i2) != 0) {
                        i5 = r81.E0(i24, 0);
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 14:
                    if ((i23 & i2) != 0) {
                        c0 = r81.B0(i24, 0);
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 15:
                    if ((i23 & i2) != 0) {
                        c0 = r81.C0(i24, unsafe2.getInt(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 16:
                    if ((i23 & i2) != 0) {
                        c0 = r81.u0(i24, unsafe2.getLong(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 17:
                    if ((i23 & i2) != 0) {
                        c0 = r81.b0(i24, (wa1) unsafe2.getObject(t, j4), H(i21));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 18:
                    c0 = nb1.T(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += c0;
                    j2 = 0;
                    break;
                case 19:
                    i6 = nb1.R(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 20:
                    i6 = nb1.I(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 21:
                    i6 = nb1.J(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 22:
                    i6 = nb1.M(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 23:
                    i6 = nb1.T(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 24:
                    i6 = nb1.R(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 25:
                    i6 = nb1.a0(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 26:
                    c0 = nb1.q(i24, (List) unsafe2.getObject(t, j4));
                    i22 += c0;
                    j2 = 0;
                    break;
                case 27:
                    c0 = nb1.r(i24, (List) unsafe2.getObject(t, j4), H(i21));
                    i22 += c0;
                    j2 = 0;
                    break;
                case 28:
                    c0 = nb1.t(i24, (List) unsafe2.getObject(t, j4));
                    i22 += c0;
                    j2 = 0;
                    break;
                case 29:
                    c0 = nb1.N(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += c0;
                    j2 = 0;
                    break;
                case 30:
                    i6 = nb1.L(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 31:
                    i6 = nb1.R(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 32:
                    i6 = nb1.T(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 33:
                    i6 = nb1.P(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 34:
                    i6 = nb1.K(i24, (List) unsafe2.getObject(t, j4), false);
                    i22 += i6;
                    j2 = 0;
                    break;
                case 35:
                    i9 = nb1.k((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 36:
                    i9 = nb1.j((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 37:
                    i9 = nb1.Q((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 38:
                    i9 = nb1.S((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 39:
                    i9 = nb1.c0((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 40:
                    i9 = nb1.k((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 41:
                    i9 = nb1.j((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 42:
                    i9 = nb1.l((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 43:
                    i9 = nb1.d0((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 44:
                    i9 = nb1.b0((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 45:
                    i9 = nb1.j((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 46:
                    i9 = nb1.k((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 47:
                    i9 = nb1.i((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 48:
                    i9 = nb1.U((List) unsafe2.getObject(t, j4));
                    if (i9 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i9);
                        }
                        i8 = r81.H(i24);
                        i7 = r81.J(i9);
                        i5 = i8 + i7 + i9;
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 49:
                    c0 = nb1.u(i24, (List) unsafe2.getObject(t, j4), H(i21));
                    i22 += c0;
                    j2 = 0;
                    break;
                case 50:
                    c0 = this.q.d(i24, unsafe2.getObject(t, j4), I(i21));
                    i22 += c0;
                    j2 = 0;
                    break;
                case 51:
                    if (A(t, i24, i21)) {
                        c0 = r81.q(i24, 0.0d);
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 52:
                    if (A(t, i24, i21)) {
                        i5 = r81.r(i24, 0.0f);
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 53:
                    if (A(t, i24, i21)) {
                        c0 = r81.i0(i24, T(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 54:
                    if (A(t, i24, i21)) {
                        c0 = r81.r0(i24, T(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 55:
                    if (A(t, i24, i21)) {
                        c0 = r81.x0(i24, S(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 56:
                    if (A(t, i24, i21)) {
                        c0 = r81.y0(i24, 0);
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 57:
                    if (A(t, i24, i21)) {
                        i5 = r81.D0(i24, 0);
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 58:
                    if (A(t, i24, i21)) {
                        i5 = r81.d0(i24, true);
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 59:
                    if (A(t, i24, i21)) {
                        Object object2 = unsafe2.getObject(t, j4);
                        if (object2 instanceof c81) {
                            c0 = r81.Z(i24, (c81) object2);
                        } else {
                            c0 = r81.c0(i24, (String) object2);
                        }
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 60:
                    if (A(t, i24, i21)) {
                        c0 = nb1.p(i24, unsafe2.getObject(t, j4), H(i21));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 61:
                    if (A(t, i24, i21)) {
                        c0 = r81.Z(i24, (c81) unsafe2.getObject(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 62:
                    if (A(t, i24, i21)) {
                        c0 = r81.A0(i24, S(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 63:
                    if (A(t, i24, i21)) {
                        c0 = r81.F0(i24, S(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 64:
                    if (A(t, i24, i21)) {
                        i5 = r81.E0(i24, 0);
                        i22 += i5;
                    }
                    j2 = 0;
                    break;
                case 65:
                    if (A(t, i24, i21)) {
                        c0 = r81.B0(i24, 0);
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 66:
                    if (A(t, i24, i21)) {
                        c0 = r81.C0(i24, S(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 67:
                    if (A(t, i24, i21)) {
                        c0 = r81.u0(i24, T(t, j4));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                case 68:
                    if (A(t, i24, i21)) {
                        c0 = r81.b0(i24, (wa1) unsafe2.getObject(t, j4), H(i21));
                        i22 += c0;
                    }
                    j2 = 0;
                    break;
                default:
                    j2 = 0;
                    break;
            }
            i21 += 3;
            i14 = 1;
        }
        int i28 = 0;
        int k2 = i22 + k(this.o, t);
        if (!this.f) {
            return k2;
        }
        b91<?> h2 = this.p.h(t);
        for (int i29 = 0; i29 < h2.a.m(); i29++) {
            Map.Entry<FieldDescriptorType, Object> i30 = h2.a.i(i29);
            i28 += b91.k(i30.getKey(), i30.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : h2.a.n()) {
            i28 += b91.k(entry.getKey(), entry.getValue());
        }
        return k2 + i28;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e2, code lost:
        if (r0 == r8) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020f, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022e, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.lb1
    public final void j(T t, byte[] bArr, int i2, int i3, x71 x71) throws IOException {
        byte b2;
        int i4;
        int i5;
        int i6;
        int i7;
        Unsafe unsafe;
        int i8;
        int i9;
        int i10;
        int i11;
        ab1<T> ab1 = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i12 = i3;
        x71 x712 = x71;
        if (ab1.h) {
            Unsafe unsafe2 = s;
            int i13 = -1;
            int i14 = i2;
            int i15 = -1;
            int i16 = 0;
            while (i14 < i12) {
                int i17 = i14 + 1;
                byte b3 = bArr2[i14];
                if (b3 < 0) {
                    i4 = y71.d(b3, bArr2, i17, x712);
                    b2 = x712.a;
                } else {
                    b2 = b3;
                    i4 = i17;
                }
                int i18 = b2 >>> 3;
                int i19 = b2 & 7;
                if (i18 > i15) {
                    i5 = ab1.V(i18, i16 / 3);
                } else {
                    i5 = ab1.O(i18);
                }
                if (i5 == i13) {
                    i6 = i18;
                    i8 = i4;
                    unsafe = unsafe2;
                    i7 = 0;
                } else {
                    int i20 = ab1.a[i5 + 1];
                    int i21 = (267386880 & i20) >>> 20;
                    long j2 = (long) (1048575 & i20);
                    if (i21 <= 17) {
                        boolean z = true;
                        switch (i21) {
                            case 0:
                                i10 = i5;
                                if (i19 == 1) {
                                    kc1.d(t2, j2, y71.m(bArr2, i4));
                                    i14 = i4 + 8;
                                    i15 = i18;
                                    i16 = i10;
                                    break;
                                }
                                i6 = i18;
                                i9 = i4;
                                unsafe = unsafe2;
                                i7 = i10;
                                i8 = i9;
                                break;
                            case 1:
                                i10 = i5;
                                if (i19 == 5) {
                                    kc1.e(t2, j2, y71.o(bArr2, i4));
                                    i14 = i4 + 4;
                                    i15 = i18;
                                    i16 = i10;
                                    break;
                                }
                                i6 = i18;
                                i9 = i4;
                                unsafe = unsafe2;
                                i7 = i10;
                                i8 = i9;
                                break;
                            case 2:
                            case 3:
                                i10 = i5;
                                if (i19 == 0) {
                                    i11 = y71.k(bArr2, i4, x712);
                                    unsafe2.putLong(t, j2, x712.b);
                                    i14 = i11;
                                    i15 = i18;
                                    i16 = i10;
                                    break;
                                }
                                i6 = i18;
                                i9 = i4;
                                unsafe = unsafe2;
                                i7 = i10;
                                i8 = i9;
                                break;
                            case 4:
                            case 11:
                                i10 = i5;
                                if (i19 == 0) {
                                    i14 = y71.i(bArr2, i4, x712);
                                    unsafe2.putInt(t2, j2, x712.a);
                                    i15 = i18;
                                    i16 = i10;
                                    break;
                                }
                                i6 = i18;
                                i9 = i4;
                                unsafe = unsafe2;
                                i7 = i10;
                                i8 = i9;
                                break;
                            case 5:
                            case 14:
                                if (i19 == 1) {
                                    i10 = i5;
                                    unsafe2.putLong(t, j2, y71.l(bArr2, i4));
                                    i14 = i4 + 8;
                                    i15 = i18;
                                    i16 = i10;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                if (i19 == 5) {
                                    unsafe2.putInt(t2, j2, y71.h(bArr2, i4));
                                    i14 = i4 + 4;
                                    i16 = i5;
                                    i15 = i18;
                                    break;
                                }
                                break;
                            case 7:
                                if (i19 == 0) {
                                    int k2 = y71.k(bArr2, i4, x712);
                                    if (x712.b == 0) {
                                        z = false;
                                    }
                                    kc1.h(t2, j2, z);
                                    i14 = k2;
                                    i16 = i5;
                                    i15 = i18;
                                    break;
                                }
                                break;
                            case 8:
                                if (i19 == 2) {
                                    if ((536870912 & i20) == 0) {
                                        i14 = y71.n(bArr2, i4, x712);
                                    } else {
                                        i14 = y71.p(bArr2, i4, x712);
                                    }
                                    unsafe2.putObject(t2, j2, x712.c);
                                    i16 = i5;
                                    i15 = i18;
                                    break;
                                }
                                break;
                            case 9:
                                if (i19 == 2) {
                                    i14 = y71.g(ab1.H(i5), bArr2, i4, i12, x712);
                                    Object object = unsafe2.getObject(t2, j2);
                                    if (object == null) {
                                        unsafe2.putObject(t2, j2, x712.c);
                                    } else {
                                        unsafe2.putObject(t2, j2, m91.d(object, x712.c));
                                    }
                                    i16 = i5;
                                    i15 = i18;
                                    break;
                                }
                                break;
                            case 10:
                                if (i19 == 2) {
                                    i14 = y71.q(bArr2, i4, x712);
                                    unsafe2.putObject(t2, j2, x712.c);
                                    i16 = i5;
                                    i15 = i18;
                                    break;
                                }
                                break;
                            case 12:
                                i10 = i5;
                                if (i19 == 0) {
                                    i14 = y71.i(bArr2, i4, x712);
                                    unsafe2.putInt(t2, j2, x712.a);
                                    i15 = i18;
                                    i16 = i10;
                                    break;
                                }
                                i6 = i18;
                                i9 = i4;
                                unsafe = unsafe2;
                                i7 = i10;
                                i8 = i9;
                                break;
                            case 15:
                                i10 = i5;
                                if (i19 == 0) {
                                    i14 = y71.i(bArr2, i4, x712);
                                    unsafe2.putInt(t2, j2, o81.l(x712.a));
                                    i15 = i18;
                                    i16 = i10;
                                    break;
                                }
                                i6 = i18;
                                i9 = i4;
                                unsafe = unsafe2;
                                i7 = i10;
                                i8 = i9;
                                break;
                            case 16:
                                if (i19 == 0) {
                                    i11 = y71.k(bArr2, i4, x712);
                                    i10 = i5;
                                    unsafe2.putLong(t, j2, o81.m(x712.b));
                                    i14 = i11;
                                    i15 = i18;
                                    i16 = i10;
                                    break;
                                }
                                break;
                        }
                        i13 = -1;
                    } else if (i21 != 27) {
                        i7 = i5;
                        if (i21 <= 49) {
                            i6 = i18;
                            unsafe = unsafe2;
                            i14 = m(t, bArr, i4, i3, b2, i18, i19, i7, (long) i20, i21, j2, x71);
                        } else {
                            i6 = i18;
                            i9 = i4;
                            unsafe = unsafe2;
                            if (i21 == 50) {
                                if (i19 == 2) {
                                    i14 = n(t, bArr, i9, i3, i7, j2, x71);
                                }
                                i8 = i9;
                            } else {
                                i14 = l(t, bArr, i9, i3, b2, i6, i19, i20, i21, j2, i7, x71);
                            }
                        }
                        i8 = i14;
                    } else if (i19 == 2) {
                        s91 s91 = (s91) unsafe2.getObject(t2, j2);
                        if (!s91.n0()) {
                            int size = s91.size();
                            s91 = s91.Z0(size == 0 ? 10 : size << 1);
                            unsafe2.putObject(t2, j2, s91);
                        }
                        i14 = y71.e(ab1.H(i5), b2, bArr, i4, i3, s91, x71);
                        i15 = i18;
                        i16 = i5;
                        i13 = -1;
                    }
                    i7 = i5;
                    i6 = i18;
                    i9 = i4;
                    unsafe = unsafe2;
                    i8 = i9;
                }
                i14 = y71.c(b2, bArr, i8, i3, X(t), x71);
                ab1 = this;
                t2 = t;
                bArr2 = bArr;
                i12 = i3;
                x712 = x71;
                unsafe2 = unsafe;
                i16 = i7;
                i15 = i6;
                i13 = -1;
            }
            if (i14 != i12) {
                throw v91.i();
            }
            return;
        }
        o(t, bArr, i2, i3, 0, x71);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x036a, code lost:
        if (r0 == r4) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03b3, code lost:
        if (r0 == r15) goto L_0x03dd;
     */
    public final int o(T t, byte[] bArr, int i2, int i3, int i4, x71 x71) throws IOException {
        Unsafe unsafe;
        int i5;
        T t2;
        ab1<T> ab1;
        byte b2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        T t3;
        x71 x712;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        x71 x713;
        x71 x714;
        int i20;
        x71 x715;
        ab1<T> ab12 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i21 = i3;
        int i22 = i4;
        x71 x716 = x71;
        Unsafe unsafe2 = s;
        int i23 = i2;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        while (true) {
            if (i23 < i21) {
                int i29 = i23 + 1;
                byte b3 = bArr2[i23];
                if (b3 < 0) {
                    i6 = y71.d(b3, bArr2, i29, x716);
                    b2 = x716.a;
                } else {
                    b2 = b3;
                    i6 = i29;
                }
                int i30 = b2 >>> 3;
                int i31 = b2 & 7;
                if (i30 > i24) {
                    i7 = ab12.V(i30, i25 / 3);
                } else {
                    i7 = ab12.O(i30);
                }
                if (i7 == -1) {
                    i8 = i30;
                    i11 = i6;
                    i10 = b2;
                    unsafe = unsafe2;
                    i5 = i22;
                    i9 = 0;
                } else {
                    int[] iArr = ab12.a;
                    int i32 = iArr[i7 + 1];
                    int i33 = (i32 & 267386880) >>> 20;
                    long j2 = (long) (i32 & 1048575);
                    if (i33 <= 17) {
                        int i34 = iArr[i7 + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        if (i36 != i28) {
                            if (i28 != -1) {
                                unsafe2.putInt(t4, (long) i28, i27);
                            }
                            i27 = unsafe2.getInt(t4, (long) i36);
                            i28 = i36;
                        }
                        switch (i33) {
                            case 0:
                                i17 = i7;
                                i16 = i30;
                                i15 = i28;
                                i18 = b2;
                                bArr2 = bArr;
                                x713 = x71;
                                i19 = i6;
                                if (i31 == 1) {
                                    kc1.d(t4, j2, y71.m(bArr2, i19));
                                    i23 = i19 + 8;
                                    i27 |= i35;
                                    i28 = i15;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x713;
                                    i21 = i3;
                                    i22 = i4;
                                    break;
                                }
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 1:
                                i17 = i7;
                                i16 = i30;
                                i15 = i28;
                                i18 = b2;
                                bArr2 = bArr;
                                x713 = x71;
                                i19 = i6;
                                if (i31 == 5) {
                                    kc1.e(t4, j2, y71.o(bArr2, i19));
                                    i23 = i19 + 4;
                                    i27 |= i35;
                                    i28 = i15;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x713;
                                    i21 = i3;
                                    i22 = i4;
                                    break;
                                }
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 2:
                            case 3:
                                i17 = i7;
                                i16 = i30;
                                i15 = i28;
                                i18 = b2;
                                bArr2 = bArr;
                                i19 = i6;
                                if (i31 == 0) {
                                    int k2 = y71.k(bArr2, i19, x71);
                                    unsafe2.putLong(t, j2, x71.b);
                                    i27 |= i35;
                                    i23 = k2;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x71;
                                    i28 = i15;
                                    i21 = i3;
                                    i22 = i4;
                                    break;
                                }
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 4:
                            case 11:
                                i17 = i7;
                                i16 = i30;
                                i15 = i28;
                                i18 = b2;
                                bArr2 = bArr;
                                x713 = x71;
                                i19 = i6;
                                if (i31 == 0) {
                                    i23 = y71.i(bArr2, i19, x713);
                                    unsafe2.putInt(t4, j2, x713.a);
                                    i27 |= i35;
                                    i28 = i15;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x713;
                                    i21 = i3;
                                    i22 = i4;
                                    break;
                                }
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 5:
                            case 14:
                                i17 = i7;
                                i16 = i30;
                                i18 = b2;
                                bArr2 = bArr;
                                x713 = x71;
                                if (i31 == 1) {
                                    i15 = i28;
                                    i19 = i6;
                                    unsafe2.putLong(t, j2, y71.l(bArr2, i6));
                                    i23 = i19 + 8;
                                    i27 |= i35;
                                    i28 = i15;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x713;
                                    i21 = i3;
                                    i22 = i4;
                                    break;
                                }
                                i15 = i28;
                                i19 = i6;
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 6:
                            case 13:
                                i20 = i3;
                                i17 = i7;
                                i16 = i30;
                                i18 = b2;
                                bArr2 = bArr;
                                x714 = x71;
                                if (i31 == 5) {
                                    unsafe2.putInt(t4, j2, y71.h(bArr2, i6));
                                    i23 = i6 + 4;
                                    i27 |= i35;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x714;
                                    i22 = i4;
                                    i21 = i20;
                                    break;
                                }
                                i15 = i28;
                                i19 = i6;
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 7:
                                i20 = i3;
                                i17 = i7;
                                i16 = i30;
                                i18 = b2;
                                bArr2 = bArr;
                                x714 = x71;
                                if (i31 == 0) {
                                    int k3 = y71.k(bArr2, i6, x714);
                                    kc1.h(t4, j2, x714.b != 0);
                                    i27 |= i35;
                                    i23 = k3;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x714;
                                    i22 = i4;
                                    i21 = i20;
                                    break;
                                }
                                i15 = i28;
                                i19 = i6;
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 8:
                                i20 = i3;
                                i17 = i7;
                                i16 = i30;
                                i18 = b2;
                                bArr2 = bArr;
                                x714 = x71;
                                if (i31 == 2) {
                                    if ((i32 & 536870912) == 0) {
                                        i23 = y71.n(bArr2, i6, x714);
                                    } else {
                                        i23 = y71.p(bArr2, i6, x714);
                                    }
                                    unsafe2.putObject(t4, j2, x714.c);
                                    i27 |= i35;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x714;
                                    i22 = i4;
                                    i21 = i20;
                                    break;
                                }
                                i15 = i28;
                                i19 = i6;
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 9:
                                i17 = i7;
                                i16 = i30;
                                i18 = b2;
                                bArr2 = bArr;
                                x714 = x71;
                                if (i31 == 2) {
                                    i20 = i3;
                                    i23 = y71.g(ab12.H(i17), bArr2, i6, i20, x714);
                                    if ((i27 & i35) == 0) {
                                        unsafe2.putObject(t4, j2, x714.c);
                                    } else {
                                        unsafe2.putObject(t4, j2, m91.d(unsafe2.getObject(t4, j2), x714.c));
                                    }
                                    i27 |= i35;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x714;
                                    i22 = i4;
                                    i21 = i20;
                                    break;
                                } else {
                                    i15 = i28;
                                    i19 = i6;
                                    i11 = i19;
                                    i9 = i17;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i28 = i15;
                                    i10 = i18;
                                    i5 = i4;
                                    break;
                                }
                            case 10:
                                i17 = i7;
                                i16 = i30;
                                i18 = b2;
                                bArr2 = bArr;
                                x713 = x71;
                                if (i31 == 2) {
                                    i23 = y71.q(bArr2, i6, x713);
                                    unsafe2.putObject(t4, j2, x713.c);
                                    i27 |= i35;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x713;
                                    i21 = i3;
                                    i22 = i4;
                                    break;
                                }
                                i15 = i28;
                                i19 = i6;
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 12:
                                i17 = i7;
                                i16 = i30;
                                i18 = b2;
                                bArr2 = bArr;
                                x713 = x71;
                                if (i31 == 0) {
                                    i23 = y71.i(bArr2, i6, x713);
                                    int i37 = x713.a;
                                    r91 J = ab12.J(i17);
                                    if (J == null || J.a(i37)) {
                                        unsafe2.putInt(t4, j2, i37);
                                        i27 |= i35;
                                        i26 = i18;
                                        i25 = i17;
                                        i24 = i16;
                                        x716 = x713;
                                        i21 = i3;
                                        i22 = i4;
                                        break;
                                    } else {
                                        X(t).c(i18, Long.valueOf((long) i37));
                                        i26 = i18;
                                        i25 = i17;
                                        i24 = i16;
                                        x716 = x713;
                                        i21 = i3;
                                        i22 = i4;
                                    }
                                }
                                i15 = i28;
                                i19 = i6;
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 15:
                                i17 = i7;
                                i16 = i30;
                                i18 = b2;
                                bArr2 = bArr;
                                x713 = x71;
                                if (i31 == 0) {
                                    i23 = y71.i(bArr2, i6, x713);
                                    unsafe2.putInt(t4, j2, o81.l(x713.a));
                                    i27 |= i35;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x713;
                                    i21 = i3;
                                    i22 = i4;
                                    break;
                                }
                                i15 = i28;
                                i19 = i6;
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                            case 16:
                                i17 = i7;
                                i16 = i30;
                                i18 = b2;
                                if (i31 == 0) {
                                    bArr2 = bArr;
                                    int k4 = y71.k(bArr2, i6, x71);
                                    x713 = x71;
                                    unsafe2.putLong(t, j2, o81.m(x71.b));
                                    i27 |= i35;
                                    i23 = k4;
                                    i26 = i18;
                                    i25 = i17;
                                    i24 = i16;
                                    x716 = x713;
                                    i21 = i3;
                                    i22 = i4;
                                    break;
                                } else {
                                    i15 = i28;
                                    i19 = i6;
                                    i11 = i19;
                                    i9 = i17;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i28 = i15;
                                    i10 = i18;
                                    i5 = i4;
                                    break;
                                }
                            case 17:
                                if (i31 == 3) {
                                    i23 = y71.f(ab12.H(i7), bArr, i6, i3, (i30 << 3) | 4, x71);
                                    if ((i27 & i35) == 0) {
                                        x715 = x71;
                                        unsafe2.putObject(t4, j2, x715.c);
                                    } else {
                                        x715 = x71;
                                        unsafe2.putObject(t4, j2, m91.d(unsafe2.getObject(t4, j2), x715.c));
                                    }
                                    i27 |= i35;
                                    bArr2 = bArr;
                                    i21 = i3;
                                    i26 = b2;
                                    i25 = i7;
                                    i24 = i30;
                                    i22 = i4;
                                    x716 = x715;
                                    break;
                                } else {
                                    i17 = i7;
                                    i16 = i30;
                                    i18 = b2;
                                    i15 = i28;
                                    i19 = i6;
                                    i11 = i19;
                                    i9 = i17;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i28 = i15;
                                    i10 = i18;
                                    i5 = i4;
                                    break;
                                }
                            default:
                                i17 = i7;
                                i16 = i30;
                                i15 = i28;
                                i18 = b2;
                                i19 = i6;
                                i11 = i19;
                                i9 = i17;
                                unsafe = unsafe2;
                                i8 = i16;
                                i28 = i15;
                                i10 = i18;
                                i5 = i4;
                                break;
                        }
                    } else {
                        bArr2 = bArr;
                        if (i33 != 27) {
                            i13 = i27;
                            if (i33 <= 49) {
                                i8 = i30;
                                i12 = b2;
                                i9 = i7;
                                unsafe = unsafe2;
                                i23 = m(t, bArr, i6, i3, b2, i30, i31, i7, (long) i32, i33, j2, x71);
                            } else {
                                i8 = i30;
                                i14 = i6;
                                i12 = b2;
                                i9 = i7;
                                unsafe = unsafe2;
                                if (i33 != 50) {
                                    i23 = l(t, bArr, i14, i3, i12, i8, i31, i32, i33, j2, i9, x71);
                                    if (i23 != i14) {
                                        ab12 = this;
                                        t4 = t;
                                        i21 = i3;
                                        i22 = i4;
                                        i26 = i12;
                                        i24 = i8;
                                        i28 = i28;
                                        i25 = i9;
                                        i27 = i13;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        x716 = x71;
                                    }
                                } else if (i31 == 2) {
                                    i23 = n(t, bArr, i14, i3, i9, j2, x71);
                                }
                                i5 = i4;
                                i11 = i23;
                                i28 = i28;
                                i27 = i13;
                                i10 = i12;
                            }
                            ab12 = this;
                            t4 = t;
                            bArr2 = bArr;
                            i21 = i3;
                            i22 = i4;
                            x716 = x71;
                            i28 = i28;
                            i25 = i9;
                            i27 = i13;
                            i24 = i8;
                            i26 = i12;
                            unsafe2 = unsafe;
                        } else if (i31 == 2) {
                            s91 s91 = (s91) unsafe2.getObject(t4, j2);
                            if (!s91.n0()) {
                                int size = s91.size();
                                s91 = s91.Z0(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j2, s91);
                            }
                            i23 = y71.e(ab12.H(i7), b2, bArr, i6, i3, s91, x71);
                            i22 = i4;
                            i24 = i30;
                            i26 = b2;
                            i25 = i7;
                            x716 = x716;
                            i28 = i28;
                            i27 = i27;
                            i21 = i3;
                        } else {
                            i13 = i27;
                            i8 = i30;
                            i14 = i6;
                            i12 = b2;
                            i9 = i7;
                            unsafe = unsafe2;
                        }
                        i5 = i4;
                        i11 = i14;
                        i28 = i28;
                        i27 = i13;
                        i10 = i12;
                    }
                }
                if (i10 != i5 || i5 == 0) {
                    if (this.f) {
                        x712 = x71;
                        if (x712.d == y81.d()) {
                            t3 = t;
                        } else if (x712.d.a(this.e, i8) == null) {
                            i23 = y71.c(i10, bArr, i11, i3, X(t), x71);
                            t4 = t;
                            i21 = i3;
                            i26 = i10;
                            ab12 = this;
                            x716 = x712;
                            i24 = i8;
                            i25 = i9;
                            unsafe2 = unsafe;
                            bArr2 = bArr;
                            i22 = i5;
                        } else {
                            T t5 = t;
                            t5.C();
                            b91<Object> b91 = t5.zzaic;
                            throw new NoSuchMethodError();
                        }
                    } else {
                        t3 = t;
                        x712 = x71;
                    }
                    i23 = y71.c(i10, bArr, i11, i3, X(t), x71);
                    i26 = i10;
                    ab12 = this;
                    x716 = x712;
                    i24 = i8;
                    t4 = t3;
                    i25 = i9;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i21 = i3;
                    i22 = i5;
                } else {
                    ab1 = this;
                    t2 = t;
                    i23 = i11;
                    i26 = i10;
                }
            } else {
                unsafe = unsafe2;
                i5 = i22;
                t2 = t4;
                ab1 = ab12;
            }
        }
        if (i28 != -1) {
            unsafe.putInt(t2, (long) i28, i27);
        }
        hc1 hc1 = null;
        for (int i38 = ab1.k; i38 < ab1.l; i38++) {
            hc1 = (hc1) ab1.s(t2, ab1.j[i38], hc1, (ec1<UT, UB>) ab1.o);
        }
        if (hc1 != null) {
            ab1.o.k(t2, hc1);
        }
        if (i5 == 0) {
            if (i23 != i3) {
                throw v91.i();
            }
        } else if (i23 > i3 || i26 != i5) {
            throw v91.i();
        }
        return i23;
    }
}
