package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: au0  reason: default package */
public final class au0 {
    public static int a(int i, byte[] bArr, int i2, int i3, bu0 bu0) throws qv0 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return g(bArr, i2, bu0);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return e(bArr, i2, bu0) + bu0.a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = e(bArr, i2, bu0);
                    i6 = bu0.a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, bu0);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw qv0.d();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw qv0.b();
            }
        } else {
            throw qv0.b();
        }
    }

    public static int b(int i, byte[] bArr, int i2, int i3, pv0<?> pv0, bu0 bu0) {
        lv0 lv0 = (lv0) pv0;
        int e = e(bArr, i2, bu0);
        while (true) {
            lv0.c(bu0.a);
            if (e >= i3) {
                break;
            }
            int e2 = e(bArr, e, bu0);
            if (i != bu0.a) {
                break;
            }
            e = e(bArr, e2, bu0);
        }
        return e;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, by0 by0, bu0 bu0) throws IOException {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int g = g(bArr, i2, bu0);
                by0.e(i, Long.valueOf(bu0.b));
                return g;
            } else if (i4 == 1) {
                by0.e(i, Long.valueOf(k(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int e = e(bArr, i2, bu0);
                int i5 = bu0.a;
                by0.e(i, i5 == 0 ? fu0.b : fu0.i(bArr, e, i5));
                return e + i5;
            } else if (i4 == 3) {
                by0 i6 = by0.i();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int e2 = e(bArr, i2, bu0);
                    int i9 = bu0.a;
                    i8 = i9;
                    if (i9 == i7) {
                        i2 = e2;
                        break;
                    }
                    int c = c(i8, bArr, e2, i3, i6, bu0);
                    i8 = i9;
                    i2 = c;
                }
                if (i2 > i3 || i8 != i7) {
                    throw qv0.d();
                }
                by0.e(i, i6);
                return i2;
            } else if (i4 == 5) {
                by0.e(i, Integer.valueOf(h(bArr, i2)));
                return i2 + 4;
            } else {
                throw qv0.b();
            }
        } else {
            throw qv0.b();
        }
    }

    public static int d(int i, byte[] bArr, int i2, bu0 bu0) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                bu0.a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            bu0.a = i7 | i3;
            return i8;
        }
        bu0.a = i5 | i4;
        return i6;
    }

    public static int e(byte[] bArr, int i, bu0 bu0) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return d(b, bArr, i2, bu0);
        }
        bu0.a = b;
        return i2;
    }

    public static int f(byte[] bArr, int i, pv0<?> pv0, bu0 bu0) throws IOException {
        lv0 lv0 = (lv0) pv0;
        int e = e(bArr, i, bu0);
        int i2 = bu0.a + e;
        while (e < i2) {
            e = e(bArr, e, bu0);
            lv0.c(bu0.a);
        }
        if (e == i2) {
            return e;
        }
        throw qv0.a();
    }

    public static int g(byte[] bArr, int i, bu0 bu0) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            bu0.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            b = b2;
            i3 = i5;
        }
        bu0.b = j2;
        return i3;
    }

    public static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int i(byte[] bArr, int i, bu0 bu0) {
        int e = e(bArr, i, bu0);
        int i2 = bu0.a;
        if (i2 == 0) {
            bu0.c = C0201.m82(7734);
            return e;
        }
        bu0.c = new String(bArr, e, i2, mv0.a);
        return e + i2;
    }

    public static int j(byte[] bArr, int i, bu0 bu0) throws IOException {
        int e = e(bArr, i, bu0);
        int i2 = bu0.a;
        if (i2 == 0) {
            bu0.c = C0201.m82(7735);
            return e;
        }
        int i3 = e + i2;
        if (jy0.i(bArr, e, i3)) {
            bu0.c = new String(bArr, e, i2, mv0.a);
            return i3;
        }
        throw qv0.e();
    }

    public static long k(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static double l(byte[] bArr, int i) {
        return Double.longBitsToDouble(k(bArr, i));
    }

    public static int m(byte[] bArr, int i, bu0 bu0) {
        int e = e(bArr, i, bu0);
        int i2 = bu0.a;
        if (i2 == 0) {
            bu0.c = fu0.b;
            return e;
        }
        bu0.c = fu0.i(bArr, e, i2);
        return e + i2;
    }

    public static float n(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }
}
