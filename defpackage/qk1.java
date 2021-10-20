package defpackage;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import vigqyno.C0201;

/* renamed from: qk1  reason: default package */
public abstract class qk1 extends ak1 {
    private static final Logger b = Logger.getLogger(qk1.class.getName());
    private static final boolean c = ho1.w();
    public sk1 a;

    /* access modifiers changed from: package-private */
    /* renamed from: qk1$a */
    public static class a extends qk1 {
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
                throw new IllegalArgumentException(String.format(C0201.m82(16884), Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException(C0201.m82(16885));
        }

        @Override // defpackage.qk1
        public final void I(int i, bk1 bk1) throws IOException {
            b0(1, 3);
            k0(2, i);
            k(3, bk1);
            b0(1, 4);
        }

        @Override // defpackage.qk1
        public final void I0(String str) throws IOException {
            int i = this.g;
            try {
                int w = qk1.w(str.length() * 3);
                int w2 = qk1.w(str.length());
                if (w2 == w) {
                    int i2 = i + w2;
                    this.g = i2;
                    int b = jo1.b(str, this.d, i2, c0());
                    this.g = i;
                    r((b - i) - w2);
                    this.g = b;
                    return;
                }
                r(jo1.a(str));
                this.g = jo1.b(str, this.d, this.g, c0());
            } catch (oo1 e2) {
                this.g = i;
                p(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new c(e3);
            }
        }

        @Override // defpackage.qk1
        public final void J(int i, tm1 tm1) throws IOException {
            b0(1, 3);
            k0(2, i);
            l(3, tm1);
            b0(1, 4);
        }

        @Override // defpackage.qk1
        public final void K(int i, boolean z) throws IOException {
            b0(i, 0);
            V(z ? (byte) 1 : 0);
        }

        @Override // defpackage.qk1
        public final void L(tm1 tm1) throws IOException {
            r(tm1.f());
            tm1.d(this);
        }

        public final int L0() {
            return this.g - this.e;
        }

        @Override // defpackage.qk1
        public final void V(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format(C0201.m82(16886), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // defpackage.qk1
        public final void W(int i, long j) throws IOException {
            b0(i, 1);
            r0(j);
        }

        @Override // defpackage.ak1
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            c(bArr, i, i2);
        }

        @Override // defpackage.qk1
        public void b() {
        }

        @Override // defpackage.qk1
        public final void b0(int i, int i2) throws IOException {
            r((i << 3) | i2);
        }

        @Override // defpackage.qk1
        public final void c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format(C0201.m82(16887), Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e2);
            }
        }

        @Override // defpackage.qk1
        public final int c0() {
            return this.f - this.g;
        }

        @Override // defpackage.qk1
        public final void e0(int i, int i2) throws IOException {
            b0(i, 0);
            q(i2);
        }

        @Override // defpackage.qk1
        public final void f0(long j) throws IOException {
            if (!qk1.c || c0() < 10) {
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
                    throw new c(String.format(C0201.m82(16888), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    ho1.i(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                ho1.i(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        @Override // defpackage.qk1
        public final void j(int i, long j) throws IOException {
            b0(i, 0);
            f0(j);
        }

        @Override // defpackage.qk1
        public final void k(int i, bk1 bk1) throws IOException {
            b0(i, 2);
            o(bk1);
        }

        @Override // defpackage.qk1
        public final void k0(int i, int i2) throws IOException {
            b0(i, 0);
            r(i2);
        }

        @Override // defpackage.qk1
        public final void l(int i, tm1 tm1) throws IOException {
            b0(i, 2);
            L(tm1);
        }

        @Override // defpackage.qk1
        public final void m(int i, tm1 tm1, in1 in1) throws IOException {
            b0(i, 2);
            rj1 rj1 = (rj1) tm1;
            int h = rj1.h();
            if (h == -1) {
                h = in1.h(rj1);
                rj1.i(h);
            }
            r(h);
            in1.i(tm1, this.a);
        }

        @Override // defpackage.qk1
        public final void m0(byte[] bArr, int i, int i2) throws IOException {
            r(i2);
            c(bArr, 0, i2);
        }

        @Override // defpackage.qk1
        public final void n(int i, String str) throws IOException {
            b0(i, 2);
            I0(str);
        }

        @Override // defpackage.qk1
        public final void o(bk1 bk1) throws IOException {
            r(bk1.size());
            bk1.c(this);
        }

        @Override // defpackage.qk1
        public final void q(int i) throws IOException {
            if (i >= 0) {
                r(i);
            } else {
                f0((long) i);
            }
        }

        @Override // defpackage.qk1
        public final void r(int i) throws IOException {
            if (!qk1.c || c0() < 10) {
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
                    throw new c(String.format(C0201.m82(16889), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i4 = this.g;
                    this.g = i4 + 1;
                    ho1.i(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                ho1.i(bArr4, (long) i5, (byte) i);
            }
        }

        @Override // defpackage.qk1
        public final void r0(long j) throws IOException {
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
                throw new c(String.format(C0201.m82(16890), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // defpackage.qk1
        public final void t(int i) throws IOException {
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
                throw new c(String.format(C0201.m82(16891), Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // defpackage.qk1
        public final void v0(int i, int i2) throws IOException {
            b0(i, 5);
            t(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qk1$b */
    public static final class b extends a {
        private final ByteBuffer h;
        private int i;

        public b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.h = byteBuffer;
            this.i = byteBuffer.position();
        }

        @Override // defpackage.qk1, defpackage.qk1.a
        public final void b() {
            this.h.position(this.i + L0());
        }
    }

    /* renamed from: qk1$c */
    public static class c extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        public c(String str) {
            super(r0 != 0 ? r1.concat(r3) : new String(r1));
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String r1 = C0201.m82(16985);
        }

        public c(Throwable th) {
            super(C0201.m82(16987), th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        public c(String str, Throwable th) {
            super(r0 != 0 ? r1.concat(r3) : new String(r1), th);
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String r1 = C0201.m82(16986);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qk1$d */
    public static final class d extends qk1 {
        private final ByteBuffer d;
        private final ByteBuffer e;

        public d(ByteBuffer byteBuffer) {
            super();
            this.d = byteBuffer;
            this.e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.position();
        }

        private final void M0(String str) throws IOException {
            try {
                jo1.c(str, this.e);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            }
        }

        @Override // defpackage.qk1
        public final void I(int i, bk1 bk1) throws IOException {
            b0(1, 3);
            k0(2, i);
            k(3, bk1);
            b0(1, 4);
        }

        @Override // defpackage.qk1
        public final void I0(String str) throws IOException {
            int position = this.e.position();
            try {
                int w = qk1.w(str.length() * 3);
                int w2 = qk1.w(str.length());
                if (w2 == w) {
                    int position2 = this.e.position() + w2;
                    this.e.position(position2);
                    M0(str);
                    int position3 = this.e.position();
                    this.e.position(position);
                    r(position3 - position2);
                    this.e.position(position3);
                    return;
                }
                r(jo1.a(str));
                M0(str);
            } catch (oo1 e2) {
                this.e.position(position);
                p(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new c(e3);
            }
        }

        @Override // defpackage.qk1
        public final void J(int i, tm1 tm1) throws IOException {
            b0(1, 3);
            k0(2, i);
            l(3, tm1);
            b0(1, 4);
        }

        @Override // defpackage.qk1
        public final void K(int i, boolean z) throws IOException {
            b0(i, 0);
            V(z ? (byte) 1 : 0);
        }

        @Override // defpackage.qk1
        public final void L(tm1 tm1) throws IOException {
            r(tm1.f());
            tm1.d(this);
        }

        public final void L0(tm1 tm1, in1 in1) throws IOException {
            rj1 rj1 = (rj1) tm1;
            int h = rj1.h();
            if (h == -1) {
                h = in1.h(rj1);
                rj1.i(h);
            }
            r(h);
            in1.i(tm1, this.a);
        }

        @Override // defpackage.qk1
        public final void V(byte b) throws IOException {
            try {
                this.e.put(b);
            } catch (BufferOverflowException e2) {
                throw new c(e2);
            }
        }

        @Override // defpackage.qk1
        public final void W(int i, long j) throws IOException {
            b0(i, 1);
            r0(j);
        }

        @Override // defpackage.ak1
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            c(bArr, i, i2);
        }

        @Override // defpackage.qk1
        public final void b() {
            this.d.position(this.e.position());
        }

        @Override // defpackage.qk1
        public final void b0(int i, int i2) throws IOException {
            r((i << 3) | i2);
        }

        @Override // defpackage.qk1
        public final void c(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            } catch (BufferOverflowException e3) {
                throw new c(e3);
            }
        }

        @Override // defpackage.qk1
        public final int c0() {
            return this.e.remaining();
        }

        @Override // defpackage.qk1
        public final void e0(int i, int i2) throws IOException {
            b0(i, 0);
            q(i2);
        }

        @Override // defpackage.qk1
        public final void f0(long j) throws IOException {
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

        @Override // defpackage.qk1
        public final void j(int i, long j) throws IOException {
            b0(i, 0);
            f0(j);
        }

        @Override // defpackage.qk1
        public final void k(int i, bk1 bk1) throws IOException {
            b0(i, 2);
            o(bk1);
        }

        @Override // defpackage.qk1
        public final void k0(int i, int i2) throws IOException {
            b0(i, 0);
            r(i2);
        }

        @Override // defpackage.qk1
        public final void l(int i, tm1 tm1) throws IOException {
            b0(i, 2);
            L(tm1);
        }

        @Override // defpackage.qk1
        public final void m(int i, tm1 tm1, in1 in1) throws IOException {
            b0(i, 2);
            L0(tm1, in1);
        }

        @Override // defpackage.qk1
        public final void m0(byte[] bArr, int i, int i2) throws IOException {
            r(i2);
            c(bArr, 0, i2);
        }

        @Override // defpackage.qk1
        public final void n(int i, String str) throws IOException {
            b0(i, 2);
            I0(str);
        }

        @Override // defpackage.qk1
        public final void o(bk1 bk1) throws IOException {
            r(bk1.size());
            bk1.c(this);
        }

        @Override // defpackage.qk1
        public final void q(int i) throws IOException {
            if (i >= 0) {
                r(i);
            } else {
                f0((long) i);
            }
        }

        @Override // defpackage.qk1
        public final void r(int i) throws IOException {
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

        @Override // defpackage.qk1
        public final void r0(long j) throws IOException {
            try {
                this.e.putLong(j);
            } catch (BufferOverflowException e2) {
                throw new c(e2);
            }
        }

        @Override // defpackage.qk1
        public final void t(int i) throws IOException {
            try {
                this.e.putInt(i);
            } catch (BufferOverflowException e2) {
                throw new c(e2);
            }
        }

        @Override // defpackage.qk1
        public final void v0(int i, int i2) throws IOException {
            b0(i, 5);
            t(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qk1$e */
    public static final class e extends qk1 {
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
            long k = ho1.k(byteBuffer);
            this.f = k;
            this.g = k + ((long) byteBuffer.position());
            long limit = this.f + ((long) byteBuffer.limit());
            this.h = limit;
            this.i = limit - 10;
        }

        private final void M0(long j2) {
            this.e.position((int) (j2 - this.f));
        }

        @Override // defpackage.qk1
        public final void I(int i2, bk1 bk1) throws IOException {
            b0(1, 3);
            k0(2, i2);
            k(3, bk1);
            b0(1, 4);
        }

        @Override // defpackage.qk1
        public final void I0(String str) throws IOException {
            long j2 = this.j;
            try {
                int w = qk1.w(str.length() * 3);
                int w2 = qk1.w(str.length());
                if (w2 == w) {
                    int i2 = ((int) (this.j - this.f)) + w2;
                    this.e.position(i2);
                    jo1.c(str, this.e);
                    int position = this.e.position() - i2;
                    r(position);
                    this.j += (long) position;
                    return;
                }
                int a = jo1.a(str);
                r(a);
                M0(this.j);
                jo1.c(str, this.e);
                this.j += (long) a;
            } catch (oo1 e2) {
                this.j = j2;
                M0(j2);
                p(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new c(e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new c(e4);
            }
        }

        @Override // defpackage.qk1
        public final void J(int i2, tm1 tm1) throws IOException {
            b0(1, 3);
            k0(2, i2);
            l(3, tm1);
            b0(1, 4);
        }

        @Override // defpackage.qk1
        public final void K(int i2, boolean z) throws IOException {
            b0(i2, 0);
            V(z ? (byte) 1 : 0);
        }

        @Override // defpackage.qk1
        public final void L(tm1 tm1) throws IOException {
            r(tm1.f());
            tm1.d(this);
        }

        public final void L0(tm1 tm1, in1 in1) throws IOException {
            rj1 rj1 = (rj1) tm1;
            int h2 = rj1.h();
            if (h2 == -1) {
                h2 = in1.h(rj1);
                rj1.i(h2);
            }
            r(h2);
            in1.i(tm1, this.a);
        }

        @Override // defpackage.qk1
        public final void V(byte b) throws IOException {
            long j2 = this.j;
            if (j2 < this.h) {
                this.j = 1 + j2;
                ho1.b(j2, b);
                return;
            }
            throw new c(String.format(C0201.m82(15564), Long.valueOf(this.j), Long.valueOf(this.h), 1));
        }

        @Override // defpackage.qk1
        public final void W(int i2, long j2) throws IOException {
            b0(i2, 1);
            r0(j2);
        }

        @Override // defpackage.ak1
        public final void a(byte[] bArr, int i2, int i3) throws IOException {
            c(bArr, i2, i3);
        }

        @Override // defpackage.qk1
        public final void b() {
            this.d.position((int) (this.j - this.f));
        }

        @Override // defpackage.qk1
        public final void b0(int i2, int i3) throws IOException {
            r((i2 << 3) | i3);
        }

        @Override // defpackage.qk1
        public final void c(byte[] bArr, int i2, int i3) throws IOException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = (long) i3;
                long j3 = this.j;
                if (this.h - j2 >= j3) {
                    ho1.j(bArr, (long) i2, j3, j2);
                    this.j += j2;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException(C0201.m82(15565));
            }
            throw new c(String.format(C0201.m82(15566), Long.valueOf(this.j), Long.valueOf(this.h), Integer.valueOf(i3)));
        }

        @Override // defpackage.qk1
        public final int c0() {
            return (int) (this.h - this.j);
        }

        @Override // defpackage.qk1
        public final void e0(int i2, int i3) throws IOException {
            b0(i2, 0);
            q(i3);
        }

        @Override // defpackage.qk1
        public final void f0(long j2) throws IOException {
            if (this.j <= this.i) {
                while ((j2 & -128) != 0) {
                    long j3 = this.j;
                    this.j = j3 + 1;
                    ho1.b(j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                long j4 = this.j;
                this.j = 1 + j4;
                ho1.b(j4, (byte) ((int) j2));
                return;
            }
            while (true) {
                long j5 = this.j;
                if (j5 >= this.h) {
                    throw new c(String.format(C0201.m82(15567), Long.valueOf(this.j), Long.valueOf(this.h), 1));
                } else if ((j2 & -128) == 0) {
                    this.j = 1 + j5;
                    ho1.b(j5, (byte) ((int) j2));
                    return;
                } else {
                    this.j = j5 + 1;
                    ho1.b(j5, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
            }
        }

        @Override // defpackage.qk1
        public final void j(int i2, long j2) throws IOException {
            b0(i2, 0);
            f0(j2);
        }

        @Override // defpackage.qk1
        public final void k(int i2, bk1 bk1) throws IOException {
            b0(i2, 2);
            o(bk1);
        }

        @Override // defpackage.qk1
        public final void k0(int i2, int i3) throws IOException {
            b0(i2, 0);
            r(i3);
        }

        @Override // defpackage.qk1
        public final void l(int i2, tm1 tm1) throws IOException {
            b0(i2, 2);
            L(tm1);
        }

        @Override // defpackage.qk1
        public final void m(int i2, tm1 tm1, in1 in1) throws IOException {
            b0(i2, 2);
            L0(tm1, in1);
        }

        @Override // defpackage.qk1
        public final void m0(byte[] bArr, int i2, int i3) throws IOException {
            r(i3);
            c(bArr, 0, i3);
        }

        @Override // defpackage.qk1
        public final void n(int i2, String str) throws IOException {
            b0(i2, 2);
            I0(str);
        }

        @Override // defpackage.qk1
        public final void o(bk1 bk1) throws IOException {
            r(bk1.size());
            bk1.c(this);
        }

        @Override // defpackage.qk1
        public final void q(int i2) throws IOException {
            if (i2 >= 0) {
                r(i2);
            } else {
                f0((long) i2);
            }
        }

        @Override // defpackage.qk1
        public final void r(int i2) throws IOException {
            if (this.j <= this.i) {
                while ((i2 & -128) != 0) {
                    long j2 = this.j;
                    this.j = j2 + 1;
                    ho1.b(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                long j3 = this.j;
                this.j = 1 + j3;
                ho1.b(j3, (byte) i2);
                return;
            }
            while (true) {
                long j4 = this.j;
                if (j4 >= this.h) {
                    throw new c(String.format(C0201.m82(15568), Long.valueOf(this.j), Long.valueOf(this.h), 1));
                } else if ((i2 & -128) == 0) {
                    this.j = 1 + j4;
                    ho1.b(j4, (byte) i2);
                    return;
                } else {
                    this.j = j4 + 1;
                    ho1.b(j4, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            }
        }

        @Override // defpackage.qk1
        public final void r0(long j2) throws IOException {
            this.e.putLong((int) (this.j - this.f), j2);
            this.j += 8;
        }

        @Override // defpackage.qk1
        public final void t(int i2) throws IOException {
            this.e.putInt((int) (this.j - this.f), i2);
            this.j += 4;
        }

        @Override // defpackage.qk1
        public final void v0(int i2, int i3) throws IOException {
            b0(i2, 5);
            t(i3);
        }
    }

    private qk1() {
    }

    public static int A(int i, double d2) {
        return u(i) + 8;
    }

    public static int A0(int i, int i2) {
        return u(i) + w(i2);
    }

    public static int B(int i, float f) {
        return u(i) + 4;
    }

    public static int B0(long j) {
        return y0(H0(j));
    }

    public static int C(int i, zl1 zl1) {
        return (u(1) << 1) + A0(2, i) + d(3, zl1);
    }

    public static int C0(int i, int i2) {
        return u(i) + w(O(i2));
    }

    public static int D(int i, tm1 tm1, in1 in1) {
        return u(i) + G(tm1, in1);
    }

    public static int D0(long j) {
        return 8;
    }

    public static int E(int i, String str) {
        return u(i) + K0(str);
    }

    public static int E0(int i, int i2) {
        return u(i) + 4;
    }

    public static int F(bk1 bk1) {
        int size = bk1.size();
        return w(size) + size;
    }

    public static int F0(long j) {
        return 8;
    }

    public static int G(tm1 tm1, in1 in1) {
        rj1 rj1 = (rj1) tm1;
        int h = rj1.h();
        if (h == -1) {
            h = in1.h(rj1);
            rj1.i(h);
        }
        return w(h) + h;
    }

    public static int G0(int i, int i2) {
        return u(i) + 4;
    }

    private static long H0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int J0(int i, int i2) {
        return u(i) + v(i2);
    }

    public static int K0(String str) {
        int i;
        try {
            i = jo1.a(str);
        } catch (oo1 unused) {
            i = str.getBytes(nl1.a).length;
        }
        return w(i) + i;
    }

    public static int M(int i) {
        return 4;
    }

    public static int N(int i) {
        return v(i);
    }

    private static int O(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int P(int i) {
        return w(i);
    }

    public static int Q(int i, bk1 bk1) {
        int u = u(i);
        int size = bk1.size();
        return u + w(size) + size;
    }

    public static int R(int i, tm1 tm1) {
        return u(i) + U(tm1);
    }

    @Deprecated
    public static int S(int i, tm1 tm1, in1 in1) {
        int u = u(i) << 1;
        rj1 rj1 = (rj1) tm1;
        int h = rj1.h();
        if (h == -1) {
            h = in1.h(rj1);
            rj1.i(h);
        }
        return u + h;
    }

    public static int T(int i, boolean z) {
        return u(i) + 1;
    }

    public static int U(tm1 tm1) {
        int f = tm1.f();
        return w(f) + f;
    }

    public static int X(int i, long j) {
        return u(i) + y0(j);
    }

    public static int Y(int i, bk1 bk1) {
        return (u(1) << 1) + A0(2, i) + Q(3, bk1);
    }

    public static int Z(int i, tm1 tm1) {
        return (u(1) << 1) + A0(2, i) + R(3, tm1);
    }

    @Deprecated
    public static int a0(tm1 tm1) {
        return tm1.f();
    }

    public static int d(int i, zl1 zl1) {
        int u = u(i);
        int b2 = zl1.b();
        return u + w(b2) + b2;
    }

    public static int d0(int i, long j) {
        return u(i) + y0(j);
    }

    public static int e(zl1 zl1) {
        int b2 = zl1.b();
        return w(b2) + b2;
    }

    public static qk1 f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException(C0201.m82(32717));
        } else if (ho1.x()) {
            return new e(byteBuffer);
        } else {
            return new d(byteBuffer);
        }
    }

    public static int i0(int i, long j) {
        return u(i) + y0(H0(j));
    }

    public static int n0(float f) {
        return 4;
    }

    public static int o0(int i, long j) {
        return u(i) + 8;
    }

    public static qk1 p0(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int s0(int i, long j) {
        return u(i) + 8;
    }

    public static int t0(long j) {
        return y0(j);
    }

    public static int u(int i) {
        return w(i << 3);
    }

    public static int u0(byte[] bArr) {
        int length = bArr.length;
        return w(length) + length;
    }

    public static int v(int i) {
        if (i >= 0) {
            return w(i);
        }
        return 10;
    }

    public static int w(int i) {
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

    public static int x(int i) {
        return w(O(i));
    }

    public static int x0(int i, int i2) {
        return u(i) + v(i2);
    }

    public static int y(int i) {
        return 4;
    }

    public static int y0(long j) {
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

    public static int z(double d2) {
        return 8;
    }

    public static int z0(boolean z) {
        return 1;
    }

    public final void H(int i, long j) throws IOException {
        j(i, H0(j));
    }

    public abstract void I(int i, bk1 bk1) throws IOException;

    public abstract void I0(String str) throws IOException;

    public abstract void J(int i, tm1 tm1) throws IOException;

    public abstract void K(int i, boolean z) throws IOException;

    public abstract void L(tm1 tm1) throws IOException;

    public abstract void V(byte b2) throws IOException;

    public abstract void W(int i, long j) throws IOException;

    public abstract void b() throws IOException;

    public abstract void b0(int i, int i2) throws IOException;

    public abstract void c(byte[] bArr, int i, int i2) throws IOException;

    public abstract int c0();

    public abstract void e0(int i, int i2) throws IOException;

    public abstract void f0(long j) throws IOException;

    public final void g(double d2) throws IOException {
        r0(Double.doubleToRawLongBits(d2));
    }

    public final void g0() {
        if (c0() != 0) {
            throw new IllegalStateException(C0201.m82(32718));
        }
    }

    public final void h(int i, double d2) throws IOException {
        W(i, Double.doubleToRawLongBits(d2));
    }

    public final void i(int i, float f) throws IOException {
        v0(i, Float.floatToRawIntBits(f));
    }

    public abstract void j(int i, long j) throws IOException;

    public final void j0(float f) throws IOException {
        t(Float.floatToRawIntBits(f));
    }

    public abstract void k(int i, bk1 bk1) throws IOException;

    public abstract void k0(int i, int i2) throws IOException;

    public abstract void l(int i, tm1 tm1) throws IOException;

    public final void l0(long j) throws IOException {
        f0(H0(j));
    }

    public abstract void m(int i, tm1 tm1, in1 in1) throws IOException;

    public abstract void m0(byte[] bArr, int i, int i2) throws IOException;

    public abstract void n(int i, String str) throws IOException;

    public abstract void o(bk1 bk1) throws IOException;

    public final void p(String str, oo1 oo1) throws IOException {
        b.logp(Level.WARNING, C0201.m82(32719), C0201.m82(32720), C0201.m82(32721), (Throwable) oo1);
        byte[] bytes = str.getBytes(nl1.a);
        try {
            r(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new c(e2);
        } catch (c e3) {
            throw e3;
        }
    }

    public abstract void q(int i) throws IOException;

    public final void q0(int i, int i2) throws IOException {
        k0(i, O(i2));
    }

    public abstract void r(int i) throws IOException;

    public abstract void r0(long j) throws IOException;

    public final void s(int i) throws IOException {
        r(O(i));
    }

    public abstract void t(int i) throws IOException;

    public abstract void v0(int i, int i2) throws IOException;

    public final void w0(boolean z) throws IOException {
        V(z ? (byte) 1 : 0);
    }
}
