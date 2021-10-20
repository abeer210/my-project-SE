package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vigqyno.C0201;

/* renamed from: dx0  reason: default package */
public final class dx0 {
    private static final dx0 c = new dx0();
    private final jx0 a;
    private final ConcurrentMap<Class<?>, ix0<?>> b = new ConcurrentHashMap();

    private dx0() {
        String[] strArr = {C0201.m82(32047)};
        jx0 jx0 = null;
        for (int i = 0; i <= 0; i++) {
            jx0 = c(strArr[0]);
            if (jx0 != null) {
                break;
            }
        }
        this.a = jx0 == null ? new fw0() : jx0;
    }

    public static dx0 a() {
        return c;
    }

    private static jx0 c(String str) {
        try {
            return (jx0) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> ix0<T> b(Class<T> cls) {
        String r0 = C0201.m82(32048);
        mv0.e(cls, r0);
        ix0<T> ix0 = (ix0<T>) this.b.get(cls);
        if (ix0 != null) {
            return ix0;
        }
        ix0<T> a2 = this.a.a(cls);
        mv0.e(cls, r0);
        mv0.e(a2, C0201.m82(32049));
        ix0<T> ix02 = (ix0<T>) this.b.putIfAbsent(cls, a2);
        return ix02 != null ? ix02 : a2;
    }

    public final <T> ix0<T> d(T t) {
        return b(t.getClass());
    }
}
