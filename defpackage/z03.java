package defpackage;

import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: z03  reason: default package */
/* compiled from: ASN1StreamParser */
public class z03 {
    private final InputStream a;
    private final int b;
    private final byte[][] c;

    public z03(InputStream inputStream) {
        this(inputStream, a33.c(inputStream));
    }

    private void e(boolean z) {
        InputStream inputStream = this.a;
        if (inputStream instanceof v23) {
            ((v23) inputStream).k(z);
        }
    }

    public g03 a(int i) throws IOException {
        if (i == 4) {
            return new h13(this);
        }
        if (i == 8) {
            return new t13(this);
        }
        if (i == 16) {
            return new j13(this);
        }
        if (i == 17) {
            return new l13(this);
        }
        throw new j03(C0201.m82(29049) + Integer.toHexString(i));
    }

    public g03 b() throws IOException {
        int read = this.a.read();
        if (read == -1) {
            return null;
        }
        boolean z = false;
        e(false);
        int u = l03.u(this.a, read);
        if ((read & 32) != 0) {
            z = true;
        }
        int r = l03.r(this.a, this.b);
        if (r >= 0) {
            t23 t23 = new t23(this.a, r);
            if ((read & 64) != 0) {
                return new p13(z, u, t23.h());
            }
            if ((read & 128) != 0) {
                return new n13(z, u, new z03(t23));
            }
            if (z) {
                if (u == 4) {
                    return new h13(new z03(t23));
                }
                if (u == 8) {
                    return new t13(new z03(t23));
                }
                if (u == 16) {
                    return new f23(new z03(t23));
                }
                if (u == 17) {
                    return new h23(new z03(t23));
                }
                throw new IOException(C0201.m82(29051) + u + C0201.m82(29052));
            } else if (u == 4) {
                return new b23(t23);
            } else {
                try {
                    return l03.k(u, t23, this.c);
                } catch (IllegalArgumentException e) {
                    throw new j03(C0201.m82(29053), e);
                }
            }
        } else if (z) {
            z03 z03 = new z03(new v23(this.a, this.b), this.b);
            if ((read & 64) != 0) {
                return new e13(u, z03);
            }
            if ((read & 128) != 0) {
                return new n13(true, u, z03);
            }
            return z03.a(u);
        } else {
            throw new IOException(C0201.m82(29050));
        }
    }

    public u03 c(boolean z, int i) throws IOException {
        if (!z) {
            return new j23(false, i, new a23(((t23) this.a).h()));
        }
        h03 d = d();
        if (this.a instanceof v23) {
            if (d.c() == 1) {
                return new m13(true, i, d.b(0));
            }
            return new m13(false, i, f13.a(d));
        } else if (d.c() == 1) {
            return new j23(true, i, d.b(0));
        } else {
            return new j23(false, i, u13.a(d));
        }
    }

    public h03 d() throws IOException {
        h03 h03 = new h03();
        while (true) {
            g03 b2 = b();
            if (b2 == null) {
                return h03;
            }
            if (b2 instanceof u23) {
                h03.a(((u23) b2).d());
            } else {
                h03.a(b2.b());
            }
        }
    }

    public z03(InputStream inputStream, int i) {
        this.a = inputStream;
        this.b = i;
        this.c = new byte[11][];
    }
}
