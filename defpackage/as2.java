package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: as2  reason: default package */
/* compiled from: TIFFFaxDecoder */
public final class as2 {
    private static final int[] m = {0, 1, 3, 7, 15, 31, 63, 127, 255};
    private static final int[] n = {0, 128, 192, 224, 240, 248, 252, 254, 255};
    private static final byte[] o = {0, Byte.MIN_VALUE, 64, -64, 32, -96, 96, -32, 16, -112, 80, -48, 48, -80, 112, -16, 8, -120, 72, -56, 40, -88, 104, -24, 24, -104, 88, -40, 56, -72, 120, -8, 4, -124, 68, -60, 36, -92, 100, -28, 20, -108, 84, -44, 52, -76, 116, -12, 12, -116, 76, -52, 44, -84, 108, -20, 28, -100, 92, -36, 60, -68, 124, -4, 2, -126, 66, -62, 34, -94, 98, -30, 18, -110, 82, -46, 50, -78, 114, -14, 10, -118, 74, -54, 42, -86, 106, -22, 26, -102, 90, -38, 58, -70, 122, -6, 6, -122, 70, -58, 38, -90, 102, -26, 22, -106, 86, -42, 54, -74, 118, -10, 14, -114, 78, -50, 46, -82, 110, -18, 30, -98, 94, -34, 62, -66, 126, -2, 1, -127, 65, -63, 33, -95, 97, -31, 17, -111, 81, -47, 49, -79, 113, -15, 9, -119, 73, -55, 41, -87, 105, -23, 25, -103, 89, -39, 57, -71, 121, -7, 5, -123, 69, -59, 37, -91, 101, -27, 21, -107, 85, -43, 53, -75, 117, -11, 13, -115, 77, -51, 45, -83, 109, -19, 29, -99, 93, -35, 61, -67, 125, -3, 3, -125, 67, -61, 35, -93, 99, -29, 19, -109, 83, -45, 51, -77, 115, -13, 11, -117, 75, -53, 43, -85, 107, -21, 27, -101, 91, -37, 59, -69, 123, -5, 7, -121, 71, -57, 39, -89, 103, -25, 23, -105, 87, -41, 55, -73, 119, -9, 15, -113, 79, -49, 47, -81, 111, -17, 31, -97, 95, -33, 63, -65, Byte.MAX_VALUE, -1};
    private static final short[] p = {6430, 6400, 6400, 6400, 3225, 3225, 3225, 3225, 944, 944, 944, 944, 976, 976, 976, 976, 1456, 1456, 1456, 1456, 1488, 1488, 1488, 1488, 718, 718, 718, 718, 718, 718, 718, 718, 750, 750, 750, 750, 750, 750, 750, 750, 1520, 1520, 1520, 1520, 1552, 1552, 1552, 1552, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 654, 654, 654, 654, 654, 654, 654, 654, 1072, 1072, 1072, 1072, 1104, 1104, 1104, 1104, 1136, 1136, 1136, 1136, 1168, 1168, 1168, 1168, 1200, 1200, 1200, 1200, 1232, 1232, 1232, 1232, 622, 622, 622, 622, 622, 622, 622, 622, 1008, 1008, 1008, 1008, 1040, 1040, 1040, 1040, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 1712, 1712, 1712, 1712, 1744, 1744, 1744, 1744, 846, 846, 846, 846, 846, 846, 846, 846, 1264, 1264, 1264, 1264, 1296, 1296, 1296, 1296, 1328, 1328, 1328, 1328, 1360, 1360, 1360, 1360, 1392, 1392, 1392, 1392, 1424, 1424, 1424, 1424, 686, 686, 686, 686, 686, 686, 686, 686, 910, 910, 910, 910, 910, 910, 910, 910, 1968, 1968, 1968, 1968, 2000, 2000, 2000, 2000, 2032, 2032, 2032, 2032, 16, 16, 16, 16, 10257, 10257, 10257, 10257, 12305, 12305, 12305, 12305, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 878, 878, 878, 878, 878, 878, 878, 878, 1904, 1904, 1904, 1904, 1936, 1936, 1936, 1936, -18413, -18413, -16365, -16365, -14317, -14317, -10221, -10221, 590, 590, 590, 590, 590, 590, 590, 590, 782, 782, 782, 782, 782, 782, 782, 782, 1584, 1584, 1584, 1584, 1616, 1616, 1616, 1616, 1648, 1648, 1648, 1648, 1680, 1680, 1680, 1680, 814, 814, 814, 814, 814, 814, 814, 814, 1776, 1776, 1776, 1776, 1808, 1808, 1808, 1808, 1840, 1840, 1840, 1840, 1872, 1872, 1872, 1872, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, 14353, 14353, 14353, 14353, 16401, 16401, 16401, 16401, 22547, 22547, 24595, 24595, 20497, 20497, 20497, 20497, 18449, 18449, 18449, 18449, 26643, 26643, 28691, 28691, 30739, 30739, -32749, -32749, -30701, -30701, -28653, -28653, -26605, -26605, -24557, -24557, -22509, -22509, -20461, -20461, 8207, 8207, 8207, 8207, 8207, 8207, 8207, 8207, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232};
    private static final short[] q = {28679, 28679, 31752, -32759, -31735, -30711, -29687, -28663, 29703, 29703, 30727, 30727, -27639, -26615, -25591, -24567};
    private static final short[] r = {3226, 6412, 200, 168, 38, 38, 134, 134, 100, 100, 100, 100, 68, 68, 68, 68};
    private static final short[] s = {292, 260, 226, 226};
    private static final short[] t = {62, 62, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 588, 588, 588, 588, 588, 588, 588, 588, 1680, 1680, 20499, 22547, 24595, 26643, 1776, 1776, 1808, 1808, -24557, -22509, -20461, -18413, 1904, 1904, 1936, 1936, -16365, -14317, 782, 782, 782, 782, 814, 814, 814, 814, -12269, -10221, 10257, 10257, 12305, 12305, 14353, 14353, 16403, 18451, 1712, 1712, 1744, 1744, 28691, 30739, -32749, -30701, -28653, -26605, 2061, 2061, 2061, 2061, 2061, 2061, 2061, 2061, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 750, 750, 750, 750, 1616, 1616, 1648, 1648, 1424, 1424, 1456, 1456, 1488, 1488, 1520, 1520, 1840, 1840, 1872, 1872, 1968, 1968, 8209, 8209, 524, 524, 524, 524, 524, 524, 524, 524, 556, 556, 556, 556, 556, 556, 556, 556, 1552, 1552, 1584, 1584, 2000, 2000, 2032, 2032, 976, 976, 1008, 1008, 1040, 1040, 1072, 1072, 1296, 1296, 1328, 1328, 718, 718, 718, 718, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 4113, 4113, 6161, 6161, 848, 848, 880, 880, 912, 912, 944, 944, 622, 622, 622, 622, 654, 654, 654, 654, 1104, 1104, 1136, 1136, 1168, 1168, 1200, 1200, 1232, 1232, 1264, 1264, 686, 686, 686, 686, 1360, 1360, 1392, 1392, 12, 12, 12, 12, 12, 12, 12, 12, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390};
    private static final byte[] u = {80, 88, 23, 71, 30, 30, 62, 62, 4, 4, 4, 4, 4, 4, 4, 4, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};
    public static final String v = null;
    public static final String w = null;
    private int a;
    private int b;
    private byte[] c;
    private int d;
    private int e;
    private int f = 0;
    private int[] g;
    private int[] h;
    private int i = 0;
    private int j = 2;
    private int k = 0;
    private int l;

    static {
        C0201.m83(as2.class, 26);
    }

    public as2(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.a = 0;
        this.b = 0;
        int i5 = i3 + 1;
        this.g = new int[i5];
        this.h = new int[i5];
    }

    private boolean a() {
        if (this.a != 0) {
            this.b++;
            this.a = 0;
        }
        return true;
    }

    private int c() throws IOException {
        boolean z = false;
        int i2 = 0;
        while (!z) {
            short s2 = r[h(4)];
            int i3 = (s2 >>> 1) & 15;
            int i4 = (s2 >>> 5) & 2047;
            if (i4 == 100) {
                short s3 = t[i(9)];
                int i5 = s3 & 1;
                int i6 = (s3 >>> 1) & 15;
                int i7 = (s3 >>> 5) & 2047;
                if (i6 == 12) {
                    l(5);
                    short s4 = q[h(4)];
                    i2 += (s4 >>> 4) & 4095;
                    l(4 - ((s4 >>> 1) & 7));
                } else if (i6 != 15) {
                    i2 += i7;
                    l(9 - i6);
                    if (i5 != 0) {
                    }
                } else {
                    throw new IOException(C0201.m82(7809));
                }
            } else if (i4 == 200) {
                short s5 = s[h(2)];
                i2 += (s5 >>> 5) & 2047;
                l(2 - ((s5 >>> 1) & 15));
            } else {
                i2 += i4;
                l(4 - i3);
            }
            z = true;
        }
        return i2;
    }

    private int f() throws IOException {
        boolean z = true;
        int i2 = 0;
        while (z) {
            int i3 = i(10);
            short s2 = p[i3];
            int i4 = s2 & 1;
            int i5 = (s2 >>> 1) & 15;
            if (i5 == 12) {
                short s3 = q[((i3 << 2) & 12) | h(2)];
                i2 += (s3 >>> 4) & 4095;
                l(4 - ((s3 >>> 1) & 7));
            } else if (i5 == 0) {
                throw new IOException(C0201.m82(7811));
            } else if (i5 != 15) {
                i2 += (s2 >>> 5) & 2047;
                l(10 - i5);
                if (i4 == 0) {
                    z = false;
                }
            } else {
                throw new IOException(C0201.m82(7810));
            }
        }
        return i2;
    }

    private void g(int i2, boolean z, int[] iArr) {
        int[] iArr2 = this.g;
        int i3 = this.f;
        int i4 = this.i;
        int i5 = i4 > 0 ? i4 - 1 : 0;
        int i6 = z ? i5 & -2 : i5 | 1;
        while (true) {
            if (i6 >= i3) {
                break;
            }
            int i7 = iArr2[i6];
            if (i7 > i2) {
                this.i = i6;
                iArr[0] = i7;
                break;
            }
            i6 += 2;
        }
        int i8 = i6 + 1;
        if (i8 < i3) {
            iArr[1] = iArr2[i8];
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    private int h(int i2) throws IOException {
        byte b2;
        byte b3;
        int i3;
        byte[] bArr = this.c;
        int length = bArr.length - 1;
        int i4 = this.b;
        int i5 = this.e;
        if (i5 == 1) {
            b2 = bArr[i4];
            if (i4 != length) {
                b3 = bArr[i4 + 1];
                int i6 = this.a;
                int i7 = 8 - i6;
                int i8 = i2 - i7;
                i3 = i7 - i2;
                if (i3 >= 0) {
                    int i9 = (m[i7] & b2) >>> i3;
                    int i10 = i6 + i2;
                    this.a = i10;
                    if (i10 != 8) {
                        return i9;
                    }
                    this.a = 0;
                    this.b++;
                    return i9;
                }
                int i11 = ((b3 & n[i8]) >>> (8 - i8)) | ((m[i7] & b2) << (-i3));
                this.b++;
                this.a = i8;
                return i11;
            }
        } else if (i5 == 2) {
            byte[] bArr2 = o;
            byte b4 = bArr2[bArr[i4] & 255];
            if (i4 == length) {
                b2 = b4;
            } else {
                b3 = bArr2[bArr[i4 + 1] & 255];
                b2 = b4;
                int i62 = this.a;
                int i72 = 8 - i62;
                int i82 = i2 - i72;
                i3 = i72 - i2;
                if (i3 >= 0) {
                }
            }
        } else {
            throw new IOException(C0201.m82(7812));
        }
        b3 = 0;
        int i622 = this.a;
        int i722 = 8 - i622;
        int i822 = i2 - i722;
        i3 = i722 - i2;
        if (i3 >= 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    private int i(int i2) throws IOException {
        byte b2;
        byte b3;
        byte b4;
        int i3;
        int i4;
        int i5;
        byte b5;
        byte b6;
        byte[] bArr = this.c;
        int length = bArr.length - 1;
        int i6 = this.b;
        int i7 = this.e;
        if (i7 == 1) {
            b2 = bArr[i6];
            if (i6 != length) {
                int i8 = i6 + 1;
                if (i8 == length) {
                    b4 = bArr[i8];
                    b3 = 0;
                    int i9 = 8 - this.a;
                    i3 = i2 - i9;
                    if (i3 > 8) {
                        i5 = i3 - 8;
                        i4 = 8;
                    } else {
                        i4 = i3;
                        i5 = 0;
                    }
                    int i10 = this.b + 1;
                    this.b = i10;
                    int i11 = (m[i9] & b2) << i3;
                    int[] iArr = n;
                    int i12 = (b4 & iArr[i4]) >>> (8 - i4);
                    if (i5 != 0) {
                        i12 = (i12 << i5) | ((b3 & iArr[i5]) >>> (8 - i5));
                        this.b = i10 + 1;
                        this.a = i5;
                    } else if (i4 == 8) {
                        this.a = 0;
                        this.b = i10 + 1;
                    } else {
                        this.a = i4;
                    }
                    return i11 | i12;
                }
                b5 = bArr[i8];
                b6 = bArr[i6 + 2];
                b3 = b6;
                b4 = b5;
                int i92 = 8 - this.a;
                i3 = i2 - i92;
                if (i3 > 8) {
                }
                int i102 = this.b + 1;
                this.b = i102;
                int i112 = (m[i92] & b2) << i3;
                int[] iArr2 = n;
                int i122 = (b4 & iArr2[i4]) >>> (8 - i4);
                if (i5 != 0) {
                }
                return i112 | i122;
            }
        } else if (i7 == 2) {
            byte[] bArr2 = o;
            byte b7 = bArr2[bArr[i6] & 255];
            if (i6 == length) {
                b2 = b7;
            } else {
                int i13 = i6 + 1;
                if (i13 == length) {
                    b4 = bArr2[bArr[i13] & 255];
                    b2 = b7;
                    b3 = 0;
                    int i922 = 8 - this.a;
                    i3 = i2 - i922;
                    if (i3 > 8) {
                    }
                    int i1022 = this.b + 1;
                    this.b = i1022;
                    int i1122 = (m[i922] & b2) << i3;
                    int[] iArr22 = n;
                    int i1222 = (b4 & iArr22[i4]) >>> (8 - i4);
                    if (i5 != 0) {
                    }
                    return i1122 | i1222;
                }
                b5 = bArr2[bArr[i13] & 255];
                b6 = bArr2[bArr[i6 + 2] & 255];
                b2 = b7;
                b3 = b6;
                b4 = b5;
                int i9222 = 8 - this.a;
                i3 = i2 - i9222;
                if (i3 > 8) {
                }
                int i10222 = this.b + 1;
                this.b = i10222;
                int i11222 = (m[i9222] & b2) << i3;
                int[] iArr222 = n;
                int i12222 = (b4 & iArr222[i4]) >>> (8 - i4);
                if (i5 != 0) {
                }
                return i11222 | i12222;
            }
        } else {
            throw new IOException(C0201.m82(7813));
        }
        b4 = 0;
        b3 = 0;
        int i92222 = 8 - this.a;
        i3 = i2 - i92222;
        if (i3 > 8) {
        }
        int i102222 = this.b + 1;
        this.b = i102222;
        int i112222 = (m[i92222] & b2) << i3;
        int[] iArr2222 = n;
        int i122222 = (b4 & iArr2222[i4]) >>> (8 - i4);
        if (i5 != 0) {
        }
        return i112222 | i122222;
    }

    private int j() throws IOException {
        int i2;
        int i3 = this.k;
        if (i3 == 0) {
            if (i(12) != 1) {
                throw new IOException(C0201.m82(7814));
            }
        } else if (i3 == 1) {
            int i4 = 8 - this.a;
            int i5 = i(i4);
            String r4 = C0201.m82(7815);
            if (i5 != 0) {
                throw new IOException(r4);
            } else if (i4 >= 4 || i(8) == 0) {
                do {
                    i2 = i(8);
                    if (i2 != 1) {
                    }
                } while (i2 == 0);
                throw new IOException(r4);
            } else {
                throw new IOException(r4);
            }
        }
        if (this.l == 0) {
            return 1;
        }
        return h(1);
    }

    private void k(byte[] bArr, int i2, int i3, int i4) {
        int i5 = (i2 * 8) + i3;
        int i6 = i4 + i5;
        int i7 = i5 >> 3;
        int i8 = i5 & 7;
        if (i8 > 0) {
            int i9 = 1 << (7 - i8);
            byte b2 = bArr[i7];
            while (i9 > 0 && i5 < i6) {
                b2 = (byte) (b2 | i9);
                i9 >>= 1;
                i5++;
            }
            bArr[i7] = b2;
        }
        int i10 = i5 >> 3;
        while (i5 < i6 - 7) {
            bArr[i10] = -1;
            i5 += 8;
            i10++;
        }
        while (i5 < i6) {
            int i11 = i5 >> 3;
            bArr[i11] = (byte) (bArr[i11] | (1 << (7 - (i5 & 7))));
            i5++;
        }
    }

    private void l(int i2) {
        int i3 = this.a - i2;
        if (i3 < 0) {
            this.b--;
            this.a = i3 + 8;
            return;
        }
        this.a = i3;
    }

    public void b(byte[] bArr, byte[] bArr2, int i2, int i3, long j2) throws IOException {
        int i4;
        this.c = bArr2;
        this.j = 3;
        int i5 = 0;
        this.a = 0;
        this.b = 0;
        int i6 = 7;
        int i7 = (this.d + 7) / 8;
        int[] iArr = new int[2];
        this.l = (int) (j2 & 1);
        this.k = (int) ((j2 & 4) >> 2);
        char c2 = 1;
        if (j() == 1) {
            d(bArr, 0, i2);
            int i8 = i7 + 0;
            int i9 = 1;
            while (i9 < i3) {
                if (j() == 0) {
                    int[] iArr2 = this.g;
                    this.g = this.h;
                    this.h = iArr2;
                    int i10 = -1;
                    this.i = i5;
                    int i11 = i2;
                    boolean z = true;
                    int i12 = 0;
                    while (i11 < this.d) {
                        g(i10, z, iArr);
                        int i13 = iArr[i5];
                        i10 = iArr[c2];
                        int i14 = u[h(i6)] & 255;
                        int i15 = (i14 & 120) >>> 3;
                        int i16 = i14 & i6;
                        if (i15 == 0) {
                            if (!z) {
                                k(bArr, i8, i11, i10 - i11);
                            }
                            l(7 - i16);
                            i11 = i10;
                        } else if (i15 == 1) {
                            l(7 - i16);
                            if (z) {
                                int f2 = i11 + f();
                                int i17 = i12 + 1;
                                this.h[i12] = f2;
                                int c3 = c();
                                k(bArr, i8, f2, c3);
                                i11 = f2 + c3;
                                i4 = i17 + 1;
                                this.h[i17] = i11;
                            } else {
                                int c4 = c();
                                k(bArr, i8, i11, c4);
                                int i18 = i11 + c4;
                                int i19 = i12 + 1;
                                this.h[i12] = i18;
                                i11 = i18 + f();
                                i4 = i19 + 1;
                                this.h[i19] = i11;
                            }
                            i12 = i4;
                            i10 = i11;
                        } else if (i15 <= 8) {
                            int i20 = i13 + (i15 - 5);
                            int i21 = i12 + 1;
                            this.h[i12] = i20;
                            if (!z) {
                                k(bArr, i8, i11, i20 - i11);
                            }
                            z = !z;
                            l(7 - i16);
                            i10 = i20;
                            i11 = i10;
                            i12 = i21;
                            i5 = 0;
                            i6 = 7;
                            c2 = 1;
                        } else {
                            throw new IOException(C0201.m82(7816));
                        }
                        i5 = 0;
                        c2 = 1;
                    }
                    this.h[i12] = i11;
                    this.f = i12 + 1;
                } else {
                    d(bArr, i8, i2);
                }
                i8 += i7;
                i9++;
                i5 = 0;
                i6 = 7;
                c2 = 1;
            }
            return;
        }
        throw new IOException(C0201.m82(7817));
    }

    public void d(byte[] bArr, int i2, int i3) throws IOException {
        this.f = 0;
        boolean z = true;
        while (true) {
            if (i3 >= this.d) {
                break;
            }
            while (z) {
                int i4 = i(10);
                short s2 = p[i4];
                int i5 = s2 & 1;
                int i6 = (s2 >>> 1) & 15;
                if (i6 == 12) {
                    short s3 = q[(12 & (i4 << 2)) | h(2)];
                    i3 += (s3 >>> 4) & 4095;
                    l(4 - ((s3 >>> 1) & 7));
                } else if (i6 == 0) {
                    throw new IOException(C0201.m82(7819));
                } else if (i6 != 15) {
                    i3 += (s2 >>> 5) & 2047;
                    l(10 - i6);
                    if (i5 == 0) {
                        int[] iArr = this.h;
                        int i7 = this.f;
                        this.f = i7 + 1;
                        iArr[i7] = i3;
                        z = false;
                    }
                } else {
                    throw new IOException(C0201.m82(7818));
                }
            }
            if (i3 != this.d) {
                while (!z) {
                    short s4 = r[h(4)];
                    int i8 = (s4 >>> 1) & 15;
                    int i9 = (s4 >>> 5) & 2047;
                    if (i9 == 100) {
                        short s5 = t[i(9)];
                        int i10 = s5 & 1;
                        int i11 = (s5 >>> 1) & 15;
                        int i12 = (s5 >>> 5) & 2047;
                        if (i11 == 12) {
                            l(5);
                            short s6 = q[h(4)];
                            int i13 = (s6 >>> 4) & 4095;
                            k(bArr, i2, i3, i13);
                            i3 += i13;
                            l(4 - ((s6 >>> 1) & 7));
                        } else if (i11 != 15) {
                            k(bArr, i2, i3, i12);
                            i3 += i12;
                            l(9 - i11);
                            if (i10 == 0) {
                                int[] iArr2 = this.h;
                                int i14 = this.f;
                                this.f = i14 + 1;
                                iArr2[i14] = i3;
                            }
                        } else {
                            throw new IOException(C0201.m82(7820));
                        }
                    } else if (i9 == 200) {
                        short s7 = s[h(2)];
                        int i15 = (s7 >>> 5) & 2047;
                        k(bArr, i2, i3, i15);
                        i3 += i15;
                        l(2 - ((s7 >>> 1) & 15));
                        int[] iArr3 = this.h;
                        int i16 = this.f;
                        this.f = i16 + 1;
                        iArr3[i16] = i3;
                    } else {
                        k(bArr, i2, i3, i9);
                        i3 += i9;
                        l(4 - i8);
                        int[] iArr4 = this.h;
                        int i17 = this.f;
                        this.f = i17 + 1;
                        iArr4[i17] = i3;
                    }
                    z = true;
                }
                if (i3 == this.d) {
                    if (this.j == 2) {
                        a();
                    }
                }
            } else if (this.j == 2) {
                a();
            }
        }
        int[] iArr5 = this.h;
        int i18 = this.f;
        this.f = i18 + 1;
        iArr5[i18] = i3;
    }

    public synchronized void e(byte[] bArr, byte[] bArr2, int i2, int i3, long j2, boolean z) throws IOException {
        boolean z2;
        int i4;
        this.c = bArr2;
        this.j = 4;
        int i5 = 0;
        this.a = 0;
        this.b = 0;
        int i6 = 7;
        int i7 = (this.d + 7) / 8;
        int[] iArr = new int[2];
        int[] iArr2 = this.h;
        this.f = 0;
        int i8 = 1;
        int i9 = 0 + 1;
        this.f = i9;
        iArr2[0] = this.d;
        this.f = i9 + 1;
        iArr2[i9] = this.d;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= i3) {
                break;
            }
            if (z && this.a != 0) {
                this.a = i5;
                this.b += i8;
            }
            int i12 = -1;
            int[] iArr3 = this.g;
            this.g = this.h;
            this.h = iArr3;
            this.i = i5;
            int i13 = i2;
            boolean z3 = true;
            int i14 = 0;
            while (i13 < this.d) {
                g(i12, z3, iArr);
                int i15 = iArr[i5];
                int i16 = iArr[i8];
                int i17 = u[h(i6)] & 255;
                int i18 = (i17 & 120) >>> 3;
                int i19 = i17 & i6;
                if (i18 == 0) {
                    if (!z3) {
                        k(bArr, i11, i13, i16 - i13);
                    }
                    l(7 - i19);
                    i12 = i16;
                    i13 = i12;
                    iArr = iArr;
                    i5 = 0;
                } else {
                    if (i18 == 1) {
                        l(7 - i19);
                        if (z3) {
                            int f2 = i13 + f();
                            int i20 = i14 + 1;
                            iArr3[i14] = f2;
                            int c2 = c();
                            k(bArr, i11, f2, c2);
                            i13 = f2 + c2;
                            i4 = i20 + 1;
                            iArr3[i20] = i13;
                        } else {
                            int c3 = c();
                            k(bArr, i11, i13, c3);
                            int i21 = i13 + c3;
                            int i22 = i14 + 1;
                            iArr3[i14] = i21;
                            i13 = i21 + f();
                            i4 = i22 + 1;
                            iArr3[i22] = i13;
                        }
                        i14 = i4;
                        i12 = i13;
                    } else if (i18 <= 8) {
                        i12 = i15 + (i18 - 5);
                        int i23 = i14 + 1;
                        iArr3[i14] = i12;
                        if (!z3) {
                            k(bArr, i11, i13, i12 - i13);
                        }
                        z3 = !z3;
                        l(7 - i19);
                        i14 = i23;
                        i13 = i12;
                    } else if (i18 != 11) {
                        throw new IOException(v);
                    } else if (h(3) == 7) {
                        boolean z4 = false;
                        int i24 = 0;
                        while (!z4) {
                            while (h(1) != 1) {
                                i24++;
                            }
                            if (i24 > 5) {
                                i24 -= 6;
                                if (!z3 && i24 > 0) {
                                    iArr3[i14] = i13;
                                    i14++;
                                }
                                i13 += i24;
                                if (i24 > 0) {
                                    z3 = true;
                                }
                                if (h(1) == 0) {
                                    if (!z3) {
                                        iArr3[i14] = i13;
                                        i14++;
                                    }
                                    z2 = true;
                                } else {
                                    if (z3) {
                                        iArr3[i14] = i13;
                                        i14++;
                                    }
                                    z2 = false;
                                }
                                z3 = z2;
                                z4 = true;
                            }
                            if (i24 == 5) {
                                if (!z3) {
                                    iArr3[i14] = i13;
                                    i14++;
                                }
                                i13 += i24;
                                z3 = true;
                            } else {
                                int i25 = i13 + i24;
                                iArr3[i14] = i25;
                                k(bArr, i11, i25, 1);
                                i13 = i25 + 1;
                                i14++;
                                z3 = false;
                            }
                        }
                    } else {
                        throw new IOException(w);
                    }
                    iArr = iArr;
                    i5 = 0;
                    i6 = 7;
                }
                i8 = 1;
            }
            if (iArr3.length == i14) {
                break;
            }
            iArr3[i14] = i13;
            this.f = i14 + 1;
            i11 += i7;
            i10++;
            iArr = iArr;
            i5 = 0;
            i6 = 7;
        }
    }
}
