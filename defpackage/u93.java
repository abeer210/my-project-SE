package defpackage;

import vigqyno.C0201;

/* renamed from: u93  reason: default package */
/* compiled from: XMSSPublicKeyParameters */
public final class u93 extends z63 {
    private final s93 a;
    private final byte[] b;
    private final byte[] c;

    /* renamed from: u93$b */
    /* compiled from: XMSSPublicKeyParameters */
    public static class b {
        private final s93 a;
        private byte[] b = null;
        private byte[] c = null;
        private byte[] d = null;

        public b(s93 s93) {
            this.a = s93;
        }

        public u93 e() {
            return new u93(this);
        }

        public b f(byte[] bArr) {
            this.c = v93.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.b = v93.c(bArr);
            return this;
        }
    }

    public s93 a() {
        return this.a;
    }

    public byte[] b() {
        return v93.c(this.c);
    }

    public byte[] c() {
        return v93.c(this.b);
    }

    public byte[] d() {
        int c2 = this.a.c();
        byte[] bArr = new byte[(c2 + c2)];
        v93.e(bArr, this.b, 0);
        v93.e(bArr, this.c, c2 + 0);
        return bArr;
    }

    private u93(b bVar) {
        super(false);
        s93 s93 = bVar.a;
        this.a = s93;
        if (s93 != null) {
            int c2 = s93.c();
            byte[] bArr = bVar.d;
            if (bArr != null) {
                if (bArr.length == c2 + c2) {
                    this.b = v93.g(bArr, 0, c2);
                    this.c = v93.g(bArr, c2 + 0, c2);
                    return;
                }
                throw new IllegalArgumentException(C0201.m82(1763));
            }
            byte[] bArr2 = bVar.b;
            if (bArr2 == null) {
                this.b = new byte[c2];
            } else if (bArr2.length == c2) {
                this.b = bArr2;
            } else {
                throw new IllegalArgumentException(C0201.m82(1764));
            }
            byte[] bArr3 = bVar.c;
            if (bArr3 == null) {
                this.c = new byte[c2];
            } else if (bArr3.length == c2) {
                this.c = bArr3;
            } else {
                throw new IllegalArgumentException(C0201.m82(1765));
            }
        } else {
            throw new NullPointerException(C0201.m82(1766));
        }
    }
}
