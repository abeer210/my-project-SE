package defpackage;

/* renamed from: i83  reason: default package */
/* compiled from: XMSSMTPrivateKey */
public class i83 extends o03 {
    private final int a;
    private final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;

    public i83(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = i;
        this.b = hb3.d(bArr);
        this.c = hb3.d(bArr2);
        this.d = hb3.d(bArr3);
        this.e = hb3.d(bArr4);
        this.f = hb3.d(bArr5);
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(new m03(0));
        h03 h032 = new h03();
        h032.a(new m03((long) this.a));
        h032.a(new a23(this.b));
        h032.a(new a23(this.c));
        h032.a(new a23(this.d));
        h032.a(new a23(this.e));
        h03.a(new e23(h032));
        h03.a(new j23(true, 0, new a23(this.f)));
        return new e23(h03);
    }
}
