package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: ny2  reason: default package */
/* compiled from: RealBufferedSink */
public final class ny2 implements by2 {
    public final ay2 a = new ay2();
    public final sy2 b;
    public boolean c;

    public ny2(sy2 sy2) {
        if (sy2 != null) {
            this.b = sy2;
            return;
        }
        throw new NullPointerException(C0201.m82(2364));
    }

    @Override // defpackage.by2
    public by2 C(int i) throws IOException {
        if (!this.c) {
            this.a.f0(i);
            X();
            return this;
        }
        throw new IllegalStateException(C0201.m82(2365));
    }

    @Override // defpackage.by2
    public by2 O(int i) throws IOException {
        if (!this.c) {
            this.a.c0(i);
            X();
            return this;
        }
        throw new IllegalStateException(C0201.m82(2366));
    }

    @Override // defpackage.by2
    public by2 R0(dy2 dy2) throws IOException {
        if (!this.c) {
            this.a.V(dy2);
            X();
            return this;
        }
        throw new IllegalStateException(C0201.m82(2367));
    }

    @Override // defpackage.by2
    public by2 X() throws IOException {
        if (!this.c) {
            long m = this.a.m();
            if (m > 0) {
                this.b.write(this.a, m);
            }
            return this;
        }
        throw new IllegalStateException(C0201.m82(2368));
    }

    @Override // defpackage.by2
    public by2 c1(long j) throws IOException {
        if (!this.c) {
            this.a.d0(j);
            X();
            return this;
        }
        throw new IllegalStateException(C0201.m82(2369));
    }

    @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        Throwable th;
        if (!this.c) {
            try {
                if (this.a.b > 0) {
                    this.b.write(this.a, this.a.b);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                vy2.e(th);
                throw null;
            }
        }
    }

    @Override // defpackage.by2
    public ay2 d() {
        return this.a;
    }

    @Override // defpackage.by2
    public OutputStream e1() {
        return new a();
    }

    @Override // defpackage.by2, defpackage.sy2, java.io.Flushable
    public void flush() throws IOException {
        if (!this.c) {
            ay2 ay2 = this.a;
            long j = ay2.b;
            if (j > 0) {
                this.b.write(ay2, j);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException(C0201.m82(2370));
    }

    public boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.by2
    public by2 l0(String str) throws IOException {
        if (!this.c) {
            this.a.r0(str);
            X();
            return this;
        }
        throw new IllegalStateException(C0201.m82(2371));
    }

    @Override // defpackage.by2
    public by2 t() throws IOException {
        if (!this.c) {
            long Q = this.a.Q();
            if (Q > 0) {
                this.b.write(this.a, Q);
            }
            return this;
        }
        throw new IllegalStateException(C0201.m82(2372));
    }

    @Override // defpackage.sy2
    public uy2 timeout() {
        return this.b.timeout();
    }

    public String toString() {
        return C0201.m82(2373) + this.b + C0201.m82(2374);
    }

    @Override // defpackage.by2
    public by2 v(int i) throws IOException {
        if (!this.c) {
            this.a.j0(i);
            X();
            return this;
        }
        throw new IllegalStateException(C0201.m82(2375));
    }

    @Override // defpackage.by2
    public by2 v0(String str, int i, int i2) throws IOException {
        if (!this.c) {
            this.a.w0(str, i, i2);
            X();
            return this;
        }
        throw new IllegalStateException(C0201.m82(2376));
    }

    @Override // defpackage.sy2
    public void write(ay2 ay2, long j) throws IOException {
        if (!this.c) {
            this.a.write(ay2, j);
            X();
            return;
        }
        throw new IllegalStateException(C0201.m82(2380));
    }

    @Override // defpackage.by2
    public long x0(ty2 ty2) throws IOException {
        if (ty2 != null) {
            long j = 0;
            while (true) {
                long read = ty2.read(this.a, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
                X();
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(2381));
        }
    }

    @Override // defpackage.by2
    public by2 y0(long j) throws IOException {
        if (!this.c) {
            this.a.e0(j);
            X();
            return this;
        }
        throw new IllegalStateException(C0201.m82(2382));
    }

    /* renamed from: ny2$a */
    /* compiled from: RealBufferedSink */
    class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            ny2.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            ny2 ny2 = ny2.this;
            if (!ny2.c) {
                ny2.flush();
            }
        }

        public String toString() {
            return ny2.this + C0201.m82(22220);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            ny2 ny2 = ny2.this;
            if (!ny2.c) {
                ny2.a.c0((byte) i);
                ny2.this.X();
                return;
            }
            throw new IOException(C0201.m82(22221));
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            ny2 ny2 = ny2.this;
            if (!ny2.c) {
                ny2.a.a0(bArr, i, i2);
                ny2.this.X();
                return;
            }
            throw new IOException(C0201.m82(22222));
        }
    }

    @Override // defpackage.by2
    public by2 write(byte[] bArr) throws IOException {
        if (!this.c) {
            this.a.Z(bArr);
            X();
            return this;
        }
        throw new IllegalStateException(C0201.m82(2378));
    }

    @Override // defpackage.by2
    public by2 write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.c) {
            this.a.a0(bArr, i, i2);
            X();
            return this;
        }
        throw new IllegalStateException(C0201.m82(2379));
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.c) {
            int write = this.a.write(byteBuffer);
            X();
            return write;
        }
        throw new IllegalStateException(C0201.m82(2377));
    }
}
