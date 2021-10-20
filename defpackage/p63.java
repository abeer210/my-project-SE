package defpackage;

import vigqyno.C0201;

/* renamed from: p63  reason: default package */
/* compiled from: KeccakDigest */
public class p63 implements m63 {
    private static long[] g = q();
    private static int[] h = p();
    public long[] a = new long[25];
    public byte[] b = new byte[192];
    public int c;
    public int d;
    public int e;
    public boolean f;

    public p63(int i) {
        m(i);
    }

    private void f(byte[] bArr, int i) {
        int i2 = this.c >> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.a;
            jArr[i3] = jArr[i3] ^ jb3.f(bArr, i);
            i += 8;
        }
        h();
    }

    private void g() {
        jb3.j(this.a, 0, this.c >> 6, this.b, 0);
    }

    private void h() {
        for (int i = 0; i < 24; i++) {
            x(this.a);
            v(this.a);
            t(this.a);
            l(this.a);
            o(this.a, i);
        }
    }

    private static boolean i(byte[] bArr) {
        boolean z = (bArr[0] & 1) != 0;
        if ((bArr[0] & 128) != 0) {
            bArr[0] = (byte) ((bArr[0] << 1) ^ 113);
        } else {
            bArr[0] = (byte) (bArr[0] << 1);
        }
        return z;
    }

    private static void l(long[] jArr) {
        for (int i = 0; i < 25; i += 5) {
            int i2 = i + 0;
            int i3 = i + 1;
            int i4 = i + 2;
            long j = jArr[i2] ^ ((jArr[i3] ^ -1) & jArr[i4]);
            int i5 = i + 3;
            long j2 = jArr[i3] ^ ((jArr[i4] ^ -1) & jArr[i5]);
            int i6 = i + 4;
            long j3 = jArr[i4] ^ ((jArr[i5] ^ -1) & jArr[i6]);
            long j4 = jArr[i5] ^ ((jArr[i6] ^ -1) & jArr[i2]);
            jArr[i2] = j;
            jArr[i3] = j2;
            jArr[i4] = j3;
            jArr[i5] = j4;
            jArr[i6] = jArr[i6] ^ ((jArr[i2] ^ -1) & jArr[i3]);
        }
    }

    private void m(int i) {
        if (i == 128 || i == 224 || i == 256 || i == 288 || i == 384 || i == 512) {
            n(1600 - (i << 1));
            return;
        }
        throw new IllegalArgumentException(C0201.m82(30418));
    }

    private void n(int i) {
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new IllegalStateException(C0201.m82(30419));
        }
        this.c = i;
        int i2 = 0;
        while (true) {
            long[] jArr = this.a;
            if (i2 < jArr.length) {
                jArr[i2] = 0;
                i2++;
            } else {
                hb3.g(this.b, (byte) 0);
                this.d = 0;
                this.f = false;
                this.e = (1600 - i) / 2;
                return;
            }
        }
    }

    private static void o(long[] jArr, int i) {
        jArr[0] = jArr[0] ^ g[i];
    }

    private static int[] p() {
        int[] iArr = new int[25];
        int i = 0;
        iArr[0] = 0;
        int i2 = 0;
        int i3 = 1;
        while (i < 24) {
            int i4 = i + 1;
            iArr[(i3 % 5) + ((i2 % 5) * 5)] = (((i + 2) * i4) / 2) % 64;
            i2 = ((i3 * 2) + (i2 * 3)) % 5;
            i3 = ((i3 * 0) + (i2 * 1)) % 5;
            i = i4;
        }
        return iArr;
    }

    private static long[] q() {
        long[] jArr = new long[24];
        byte[] bArr = {1};
        for (int i = 0; i < 24; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 7; i2++) {
                int i3 = (1 << i2) - 1;
                if (i(bArr)) {
                    jArr[i] = jArr[i] ^ (1 << i3);
                }
            }
        }
        return jArr;
    }

    private static long r(long j, int i) {
        return (j >>> (-i)) | (j << i);
    }

    private void s() {
        byte[] bArr = this.b;
        int i = this.d;
        int i2 = i >> 3;
        bArr[i2] = (byte) (bArr[i2] | ((byte) ((int) (1 << (i & 7)))));
        int i3 = i + 1;
        this.d = i3;
        if (i3 == this.c) {
            f(bArr, 0);
            this.d = 0;
        }
        int i4 = this.d;
        int i5 = i4 >> 6;
        int i6 = i4 & 63;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            long[] jArr = this.a;
            jArr[i8] = jArr[i8] ^ jb3.f(this.b, i7);
            i7 += 8;
        }
        if (i6 > 0) {
            long[] jArr2 = this.a;
            jArr2[i5] = jArr2[i5] ^ (((1 << i6) - 1) & jb3.f(this.b, i7));
        }
        long[] jArr3 = this.a;
        int i9 = (this.c - 1) >> 6;
        jArr3[i9] = jArr3[i9] ^ Long.MIN_VALUE;
        h();
        g();
        this.d = this.c;
        this.f = true;
    }

    private static void t(long[] jArr) {
        long j = jArr[1];
        jArr[1] = jArr[6];
        jArr[6] = jArr[9];
        jArr[9] = jArr[22];
        jArr[22] = jArr[14];
        jArr[14] = jArr[20];
        jArr[20] = jArr[2];
        jArr[2] = jArr[12];
        jArr[12] = jArr[13];
        jArr[13] = jArr[19];
        jArr[19] = jArr[23];
        jArr[23] = jArr[15];
        jArr[15] = jArr[4];
        jArr[4] = jArr[24];
        jArr[24] = jArr[21];
        jArr[21] = jArr[8];
        jArr[8] = jArr[16];
        jArr[16] = jArr[5];
        jArr[5] = jArr[3];
        jArr[3] = jArr[18];
        jArr[18] = jArr[17];
        jArr[17] = jArr[11];
        jArr[11] = jArr[7];
        jArr[7] = jArr[10];
        jArr[10] = j;
    }

    private static void v(long[] jArr) {
        for (int i = 1; i < 25; i++) {
            jArr[i] = r(jArr[i], h[i]);
        }
    }

    private static void x(long[] jArr) {
        long j = (((jArr[0] ^ jArr[5]) ^ jArr[10]) ^ jArr[15]) ^ jArr[20];
        long j2 = (((jArr[1] ^ jArr[6]) ^ jArr[11]) ^ jArr[16]) ^ jArr[21];
        long j3 = (((jArr[2] ^ jArr[7]) ^ jArr[12]) ^ jArr[17]) ^ jArr[22];
        long j4 = (((jArr[3] ^ jArr[8]) ^ jArr[13]) ^ jArr[18]) ^ jArr[23];
        long j5 = (((jArr[4] ^ jArr[9]) ^ jArr[14]) ^ jArr[19]) ^ jArr[24];
        long r = r(j2, 1) ^ j5;
        jArr[0] = jArr[0] ^ r;
        jArr[5] = jArr[5] ^ r;
        jArr[10] = jArr[10] ^ r;
        jArr[15] = jArr[15] ^ r;
        jArr[20] = jArr[20] ^ r;
        long r2 = r(j3, 1) ^ j;
        jArr[1] = jArr[1] ^ r2;
        jArr[6] = jArr[6] ^ r2;
        jArr[11] = jArr[11] ^ r2;
        jArr[16] = jArr[16] ^ r2;
        jArr[21] = r2 ^ jArr[21];
        long r3 = r(j4, 1) ^ j2;
        jArr[2] = jArr[2] ^ r3;
        jArr[7] = jArr[7] ^ r3;
        jArr[12] = jArr[12] ^ r3;
        jArr[17] = jArr[17] ^ r3;
        jArr[22] = r3 ^ jArr[22];
        long r4 = r(j5, 1) ^ j3;
        jArr[3] = jArr[3] ^ r4;
        jArr[8] = jArr[8] ^ r4;
        jArr[13] = jArr[13] ^ r4;
        jArr[18] = jArr[18] ^ r4;
        jArr[23] = r4 ^ jArr[23];
        long r5 = r(j, 1) ^ j4;
        jArr[4] = jArr[4] ^ r5;
        jArr[9] = jArr[9] ^ r5;
        jArr[14] = jArr[14] ^ r5;
        jArr[19] = jArr[19] ^ r5;
        jArr[24] = r5 ^ jArr[24];
    }

    @Override // defpackage.m63
    public void b(byte[] bArr, int i, int i2) {
        j(bArr, i, i2);
    }

    @Override // defpackage.m63
    public int e() {
        return this.e / 8;
    }

    public void j(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.d;
        if (i4 % 8 != 0) {
            throw new IllegalStateException(C0201.m82(30421));
        } else if (!this.f) {
            int i5 = i4 >> 3;
            int i6 = this.c >> 3;
            int i7 = 0;
            while (i7 < i2) {
                if (i5 != 0 || i7 > (i3 = i2 - i6)) {
                    int min = Math.min(i6 - i5, i2 - i7);
                    System.arraycopy(bArr, i + i7, this.b, i5, min);
                    i5 += min;
                    i7 += min;
                    if (i5 == i6) {
                        f(this.b, 0);
                        i5 = 0;
                    }
                } else {
                    do {
                        f(bArr, i + i7);
                        i7 += i6;
                    } while (i7 <= i3);
                }
            }
            this.d = i5 << 3;
        } else {
            throw new IllegalStateException(C0201.m82(30420));
        }
    }

    public void k(int i, int i2) {
        if (i2 < 1 || i2 > 7) {
            throw new IllegalArgumentException(C0201.m82(30424));
        }
        int i3 = this.d;
        if (i3 % 8 != 0) {
            throw new IllegalStateException(C0201.m82(30423));
        } else if (!this.f) {
            this.b[i3 >> 3] = (byte) (i & ((1 << i2) - 1));
            this.d = i3 + i2;
        } else {
            throw new IllegalStateException(C0201.m82(30422));
        }
    }

    public void u() {
        m(this.e);
    }

    public void w(byte[] bArr, int i, long j) {
        if (!this.f) {
            s();
        }
        long j2 = 0;
        if (j % 8 == 0) {
            while (j2 < j) {
                if (this.d == 0) {
                    h();
                    g();
                    this.d = this.c;
                }
                int min = (int) Math.min((long) this.d, j - j2);
                System.arraycopy(this.b, (this.c - this.d) / 8, bArr, ((int) (j2 / 8)) + i, min / 8);
                this.d -= min;
                j2 += (long) min;
            }
            return;
        }
        throw new IllegalStateException(C0201.m82(30425));
    }
}
