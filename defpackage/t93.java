package defpackage;

import defpackage.g93;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: t93  reason: default package */
/* compiled from: XMSSPrivateKeyParameters */
public final class t93 extends z63 {
    private final s93 a;
    private final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final y83 f;

    /* renamed from: t93$b */
    /* compiled from: XMSSPrivateKeyParameters */
    public static class b {
        private final s93 a;
        private int b = 0;
        private byte[] c = null;
        private byte[] d = null;
        private byte[] e = null;
        private byte[] f = null;
        private y83 g = null;
        private byte[] h = null;
        private s93 i = null;

        public b(s93 s93) {
            this.a = s93;
        }

        public t93 j() {
            return new t93(this);
        }

        public b k(y83 y83) {
            this.g = y83;
            return this;
        }

        public b l(int i2) {
            this.b = i2;
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

    public s93 a() {
        return this.a;
    }

    public byte[] b() {
        int c2 = this.a.c();
        byte[] bArr = new byte[(c2 + 4 + c2 + c2 + c2)];
        jb3.c(this.f.b(), bArr, 0);
        v93.e(bArr, this.b, 4);
        int i = 4 + c2;
        v93.e(bArr, this.c, i);
        int i2 = i + c2;
        v93.e(bArr, this.d, i2);
        v93.e(bArr, this.e, i2 + c2);
        try {
            return hb3.f(bArr, v93.o(this.f));
        } catch (IOException e2) {
            throw new RuntimeException(C0201.m82(13677) + e2.getMessage());
        }
    }

    private t93(b bVar) {
        super(true);
        s93 s93 = bVar.a;
        this.a = s93;
        if (s93 != null) {
            int c2 = s93.c();
            byte[] bArr = bVar.h;
            if (bArr == null) {
                byte[] bArr2 = bVar.c;
                if (bArr2 == null) {
                    this.b = new byte[c2];
                } else if (bArr2.length == c2) {
                    this.b = bArr2;
                } else {
                    throw new IllegalArgumentException(C0201.m82(13672));
                }
                byte[] bArr3 = bVar.d;
                if (bArr3 == null) {
                    this.c = new byte[c2];
                } else if (bArr3.length == c2) {
                    this.c = bArr3;
                } else {
                    throw new IllegalArgumentException(C0201.m82(13673));
                }
                byte[] bArr4 = bVar.e;
                if (bArr4 == null) {
                    this.d = new byte[c2];
                } else if (bArr4.length == c2) {
                    this.d = bArr4;
                } else {
                    throw new IllegalArgumentException(C0201.m82(13674));
                }
                byte[] bArr5 = bVar.f;
                if (bArr5 == null) {
                    this.e = new byte[c2];
                } else if (bArr5.length == c2) {
                    this.e = bArr5;
                } else {
                    throw new IllegalArgumentException(C0201.m82(13675));
                }
                y83 y83 = bVar.g;
                if (y83 != null) {
                    this.f = y83;
                } else if (bVar.b >= (1 << this.a.d()) - 2 || bArr4 == null || bArr2 == null) {
                    this.f = new y83(this.a, bVar.b);
                } else {
                    this.f = new y83(this.a, bArr4, bArr2, (g93) new g93.b().l(), bVar.b);
                }
            } else if (bVar.i != null) {
                int d2 = this.a.d();
                int a2 = jb3.a(bArr, 0);
                if (v93.l(d2, (long) a2)) {
                    this.b = v93.g(bArr, 4, c2);
                    int i = 4 + c2;
                    this.c = v93.g(bArr, i, c2);
                    int i2 = i + c2;
                    this.d = v93.g(bArr, i2, c2);
                    int i3 = i2 + c2;
                    this.e = v93.g(bArr, i3, c2);
                    int i4 = i3 + c2;
                    y83 y832 = null;
                    try {
                        y832 = (y83) v93.f(v93.g(bArr, i4, bArr.length - i4));
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    } catch (ClassNotFoundException e3) {
                        e3.printStackTrace();
                    }
                    y832.f(bVar.i);
                    y832.g();
                    if (y832.b() == a2) {
                        this.f = y832;
                        return;
                    }
                    throw new IllegalStateException(C0201.m82(13669));
                }
                throw new IllegalArgumentException(C0201.m82(13670));
            } else {
                throw new NullPointerException(C0201.m82(13671));
            }
        } else {
            throw new NullPointerException(C0201.m82(13676));
        }
    }
}
