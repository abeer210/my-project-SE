package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: hp1  reason: default package */
public abstract class hp1 {
    public volatile int a = -1;

    public static final <T extends hp1> T b(T t, byte[] bArr) throws gp1 {
        e(t, bArr, 0, bArr.length);
        return t;
    }

    public static final void d(hp1 hp1, byte[] bArr, int i, int i2) {
        try {
            zo1 v = zo1.v(bArr, 0, i2);
            hp1.c(v);
            v.r();
        } catch (IOException e) {
            throw new RuntimeException(C0201.m82(29332), e);
        }
    }

    private static final <T extends hp1> T e(T t, byte[] bArr, int i, int i2) throws gp1 {
        try {
            yo1 s = yo1.s(bArr, 0, i2);
            t.a(s);
            s.e(0);
            return t;
        } catch (gp1 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(C0201.m82(29333), e2);
        }
    }

    public abstract hp1 a(yo1 yo1) throws IOException;

    public void c(zo1 zo1) throws IOException {
    }

    public final int f() {
        int h = h();
        this.a = h;
        return h;
    }

    /* renamed from: g */
    public hp1 clone() throws CloneNotSupportedException {
        return (hp1) super.clone();
    }

    public int h() {
        return 0;
    }

    public String toString() {
        return ip1.b(this);
    }
}
