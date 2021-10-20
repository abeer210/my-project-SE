package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import vigqyno.C0201;

/* renamed from: p32  reason: default package */
/* compiled from: UnsafeAllocator */
public abstract class p32 {

    /* renamed from: p32$a */
    /* compiled from: UnsafeAllocator */
    static class a extends p32 {
        public final /* synthetic */ Method a;
        public final /* synthetic */ Object b;

        public a(Method method, Object obj) {
            this.a = method;
            this.b = obj;
        }

        @Override // defpackage.p32
        public <T> T c(Class<T> cls) throws Exception {
            p32.a(cls);
            return (T) this.a.invoke(this.b, cls);
        }
    }

    /* renamed from: p32$b */
    /* compiled from: UnsafeAllocator */
    static class b extends p32 {
        public final /* synthetic */ Method a;
        public final /* synthetic */ int b;

        public b(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.p32
        public <T> T c(Class<T> cls) throws Exception {
            p32.a(cls);
            return (T) this.a.invoke(null, cls, Integer.valueOf(this.b));
        }
    }

    /* renamed from: p32$c */
    /* compiled from: UnsafeAllocator */
    static class c extends p32 {
        public final /* synthetic */ Method a;

        public c(Method method) {
            this.a = method;
        }

        @Override // defpackage.p32
        public <T> T c(Class<T> cls) throws Exception {
            p32.a(cls);
            return (T) this.a.invoke(null, cls, Object.class);
        }
    }

    /* renamed from: p32$d */
    /* compiled from: UnsafeAllocator */
    static class d extends p32 {
        @Override // defpackage.p32
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException(C0201.m82(29522) + cls);
        }
    }

    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException(C0201.m82(28933) + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException(C0201.m82(28932) + cls.getName());
        }
    }

    public static p32 b() {
        String r0 = C0201.m82(28934);
        try {
            Class<?> cls = Class.forName(C0201.m82(28935));
            Field declaredField = cls.getDeclaredField(C0201.m82(28936));
            declaredField.setAccessible(true);
            return new a(cls.getMethod(C0201.m82(28937), Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod(C0201.m82(28938), Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod(r0, Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod(r0, Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception unused3) {
                    return new d();
                }
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
