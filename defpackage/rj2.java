package defpackage;

import java.lang.reflect.Field;

/* renamed from: rj2  reason: default package */
/* compiled from: ReflectionUtils */
public class rj2 {
    public static Object a(Object obj, String str) {
        try {
            Field b = b(obj.getClass(), str);
            if (b == null) {
                return null;
            }
            b.setAccessible(true);
            return b.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Field b(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return b(cls.getSuperclass(), str);
        } catch (Exception unused2) {
            return null;
        }
    }
}
