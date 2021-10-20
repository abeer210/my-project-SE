package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: n93  reason: default package */
/* compiled from: XMSSMTPrivateKeyParameters */
public final class n93 extends z63 {
    private final m93 a;
    private final long b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final z83 g;

    /* renamed from: n93$b */
    /* compiled from: XMSSMTPrivateKeyParameters */
    public static class b {
        private final m93 a;
        private long b = 0;
        private byte[] c = null;
        private byte[] d = null;
        private byte[] e = null;
        private byte[] f = null;
        private z83 g = null;
        private byte[] h = null;
        private s93 i = null;

        public b(m93 m93) {
            this.a = m93;
        }

        public n93 j() {
            return new n93(this);
        }

        public b k(z83 z83) {
            this.g = z83;
            return this;
        }

        public b l(long j) {
            this.b = j;
            return this;
        }

        public b m(byte[] bArr) {
            this.e = v93.c(bArr);
            return this;
        }

        public b n(byte[] bArr) {
            this.f = v93.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.d = v93.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.c = v93.c(bArr);
            return this;
        }
    }

    public m93 a() {
        return this.a;
    }

    public byte[] b() {
        int b2 = this.a.b();
        int c2 = (this.a.c() + 7) / 8;
        byte[] bArr = new byte[(c2 + b2 + b2 + b2 + b2)];
        v93.e(bArr, v93.p(this.b, c2), 0);
        int i = c2 + 0;
        v93.e(bArr, this.c, i);
        int i2 = i + b2;
        v93.e(bArr, this.d, i2);
        int i3 = i2 + b2;
        v93.e(bArr, this.e, i3);
        v93.e(bArr, this.f, i3 + b2);
        try {
            return hb3.f(bArr, v93.o(this.g));
        } catch (IOException e2) {
            e2.printStackTrace();
            throw new RuntimeException(C0201.m82(11914));
        }
    }

    private n93(b bVar) {
        super(true);
        m93 m93 = bVar.a;
        this.a = m93;
        if (m93 != null) {
            int b2 = m93.b();
            byte[] bArr = bVar.h;
            if (bArr == null) {
                this.b = bVar.b;
                byte[] bArr2 = bVar.c;
                if (bArr2 == null) {
                    this.c = new byte[b2];
                } else if (bArr2.length == b2) {
                    this.c = bArr2;
                } else {
                    throw new IllegalArgumentException(C0201.m82(11909));
                }
                byte[] bArr3 = bVar.d;
                if (bArr3 == null) {
                    this.d = new byte[b2];
                } else if (bArr3.length == b2) {
                    this.d = bArr3;
                } else {
                    throw new IllegalArgumentException(C0201.m82(11910));
                }
                byte[] bArr4 = bVar.e;
                if (bArr4 == null) {
                    this.e = new byte[b2];
                } else if (bArr4.length == b2) {
                    this.e = bArr4;
                } else {
                    throw new IllegalArgumentException(C0201.m82(11911));
                }
                byte[] bArr5 = bVar.f;
                if (bArr5 == null) {
                    this.f = new byte[b2];
                } else if (bArr5.length == b2) {
                    this.f = bArr5;
                } else {
                    throw new IllegalArgumentException(C0201.m82(11912));
                }
                z83 z83 = bVar.g;
                if (z83 != null) {
                    this.g = z83;
                    return;
                }
                if (!v93.l(this.a.c(), bVar.b) || bArr4 == null || bArr2 == null) {
                    this.g = new z83();
                } else {
                    this.g = new z83(this.a, bVar.b, bArr4, bArr2);
                }
            } else if (bVar.i != null) {
                int c2 = this.a.c();
                int i = (c2 + 7) / 8;
                long a2 = v93.a(bArr, 0, i);
                this.b = a2;
                if (v93.l(c2, a2)) {
                    int i2 = i + 0;
                    this.c = v93.g(bArr, i2, b2);
                    int i3 = i2 + b2;
                    this.d = v93.g(bArr, i3, b2);
                    int i4 = i3 + b2;
                    this.e = v93.g(bArr, i4, b2);
                    int i5 = i4 + b2;
                    this.f = v93.g(bArr, i5, b2);
                    int i6 = i5 + b2;
                    byte[] g2 = v93.g(bArr, i6, bArr.length - i6);
                    z83 z832 = null;
                    try {
                        z832 = (z83) v93.f(g2);
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    } catch (ClassNotFoundException e3) {
                        e3.printStackTrace();
                    }
                    z832.c(bVar.i);
                    this.g = z832;
                    return;
                }
                throw new IllegalArgumentException(C0201.m82(11907));
            } else {
                throw new NullPointerException(C0201.m82(11908));
            }
        } else {
            throw new NullPointerException(C0201.m82(11913));
        }
    }
}
