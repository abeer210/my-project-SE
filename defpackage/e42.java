package defpackage;

import java.lang.reflect.AccessibleObject;

/* renamed from: e42  reason: default package */
/* compiled from: ReflectionAccessor */
public abstract class e42 {
    private static final e42 a = (i32.c() < 9 ? new d42() : new f42());

    public static e42 a() {
        return a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
