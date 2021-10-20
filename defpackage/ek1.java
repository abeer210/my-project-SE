package defpackage;

import vigqyno.C0201;

/* renamed from: ek1  reason: default package */
public final class ek1 extends ik1 {
    private final int e;
    private final int f;

    public ek1(byte[] bArr, int i, int i2) {
        super(bArr);
        bk1.g(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.bk1, defpackage.ik1
    public final void d(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.d, t(), bArr, 0, i3);
    }

    @Override // defpackage.bk1, defpackage.ik1
    public final byte e(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.d[this.e + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(C0201.m82(39063));
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(C0201.m82(39064));
        sb2.append(i);
        sb2.append(C0201.m82(39065));
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // defpackage.bk1, defpackage.ik1
    public final int size() {
        return this.f;
    }

    @Override // defpackage.ik1
    public final int t() {
        return this.e;
    }
}
