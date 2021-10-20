package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: ClassesInfoCache */
public class a {
    public static a c = new a();
    private final Map<Class, C0018a> a = new HashMap();
    private final Map<Class, Boolean> b = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    /* compiled from: ClassesInfoCache */
    public static class C0018a {
        public final Map<d.a, List<b>> a = new HashMap();
        public final Map<b, d.a> b;

        public C0018a(Map<b, d.a> map) {
            this.b = map;
            for (Map.Entry<b, d.a> entry : map.entrySet()) {
                d.a value = entry.getValue();
                List<b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, g gVar, d.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(gVar, aVar, obj);
                }
            }
        }

        public void a(g gVar, d.a aVar, Object obj) {
            b(this.a.get(aVar), gVar, aVar, obj);
            b(this.a.get(d.a.ON_ANY), gVar, aVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache */
    public static class b {
        public final int a;
        public final Method b;

        public b(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public void a(g gVar, d.a aVar, Object obj) {
            try {
                int i = this.a;
                if (i == 0) {
                    this.b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.b.invoke(obj, gVar);
                } else if (i == 2) {
                    this.b.invoke(obj, gVar, aVar);
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException(C0201.m82(34096), e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a || !this.b.getName().equals(bVar.b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }

    private C0018a a(Class cls, Method[] methodArr) {
        int i;
        C0018a c2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c2 = c(superclass)) == null)) {
            hashMap.putAll(c2.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, d.a> entry : c(cls2).b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(g.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException(C0201.m82(15000));
                }
                d.a value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.a.class)) {
                        throw new IllegalArgumentException(C0201.m82(15002));
                    } else if (value == d.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException(C0201.m82(15001));
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException(C0201.m82(15003));
                }
            }
        }
        C0018a aVar = new C0018a(hashMap);
        this.a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException(C0201.m82(15004), e);
        }
    }

    private void e(Map<b, d.a> map, b bVar, d.a aVar, Class cls) {
        d.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.b;
            throw new IllegalArgumentException(C0201.m82(15005) + method.getName() + C0201.m82(15006) + cls.getName() + C0201.m82(15007) + aVar2 + C0201.m82(15008) + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    public C0018a c(Class cls) {
        C0018a aVar = this.a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = this.b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method method : b2) {
            if (((n) method.getAnnotation(n.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.b.put(cls, Boolean.FALSE);
        return false;
    }
}
