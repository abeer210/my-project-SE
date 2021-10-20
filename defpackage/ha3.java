package defpackage;

import java.security.PublicKey;
import vigqyno.C0201;

/* renamed from: ha3  reason: default package */
/* compiled from: BCRainbowPublicKey */
public class ha3 implements PublicKey {
    private short[][] a;
    private short[][] b;
    private short[] c;
    private int d;

    public ha3(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.d = i;
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
    }

    public short[][] a() {
        return this.a;
    }

    public short[] b() {
        return hb3.e(this.c);
    }

    public short[][] c() {
        short[][] sArr = new short[this.b.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.b;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = hb3.e(sArr2[i]);
            i++;
        }
    }

    public int d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ha3)) {
            return false;
        }
        ha3 ha3 = (ha3) obj;
        if (this.d != ha3.d() || !v83.j(this.a, ha3.a()) || !v83.j(this.b, ha3.c()) || !v83.i(this.c, ha3.b())) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return C0201.m82(33783);
    }

    public byte[] getEncoded() {
        return ma3.a(new o43(c83.a, y13.a), new e83(this.d, this.a, this.b, this.c));
    }

    public String getFormat() {
        return C0201.m82(33784);
    }

    public int hashCode() {
        return (((((this.d * 37) + hb3.l(this.a)) * 37) + hb3.l(this.b)) * 37) + hb3.k(this.c);
    }

    public ha3(va3 va3) {
        this(va3.d(), va3.a(), va3.c(), va3.b());
    }
}
