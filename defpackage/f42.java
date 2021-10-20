package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import vigqyno.C0201;

/* renamed from: f42  reason: default package */
/* compiled from: UnsafeReflectionAccessor */
public final class f42 extends e42 {
    private static Class d;
    private final Object b = d();
    private final Field c = c();

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField(C0201.m82(24147));
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName(C0201.m82(24148));
            d = cls;
            Field declaredField = cls.getDeclaredField(C0201.m82(24149));
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.e42
    public void b(AccessibleObject accessibleObject) {
        if (!e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new p22(C0201.m82(24150) + accessibleObject + C0201.m82(24151), e);
            }
        }
    }

    public boolean e(AccessibleObject accessibleObject) {
        if (!(this.b == null || this.c == null)) {
            try {
                long longValue = ((Long) d.getMethod(C0201.m82(24152), Field.class).invoke(this.b, this.c)).longValue();
                d.getMethod(C0201.m82(24153), Object.class, Long.TYPE, Boolean.TYPE).invoke(this.b, accessibleObject, Long.valueOf(longValue), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
