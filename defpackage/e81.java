package defpackage;

import vigqyno.C0201;

/* renamed from: e81  reason: default package */
public final class e81 extends l81 {
    private final int e;
    private final int f;

    public e81(byte[] bArr, int i, int i2) {
        super(bArr);
        c81.i(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.l81, defpackage.c81
    public final byte e(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.d[this.e + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(C0201.m82(34854));
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(C0201.m82(34855));
        sb2.append(i);
        sb2.append(C0201.m82(34856));
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // defpackage.l81, defpackage.c81
    public final byte f(int i) {
        return this.d[this.e + i];
    }

    @Override // defpackage.l81
    public final int s() {
        return this.e;
    }

    @Override // defpackage.l81, defpackage.c81
    public final int size() {
        return this.f;
    }
}
