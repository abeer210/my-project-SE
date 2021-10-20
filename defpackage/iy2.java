package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import vigqyno.C0201;

/* renamed from: iy2  reason: default package */
/* compiled from: InflaterSource */
public final class iy2 implements ty2 {
    private final cy2 a;
    private final Inflater b;
    private int c;
    private boolean d;

    public iy2(cy2 cy2, Inflater inflater) {
        if (cy2 == null) {
            throw new IllegalArgumentException(C0201.m82(3430));
        } else if (inflater != null) {
            this.a = cy2;
            this.b = inflater;
        } else {
            throw new IllegalArgumentException(C0201.m82(3429));
        }
    }

    private void c() throws IOException {
        int i = this.c;
        if (i != 0) {
            int remaining = i - this.b.getRemaining();
            this.c -= remaining;
            this.a.b((long) remaining);
        }
    }

    public final boolean a() throws IOException {
        if (!this.b.needsInput()) {
            return false;
        }
        c();
        if (this.b.getRemaining() != 0) {
            throw new IllegalStateException(C0201.m82(3431));
        } else if (this.a.M()) {
            return true;
        } else {
            py2 py2 = this.a.d().a;
            int i = py2.c;
            int i2 = py2.b;
            int i3 = i - i2;
            this.c = i3;
            this.b.setInput(py2.a, i2, i3);
            return false;
        }
    }

    @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.d) {
            this.b.end();
            this.d = true;
            this.a.close();
        }
    }

    @Override // defpackage.ty2
    public long read(ay2 ay2, long j) throws IOException {
        py2 U;
        if (j < 0) {
            throw new IllegalArgumentException(C0201.m82(3434) + j);
        } else if (this.d) {
            throw new IllegalStateException(C0201.m82(3433));
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean a2 = a();
                try {
                    U = ay2.U(1);
                    int inflate = this.b.inflate(U.a, U.c, (int) Math.min(j, (long) (8192 - U.c)));
                    if (inflate > 0) {
                        U.c += inflate;
                        long j2 = (long) inflate;
                        ay2.b += j2;
                        return j2;
                    } else if (this.b.finished()) {
                        break;
                    } else if (this.b.needsDictionary()) {
                        break;
                    } else if (a2) {
                        throw new EOFException(C0201.m82(3432));
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            c();
            if (U.b != U.c) {
                return -1;
            }
            ay2.a = U.b();
            qy2.a(U);
            return -1;
        }
    }

    @Override // defpackage.ty2
    public uy2 timeout() {
        return this.a.timeout();
    }
}
