package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: ga3  reason: default package */
/* compiled from: BCRainbowPrivateKey */
public class ga3 implements PrivateKey {
    private short[][] a;
    private short[] b;
    private short[][] c;
    private short[] d;
    private u83[] e;
    private int[] f;

    public ga3(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, u83[] u83Arr) {
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
        this.d = sArr4;
        this.f = iArr;
        this.e = u83Arr;
    }

    public short[] a() {
        return this.b;
    }

    public short[] b() {
        return this.d;
    }

    public short[][] c() {
        return this.a;
    }

    public short[][] d() {
        return this.c;
    }

    public u83[] e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ga3)) {
            return false;
        }
        ga3 ga3 = (ga3) obj;
        boolean z = ((((v83.j(this.a, ga3.c())) && v83.j(this.c, ga3.d())) && v83.i(this.b, ga3.a())) && v83.i(this.d, ga3.b())) && Arrays.equals(this.f, ga3.f());
        if (this.e.length != ga3.e().length) {
            return false;
        }
        for (int length = this.e.length - 1; length >= 0; length--) {
            z &= this.e[length].equals(ga3.e()[length]);
        }
        return z;
    }

    public int[] f() {
        return this.f;
    }

    public final String getAlgorithm() {
        return C0201.m82(36039);
    }

    public byte[] getEncoded() {
        try {
            return new e43(new o43(c83.a, y13.a), new d83(this.a, this.b, this.c, this.d, this.f, this.e)).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(36040);
    }

    public int hashCode() {
        int length = (((((((((this.e.length * 37) + hb3.l(this.a)) * 37) + hb3.k(this.b)) * 37) + hb3.l(this.c)) * 37) + hb3.k(this.d)) * 37) + hb3.j(this.f);
        for (int length2 = this.e.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.e[length2].hashCode();
        }
        return length;
    }

    public ga3(ua3 ua3) {
        this(ua3.c(), ua3.a(), ua3.d(), ua3.b(), ua3.f(), ua3.e());
    }
}
