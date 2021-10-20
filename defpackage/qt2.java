package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.security.Security;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: qt2  reason: default package */
/* compiled from: SecurityHandlerFactory */
public final class qt2 {
    public static final qt2 c = new qt2();
    private final Map<String, Class<? extends pt2>> a = new HashMap();
    private final Map<Class<? extends kt2>, Class<? extends pt2>> b = new HashMap();

    static {
        Security.addProvider(new l73());
    }

    private qt2() {
        c(C0201.m82(13513), tt2.class, st2.class);
        c(C0201.m82(13514), nt2.class, mt2.class);
    }

    private pt2 a(Class<? extends pt2> cls, Class<?>[] clsArr, Object[] objArr) {
        try {
            return (pt2) cls.getDeclaredConstructor(clsArr).newInstance(objArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public pt2 b(String str) {
        Class<? extends pt2> cls = this.a.get(str);
        if (cls == null) {
            return null;
        }
        return a(cls, new Class[0], new Object[0]);
    }

    public void c(String str, Class<? extends pt2> cls, Class<? extends kt2> cls2) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, cls);
            this.b.put(cls2, cls);
            return;
        }
        throw new IllegalStateException(C0201.m82(13515));
    }
}
