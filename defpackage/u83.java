package defpackage;

/* renamed from: u83  reason: default package */
/* compiled from: Layer */
public class u83 {
    private int a;
    private int b;
    private int c;
    private short[][][] d;
    private short[][][] e;
    private short[][] f;
    private short[] g;

    public u83(byte b2, byte b3, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i = b2 & 255;
        this.a = i;
        int i2 = b3 & 255;
        this.b = i2;
        this.c = i2 - i;
        this.d = sArr;
        this.e = sArr2;
        this.f = sArr3;
        this.g = sArr4;
    }

    public short[][][] a() {
        return this.d;
    }

    public short[][][] b() {
        return this.e;
    }

    public short[] c() {
        return this.g;
    }

    public short[][] d() {
        return this.f;
    }

    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u83)) {
            return false;
        }
        u83 u83 = (u83) obj;
        if (this.a != u83.f() || this.b != u83.g() || this.c != u83.e() || !v83.k(this.d, u83.a()) || !v83.k(this.e, u83.b()) || !v83.j(this.f, u83.d()) || !v83.i(this.g, u83.c())) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((this.a * 37) + this.b) * 37) + this.c) * 37) + hb3.m(this.d)) * 37) + hb3.m(this.e)) * 37) + hb3.l(this.f)) * 37) + hb3.k(this.g);
    }
}
