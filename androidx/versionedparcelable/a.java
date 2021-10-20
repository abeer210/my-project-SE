package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* compiled from: VersionedParcel */
public abstract class a {
    public final r0<String, Method> a;
    public final r0<String, Method> b;
    public final r0<String, Class> c;

    public a(r0<String, Method> r0Var, r0<String, Method> r0Var2, r0<String, Class> r0Var3) {
        this.a = r0Var;
        this.b = r0Var2;
        this.c = r0Var3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.versionedparcelable.a */
    /* JADX WARN: Multi-variable type inference failed */
    private void N(c cVar) {
        try {
            I(c(cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + C0201.m82(24054), e);
        }
    }

    private Class c(Class<? extends c> cls) throws ClassNotFoundException {
        Class cls2 = this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format(C0201.m82(24055), cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod(C0201.m82(24056), a.class);
        this.a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c2 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c2.getDeclaredMethod(C0201.m82(24057), cls, a.class);
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i) {
        w(i);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i) {
        w(i);
        C(charSequence);
    }

    public abstract void E(int i);

    public void F(int i, int i2) {
        w(i2);
        E(i);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i) {
        w(i);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i) {
        w(i);
        I(str);
    }

    public <T extends c> void K(T t, a aVar) {
        try {
            e(t.getClass()).invoke(null, t, aVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(C0201.m82(24061), e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException(C0201.m82(24060), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(C0201.m82(24059), e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(C0201.m82(24058), e4);
        }
    }

    public void L(c cVar) {
        if (cVar == null) {
            I(null);
            return;
        }
        N(cVar);
        a b2 = b();
        K(cVar, b2);
        b2.a();
    }

    public void M(c cVar, int i) {
        w(i);
        L(cVar);
    }

    public abstract void a();

    public abstract a b();

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z, int i) {
        if (!m(i)) {
            return z;
        }
        return g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i) {
        if (!m(i)) {
            return bArr;
        }
        return i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i) {
        if (!m(i)) {
            return charSequence;
        }
        return k();
    }

    public abstract boolean m(int i);

    public <T extends c> T n(String str, a aVar) {
        try {
            return (T) ((c) d(str).invoke(null, aVar));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(C0201.m82(24065), e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException(C0201.m82(24064), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(C0201.m82(24063), e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(C0201.m82(24062), e4);
        }
    }

    public abstract int o();

    public int p(int i, int i2) {
        if (!m(i2)) {
            return i;
        }
        return o();
    }

    public abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t, int i) {
        return !m(i) ? t : (T) q();
    }

    public abstract String s();

    public String t(String str, int i) {
        if (!m(i)) {
            return str;
        }
        return s();
    }

    public <T extends c> T u() {
        String s = s();
        if (s == null) {
            return null;
        }
        return (T) n(s, b());
    }

    public <T extends c> T v(T t, int i) {
        return !m(i) ? t : (T) u();
    }

    public abstract void w(int i);

    public void x(boolean z, boolean z2) {
    }

    public abstract void y(boolean z);

    public void z(boolean z, int i) {
        w(i);
        y(z);
    }
}
