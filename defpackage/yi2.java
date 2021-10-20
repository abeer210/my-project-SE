package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: yi2  reason: default package */
/* compiled from: CollectionUtils */
public class yi2 {

    /* renamed from: yi2$a */
    /* compiled from: CollectionUtils */
    public interface a<T> {
        void a(T t);
    }

    /* renamed from: yi2$b */
    /* compiled from: CollectionUtils */
    public interface b<T> {
        boolean compare(T t, T t2);
    }

    /* renamed from: yi2$c */
    /* compiled from: CollectionUtils */
    public interface c<T> {
        boolean a(T t);
    }

    /* renamed from: yi2$d */
    /* compiled from: CollectionUtils */
    public interface d<K, V> {
        K a(V v);
    }

    /* renamed from: yi2$e */
    /* compiled from: CollectionUtils */
    public interface e<T, S> {
        S map(T t);
    }

    /* renamed from: yi2$f */
    /* compiled from: CollectionUtils */
    public interface f<S, T> {
        S a(T t, S s);
    }

    private static <T> boolean a(Collection<T> collection, T t, b<T> bVar) {
        for (T t2 : collection) {
            if (bVar.compare(t2, t)) {
                return true;
            }
        }
        return false;
    }

    public static <T> List<T> b(Collection<T> collection, Collection<T> collection2, b<T> bVar) {
        if (collection2 == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        g(collection, new qi2(collection2, bVar, arrayList));
        return arrayList;
    }

    public static <T> boolean c(Collection<T> collection, Collection<T> collection2) {
        if (u(collection) != u(collection2)) {
            return false;
        }
        return ((Boolean) s(v(collection, collection2), Boolean.TRUE, pi2.a)).booleanValue();
    }

    public static <T> List<T> d(Collection<T> collection, c<T> cVar) {
        ArrayList arrayList = new ArrayList();
        for (T t : collection) {
            if (cVar.a(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> T e(Collection<T> collection, c<T> cVar) {
        if (l(collection)) {
            return null;
        }
        for (T t : collection) {
            if (cVar.a(t)) {
                return t;
            }
        }
        return null;
    }

    public static <T> T f(Collection<T> collection, c<T> cVar, fj2<T> fj2) {
        if (l(collection)) {
            return null;
        }
        for (T t : collection) {
            if (cVar.a(t)) {
                fj2.a(t);
                return t;
            }
        }
        return null;
    }

    public static <T> void g(Collection<T> collection, a<T> aVar) {
        if (collection != null) {
            h(new ArrayList(collection), 0, aVar);
        }
    }

    public static <T> void h(List<T> list, int i, a<T> aVar) {
        if (list != null) {
            while (i < list.size()) {
                aVar.a(list.get(i));
                i++;
            }
        }
    }

    public static <T> void i(List<T> list, a<T> aVar) {
        h(list, 0, aVar);
    }

    public static <T> void j(List<T> list, gj2<T, Integer> gj2) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                gj2.a(list.get(i), Integer.valueOf(i));
            }
        }
    }

    public static <K, V> V k(Map<K, V> map, K k, ij2<V> ij2) {
        if (map == null) {
            return ij2.run();
        }
        return map.containsKey(k) ? map.get(k) : ij2.run();
    }

    public static boolean l(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static <K, V> Map<K, V> m(Collection<V> collection, d<K, V> dVar) {
        HashMap hashMap = new HashMap();
        for (V v : collection) {
            hashMap.put(dVar.a(v), v);
        }
        return hashMap;
    }

    public static /* synthetic */ void n(Collection collection, b bVar, ArrayList arrayList, Object obj) {
        if (!a(collection, obj, bVar)) {
            arrayList.add(obj);
        }
    }

    public static /* synthetic */ Boolean o(androidx.core.util.d dVar, Boolean bool) {
        return Boolean.valueOf(bool.booleanValue() && Objects.equals(dVar.a, dVar.b));
    }

    public static <T> T p(List<T> list) {
        if (l(list)) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T, S> List<S> q(Collection<T> collection, e<T, S> eVar) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : collection) {
            arrayList.add(eVar.map(t));
        }
        return arrayList;
    }

    public static <T> Boolean r(Collection<T> collection, boolean z, hj2<T, Boolean> hj2) {
        if (l(collection)) {
            return Boolean.valueOf(z);
        }
        for (T t : collection) {
            z &= hj2.a(t).booleanValue();
            if (!z) {
                return Boolean.FALSE;
            }
        }
        return Boolean.valueOf(z);
    }

    public static <S, T> S s(Collection<T> collection, S s, f<S, T> fVar) {
        for (T t : collection) {
            s = fVar.a(t, s);
        }
        return s;
    }

    public static <T> T t(List<T> list) {
        return list.remove(list.size() - 1);
    }

    public static int u(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static <T> Collection<androidx.core.util.d<T, T>> v(Collection<T> collection, Collection<T> collection2) {
        if (collection == null || collection2 == null) {
            return new ArrayList();
        }
        Iterator<T> it = collection.iterator();
        Iterator<T> it2 = collection2.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new androidx.core.util.d(it.next(), it2.next()));
        }
        return arrayList;
    }
}
