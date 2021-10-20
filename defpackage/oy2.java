package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: oy2  reason: default package */
/* compiled from: RealBufferedSource */
public final class oy2 implements cy2 {
    public final ay2 a = new ay2();
    public final ty2 b;
    public boolean c;

    public oy2(ty2 ty2) {
        if (ty2 != null) {
            this.b = ty2;
            return;
        }
        throw new NullPointerException(C0201.m82(38960));
    }

    @Override // defpackage.cy2
    public boolean D0(long j) throws IOException {
        ay2 ay2;
        if (j < 0) {
            throw new IllegalArgumentException(C0201.m82(38962) + j);
        } else if (!this.c) {
            do {
                ay2 = this.a;
                if (ay2.b >= j) {
                    return true;
                }
            } while (this.b.read(ay2, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException(C0201.m82(38961));
        }
    }

    @Override // defpackage.cy2
    public byte[] I() throws IOException {
        this.a.x0(this.b);
        return this.a.I();
    }

    @Override // defpackage.cy2
    public long J(dy2 dy2) throws IOException {
        return c(dy2, 0);
    }

    @Override // defpackage.cy2
    public String J0() throws IOException {
        return b0(Long.MAX_VALUE);
    }

    @Override // defpackage.cy2
    public int K0() throws IOException {
        b1(4);
        return this.a.K0();
    }

    @Override // defpackage.cy2
    public ay2 L() {
        return this.a;
    }

    @Override // defpackage.cy2
    public boolean M() throws IOException {
        if (!this.c) {
            return this.a.M() && this.b.read(this.a, 8192) == -1;
        }
        throw new IllegalStateException(C0201.m82(38963));
    }

    @Override // defpackage.cy2
    public byte[] O0(long j) throws IOException {
        b1(j);
        return this.a.O0(j);
    }

    @Override // defpackage.cy2
    public void S(ay2 ay2, long j) throws IOException {
        try {
            b1(j);
            this.a.S(ay2, j);
        } catch (EOFException e) {
            ay2.x0(this.a);
            throw e;
        }
    }

    @Override // defpackage.cy2
    public short T0() throws IOException {
        b1(2);
        return this.a.T0();
    }

    @Override // defpackage.cy2
    public long W(dy2 dy2) throws IOException {
        return h(dy2, 0);
    }

    @Override // defpackage.cy2
    public long X0(sy2 sy2) throws IOException {
        if (sy2 != null) {
            long j = 0;
            while (this.b.read(this.a, 8192) != -1) {
                long m = this.a.m();
                if (m > 0) {
                    j += m;
                    sy2.write(this.a, m);
                }
            }
            if (this.a.Q() <= 0) {
                return j;
            }
            long Q = j + this.a.Q();
            ay2 ay2 = this.a;
            sy2.write(ay2, ay2.Q());
            return Q;
        }
        throw new IllegalArgumentException(C0201.m82(38964));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    @Override // defpackage.cy2
    public long Y() throws IOException {
        b1(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!D0((long) i2)) {
                break;
            }
            byte s = this.a.s((long) i);
            if ((s >= 48 && s <= 57) || (i == 0 && s == 45)) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format(C0201.m82(38965), Byte.valueOf(s)));
            }
        }
        if (i == 0) {
        }
        return this.a.Y();
    }

    public long a(byte b2, long j, long j2) throws IOException {
        if (this.c) {
            throw new IllegalStateException(C0201.m82(38967));
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format(C0201.m82(38966), Long.valueOf(j), Long.valueOf(j2)));
        } else {
            while (j < j2) {
                long u = this.a.u(b2, j, j2);
                if (u == -1) {
                    ay2 ay2 = this.a;
                    long j3 = ay2.b;
                    if (j3 >= j2 || this.b.read(ay2, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return u;
                }
            }
            return -1;
        }
    }

    @Override // defpackage.cy2
    public void b(long j) throws IOException {
        if (!this.c) {
            while (j > 0) {
                ay2 ay2 = this.a;
                if (ay2.b == 0 && this.b.read(ay2, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.a.Q());
                this.a.b(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException(C0201.m82(38968));
    }

    @Override // defpackage.cy2
    public String b0(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a2 = a((byte) 10, 0, j2);
            if (a2 != -1) {
                return this.a.N(a2);
            }
            if (j2 < Long.MAX_VALUE && D0(j2) && this.a.s(j2 - 1) == 13 && D0(1 + j2) && this.a.s(j2) == 10) {
                return this.a.N(j2);
            }
            ay2 ay2 = new ay2();
            ay2 ay22 = this.a;
            ay22.n(ay2, 0, Math.min(32L, ay22.Q()));
            throw new EOFException(C0201.m82(38969) + Math.min(this.a.Q(), j) + C0201.m82(38970) + ay2.D().m() + (char) 8230);
        }
        throw new IllegalArgumentException(C0201.m82(38971) + j);
    }

    @Override // defpackage.cy2
    public void b1(long j) throws IOException {
        if (!D0(j)) {
            throw new EOFException();
        }
    }

    public long c(dy2 dy2, long j) throws IOException {
        if (!this.c) {
            while (true) {
                long w = this.a.w(dy2, j);
                if (w != -1) {
                    return w;
                }
                ay2 ay2 = this.a;
                long j2 = ay2.b;
                if (this.b.read(ay2, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) dy2.A())) + 1);
            }
        } else {
            throw new IllegalStateException(C0201.m82(38972));
        }
    }

    @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.a.a();
        }
    }

    @Override // defpackage.cy2
    public ay2 d() {
        return this.a;
    }

    @Override // defpackage.cy2
    public long f1(byte b2) throws IOException {
        return a(b2, 0, Long.MAX_VALUE);
    }

    public long h(dy2 dy2, long j) throws IOException {
        if (!this.c) {
            while (true) {
                long x = this.a.x(dy2, j);
                if (x != -1) {
                    return x;
                }
                ay2 ay2 = this.a;
                long j2 = ay2.b;
                if (this.b.read(ay2, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException(C0201.m82(38973));
        }
    }

    @Override // defpackage.cy2
    public long i1() throws IOException {
        b1(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!D0((long) i2)) {
                break;
            }
            byte s = this.a.s((long) i);
            if ((s >= 48 && s <= 57) || ((s >= 97 && s <= 102) || (s >= 65 && s <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format(C0201.m82(38974), Byte.valueOf(s)));
            }
        }
        return this.a.i1();
    }

    public boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.cy2
    public InputStream j1() {
        return new a();
    }

    public boolean k(long j, dy2 dy2, int i, int i2) throws IOException {
        if (this.c) {
            throw new IllegalStateException(C0201.m82(38975));
        } else if (j < 0 || i < 0 || i2 < 0 || dy2.A() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!(D0(1 + j2) && this.a.s(j2) == dy2.l(i + i3))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // defpackage.cy2
    public int k1(ky2 ky2) throws IOException {
        if (!this.c) {
            do {
                int P = this.a.P(ky2, true);
                if (P == -1) {
                    return -1;
                }
                if (P != -2) {
                    this.a.b((long) ky2.a[P].A());
                    return P;
                }
            } while (this.b.read(this.a, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException(C0201.m82(38976));
    }

    @Override // defpackage.cy2
    public boolean o0(long j, dy2 dy2) throws IOException {
        return k(j, dy2, 0, dy2.A());
    }

    @Override // defpackage.cy2
    public String p0(Charset charset) throws IOException {
        if (charset != null) {
            this.a.x0(this.b);
            return this.a.p0(charset);
        }
        throw new IllegalArgumentException(C0201.m82(38977));
    }

    @Override // defpackage.cy2
    public dy2 q(long j) throws IOException {
        b1(j);
        return this.a.q(j);
    }

    @Override // defpackage.ty2
    public long read(ay2 ay2, long j) throws IOException {
        if (ay2 == null) {
            throw new IllegalArgumentException(C0201.m82(38980));
        } else if (j < 0) {
            throw new IllegalArgumentException(C0201.m82(38979) + j);
        } else if (!this.c) {
            ay2 ay22 = this.a;
            if (ay22.b == 0 && this.b.read(ay22, 8192) == -1) {
                return -1;
            }
            return this.a.read(ay2, Math.min(j, this.a.b));
        } else {
            throw new IllegalStateException(C0201.m82(38978));
        }
    }

    @Override // defpackage.cy2
    public byte readByte() throws IOException {
        b1(1);
        return this.a.readByte();
    }

    @Override // defpackage.cy2
    public void readFully(byte[] bArr) throws IOException {
        try {
            b1((long) bArr.length);
            this.a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                ay2 ay2 = this.a;
                long j = ay2.b;
                if (j > 0) {
                    int read = ay2.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.cy2
    public int readInt() throws IOException {
        b1(4);
        return this.a.readInt();
    }

    @Override // defpackage.cy2
    public long readLong() throws IOException {
        b1(8);
        return this.a.readLong();
    }

    @Override // defpackage.cy2
    public short readShort() throws IOException {
        b1(2);
        return this.a.readShort();
    }

    @Override // defpackage.ty2
    public uy2 timeout() {
        return this.b.timeout();
    }

    public String toString() {
        return C0201.m82(38981) + this.b + C0201.m82(38982);
    }

    /* renamed from: oy2$a */
    /* compiled from: RealBufferedSource */
    class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            oy2 oy2 = oy2.this;
            if (!oy2.c) {
                return (int) Math.min(oy2.a.b, 2147483647L);
            }
            throw new IOException(C0201.m82(13380));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() throws IOException {
            oy2.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            oy2 oy2 = oy2.this;
            if (!oy2.c) {
                ay2 ay2 = oy2.a;
                if (ay2.b == 0 && oy2.b.read(ay2, 8192) == -1) {
                    return -1;
                }
                return oy2.this.a.readByte() & 255;
            }
            throw new IOException(C0201.m82(13381));
        }

        public String toString() {
            return oy2.this + C0201.m82(13383);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!oy2.this.c) {
                vy2.b((long) bArr.length, (long) i, (long) i2);
                oy2 oy2 = oy2.this;
                ay2 ay2 = oy2.a;
                if (ay2.b == 0 && oy2.b.read(ay2, 8192) == -1) {
                    return -1;
                }
                return oy2.this.a.read(bArr, i, i2);
            }
            throw new IOException(C0201.m82(13382));
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        ay2 ay2 = this.a;
        if (ay2.b == 0 && this.b.read(ay2, 8192) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }
}
