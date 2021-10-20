package defpackage;

import vigqyno.C0201;

/* renamed from: w63  reason: default package */
/* compiled from: SHAKEDigest */
public class w63 extends p63 implements n63 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w63(int i) {
        super(i);
        y(i);
    }

    private static int y(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException(C0201.m82(25152) + i + C0201.m82(25153));
    }

    @Override // defpackage.m63
    public int a(byte[] bArr, int i) {
        int e = e();
        c(bArr, i, e);
        return e;
    }

    @Override // defpackage.n63
    public int c(byte[] bArr, int i, int i2) {
        z(bArr, i, i2);
        u();
        return i2;
    }

    @Override // defpackage.m63
    public String d() {
        return C0201.m82(25154) + this.e;
    }

    public int z(byte[] bArr, int i, int i2) {
        if (!this.f) {
            k(15, 4);
        }
        w(bArr, i, ((long) i2) * 8);
        return i2;
    }
}
