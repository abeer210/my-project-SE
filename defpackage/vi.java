package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import vigqyno.C0201;

/* renamed from: vi  reason: default package */
/* compiled from: LruArrayPool */
public final class vi implements ni {
    private final ti<a, Object> a = new ti<>();
    private final b b = new b();
    private final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
    private final Map<Class<?>, mi<?>> d = new HashMap();
    private final int e;
    private int f;

    /* access modifiers changed from: private */
    /* renamed from: vi$a */
    /* compiled from: LruArrayPool */
    public static final class a implements yi {
        private final b a;
        public int b;
        private Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.yi
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Class<?> cls) {
            this.b = i;
            this.c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return C0201.m82(35728) + this.b + C0201.m82(35729) + this.c + '}';
        }
    }

    /* renamed from: vi$b */
    /* compiled from: LruArrayPool */
    private static final class b extends pi<a> {
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i, Class<?> cls) {
            a aVar = (a) b();
            aVar.b(i, cls);
            return aVar;
        }
    }

    public vi(int i) {
        this.e = i;
    }

    private void f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> m = m(cls);
        Integer num = (Integer) m.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException(C0201.m82(12779) + i + C0201.m82(12780) + this);
        } else if (num.intValue() == 1) {
            m.remove(Integer.valueOf(i));
        } else {
            m.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    private void g() {
        h(this.e);
    }

    private void h(int i) {
        while (this.f > i) {
            Object f2 = this.a.f();
            ep.d(f2);
            mi i2 = i(f2);
            this.f -= i2.c(f2) * i2.b();
            f(i2.c(f2), f2.getClass());
            if (Log.isLoggable(i2.a(), 2)) {
                Log.v(i2.a(), C0201.m82(12781) + i2.c(f2));
            }
        }
    }

    private <T> mi<T> i(T t) {
        return j(t.getClass());
    }

    private <T> mi<T> j(Class<T> cls) {
        si siVar = (mi<T>) this.d.get(cls);
        if (siVar == null) {
            if (cls.equals(int[].class)) {
                siVar = new ui();
            } else if (cls.equals(byte[].class)) {
                siVar = new si();
            } else {
                throw new IllegalArgumentException(C0201.m82(12782) + cls.getSimpleName());
            }
            this.d.put(cls, siVar);
        }
        return siVar;
    }

    private <T> T k(a aVar) {
        return (T) this.a.a(aVar);
    }

    private <T> T l(a aVar, Class<T> cls) {
        mi<T> j = j(cls);
        T t = (T) k(aVar);
        if (t != null) {
            this.f -= j.c(t) * j.b();
            f(j.c(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(j.a(), 2)) {
            Log.v(j.a(), C0201.m82(12783) + aVar.b + C0201.m82(12784));
        }
        return j.newArray(aVar.b);
    }

    private NavigableMap<Integer, Integer> m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    private boolean n() {
        int i = this.f;
        return i == 0 || this.e / i >= 2;
    }

    private boolean o(int i) {
        return i <= this.e / 2;
    }

    private boolean p(int i, Integer num) {
        return num != null && (n() || num.intValue() <= i * 8);
    }

    @Override // defpackage.ni
    public synchronized void a(int i) {
        if (i >= 40) {
            try {
                b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            h(this.e / 2);
        }
    }

    @Override // defpackage.ni
    public synchronized void b() {
        h(0);
    }

    @Override // defpackage.ni
    public synchronized <T> void c(T t) {
        Class<?> cls = t.getClass();
        mi<T> j = j(cls);
        int c2 = j.c(t);
        int b2 = j.b() * c2;
        if (o(b2)) {
            a e2 = this.b.e(c2, cls);
            this.a.d(e2, t);
            NavigableMap<Integer, Integer> m = m(cls);
            Integer num = (Integer) m.get(Integer.valueOf(e2.b));
            Integer valueOf = Integer.valueOf(e2.b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m.put(valueOf, Integer.valueOf(i));
            this.f += b2;
            g();
        }
    }

    @Override // defpackage.ni
    public synchronized <T> T d(int i, Class<T> cls) {
        return (T) l(this.b.e(i, cls), cls);
    }

    @Override // defpackage.ni
    public synchronized <T> T e(int i, Class<T> cls) {
        a aVar;
        Integer ceilingKey = m(cls).ceilingKey(Integer.valueOf(i));
        if (p(i, ceilingKey)) {
            aVar = this.b.e(ceilingKey.intValue(), cls);
        } else {
            aVar = this.b.e(i, cls);
        }
        return (T) l(aVar, cls);
    }
}
