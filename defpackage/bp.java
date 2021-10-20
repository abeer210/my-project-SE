package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bp  reason: default package */
/* compiled from: LruCache */
public class bp<T, Y> {
    private final Map<T, Y> a = new LinkedHashMap(100, 0.75f, true);
    private long b;
    private long c;

    public bp(long j) {
        this.b = j;
    }

    private void f() {
        m(this.b);
    }

    public void b() {
        m(0);
    }

    public synchronized Y g(T t) {
        return this.a.get(t);
    }

    public synchronized long h() {
        return this.b;
    }

    public int i(Y y) {
        return 1;
    }

    public void j(T t, Y y) {
    }

    public synchronized Y k(T t, Y y) {
        long i = (long) i(y);
        if (i >= this.b) {
            j(t, y);
            return null;
        }
        if (y != null) {
            this.c += i;
        }
        Y put = this.a.put(t, y);
        if (put != null) {
            this.c -= (long) i(put);
            if (!put.equals(y)) {
                j(t, put);
            }
        }
        f();
        return put;
    }

    public synchronized Y l(T t) {
        Y remove;
        remove = this.a.remove(t);
        if (remove != null) {
            this.c -= (long) i(remove);
        }
        return remove;
    }

    public synchronized void m(long j) {
        while (this.c > j) {
            Iterator<Map.Entry<T, Y>> it = this.a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.c -= (long) i(value);
            T key = next.getKey();
            it.remove();
            j(key, value);
        }
    }
}
