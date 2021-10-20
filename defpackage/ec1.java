package defpackage;

import java.io.IOException;

/* renamed from: ec1  reason: default package */
public abstract class ec1<T, B> {
    public abstract void a(B b, int i, long j);

    public abstract void b(B b, int i, c81 c81);

    public abstract void c(B b, int i, T t);

    public abstract void d(T t, cd1 cd1) throws IOException;

    public abstract boolean e(mb1 mb1);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    public final boolean f(B b, mb1 mb1) throws IOException {
        int a = mb1.a();
        int i = a >>> 3;
        int i2 = a & 7;
        if (i2 == 0) {
            a(b, i, mb1.F());
            return true;
        } else if (i2 == 1) {
            g(b, i, mb1.v());
            return true;
        } else if (i2 == 2) {
            b(b, i, mb1.L());
            return true;
        } else if (i2 == 3) {
            B p = p();
            int i3 = 4 | (i << 3);
            while (mb1.H() != Integer.MAX_VALUE && f(p, mb1)) {
                while (mb1.H() != Integer.MAX_VALUE) {
                    while (mb1.H() != Integer.MAX_VALUE) {
                    }
                }
            }
            if (i3 == mb1.a()) {
                c(b, i, n(p));
                return true;
            }
            throw v91.f();
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                h(b, i, mb1.s());
                return true;
            }
            throw v91.g();
        }
    }

    public abstract void g(B b, int i, long j);

    public abstract void h(B b, int i, int i2);

    public abstract void i(T t, cd1 cd1) throws IOException;

    public abstract void j(Object obj, T t);

    public abstract void k(Object obj, B b);

    public abstract T l(T t, T t2);

    public abstract void m(Object obj);

    public abstract T n(B b);

    public abstract int o(T t);

    public abstract B p();

    public abstract T q(Object obj);

    public abstract B r(Object obj);

    public abstract int s(T t);
}
