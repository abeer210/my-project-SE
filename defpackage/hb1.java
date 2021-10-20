package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vigqyno.C0201;

/* renamed from: hb1  reason: default package */
public final class hb1 {
    private static final hb1 c = new hb1();
    private final pb1 a = new ia1();
    private final ConcurrentMap<Class<?>, lb1<?>> b = new ConcurrentHashMap();

    private hb1() {
    }

    public static hb1 b() {
        return c;
    }

    public final <T> lb1<T> a(Class<T> cls) {
        String r0 = C0201.m82(31367);
        m91.e(cls, r0);
        lb1<T> lb1 = (lb1<T>) this.b.get(cls);
        if (lb1 != null) {
            return lb1;
        }
        lb1<T> a2 = this.a.a(cls);
        m91.e(cls, r0);
        m91.e(a2, C0201.m82(31368));
        lb1<T> lb12 = (lb1<T>) this.b.putIfAbsent(cls, a2);
        return lb12 != null ? lb12 : a2;
    }

    public final <T> lb1<T> c(T t) {
        return a(t.getClass());
    }
}
