package defpackage;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import vigqyno.C0201;

/* renamed from: ru0  reason: default package */
public abstract class ru0 extends eu0 {
    private static final Logger b = Logger.getLogger(ru0.class.getName());
    private static final boolean c = hy0.x();
    public tu0 a;

    /* renamed from: ru0$a */
    static class a extends ru0 {
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
                throw new IllegalArgumentException(String.format(C0201.m82(8281), Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException(C0201.m82(8282));
        }

        @Override // defpackage.ru0
        public final void A0(int i) throws IOException {
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
                bArr4[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format(C0201.m82(8283), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // defpackage.ru0
        public final void F(int i, int i2) throws IOException {
            y0((i << 3) | i2);
        }

        @Override // defpackage.ru0
        public final void H(int i, fu0 fu0) throws IOException {
            F(1, 3);
            a0(2, i);
            m(3, fu0);
            F(1, 4);
        }

        @Override // defpackage.ru0
        public final void I(int i, qw0 qw0) throws IOException {
            F(1, 3);
            a0(2, i);
            n(3, qw0);
            F(1, 4);
        }

        @Override // defpackage.ru0
        public final void J(int i, boolean z) throws IOException {
            F(i, 0);
            g(z ? (byte) 1 : 0);
        }

        @Override // defpackage.ru0
        public final void K(long j) throws IOException {
            if (!ru0.c || t() < 10) {
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
                    throw new c(String.format(C0201.m82(8284), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    hy0.k(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                hy0.k(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final int K0() {
            return this.g - this.e;
        }

        @Override // defpackage.ru0
        public final void L(qw0 qw0) throws IOException {
            y0(qw0.f());
            qw0.d(this);
        }

        @Override // defpackage.ru0
        public final void S(int i, int i2) throws IOException {
            F(i, 0);
            x0(i2);
        }

        @Override // defpackage.ru0
        public final void T(int i, long j) throws IOException {
            F(i, 1);
            b0(j);
        }

        @Override // defpackage.eu0
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            c(bArr, i, i2);
        }

        @Override // defpackage.ru0
        public final void a0(int i, int i2) throws IOException {
            F(i, 0);
            y0(i2);
        }

        @Override // defpackage.ru0
        public void b() {
        }

        @Override // defpackage.ru0
        public final void b0(long j) throws IOException {
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
                throw new c(String.format(C0201.m82(8285), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // defpackage.ru0
        public final void c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format(C0201.m82(8286), Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e2);
            }
        }

        @Override // defpackage.ru0
        public final void c0(byte[] bArr, int i, int i2) throws IOException {
            y0(i2);
            c(bArr, 0, i2);
        }

        @Override // defpackage.ru0
        public final void g(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format(C0201.m82(8287), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // defpackage.ru0
        public final void i0(int i, int i2) throws IOException {
            F(i, 5);
            A0(i2);
        }

        @Override // defpackage.ru0
        public final void l(int i, long j) throws IOException {
            F(i, 0);
            K(j);
        }

        @Override // defpackage.ru0
        public final void m(int i, fu0 fu0) throws IOException {
            F(i, 2);
            q(fu0);
        }

        @Override // defpackage.ru0
        public final void m0(String str) throws IOException {
            int i = this.g;
            try {
                int D0 = ru0.D0(str.length() * 3);
                int D02 = ru0.D0(str.length());
                if (D02 == D0) {
                    int i2 = i + D02;
                    this.g = i2;
                    int b = jy0.b(str, this.d, i2, t());
                    this.g = i;
                    y0((b - i) - D02);
                    this.g = b;
                    return;
                }
                y0(jy0.a(str));
                this.g = jy0.b(str, this.d, this.g, t());
            } catch (my0 e2) {
                this.g = i;
                r(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new c(e3);
            }
        }

        @Override // defpackage.ru0
        public final void n(int i, qw0 qw0) throws IOException {
            F(i, 2);
            L(qw0);
        }

        @Override // defpackage.ru0
        public final void o(int i, qw0 qw0, ix0 ix0) throws IOException {
            F(i, 2);
            vt0 vt0 = (vt0) qw0;
            int j = vt0.j();
            if (j == -1) {
                j = ix0.b(vt0);
                vt0.i(j);
            }
            y0(j);
            ix0.h(qw0, this.a);
        }

        @Override // defpackage.ru0
        public final void p(int i, String str) throws IOException {
            F(i, 2);
            m0(str);
        }

        @Override // defpackage.ru0
        public final void q(fu0 fu0) throws IOException {
            y0(fu0.size());
            fu0.d(this);
        }

        @Override // defpackage.ru0
        public final int t() {
            return this.f - this.g;
        }

        @Override // defpackage.ru0
        public final void x0(int i) throws IOException {
            if (i >= 0) {
                y0(i);
            } else {
                K((long) i);
            }
        }

        @Override // defpackage.ru0
        public final void y0(int i) throws IOException {
            if (!ru0.c || t() < 10) {
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
                    throw new c(String.format(C0201.m82(8288), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i4 = this.g;
                    this.g = i4 + 1;
                    hy0.k(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                hy0.k(bArr4, (long) i5, (byte) i);
            }
        }
    }

    /* renamed from: ru0$b */
    static final class b extends a {
        private final ByteBuffer h;
        private int i;

        public b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.h = byteBuffer;
            this.i = byteBuffer.position();
        }

        @Override // defpackage.ru0.a, defpackage.ru0
        public final void b() {
            this.h.position(this.i + K0());
        }
    }

    /* renamed from: ru0$c */
    public static class c extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        public c(String str) {
            super(r0 != 0 ? r1.concat(r3) : new String(r1));
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String r1 = C0201.m82(7894);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        public c(String str, Throwable th) {
            super(r0 != 0 ? r1.concat(r3) : new String(r1), th);
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String r1 = C0201.m82(7895);
        }

        public c(Throwable th) {
            super(C0201.m82(7896), th);
        }
    }

    /* renamed from: ru0$d */
    static final class d extends ru0 {
        private final ByteBuffer d;
        private final ByteBuffer e;

        public d(ByteBuffer byteBuffer) {
            super();
            this.d = byteBuffer;
            this.e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.position();
        }

        private final void L0(String str) throws IOException {
            try {
                jy0.c(str, this.e);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            }
        }

        @Override // defpackage.ru0
        public final void A0(int i) throws IOException {
            try {
                this.e.putInt(i);
            } catch (BufferOverflowException e2) {
                throw new c(e2);
            }
        }

        @Override // defpackage.ru0
        public final void F(int i, int i2) throws IOException {
            y0((i << 3) | i2);
        }

        @Override // defpackage.ru0
        public final void H(int i, fu0 fu0) throws IOException {
            F(1, 3);
            a0(2, i);
            m(3, fu0);
            F(1, 4);
        }

        @Override // defpackage.ru0
        public final void I(int i, qw0 qw0) throws IOException {
            F(1, 3);
            a0(2, i);
            n(3, qw0);
            F(1, 4);
        }

        @Override // defpackage.ru0
        public final void J(int i, boolean z) throws IOException {
            F(i, 0);
            g(z ? (byte) 1 : 0);
        }

        @Override // defpackage.ru0
        public final void K(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.e.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.e.put((byte) ((int) j));
            } catch (BufferOverflowException e2) {
                throw new c(e2);
            }
        }

        public final void K0(qw0 qw0, ix0 ix0) throws IOException {
            vt0 vt0 = (vt0) qw0;
            int j = vt0.j();
            if (j == -1) {
                j = ix0.b(vt0);
                vt0.i(j);
            }
            y0(j);
            ix0.h(qw0, this.a);
        }

        @Override // defpackage.ru0
        public final void L(qw0 qw0) throws IOException {
            y0(qw0.f());
            qw0.d(this);
        }

        @Override // defpackage.ru0
        public final void S(int i, int i2) throws IOException {
            F(i, 0);
            x0(i2);
        }

        @Override // defpackage.ru0
        public final void T(int i, long j) throws IOException {
            F(i, 1);
            b0(j);
        }

        @Override // defpackage.eu0
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            c(bArr, i, i2);
        }

        @Override // defpackage.ru0
        public final void a0(int i, int i2) throws IOException {
            F(i, 0);
            y0(i2);
        }

        @Override // defpackage.ru0
        public final void b() {
            this.d.position(this.e.position());
        }

        @Override // defpackage.ru0
        public final void b0(long j) throws IOException {
            try {
                this.e.putLong(j);
            } catch (BufferOverflowException e2) {
                throw new c(e2);
            }
        }

        @Override // defpackage.ru0
        public final void c(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            } catch (BufferOverflowException e3) {
                throw new c(e3);
            }
        }

        @Override // defpackage.ru0
        public final void c0(byte[] bArr, int i, int i2) throws IOException {
            y0(i2);
            c(bArr, 0, i2);
        }

        @Override // defpackage.ru0
        public final void g(byte b) throws IOException {
            try {
                this.e.put(b);
            } catch (BufferOverflowException e2) {
                throw new c(e2);
            }
        }

        @Override // defpackage.ru0
        public final void i0(int i, int i2) throws IOException {
            F(i, 5);
            A0(i2);
        }

        @Override // defpackage.ru0
        public final void l(int i, long j) throws IOException {
            F(i, 0);
            K(j);
        }

        @Override // defpackage.ru0
        public final void m(int i, fu0 fu0) throws IOException {
            F(i, 2);
            q(fu0);
        }

        @Override // defpackage.ru0
        public final void m0(String str) throws IOException {
            int position = this.e.position();
            try {
                int D0 = ru0.D0(str.length() * 3);
                int D02 = ru0.D0(str.length());
                if (D02 == D0) {
                    int position2 = this.e.position() + D02;
                    this.e.position(position2);
                    L0(str);
                    int position3 = this.e.position();
                    this.e.position(position);
                    y0(position3 - position2);
                    this.e.position(position3);
                    return;
                }
                y0(jy0.a(str));
                L0(str);
            } catch (my0 e2) {
                this.e.position(position);
                r(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new c(e3);
            }
        }

        @Override // defpackage.ru0
        public final void n(int i, qw0 qw0) throws IOException {
            F(i, 2);
            L(qw0);
        }

        @Override // defpackage.ru0
        public final void o(int i, qw0 qw0, ix0 ix0) throws IOException {
            F(i, 2);
            K0(qw0, ix0);
        }

        @Override // defpackage.ru0
        public final void p(int i, String str) throws IOException {
            F(i, 2);
            m0(str);
        }

        @Override // defpackage.ru0
        public final void q(fu0 fu0) throws IOException {
            y0(fu0.size());
            fu0.d(this);
        }

        @Override // defpackage.ru0
        public final int t() {
            return this.e.remaining();
        }

        @Override // defpackage.ru0
        public final void x0(int i) throws IOException {
            if (i >= 0) {
                y0(i);
            } else {
                K((long) i);
            }
        }

        @Override // defpackage.ru0
        public final void y0(int i) throws IOException {
            while ((i & -128) != 0) {
                this.e.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.e.put((byte) i);
            } catch (BufferOverflowException e2) {
                throw new c(e2);
            }
        }
    }

    /* renamed from: ru0$e */
    static final class e extends ru0 {
        private final ByteBuffer d;
        private final ByteBuffer e;
        private final long f;
        private final long g;
        private final long h;
        private final long i;
        private long j = this.g;

        public e(ByteBuffer byteBuffer) {
            super();
            this.d = byteBuffer;
            this.e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long o = hy0.o(byteBuffer);
            this.f = o;
            this.g = o + ((long) byteBuffer.position());
            long limit = this.f + ((long) byteBuffer.limit());
            this.h = limit;
            this.i = limit - 10;
        }

        private final void L0(long j2) {
            this.e.position((int) (j2 - this.f));
        }

        @Override // defpackage.ru0
        public final void A0(int i2) throws IOException {
            this.e.putInt((int) (this.j - this.f), i2);
            this.j += 4;
        }

        @Override // defpackage.ru0
        public final void F(int i2, int i3) throws IOException {
            y0((i2 << 3) | i3);
        }

        @Override // defpackage.ru0
        public final void H(int i2, fu0 fu0) throws IOException {
            F(1, 3);
            a0(2, i2);
            m(3, fu0);
            F(1, 4);
        }

        @Override // defpackage.ru0
        public final void I(int i2, qw0 qw0) throws IOException {
            F(1, 3);
            a0(2, i2);
            n(3, qw0);
            F(1, 4);
        }

        @Override // defpackage.ru0
        public final void J(int i2, boolean z) throws IOException {
            F(i2, 0);
            g(z ? (byte) 1 : 0);
        }

        @Override // defpackage.ru0
        public final void K(long j2) throws IOException {
            long j3;
            if (this.j <= this.i) {
                while (true) {
                    int i2 = ((j2 & -128) > 0 ? 1 : ((j2 & -128) == 0 ? 0 : -1));
                    j3 = this.j;
                    if (i2 == 0) {
                        break;
                    }
                    this.j = j3 + 1;
                    hy0.c(j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
            } else {
                while (true) {
                    j3 = this.j;
                    if (j3 >= this.h) {
                        throw new c(String.format(C0201.m82(7797), Long.valueOf(this.j), Long.valueOf(this.h), 1));
                    } else if ((j2 & -128) == 0) {
                        break;
                    } else {
                        this.j = j3 + 1;
                        hy0.c(j3, (byte) ((((int) j2) & 127) | 128));
                        j2 >>>= 7;
                    }
                }
            }
            this.j = 1 + j3;
            hy0.c(j3, (byte) ((int) j2));
        }

        public final void K0(qw0 qw0, ix0 ix0) throws IOException {
            vt0 vt0 = (vt0) qw0;
            int j2 = vt0.j();
            if (j2 == -1) {
                j2 = ix0.b(vt0);
                vt0.i(j2);
            }
            y0(j2);
            ix0.h(qw0, this.a);
        }

        @Override // defpackage.ru0
        public final void L(qw0 qw0) throws IOException {
            y0(qw0.f());
            qw0.d(this);
        }

        @Override // defpackage.ru0
        public final void S(int i2, int i3) throws IOException {
            F(i2, 0);
            x0(i3);
        }

        @Override // defpackage.ru0
        public final void T(int i2, long j2) throws IOException {
            F(i2, 1);
            b0(j2);
        }

        @Override // defpackage.eu0
        public final void a(byte[] bArr, int i2, int i3) throws IOException {
            c(bArr, i2, i3);
        }

        @Override // defpackage.ru0
        public final void a0(int i2, int i3) throws IOException {
            F(i2, 0);
            y0(i3);
        }

        @Override // defpackage.ru0
        public final void b() {
            this.d.position((int) (this.j - this.f));
        }

        @Override // defpackage.ru0
        public final void b0(long j2) throws IOException {
            this.e.putLong((int) (this.j - this.f), j2);
            this.j += 8;
        }

        @Override // defpackage.ru0
        public final void c(byte[] bArr, int i2, int i3) throws IOException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = (long) i3;
                long j3 = this.j;
                if (this.h - j2 >= j3) {
                    hy0.l(bArr, (long) i2, j3, j2);
                    this.j += j2;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException(C0201.m82(7798));
            }
            throw new c(String.format(C0201.m82(7799), Long.valueOf(this.j), Long.valueOf(this.h), Integer.valueOf(i3)));
        }

        @Override // defpackage.ru0
        public final void c0(byte[] bArr, int i2, int i3) throws IOException {
            y0(i3);
            c(bArr, 0, i3);
        }

        @Override // defpackage.ru0
        public final void g(byte b) throws IOException {
            long j2 = this.j;
            if (j2 < this.h) {
                this.j = 1 + j2;
                hy0.c(j2, b);
                return;
            }
            throw new c(String.format(C0201.m82(7800), Long.valueOf(this.j), Long.valueOf(this.h), 1));
        }

        @Override // defpackage.ru0
        public final void i0(int i2, int i3) throws IOException {
            F(i2, 5);
            A0(i3);
        }

        @Override // defpackage.ru0
        public final void l(int i2, long j2) throws IOException {
            F(i2, 0);
            K(j2);
        }

        @Override // defpackage.ru0
        public final void m(int i2, fu0 fu0) throws IOException {
            F(i2, 2);
            q(fu0);
        }

        @Override // defpackage.ru0
        public final void m0(String str) throws IOException {
            long j2 = this.j;
            try {
                int D0 = ru0.D0(str.length() * 3);
                int D02 = ru0.D0(str.length());
                if (D02 == D0) {
                    int i2 = ((int) (this.j - this.f)) + D02;
                    this.e.position(i2);
                    jy0.c(str, this.e);
                    int position = this.e.position() - i2;
                    y0(position);
                    this.j += (long) position;
                    return;
                }
                int a = jy0.a(str);
                y0(a);
                L0(this.j);
                jy0.c(str, this.e);
                this.j += (long) a;
            } catch (my0 e2) {
                this.j = j2;
                L0(j2);
                r(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new c(e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new c(e4);
            }
        }

        @Override // defpackage.ru0
        public final void n(int i2, qw0 qw0) throws IOException {
            F(i2, 2);
            L(qw0);
        }

        @Override // defpackage.ru0
        public final void o(int i2, qw0 qw0, ix0 ix0) throws IOException {
            F(i2, 2);
            K0(qw0, ix0);
        }

        @Override // defpackage.ru0
        public final void p(int i2, String str) throws IOException {
            F(i2, 2);
            m0(str);
        }

        @Override // defpackage.ru0
        public final void q(fu0 fu0) throws IOException {
            y0(fu0.size());
            fu0.d(this);
        }

        @Override // defpackage.ru0
        public final int t() {
            return (int) (this.h - this.j);
        }

        @Override // defpackage.ru0
        public final void x0(int i2) throws IOException {
            if (i2 >= 0) {
                y0(i2);
            } else {
                K((long) i2);
            }
        }

        @Override // defpackage.ru0
        public final void y0(int i2) throws IOException {
            long j2;
            if (this.j <= this.i) {
                while ((i2 & -128) != 0) {
                    long j3 = this.j;
                    this.j = j3 + 1;
                    hy0.c(j3, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                j2 = this.j;
            } else {
                while (true) {
                    j2 = this.j;
                    if (j2 >= this.h) {
                        throw new c(String.format(C0201.m82(7801), Long.valueOf(this.j), Long.valueOf(this.h), 1));
                    } else if ((i2 & -128) == 0) {
                        break;
                    } else {
                        this.j = j2 + 1;
                        hy0.c(j2, (byte) ((i2 & 127) | 128));
                        i2 >>>= 7;
                    }
                }
            }
            this.j = 1 + j2;
            hy0.c(j2, (byte) i2);
        }
    }

    private ru0() {
    }

    public static int A(int i, qw0 qw0, ix0 ix0) {
        return B0(i) + D(qw0, ix0);
    }

    public static int B(int i, String str) {
        return B0(i) + q0(str);
    }

    public static int B0(int i) {
        return D0(i << 3);
    }

    public static int C(fu0 fu0) {
        int size = fu0.size();
        return D0(size) + size;
    }

    public static int C0(int i) {
        if (i >= 0) {
            return D0(i);
        }
        return 10;
    }

    public static int D(qw0 qw0, ix0 ix0) {
        vt0 vt0 = (vt0) qw0;
        int j = vt0.j();
        if (j == -1) {
            j = ix0.b(vt0);
            vt0.i(j);
        }
        return D0(j) + j;
    }

    public static int D0(int i) {
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

    public static int E(boolean z) {
        return 1;
    }

    public static int E0(int i) {
        return D0(I0(i));
    }

    public static int F0(int i) {
        return 4;
    }

    public static int G0(int i) {
        return 4;
    }

    public static int H0(int i) {
        return C0(i);
    }

    private static int I0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int J0(int i) {
        return D0(i);
    }

    public static int M(int i, fu0 fu0) {
        int B0 = B0(i);
        int size = fu0.size();
        return B0 + D0(size) + size;
    }

    public static int N(int i, qw0 qw0) {
        return B0(i) + Q(qw0);
    }

    @Deprecated
    public static int O(int i, qw0 qw0, ix0 ix0) {
        int B0 = B0(i) << 1;
        vt0 vt0 = (vt0) qw0;
        int j = vt0.j();
        if (j == -1) {
            j = ix0.b(vt0);
            vt0.i(j);
        }
        return B0 + j;
    }

    public static int P(int i, boolean z) {
        return B0(i) + 1;
    }

    public static int Q(qw0 qw0) {
        int f = qw0.f();
        return D0(f) + f;
    }

    public static ru0 R(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int V(int i, long j) {
        return B0(i) + h0(j);
    }

    public static int W(int i, fu0 fu0) {
        return (B0(1) << 1) + n0(2, i) + M(3, fu0);
    }

    public static int X(int i, qw0 qw0) {
        return (B0(1) << 1) + n0(2, i) + N(3, qw0);
    }

    @Deprecated
    public static int Y(qw0 qw0) {
        return qw0.f();
    }

    public static int Z(byte[] bArr) {
        int length = bArr.length;
        return D0(length) + length;
    }

    public static int d(int i, xv0 xv0) {
        int B0 = B0(i);
        int a2 = xv0.a();
        return B0 + D0(a2) + a2;
    }

    public static int d0(int i, long j) {
        return B0(i) + h0(j);
    }

    public static int e(xv0 xv0) {
        int a2 = xv0.a();
        return D0(a2) + a2;
    }

    public static int e0(long j) {
        return h0(j);
    }

    public static ru0 f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            return hy0.y() ? new e(byteBuffer) : new d(byteBuffer);
        }
        throw new IllegalArgumentException(C0201.m82(8499));
    }

    public static int g0(int i, long j) {
        return B0(i) + h0(u0(j));
    }

    public static int h0(long j) {
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

    public static int j0(int i, int i2) {
        return B0(i) + C0(i2);
    }

    public static int k0(int i, long j) {
        return B0(i) + 8;
    }

    public static int l0(long j) {
        return h0(u0(j));
    }

    public static int n0(int i, int i2) {
        return B0(i) + D0(i2);
    }

    public static int o0(int i, long j) {
        return B0(i) + 8;
    }

    public static int p0(long j) {
        return 8;
    }

    public static int q0(String str) {
        int i;
        try {
            i = jy0.a(str);
        } catch (my0 unused) {
            i = str.getBytes(mv0.a).length;
        }
        return D0(i) + i;
    }

    public static int r0(int i, int i2) {
        return B0(i) + D0(I0(i2));
    }

    public static int s0(long j) {
        return 8;
    }

    public static int t0(int i, int i2) {
        return B0(i) + 4;
    }

    private static long u0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int v(double d2) {
        return 8;
    }

    public static int v0(int i, int i2) {
        return B0(i) + 4;
    }

    public static int w(float f) {
        return 4;
    }

    public static int w0(int i, int i2) {
        return B0(i) + C0(i2);
    }

    public static int x(int i, double d2) {
        return B0(i) + 8;
    }

    public static int y(int i, float f) {
        return B0(i) + 4;
    }

    public static int z(int i, xv0 xv0) {
        return (B0(1) << 1) + n0(2, i) + d(3, xv0);
    }

    public abstract void A0(int i) throws IOException;

    public abstract void F(int i, int i2) throws IOException;

    public final void G(int i, long j) throws IOException {
        l(i, u0(j));
    }

    public abstract void H(int i, fu0 fu0) throws IOException;

    public abstract void I(int i, qw0 qw0) throws IOException;

    public abstract void J(int i, boolean z) throws IOException;

    public abstract void K(long j) throws IOException;

    public abstract void L(qw0 qw0) throws IOException;

    public abstract void S(int i, int i2) throws IOException;

    public abstract void T(int i, long j) throws IOException;

    public final void U(long j) throws IOException {
        K(u0(j));
    }

    public abstract void a0(int i, int i2) throws IOException;

    public abstract void b() throws IOException;

    public abstract void b0(long j) throws IOException;

    public abstract void c(byte[] bArr, int i, int i2) throws IOException;

    public abstract void c0(byte[] bArr, int i, int i2) throws IOException;

    public final void f0(int i, int i2) throws IOException {
        a0(i, I0(i2));
    }

    public abstract void g(byte b2) throws IOException;

    public final void h(double d2) throws IOException {
        b0(Double.doubleToRawLongBits(d2));
    }

    public final void i(float f) throws IOException {
        A0(Float.floatToRawIntBits(f));
    }

    public abstract void i0(int i, int i2) throws IOException;

    public final void j(int i, double d2) throws IOException {
        T(i, Double.doubleToRawLongBits(d2));
    }

    public final void k(int i, float f) throws IOException {
        i0(i, Float.floatToRawIntBits(f));
    }

    public abstract void l(int i, long j) throws IOException;

    public abstract void m(int i, fu0 fu0) throws IOException;

    public abstract void m0(String str) throws IOException;

    public abstract void n(int i, qw0 qw0) throws IOException;

    public abstract void o(int i, qw0 qw0, ix0 ix0) throws IOException;

    public abstract void p(int i, String str) throws IOException;

    public abstract void q(fu0 fu0) throws IOException;

    public final void r(String str, my0 my0) throws IOException {
        b.logp(Level.WARNING, C0201.m82(8500), C0201.m82(8501), C0201.m82(8502), (Throwable) my0);
        byte[] bytes = str.getBytes(mv0.a);
        try {
            y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new c(e2);
        } catch (c e3) {
            throw e3;
        }
    }

    public final void s(boolean z) throws IOException {
        g(z ? (byte) 1 : 0);
    }

    public abstract int t();

    public abstract void x0(int i) throws IOException;

    public abstract void y0(int i) throws IOException;

    public final void z0(int i) throws IOException {
        y0(I0(i));
    }
}
