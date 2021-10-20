package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: y60  reason: default package */
/* compiled from: SharedReference */
public class y60<T> {
    private static final Map<Object, Integer> d = new IdentityHashMap();
    private T a;
    private int b = 1;
    private final x60<T> c;

    /* renamed from: y60$a */
    /* compiled from: SharedReference */
    public static class a extends RuntimeException {
        public a() {
            super(C0201.m82(10666));
        }
    }

    public y60(T t, x60<T> x60) {
        z50.g(t);
        this.a = t;
        z50.g(x60);
        this.c = x60;
        a(t);
    }

    private static void a(Object obj) {
        synchronized (d) {
            Integer num = d.get(obj);
            if (num == null) {
                d.put(obj, 1);
            } else {
                d.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    private synchronized int c() {
        int i;
        e();
        z50.b(this.b > 0);
        i = this.b - 1;
        this.b = i;
        return i;
    }

    private void e() {
        if (!h(this)) {
            throw new a();
        }
    }

    public static boolean h(y60<?> y60) {
        return y60 != null && y60.g();
    }

    private static void i(Object obj) {
        synchronized (d) {
            Integer num = d.get(obj);
            if (num == null) {
                f60.H(C0201.m82(9876), C0201.m82(9877), obj.getClass());
            } else if (num.intValue() == 1) {
                d.remove(obj);
            } else {
                d.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public synchronized void b() {
        e();
        this.b++;
    }

    public void d() {
        T t;
        if (c() == 0) {
            synchronized (this) {
                t = this.a;
                this.a = null;
            }
            this.c.a(t);
            i(t);
        }
    }

    public synchronized T f() {
        return this.a;
    }

    public synchronized boolean g() {
        return this.b > 0;
    }
}
