package defpackage;

import vigqyno.C0201;

/* renamed from: e93  reason: default package */
/* compiled from: KeyedHashFunctions */
public final class e93 {
    private final m63 a;
    private final int b;

    public e93(m63 m63, int i) {
        if (m63 != null) {
            this.a = m63;
            this.b = i;
            return;
        }
        throw new NullPointerException(C0201.m82(2635));
    }

    private byte[] d(int i, byte[] bArr, byte[] bArr2) {
        byte[] p = v93.p((long) i, this.b);
        this.a.b(p, 0, p.length);
        this.a.b(bArr, 0, bArr.length);
        this.a.b(bArr2, 0, bArr2.length);
        int i2 = this.b;
        byte[] bArr3 = new byte[i2];
        m63 m63 = this.a;
        if (m63 instanceof n63) {
            ((n63) m63).c(bArr3, 0, i2);
        } else {
            m63.a(bArr3, 0);
        }
        return bArr3;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.b;
        if (length != i) {
            throw new IllegalArgumentException(C0201.m82(2637));
        } else if (bArr2.length == i) {
            return d(0, bArr, bArr2);
        } else {
            throw new IllegalArgumentException(C0201.m82(2636));
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.b;
        if (length != i) {
            throw new IllegalArgumentException(C0201.m82(2639));
        } else if (bArr2.length == i * 2) {
            return d(1, bArr, bArr2);
        } else {
            throw new IllegalArgumentException(C0201.m82(2638));
        }
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.b) {
            throw new IllegalArgumentException(C0201.m82(2641));
        } else if (bArr2.length == 32) {
            return d(3, bArr, bArr2);
        } else {
            throw new IllegalArgumentException(C0201.m82(2640));
        }
    }
}
