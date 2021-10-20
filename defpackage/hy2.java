package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import vigqyno.C0201;

/* renamed from: hy2  reason: default package */
/* compiled from: GzipSource */
public final class hy2 implements ty2 {
    private int a = 0;
    private final cy2 b;
    private final Inflater c;
    private final iy2 d;
    private final CRC32 e = new CRC32();

    public hy2(ty2 ty2) {
        if (ty2 != null) {
            this.c = new Inflater(true);
            cy2 d2 = jy2.d(ty2);
            this.b = d2;
            this.d = new iy2(d2, this.c);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(5580));
    }

    private void a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format(C0201.m82(5581), str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    private void c() throws IOException {
        this.b.b1(10);
        byte s = this.b.d().s(3);
        boolean z = ((s >> 1) & 1) == 1;
        if (z) {
            k(this.b.d(), 0, 10);
        }
        a(C0201.m82(5582), 8075, this.b.readShort());
        this.b.b(8);
        if (((s >> 2) & 1) == 1) {
            this.b.b1(2);
            if (z) {
                k(this.b.d(), 0, 2);
            }
            long T0 = (long) this.b.d().T0();
            this.b.b1(T0);
            if (z) {
                k(this.b.d(), 0, T0);
            }
            this.b.b(T0);
        }
        if (((s >> 3) & 1) == 1) {
            long f1 = this.b.f1((byte) 0);
            if (f1 != -1) {
                if (z) {
                    k(this.b.d(), 0, f1 + 1);
                }
                this.b.b(f1 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((s >> 4) & 1) == 1) {
            long f12 = this.b.f1((byte) 0);
            if (f12 != -1) {
                if (z) {
                    k(this.b.d(), 0, f12 + 1);
                }
                this.b.b(f12 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            a(C0201.m82(5583), this.b.T0(), (short) ((int) this.e.getValue()));
            this.e.reset();
        }
    }

    private void h() throws IOException {
        a(C0201.m82(5584), this.b.K0(), (int) this.e.getValue());
        a(C0201.m82(5585), this.b.K0(), (int) this.c.getBytesWritten());
    }

    private void k(ay2 ay2, long j, long j2) {
        py2 py2 = ay2.a;
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
            int i3 = (int) (((long) py2.b) + j);
            int min = (int) Math.min((long) (py2.c - i3), j2);
            this.e.update(py2.a, i3, min);
            j2 -= (long) min;
            py2 = py2.f;
            j = 0;
        }
    }

    @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.ty2
    public long read(ay2 ay2, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(C0201.m82(5587) + j);
        } else if (j == 0) {
            return 0;
        } else {
            if (this.a == 0) {
                c();
                this.a = 1;
            }
            if (this.a == 1) {
                long j2 = ay2.b;
                long read = this.d.read(ay2, j);
                if (read != -1) {
                    k(ay2, j2, read);
                    return read;
                }
                this.a = 2;
            }
            if (this.a == 2) {
                h();
                this.a = 3;
                if (!this.b.M()) {
                    throw new IOException(C0201.m82(5586));
                }
            }
            return -1;
        }
    }

    @Override // defpackage.ty2
    public uy2 timeout() {
        return this.b.timeout();
    }
}
