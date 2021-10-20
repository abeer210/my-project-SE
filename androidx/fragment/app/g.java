package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

/* compiled from: FragmentFactory */
public class g {
    private static final x0<String, Class<?>> a = new x0<>();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> cls = a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        a.put(str, cls2);
        return cls2;
    }

    /* JADX DEBUG: Type inference failed for r4v3. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends androidx.fragment.app.Fragment> */
    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        String r0 = C0201.m82(18430);
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.e(r0 + str + C0201.m82(18432), e);
        } catch (ClassCastException e2) {
            throw new Fragment.e(r0 + str + C0201.m82(18431), e2);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        String r0 = C0201.m82(18433);
        String r1 = C0201.m82(18434);
        try {
            return (Fragment) d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new Fragment.e(r1 + str + r0, e);
        } catch (IllegalAccessException e2) {
            throw new Fragment.e(r1 + str + r0, e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.e(r1 + str + C0201.m82(18436), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.e(r1 + str + C0201.m82(18435), e4);
        }
    }
}
