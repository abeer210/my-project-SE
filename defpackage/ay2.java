package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: ay2  reason: default package */
/* compiled from: Buffer */
public final class ay2 implements cy2, by2, Cloneable, ByteChannel {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public py2 a;
    public long b;

    /* renamed from: ay2$a */
    /* compiled from: Buffer */
    class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return ay2.this + C0201.m82(33337);
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            ay2.this.c0((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            ay2.this.a0(bArr, i, i2);
        }
    }

    /* renamed from: ay2$b */
    /* compiled from: Buffer */
    class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(ay2.this.b, 2147483647L);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            ay2 ay2 = ay2.this;
            if (ay2.b > 0) {
                return ay2.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return ay2.this + C0201.m82(33439);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return ay2.this.read(bArr, i, i2);
        }
    }

    /* renamed from: ay2$c */
    /* compiled from: Buffer */
    public static final class c implements Closeable {
        public ay2 a;
        public boolean b;
        private py2 c;
        public long d = -1;
        public byte[] e;
        public int f = -1;
        public int g = -1;

        public final int a() {
            long j = this.d;
            if (j == this.a.b) {
                throw new IllegalStateException();
            } else if (j == -1) {
                return c(0);
            } else {
                return c(j + ((long) (this.g - this.f)));
            }
        }

        public final int c(long j) {
            if (j >= -1) {
                ay2 ay2 = this.a;
                long j2 = ay2.b;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.c = null;
                        this.d = j;
                        this.e = null;
                        this.f = -1;
                        this.g = -1;
                        return -1;
                    }
                    long j3 = 0;
                    py2 py2 = ay2.a;
                    py2 py22 = this.c;
                    if (py22 != null) {
                        long j4 = this.d - ((long) (this.f - py22.b));
                        if (j4 > j) {
                            j2 = j4;
                            py22 = py2;
                            py2 = py22;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        py22 = py2;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            int i = py22.c;
                            int i2 = py22.b;
                            if (j < ((long) (i - i2)) + j3) {
                                break;
                            }
                            j3 += (long) (i - i2);
                            py22 = py22.f;
                        }
                    } else {
                        while (j2 > j) {
                            py2 = py2.g;
                            j2 -= (long) (py2.c - py2.b);
                        }
                        py22 = py2;
                        j3 = j2;
                    }
                    if (this.b && py22.d) {
                        py2 f2 = py22.f();
                        ay2 ay22 = this.a;
                        if (ay22.a == py22) {
                            ay22.a = f2;
                        }
                        py22.c(f2);
                        f2.g.b();
                        py22 = f2;
                    }
                    this.c = py22;
                    this.d = j;
                    this.e = py22.a;
                    int i3 = py22.b + ((int) (j - j3));
                    this.f = i3;
                    int i4 = py22.c;
                    this.g = i4;
                    return i4 - i3;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format(C0201.m82(33429), Long.valueOf(j), Long.valueOf(this.a.b)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.a != null) {
                this.a = null;
                this.c = null;
                this.d = -1;
                this.e = null;
                this.f = -1;
                this.g = -1;
                return;
            }
            throw new IllegalStateException(C0201.m82(33430));
        }
    }

    private boolean z(py2 py2, int i, dy2 dy2, int i2, int i3) {
        int i4 = py2.c;
        byte[] bArr = py2.a;
        while (i2 < i3) {
            if (i == i4) {
                py2 = py2.f;
                byte[] bArr2 = py2.a;
                bArr = bArr2;
                i = py2.b;
                i4 = py2.c;
            }
            if (bArr[i] != dy2.l(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final c B(c cVar) {
        if (cVar.a == null) {
            cVar.a = this;
            cVar.b = true;
            return cVar;
        }
        throw new IllegalStateException(C0201.m82(16835));
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 C(int i) throws IOException {
        f0(i);
        return this;
    }

    public dy2 D() {
        return new dy2(I());
    }

    @Override // defpackage.cy2
    public boolean D0(long j) {
        return this.b >= j;
    }

    public String F(long j, Charset charset) throws EOFException {
        vy2.b(this.b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException(C0201.m82(16838));
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException(C0201.m82(16837) + j);
        } else if (j == 0) {
            return C0201.m82(16836);
        } else {
            py2 py2 = this.a;
            if (((long) py2.b) + j > ((long) py2.c)) {
                return new String(O0(j), charset);
            }
            String str = new String(py2.a, py2.b, (int) j, charset);
            int i = (int) (((long) py2.b) + j);
            py2.b = i;
            this.b -= j;
            if (i == py2.c) {
                this.a = py2.b();
                qy2.a(py2);
            }
            return str;
        }
    }

    public String G() {
        try {
            return F(this.b, vy2.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.cy2
    public byte[] I() {
        try {
            return O0(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.cy2
    public long J(dy2 dy2) throws IOException {
        return w(dy2, 0);
    }

    @Override // defpackage.cy2
    public String J0() throws EOFException {
        return b0(Long.MAX_VALUE);
    }

    public String K(long j) throws EOFException {
        return F(j, vy2.a);
    }

    @Override // defpackage.cy2
    public int K0() {
        return vy2.c(readInt());
    }

    @Override // defpackage.cy2
    public ay2 L() {
        return this;
    }

    @Override // defpackage.cy2
    public boolean M() {
        return this.b == 0;
    }

    public String N(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (s(j2) == 13) {
                String K = K(j2);
                b(2);
                return K;
            }
        }
        String K2 = K(j);
        b(1);
        return K2;
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 O(int i) throws IOException {
        c0(i);
        return this;
    }

    @Override // defpackage.cy2
    public byte[] O0(long j) throws EOFException {
        vy2.b(this.b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(C0201.m82(16839) + j);
    }

    public int P(ky2 ky2, boolean z) {
        int i;
        int i2;
        int i3;
        py2 py2;
        int i4;
        py2 py22 = this.a;
        int i5 = -2;
        if (py22 != null) {
            byte[] bArr = py22.a;
            int i6 = py22.b;
            int i7 = py22.c;
            int[] iArr = ky2.b;
            py2 py23 = py22;
            int i8 = 0;
            int i9 = -1;
            loop0:
            while (true) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i9 = i13;
                }
                if (py23 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = i12 + (i11 * -1);
                    while (true) {
                        int i15 = i6 + 1;
                        int i16 = i12 + 1;
                        if ((bArr[i6] & 255) != iArr[i12]) {
                            return i9;
                        }
                        boolean z2 = i16 == i14;
                        if (i15 == i7) {
                            py2 py24 = py23.f;
                            i4 = py24.b;
                            byte[] bArr2 = py24.a;
                            i3 = py24.c;
                            if (py24 != py22) {
                                py2 = py24;
                                bArr = bArr2;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                py2 = null;
                            }
                        } else {
                            i3 = i7;
                            i4 = i15;
                            py2 = py23;
                        }
                        if (z2) {
                            i = iArr[i16];
                            i2 = i4;
                            i7 = i3;
                            py23 = py2;
                            break;
                        }
                        i6 = i4;
                        i7 = i3;
                        i12 = i16;
                        py23 = py2;
                    }
                } else {
                    int i17 = i6 + 1;
                    int i18 = bArr[i6] & 255;
                    int i19 = i12 + i11;
                    while (i12 != i19) {
                        if (i18 == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i17 == i7) {
                                py23 = py23.f;
                                i2 = py23.b;
                                bArr = py23.a;
                                i7 = py23.c;
                                if (py23 == py22) {
                                    py23 = null;
                                }
                            } else {
                                i2 = i17;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i9;
                }
                if (i >= 0) {
                    return i;
                }
                i8 = -i;
                i6 = i2;
                i5 = -2;
            }
            return z ? i5 : i9;
        } else if (z) {
            return -2;
        } else {
            return ky2.indexOf(dy2.e);
        }
    }

    public final long Q() {
        return this.b;
    }

    public final dy2 R() {
        long j = this.b;
        if (j <= 2147483647L) {
            return T((int) j);
        }
        throw new IllegalArgumentException(C0201.m82(16840) + this.b);
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 R0(dy2 dy2) throws IOException {
        V(dy2);
        return this;
    }

    @Override // defpackage.cy2
    public void S(ay2 ay2, long j) throws EOFException {
        long j2 = this.b;
        if (j2 >= j) {
            ay2.write(this, j);
        } else {
            ay2.write(this, j2);
            throw new EOFException();
        }
    }

    public final dy2 T(int i) {
        if (i == 0) {
            return dy2.e;
        }
        return new ry2(this, i);
    }

    @Override // defpackage.cy2
    public short T0() {
        return vy2.d(readShort());
    }

    public py2 U(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        py2 py2 = this.a;
        if (py2 == null) {
            py2 b2 = qy2.b();
            this.a = b2;
            b2.g = b2;
            b2.f = b2;
            return b2;
        }
        py2 py22 = py2.g;
        if (py22.c + i <= 8192 && py22.e) {
            return py22;
        }
        py2 b3 = qy2.b();
        py22.c(b3);
        return b3;
    }

    public ay2 V(dy2 dy2) {
        if (dy2 != null) {
            dy2.K(this);
            return this;
        }
        throw new IllegalArgumentException(C0201.m82(16841));
    }

    @Override // defpackage.cy2
    public long W(dy2 dy2) {
        return x(dy2, 0);
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 X() throws IOException {
        o();
        return this;
    }

    @Override // defpackage.cy2
    public long X0(sy2 sy2) throws IOException {
        long j = this.b;
        if (j > 0) {
            sy2.write(this, j);
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r8 != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        throw new java.lang.NumberFormatException(vigqyno.C0201.m82(16842) + r1.G());
     */
    @Override // defpackage.cy2
    public long Y() {
        long j = 0;
        if (this.b != 0) {
            long j2 = -922337203685477580L;
            long j3 = -7;
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            loop0:
            while (true) {
                py2 py2 = this.a;
                byte[] bArr = py2.a;
                int i2 = py2.b;
                int i3 = py2.c;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    byte b2 = bArr[i2];
                    if (b2 >= 48 && b2 <= 57) {
                        int i4 = 48 - b2;
                        if (j < j2 || (j == j2 && ((long) i4) < j3)) {
                            ay2 ay2 = new ay2();
                            ay2.d0(j);
                            ay2.c0(b2);
                        } else {
                            j = (j * 10) + ((long) i4);
                        }
                    } else if (b2 == 45 && i == 0) {
                        j3--;
                        z = true;
                    } else if (i != 0) {
                        z2 = true;
                    } else {
                        throw new NumberFormatException(C0201.m82(16843) + Integer.toHexString(b2));
                    }
                    i2++;
                    i++;
                    j2 = -922337203685477580L;
                }
                if (i2 == i3) {
                    this.a = py2.b();
                    qy2.a(py2);
                } else {
                    py2.b = i2;
                }
                if (z2 || this.a == null) {
                    this.b -= (long) i;
                } else {
                    j2 = -922337203685477580L;
                }
            }
            this.b -= (long) i;
            return z ? j : -j;
        }
        throw new IllegalStateException(C0201.m82(16844));
    }

    public ay2 Z(byte[] bArr) {
        if (bArr != null) {
            a0(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException(C0201.m82(16845));
    }

    public final void a() {
        try {
            b(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public ay2 a0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            vy2.b((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                py2 U = U(1);
                int min = Math.min(i3 - i, 8192 - U.c);
                System.arraycopy(bArr, i, U.a, U.c, min);
                i += min;
                U.c += min;
            }
            this.b += j;
            return this;
        }
        throw new IllegalArgumentException(C0201.m82(16846));
    }

    @Override // defpackage.cy2
    public void b(long j) throws EOFException {
        while (j > 0) {
            py2 py2 = this.a;
            if (py2 != null) {
                int min = (int) Math.min(j, (long) (py2.c - py2.b));
                long j2 = (long) min;
                this.b -= j2;
                j -= j2;
                py2 py22 = this.a;
                int i = py22.b + min;
                py22.b = i;
                if (i == py22.c) {
                    this.a = py22.b();
                    qy2.a(py22);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.cy2
    public String b0(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long u = u((byte) 10, 0, j2);
            if (u != -1) {
                return N(u);
            }
            if (j2 < Q() && s(j2 - 1) == 13 && s(j2) == 10) {
                return N(j2);
            }
            ay2 ay2 = new ay2();
            n(ay2, 0, Math.min(32L, Q()));
            throw new EOFException(C0201.m82(16847) + Math.min(Q(), j) + C0201.m82(16848) + ay2.D().m() + (char) 8230);
        }
        throw new IllegalArgumentException(C0201.m82(16849) + j);
    }

    @Override // defpackage.cy2
    public void b1(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: c */
    public ay2 clone() {
        ay2 ay2 = new ay2();
        if (this.b == 0) {
            return ay2;
        }
        py2 d = this.a.d();
        ay2.a = d;
        d.g = d;
        d.f = d;
        py2 py2 = this.a;
        while (true) {
            py2 = py2.f;
            if (py2 != this.a) {
                ay2.a.g.c(py2.d());
            } else {
                ay2.b = this.b;
                return ay2;
            }
        }
    }

    public ay2 c0(int i) {
        py2 U = U(1);
        byte[] bArr = U.a;
        int i2 = U.c;
        U.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 c1(long j) throws IOException {
        d0(j);
        return this;
    }

    @Override // defpackage.ty2, java.lang.AutoCloseable, defpackage.sy2, java.io.Closeable, java.nio.channels.Channel
    public void close() {
    }

    @Override // defpackage.by2, defpackage.cy2
    public ay2 d() {
        return this;
    }

    public ay2 d0(long j) {
        if (j == 0) {
            c0(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                r0(C0201.m82(16850));
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        py2 U = U(i);
        byte[] bArr = U.a;
        int i2 = U.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        U.c += i;
        this.b += (long) i;
        return this;
    }

    public ay2 e0(long j) {
        if (j == 0) {
            c0(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        py2 U = U(numberOfTrailingZeros);
        byte[] bArr = U.a;
        int i = U.c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (15 & j)];
            j >>>= 4;
        }
        U.c += numberOfTrailingZeros;
        this.b += (long) numberOfTrailingZeros;
        return this;
    }

    @Override // defpackage.by2
    public OutputStream e1() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay2)) {
            return false;
        }
        ay2 ay2 = (ay2) obj;
        long j = this.b;
        if (j != ay2.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        py2 py2 = this.a;
        py2 py22 = ay2.a;
        int i = py2.b;
        int i2 = py22.b;
        while (j2 < this.b) {
            long min = (long) Math.min(py2.c - i, py22.c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (py2.a[i] != py22.a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == py2.c) {
                py2 = py2.f;
                i = py2.b;
            }
            if (i2 == py22.c) {
                py22 = py22.f;
                i2 = py22.b;
            }
            j2 += min;
        }
        return true;
    }

    public ay2 f0(int i) {
        py2 U = U(4);
        byte[] bArr = U.a;
        int i2 = U.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        U.c = i5 + 1;
        this.b += 4;
        return this;
    }

    @Override // defpackage.cy2
    public long f1(byte b2) {
        return u(b2, 0, Long.MAX_VALUE);
    }

    @Override // defpackage.sy2, defpackage.by2, java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        py2 py2 = this.a;
        if (py2 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = py2.c;
            for (int i3 = py2.b; i3 < i2; i3++) {
                i = (i * 31) + py2.a[i3];
            }
            py2 = py2.f;
        } while (py2 != this.a);
        return i;
    }

    public ay2 i0(long j) {
        py2 U = U(8);
        byte[] bArr = U.a;
        int i = U.c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        U.c = i8 + 1;
        this.b += 8;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        if (r8 != r9) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r15.a = r6.b();
        defpackage.qy2.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r6.b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        if (r1 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079 A[SYNTHETIC] */
    @Override // defpackage.cy2
    public long i1() {
        int i;
        int i2;
        if (this.b != 0) {
            int i3 = 0;
            long j = 0;
            boolean z = false;
            do {
                py2 py2 = this.a;
                byte[] bArr = py2.a;
                int i4 = py2.b;
                int i5 = py2.c;
                while (true) {
                    if (i4 >= i5) {
                        break;
                    }
                    byte b2 = bArr[i4];
                    if (b2 < 48 || b2 > 57) {
                        if (b2 >= 97 && b2 <= 102) {
                            i2 = b2 - 97;
                        } else if (b2 >= 65 && b2 <= 70) {
                            i2 = b2 - 65;
                        } else if (i3 == 0) {
                            z = true;
                        } else {
                            throw new NumberFormatException(C0201.m82(16852) + Integer.toHexString(b2));
                        }
                        i = i2 + 10;
                    } else {
                        i = b2 - 48;
                    }
                    if ((-1152921504606846976L & j) == 0) {
                        j = (j << 4) | ((long) i);
                        i4++;
                        i3++;
                    } else {
                        ay2 ay2 = new ay2();
                        ay2.e0(j);
                        ay2.c0(b2);
                        throw new NumberFormatException(C0201.m82(16851) + ay2.G());
                    }
                }
                if (i3 == 0) {
                }
            } while (this.a != null);
            this.b -= (long) i3;
            return j;
        }
        throw new IllegalStateException(C0201.m82(16853));
    }

    public boolean isOpen() {
        return true;
    }

    public ay2 j0(int i) {
        py2 U = U(2);
        byte[] bArr = U.a;
        int i2 = U.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        U.c = i3 + 1;
        this.b += 2;
        return this;
    }

    @Override // defpackage.cy2
    public InputStream j1() {
        return new b();
    }

    @Override // defpackage.cy2
    public int k1(ky2 ky2) {
        int P = P(ky2, false);
        if (P == -1) {
            return -1;
        }
        try {
            b((long) ky2.a[P].A());
            return P;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 l0(String str) throws IOException {
        r0(str);
        return this;
    }

    public final long m() {
        long j = this.b;
        if (j == 0) {
            return 0;
        }
        py2 py2 = this.a.g;
        int i = py2.c;
        return (i >= 8192 || !py2.e) ? j : j - ((long) (i - py2.b));
    }

    public ay2 m0(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException(C0201.m82(16860));
        } else if (i < 0) {
            throw new IllegalAccessError(C0201.m82(16859) + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException(C0201.m82(16857) + i2 + C0201.m82(16858) + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException(C0201.m82(16855) + i2 + C0201.m82(16856) + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException(C0201.m82(16854));
        } else if (charset.equals(vy2.a)) {
            w0(str, i, i2);
            return this;
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            a0(bytes, 0, bytes.length);
            return this;
        }
    }

    public final ay2 n(ay2 ay2, long j, long j2) {
        if (ay2 != null) {
            vy2.b(this.b, j, j2);
            if (j2 == 0) {
                return this;
            }
            ay2.b += j2;
            py2 py2 = this.a;
            while (true) {
                int i = py2.c;
                int i2 = py2.b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                py2 = py2.f;
            }
            while (j2 > 0) {
                py2 d = py2.d();
                int i3 = (int) (((long) d.b) + j);
                d.b = i3;
                d.c = Math.min(i3 + ((int) j2), d.c);
                py2 py22 = ay2.a;
                if (py22 == null) {
                    d.g = d;
                    d.f = d;
                    ay2.a = d;
                } else {
                    py22.g.c(d);
                }
                j2 -= (long) (d.c - d.b);
                py2 = py2.f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException(C0201.m82(16861));
    }

    public ay2 n0(String str, Charset charset) {
        m0(str, 0, str.length(), charset);
        return this;
    }

    public ay2 o() {
        return this;
    }

    @Override // defpackage.cy2
    public boolean o0(long j, dy2 dy2) {
        return y(j, dy2, 0, dy2.A());
    }

    @Override // defpackage.cy2
    public String p0(Charset charset) {
        try {
            return F(this.b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.cy2
    public dy2 q(long j) throws EOFException {
        return new dy2(O0(j));
    }

    public ay2 r0(String str) {
        w0(str, 0, str.length());
        return this;
    }

    public int read(byte[] bArr, int i, int i2) {
        vy2.b((long) bArr.length, (long) i, (long) i2);
        py2 py2 = this.a;
        if (py2 == null) {
            return -1;
        }
        int min = Math.min(i2, py2.c - py2.b);
        System.arraycopy(py2.a, py2.b, bArr, i, min);
        int i3 = py2.b + min;
        py2.b = i3;
        this.b -= (long) min;
        if (i3 == py2.c) {
            this.a = py2.b();
            qy2.a(py2);
        }
        return min;
    }

    @Override // defpackage.cy2
    public byte readByte() {
        long j = this.b;
        if (j != 0) {
            py2 py2 = this.a;
            int i = py2.b;
            int i2 = py2.c;
            int i3 = i + 1;
            byte b2 = py2.a[i];
            this.b = j - 1;
            if (i3 == i2) {
                this.a = py2.b();
                qy2.a(py2);
            } else {
                py2.b = i3;
            }
            return b2;
        }
        throw new IllegalStateException(C0201.m82(16864));
    }

    @Override // defpackage.cy2
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.cy2
    public int readInt() {
        long j = this.b;
        if (j >= 4) {
            py2 py2 = this.a;
            int i = py2.b;
            int i2 = py2.c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = py2.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.b = j - 4;
            if (i8 == i2) {
                this.a = py2.b();
                qy2.a(py2);
            } else {
                py2.b = i8;
            }
            return i9;
        }
        throw new IllegalStateException(C0201.m82(16865) + this.b);
    }

    @Override // defpackage.cy2
    public long readLong() {
        long j = this.b;
        if (j >= 8) {
            py2 py2 = this.a;
            int i = py2.b;
            int i2 = py2.c;
            if (i2 - i < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = py2.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            long j2 = (((long) bArr[i3]) & 255) << 48;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j3 = j2 | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            this.b = j - 8;
            if (i10 == i2) {
                this.a = py2.b();
                qy2.a(py2);
            } else {
                py2.b = i10;
            }
            return j3;
        }
        throw new IllegalStateException(C0201.m82(16866) + this.b);
    }

    @Override // defpackage.cy2
    public short readShort() {
        long j = this.b;
        if (j >= 2) {
            py2 py2 = this.a;
            int i = py2.b;
            int i2 = py2.c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = py2.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.b = j - 2;
            if (i4 == i2) {
                this.a = py2.b();
                qy2.a(py2);
            } else {
                py2.b = i4;
            }
            return (short) i5;
        }
        throw new IllegalStateException(C0201.m82(16867) + this.b);
    }

    public final byte s(long j) {
        int i;
        vy2.b(this.b, j, 1);
        long j2 = this.b;
        if (j2 - j > j) {
            py2 py2 = this.a;
            while (true) {
                int i2 = py2.c;
                int i3 = py2.b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return py2.a[i3 + ((int) j)];
                }
                j -= j3;
                py2 = py2.f;
            }
        } else {
            long j4 = j - j2;
            py2 py22 = this.a;
            do {
                py22 = py22.g;
                int i4 = py22.c;
                i = py22.b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return py22.a[i + ((int) j4)];
        }
    }

    @Override // defpackage.by2
    public by2 t() {
        return this;
    }

    @Override // defpackage.ty2, defpackage.sy2
    public uy2 timeout() {
        return uy2.NONE;
    }

    public String toString() {
        return R().toString();
    }

    public long u(byte b2, long j, long j2) {
        py2 py2;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format(C0201.m82(16868), Long.valueOf(this.b), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.b;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (py2 = this.a) == null) {
            return -1;
        }
        long j5 = this.b;
        if (j5 - j < j) {
            while (j5 > j) {
                py2 = py2.g;
                j5 -= (long) (py2.c - py2.b);
            }
        } else {
            while (true) {
                long j6 = ((long) (py2.c - py2.b)) + j3;
                if (j6 >= j) {
                    break;
                }
                py2 = py2.f;
                j3 = j6;
            }
            j5 = j3;
        }
        long j7 = j;
        while (j5 < j4) {
            byte[] bArr = py2.a;
            int min = (int) Math.min((long) py2.c, (((long) py2.b) + j4) - j5);
            for (int i = (int) ((((long) py2.b) + j7) - j5); i < min; i++) {
                if (bArr[i] == b2) {
                    return ((long) (i - py2.b)) + j5;
                }
            }
            j5 += (long) (py2.c - py2.b);
            py2 = py2.f;
            j7 = j5;
        }
        return -1;
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 v(int i) throws IOException {
        j0(i);
        return this;
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 v0(String str, int i, int i2) throws IOException {
        w0(str, i, i2);
        return this;
    }

    public long w(dy2 dy2, long j) throws IOException {
        byte[] bArr;
        if (dy2.A() != 0) {
            long j2 = 0;
            if (j >= 0) {
                py2 py2 = this.a;
                long j3 = -1;
                if (py2 == null) {
                    return -1;
                }
                long j4 = this.b;
                if (j4 - j < j) {
                    while (j4 > j) {
                        py2 = py2.g;
                        j4 -= (long) (py2.c - py2.b);
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (py2.c - py2.b)) + j2;
                        if (j5 >= j) {
                            break;
                        }
                        py2 = py2.f;
                        j2 = j5;
                    }
                    j4 = j2;
                }
                byte l = dy2.l(0);
                int A = dy2.A();
                long j6 = 1 + (this.b - ((long) A));
                long j7 = j;
                py2 py22 = py2;
                long j8 = j4;
                while (j8 < j6) {
                    byte[] bArr2 = py22.a;
                    int min = (int) Math.min((long) py22.c, (((long) py22.b) + j6) - j8);
                    int i = (int) ((((long) py22.b) + j7) - j8);
                    while (i < min) {
                        if (bArr2[i] == l) {
                            bArr = bArr2;
                            if (z(py22, i + 1, dy2, 1, A)) {
                                return ((long) (i - py22.b)) + j8;
                            }
                        } else {
                            bArr = bArr2;
                        }
                        i++;
                        bArr2 = bArr;
                    }
                    j8 += (long) (py22.c - py22.b);
                    py22 = py22.f;
                    j7 = j8;
                    j3 = -1;
                }
                return j3;
            }
            throw new IllegalArgumentException(C0201.m82(16869));
        }
        throw new IllegalArgumentException(C0201.m82(16870));
    }

    public ay2 w0(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException(C0201.m82(16876));
        } else if (i < 0) {
            throw new IllegalArgumentException(C0201.m82(16875) + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException(C0201.m82(16873) + i2 + C0201.m82(16874) + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    py2 U = U(1);
                    byte[] bArr = U.a;
                    int i3 = U.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = U.c;
                    int i6 = (i3 + i4) - i5;
                    U.c = i5 + i6;
                    this.b += (long) i6;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        c0((charAt >> 6) | 192);
                        c0((charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        c0((charAt >> '\f') | 224);
                        c0(((charAt >> 6) & 63) | 128);
                        c0((charAt & '?') | 128);
                    } else {
                        int i7 = i + 1;
                        char charAt3 = i7 < i2 ? str.charAt(i7) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            c0(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                            c0((i8 >> 18) | 240);
                            c0(((i8 >> 12) & 63) | 128);
                            c0(((i8 >> 6) & 63) | 128);
                            c0((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException(C0201.m82(16871) + i2 + C0201.m82(16872) + str.length());
        }
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 write(byte[] bArr) throws IOException {
        Z(bArr);
        return this;
    }

    public long x(dy2 dy2, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            py2 py2 = this.a;
            if (py2 == null) {
                return -1;
            }
            long j3 = this.b;
            if (j3 - j < j) {
                while (j3 > j) {
                    py2 = py2.g;
                    j3 -= (long) (py2.c - py2.b);
                }
            } else {
                while (true) {
                    long j4 = ((long) (py2.c - py2.b)) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    py2 = py2.f;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (dy2.A() == 2) {
                byte l = dy2.l(0);
                byte l2 = dy2.l(1);
                while (j3 < this.b) {
                    byte[] bArr = py2.a;
                    i = (int) ((((long) py2.b) + j) - j3);
                    int i3 = py2.c;
                    while (i < i3) {
                        byte b2 = bArr[i];
                        if (b2 == l || b2 == l2) {
                            i2 = py2.b;
                        } else {
                            i++;
                        }
                    }
                    j3 += (long) (py2.c - py2.b);
                    py2 = py2.f;
                    j = j3;
                }
                return -1;
            }
            byte[] n = dy2.n();
            while (j3 < this.b) {
                byte[] bArr2 = py2.a;
                i = (int) ((((long) py2.b) + j) - j3);
                int i4 = py2.c;
                while (i < i4) {
                    byte b3 = bArr2[i];
                    for (byte b4 : n) {
                        if (b3 == b4) {
                            i2 = py2.b;
                        }
                    }
                    i++;
                }
                j3 += (long) (py2.c - py2.b);
                py2 = py2.f;
                j = j3;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException(C0201.m82(16880));
    }

    @Override // defpackage.by2
    public long x0(ty2 ty2) throws IOException {
        if (ty2 != null) {
            long j = 0;
            while (true) {
                long read = ty2.read(this, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(16881));
        }
    }

    public boolean y(long j, dy2 dy2, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.b - j < ((long) i2) || dy2.A() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (s(((long) i3) + j) != dy2.l(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 y0(long j) throws IOException {
        e0(j);
        return this;
    }

    public ay2 z0(int i) {
        if (i < 128) {
            c0(i);
        } else if (i < 2048) {
            c0((i >> 6) | 192);
            c0((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                c0((i >> 12) | 224);
                c0(((i >> 6) & 63) | 128);
                c0((i & 63) | 128);
            } else {
                c0(63);
            }
        } else if (i <= 1114111) {
            c0((i >> 18) | 240);
            c0(((i >> 12) & 63) | 128);
            c0(((i >> 6) & 63) | 128);
            c0((i & 63) | 128);
        } else {
            throw new IllegalArgumentException(C0201.m82(16882) + Integer.toHexString(i));
        }
        return this;
    }

    @Override // defpackage.by2
    public /* bridge */ /* synthetic */ by2 write(byte[] bArr, int i, int i2) throws IOException {
        a0(bArr, i, i2);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                py2 U = U(1);
                int min = Math.min(i, 8192 - U.c);
                byteBuffer.get(U.a, U.c, min);
                i -= min;
                U.c += min;
            }
            this.b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException(C0201.m82(16877));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        py2 py2 = this.a;
        if (py2 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), py2.c - py2.b);
        byteBuffer.put(py2.a, py2.b, min);
        int i = py2.b + min;
        py2.b = i;
        this.b -= (long) min;
        if (i == py2.c) {
            this.a = py2.b();
            qy2.a(py2);
        }
        return min;
    }

    @Override // defpackage.sy2
    public void write(ay2 ay2, long j) {
        int i;
        if (ay2 == null) {
            throw new IllegalArgumentException(C0201.m82(16879));
        } else if (ay2 != this) {
            vy2.b(ay2.b, 0, j);
            while (j > 0) {
                py2 py2 = ay2.a;
                if (j < ((long) (py2.c - py2.b))) {
                    py2 py22 = this.a;
                    py2 py23 = py22 != null ? py22.g : null;
                    if (py23 != null && py23.e) {
                        long j2 = ((long) py23.c) + j;
                        if (py23.d) {
                            i = 0;
                        } else {
                            i = py23.b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            ay2.a.g(py23, (int) j);
                            ay2.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    ay2.a = ay2.a.e((int) j);
                }
                py2 py24 = ay2.a;
                long j3 = (long) (py24.c - py24.b);
                ay2.a = py24.b();
                py2 py25 = this.a;
                if (py25 == null) {
                    this.a = py24;
                    py24.g = py24;
                    py24.f = py24;
                } else {
                    py25.g.c(py24);
                    py24.a();
                }
                ay2.b -= j3;
                this.b += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(16878));
        }
    }

    @Override // defpackage.ty2
    public long read(ay2 ay2, long j) {
        if (ay2 == null) {
            throw new IllegalArgumentException(C0201.m82(16863));
        } else if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            ay2.write(this, j);
            return j;
        } else {
            throw new IllegalArgumentException(C0201.m82(16862) + j);
        }
    }
}
