package defpackage;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: xq  reason: default package */
/* compiled from: TiffReader */
public class xq {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;

    static {
        C0201.m83(xq.class, 54);
    }

    private static int a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f A[SYNTHETIC, Splitter:B:55:0x011f] */
    public static void b(uq uqVar, kr krVar, Set<Integer> set, int i, int i2) throws IOException {
        Throwable th;
        Boolean bool;
        int i3;
        int i4;
        long j;
        long j2;
        boolean z;
        Boolean bool2 = null;
        try {
            if (set.contains(Integer.valueOf(i))) {
                uqVar.i();
                return;
            }
            set.add(Integer.valueOf(i));
            if (((long) i) >= krVar.k() || i < 0) {
                uqVar.c(e);
                uqVar.i();
                return;
            }
            int s = krVar.s(i);
            if (s > 255 && (s & 255) == 0) {
                bool2 = Boolean.valueOf(krVar.v());
                s >>= 8;
                krVar.w(!krVar.v());
            }
            Boolean bool3 = bool2;
            int i5 = s;
            int i6 = 2;
            try {
                if (((long) ((i5 * 12) + 2 + 4 + i)) > krVar.k()) {
                    try {
                        uqVar.c(f);
                        uqVar.i();
                        if (bool3 != null) {
                            krVar.w(bool3.booleanValue());
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bool2 = bool3;
                        uqVar.i();
                        if (bool2 != null) {
                            krVar.w(bool2.booleanValue());
                        }
                        throw th;
                    }
                } else {
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < i5) {
                        int a2 = a(i, i7);
                        int s2 = krVar.s(a2);
                        int s3 = krVar.s(a2 + 2);
                        tq a3 = tq.a(s3);
                        long t = krVar.t(a2 + 4);
                        if (a3 == null) {
                            Long f2 = uqVar.f(s2, s3, t);
                            if (f2 == null) {
                                String str = b;
                                Object[] objArr = new Object[i6];
                                objArr[0] = Integer.valueOf(s3);
                                objArr[1] = Integer.valueOf(s2);
                                uqVar.c(String.format(str, objArr));
                                int i9 = i8 + 1;
                                if (i9 > 5) {
                                    uqVar.c(d);
                                    uqVar.i();
                                    if (bool3 != null) {
                                        krVar.w(bool3.booleanValue());
                                        return;
                                    }
                                    return;
                                }
                                i8 = i9;
                            } else {
                                j = f2.longValue();
                                String str2 = a;
                                if (j <= 4) {
                                    long t2 = krVar.t(a2 + 8);
                                    if (t2 + j > krVar.k()) {
                                        uqVar.c(str2);
                                    } else {
                                        bool = bool3;
                                        i3 = i5;
                                        j2 = ((long) i2) + t2;
                                    }
                                } else {
                                    bool = bool3;
                                    i3 = i5;
                                    j2 = (long) (a2 + 8);
                                }
                                if (j2 >= 0) {
                                    try {
                                        if (j2 <= krVar.k()) {
                                            if (j >= 0) {
                                                if (j2 + j <= krVar.k()) {
                                                    i4 = i7;
                                                    if (j == 4 * t) {
                                                        boolean z2 = false;
                                                        for (int i10 = 0; ((long) i10) < t; i10++) {
                                                            if (uqVar.w(s2)) {
                                                                b(uqVar, krVar, set, krVar.h((int) (((long) (i10 * 4)) + j2)) + i2, i2);
                                                                z2 = true;
                                                            }
                                                        }
                                                        z = z2;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (!z) {
                                                        int i11 = (int) j2;
                                                        if (!uqVar.g(i11, set, i2, krVar, s2, (int) j)) {
                                                            c(uqVar, s2, i11, (int) t, s3, krVar);
                                                        }
                                                        i7 = i4 + 1;
                                                        i5 = i3;
                                                        bool3 = bool;
                                                        i6 = 2;
                                                    }
                                                    i7 = i4 + 1;
                                                    i5 = i3;
                                                    bool3 = bool;
                                                    i6 = 2;
                                                }
                                            }
                                            i4 = i7;
                                            uqVar.c(c + j);
                                            i7 = i4 + 1;
                                            i5 = i3;
                                            bool3 = bool;
                                            i6 = 2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bool2 = bool;
                                        uqVar.i();
                                        if (bool2 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                i4 = i7;
                                uqVar.c(str2);
                                i7 = i4 + 1;
                                i5 = i3;
                                bool3 = bool;
                                i6 = 2;
                            }
                        } else {
                            j = ((long) a3.b()) * t;
                            String str22 = a;
                            if (j <= 4) {
                            }
                            if (j2 >= 0) {
                            }
                            i4 = i7;
                            uqVar.c(str22);
                            i7 = i4 + 1;
                            i5 = i3;
                            bool3 = bool;
                            i6 = 2;
                        }
                        i4 = i7;
                        bool = bool3;
                        i3 = i5;
                        i7 = i4 + 1;
                        i5 = i3;
                        bool3 = bool;
                        i6 = 2;
                    }
                    int h = krVar.h(a(i, i5));
                    if (h != 0) {
                        int i12 = h + i2;
                        if (((long) i12) >= krVar.k()) {
                            uqVar.i();
                            if (bool3 != null) {
                                krVar.w(bool3.booleanValue());
                                return;
                            }
                            return;
                        } else if (i12 < i) {
                            uqVar.i();
                            if (bool3 != null) {
                                krVar.w(bool3.booleanValue());
                                return;
                            }
                            return;
                        } else if (uqVar.b()) {
                            b(uqVar, krVar, set, i12, i2);
                        }
                    }
                    uqVar.i();
                    if (bool3 != null) {
                        krVar.w(bool3.booleanValue());
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bool = bool3;
                bool2 = bool;
                uqVar.i();
                if (bool2 != null) {
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            uqVar.i();
            if (bool2 != null) {
            }
            throw th;
        }
    }

    private static void c(uq uqVar, int i, int i2, int i3, int i4, kr krVar) throws IOException {
        int i5 = 0;
        switch (i4) {
            case 1:
                if (i3 == 1) {
                    uqVar.j(i, krVar.u(i2));
                    return;
                }
                short[] sArr = new short[i3];
                while (i5 < i3) {
                    sArr[i5] = krVar.u(i2 + i5);
                    i5++;
                }
                uqVar.m(i, sArr);
                return;
            case 2:
                uqVar.p(i, krVar.n(i2, i3, null));
                return;
            case 3:
                if (i3 == 1) {
                    uqVar.r(i, krVar.s(i2));
                    return;
                }
                int[] iArr = new int[i3];
                while (i5 < i3) {
                    iArr[i5] = krVar.s((i5 * 2) + i2);
                    i5++;
                }
                uqVar.v(i, iArr);
                return;
            case 4:
                if (i3 == 1) {
                    uqVar.o(i, krVar.t(i2));
                    return;
                }
                long[] jArr = new long[i3];
                while (i5 < i3) {
                    jArr[i5] = krVar.t((i5 * 4) + i2);
                    i5++;
                }
                uqVar.A(i, jArr);
                return;
            case 5:
                if (i3 == 1) {
                    uqVar.B(i, new mr(krVar.t(i2), krVar.t(i2 + 4)));
                    return;
                } else if (i3 > 1) {
                    mr[] mrVarArr = new mr[i3];
                    while (i5 < i3) {
                        int i6 = i5 * 8;
                        mrVarArr[i5] = new mr(krVar.t(i2 + i6), krVar.t(i2 + 4 + i6));
                        i5++;
                    }
                    uqVar.d(i, mrVarArr);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i3 == 1) {
                    uqVar.y(i, krVar.j(i2));
                    return;
                }
                byte[] bArr = new byte[i3];
                while (i5 < i3) {
                    bArr[i5] = krVar.j(i2 + i5);
                    i5++;
                }
                uqVar.x(i, bArr);
                return;
            case 7:
                uqVar.k(i, krVar.c(i2, i3));
                return;
            case 8:
                if (i3 == 1) {
                    uqVar.t(i, krVar.f(i2));
                    return;
                }
                short[] sArr2 = new short[i3];
                while (i5 < i3) {
                    sArr2[i5] = krVar.f((i5 * 2) + i2);
                    i5++;
                }
                uqVar.n(i, sArr2);
                return;
            case 9:
                if (i3 == 1) {
                    uqVar.z(i, krVar.h(i2));
                    return;
                }
                int[] iArr2 = new int[i3];
                while (i5 < i3) {
                    iArr2[i5] = krVar.h((i5 * 4) + i2);
                    i5++;
                }
                uqVar.h(i, iArr2);
                return;
            case 10:
                if (i3 == 1) {
                    uqVar.B(i, new mr((long) krVar.h(i2), (long) krVar.h(i2 + 4)));
                    return;
                } else if (i3 > 1) {
                    mr[] mrVarArr2 = new mr[i3];
                    while (i5 < i3) {
                        int i7 = i5 * 8;
                        mrVarArr2[i5] = new mr((long) krVar.h(i2 + i7), (long) krVar.h(i2 + 4 + i7));
                        i5++;
                    }
                    uqVar.d(i, mrVarArr2);
                    return;
                } else {
                    return;
                }
            case 11:
                if (i3 == 1) {
                    uqVar.l(i, krVar.e(i2));
                    return;
                }
                float[] fArr = new float[i3];
                while (i5 < i3) {
                    fArr[i5] = krVar.e((i5 * 4) + i2);
                    i5++;
                }
                uqVar.s(i, fArr);
                return;
            case 12:
                if (i3 == 1) {
                    uqVar.a(i, krVar.d(i2));
                    return;
                }
                double[] dArr = new double[i3];
                while (i5 < i3) {
                    dArr[i5] = krVar.d((i5 * 4) + i2);
                    i5++;
                }
                uqVar.u(i, dArr);
                return;
            default:
                uqVar.c(String.format(C0201.m82(18009), Integer.valueOf(i4), Integer.valueOf(i)));
                return;
        }
    }

    public void d(kr krVar, uq uqVar, int i) throws wq, IOException {
        short f2 = krVar.f(i);
        if (f2 == 19789) {
            krVar.w(true);
        } else if (f2 == 18761) {
            krVar.w(false);
        } else {
            throw new wq(C0201.m82(18011) + ((int) f2));
        }
        int i2 = i + 2;
        uqVar.e(krVar.s(i2));
        int h = krVar.h(i + 4) + i;
        if (((long) h) >= krVar.k() - 1) {
            uqVar.q(C0201.m82(18010));
            h = i2 + 2 + 4;
        }
        b(uqVar, krVar, new HashSet(), h, i);
    }
}
