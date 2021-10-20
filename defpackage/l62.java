package defpackage;

/* renamed from: l62  reason: default package */
/* compiled from: InvertedLuminanceSource */
public final class l62 extends m62 {
    private final m62 c;

    public l62(m62 m62) {
        super(m62.d(), m62.a());
        this.c = m62;
    }

    @Override // defpackage.m62
    public byte[] b() {
        byte[] b = this.c.b();
        int d = d() * a();
        byte[] bArr = new byte[d];
        for (int i = 0; i < d; i++) {
            bArr[i] = (byte) (255 - (b[i] & 255));
        }
        return bArr;
    }

    @Override // defpackage.m62
    public byte[] c(int i, byte[] bArr) {
        byte[] c2 = this.c.c(i, bArr);
        int d = d();
        for (int i2 = 0; i2 < d; i2++) {
            c2[i2] = (byte) (255 - (c2[i2] & 255));
        }
        return c2;
    }

    @Override // defpackage.m62
    public m62 e() {
        return this.c;
    }

    @Override // defpackage.m62
    public boolean f() {
        return this.c.f();
    }

    @Override // defpackage.m62
    public m62 g() {
        return new l62(this.c.g());
    }
}
