package defpackage;

import vigqyno.C0201;

/* renamed from: jf0  reason: default package */
/* compiled from: BaseConsumer */
public abstract class jf0<T> implements sf0<T> {
    private boolean a = false;

    public static boolean e(int i) {
        return (i & 1) == 1;
    }

    public static boolean f(int i) {
        return !e(i);
    }

    public static int l(boolean z) {
        return z ? 1 : 0;
    }

    public static boolean m(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean n(int i, int i2) {
        return (i & i2) == i2;
    }

    public static int o(int i, int i2) {
        return i & (i2 ^ -1);
    }

    @Override // defpackage.sf0
    public synchronized void a(Throwable th) {
        if (!this.a) {
            this.a = true;
            try {
                h(th);
            } catch (Exception e) {
                k(e);
            }
        }
    }

    @Override // defpackage.sf0
    public synchronized void b() {
        if (!this.a) {
            this.a = true;
            try {
                g();
            } catch (Exception e) {
                k(e);
            }
        }
    }

    @Override // defpackage.sf0
    public synchronized void c(float f) {
        if (!this.a) {
            try {
                j(f);
            } catch (Exception e) {
                k(e);
            }
        }
    }

    @Override // defpackage.sf0
    public synchronized void d(T t, int i) {
        if (!this.a) {
            this.a = e(i);
            try {
                i(t, i);
            } catch (Exception e) {
                k(e);
            }
        }
    }

    public abstract void g();

    public abstract void h(Throwable th);

    public abstract void i(T t, int i);

    public abstract void j(float f);

    public void k(Exception exc) {
        f60.E(getClass(), C0201.m82(27407), exc);
    }
}
