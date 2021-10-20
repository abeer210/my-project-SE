package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.b1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: ViewManagerPropertyUpdater */
public class z0 {
    private static final Map<Class<?>, f<?, ?>> a = new HashMap();
    private static final Map<Class<?>, e<?>> b = new HashMap();

    /* access modifiers changed from: private */
    /* compiled from: ViewManagerPropertyUpdater */
    public static class b<T extends a0> implements e<T> {
        private final Map<String, b1.l> a;

        @Override // com.facebook.react.uimanager.z0.d
        public void a(Map<String, String> map) {
            for (b1.l lVar : this.a.values()) {
                map.put(lVar.a(), lVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.z0.e
        public void c(a0 a0Var, String str, Object obj) {
            b1.l lVar = this.a.get(str);
            if (lVar != null) {
                lVar.d(a0Var, obj);
            }
        }

        private b(Class<? extends a0> cls) {
            this.a = b1.f(cls);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagerPropertyUpdater */
    public static class c<T extends ViewManager, V extends View> implements f<T, V> {
        private final Map<String, b1.l> a;

        @Override // com.facebook.react.uimanager.z0.d
        public void a(Map<String, String> map) {
            for (b1.l lVar : this.a.values()) {
                map.put(lVar.a(), lVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.z0.f
        public void b(T t, V v, String str, Object obj) {
            b1.l lVar = this.a.get(str);
            if (lVar != null) {
                lVar.e(t, v, obj);
            }
        }

        private c(Class<? extends ViewManager> cls) {
            this.a = b1.g(cls);
        }
    }

    /* compiled from: ViewManagerPropertyUpdater */
    public interface d {
        void a(Map<String, String> map);
    }

    /* compiled from: ViewManagerPropertyUpdater */
    public interface e<T extends a0> extends d {
        void c(T t, String str, Object obj);
    }

    /* compiled from: ViewManagerPropertyUpdater */
    public interface f<T extends ViewManager, V extends View> extends d {
        void b(T t, V v, String str, Object obj);
    }

    public static void a() {
        b1.a();
        a.clear();
        b.clear();
    }

    private static <T> T b(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + C0201.m82(35261)).newInstance();
        } catch (ClassNotFoundException unused) {
            f60.A(C0201.m82(35264), C0201.m82(35263) + cls);
            return null;
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new RuntimeException(C0201.m82(35262) + name, e2);
        }
    }

    private static <T extends ViewManager, V extends View> f<T, V> c(Class<? extends ViewManager> cls) {
        c cVar = (f<T, V>) a.get(cls);
        if (cVar == null) {
            cVar = (f) b(cls);
            if (cVar == null) {
                cVar = new c(cls);
            }
            a.put(cls, cVar);
        }
        return cVar;
    }

    private static <T extends a0> e<T> d(Class<? extends a0> cls) {
        b bVar = (e<T>) b.get(cls);
        if (bVar == null) {
            bVar = (e) b(cls);
            if (bVar == null) {
                bVar = new b(cls);
            }
            b.put(cls, bVar);
        }
        return bVar;
    }

    public static Map<String, String> e(Class<? extends ViewManager> cls, Class<? extends a0> cls2) {
        HashMap hashMap = new HashMap();
        c(cls).a(hashMap);
        d(cls2).a(hashMap);
        return hashMap;
    }

    public static <T extends a0> void f(T t, c0 c0Var) {
        e d2 = d(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = c0Var.a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            d2.c(t, next.getKey(), next.getValue());
        }
    }

    public static <T extends ViewManager, V extends View> void g(T t, V v, c0 c0Var) {
        f c2 = c(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = c0Var.a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            c2.b(t, v, next.getKey(), next.getValue());
        }
    }

    public static <T extends y0<V>, V extends View> void h(T t, V v, c0 c0Var) {
        Iterator<Map.Entry<String, Object>> entryIterator = c0Var.a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            t.a(v, next.getKey(), next.getValue());
        }
    }
}
