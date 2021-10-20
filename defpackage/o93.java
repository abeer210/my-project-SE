package defpackage;

import vigqyno.C0201;

/* renamed from: o93  reason: default package */
/* compiled from: XMSSMTPublicKeyParameters */
public final class o93 extends z63 {
    private final m93 a;
    private final byte[] b;
    private final byte[] c;

    /* renamed from: o93$b */
    /* compiled from: XMSSMTPublicKeyParameters */
    public static class b {
        private final m93 a;
        private byte[] b = null;
        private byte[] c = null;
        private byte[] d = null;

        public b(m93 m93) {
            this.a = m93;
        }

        public o93 e() {
            return new o93(this);
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

    public m93 a() {
        return this.a;
    }

    public byte[] b() {
        return v93.c(this.c);
    }

    public byte[] c() {
        return v93.c(this.b);
    }

    public byte[] d() {
        int b2 = this.a.b();
        byte[] bArr = new byte[(b2 + b2)];
        v93.e(bArr, this.b, 0);
        v93.e(bArr, this.c, b2 + 0);
        return bArr;
    }

    private o93(b bVar) {
        super(false);
        m93 m93 = bVar.a;
        this.a = m93;
        if (m93 != null) {
            int b2 = m93.b();
            byte[] bArr = bVar.d;
            if (bArr != null) {
                if (bArr.length == b2 + b2) {
                    this.b = v93.g(bArr, 0, b2);
                    this.c = v93.g(bArr, b2 + 0, b2);
                    return;
                }
                throw new IllegalArgumentException(C0201.m82(9909));
            }
            byte[] bArr2 = bVar.b;
            if (bArr2 == null) {
                this.b = new byte[b2];
            } else if (bArr2.length == b2) {
                this.b = bArr2;
            } else {
                throw new IllegalArgumentException(C0201.m82(9910));
            }
            byte[] bArr3 = bVar.c;
            if (bArr3 == null) {
                this.c = new byte[b2];
            } else if (bArr3.length == b2) {
                this.c = bArr3;
            } else {
                throw new IllegalArgumentException(C0201.m82(9911));
            }
        } else {
            throw new NullPointerException(C0201.m82(9912));
        }
    }
}
