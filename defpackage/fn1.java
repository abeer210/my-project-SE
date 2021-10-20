package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vigqyno.C0201;

/* renamed from: fn1  reason: default package */
public final class fn1 {
    private static final fn1 c = new fn1();
    private final jn1 a;
    private final ConcurrentMap<Class<?>, in1<?>> b = new ConcurrentHashMap();

    private fn1() {
        String[] strArr = {C0201.m82(38878)};
        jn1 jn1 = null;
        for (int i = 0; i <= 0; i++) {
            jn1 = c(strArr[0]);
            if (jn1 != null) {
                break;
            }
        }
        this.a = jn1 == null ? new hm1() : jn1;
    }

    public static fn1 b() {
        return c;
    }

    private static jn1 c(String str) {
        try {
            return (jn1) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> in1<T> a(Class<T> cls) {
        String r0 = C0201.m82(38879);
        nl1.e(cls, r0);
        in1<T> in1 = (in1<T>) this.b.get(cls);
        if (in1 != null) {
            return in1;
        }
        in1<T> a2 = this.a.a(cls);
        nl1.e(cls, r0);
        nl1.e(a2, C0201.m82(38880));
        in1<T> in12 = (in1<T>) this.b.putIfAbsent(cls, a2);
        return in12 != null ? in12 : a2;
    }

    public final <T> in1<T> d(T t) {
        return a(t.getClass());
    }
}
