package defpackage;

import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: qu0  reason: default package */
public final class qu0 extends ou0 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    private qu0(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.e = C0188.f24;
        this.a = i2 + i;
        this.c = i;
        this.d = i;
    }

    public final int d() {
        return this.c - this.d;
    }

    public final int e(int i) throws qv0 {
        if (i >= 0) {
            int d2 = i + d();
            int i2 = this.e;
            if (d2 <= i2) {
                this.e = d2;
                int i3 = this.a + this.b;
                this.a = i3;
                int i4 = i3 - this.d;
                if (i4 > d2) {
                    int i5 = i4 - d2;
                    this.b = i5;
                    this.a = i3 - i5;
                } else {
                    this.b = 0;
                }
                return i2;
            }
            throw qv0.a();
        }
        throw new qv0(C0201.m82(10501));
    }
}
