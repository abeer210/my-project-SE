package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: y71  reason: default package */
public final class y71 {
    public static int a(int i, byte[] bArr, int i2, int i3, x71 x71) throws v91 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return k(bArr, i2, x71);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return i(bArr, i2, x71) + x71.a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = i(bArr, i2, x71);
                    i6 = x71.a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, x71);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw v91.i();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw v91.e();
            }
        } else {
            throw v91.e();
        }
    }

    public static int b(int i, byte[] bArr, int i2, int i3, s91<?> s91, x71 x71) {
        o91 o91 = (o91) s91;
        int i4 = i(bArr, i2, x71);
        o91.e(x71.a);
        while (i4 < i3) {
            int i5 = i(bArr, i4, x71);
            if (i != x71.a) {
                break;
            }
            i4 = i(bArr, i5, x71);
            o91.e(x71.a);
        }
        return i4;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, hc1 hc1, x71 x71) throws v91 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int k = k(bArr, i2, x71);
                hc1.c(i, Long.valueOf(x71.b));
                return k;
            } else if (i4 == 1) {
                hc1.c(i, Long.valueOf(l(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int i5 = i(bArr, i2, x71);
                int i6 = x71.a;
                if (i6 < 0) {
                    throw v91.c();
                } else if (i6 <= bArr.length - i5) {
                    if (i6 == 0) {
                        hc1.c(i, c81.b);
                    } else {
                        hc1.c(i, c81.j(bArr, i5, i6));
                    }
                    return i5 + i6;
                } else {
                    throw v91.b();
                }
            } else if (i4 == 3) {
                hc1 j = hc1.j();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int i9 = i(bArr, i2, x71);
                    int i10 = x71.a;
                    i8 = i10;
                    if (i10 == i7) {
                        i2 = i9;
                        break;
                    }
                    int c = c(i8, bArr, i9, i3, j, x71);
                    i8 = i10;
                    i2 = c;
                }
                if (i2 > i3 || i8 != i7) {
                    throw v91.i();
                }
                hc1.c(i, j);
                return i2;
            } else if (i4 == 5) {
                hc1.c(i, Integer.valueOf(h(bArr, i2)));
                return i2 + 4;
            } else {
                throw v91.e();
            }
        } else {
            throw v91.e();
        }
    }

    public static int d(int i, byte[] bArr, int i2, x71 x71) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            x71.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            x71.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            x71.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            x71.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                x71.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int e(lb1<?> lb1, int i, byte[] bArr, int i2, int i3, s91<?> s91, x71 x71) throws IOException {
        int g = g(lb1, bArr, i2, i3, x71);
        s91.add(x71.c);
        while (g < i3) {
            int i4 = i(bArr, g, x71);
            if (i != x71.a) {
                break;
            }
            g = g(lb1, bArr, i4, i3, x71);
            s91.add(x71.c);
        }
        return g;
    }

    public static int f(lb1 lb1, byte[] bArr, int i, int i2, int i3, x71 x71) throws IOException {
        ab1 ab1 = (ab1) lb1;
        Object e = ab1.e();
        int o = ab1.o(e, bArr, i, i2, i3, x71);
        ab1.c(e);
        x71.c = e;
        return o;
    }

    public static int g(lb1 lb1, byte[] bArr, int i, int i2, x71 x71) throws IOException {
        int i3 = i + 1;
        byte b = bArr[i];
        byte b2 = b;
        if (b < 0) {
            i3 = d(b, bArr, i3, x71);
            b2 = x71.a;
        }
        if (b2 < 0 || b2 > i2 - i3) {
            throw v91.b();
        }
        Object e = lb1.e();
        int i4 = (b2 == 1 ? 1 : 0) + i3;
        lb1.j(e, bArr, i3, i4, x71);
        lb1.c(e);
        x71.c = e;
        return i4;
    }

    public static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int i(byte[] bArr, int i, x71 x71) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return d(b, bArr, i2, x71);
        }
        x71.a = b;
        return i2;
    }

    public static int j(byte[] bArr, int i, s91<?> s91, x71 x71) throws IOException {
        o91 o91 = (o91) s91;
        int i2 = i(bArr, i, x71);
        int i3 = x71.a + i2;
        while (i2 < i3) {
            i2 = i(bArr, i2, x71);
            o91.e(x71.a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw v91.b();
    }

    public static int k(byte[] bArr, int i, x71 x71) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            x71.b = j;
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
        x71.b = j2;
        return i3;
    }

    public static long l(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static double m(byte[] bArr, int i) {
        return Double.longBitsToDouble(l(bArr, i));
    }

    public static int n(byte[] bArr, int i, x71 x71) throws v91 {
        int i2 = i(bArr, i, x71);
        int i3 = x71.a;
        if (i3 < 0) {
            throw v91.c();
        } else if (i3 == 0) {
            x71.c = C0201.m82(7693);
            return i2;
        } else {
            x71.c = new String(bArr, i2, i3, m91.a);
            return i2 + i3;
        }
    }

    public static float o(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }

    public static int p(byte[] bArr, int i, x71 x71) throws v91 {
        int i2 = i(bArr, i, x71);
        int i3 = x71.a;
        if (i3 < 0) {
            throw v91.c();
        } else if (i3 == 0) {
            x71.c = C0201.m82(7694);
            return i2;
        } else {
            x71.c = nc1.j(bArr, i2, i3);
            return i2 + i3;
        }
    }

    public static int q(byte[] bArr, int i, x71 x71) throws v91 {
        int i2 = i(bArr, i, x71);
        int i3 = x71.a;
        if (i3 < 0) {
            throw v91.c();
        } else if (i3 > bArr.length - i2) {
            throw v91.b();
        } else if (i3 == 0) {
            x71.c = c81.b;
            return i2;
        } else {
            x71.c = c81.j(bArr, i2, i3);
            return i2 + i3;
        }
    }
}
