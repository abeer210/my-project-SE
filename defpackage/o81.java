package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: o81  reason: default package */
public abstract class o81 {
    public int a;
    public int b;
    public p81 c;

    private o81() {
        this.b = 100;
    }

    public static o81 d(byte[] bArr, int i, int i2, boolean z) {
        q81 q81 = new q81(bArr, i, i2, false);
        try {
            q81.i(i2);
            return q81;
        } catch (v91 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int l(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long m(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static o81 n(byte[] bArr, int i, int i2) {
        return d(bArr, i, i2, false);
    }

    public abstract long A() throws IOException;

    public abstract int B() throws IOException;

    public abstract long C() throws IOException;

    public abstract boolean D() throws IOException;

    public abstract int E();

    public abstract double a() throws IOException;

    public abstract float b() throws IOException;

    public abstract String c() throws IOException;

    public abstract <T extends wa1> T e(fb1<T> fb1, y81 y81) throws IOException;

    public abstract void f(int i) throws v91;

    public abstract boolean g(int i) throws IOException;

    public final int h(int i) {
        if (i >= 0) {
            int i2 = this.b;
            this.b = i;
            return i2;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append(C0201.m82(2363));
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract int i(int i) throws v91;

    public abstract void j(int i);

    public abstract void k(int i) throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract int t() throws IOException;

    public abstract boolean u() throws IOException;

    public abstract String v() throws IOException;

    public abstract c81 w() throws IOException;

    public abstract int x() throws IOException;

    public abstract int y() throws IOException;

    public abstract int z() throws IOException;
}
