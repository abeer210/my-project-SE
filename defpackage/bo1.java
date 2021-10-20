package defpackage;

import java.io.IOException;

/* renamed from: bo1  reason: default package */
public abstract class bo1<T, B> {
    public abstract void a(B b, int i, long j);

    public abstract void b(B b, int i, bk1 bk1);

    public abstract void c(B b, int i, T t);

    public abstract void d(T t, xo1 xo1) throws IOException;

    public abstract boolean e(hn1 hn1);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    public final boolean f(B b, hn1 hn1) throws IOException {
        int a = hn1.a();
        int i = a >>> 3;
        int i2 = a & 7;
        if (i2 == 0) {
            a(b, i, hn1.M());
            return true;
        } else if (i2 == 1) {
            g(b, i, hn1.F());
            return true;
        } else if (i2 == 2) {
            b(b, i, hn1.u());
            return true;
        } else if (i2 == 3) {
            B n = n();
            int i3 = 4 | (i << 3);
            while (hn1.p() != Integer.MAX_VALUE && f(n, hn1)) {
                while (hn1.p() != Integer.MAX_VALUE) {
                    while (hn1.p() != Integer.MAX_VALUE) {
                    }
                }
            }
            if (i3 == hn1.a()) {
                c(b, i, o(n));
                return true;
            }
            throw sl1.e();
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                h(b, i, hn1.x());
                return true;
            }
            throw sl1.f();
        }
    }

    public abstract void g(B b, int i, long j);

    public abstract void h(B b, int i, int i2);

    public abstract void i(T t, xo1 xo1) throws IOException;

    public abstract void j(Object obj);

    public abstract void k(Object obj, T t);

    public abstract void l(Object obj, B b);

    public abstract T m(T t, T t2);

    public abstract B n();

    public abstract T o(B b);

    public abstract int p(T t);

    public abstract T q(Object obj);

    public abstract B r(Object obj);

    public abstract int s(T t);
}
