package defpackage;

/* renamed from: jk1  reason: default package */
public final class jk1 implements fk1 {
    private jk1() {
    }

    @Override // defpackage.fk1
    public final byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public /* synthetic */ jk1(ck1 ck1) {
        this();
    }
}
