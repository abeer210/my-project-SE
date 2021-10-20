package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: v0  reason: default package */
/* compiled from: LruCache */
public class v0<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public v0(int i) {
        if (i > 0) {
            this.c = i;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(8176));
    }

    private int e(K k, V v) {
        int f2 = f(k, v);
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException(C0201.m82(8177) + ((Object) k) + C0201.m82(8178) + ((Object) v));
    }

    public V a(K k) {
        return null;
    }

    public void b(boolean z, K k, V v, V v2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.e++;
        r1 = r5.a.put(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r5.a.put(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r5.b += e(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        b(false, r6, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        g(r5.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return r0;
     */
    public final V c(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.a.get(k);
                if (v != null) {
                    this.g++;
                    return v;
                }
                this.h++;
            }
        } else {
            throw new NullPointerException(C0201.m82(8179));
        }
    }

    public final V d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException(C0201.m82(8180));
        }
        synchronized (this) {
            this.d++;
            this.b += e(k, v);
            put = this.a.put(k, v);
            if (put != null) {
                this.b -= e(k, put);
            }
        }
        if (put != null) {
            b(false, k, put, v);
        }
        g(this.c);
        return put;
    }

    public int f(K k, V v) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + vigqyno.C0201.m82(8181));
     */
    public void g(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                } else if (this.b <= i) {
                    break;
                } else if (this.a.isEmpty()) {
                    break;
                } else {
                    Map.Entry<K, V> next = this.a.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.a.remove(key);
                    this.b -= e(key, value);
                    this.f++;
                }
            }
            b(true, key, value, null);
        }
    }

    public final synchronized String toString() {
        int i;
        i = this.g + this.h;
        return String.format(Locale.US, C0201.m82(8182), Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i != 0 ? (this.g * 100) / i : 0));
    }
}
