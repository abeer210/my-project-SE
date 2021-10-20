package defpackage;

import vigqyno.C0201;

/* renamed from: s63  reason: default package */
/* compiled from: SHA224Digest */
public class s63 extends o63 {
    public static final int[] n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int[] l = new int[64];
    private int m;

    public s63() {
        j();
    }

    private int l(int i2, int i3, int i4) {
        return ((i2 ^ -1) & i4) ^ (i3 & i2);
    }

    private int m(int i2, int i3, int i4) {
        return ((i2 & i4) ^ (i2 & i3)) ^ (i3 & i4);
    }

    private int n(int i2) {
        return ((i2 << 10) | (i2 >>> 22)) ^ (((i2 >>> 2) | (i2 << 30)) ^ ((i2 >>> 13) | (i2 << 19)));
    }

    private int o(int i2) {
        return ((i2 << 7) | (i2 >>> 25)) ^ (((i2 >>> 6) | (i2 << 26)) ^ ((i2 >>> 11) | (i2 << 21)));
    }

    private int p(int i2) {
        return (i2 >>> 3) ^ (((i2 >>> 7) | (i2 << 25)) ^ ((i2 >>> 18) | (i2 << 14)));
    }

    private int q(int i2) {
        return (i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)));
    }

    @Override // defpackage.m63
    public int a(byte[] bArr, int i2) {
        f();
        jb3.c(this.d, bArr, i2);
        jb3.c(this.e, bArr, i2 + 4);
        jb3.c(this.f, bArr, i2 + 8);
        jb3.c(this.g, bArr, i2 + 12);
        jb3.c(this.h, bArr, i2 + 16);
        jb3.c(this.i, bArr, i2 + 20);
        jb3.c(this.j, bArr, i2 + 24);
        j();
        return 28;
    }

    @Override // defpackage.m63
    public String d() {
        return C0201.m82(13908);
    }

    @Override // defpackage.m63
    public int e() {
        return 28;
    }

    @Override // defpackage.o63
    public void g() {
        for (int i2 = 16; i2 <= 63; i2++) {
            int[] iArr = this.l;
            int q = q(iArr[i2 - 2]);
            int[] iArr2 = this.l;
            iArr[i2] = q + iArr2[i2 - 7] + p(iArr2[i2 - 15]) + this.l[i2 - 16];
        }
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        int i6 = this.g;
        int i7 = this.h;
        int i8 = this.i;
        int i9 = this.j;
        int i10 = this.k;
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            int o = i10 + o(i7) + l(i7, i8, i9) + n[i11] + this.l[i11];
            int i13 = i6 + o;
            int n2 = o + n(i3) + m(i3, i4, i5);
            int i14 = i11 + 1;
            int o2 = i9 + o(i13) + l(i13, i7, i8) + n[i14] + this.l[i14];
            int i15 = i5 + o2;
            int n3 = o2 + n(n2) + m(n2, i3, i4);
            int i16 = i14 + 1;
            int o3 = i8 + o(i15) + l(i15, i13, i7) + n[i16] + this.l[i16];
            int i17 = i4 + o3;
            int n4 = o3 + n(n3) + m(n3, n2, i3);
            int i18 = i16 + 1;
            int o4 = i7 + o(i17) + l(i17, i15, i13) + n[i18] + this.l[i18];
            int i19 = i3 + o4;
            int n5 = o4 + n(n4) + m(n4, n3, n2);
            int i20 = i18 + 1;
            int o5 = i13 + o(i19) + l(i19, i17, i15) + n[i20] + this.l[i20];
            i10 = n2 + o5;
            i6 = o5 + n(n5) + m(n5, n4, n3);
            int i21 = i20 + 1;
            int o6 = i15 + o(i10) + l(i10, i19, i17) + n[i21] + this.l[i21];
            i9 = n3 + o6;
            i5 = o6 + n(i6) + m(i6, n5, n4);
            int i22 = i21 + 1;
            int o7 = i17 + o(i9) + l(i9, i10, i19) + n[i22] + this.l[i22];
            i8 = n4 + o7;
            i4 = o7 + n(i5) + m(i5, i6, n5);
            int i23 = i22 + 1;
            int o8 = i19 + o(i8) + l(i8, i9, i10) + n[i23] + this.l[i23];
            i7 = n5 + o8;
            i3 = o8 + n(i4) + m(i4, i5, i6);
            i11 = i23 + 1;
        }
        this.d += i3;
        this.e += i4;
        this.f += i5;
        this.g += i6;
        this.h += i7;
        this.i += i8;
        this.j += i9;
        this.k += i10;
        this.m = 0;
        for (int i24 = 0; i24 < 16; i24++) {
            this.l[i24] = 0;
        }
    }

    @Override // defpackage.o63
    public void h(long j2) {
        if (this.m > 14) {
            g();
        }
        int[] iArr = this.l;
        iArr[14] = (int) (j2 >>> 32);
        iArr[15] = (int) (j2 & -1);
    }

    @Override // defpackage.o63
    public void i(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (bArr[i4 + 1] & 255) | (bArr[i2] << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8);
        int[] iArr = this.l;
        int i6 = this.m;
        iArr[i6] = i5;
        int i7 = i6 + 1;
        this.m = i7;
        if (i7 == 16) {
            g();
        }
    }

    @Override // defpackage.o63
    public void j() {
        super.j();
        this.d = -1056596264;
        this.e = 914150663;
        this.f = 812702999;
        this.g = -150054599;
        this.h = -4191439;
        this.i = 1750603025;
        this.j = 1694076839;
        this.k = -1090891868;
        this.m = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.l;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
