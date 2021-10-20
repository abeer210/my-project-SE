package defpackage;

/* renamed from: py2  reason: default package */
/* compiled from: Segment */
public final class py2 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public py2 f;
    public py2 g;

    public py2() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final void a() {
        py2 py2 = this.g;
        if (py2 == this) {
            throw new IllegalStateException();
        } else if (py2.e) {
            int i = this.c - this.b;
            if (i <= (8192 - py2.c) + (py2.d ? 0 : py2.b)) {
                g(this.g, i);
                b();
                qy2.a(this);
            }
        }
    }

    public final py2 b() {
        py2 py2 = this.f;
        if (py2 == this) {
            py2 = null;
        }
        py2 py22 = this.g;
        py22.f = this.f;
        this.f.g = py22;
        this.f = null;
        this.g = null;
        return py2;
    }

    public final py2 c(py2 py2) {
        py2.g = this;
        py2.f = this.f;
        this.f.g = py2;
        this.f = py2;
        return py2;
    }

    public final py2 d() {
        this.d = true;
        return new py2(this.a, this.b, this.c, true, false);
    }

    public final py2 e(int i) {
        py2 py2;
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            py2 = d();
        } else {
            py2 = qy2.b();
            System.arraycopy(this.a, this.b, py2.a, 0, i);
        }
        py2.c = py2.b + i;
        this.b += i;
        this.g.c(py2);
        return py2;
    }

    public final py2 f() {
        return new py2((byte[]) this.a.clone(), this.b, this.c, false, true);
    }

    public final void g(py2 py2, int i) {
        if (py2.e) {
            int i2 = py2.c;
            if (i2 + i > 8192) {
                if (!py2.d) {
                    int i3 = py2.b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = py2.a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        py2.c -= py2.b;
                        py2.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, py2.a, py2.c, i);
            py2.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public py2(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
