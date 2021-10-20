package defpackage;

import vigqyno.C0201;

/* renamed from: r63  reason: default package */
/* compiled from: SHA1Digest */
public class r63 extends o63 {
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int[] i = new int[80];
    private int j;

    public r63() {
        j();
    }

    private int l(int i2, int i3, int i4) {
        return ((i2 ^ -1) & i4) | (i3 & i2);
    }

    private int m(int i2, int i3, int i4) {
        return (i2 & i4) | (i2 & i3) | (i3 & i4);
    }

    private int n(int i2, int i3, int i4) {
        return (i2 ^ i3) ^ i4;
    }

    @Override // defpackage.m63
    public int a(byte[] bArr, int i2) {
        f();
        jb3.c(this.d, bArr, i2);
        jb3.c(this.e, bArr, i2 + 4);
        jb3.c(this.f, bArr, i2 + 8);
        jb3.c(this.g, bArr, i2 + 12);
        jb3.c(this.h, bArr, i2 + 16);
        j();
        return 20;
    }

    @Override // defpackage.m63
    public String d() {
        return C0201.m82(16053);
    }

    @Override // defpackage.m63
    public int e() {
        return 20;
    }

    @Override // defpackage.o63
    public void g() {
        for (int i2 = 16; i2 < 80; i2++) {
            int[] iArr = this.i;
            int i3 = ((iArr[i2 - 3] ^ iArr[i2 - 8]) ^ iArr[i2 - 14]) ^ iArr[i2 - 16];
            iArr[i2] = (i3 >>> 31) | (i3 << 1);
        }
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = 0;
        int i10 = 0;
        while (i9 < 4) {
            int i11 = i10 + 1;
            int l = i8 + ((i4 << 5) | (i4 >>> 27)) + l(i5, i6, i7) + this.i[i10] + 1518500249;
            int i12 = (i5 >>> 2) | (i5 << 30);
            int i13 = i11 + 1;
            int l2 = i7 + ((l << 5) | (l >>> 27)) + l(i4, i12, i6) + this.i[i11] + 1518500249;
            int i14 = (i4 >>> 2) | (i4 << 30);
            int i15 = i13 + 1;
            int l3 = i6 + ((l2 << 5) | (l2 >>> 27)) + l(l, i14, i12) + this.i[i13] + 1518500249;
            i8 = (l >>> 2) | (l << 30);
            int i16 = i15 + 1;
            i5 = i12 + ((l3 << 5) | (l3 >>> 27)) + l(l2, i8, i14) + this.i[i15] + 1518500249;
            i7 = (l2 >>> 2) | (l2 << 30);
            i4 = i14 + ((i5 << 5) | (i5 >>> 27)) + l(l3, i7, i8) + this.i[i16] + 1518500249;
            i6 = (l3 >>> 2) | (l3 << 30);
            i9++;
            i10 = i16 + 1;
        }
        int i17 = 0;
        while (i17 < 4) {
            int i18 = i10 + 1;
            int n = i8 + ((i4 << 5) | (i4 >>> 27)) + n(i5, i6, i7) + this.i[i10] + 1859775393;
            int i19 = (i5 >>> 2) | (i5 << 30);
            int i20 = i18 + 1;
            int n2 = i7 + ((n << 5) | (n >>> 27)) + n(i4, i19, i6) + this.i[i18] + 1859775393;
            int i21 = (i4 >>> 2) | (i4 << 30);
            int i22 = i20 + 1;
            int n3 = i6 + ((n2 << 5) | (n2 >>> 27)) + n(n, i21, i19) + this.i[i20] + 1859775393;
            i8 = (n >>> 2) | (n << 30);
            int i23 = i22 + 1;
            i5 = i19 + ((n3 << 5) | (n3 >>> 27)) + n(n2, i8, i21) + this.i[i22] + 1859775393;
            i7 = (n2 >>> 2) | (n2 << 30);
            i4 = i21 + ((i5 << 5) | (i5 >>> 27)) + n(n3, i7, i8) + this.i[i23] + 1859775393;
            i6 = (n3 >>> 2) | (n3 << 30);
            i17++;
            i10 = i23 + 1;
        }
        int i24 = 0;
        while (i24 < 4) {
            int i25 = i10 + 1;
            int m = i8 + (((((i4 << 5) | (i4 >>> 27)) + m(i5, i6, i7)) + this.i[i10]) - 1894007588);
            int i26 = (i5 >>> 2) | (i5 << 30);
            int i27 = i25 + 1;
            int m2 = i7 + (((((m << 5) | (m >>> 27)) + m(i4, i26, i6)) + this.i[i25]) - 1894007588);
            int i28 = (i4 >>> 2) | (i4 << 30);
            int i29 = i27 + 1;
            int m3 = i6 + (((((m2 << 5) | (m2 >>> 27)) + m(m, i28, i26)) + this.i[i27]) - 1894007588);
            i8 = (m >>> 2) | (m << 30);
            int i30 = i29 + 1;
            i5 = i26 + (((((m3 << 5) | (m3 >>> 27)) + m(m2, i8, i28)) + this.i[i29]) - 1894007588);
            i7 = (m2 >>> 2) | (m2 << 30);
            i4 = i28 + (((((i5 << 5) | (i5 >>> 27)) + m(m3, i7, i8)) + this.i[i30]) - 1894007588);
            i6 = (m3 >>> 2) | (m3 << 30);
            i24++;
            i10 = i30 + 1;
        }
        int i31 = 0;
        while (i31 <= 3) {
            int i32 = i10 + 1;
            int n4 = i8 + (((((i4 << 5) | (i4 >>> 27)) + n(i5, i6, i7)) + this.i[i10]) - 899497514);
            int i33 = (i5 >>> 2) | (i5 << 30);
            int i34 = i32 + 1;
            int n5 = i7 + (((((n4 << 5) | (n4 >>> 27)) + n(i4, i33, i6)) + this.i[i32]) - 899497514);
            int i35 = (i4 >>> 2) | (i4 << 30);
            int i36 = i34 + 1;
            int n6 = i6 + (((((n5 << 5) | (n5 >>> 27)) + n(n4, i35, i33)) + this.i[i34]) - 899497514);
            i8 = (n4 >>> 2) | (n4 << 30);
            int i37 = i36 + 1;
            i5 = i33 + (((((n6 << 5) | (n6 >>> 27)) + n(n5, i8, i35)) + this.i[i36]) - 899497514);
            i7 = (n5 >>> 2) | (n5 << 30);
            i4 = i35 + (((((i5 << 5) | (i5 >>> 27)) + n(n6, i7, i8)) + this.i[i37]) - 899497514);
            i6 = (n6 >>> 2) | (n6 << 30);
            i31++;
            i10 = i37 + 1;
        }
        this.d += i4;
        this.e += i5;
        this.f += i6;
        this.g += i7;
        this.h += i8;
        this.j = 0;
        for (int i38 = 0; i38 < 16; i38++) {
            this.i[i38] = 0;
        }
    }

    @Override // defpackage.o63
    public void h(long j2) {
        if (this.j > 14) {
            g();
        }
        int[] iArr = this.i;
        iArr[14] = (int) (j2 >>> 32);
        iArr[15] = (int) (j2 & -1);
    }

    @Override // defpackage.o63
    public void i(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (bArr[i4 + 1] & 255) | (bArr[i2] << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8);
        int[] iArr = this.i;
        int i6 = this.j;
        iArr[i6] = i5;
        int i7 = i6 + 1;
        this.j = i7;
        if (i7 == 16) {
            g();
        }
    }

    @Override // defpackage.o63
    public void j() {
        super.j();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = -1009589776;
        this.j = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.i;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
