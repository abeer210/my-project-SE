package defpackage;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: l03  reason: default package */
/* compiled from: ASN1InputStream */
public class l03 extends FilterInputStream {
    private final int a;
    private final boolean b;
    private final byte[][] c;

    public l03(InputStream inputStream) {
        this(inputStream, a33.c(inputStream));
    }

    public static u03 k(int i, t23 t23, byte[][] bArr) throws IOException {
        if (i == 10) {
            return i03.q(n(t23, bArr));
        }
        if (i == 12) {
            return new k23(t23.h());
        }
        if (i == 30) {
            return new q13(m(t23));
        }
        switch (i) {
            case 1:
                return e03.q(n(t23, bArr));
            case 2:
                return new m03(t23.h(), false);
            case 3:
                return d03.r(t23.a(), t23);
            case 4:
                return new a23(t23.h());
            case 5:
                return y13.a;
            case 6:
                return p03.s(n(t23, bArr));
            default:
                switch (i) {
                    case 18:
                        return new z13(t23.h());
                    case 19:
                        return new d23(t23.h());
                    case 20:
                        return new i23(t23.h());
                    case 21:
                        return new m23(t23.h());
                    case 22:
                        return new x13(t23.h());
                    case 23:
                        return new c13(t23.h());
                    case 24:
                        return new k03(t23.h());
                    case 25:
                        return new w13(t23.h());
                    case 26:
                        return new n23(t23.h());
                    case 27:
                        return new v13(t23.h());
                    case 28:
                        return new l23(t23.h());
                    default:
                        throw new IOException(C0201.m82(5307) + i + C0201.m82(5308));
                }
        }
    }

    private static char[] m(t23 t23) throws IOException {
        int read;
        int a2 = t23.a() / 2;
        char[] cArr = new char[a2];
        for (int i = 0; i < a2; i++) {
            int read2 = t23.read();
            if (read2 < 0 || (read = t23.read()) < 0) {
                break;
            }
            cArr[i] = (char) ((read2 << 8) | (read & 255));
        }
        return cArr;
    }

    private static byte[] n(t23 t23, byte[][] bArr) throws IOException {
        int a2 = t23.a();
        if (t23.a() >= bArr.length) {
            return t23.h();
        }
        byte[] bArr2 = bArr[a2];
        if (bArr2 == null) {
            bArr2 = new byte[a2];
            bArr[a2] = bArr2;
        }
        sb3.c(t23, bArr2);
        return bArr2;
    }

    public static int r(InputStream inputStream, int i) throws IOException {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException(C0201.m82(5313));
        } else if (read == 128) {
            return -1;
        } else {
            if (read <= 127) {
                return read;
            }
            int i2 = read & 127;
            if (i2 <= 4) {
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    int read2 = inputStream.read();
                    if (read2 >= 0) {
                        i3 = (i3 << 8) + read2;
                    } else {
                        throw new EOFException(C0201.m82(5309));
                    }
                }
                if (i3 < 0) {
                    throw new IOException(C0201.m82(5311));
                } else if (i3 < i) {
                    return i3;
                } else {
                    throw new IOException(C0201.m82(5310));
                }
            } else {
                throw new IOException(C0201.m82(5312) + i2);
            }
        }
    }

    public static int u(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int read = inputStream.read();
        if ((read & 127) != 0) {
            while (read >= 0 && (read & 128) != 0) {
                i3 = (i3 | (read & 127)) << 7;
                read = inputStream.read();
            }
            if (read >= 0) {
                return i3 | (read & 127);
            }
            throw new EOFException(C0201.m82(5314));
        }
        throw new IOException(C0201.m82(5315));
    }

    public h03 a(t23 t23) throws IOException {
        return new l03(t23).c();
    }

    public h03 c() throws IOException {
        h03 h03 = new h03();
        while (true) {
            u03 s = s();
            if (s == null) {
                return h03;
            }
            h03.a(s);
        }
    }

    public u03 h(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        t23 t23 = new t23(this, i3);
        if ((i & 64) != 0) {
            return new p13(z, i2, t23.h());
        }
        if ((i & 128) != 0) {
            return new z03(t23).c(z, i2);
        }
        if (!z) {
            return k(i2, t23, this.c);
        }
        if (i2 == 4) {
            h03 a2 = a(t23);
            int c2 = a2.c();
            q03[] q03Arr = new q03[c2];
            for (int i4 = 0; i4 != c2; i4++) {
                q03Arr[i4] = (q03) a2.b(i4);
            }
            return new g13(q03Arr);
        } else if (i2 == 8) {
            return new s13(a(t23));
        } else {
            if (i2 != 16) {
                if (i2 == 17) {
                    return u13.b(a(t23));
                }
                throw new IOException(C0201.m82(5316) + i2 + C0201.m82(5317));
            } else if (this.b) {
                return new x23(t23.h());
            } else {
                return u13.a(a(t23));
            }
        }
    }

    public int o() {
        return this.a;
    }

    public int p() throws IOException {
        return r(this, this.a);
    }

    public u03 s() throws IOException {
        int read = read();
        if (read > 0) {
            int u = u(this, read);
            boolean z = (read & 32) != 0;
            int p = p();
            if (p >= 0) {
                try {
                    return h(read, u, p);
                } catch (IllegalArgumentException e) {
                    throw new j03(C0201.m82(5321), e);
                }
            } else if (z) {
                z03 z03 = new z03(new v23(this, this.a), this.a);
                if ((read & 64) != 0) {
                    return new e13(u, z03).d();
                }
                if ((read & 128) != 0) {
                    return new n13(true, u, z03).d();
                }
                if (u == 4) {
                    return new h13(z03).d();
                }
                if (u == 8) {
                    return new t13(z03).d();
                }
                if (u == 16) {
                    return new j13(z03).d();
                }
                if (u == 17) {
                    return new l13(z03).d();
                }
                throw new IOException(C0201.m82(5319));
            } else {
                throw new IOException(C0201.m82(5320));
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException(C0201.m82(5318));
        }
    }

    public l03(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public l03(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }

    public l03(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public l03(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.a = i;
        this.b = z;
        this.c = new byte[11][];
    }
}
