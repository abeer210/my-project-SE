package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: a53  reason: default package */
/* compiled from: MSOutlookKeyIdCalculator */
public class a53 {

    /* access modifiers changed from: private */
    /* renamed from: a53$a */
    /* compiled from: MSOutlookKeyIdCalculator */
    public static abstract class a {
        private byte[] a = new byte[4];
        private int b = 0;
        private long c;

        public void a() {
            long j = this.c << 3;
            f(Byte.MIN_VALUE);
            while (this.b != 0) {
                f((byte) 0);
            }
            c(j);
            b();
        }

        public abstract void b();

        public abstract void c(long j);

        public abstract void d(byte[] bArr, int i);

        public void e() {
            this.c = 0;
            this.b = 0;
            int i = 0;
            while (true) {
                byte[] bArr = this.a;
                if (i < bArr.length) {
                    bArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }

        public void f(byte b2) {
            byte[] bArr = this.a;
            int i = this.b;
            int i2 = i + 1;
            this.b = i2;
            bArr[i] = b2;
            if (i2 == bArr.length) {
                d(bArr, 0);
                this.b = 0;
            }
            this.c++;
        }

        public void g(byte[] bArr, int i, int i2) {
            while (this.b != 0 && i2 > 0) {
                f(bArr[i]);
                i++;
                i2--;
            }
            while (i2 > this.a.length) {
                d(bArr, i);
                byte[] bArr2 = this.a;
                i += bArr2.length;
                i2 -= bArr2.length;
                this.c += (long) bArr2.length;
            }
            while (i2 > 0) {
                f(bArr[i]);
                i++;
                i2--;
            }
        }
    }

    /* renamed from: a53$b */
    /* compiled from: MSOutlookKeyIdCalculator */
    private static class b extends a {
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int[] i = new int[80];
        private int j;

        public b() {
            e();
        }

        private int i(int i2, int i3, int i4) {
            return ((i2 ^ -1) & i4) | (i3 & i2);
        }

        private int j(int i2, int i3, int i4) {
            return (i2 & i4) | (i2 & i3) | (i3 & i4);
        }

        private int l(int i2, int i3, int i4) {
            return (i2 ^ i3) ^ i4;
        }

        @Override // defpackage.a53.a
        public void b() {
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
                int i12 = i8 + ((i4 << 5) | (i4 >>> 27)) + i(i5, i6, i7) + this.i[i10] + 1518500249;
                int i13 = (i5 >>> 2) | (i5 << 30);
                int i14 = i11 + 1;
                int i15 = i7 + ((i12 << 5) | (i12 >>> 27)) + i(i4, i13, i6) + this.i[i11] + 1518500249;
                int i16 = (i4 >>> 2) | (i4 << 30);
                int i17 = i14 + 1;
                int i18 = i6 + ((i15 << 5) | (i15 >>> 27)) + i(i12, i16, i13) + this.i[i14] + 1518500249;
                i8 = (i12 >>> 2) | (i12 << 30);
                int i19 = i17 + 1;
                i5 = i13 + ((i18 << 5) | (i18 >>> 27)) + i(i15, i8, i16) + this.i[i17] + 1518500249;
                i7 = (i15 >>> 2) | (i15 << 30);
                i4 = i16 + ((i5 << 5) | (i5 >>> 27)) + i(i18, i7, i8) + this.i[i19] + 1518500249;
                i6 = (i18 >>> 2) | (i18 << 30);
                i9++;
                i10 = i19 + 1;
            }
            int i20 = 0;
            while (i20 < 4) {
                int i21 = i10 + 1;
                int l = i8 + ((i4 << 5) | (i4 >>> 27)) + l(i5, i6, i7) + this.i[i10] + 1859775393;
                int i22 = (i5 >>> 2) | (i5 << 30);
                int i23 = i21 + 1;
                int l2 = i7 + ((l << 5) | (l >>> 27)) + l(i4, i22, i6) + this.i[i21] + 1859775393;
                int i24 = (i4 >>> 2) | (i4 << 30);
                int i25 = i23 + 1;
                int l3 = i6 + ((l2 << 5) | (l2 >>> 27)) + l(l, i24, i22) + this.i[i23] + 1859775393;
                i8 = (l >>> 2) | (l << 30);
                int i26 = i25 + 1;
                i5 = i22 + ((l3 << 5) | (l3 >>> 27)) + l(l2, i8, i24) + this.i[i25] + 1859775393;
                i7 = (l2 >>> 2) | (l2 << 30);
                i4 = i24 + ((i5 << 5) | (i5 >>> 27)) + l(l3, i7, i8) + this.i[i26] + 1859775393;
                i6 = (l3 >>> 2) | (l3 << 30);
                i20++;
                i10 = i26 + 1;
            }
            int i27 = 0;
            while (i27 < 4) {
                int i28 = i10 + 1;
                int j2 = i8 + (((((i4 << 5) | (i4 >>> 27)) + j(i5, i6, i7)) + this.i[i10]) - 1894007588);
                int i29 = (i5 >>> 2) | (i5 << 30);
                int i30 = i28 + 1;
                int j3 = i7 + (((((j2 << 5) | (j2 >>> 27)) + j(i4, i29, i6)) + this.i[i28]) - 1894007588);
                int i31 = (i4 >>> 2) | (i4 << 30);
                int i32 = i30 + 1;
                int j4 = i6 + (((((j3 << 5) | (j3 >>> 27)) + j(j2, i31, i29)) + this.i[i30]) - 1894007588);
                i8 = (j2 >>> 2) | (j2 << 30);
                int i33 = i32 + 1;
                i5 = i29 + (((((j4 << 5) | (j4 >>> 27)) + j(j3, i8, i31)) + this.i[i32]) - 1894007588);
                i7 = (j3 >>> 2) | (j3 << 30);
                i4 = i31 + (((((i5 << 5) | (i5 >>> 27)) + j(j4, i7, i8)) + this.i[i33]) - 1894007588);
                i6 = (j4 >>> 2) | (j4 << 30);
                i27++;
                i10 = i33 + 1;
            }
            int i34 = 0;
            while (i34 <= 3) {
                int i35 = i10 + 1;
                int l4 = i8 + (((((i4 << 5) | (i4 >>> 27)) + l(i5, i6, i7)) + this.i[i10]) - 899497514);
                int i36 = (i5 >>> 2) | (i5 << 30);
                int i37 = i35 + 1;
                int l5 = i7 + (((((l4 << 5) | (l4 >>> 27)) + l(i4, i36, i6)) + this.i[i35]) - 899497514);
                int i38 = (i4 >>> 2) | (i4 << 30);
                int i39 = i37 + 1;
                int l6 = i6 + (((((l5 << 5) | (l5 >>> 27)) + l(l4, i38, i36)) + this.i[i37]) - 899497514);
                i8 = (l4 >>> 2) | (l4 << 30);
                int i40 = i39 + 1;
                i5 = i36 + (((((l6 << 5) | (l6 >>> 27)) + l(l5, i8, i38)) + this.i[i39]) - 899497514);
                i7 = (l5 >>> 2) | (l5 << 30);
                i4 = i38 + (((((i5 << 5) | (i5 >>> 27)) + l(l6, i7, i8)) + this.i[i40]) - 899497514);
                i6 = (l6 >>> 2) | (l6 << 30);
                i34++;
                i10 = i40 + 1;
            }
            this.d += i4;
            this.e += i5;
            this.f += i6;
            this.g += i7;
            this.h += i8;
            this.j = 0;
            for (int i41 = 0; i41 < 16; i41++) {
                this.i[i41] = 0;
            }
        }

        @Override // defpackage.a53.a
        public void c(long j2) {
            if (this.j > 14) {
                b();
            }
            int[] iArr = this.i;
            iArr[14] = (int) (j2 >>> 32);
            iArr[15] = (int) (j2 & -1);
        }

        @Override // defpackage.a53.a
        public void d(byte[] bArr, int i2) {
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            int i5 = (bArr[i4 + 1] & 255) | (bArr[i2] << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8);
            int[] iArr = this.i;
            int i6 = this.j;
            iArr[i6] = i5;
            int i7 = i6 + 1;
            this.j = i7;
            if (i7 == 16) {
                b();
            }
        }

        @Override // defpackage.a53.a
        public void e() {
            super.e();
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

        public int h(byte[] bArr, int i2) {
            a();
            jb3.c(this.d, bArr, i2);
            jb3.c(this.e, bArr, i2 + 4);
            jb3.c(this.f, bArr, i2 + 8);
            jb3.c(this.g, bArr, i2 + 12);
            jb3.c(this.h, bArr, i2 + 16);
            e();
            return 20;
        }

        public int k() {
            return 20;
        }
    }

    public static byte[] a(t43 t43) {
        b bVar = new b();
        byte[] bArr = new byte[bVar.k()];
        try {
            byte[] f = t43.f(C0201.m82(17560));
            bVar.g(f, 0, f.length);
            bVar.h(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }
}
