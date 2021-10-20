package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: dz0  reason: default package */
public class dz0 {
    public volatile int a = -1;

    public static final void b(dz0 dz0, byte[] bArr, int i, int i2) {
        try {
            wy0 t = wy0.t(bArr, 0, i2);
            dz0.a(t);
            t.p();
        } catch (IOException e) {
            throw new RuntimeException(C0201.m82(35997), e);
        }
    }

    public void a(wy0 wy0) throws IOException {
    }

    public final int c() {
        int d = d();
        this.a = d;
        return d;
    }

    public int d() {
        return 0;
    }

    /* renamed from: e */
    public dz0 clone() throws CloneNotSupportedException {
        return (dz0) super.clone();
    }

    public String toString() {
        return fz0.a(this);
    }
}
