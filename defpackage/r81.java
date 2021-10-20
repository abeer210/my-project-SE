package defpackage;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import vigqyno.C0201;

/* renamed from: r81  reason: default package */
public abstract class r81 extends z71 {
    private static final Logger b = Logger.getLogger(r81.class.getName());
    private static final boolean c = kc1.L();
    public v81 a;

    /* access modifiers changed from: package-private */
    /* renamed from: r81$a */
    public static class a extends r81 {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        public a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.d = bArr;
                    this.e = i;
                    this.g = i;
                    this.f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format(C0201.m82(30889), Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException(C0201.m82(30890));
        }

        @Override // defpackage.r81
        public final void A(int i, String str) throws IOException {
            w(i, 2);
            o0(str);
        }

        @Override // defpackage.r81
        public final void B(int i, boolean z) throws IOException {
            w(i, 0);
            f0(z ? (byte) 1 : 0);
        }

        @Override // defpackage.r81
        public final void C(wa1 wa1) throws IOException {
            E(wa1.a());
            wa1.g(this);
        }

        @Override // defpackage.r81
        public final void D(int i) throws IOException {
            if (i >= 0) {
                E(i);
            } else {
                N((long) i);
            }
        }

        @Override // defpackage.r81
        public final void E(int i) throws IOException {
            if (!r81.c || v71.b() || I0() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format(C0201.m82(30891), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                kc1.i(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                kc1.i(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.d;
                    int i7 = this.g;
                    this.g = i7 + 1;
                    kc1.i(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                kc1.i(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.d;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    kc1.i(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.d;
                int i11 = this.g;
                this.g = i11 + 1;
                kc1.i(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.d;
                    int i13 = this.g;
                    this.g = i13 + 1;
                    kc1.i(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.d;
                int i14 = this.g;
                this.g = i14 + 1;
                kc1.i(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.d;
                int i15 = this.g;
                this.g = i15 + 1;
                kc1.i(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        @Override // defpackage.r81
        public final void G(int i) throws IOException {
            try {
                byte[] bArr = this.d;
                int i2 = this.g;
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.d;
                int i4 = i3 + 1;
                this.g = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.d;
                int i5 = i4 + 1;
                this.g = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.d;
                this.g = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format(C0201.m82(30892), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // defpackage.r81
        public final int I0() {
            return this.f - this.g;
        }

        public final int L0() {
            return this.g - this.e;
        }

        @Override // defpackage.r81
        public final void N(long j) throws IOException {
            if (!r81.c || I0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.d;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format(C0201.m82(30893), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    kc1.i(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                kc1.i(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        @Override // defpackage.r81
        public final void R(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                int i2 = i + 1;
                this.g = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.d;
                int i3 = i2 + 1;
                this.g = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.d;
                int i4 = i3 + 1;
                this.g = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.d;
                int i5 = i4 + 1;
                this.g = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.d;
                int i6 = i5 + 1;
                this.g = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.d;
                int i7 = i6 + 1;
                this.g = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.d;
                int i8 = i7 + 1;
                this.g = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.d;
                this.g = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format(C0201.m82(30894), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // defpackage.z71
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            c(bArr, i, i2);
        }

        @Override // defpackage.r81
        public void b() {
        }

        @Override // defpackage.r81
        public final void c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format(C0201.m82(30895), Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e2);
            }
        }

        @Override // defpackage.r81
        public final void f0(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format(C0201.m82(30896), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // defpackage.r81
        public final void g0(int i, int i2) throws IOException {
            w(i, 0);
            D(i2);
        }

        @Override // defpackage.r81
        public final void h0(int i, long j) throws IOException {
            w(i, 1);
            R(j);
        }

        @Override // defpackage.r81
        public final void j(int i, long j) throws IOException {
            w(i, 0);
            N(j);
        }

        @Override // defpackage.r81
        public final void k(int i, c81 c81) throws IOException {
            w(i, 2);
            n(c81);
        }

        @Override // defpackage.r81
        public final void l(int i, wa1 wa1) throws IOException {
            w(i, 2);
            C(wa1);
        }

        @Override // defpackage.r81
        public final void m(int i, wa1 wa1, lb1 lb1) throws IOException {
            w(i, 2);
            s71 s71 = (s71) wa1;
            int k = s71.k();
            if (k == -1) {
                k = lb1.i(s71);
                s71.j(k);
            }
            E(k);
            lb1.f(wa1, this.a);
        }

        @Override // defpackage.r81
        public final void n(c81 c81) throws IOException {
            E(c81.size());
            c81.d(this);
        }

        @Override // defpackage.r81
        public final void n0(int i, int i2) throws IOException {
            w(i, 0);
            E(i2);
        }

        @Override // defpackage.r81
        public final void o0(String str) throws IOException {
            int i = this.g;
            try {
                int J = r81.J(str.length() * 3);
                int J2 = r81.J(str.length());
                if (J2 == J) {
                    int i2 = i + J2;
                    this.g = i2;
                    int b = nc1.b(str, this.d, i2, I0());
                    this.g = i;
                    E((b - i) - J2);
                    this.g = b;
                    return;
                }
                E(nc1.a(str));
                this.g = nc1.b(str, this.d, this.g, I0());
            } catch (rc1 e2) {
                this.g = i;
                o(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        @Override // defpackage.r81
        public final void t0(byte[] bArr, int i, int i2) throws IOException {
            E(i2);
            c(bArr, 0, i2);
        }

        @Override // defpackage.r81
        public final void w(int i, int i2) throws IOException {
            E((i << 3) | i2);
        }

        @Override // defpackage.r81
        public final void w0(int i, int i2) throws IOException {
            w(i, 5);
            G(i2);
        }

        @Override // defpackage.r81
        public final void y(int i, c81 c81) throws IOException {
            w(1, 3);
            n0(2, i);
            k(3, c81);
            w(1, 4);
        }

        @Override // defpackage.r81
        public final void z(int i, wa1 wa1) throws IOException {
            w(1, 3);
            n0(2, i);
            l(3, wa1);
            w(1, 4);
        }
    }

    /* renamed from: r81$b */
    public static class b extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        public b(String str) {
            super(r0 != 0 ? r1.concat(r3) : new String(r1));
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String r1 = C0201.m82(30930);
        }

        public b(Throwable th) {
            super(C0201.m82(30932), th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        public b(String str, Throwable th) {
            super(r0 != 0 ? r1.concat(r3) : new String(r1), th);
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String r1 = C0201.m82(30931);
        }
    }

    /* renamed from: r81$c */
    static final class c extends a {
        private final ByteBuffer h;
        private int i;

        public c(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.h = byteBuffer;
            this.i = byteBuffer.position();
        }

        @Override // defpackage.r81.a, defpackage.r81
        public final void b() {
            this.h.position(this.i + L0());
        }
    }

    /* renamed from: r81$d */
    static final class d extends r81 {
        private final ByteBuffer d;
        private final ByteBuffer e;
        private final long f;
        private final long g;
        private final long h;
        private final long i;
        private long j = this.g;

        public d(ByteBuffer byteBuffer) {
            super();
            this.d = byteBuffer;
            this.e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long k = kc1.k(byteBuffer);
            this.f = k;
            this.g = k + ((long) byteBuffer.position());
            long limit = this.f + ((long) byteBuffer.limit());
            this.h = limit;
            this.i = limit - 10;
        }

        private final void M0(long j2) {
            this.e.position((int) (j2 - this.f));
        }

        @Override // defpackage.r81
        public final void A(int i2, String str) throws IOException {
            w(i2, 2);
            o0(str);
        }

        @Override // defpackage.r81
        public final void B(int i2, boolean z) throws IOException {
            w(i2, 0);
            f0(z ? (byte) 1 : 0);
        }

        @Override // defpackage.r81
        public final void C(wa1 wa1) throws IOException {
            E(wa1.a());
            wa1.g(this);
        }

        @Override // defpackage.r81
        public final void D(int i2) throws IOException {
            if (i2 >= 0) {
                E(i2);
            } else {
                N((long) i2);
            }
        }

        @Override // defpackage.r81
        public final void E(int i2) throws IOException {
            if (this.j <= this.i) {
                while ((i2 & -128) != 0) {
                    long j2 = this.j;
                    this.j = j2 + 1;
                    kc1.b(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                long j3 = this.j;
                this.j = 1 + j3;
                kc1.b(j3, (byte) i2);
                return;
            }
            while (true) {
                long j4 = this.j;
                if (j4 >= this.h) {
                    throw new b(String.format(C0201.m82(31056), Long.valueOf(this.j), Long.valueOf(this.h), 1));
                } else if ((i2 & -128) == 0) {
                    this.j = 1 + j4;
                    kc1.b(j4, (byte) i2);
                    return;
                } else {
                    this.j = j4 + 1;
                    kc1.b(j4, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            }
        }

        @Override // defpackage.r81
        public final void G(int i2) throws IOException {
            this.e.putInt((int) (this.j - this.f), i2);
            this.j += 4;
        }

        @Override // defpackage.r81
        public final int I0() {
            return (int) (this.h - this.j);
        }

        public final void L0(wa1 wa1, lb1 lb1) throws IOException {
            s71 s71 = (s71) wa1;
            int k = s71.k();
            if (k == -1) {
                k = lb1.i(s71);
                s71.j(k);
            }
            E(k);
            lb1.f(wa1, this.a);
        }

        @Override // defpackage.r81
        public final void N(long j2) throws IOException {
            if (this.j <= this.i) {
                while ((j2 & -128) != 0) {
                    long j3 = this.j;
                    this.j = j3 + 1;
                    kc1.b(j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                long j4 = this.j;
                this.j = 1 + j4;
                kc1.b(j4, (byte) ((int) j2));
                return;
            }
            while (true) {
                long j5 = this.j;
                if (j5 >= this.h) {
                    throw new b(String.format(C0201.m82(31057), Long.valueOf(this.j), Long.valueOf(this.h), 1));
                } else if ((j2 & -128) == 0) {
                    this.j = 1 + j5;
                    kc1.b(j5, (byte) ((int) j2));
                    return;
                } else {
                    this.j = j5 + 1;
                    kc1.b(j5, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
            }
        }

        @Override // defpackage.r81
        public final void R(long j2) throws IOException {
            this.e.putLong((int) (this.j - this.f), j2);
            this.j += 8;
        }

        @Override // defpackage.z71
        public final void a(byte[] bArr, int i2, int i3) throws IOException {
            c(bArr, i2, i3);
        }

        @Override // defpackage.r81
        public final void b() {
            this.d.position((int) (this.j - this.f));
        }

        @Override // defpackage.r81
        public final void c(byte[] bArr, int i2, int i3) throws IOException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = (long) i3;
                long j3 = this.j;
                if (this.h - j2 >= j3) {
                    kc1.j(bArr, (long) i2, j3, j2);
                    this.j += j2;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException(C0201.m82(31058));
            }
            throw new b(String.format(C0201.m82(31059), Long.valueOf(this.j), Long.valueOf(this.h), Integer.valueOf(i3)));
        }

        @Override // defpackage.r81
        public final void f0(byte b) throws IOException {
            long j2 = this.j;
            if (j2 < this.h) {
                this.j = 1 + j2;
                kc1.b(j2, b);
                return;
            }
            throw new b(String.format(C0201.m82(31060), Long.valueOf(this.j), Long.valueOf(this.h), 1));
        }

        @Override // defpackage.r81
        public final void g0(int i2, int i3) throws IOException {
            w(i2, 0);
            D(i3);
        }

        @Override // defpackage.r81
        public final void h0(int i2, long j2) throws IOException {
            w(i2, 1);
            R(j2);
        }

        @Override // defpackage.r81
        public final void j(int i2, long j2) throws IOException {
            w(i2, 0);
            N(j2);
        }

        @Override // defpackage.r81
        public final void k(int i2, c81 c81) throws IOException {
            w(i2, 2);
            n(c81);
        }

        @Override // defpackage.r81
        public final void l(int i2, wa1 wa1) throws IOException {
            w(i2, 2);
            C(wa1);
        }

        @Override // defpackage.r81
        public final void m(int i2, wa1 wa1, lb1 lb1) throws IOException {
            w(i2, 2);
            L0(wa1, lb1);
        }

        @Override // defpackage.r81
        public final void n(c81 c81) throws IOException {
            E(c81.size());
            c81.d(this);
        }

        @Override // defpackage.r81
        public final void n0(int i2, int i3) throws IOException {
            w(i2, 0);
            E(i3);
        }

        @Override // defpackage.r81
        public final void o0(String str) throws IOException {
            long j2 = this.j;
            try {
                int J = r81.J(str.length() * 3);
                int J2 = r81.J(str.length());
                if (J2 == J) {
                    int i2 = ((int) (this.j - this.f)) + J2;
                    this.e.position(i2);
                    nc1.c(str, this.e);
                    int position = this.e.position() - i2;
                    E(position);
                    this.j += (long) position;
                    return;
                }
                int a = nc1.a(str);
                E(a);
                M0(this.j);
                nc1.c(str, this.e);
                this.j += (long) a;
            } catch (rc1 e2) {
                this.j = j2;
                M0(j2);
                o(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new b(e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new b(e4);
            }
        }

        @Override // defpackage.r81
        public final void t0(byte[] bArr, int i2, int i3) throws IOException {
            E(i3);
            c(bArr, 0, i3);
        }

        @Override // defpackage.r81
        public final void w(int i2, int i3) throws IOException {
            E((i2 << 3) | i3);
        }

        @Override // defpackage.r81
        public final void w0(int i2, int i3) throws IOException {
            w(i2, 5);
            G(i3);
        }

        @Override // defpackage.r81
        public final void y(int i2, c81 c81) throws IOException {
            w(1, 3);
            n0(2, i2);
            k(3, c81);
            w(1, 4);
        }

        @Override // defpackage.r81
        public final void z(int i2, wa1 wa1) throws IOException {
            w(1, 3);
            n0(2, i2);
            l(3, wa1);
            w(1, 4);
        }
    }

    /* renamed from: r81$e */
    static final class e extends r81 {
        private final ByteBuffer d;
        private final ByteBuffer e;

        public e(ByteBuffer byteBuffer) {
            super();
            this.d = byteBuffer;
            this.e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.position();
        }

        private final void M0(String str) throws IOException {
            try {
                nc1.c(str, this.e);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(e2);
            }
        }

        @Override // defpackage.r81
        public final void A(int i, String str) throws IOException {
            w(i, 2);
            o0(str);
        }

        @Override // defpackage.r81
        public final void B(int i, boolean z) throws IOException {
            w(i, 0);
            f0(z ? (byte) 1 : 0);
        }

        @Override // defpackage.r81
        public final void C(wa1 wa1) throws IOException {
            E(wa1.a());
            wa1.g(this);
        }

        @Override // defpackage.r81
        public final void D(int i) throws IOException {
            if (i >= 0) {
                E(i);
            } else {
                N((long) i);
            }
        }

        @Override // defpackage.r81
        public final void E(int i) throws IOException {
            while ((i & -128) != 0) {
                this.e.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.e.put((byte) i);
            } catch (BufferOverflowException e2) {
                throw new b(e2);
            }
        }

        @Override // defpackage.r81
        public final void G(int i) throws IOException {
            try {
                this.e.putInt(i);
            } catch (BufferOverflowException e2) {
                throw new b(e2);
            }
        }

        @Override // defpackage.r81
        public final int I0() {
            return this.e.remaining();
        }

        public final void L0(wa1 wa1, lb1 lb1) throws IOException {
            s71 s71 = (s71) wa1;
            int k = s71.k();
            if (k == -1) {
                k = lb1.i(s71);
                s71.j(k);
            }
            E(k);
            lb1.f(wa1, this.a);
        }

        @Override // defpackage.r81
        public final void N(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.e.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.e.put((byte) ((int) j));
            } catch (BufferOverflowException e2) {
                throw new b(e2);
            }
        }

        @Override // defpackage.r81
        public final void R(long j) throws IOException {
            try {
                this.e.putLong(j);
            } catch (BufferOverflowException e2) {
                throw new b(e2);
            }
        }

        @Override // defpackage.z71
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            c(bArr, i, i2);
        }

        @Override // defpackage.r81
        public final void b() {
            this.d.position(this.e.position());
        }

        @Override // defpackage.r81
        public final void c(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(e2);
            } catch (BufferOverflowException e3) {
                throw new b(e3);
            }
        }

        @Override // defpackage.r81
        public final void f0(byte b) throws IOException {
            try {
                this.e.put(b);
            } catch (BufferOverflowException e2) {
                throw new b(e2);
            }
        }

        @Override // defpackage.r81
        public final void g0(int i, int i2) throws IOException {
            w(i, 0);
            D(i2);
        }

        @Override // defpackage.r81
        public final void h0(int i, long j) throws IOException {
            w(i, 1);
            R(j);
        }

        @Override // defpackage.r81
        public final void j(int i, long j) throws IOException {
            w(i, 0);
            N(j);
        }

        @Override // defpackage.r81
        public final void k(int i, c81 c81) throws IOException {
            w(i, 2);
            n(c81);
        }

        @Override // defpackage.r81
        public final void l(int i, wa1 wa1) throws IOException {
            w(i, 2);
            C(wa1);
        }

        @Override // defpackage.r81
        public final void m(int i, wa1 wa1, lb1 lb1) throws IOException {
            w(i, 2);
            L0(wa1, lb1);
        }

        @Override // defpackage.r81
        public final void n(c81 c81) throws IOException {
            E(c81.size());
            c81.d(this);
        }

        @Override // defpackage.r81
        public final void n0(int i, int i2) throws IOException {
            w(i, 0);
            E(i2);
        }

        @Override // defpackage.r81
        public final void o0(String str) throws IOException {
            int position = this.e.position();
            try {
                int J = r81.J(str.length() * 3);
                int J2 = r81.J(str.length());
                if (J2 == J) {
                    int position2 = this.e.position() + J2;
                    this.e.position(position2);
                    M0(str);
                    int position3 = this.e.position();
                    this.e.position(position);
                    E(position3 - position2);
                    this.e.position(position3);
                    return;
                }
                E(nc1.a(str));
                M0(str);
            } catch (rc1 e2) {
                this.e.position(position);
                o(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new b(e3);
            }
        }

        @Override // defpackage.r81
        public final void t0(byte[] bArr, int i, int i2) throws IOException {
            E(i2);
            c(bArr, 0, i2);
        }

        @Override // defpackage.r81
        public final void w(int i, int i2) throws IOException {
            E((i << 3) | i2);
        }

        @Override // defpackage.r81
        public final void w0(int i, int i2) throws IOException {
            w(i, 5);
            G(i2);
        }

        @Override // defpackage.r81
        public final void y(int i, c81 c81) throws IOException {
            w(1, 3);
            n0(2, i);
            k(3, c81);
            w(1, 4);
        }

        @Override // defpackage.r81
        public final void z(int i, wa1 wa1) throws IOException {
            w(1, 3);
            n0(2, i);
            l(3, wa1);
            w(1, 4);
        }
    }

    private r81() {
    }

    public static int A0(int i, int i2) {
        return H(i) + J(i2);
    }

    public static int B0(int i, long j) {
        return H(i) + 8;
    }

    public static int C0(int i, int i2) {
        return H(i) + J(Q(i2));
    }

    public static int D0(int i, int i2) {
        return H(i) + 4;
    }

    public static int E0(int i, int i2) {
        return H(i) + 4;
    }

    public static int F0(int i, int i2) {
        return H(i) + I(i2);
    }

    public static int H(int i) {
        return J(i << 3);
    }

    public static int H0(boolean z) {
        return 1;
    }

    public static int I(int i) {
        if (i >= 0) {
            return J(i);
        }
        return 10;
    }

    public static int J(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int K(int i) {
        return J(Q(i));
    }

    public static int L(int i) {
        return 4;
    }

    public static int M(int i) {
        return 4;
    }

    public static int O(int i) {
        return I(i);
    }

    private static int Q(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int S(int i) {
        return J(i);
    }

    public static int T(long j) {
        return U(j);
    }

    public static int U(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int V(long j) {
        return U(Y(j));
    }

    public static int W(long j) {
        return 8;
    }

    public static int X(long j) {
        return 8;
    }

    private static long Y(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int Z(int i, c81 c81) {
        int H = H(i);
        int size = c81.size();
        return H + J(size) + size;
    }

    public static int a0(int i, wa1 wa1) {
        return H(i) + e0(wa1);
    }

    @Deprecated
    public static int b0(int i, wa1 wa1, lb1 lb1) {
        int H = H(i) << 1;
        s71 s71 = (s71) wa1;
        int k = s71.k();
        if (k == -1) {
            k = lb1.i(s71);
            s71.j(k);
        }
        return H + k;
    }

    public static int c0(int i, String str) {
        return H(i) + p0(str);
    }

    public static int d(int i, aa1 aa1) {
        int H = H(i);
        int d2 = aa1.d();
        return H + J(d2) + d2;
    }

    public static int d0(int i, boolean z) {
        return H(i) + 1;
    }

    public static int e(aa1 aa1) {
        int d2 = aa1.d();
        return J(d2) + d2;
    }

    public static int e0(wa1 wa1) {
        int a2 = wa1.a();
        return J(a2) + a2;
    }

    public static r81 f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new c(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException(C0201.m82(20698));
        } else if (kc1.M()) {
            return new d(byteBuffer);
        } else {
            return new e(byteBuffer);
        }
    }

    public static int i0(int i, long j) {
        return H(i) + U(j);
    }

    public static int j0(int i, c81 c81) {
        return (H(1) << 1) + A0(2, i) + Z(3, c81);
    }

    public static int k0(int i, wa1 wa1) {
        return (H(1) << 1) + A0(2, i) + a0(3, wa1);
    }

    @Deprecated
    public static int l0(wa1 wa1) {
        return wa1.a();
    }

    public static int p(float f) {
        return 4;
    }

    public static int p0(String str) {
        int i;
        try {
            i = nc1.a(str);
        } catch (rc1 unused) {
            i = str.getBytes(m91.a).length;
        }
        return J(i) + i;
    }

    public static int q(int i, double d2) {
        return H(i) + 8;
    }

    public static int q0(double d2) {
        return 8;
    }

    public static int r(int i, float f) {
        return H(i) + 4;
    }

    public static int r0(int i, long j) {
        return H(i) + U(j);
    }

    public static int s(int i, aa1 aa1) {
        return (H(1) << 1) + A0(2, i) + d(3, aa1);
    }

    public static int t(int i, wa1 wa1, lb1 lb1) {
        return H(i) + v(wa1, lb1);
    }

    public static int u(c81 c81) {
        int size = c81.size();
        return J(size) + size;
    }

    public static int u0(int i, long j) {
        return H(i) + U(Y(j));
    }

    public static int v(wa1 wa1, lb1 lb1) {
        s71 s71 = (s71) wa1;
        int k = s71.k();
        if (k == -1) {
            k = lb1.i(s71);
            s71.j(k);
        }
        return J(k) + k;
    }

    public static r81 v0(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int x0(int i, int i2) {
        return H(i) + I(i2);
    }

    public static int y0(int i, long j) {
        return H(i) + 8;
    }

    public static int z0(byte[] bArr) {
        int length = bArr.length;
        return J(length) + length;
    }

    public abstract void A(int i, String str) throws IOException;

    public abstract void B(int i, boolean z) throws IOException;

    public abstract void C(wa1 wa1) throws IOException;

    public abstract void D(int i) throws IOException;

    public abstract void E(int i) throws IOException;

    public final void F(int i) throws IOException {
        E(Q(i));
    }

    public abstract void G(int i) throws IOException;

    public final void G0(boolean z) throws IOException {
        f0(z ? (byte) 1 : 0);
    }

    public abstract int I0();

    public final void J0() {
        if (I0() != 0) {
            throw new IllegalStateException(C0201.m82(20699));
        }
    }

    public abstract void N(long j) throws IOException;

    public final void P(long j) throws IOException {
        N(Y(j));
    }

    public abstract void R(long j) throws IOException;

    public abstract void b() throws IOException;

    public abstract void c(byte[] bArr, int i, int i2) throws IOException;

    public abstract void f0(byte b2) throws IOException;

    public final void g(float f) throws IOException {
        G(Float.floatToRawIntBits(f));
    }

    public abstract void g0(int i, int i2) throws IOException;

    public final void h(int i, double d2) throws IOException {
        h0(i, Double.doubleToRawLongBits(d2));
    }

    public abstract void h0(int i, long j) throws IOException;

    public final void i(int i, float f) throws IOException {
        w0(i, Float.floatToRawIntBits(f));
    }

    public abstract void j(int i, long j) throws IOException;

    public abstract void k(int i, c81 c81) throws IOException;

    public abstract void l(int i, wa1 wa1) throws IOException;

    public abstract void m(int i, wa1 wa1, lb1 lb1) throws IOException;

    public final void m0(double d2) throws IOException {
        R(Double.doubleToRawLongBits(d2));
    }

    public abstract void n(c81 c81) throws IOException;

    public abstract void n0(int i, int i2) throws IOException;

    public final void o(String str, rc1 rc1) throws IOException {
        b.logp(Level.WARNING, C0201.m82(20700), C0201.m82(20701), C0201.m82(20702), (Throwable) rc1);
        byte[] bytes = str.getBytes(m91.a);
        try {
            E(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new b(e2);
        } catch (b e3) {
            throw e3;
        }
    }

    public abstract void o0(String str) throws IOException;

    public final void s0(int i, int i2) throws IOException {
        n0(i, Q(i2));
    }

    public abstract void t0(byte[] bArr, int i, int i2) throws IOException;

    public abstract void w(int i, int i2) throws IOException;

    public abstract void w0(int i, int i2) throws IOException;

    public final void x(int i, long j) throws IOException {
        j(i, Y(j));
    }

    public abstract void y(int i, c81 c81) throws IOException;

    public abstract void z(int i, wa1 wa1) throws IOException;
}
