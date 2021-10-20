package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: wv2  reason: default package */
/* compiled from: _Collections.kt */
public class wv2 extends vv2 {
    public static <T> List<T> h(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        ow2.c(collection, C0201.m82(15022));
        ow2.c(iterable, C0201.m82(15023));
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        tv2.g(arrayList2, iterable);
        return arrayList2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.Collection */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> i(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        ow2.c(iterable, C0201.m82(15024));
        ow2.c(comparator, C0201.m82(15025));
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return k(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            String r0 = C0201.m82(15026);
            if (array == null) {
                throw new fv2(r0);
            } else if (array != null) {
                kv2.b(array, comparator);
                return kv2.a(array);
            } else {
                throw new fv2(r0);
            }
        } else {
            List<T> l = l(iterable);
            sv2.f(l, comparator);
            return l;
        }
    }

    public static final <T, C extends Collection<? super T>> C j(Iterable<? extends T> iterable, C c) {
        ow2.c(iterable, C0201.m82(15027));
        ow2.c(c, C0201.m82(15028));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static final <T> List<T> k(Iterable<? extends T> iterable) {
        ow2.c(iterable, C0201.m82(15029));
        if (!(iterable instanceof Collection)) {
            return ov2.d(l(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ov2.b();
        }
        if (size != 1) {
            return m(collection);
        }
        return nv2.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> l(Iterable<? extends T> iterable) {
        ow2.c(iterable, C0201.m82(15030));
        if (iterable instanceof Collection) {
            return m((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        j(iterable, arrayList);
        return arrayList;
    }

    public static final <T> List<T> m(Collection<? extends T> collection) {
        ow2.c(collection, C0201.m82(15031));
        return new ArrayList(collection);
    }
}
