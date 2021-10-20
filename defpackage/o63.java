package defpackage;

/* renamed from: o63  reason: default package */
/* compiled from: GeneralDigest */
public abstract class o63 implements m63 {
    private final byte[] a = new byte[4];
    private int b = 0;
    private long c;

    @Override // defpackage.m63
    public void b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.a;
                int i5 = this.b;
                int i6 = i5 + 1;
                this.b = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    i(bArr2, 0);
                    this.b = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((max - i3) & -4) + i3;
        while (i3 < i8) {
            i(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.c += (long) max;
    }

    public void f() {
        long j = this.c << 3;
        k(Byte.MIN_VALUE);
        while (this.b != 0) {
            k((byte) 0);
        }
        h(j);
        g();
    }

    public abstract void g();

    public abstract void h(long j);

    public abstract void i(byte[] bArr, int i);

    public void j() {
        this.c = 0;
        this.b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public void k(byte b2) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b2;
        if (i2 == bArr.length) {
            i(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }
}
