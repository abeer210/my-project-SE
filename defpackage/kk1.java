package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: kk1  reason: default package */
public abstract class kk1 {
    public int a;
    public int b;
    public ok1 c;

    private kk1() {
        this.b = 100;
    }

    public static kk1 E(byte[] bArr, int i, int i2) {
        return d(bArr, i, i2, false);
    }

    public static kk1 F(byte[] bArr) {
        return d(bArr, 0, bArr.length, false);
    }

    private static kk1 d(byte[] bArr, int i, int i2, boolean z) {
        nk1 nk1 = new nk1(bArr, i, i2, false);
        try {
            nk1.i(i2);
            return nk1;
        } catch (sl1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int l(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long y(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract int C() throws IOException;

    public abstract int D();

    public abstract double a() throws IOException;

    public abstract float b() throws IOException;

    public abstract String c() throws IOException;

    public abstract <T extends tm1> T e(dn1<T> dn1, wk1 wk1) throws IOException;

    public abstract void f(int i) throws sl1;

    public abstract boolean g(int i) throws IOException;

    public final int h(int i) {
        if (i >= 0) {
            int i2 = this.b;
            this.b = i;
            return i2;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append(C0201.m82(31035));
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract int i(int i) throws sl1;

    public abstract void j(int i);

    public abstract void k(int i) throws IOException;

    public abstract boolean m() throws IOException;

    public abstract long n() throws IOException;

    public abstract long o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract boolean s() throws IOException;

    public abstract String t() throws IOException;

    public abstract bk1 u() throws IOException;

    public abstract int v() throws IOException;

    public abstract int w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long z() throws IOException;
}
