package defpackage;

import defpackage.wk1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import vigqyno.C0201;

/* renamed from: il1  reason: default package */
public abstract class il1<T extends wk1> {
    private static final Logger a = Logger.getLogger(qk1.class.getName());
    private static String b = C0201.m82(13012);

    public static <T extends wk1> T a(Class<T> cls) {
        String str;
        ClassLoader classLoader = il1.class.getClassLoader();
        if (cls.equals(wk1.class)) {
            str = b;
        } else if (cls.getPackage().equals(il1.class.getPackage())) {
            str = String.format(C0201.m82(13013), cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                return cls.cast(((il1) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).b());
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException(e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(il1.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((il1) it.next()).b()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String r2 = C0201.m82(13014);
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, C0201.m82(13015), C0201.m82(13016), valueOf.length() != 0 ? r2.concat(valueOf) : new String(r2), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) ((wk1) arrayList.get(0));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) ((wk1) cls.getMethod(C0201.m82(13017), Collection.class).invoke(null, arrayList));
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract T b();
}
