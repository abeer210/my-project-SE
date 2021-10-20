package defpackage;

import vigqyno.C0201;

/* renamed from: m62  reason: default package */
/* compiled from: LuminanceSource */
public abstract class m62 {
    private final int a;
    private final int b;

    public m62(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i, byte[] bArr);

    public final int d() {
        return this.a;
    }

    public m62 e() {
        return new l62(this);
    }

    public boolean f() {
        return false;
    }

    public m62 g() {
        throw new UnsupportedOperationException(C0201.m82(12595));
    }

    public final String toString() {
        int i = this.a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.b * (i + 1));
        for (int i2 = 0; i2 < this.b; i2++) {
            bArr = c(i2, bArr);
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = bArr[i3] & 255;
                sb.append(i4 < 64 ? '#' : i4 < 128 ? '+' : i4 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
