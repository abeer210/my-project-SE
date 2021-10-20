package defpackage;

import vigqyno.C0201;

/* renamed from: iu0  reason: default package */
public final class iu0 extends mu0 {
    private final int e;
    private final int f;

    public iu0(byte[] bArr, int i, int i2) {
        super(bArr);
        fu0.g(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.fu0, defpackage.mu0
    public final byte k(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.d[this.e + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(C0201.m82(33686));
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(C0201.m82(33687));
        sb2.append(i);
        sb2.append(C0201.m82(33688));
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // defpackage.mu0
    public final int q() {
        return this.e;
    }

    @Override // defpackage.fu0, defpackage.mu0
    public final int size() {
        return this.f;
    }
}
